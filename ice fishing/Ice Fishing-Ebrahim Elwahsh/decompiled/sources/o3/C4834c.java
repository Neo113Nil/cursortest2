package o3;

import C3.f;
import C3.g;
import C3.k;
import C3.v;
import O.X;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.WeakHashMap;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4834c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f39703a;

    /* renamed from: b, reason: collision with root package name */
    public k f39704b;

    /* renamed from: c, reason: collision with root package name */
    public int f39705c;

    /* renamed from: d, reason: collision with root package name */
    public int f39706d;

    /* renamed from: e, reason: collision with root package name */
    public int f39707e;

    /* renamed from: f, reason: collision with root package name */
    public int f39708f;

    /* renamed from: g, reason: collision with root package name */
    public int f39709g;

    /* renamed from: h, reason: collision with root package name */
    public int f39710h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f39711j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f39712k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f39713l;

    /* renamed from: m, reason: collision with root package name */
    public g f39714m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39718q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f39720s;

    /* renamed from: t, reason: collision with root package name */
    public int f39721t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f39715n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39716o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39717p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39719r = true;

    public C4834c(MaterialButton materialButton, k kVar) {
        this.f39703a = materialButton;
        this.f39704b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f39720s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f39720s.getNumberOfLayers() > 2 ? (v) this.f39720s.getDrawable(2) : (v) this.f39720s.getDrawable(1);
    }

    public final g b(boolean z8) {
        RippleDrawable rippleDrawable = this.f39720s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f39720s.getDrawable(0)).getDrawable()).getDrawable(!z8 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f39704b = kVar;
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

    public final void d(int i, int i4) {
        WeakHashMap weakHashMap = X.f2240a;
        MaterialButton materialButton = this.f39703a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f39707e;
        int i10 = this.f39708f;
        this.f39708f = i4;
        this.f39707e = i;
        if (!this.f39716o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i9, paddingEnd, (paddingBottom + i4) - i10);
    }

    public final void e() {
        g gVar = new g(this.f39704b);
        MaterialButton materialButton = this.f39703a;
        gVar.h(materialButton.getContext());
        H.a.h(gVar, this.f39711j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            H.a.i(gVar, mode);
        }
        float f6 = this.f39710h;
        ColorStateList colorStateList = this.f39712k;
        gVar.f413n.f391j = f6;
        gVar.invalidateSelf();
        f fVar = gVar.f413n;
        if (fVar.f386d != colorStateList) {
            fVar.f386d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f39704b);
        gVar2.setTint(0);
        float f9 = this.f39710h;
        int f10 = this.f39715n ? U2.a.f(C5284R.attr.colorSurface, materialButton) : 0;
        gVar2.f413n.f391j = f9;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(f10);
        f fVar2 = gVar2.f413n;
        if (fVar2.f386d != valueOf) {
            fVar2.f386d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f39704b);
        this.f39714m = gVar3;
        H.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(A3.a.a(this.f39713l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f39705c, this.f39707e, this.f39706d, this.f39708f), this.f39714m);
        this.f39720s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b9 = b(false);
        if (b9 != null) {
            b9.i(this.f39721t);
            b9.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b9 = b(false);
        g b10 = b(true);
        if (b9 != null) {
            float f6 = this.f39710h;
            ColorStateList colorStateList = this.f39712k;
            b9.f413n.f391j = f6;
            b9.invalidateSelf();
            f fVar = b9.f413n;
            if (fVar.f386d != colorStateList) {
                fVar.f386d = colorStateList;
                b9.onStateChange(b9.getState());
            }
            if (b10 != null) {
                float f9 = this.f39710h;
                int f10 = this.f39715n ? U2.a.f(C5284R.attr.colorSurface, this.f39703a) : 0;
                b10.f413n.f391j = f9;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(f10);
                f fVar2 = b10.f413n;
                if (fVar2.f386d != valueOf) {
                    fVar2.f386d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
