package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.shape.a;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class vch {
    public final MaterialButton a;
    public eup b;
    public her c;
    public z8r d;
    public uvg e;
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
    public a p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public vch(MaterialButton materialButton, eup eupVar) {
        this.a = materialButton;
        this.b = eupVar;
    }

    public final a a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (a) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
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
        a aVar = new a(this.b);
        her herVar = this.c;
        if (herVar != null) {
            aVar.w(herVar);
        }
        z8r z8rVar = this.d;
        if (z8rVar != null) {
            aVar.p(z8rVar);
        }
        uvg uvgVar = this.e;
        if (uvgVar != null) {
            aVar.E = uvgVar;
        }
        MaterialButton materialButton = this.a;
        aVar.n(materialButton.getContext());
        aVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            aVar.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        aVar.b.k = f;
        aVar.invalidateSelf();
        aVar.x(colorStateList);
        a aVar2 = new a(this.b);
        her herVar2 = this.c;
        if (herVar2 != null) {
            aVar2.w(herVar2);
        }
        z8r z8rVar2 = this.d;
        if (z8rVar2 != null) {
            aVar2.p(z8rVar2);
        }
        aVar2.setTint(0);
        float f2 = this.k;
        int N = this.q ? qgg.N(R.attr.colorSurface, materialButton) : 0;
        aVar2.b.k = f2;
        aVar2.invalidateSelf();
        aVar2.x(ColorStateList.valueOf(N));
        a aVar3 = new a(this.b);
        this.p = aVar3;
        her herVar3 = this.c;
        if (herVar3 != null) {
            aVar3.w(herVar3);
        }
        z8r z8rVar3 = this.d;
        if (z8rVar3 != null) {
            this.p.p(z8rVar3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(leo.b(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{aVar2, aVar}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        a a = a(false);
        if (a != null) {
            a.q(this.w);
            a.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        fvp fvpVar;
        a a = a(false);
        if (a != null) {
            her herVar = this.c;
            if (herVar != null) {
                a.w(herVar);
            } else {
                a.setShapeAppearanceModel(this.b);
            }
            z8r z8rVar = this.d;
            if (z8rVar != null) {
                a.p(z8rVar);
            }
        }
        a a2 = a(true);
        if (a2 != null) {
            her herVar2 = this.c;
            if (herVar2 != null) {
                a2.w(herVar2);
            } else {
                a2.setShapeAppearanceModel(this.b);
            }
            z8r z8rVar2 = this.d;
            if (z8rVar2 != null) {
                a2.p(z8rVar2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            fvpVar = null;
        } else {
            int numberOfLayers = this.v.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.v;
            fvpVar = numberOfLayers > 2 ? (fvp) rippleDrawable2.getDrawable(2) : (fvp) rippleDrawable2.getDrawable(1);
        }
        if (fvpVar != null) {
            fvpVar.setShapeAppearanceModel(this.b);
            if (fvpVar instanceof a) {
                a aVar = (a) fvpVar;
                her herVar3 = this.c;
                if (herVar3 != null) {
                    aVar.w(herVar3);
                }
                z8r z8rVar3 = this.d;
                if (z8rVar3 != null) {
                    aVar.p(z8rVar3);
                }
            }
        }
    }

    public final void e() {
        a a = a(false);
        a a2 = a(true);
        if (a != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            a.b.k = f;
            a.invalidateSelf();
            a.x(colorStateList);
            if (a2 != null) {
                float f2 = this.k;
                int N = this.q ? qgg.N(R.attr.colorSurface, this.a) : 0;
                a2.b.k = f2;
                a2.invalidateSelf();
                a2.x(ColorStateList.valueOf(N));
            }
        }
    }
}
