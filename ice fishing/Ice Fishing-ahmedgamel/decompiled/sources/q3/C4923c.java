package q3;

import E3.f;
import E3.g;
import E3.k;
import E3.v;
import O.X;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.icefishingapp.icefishing.C5275R;
import java.util.WeakHashMap;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4923c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f40219a;

    /* renamed from: b, reason: collision with root package name */
    public k f40220b;

    /* renamed from: c, reason: collision with root package name */
    public int f40221c;

    /* renamed from: d, reason: collision with root package name */
    public int f40222d;

    /* renamed from: e, reason: collision with root package name */
    public int f40223e;

    /* renamed from: f, reason: collision with root package name */
    public int f40224f;

    /* renamed from: g, reason: collision with root package name */
    public int f40225g;

    /* renamed from: h, reason: collision with root package name */
    public int f40226h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40227j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f40228k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f40229l;

    /* renamed from: m, reason: collision with root package name */
    public g f40230m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40234q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f40236s;

    /* renamed from: t, reason: collision with root package name */
    public int f40237t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40231n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40232o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40233p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f40235r = true;

    public C4923c(MaterialButton materialButton, k kVar) {
        this.f40219a = materialButton;
        this.f40220b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f40236s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f40236s.getNumberOfLayers() > 2 ? (v) this.f40236s.getDrawable(2) : (v) this.f40236s.getDrawable(1);
    }

    public final g b(boolean z3) {
        RippleDrawable rippleDrawable = this.f40236s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f40236s.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f40220b = kVar;
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

    public final void d(int i, int i6) {
        WeakHashMap weakHashMap = X.f2054a;
        MaterialButton materialButton = this.f40219a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i9 = this.f40223e;
        int i10 = this.f40224f;
        this.f40224f = i6;
        this.f40223e = i;
        if (!this.f40232o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i9, paddingEnd, (paddingBottom + i6) - i10);
    }

    public final void e() {
        g gVar = new g(this.f40220b);
        MaterialButton materialButton = this.f40219a;
        gVar.h(materialButton.getContext());
        H.a.h(gVar, this.f40227j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            H.a.i(gVar, mode);
        }
        float f3 = this.f40226h;
        ColorStateList colorStateList = this.f40228k;
        gVar.f766n.f744j = f3;
        gVar.invalidateSelf();
        f fVar = gVar.f766n;
        if (fVar.f739d != colorStateList) {
            fVar.f739d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f40220b);
        gVar2.setTint(0);
        float f9 = this.f40226h;
        int l9 = this.f40231n ? V2.a.l(C5275R.attr.colorSurface, materialButton) : 0;
        gVar2.f766n.f744j = f9;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(l9);
        f fVar2 = gVar2.f766n;
        if (fVar2.f739d != valueOf) {
            fVar2.f739d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f40220b);
        this.f40230m = gVar3;
        H.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C3.a.a(this.f40229l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f40221c, this.f40223e, this.f40222d, this.f40224f), this.f40230m);
        this.f40236s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b9 = b(false);
        if (b9 != null) {
            b9.i(this.f40237t);
            b9.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b9 = b(false);
        g b10 = b(true);
        if (b9 != null) {
            float f3 = this.f40226h;
            ColorStateList colorStateList = this.f40228k;
            b9.f766n.f744j = f3;
            b9.invalidateSelf();
            f fVar = b9.f766n;
            if (fVar.f739d != colorStateList) {
                fVar.f739d = colorStateList;
                b9.onStateChange(b9.getState());
            }
            if (b10 != null) {
                float f9 = this.f40226h;
                int l9 = this.f40231n ? V2.a.l(C5275R.attr.colorSurface, this.f40219a) : 0;
                b10.f766n.f744j = f9;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(l9);
                f fVar2 = b10.f766n;
                if (fVar2.f739d != valueOf) {
                    fVar2.f739d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
