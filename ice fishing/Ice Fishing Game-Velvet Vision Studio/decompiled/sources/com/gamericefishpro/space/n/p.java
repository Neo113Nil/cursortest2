package com.gamericefishpro.space.n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.gamericefishpro.space.t0.m2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;
    public Object e;
    public Object f;

    public p(o oVar) {
        this.e = null;
        this.f = null;
        this.a = false;
        this.b = false;
        this.d = oVar;
    }

    public void a() {
        o oVar = (o) this.d;
        Drawable buttonDrawable = oVar.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.a || this.b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.a) {
                    drawableMutate.setTintList((ColorStateList) this.e);
                }
                if (this.b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(oVar.getDrawableState());
                }
                oVar.setButtonDrawable(drawableMutate);
            }
        }
    }

    public Object b() {
        if (this.a) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        com.gamericefishpro.space.t0.s.b("Unexpected form of a provided value");
        throw new com.gamericefishpro.space.oh.e();
    }

    public p(com.gamericefishpro.space.t0.o1 o1Var, Object obj, boolean z, m2 m2Var, boolean z2) {
        this.d = o1Var;
        this.a = z;
        this.e = m2Var;
        this.b = z2;
        this.f = obj;
        this.c = true;
    }
}
