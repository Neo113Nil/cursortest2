package org.altbeacon.beacon;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.w511;
import defpackage.yci0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes9.dex */
public class Identifier implements Comparable<Identifier>, Serializable {
    public static final Pattern a = Pattern.compile("^0x[0-9A-Fa-f]*$");
    public static final Pattern b = Pattern.compile("^[0-9A-Fa-f]*$");
    public static final Pattern c = Pattern.compile("^0|[1-9][0-9]*$");
    public static final Pattern w = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");
    public static final char[] x = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] mValue;

    public Identifier(byte[] bArr) {
        if (bArr != null) {
            this.mValue = bArr;
        } else {
            ny61.t("Identifiers cannot be constructed from null pointers but \"value\" is null.");
            throw null;
        }
    }

    public static Identifier a(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            ny61.t("Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
            return null;
        }
        if (i < 0 || i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
        }
        if (i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        }
        if (i > i2) {
            ny61.g("start > end");
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (z) {
            for (int i3 = 0; i3 < copyOfRange.length / 2; i3++) {
                int length = (copyOfRange.length - i3) - 1;
                byte b2 = copyOfRange[i3];
                copyOfRange[i3] = copyOfRange[length];
                copyOfRange[length] = b2;
            }
        }
        return new Identifier(copyOfRange);
    }

    public static Identifier b(String str) {
        if (str == null) {
            return null;
        }
        if (a.matcher(str).matches()) {
            return c(str.substring(2));
        }
        if (w.matcher(str).matches()) {
            return c(str.replace("-", ""));
        }
        if (!c.matcher(str).matches()) {
            if (b.matcher(str).matches()) {
                return c(str);
            }
            ny61.g("Unable to parse Identifier.");
            return null;
        }
        try {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue >= 0 && intValue <= 65535) {
                return new Identifier(new byte[]{(byte) (intValue >> 8), (byte) intValue});
            }
            ny61.g("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
            return null;
        } catch (Throwable th) {
            yci0.p("Unable to parse Identifier in decimal format.", th);
            return null;
        }
    }

    public static Identifier c(String str) {
        StringBuilder t = qv10.t(str.length() % 2 == 0 ? "" : "0");
        t.append(str.toUpperCase());
        String sb = t.toString();
        int length = sb.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Integer.parseInt(sb.substring(i2, i2 + 2), 16) & 255);
        }
        return new Identifier(bArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Identifier identifier) {
        Identifier identifier2 = identifier;
        byte[] bArr = this.mValue;
        int length = bArr.length;
        byte[] bArr2 = identifier2.mValue;
        if (length != bArr2.length) {
            return bArr.length < bArr2.length ? -1 : 1;
        }
        int i = 0;
        while (true) {
            byte[] bArr3 = this.mValue;
            if (i >= bArr3.length) {
                return 0;
            }
            byte b2 = bArr3[i];
            byte b3 = identifier2.mValue[i];
            if (b2 != b3) {
                return b2 < b3 ? -1 : 1;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Identifier) {
            return Arrays.equals(this.mValue, ((Identifier) obj).mValue);
        }
        return false;
    }

    public final byte[] f() {
        return (byte[]) this.mValue.clone();
    }

    public final int g() {
        if (this.mValue.length > 2) {
            w511.x("Only supported for Identifiers with max byte length of 2");
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.mValue;
            if (i >= bArr.length) {
                return i2;
            }
            i2 |= (bArr[i] & 255) << (((bArr.length - i) - 1) * 8);
            i++;
        }
    }

    public final UUID h() {
        byte[] bArr = this.mValue;
        if (bArr.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        w511.x("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mValue);
    }

    public final String toString() {
        byte[] bArr = this.mValue;
        if (bArr.length == 2) {
            return Integer.toString(g());
        }
        if (bArr.length == 16) {
            return h().toString();
        }
        int length = bArr.length;
        char[] cArr = new char[(length * 2) + 2];
        cArr[0] = MoneyInputEditView.DEFAULT_VALUE;
        cArr[1] = 'x';
        int i = 2;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            byte b2 = this.mValue[i2];
            char[] cArr2 = x;
            cArr[i] = cArr2[(b2 & 240) >>> 4];
            i += 2;
            cArr[i3] = cArr2[b2 & PKIBody._CCP];
        }
        return new String(cArr);
    }
}
