package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class yri0 {
    public static final mi3 a = new mi3("3RG+HIeU586EDZPuhy2N/3TNfUTcqDmt8d9FnPsIUyEKAHqMWG3f6izV3+JaKz6r", "iR7kStfGsZmDC5Gxh32JrHWddbWDGndwaM36N1Oq5AxUYW/VrUZfgHMlTFzjDENf");
    public static final mi3 b = new mi3("3BvkGoLGv8jSC8bth3+JrSRloyBpQU17tp/+IZm5Fw4INwzn0cC5WS6i95aEhSha", "2x3iGtec4JyGXJS7hyvar3XEa3lpfwtq9WIIzKX5tWovl06+zun9qMVLxppp/7le");
    public static au2 c;

    public static cg21 a(String str) {
        String str2 = oq90.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new cg21(sb.toString(), str2, "file", null, str);
    }

    public static void b(kpg kpgVar) {
        if (kpgVar != null) {
            try {
                kpgVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String c(cg21 cg21Var) {
        List e = e(cg21Var);
        String str = cg21Var.b;
        if (e.isEmpty()) {
            return null;
        }
        if (!cvu0.x(cg21Var.e, str, false)) {
            str = "";
        }
        return a.X(e, cg21Var.b, str, null, null, 60);
    }

    public static final au2 d() {
        au2 au2Var = c;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("POIPin", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(22.0f, 10.0f);
        e.b(10.0f, 10.0f, false, true, -6.56f, 9.4f);
        e.g(-0.02f);
        e.b(5.0f, 5.0f, false, false, -2.46f, 2.62f);
        e.h(12.0f, 24.0f);
        e.i(-0.96f, -1.98f);
        e.e(-0.14f, -0.28f, -0.2f, -0.43f, -0.28f, -0.56f);
        e.b(5.0f, 5.0f, false, false, -2.18f, -2.06f);
        e.g(-0.02f);
        e.a(10.0f, 10.0f, true, true, 22.0f, 10.0f);
        e.k(-10.0f, 4.0f);
        e.b(4.0f, 4.0f, true, false, 0.0f, -8.0f);
        e.b(4.0f, 4.0f, false, false, 0.0f, 8.0f);
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        c = a2;
        return a2;
    }

    public static final List e(cg21 cg21Var) {
        String str = cg21Var.e;
        if (str == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int G = evu0.G(str, '/', i2, 4);
            if (G == -1) {
                G = str.length();
            }
            String substring = str.substring(i2, G);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = G;
        }
        return arrayList;
    }

    public static final String f(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return cvu0.r(0, i2, 5, bArr);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String substring = str.substring(i + 1, i3);
                    rza.a(16);
                    bArr[i2] = (byte) Integer.parseInt(substring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static cg21 g(String str) {
        String str2;
        String str3;
        String str4 = oq90.b;
        String v = !jl40.l(str4, "/") ? cvu0.v(str, str4, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < v.length()) {
            char charAt = v.charAt(i);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (v.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int min = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, v.length());
        int min2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, min);
        if (i5 != -1) {
            str3 = v.substring(0, i6);
            str2 = v.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, min2));
        } else {
            str2 = null;
            str3 = null;
        }
        String substring = i3 != -1 ? v.substring(i3, min2) : null;
        String substring2 = i4 != -1 ? v.substring(i4, min) : null;
        String substring3 = i2 != -1 ? v.substring(i2, v.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(str3 != null ? str3.length() : 0, Math.max(str2 != null ? str2.length() : 0, Math.max(substring != null ? substring.length() : 0, Math.max(substring2 != null ? substring2.length() : 0, substring3 != null ? substring3.length() : 0)))) - 2)];
        String str5 = substring2;
        String f = str3 != null ? f(str3, bArr) : null;
        String f2 = str2 != null ? f(str2, bArr) : null;
        String f3 = substring != null ? f(substring, bArr) : null;
        if (str5 != null) {
            f(str5, bArr);
        }
        if (substring3 != null) {
            f(substring3, bArr);
        }
        return new cg21(v, str4, f, f2, f3);
    }
}
