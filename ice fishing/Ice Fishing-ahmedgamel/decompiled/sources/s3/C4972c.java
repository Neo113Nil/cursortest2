package s3;

import G3.f;
import G3.g;
import G3.k;
import G3.v;
import O.X;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4972c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f40518a;

    /* renamed from: b, reason: collision with root package name */
    public k f40519b;

    /* renamed from: c, reason: collision with root package name */
    public int f40520c;

    /* renamed from: d, reason: collision with root package name */
    public int f40521d;

    /* renamed from: e, reason: collision with root package name */
    public int f40522e;

    /* renamed from: f, reason: collision with root package name */
    public int f40523f;

    /* renamed from: g, reason: collision with root package name */
    public int f40524g;

    /* renamed from: h, reason: collision with root package name */
    public int f40525h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40526j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f40527k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f40528l;

    /* renamed from: m, reason: collision with root package name */
    public g f40529m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f40533q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f40535s;

    /* renamed from: t, reason: collision with root package name */
    public int f40536t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40530n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40531o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f40532p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f40534r = true;

    public C4972c(MaterialButton materialButton, k kVar) {
        this.f40518a = materialButton;
        this.f40519b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f40535s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f40535s.getNumberOfLayers() > 2 ? (v) this.f40535s.getDrawable(2) : (v) this.f40535s.getDrawable(1);
    }

    public final g b(boolean z6) {
        RippleDrawable rippleDrawable = this.f40535s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.f40535s.getDrawable(0)).getDrawable()).getDrawable(!z6 ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f40519b = kVar;
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
        WeakHashMap weakHashMap = X.f2142a;
        MaterialButton materialButton = this.f40518a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i6 = this.f40522e;
        int i9 = this.f40523f;
        this.f40523f = i4;
        this.f40522e = i;
        if (!this.f40531o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i6, paddingEnd, (paddingBottom + i4) - i9);
    }

    public final void e() {
        g gVar = new g(this.f40519b);
        MaterialButton materialButton = this.f40518a;
        gVar.h(materialButton.getContext());
        H.a.h(gVar, this.f40526j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            H.a.i(gVar, mode);
        }
        float f2 = this.f40525h;
        ColorStateList colorStateList = this.f40527k;
        gVar.f1108n.f1086j = f2;
        gVar.invalidateSelf();
        f fVar = gVar.f1108n;
        if (fVar.f1081d != colorStateList) {
            fVar.f1081d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.f40519b);
        gVar2.setTint(0);
        float f9 = this.f40525h;
        int h3 = this.f40530n ? Q3.b.h(C5248R.attr.colorSurface, materialButton) : 0;
        gVar2.f1108n.f1086j = f9;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(h3);
        f fVar2 = gVar2.f1108n;
        if (fVar2.f1081d != valueOf) {
            fVar2.f1081d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.f40519b);
        this.f40529m = gVar3;
        H.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(E3.a.a(this.f40528l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f40520c, this.f40522e, this.f40521d, this.f40523f), this.f40529m);
        this.f40535s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b9 = b(false);
        if (b9 != null) {
            b9.i(this.f40536t);
            b9.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        g b9 = b(false);
        g b10 = b(true);
        if (b9 != null) {
            float f2 = this.f40525h;
            ColorStateList colorStateList = this.f40527k;
            b9.f1108n.f1086j = f2;
            b9.invalidateSelf();
            f fVar = b9.f1108n;
            if (fVar.f1081d != colorStateList) {
                fVar.f1081d = colorStateList;
                b9.onStateChange(b9.getState());
            }
            if (b10 != null) {
                float f9 = this.f40525h;
                int h3 = this.f40530n ? Q3.b.h(C5248R.attr.colorSurface, this.f40518a) : 0;
                b10.f1108n.f1086j = f9;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(h3);
                f fVar2 = b10.f1108n;
                if (fVar2.f1081d != valueOf) {
                    fVar2.f1081d = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
