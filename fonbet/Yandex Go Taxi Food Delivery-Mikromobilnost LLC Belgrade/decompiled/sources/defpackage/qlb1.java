package defpackage;

import android.view.KeyEvent;
import android.webkit.MimeTypeMap;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class qlb1 {
    public static au2 a;

    public static final boolean a(int i, KeyEvent keyEvent) {
        return ((int) (c9y.c(keyEvent) >> 32)) == i;
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ChevronRightM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(12.0f, 4.0f);
        e.b(8.0f, 8.0f, true, true, 0.0f, 16.0f);
        e.b(8.0f, 8.0f, false, true, 0.0f, -16.0f);
        e.j(9.53f, 8.3f);
        e.i(0.62f, 0.63f);
        e.h(13.22f, 12.0f);
        e.i(-3.07f, 3.07f);
        e.i(-0.62f, 0.62f);
        e.i(1.24f, 1.24f);
        e.i(0.62f, -0.62f);
        e.i(3.69f, -3.7f);
        e.i(0.62f, -0.61f);
        e.i(-0.62f, -0.62f);
        e.i(-3.7f, -3.7f);
        e.i(-0.61f, -0.61f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static String c(String str) {
        if (evu0.J(str)) {
            return null;
        }
        String h0 = evu0.h0('#', str, str);
        String h02 = evu0.h0('?', h0, h0);
        String e0 = evu0.e0('.', evu0.e0('/', h02, h02), "");
        if (evu0.J(e0)) {
            return null;
        }
        String lowerCase = e0.toLowerCase(Locale.ROOT);
        String str2 = (String) fh20.a.get(lowerCase);
        return str2 == null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase) : str2;
    }
}
