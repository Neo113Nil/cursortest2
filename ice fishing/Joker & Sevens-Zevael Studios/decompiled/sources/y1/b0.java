package y1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f8475a = new b0();

    public final boolean onClearTranslation(View view) {
        oc.a aVar;
        pc.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f175l = a1.b.f155g;
        s.k i10 = contentCaptureManager$ui_release.i();
        Object[] objArr = i10.f6297c;
        long[] jArr = i10.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        s.g0 g0Var = ((e2.o) objArr[(i11 << 3) + i13]).f2000a.f1996d.f1985g;
                        Object g8 = g0Var.g(e2.s.A);
                        if (g8 == null) {
                            g8 = null;
                        }
                        if (g8 != null) {
                            Object g10 = g0Var.g(e2.i.f1971m);
                            e2.a aVar2 = (e2.a) (g10 != null ? g10 : null);
                            if (aVar2 != null && (aVar = (oc.a) aVar2.f1945b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onHideTranslation(View view) {
        oc.c cVar;
        pc.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f175l = a1.b.f155g;
        s.k i10 = contentCaptureManager$ui_release.i();
        Object[] objArr = i10.f6297c;
        long[] jArr = i10.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        s.g0 g0Var = ((e2.o) objArr[(i11 << 3) + i13]).f2000a.f1996d.f1985g;
                        Object g8 = g0Var.g(e2.s.A);
                        if (g8 == null) {
                            g8 = null;
                        }
                        if (pc.j.a(g8, Boolean.TRUE)) {
                            Object g10 = g0Var.g(e2.i.f1970l);
                            e2.a aVar = (e2.a) (g10 != null ? g10 : null);
                            if (aVar != null && (cVar = (oc.c) aVar.f1945b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    public final boolean onShowTranslation(View view) {
        oc.c cVar;
        pc.j.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        a1.h contentCaptureManager$ui_release = ((r) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f175l = a1.b.f156h;
        s.k i10 = contentCaptureManager$ui_release.i();
        Object[] objArr = i10.f6297c;
        long[] jArr = i10.f6295a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j3 = jArr[i11];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j3) < 128) {
                        s.g0 g0Var = ((e2.o) objArr[(i11 << 3) + i13]).f2000a.f1996d.f1985g;
                        Object g8 = g0Var.g(e2.s.A);
                        if (g8 == null) {
                            g8 = null;
                        }
                        if (pc.j.a(g8, Boolean.FALSE)) {
                            Object g10 = g0Var.g(e2.i.f1970l);
                            e2.a aVar = (e2.a) (g10 != null ? g10 : null);
                            if (aVar != null && (cVar = (oc.c) aVar.f1945b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }
}
