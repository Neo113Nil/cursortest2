package com.gamericefishpro.space.y9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.ka.b0;
import com.gamericefishpro.space.ka.h;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.n;
import com.gamericefishpro.space.ka.y;
import com.gamericefishpro.space.r4.f;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final MaterialButton a;
    public n b;
    public b0 c;
    public f d;
    public com.gamericefishpro.space.a8.b e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public j p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public e(MaterialButton materialButton, n nVar) {
        this.a = materialButton;
        this.b = nVar;
    }

    public final j a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (j) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        j jVar = new j(this.b);
        b0 b0Var = this.c;
        if (b0Var != null) {
            jVar.o(b0Var);
        }
        f fVar = this.d;
        if (fVar != null) {
            jVar.l(fVar);
        }
        com.gamericefishpro.space.a8.b bVar = this.e;
        if (bVar != null) {
            jVar.W = bVar;
        }
        MaterialButton materialButton = this.a;
        jVar.k(materialButton.getContext());
        jVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            jVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        jVar.e.k = f;
        jVar.invalidateSelf();
        h hVar = jVar.e;
        if (hVar.e != colorStateList) {
            hVar.e = colorStateList;
            jVar.onStateChange(jVar.getState());
        }
        j jVar2 = new j(this.b);
        b0 b0Var2 = this.c;
        if (b0Var2 != null) {
            jVar2.o(b0Var2);
        }
        f fVar2 = this.d;
        if (fVar2 != null) {
            jVar2.l(fVar2);
        }
        jVar2.setTint(0);
        float f2 = this.k;
        int iS = this.q ? com.gamericefishpro.space.b9.a.s(materialButton, R.attr.colorSurface) : 0;
        jVar2.e.k = f2;
        jVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iS);
        h hVar2 = jVar2.e;
        if (hVar2.e != colorStateListValueOf) {
            hVar2.e = colorStateListValueOf;
            jVar2.onStateChange(jVar2.getState());
        }
        j jVar3 = new j(this.b);
        this.p = jVar3;
        b0 b0Var3 = this.c;
        if (b0Var3 != null) {
            jVar3.o(b0Var3);
        }
        f fVar3 = this.d;
        if (fVar3 != null) {
            this.p.l(fVar3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(com.gamericefishpro.space.ia.a.a(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        j jVarA = a(false);
        if (jVarA != null) {
            jVarA.m(this.w);
            jVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        y yVar;
        j jVarA = a(false);
        if (jVarA != null) {
            b0 b0Var = this.c;
            if (b0Var != null) {
                jVarA.o(b0Var);
            } else {
                jVarA.setShapeAppearanceModel(this.b);
            }
            f fVar = this.d;
            if (fVar != null) {
                jVarA.l(fVar);
            }
        }
        j jVarA2 = a(true);
        if (jVarA2 != null) {
            b0 b0Var2 = this.c;
            if (b0Var2 != null) {
                jVarA2.o(b0Var2);
            } else {
                jVarA2.setShapeAppearanceModel(this.b);
            }
            f fVar2 = this.d;
            if (fVar2 != null) {
                jVarA2.l(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            yVar = null;
        } else {
            yVar = this.v.getNumberOfLayers() > 2 ? (y) this.v.getDrawable(2) : (y) this.v.getDrawable(1);
        }
        if (yVar != null) {
            yVar.setShapeAppearanceModel(this.b);
            if (yVar instanceof j) {
                j jVar = (j) yVar;
                b0 b0Var3 = this.c;
                if (b0Var3 != null) {
                    jVar.o(b0Var3);
                }
                f fVar3 = this.d;
                if (fVar3 != null) {
                    jVar.l(fVar3);
                }
            }
        }
    }

    public final void e() {
        j jVarA = a(false);
        j jVarA2 = a(true);
        if (jVarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            jVarA.e.k = f;
            jVarA.invalidateSelf();
            h hVar = jVarA.e;
            if (hVar.e != colorStateList) {
                hVar.e = colorStateList;
                jVarA.onStateChange(jVarA.getState());
            }
            if (jVarA2 != null) {
                float f2 = this.k;
                int iS = this.q ? com.gamericefishpro.space.b9.a.s(this.a, R.attr.colorSurface) : 0;
                jVarA2.e.k = f2;
                jVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iS);
                h hVar2 = jVarA2.e;
                if (hVar2.e != colorStateListValueOf) {
                    hVar2.e = colorStateListValueOf;
                    jVarA2.onStateChange(jVarA2.getState());
                }
            }
        }
    }
}
