package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes3.dex */
public final class cc9 {
    public final xzb a;
    public final DisplayMetrics b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cc9(ix8 ix8Var, xzb xzbVar, View view, DisplayMetrics displayMetrics, boolean z, cb9 cb9Var) {
        boolean z2;
        szb szbVar;
        szb szbVar2;
        this.a = xzbVar;
        this.b = displayMetrics;
        if ((ix8Var != null ? ix8Var.e : null) == null) {
            if ((ix8Var != null ? ix8Var.b : null) == null) {
                z2 = false;
                if (z2) {
                    if (ix8Var != null) {
                        szbVar = ix8Var.c;
                    }
                    szbVar = null;
                } else if (wyf.N(view)) {
                    if (ix8Var != null) {
                        szbVar = ix8Var.b;
                    }
                    szbVar = null;
                } else {
                    if (ix8Var != null) {
                        szbVar = ix8Var.e;
                    }
                    szbVar = null;
                }
                float a = a(szbVar);
                this.c = a;
                float a2 = a(ix8Var == null ? ix8Var.f : null);
                this.d = a2;
                if (z2) {
                    if (ix8Var != null) {
                        szbVar2 = ix8Var.d;
                    }
                    szbVar2 = null;
                } else if (wyf.N(view)) {
                    if (ix8Var != null) {
                        szbVar2 = ix8Var.e;
                    }
                    szbVar2 = null;
                } else {
                    if (ix8Var != null) {
                        szbVar2 = ix8Var.b;
                    }
                    szbVar2 = null;
                }
                float a3 = a(szbVar2);
                this.e = a3;
                float a4 = a(ix8Var == null ? ix8Var.a : null);
                this.f = a4;
                this.g = z ? a2 : wyf.N(view) ? a3 : a;
                this.h = z ? a4 : wyf.N(view) ? a : a3;
                cb9 cb9Var2 = cb9.END;
                cb9 cb9Var3 = cb9.START;
                this.i = (z || (cb9Var == cb9Var3 && !wyf.N(view)) || (cb9Var == cb9Var2 && wyf.N(view))) ? Integer.valueOf(eeh.b(a)) : null;
                this.j = (!z || cb9Var == cb9Var3) ? Integer.valueOf(eeh.b(a2)) : null;
                this.k = (z || (cb9Var == cb9Var3 && wyf.N(view)) || (cb9Var == cb9Var2 && !wyf.N(view))) ? Integer.valueOf(eeh.b(a3)) : null;
                this.l = (!z || cb9Var == cb9Var2) ? Integer.valueOf(eeh.b(a4)) : null;
            }
        }
        z2 = true;
        if (z2) {
        }
        float a5 = a(szbVar);
        this.c = a5;
        float a22 = a(ix8Var == null ? ix8Var.f : null);
        this.d = a22;
        if (z2) {
        }
        float a32 = a(szbVar2);
        this.e = a32;
        float a42 = a(ix8Var == null ? ix8Var.a : null);
        this.f = a42;
        this.g = z ? a22 : wyf.N(view) ? a32 : a5;
        this.h = z ? a42 : wyf.N(view) ? a5 : a32;
        cb9 cb9Var22 = cb9.END;
        cb9 cb9Var32 = cb9.START;
        this.i = (z || (cb9Var == cb9Var32 && !wyf.N(view)) || (cb9Var == cb9Var22 && wyf.N(view))) ? Integer.valueOf(eeh.b(a5)) : null;
        this.j = (!z || cb9Var == cb9Var32) ? Integer.valueOf(eeh.b(a22)) : null;
        this.k = (z || (cb9Var == cb9Var32 && wyf.N(view)) || (cb9Var == cb9Var22 && !wyf.N(view))) ? Integer.valueOf(eeh.b(a32)) : null;
        this.l = (!z || cb9Var == cb9Var22) ? Integer.valueOf(eeh.b(a42)) : null;
    }

    public final float a(szb szbVar) {
        if (szbVar != null) {
            return bg3.y(Long.valueOf(((Number) szbVar.a(this.a)).longValue()), this.b);
        }
        return 0.0f;
    }
}
