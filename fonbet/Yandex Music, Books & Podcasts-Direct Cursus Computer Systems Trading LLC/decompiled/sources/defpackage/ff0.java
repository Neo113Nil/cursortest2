package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ff0 implements ViewTranslationCallback {
    public static final ff0 a = new ff0();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        tf0 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = pf0.a;
        upe e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tpi tpiVar = ((sfp) objArr[(i << 3) + i3]).a.d.a;
                        Object g = tpiVar.g(ufp.B);
                        if (g == null) {
                            g = null;
                        }
                        if (g != null) {
                            Object g2 = tpiVar.g(hfp.m);
                            sa saVar = (sa) (g2 != null ? g2 : null);
                            if (saVar != null && (function0 = (Function0) saVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        tf0 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = pf0.a;
        upe e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tpi tpiVar = ((sfp) objArr[(i << 3) + i3]).a.d.a;
                        Object g = tpiVar.g(ufp.B);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.d(g, Boolean.TRUE)) {
                            Object g2 = tpiVar.g(hfp.l);
                            sa saVar = (sa) (g2 != null ? g2 : null);
                            if (saVar != null && (function1 = (Function1) saVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        tf0 contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f = pf0.b;
        upe e = contentCaptureManager$ui_release.e();
        Object[] objArr = e.c;
        long[] jArr = e.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        tpi tpiVar = ((sfp) objArr[(i << 3) + i3]).a.d.a;
                        Object g = tpiVar.g(ufp.B);
                        if (g == null) {
                            g = null;
                        }
                        if (Intrinsics.d(g, Boolean.FALSE)) {
                            Object g2 = tpiVar.g(hfp.l);
                            sa saVar = (sa) (g2 != null ? g2 : null);
                            if (saVar != null && (function1 = (Function1) saVar.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
