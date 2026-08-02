package androidx.media3.container;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Ascii;
import com.google.common.base.Joiner;
import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$Base16Encoding;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                Trace.checkArgument(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                Trace.checkArgument(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                Trace.checkArgument(z);
                break;
            case "auxiliary.tracks.map":
                Trace.checkArgument(i2 == 0);
                break;
        }
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MdtaMetadataEntry.class == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList getAuxiliaryTrackTypesFromMap() {
        Trace.checkState("Metadata is not an auxiliary tracks map", this.key.equals("auxiliary.tracks.map"));
        byte[] bArr = this.value;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.value) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.key)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        BaseEncoding$StandardBaseEncoding baseEncoding$StandardBaseEncoding;
        boolean z;
        int i = this.typeIndicator;
        if (i == 0) {
            if (this.key.equals("auxiliary.tracks.map")) {
                ArrayList auxiliaryTrackTypesFromMap = getAuxiliaryTrackTypesFromMap();
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("track types = ");
                String valueOf = String.valueOf(',');
                valueOf.getClass();
                Iterator it = auxiliaryTrackTypesFromMap.iterator();
                try {
                    if (it.hasNext()) {
                        m.append(Joiner.toString(it.next()));
                        while (it.hasNext()) {
                            m.append((CharSequence) valueOf);
                            m.append(Joiner.toString(it.next()));
                        }
                    }
                    sb = m.toString();
                } catch (IOException e) {
                    a$$ExternalSyntheticBUOutline0.m$1(e);
                    return null;
                }
            }
            byte[] bArr = this.value;
            String str = Util.DEVICE_DEBUG_INFO;
            BaseEncoding$Base16Encoding baseEncoding$Base16Encoding = BaseEncoding$StandardBaseEncoding.BASE16;
            baseEncoding$StandardBaseEncoding = baseEncoding$Base16Encoding.lowerCase;
            if (baseEncoding$StandardBaseEncoding == null) {
            }
            sb = baseEncoding$StandardBaseEncoding.encode(bArr);
        } else if (i == 1) {
            byte[] bArr2 = this.value;
            String str2 = Util.DEVICE_DEBUG_INFO;
            sb = new String(bArr2, StandardCharsets.UTF_8);
        } else if (i == 23) {
            sb = String.valueOf(Float.intBitsToFloat(CompositeException.WrappedPrintStream.fromByteArray(this.value)));
        } else if (i == 67) {
            sb = String.valueOf(CompositeException.WrappedPrintStream.fromByteArray(this.value));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new ParsableByteArray(this.value).readUnsignedLongToLong());
            }
            byte[] bArr3 = this.value;
            String str3 = Util.DEVICE_DEBUG_INFO;
            BaseEncoding$Base16Encoding baseEncoding$Base16Encoding2 = BaseEncoding$StandardBaseEncoding.BASE16;
            baseEncoding$StandardBaseEncoding = baseEncoding$Base16Encoding2.lowerCase;
            if (baseEncoding$StandardBaseEncoding == null) {
                BaseEncoding$Alphabet baseEncoding$Alphabet = baseEncoding$Base16Encoding2.alphabet;
                char[] cArr = baseEncoding$Alphabet.chars;
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (Ascii.isUpperCase(cArr[i2])) {
                        int length2 = cArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                z = false;
                                break;
                            }
                            char c = cArr[i3];
                            if (c >= 'a' && c <= 'z') {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        Trace.checkState("Cannot call lowerCase() on a mixed-case alphabet", !z);
                        char[] cArr2 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c2 = cArr[i4];
                            if (Ascii.isUpperCase(c2)) {
                                c2 = (char) (c2 ^ ' ');
                            }
                            cArr2[i4] = c2;
                        }
                        BaseEncoding$Alphabet baseEncoding$Alphabet2 = new BaseEncoding$Alphabet(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), baseEncoding$Alphabet.name, ".lowerCase()"), cArr2);
                        if (baseEncoding$Alphabet.ignoreCase) {
                            byte[] bArr4 = baseEncoding$Alphabet2.decodabet;
                            if (!baseEncoding$Alphabet2.ignoreCase) {
                                byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length);
                                for (int i5 = 65; i5 <= 90; i5++) {
                                    int i6 = i5 | 32;
                                    byte b = bArr4[i5];
                                    byte b2 = bArr4[i6];
                                    if (b == -1) {
                                        copyOf[i5] = b2;
                                    } else {
                                        char c3 = (char) i5;
                                        char c4 = (char) i6;
                                        if (!(b2 == -1)) {
                                            a$$ExternalSyntheticBUOutline0.m$1(DBUtil.lenientFormat("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                            return null;
                                        }
                                        copyOf[i6] = b;
                                    }
                                }
                                baseEncoding$Alphabet = new BaseEncoding$Alphabet(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), baseEncoding$Alphabet2.name, ".ignoreCase()"), baseEncoding$Alphabet2.chars, copyOf, true);
                            }
                        }
                        baseEncoding$Alphabet = baseEncoding$Alphabet2;
                    } else {
                        i2++;
                    }
                }
                baseEncoding$StandardBaseEncoding = baseEncoding$Alphabet == baseEncoding$Base16Encoding2.alphabet ? baseEncoding$Base16Encoding2 : new BaseEncoding$Base16Encoding(baseEncoding$Alphabet);
                baseEncoding$Base16Encoding2.lowerCase = baseEncoding$StandardBaseEncoding;
            }
            sb = baseEncoding$StandardBaseEncoding.encode(bArr3);
        } else {
            sb = String.valueOf(Byte.toUnsignedInt(this.value[0]));
        }
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder("mdta: key="), this.key, ", value=", sb);
    }
}
