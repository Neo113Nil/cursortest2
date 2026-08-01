package C0;

import O.K;
import S0.f;
import S0.g;
import S0.k;
import S0.v;
import a.AbstractC0078a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f81a;

    /* renamed from: b, reason: collision with root package name */
    public k f82b;

    /* renamed from: c, reason: collision with root package name */
    public int f83c;

    /* renamed from: d, reason: collision with root package name */
    public int f84d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f85f;

    /* renamed from: g, reason: collision with root package name */
    public int f86g;

    /* renamed from: h, reason: collision with root package name */
    public int f87h;
    public PorterDuff.Mode i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f88k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f89l;

    /* renamed from: m, reason: collision with root package name */
    public g f90m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f94q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f96s;

    /* renamed from: t, reason: collision with root package name */
    public int f97t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f91n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f95r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f81a = materialButton;
        this.f82b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f96s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f96s.getNumberOfLayers() > 2 ? (v) this.f96s.getDrawable(2) : (v) this.f96s.getDrawable(1);
    }

    public final g b(boolean z2) {
        RippleDrawable rippleDrawable = this.f96s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f96s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f82b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = K.f747a;
        MaterialButton materialButton = this.f81a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f85f;
        this.f85f = i2;
        this.e = i;
        if (!this.f92o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void e() {
        g gVar = new g(this.f82b);
        MaterialButton materialButton = this.f81a;
        gVar.j(materialButton.getContext());
        gVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        float f2 = this.f87h;
        ColorStateList colorStateList = this.f88k;
        gVar.f1076a.j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f1076a;
        if (fVar.f1065d != colorStateList) {
            fVar.f1065d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f82b);
        gVar2.setTint(0);
        float f3 = this.f87h;
        int y2 = this.f91n ? AbstractC0078a.y(materialButton, R.attr.colorSurface) : 0;
        gVar2.f1076a.j = f3;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(y2);
        f fVar2 = gVar2.f1076a;
        if (fVar2.f1065d != valueOf) {
            fVar2.f1065d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f82b);
        this.f90m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(Q0.a.b(this.f89l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f83c, this.e, this.f84d, this.f85f), this.f90m);
        this.f96s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b(false);
        if (b2 != null) {
            b2.l(this.f97t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            float f2 = this.f87h;
            ColorStateList colorStateList = this.f88k;
            b2.f1076a.j = f2;
            b2.invalidateSelf();
            f fVar = b2.f1076a;
            if (fVar.f1065d != colorStateList) {
                fVar.f1065d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f3 = this.f87h;
                int y2 = this.f91n ? AbstractC0078a.y(this.f81a, R.attr.colorSurface) : 0;
                b3.f1076a.j = f3;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(y2);
                f fVar2 = b3.f1076a;
                if (fVar2.f1065d != valueOf) {
                    fVar2.f1065d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
