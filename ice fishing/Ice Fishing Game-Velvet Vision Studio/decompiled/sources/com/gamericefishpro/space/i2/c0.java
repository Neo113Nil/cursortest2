package com.gamericefishpro.space.i2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ViewTranslationCallback {
    public static final c0 a = new c0();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        Intrinsics.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        com.gamericefishpro.space.j1.d contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = com.gamericefishpro.space.j1.a.d;
        com.gamericefishpro.space.t.l lVarF = contentCaptureManager$ui.f();
        Object[] objArr = lVarF.c;
        long[] jArr = lVarF.a;
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
                        com.gamericefishpro.space.t.h0 h0Var = ((com.gamericefishpro.space.o2.p) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = h0Var.g(com.gamericefishpro.space.o2.s.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.n);
                            com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (function0 = (Function0) aVar.b) != null) {
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
        Intrinsics.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        com.gamericefishpro.space.j1.d contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = com.gamericefishpro.space.j1.a.d;
        com.gamericefishpro.space.t.l lVarF = contentCaptureManager$ui.f();
        Object[] objArr = lVarF.c;
        long[] jArr = lVarF.a;
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
                        com.gamericefishpro.space.t.h0 h0Var = ((com.gamericefishpro.space.o2.p) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = h0Var.g(com.gamericefishpro.space.o2.s.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.a(objG, Boolean.TRUE)) {
                            Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.m);
                            com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (function1 = (Function1) aVar.b) != null) {
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
        Intrinsics.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        com.gamericefishpro.space.j1.d contentCaptureManager$ui = ((t) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.y = com.gamericefishpro.space.j1.a.e;
        com.gamericefishpro.space.t.l lVarF = contentCaptureManager$ui.f();
        Object[] objArr = lVarF.c;
        long[] jArr = lVarF.a;
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
                        com.gamericefishpro.space.t.h0 h0Var = ((com.gamericefishpro.space.o2.p) objArr[(i << 3) + i3]).a.d.d;
                        Object objG = h0Var.g(com.gamericefishpro.space.o2.s.C);
                        if (objG == null) {
                            objG = null;
                        }
                        if (Intrinsics.a(objG, Boolean.FALSE)) {
                            Object objG2 = h0Var.g(com.gamericefishpro.space.o2.k.m);
                            com.gamericefishpro.space.o2.a aVar = (com.gamericefishpro.space.o2.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (function1 = (Function1) aVar.b) != null) {
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
