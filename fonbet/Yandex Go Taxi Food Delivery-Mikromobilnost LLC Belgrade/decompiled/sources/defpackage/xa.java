package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ru.domesticroots.bouncycastle.asn1.ASN1ParsingException;

/* loaded from: classes4.dex */
public abstract class xa {
    public static boolean a(ic51 ic51Var, ic51 ic51Var2) {
        u4i0[] u4i0VarArr = (u4i0[]) ic51Var.w.clone();
        u4i0[] u4i0VarArr2 = (u4i0[]) ic51Var2.w.clone();
        if (u4i0VarArr.length == u4i0VarArr2.length) {
            boolean z = (u4i0VarArr[0].h() == null || u4i0VarArr2[0].h() == null) ? false : !u4i0VarArr[0].h().a.l(u4i0VarArr2[0].h().a);
            for (int i = 0; i != u4i0VarArr.length; i++) {
                u4i0 u4i0Var = u4i0VarArr[i];
                if (z) {
                    for (int length = u4i0VarArr2.length - 1; length >= 0; length--) {
                        u4i0 u4i0Var2 = u4i0VarArr2[length];
                        if (u4i0Var2 != null && c(u4i0Var, u4i0Var2)) {
                            u4i0VarArr2[length] = null;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 != u4i0VarArr2.length; i2++) {
                        u4i0 u4i0Var3 = u4i0VarArr2[i2];
                        if (u4i0Var3 != null && c(u4i0Var, u4i0Var3)) {
                            u4i0VarArr2[i2] = null;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean c(u4i0 u4i0Var, u4i0 u4i0Var2) {
        int i;
        if (u4i0Var.a.a.length == u4i0Var2.a.a.length) {
            yc3[] i2 = u4i0Var.i();
            yc3[] i3 = u4i0Var2.i();
            if (i2.length == i3.length) {
                for (0; i != i2.length; i + 1) {
                    yc3 yc3Var = i2[i];
                    yc3 yc3Var2 = i3[i];
                    i = (yc3Var == yc3Var2 || (yc3Var != null && yc3Var2 != null && yc3Var.a.l(yc3Var2.a) && w2v.b(yc3Var.b).equals(w2v.b(yc3Var2.b)))) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    public z1 b(t2 t2Var, String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ruu0.d(charArray, byteArrayOutputStream);
            return new qqf(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            ny61.r("cannot encode string to byte array!");
            return null;
        }
    }

    public final z1 d(t2 t2Var, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return b(t2Var, str);
        }
        try {
            int length = (str.length() - 1) / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                int i2 = i * 2;
                char charAt = str.charAt(i2 + 1);
                bArr[i] = (byte) (w2v.c(str.charAt(i2 + 2)) | (w2v.c(charAt) << 4));
            }
            return a3.m(bArr);
        } catch (IOException unused) {
            throw new ASN1ParsingException("can't recode value for oid " + t2Var.a);
        }
    }

    public abstract String e(ic51 ic51Var);
}
