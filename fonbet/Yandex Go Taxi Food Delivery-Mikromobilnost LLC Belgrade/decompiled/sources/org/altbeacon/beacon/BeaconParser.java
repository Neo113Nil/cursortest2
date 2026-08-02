package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.b64;
import defpackage.c06;
import defpackage.g8e;
import defpackage.jra0;
import defpackage.oyr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes9.dex */
public class BeaconParser implements Serializable {
    public static final Pattern a = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");
    public static final Pattern b = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");
    public static final Pattern c = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f\\-]+)");
    public static final Pattern w = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");
    public static final Pattern x = Pattern.compile("p\\:(\\d+)?\\-(\\d+)?\\:?([\\-\\d]+)?");
    public static final Pattern y = Pattern.compile(RemoteBioParameters.X);
    public static final char[] z = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected List<BeaconParser> extraParsers;
    protected Boolean mAllowPduOverflow;
    protected String mBeaconLayout;
    protected Integer mDBmCorrection;
    protected final List<Integer> mDataEndOffsets;
    protected final List<Boolean> mDataLittleEndianFlags;
    protected final List<Integer> mDataStartOffsets;
    protected Boolean mExtraFrame;
    protected int[] mHardwareAssistManufacturers;
    protected String mIdentifier;
    protected final List<Integer> mIdentifierEndOffsets;
    protected final List<Boolean> mIdentifierLittleEndianFlags;
    protected final List<Integer> mIdentifierStartOffsets;
    protected final List<Boolean> mIdentifierVariableLengthFlags;
    protected Integer mLayoutSize;
    private Long mMatchingBeaconTypeCode;
    protected Integer mMatchingBeaconTypeCodeEndOffset;
    protected Integer mMatchingBeaconTypeCodeStartOffset;
    protected Integer mPowerEndOffset;
    protected Integer mPowerStartOffset;
    protected Long mServiceUuid;
    protected byte[] mServiceUuid128Bit;
    protected Integer mServiceUuidEndOffset;
    protected Integer mServiceUuidStartOffset;

    /* loaded from: classes4.dex */
    public static class BeaconLayoutException extends RuntimeException {
        public BeaconLayoutException(String str) {
            super(str);
        }
    }

    public BeaconParser(String str) {
        this.mIdentifierStartOffsets = new ArrayList();
        this.mIdentifierEndOffsets = new ArrayList();
        this.mIdentifierLittleEndianFlags = new ArrayList();
        this.mDataStartOffsets = new ArrayList();
        this.mDataEndOffsets = new ArrayList();
        this.mDataLittleEndianFlags = new ArrayList();
        this.mIdentifierVariableLengthFlags = new ArrayList();
        this.mServiceUuid128Bit = new byte[0];
        this.mAllowPduOverflow = Boolean.TRUE;
        this.mHardwareAssistManufacturers = new int[]{76};
        this.extraParsers = new ArrayList();
        this.mIdentifier = str;
    }

    public static String a(byte[] bArr, int i, int i2, boolean z2) {
        int i3 = i2 - i;
        int i4 = i3 + 1;
        byte[] bArr2 = new byte[i4];
        if (z2) {
            for (int i5 = 0; i5 <= i3; i5++) {
                bArr2[i5] = bArr[((i + i4) - 1) - i5];
            }
        } else {
            for (int i6 = 0; i6 <= i3; i6++) {
                bArr2[i6] = bArr[i + i6];
            }
        }
        if (i4 < 5) {
            long j = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                j += (bArr2[(i4 - i7) - 1] & 255) * ((long) Math.pow(256.0d, i7 * 1.0d));
            }
            return Long.toString(j);
        }
        char[] cArr = new char[bArr2.length * 2];
        for (int i8 = 0; i8 < bArr2.length; i8++) {
            byte b2 = bArr2[i8];
            int i9 = i8 * 2;
            char[] cArr2 = z;
            cArr[i9] = cArr2[(b2 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b2 & PKIBody._CCP];
        }
        String str = new String(cArr);
        if (i4 != 16) {
            return HexString.STR_0x.concat(str);
        }
        StringBuilder sb = new StringBuilder();
        oyr.C(0, 8, str, "-", sb);
        oyr.C(8, 12, str, "-", sb);
        oyr.C(12, 16, str, "-", sb);
        oyr.C(16, 20, str, "-", sb);
        sb.append(str.substring(20, 32));
        return sb.toString();
    }

    public static boolean b(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length - i >= length) {
            for (int i2 = 0; i2 < length; i2++) {
                if (bArr[i + i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static byte[] n(boolean z2, int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((i - (z2 ? i2 : (i - i2) - 1)) - 1) * 8;
            bArr[i2] = (byte) ((j & (255 << i3)) >> i3);
        }
        return bArr;
    }

    public Beacon c(int i, long j, BluetoothDevice bluetoothDevice, byte[] bArr) {
        return f(bArr, i, bluetoothDevice, j, new Beacon());
    }

    public final boolean equals(Object obj) {
        String str;
        try {
            BeaconParser beaconParser = (BeaconParser) obj;
            String str2 = beaconParser.mBeaconLayout;
            if (str2 == null || !str2.equals(this.mBeaconLayout) || (str = beaconParser.mIdentifier) == null) {
                return false;
            }
            return str.equals(this.mIdentifier);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0156, code lost:
    
        if (r6.c() != 33) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3, types: [org.altbeacon.beacon.Beacon] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Beacon f(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j, Beacon beacon) {
        byte b2;
        int i2;
        boolean z2;
        ?? r18;
        boolean z3;
        char c2;
        char c3;
        boolean z4;
        int intValue;
        boolean z5;
        int i3;
        String str;
        String str2;
        byte[] bArr2 = bArr;
        c06 c06Var = new c06(bArr2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = c06Var.o().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
            if (!hasNext) {
                break;
            }
            jra0 jra0Var = (jra0) it.next();
            if ((jra0Var.c() == 22 && this.mServiceUuid != null) || ((jra0Var.c() == 33 && this.mServiceUuid128Bit.length != 0) || ((jra0Var.c() == 7 && this.mServiceUuid128Bit.length != 0) || jra0Var.c() == -1))) {
                arrayList.add(jra0Var);
            }
        }
        ?? r14 = 1;
        int i4 = 0;
        int i5 = 0;
        if (arrayList.size() != 0) {
            Iterator it2 = arrayList.iterator();
            i2 = 0;
            int i6 = 0;
            boolean z6 = false;
            loop1: while (true) {
                if (!it2.hasNext()) {
                    z2 = r14;
                    r18 = 0;
                    i5 = i6;
                    z3 = false;
                    break;
                }
                jra0 jra0Var2 = (jra0) it2.next();
                r18 = 0;
                r18 = 0;
                byte[] bArr3 = new byte[i4];
                if (this.mMatchingBeaconTypeCodeEndOffset != null && this.mMatchingBeaconTypeCodeStartOffset.intValue() >= 0) {
                    bArr3 = n(r14, (this.mMatchingBeaconTypeCodeEndOffset.intValue() - this.mMatchingBeaconTypeCodeStartOffset.intValue()) + r14, i().longValue());
                }
                byte[] bArr4 = this.mServiceUuid128Bit;
                Long l = this.mServiceUuid;
                if (l != null) {
                    z2 = r14;
                    bArr4 = n(i4, (this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + 1, l.longValue());
                } else {
                    z2 = r14;
                }
                int b3 = jra0Var2.b();
                if (bArr4.length != 0) {
                    boolean z7 = (jra0Var2.c() == b2 && bArr4.length == 16) ? z2 : i4;
                    c2 = 7;
                    if (jra0Var2.c() == 7 && bArr4.length == 16) {
                        z7 = z2;
                    }
                    if (jra0Var2.c() == 22 && bArr4.length == 2) {
                        z7 = z2;
                    }
                    if (z7 && b(bArr2, this.mServiceUuidStartOffset.intValue() + b3, bArr4)) {
                        if (this.mMatchingBeaconTypeCodeEndOffset == null) {
                            c3 = 22;
                            if (jra0Var2.c() == 22) {
                            }
                            z4 = z2;
                            if (!z4) {
                            }
                            if (z4) {
                            }
                            i2 = b3;
                            r14 = z2;
                            b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
                            i4 = 0;
                        } else if (b(bArr2, this.mMatchingBeaconTypeCodeStartOffset.intValue() + b3, bArr3)) {
                            z4 = z2;
                            c3 = 22;
                            if (!z4) {
                            }
                            if (z4) {
                            }
                            i2 = b3;
                            r14 = z2;
                            b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
                            i4 = 0;
                        }
                    }
                    c3 = 22;
                    z4 = false;
                    if (!z4) {
                    }
                    if (z4) {
                    }
                    i2 = b3;
                    r14 = z2;
                    b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
                    i4 = 0;
                } else if (this.mMatchingBeaconTypeCodeEndOffset == null || !b(bArr2, this.mMatchingBeaconTypeCodeStartOffset.intValue() + b3, bArr3)) {
                    c2 = 7;
                    c3 = 22;
                    z4 = false;
                    if (!z4 && this.mServiceUuid == null) {
                        int length = this.mServiceUuid128Bit.length;
                    }
                    if (z4) {
                        if (bArr2.length <= this.mLayoutSize.intValue() + b3 && this.mAllowPduOverflow.booleanValue() && bArr2.length < (intValue = this.mLayoutSize.intValue() + b3)) {
                            bArr2 = Arrays.copyOf(bArr2, intValue);
                        }
                        for (int i7 = 0; i7 < this.mIdentifierEndOffsets.size(); i7++) {
                            int intValue2 = this.mIdentifierEndOffsets.get(i7).intValue() + b3;
                            if (intValue2 > jra0Var2.a() && this.mIdentifierVariableLengthFlags.get(i7).booleanValue()) {
                                int intValue3 = this.mIdentifierStartOffsets.get(i7).intValue() + b3;
                                int a2 = jra0Var2.a() + 1;
                                if (a2 <= intValue3) {
                                    break loop1;
                                }
                                arrayList2.add(Identifier.a(bArr2, intValue3, a2, this.mIdentifierLittleEndianFlags.get(i7).booleanValue()));
                            } else if (intValue2 <= jra0Var2.a() || this.mAllowPduOverflow.booleanValue()) {
                                arrayList2.add(Identifier.a(bArr2, this.mIdentifierStartOffsets.get(i7).intValue() + b3, intValue2 + 1, this.mIdentifierLittleEndianFlags.get(i7).booleanValue()));
                            } else {
                                z6 = z2;
                            }
                        }
                        for (int i8 = 0; i8 < this.mDataEndOffsets.size(); i8++) {
                            int intValue4 = this.mDataEndOffsets.get(i8).intValue() + b3;
                            if (intValue4 <= jra0Var2.a() || this.mAllowPduOverflow.booleanValue()) {
                                arrayList3.add(Long.decode(a(bArr2, this.mDataStartOffsets.get(i8).intValue() + b3, intValue4, this.mDataLittleEndianFlags.get(i8).booleanValue())));
                            } else {
                                arrayList3.add(new Long(0L));
                            }
                        }
                        if (this.mPowerStartOffset != null) {
                            try {
                                if (this.mPowerEndOffset.intValue() + b3 <= jra0Var2.a() || this.mAllowPduOverflow.booleanValue()) {
                                    int parseInt = Integer.parseInt(a(bArr2, this.mPowerStartOffset.intValue() + b3, this.mPowerEndOffset.intValue() + b3, false)) + this.mDBmCorrection.intValue();
                                    if (parseInt > 127) {
                                        parseInt -= 256;
                                    }
                                    i6 = parseInt;
                                } else {
                                    z6 = z2;
                                }
                            } catch (NullPointerException | NumberFormatException unused) {
                            }
                        } else {
                            Integer num = this.mDBmCorrection;
                            if (num != null) {
                                i6 = num.intValue();
                            }
                        }
                        if (!z6) {
                            i2 = b3;
                            i5 = i6;
                            z3 = z2;
                            break;
                        }
                    }
                    i2 = b3;
                    r14 = z2;
                    b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
                    i4 = 0;
                } else {
                    z4 = z2;
                    c2 = 7;
                    c3 = 22;
                    if (!z4) {
                        int length2 = this.mServiceUuid128Bit.length;
                    }
                    if (z4) {
                    }
                    i2 = b3;
                    r14 = z2;
                    b2 = BlobHeaderStructure.KEXP15_BLOB_VERSION;
                    i4 = 0;
                }
            }
            return r18;
        }
        z2 = true;
        i2 = 0;
        z3 = false;
        r18 = 0;
        if (z3) {
            if (this.mMatchingBeaconTypeCodeEndOffset != null) {
                z5 = false;
                i3 = Integer.parseInt(a(bArr2, this.mMatchingBeaconTypeCodeStartOffset.intValue() + i2, this.mMatchingBeaconTypeCodeEndOffset.intValue() + i2, false));
            } else {
                z5 = false;
                i3 = -1;
            }
            boolean z8 = z2;
            int parseInt2 = Integer.parseInt(a(bArr2, i2, i2 + 1, z8));
            if (bluetoothDevice != null) {
                str = bluetoothDevice.getAddress();
                try {
                    str2 = bluetoothDevice.getName();
                } catch (SecurityException unused2) {
                    str2 = r18;
                }
            } else {
                str = r18;
                str2 = str;
            }
            beacon.mIdentifiers = arrayList2;
            beacon.mDataFields = arrayList3;
            beacon.mRssi = i;
            beacon.mBeaconTypeCode = i3;
            Long l2 = this.mServiceUuid;
            if (l2 != null) {
                beacon.mServiceUuid = (int) l2.longValue();
            } else {
                beacon.mServiceUuid = -1;
            }
            beacon.mBluetoothAddress = str;
            beacon.mBluetoothName = str2;
            beacon.mManufacturer = parseInt2;
            beacon.mParserIdentifier = this.mIdentifier;
            beacon.mMultiFrameBeacon = (this.extraParsers.size() > 0 || this.mExtraFrame.booleanValue()) ? z8 : z5;
            beacon.mFirstCycleDetectionTimestamp = j;
            beacon.mLastCycleDetectionTimestamp = j;
            beacon.mLastPacketRawBytes = bArr2;
            beacon.mTxPower = i5;
            return beacon;
        }
        return r18;
    }

    public final ArrayList g() {
        return new ArrayList(this.extraParsers);
    }

    public final int[] h() {
        return this.mHardwareAssistManufacturers;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.mMatchingBeaconTypeCode, this.mIdentifierStartOffsets, this.mIdentifierEndOffsets, this.mIdentifierLittleEndianFlags, this.mDataStartOffsets, this.mDataEndOffsets, this.mDataLittleEndianFlags, this.mIdentifierVariableLengthFlags, this.mMatchingBeaconTypeCodeStartOffset, this.mMatchingBeaconTypeCodeEndOffset, this.mServiceUuidStartOffset, this.mServiceUuidEndOffset, this.mServiceUuid, this.mServiceUuid128Bit, this.mExtraFrame, this.mPowerStartOffset, this.mPowerEndOffset, this.mDBmCorrection, this.mLayoutSize, this.mAllowPduOverflow, this.mIdentifier, this.mHardwareAssistManufacturers, this.extraParsers});
    }

    public final Long i() {
        Long l = this.mMatchingBeaconTypeCode;
        if (l == null) {
            return -1L;
        }
        return l;
    }

    public final int j() {
        Integer num = this.mMatchingBeaconTypeCodeEndOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int k() {
        Integer num = this.mMatchingBeaconTypeCodeStartOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final Long l() {
        return this.mServiceUuid;
    }

    public final byte[] m() {
        return this.mServiceUuid128Bit;
    }

    public final void p(String str) {
        int i;
        int i2;
        int i3;
        this.mBeaconLayout = str;
        String[] split = str.split(",");
        this.mExtraFrame = Boolean.FALSE;
        int length = split.length;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                List<Integer> list = this.mIdentifierEndOffsets;
                if (list != null) {
                    Iterator<Integer> it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        if (intValue > i) {
                            i = intValue;
                        }
                    }
                } else {
                    i = 0;
                }
                List<Integer> list2 = this.mDataEndOffsets;
                if (list2 != null) {
                    Iterator<Integer> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        int intValue2 = it2.next().intValue();
                        if (intValue2 > i) {
                            i = intValue2;
                        }
                    }
                }
                Integer num = this.mPowerEndOffset;
                if (num != null && num.intValue() > i) {
                    i = this.mPowerEndOffset.intValue();
                }
                Integer num2 = this.mServiceUuidEndOffset;
                if (num2 != null && num2.intValue() > i) {
                    i = this.mServiceUuidEndOffset.intValue();
                }
                this.mLayoutSize = Integer.valueOf(i + 1);
                return;
            }
            String str2 = split[i4];
            Matcher matcher = a.matcher(str2);
            int i6 = 0;
            while (true) {
                i2 = 3;
                if (!matcher.find()) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    this.mIdentifierLittleEndianFlags.add(Boolean.valueOf(matcher.group(3).contains("l")));
                    this.mIdentifierVariableLengthFlags.add(Boolean.valueOf(matcher.group(3).contains("v")));
                    this.mIdentifierStartOffsets.add(Integer.valueOf(parseInt));
                    this.mIdentifierEndOffsets.add(Integer.valueOf(parseInt2));
                    i6 = 1;
                } catch (NumberFormatException unused) {
                    throw new BeaconLayoutException(g8e.o("Cannot parse integer byte offset in term: ", str2));
                }
            }
            Matcher matcher2 = w.matcher(str2);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(1));
                    int parseInt4 = Integer.parseInt(matcher2.group(2));
                    this.mDataLittleEndianFlags.add(Boolean.valueOf(matcher2.group(3).contains("l")));
                    this.mDataStartOffsets.add(Integer.valueOf(parseInt3));
                    this.mDataEndOffsets.add(Integer.valueOf(parseInt4));
                    i6 = 1;
                } catch (NumberFormatException unused2) {
                    throw new BeaconLayoutException(g8e.o("Cannot parse integer byte offset in term: ", str2));
                }
            }
            Matcher matcher3 = x.matcher(str2);
            while (matcher3.find()) {
                try {
                    if (matcher3.group(1) != null && matcher3.group(2) != null) {
                        int parseInt5 = Integer.parseInt(matcher3.group(1));
                        int parseInt6 = Integer.parseInt(matcher3.group(2));
                        this.mPowerStartOffset = Integer.valueOf(parseInt5);
                        this.mPowerEndOffset = Integer.valueOf(parseInt6);
                    }
                    this.mDBmCorrection = Integer.valueOf(matcher3.group(3) != null ? Integer.parseInt(matcher3.group(3)) : 0);
                    i6 = 1;
                } catch (NumberFormatException unused3) {
                    throw new BeaconLayoutException(b64.l("Cannot parse integer power byte offset (", "none", ") in term: ", str2));
                }
            }
            Matcher matcher4 = b.matcher(str2);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(1));
                    int parseInt8 = Integer.parseInt(matcher4.group(2));
                    this.mMatchingBeaconTypeCodeStartOffset = Integer.valueOf(parseInt7);
                    this.mMatchingBeaconTypeCodeEndOffset = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.mMatchingBeaconTypeCode = Long.decode(HexString.STR_0x + group);
                        i6 = 1;
                    } catch (NumberFormatException unused4) {
                        throw new BeaconLayoutException(b64.l("Cannot parse beacon type code: ", group, " in term: ", str2));
                    }
                } catch (NumberFormatException unused5) {
                    throw new BeaconLayoutException(g8e.o("Cannot parse integer byte offset in term: ", str2));
                }
            }
            Matcher matcher5 = c.matcher(str2);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(i5));
                    int parseInt10 = Integer.parseInt(matcher5.group(2));
                    this.mServiceUuidStartOffset = Integer.valueOf(parseInt9);
                    this.mServiceUuidEndOffset = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(i2);
                    if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + i5 == 2) {
                        try {
                            this.mServiceUuid = Long.decode(HexString.STR_0x + group2);
                            i3 = i5;
                        } catch (NumberFormatException unused6) {
                            throw new BeaconLayoutException(b64.l("Cannot parse serviceUuid: ", group2, " in term: ", str2));
                        }
                    } else {
                        if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + i5 != 16) {
                            throw new BeaconLayoutException(b64.l("Cannot parse serviceUuid -- it must be 2 bytes or 16 bytes long: ", group2, " in term: ", str2));
                        }
                        String replace = group2.replace("-", "");
                        i3 = i5;
                        if (replace.length() != 32) {
                            throw new BeaconLayoutException(b64.l("128-bit ServiceUuid must be 16 bytes long: ", group2, " in term: ", str2));
                        }
                        this.mServiceUuid128Bit = new byte[16];
                        for (int i7 = 0; i7 < 16; i7++) {
                            int i8 = i7 * 2;
                            String substring = replace.substring(i8, i8 + 2);
                            try {
                                this.mServiceUuid128Bit[15 - i7] = (byte) Integer.parseInt(substring, 16);
                            } catch (NumberFormatException unused7) {
                                throw new BeaconLayoutException(b64.l("Cannot parse serviceUuid byte ", substring, " in term: ", str2));
                            }
                        }
                    }
                    i5 = i3;
                    i6 = i5;
                    i2 = 3;
                } catch (NumberFormatException unused8) {
                    throw new BeaconLayoutException(g8e.o("Cannot parse integer byte offset in term: ", str2));
                }
            }
            int i9 = i5;
            Matcher matcher6 = y.matcher(str2);
            while (matcher6.find()) {
                this.mExtraFrame = Boolean.TRUE;
                i6 = i9;
            }
            if (i6 == 0) {
                throw new BeaconLayoutException(g8e.o("Cannot parse beacon layout term: ", str2));
            }
            i4++;
        }
    }

    public final String toString() {
        if (this.mIdentifier == null) {
            return this.mBeaconLayout;
        }
        return this.mIdentifier + "~" + this.mBeaconLayout;
    }

    public BeaconParser() {
        this.mIdentifierStartOffsets = new ArrayList();
        this.mIdentifierEndOffsets = new ArrayList();
        this.mIdentifierLittleEndianFlags = new ArrayList();
        this.mDataStartOffsets = new ArrayList();
        this.mDataEndOffsets = new ArrayList();
        this.mDataLittleEndianFlags = new ArrayList();
        this.mIdentifierVariableLengthFlags = new ArrayList();
        this.mServiceUuid128Bit = new byte[0];
        this.mAllowPduOverflow = Boolean.TRUE;
        this.mHardwareAssistManufacturers = new int[]{76};
        this.extraParsers = new ArrayList();
    }
}
