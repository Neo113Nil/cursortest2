package defpackage;

import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* loaded from: classes13.dex */
public final class rys {
    public static final rys h = new rys(4201, 4096, 1);
    public static final rys i = new rys(1033, 1024, 1);
    public static final rys j = new rys(67, 64, 1);
    public static final rys k = new rys(19, 16, 1);
    public static final rys l = new rys(HProv.ALG_SID_SHA_224, 256, 0);
    public static final rys m = new rys(IDialogId.DIALOG_PIN_WND_IDD_PASSWORD, 256, 1);
    public final int[] a;
    public final int[] b;
    public final sys c;
    public final sys d;
    public final int e;
    public final int f;
    public final int g;

    public rys(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 *= 2;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new sys(this, new int[]{0});
        this.d = new sys(this, new int[]{1});
    }

    public final sys a(int i2, int i3) {
        if (i2 < 0) {
            w511.q();
            return null;
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new sys(this, iArr);
    }

    public final int b(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i2]) - 1];
    }

    public final int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(HexString.CHAR_COMMA);
        return oyr.s(sb, this.e, ')');
    }
}
