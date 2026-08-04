package com.gamericefishpro.space.d4;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends d1 {
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;
    public WindowInsets c;
    public com.gamericefishpro.space.u3.b d;

    public y0() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (!f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!h) {
            try {
                g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.d4.d1
    public o1 b() {
        a();
        o1 o1VarD = o1.d(null, this.c);
        com.gamericefishpro.space.u3.b[] bVarArr = this.b;
        l1 l1Var = o1VarD.a;
        l1Var.r(bVarArr);
        l1Var.u(this.d);
        return o1VarD;
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void e(com.gamericefishpro.space.u3.b bVar) {
        this.d = bVar;
    }

    @Override // com.gamericefishpro.space.d4.d1
    public void g(com.gamericefishpro.space.u3.b bVar) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            this.c = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.d);
        }
    }

    public y0(o1 o1Var) {
        super(o1Var);
        this.c = o1Var.c();
    }
}
