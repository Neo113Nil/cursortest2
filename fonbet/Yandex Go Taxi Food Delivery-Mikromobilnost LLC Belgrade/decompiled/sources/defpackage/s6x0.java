package defpackage;

import com.yandex.go.payments.cards.nfc.enums.TagTypeEnum;
import com.yandex.go.payments.cards.nfc.enums.TagValueTypeEnum;
import com.yandex.go.payments.cards.nfc.iso7816emv.ITag$Class;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes13.dex */
public final class s6x0 {
    public final byte[] a;
    public final String b;
    public final TagValueTypeEnum c;
    public final ITag$Class d;
    public final TagTypeEnum e;

    public s6x0(byte[] bArr, TagValueTypeEnum tagValueTypeEnum, String str) {
        if (bArr.length == 0) {
            ny61.g("Param id cannot be empty");
            throw null;
        }
        this.a = bArr;
        this.b = str;
        this.c = tagValueTypeEnum;
        this.e = ddb1.c(bArr[0], 5) ? TagTypeEnum.CONSTRUCTED : TagTypeEnum.PRIMITIVE;
        byte b = (byte) ((bArr[0] >>> 6) & 3);
        this.d = b == 1 ? ITag$Class.APPLICATION : b == 2 ? ITag$Class.CONTEXT_SPECIFIC : b == 3 ? ITag$Class.PRIVATE : ITag$Class.UNIVERSAL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s6x0)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((s6x0) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 177;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = this.a;
        if (bArr == null) {
            sb.append("");
        } else {
            for (byte b : bArr) {
                sb.append(String.format("%02x ", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1)));
            }
        }
        StringBuilder v = b64.v("Tag[", evu0.k0(sb.toString().toUpperCase(Locale.getDefault())).toString(), "] Name=", this.b, ", TagType=");
        v.append(this.e);
        v.append(", ValueType=");
        v.append(this.c);
        v.append(", Class=");
        v.append(this.d);
        return v.toString();
    }

    public s6x0(String str, TagValueTypeEnum tagValueTypeEnum, String str2) {
        this(ddb1.b(str), tagValueTypeEnum, str2);
    }
}
