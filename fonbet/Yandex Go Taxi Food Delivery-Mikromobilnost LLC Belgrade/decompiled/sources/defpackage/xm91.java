package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;

/* loaded from: classes6.dex */
public abstract class xm91 {
    public static final Object a(x920 x920Var, String str) {
        if (x920Var.c(str)) {
            return x920Var.a(str);
        }
        return null;
    }

    public static final f530 b(f530 f530Var, tls tlsVar) {
        return f530Var.k(new q070(tlsVar));
    }

    public static void c(Window window, Rect rect, Bitmap bitmap, Handler handler, tj tjVar) {
        PixelCopy.request(window, rect, bitmap, new e3c0(0, tjVar), handler);
    }

    public static void d(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
