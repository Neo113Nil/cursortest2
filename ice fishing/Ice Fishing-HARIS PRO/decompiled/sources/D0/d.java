package D0;

import O.K;
import S0.g;
import S0.i;
import S0.j;
import S0.k;
import a.AbstractC0078a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;
import q.AbstractC0330a;
import u0.AbstractC0358a;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: y, reason: collision with root package name */
    public static final double f126y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f127z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f128a;

    /* renamed from: c, reason: collision with root package name */
    public final g f130c;

    /* renamed from: d, reason: collision with root package name */
    public final g f131d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f132f;

    /* renamed from: g, reason: collision with root package name */
    public int f133g;

    /* renamed from: h, reason: collision with root package name */
    public int f134h;
    public Drawable i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f135k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f136l;

    /* renamed from: m, reason: collision with root package name */
    public k f137m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f138n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f139o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f140p;

    /* renamed from: q, reason: collision with root package name */
    public g f141q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f143s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f144t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f145u;

    /* renamed from: v, reason: collision with root package name */
    public final int f146v;

    /* renamed from: w, reason: collision with root package name */
    public final int f147w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f129b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f142r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f148x = RecyclerView.f2111C0;

    static {
        f127z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public d(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f128a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f130c = gVar;
        gVar.j(materialCardView.getContext());
        gVar.o();
        j e = gVar.f1076a.f1062a.e();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, AbstractC0358a.f4442d, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.f2111C0);
            e.e = new S0.a(dimension);
            e.f1100f = new S0.a(dimension);
            e.f1101g = new S0.a(dimension);
            e.f1102h = new S0.a(dimension);
        }
        this.f131d = new g();
        h(e.a());
        this.f145u = AbstractC0078a.X(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0360a.f4480a);
        this.f146v = AbstractC0078a.W(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f147w = AbstractC0078a.W(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(R.j jVar, float f2) {
        return jVar instanceof i ? (float) ((1.0d - f126y) * f2) : jVar instanceof S0.d ? f2 / 2.0f : RecyclerView.f2111C0;
    }

    public final float a() {
        R.j jVar = this.f137m.f1105a;
        g gVar = this.f130c;
        return Math.max(Math.max(b(jVar, gVar.h()), b(this.f137m.f1106b, gVar.f1076a.f1062a.f1109f.a(gVar.g()))), Math.max(b(this.f137m.f1107c, gVar.f1076a.f1062a.f1110g.a(gVar.g())), b(this.f137m.f1108d, gVar.f1076a.f1062a.f1111h.a(gVar.g()))));
    }

    public final LayerDrawable c() {
        if (this.f139o == null) {
            int[] iArr = Q0.a.f928a;
            this.f141q = new g(this.f137m);
            this.f139o = new RippleDrawable(this.f135k, null, this.f141q);
        }
        if (this.f140p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f139o, this.f131d, this.j});
            this.f140p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f140p;
    }

    public final c d(Drawable drawable) {
        int i;
        int i2;
        MaterialCardView materialCardView = this.f128a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean i3 = i();
            float f2 = RecyclerView.f2111C0;
            int ceil = (int) Math.ceil(maxCardElevation + (i3 ? a() : 0.0f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f2 = a();
            }
            i = (int) Math.ceil(maxCardElevation2 + f2);
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new c(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f140p != null) {
            MaterialCardView materialCardView = this.f128a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean i7 = i();
                float f2 = RecyclerView.f2111C0;
                i3 = (int) Math.ceil((maxCardElevation + (i7 ? a() : 0.0f)) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f2 = a();
                }
                i4 = (int) Math.ceil((maxCardElevation2 + f2) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i8 = this.f133g;
            int i9 = (i8 & 8388613) == 8388613 ? ((i - this.e) - this.f132f) - i4 : this.e;
            int i10 = (i8 & 80) == 80 ? this.e : ((i2 - this.e) - this.f132f) - i3;
            int i11 = (i8 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f132f) - i4;
            int i12 = (i8 & 80) == 80 ? ((i2 - this.e) - this.f132f) - i3 : this.e;
            WeakHashMap weakHashMap = K.f747a;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.f140p.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            float f2 = RecyclerView.f2111C0;
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                if (z2) {
                    f2 = 1.0f;
                }
                this.f148x = f2;
                return;
            }
            if (z2) {
                f2 = 1.0f;
            }
            float f3 = z2 ? 1.0f - this.f148x : this.f148x;
            ValueAnimator valueAnimator = this.f144t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f144t = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f148x, f2);
            this.f144t = ofFloat;
            ofFloat.addUpdateListener(new b(r0, this));
            this.f144t.setInterpolator(this.f145u);
            this.f144t.setDuration((long) ((z2 ? this.f146v : this.f147w) * f3));
            this.f144t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.j = mutate;
            mutate.setTintList(this.f136l);
            f(this.f128a.j, false);
        } else {
            this.j = f127z;
        }
        LayerDrawable layerDrawable = this.f140p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(k kVar) {
        this.f137m = kVar;
        g gVar = this.f130c;
        gVar.setShapeAppearanceModel(kVar);
        gVar.f1094v = !gVar.k();
        g gVar2 = this.f131d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f141q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f128a;
        return materialCardView.getPreventCornerOverlap() && this.f130c.k() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f128a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable c2 = j() ? c() : this.f131d;
        this.i = c2;
        if (drawable != c2) {
            MaterialCardView materialCardView = this.f128a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c2);
            } else {
                materialCardView.setForeground(d(c2));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f128a;
        boolean z2 = materialCardView.getPreventCornerOverlap() && !this.f130c.k();
        float f2 = RecyclerView.f2111C0;
        float a2 = (z2 || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f2 = (float) ((1.0d - f126y) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a2 - f2);
        Rect rect = this.f129b;
        materialCardView.f4222c.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        F.i iVar = materialCardView.e;
        if (!((AbstractC0330a) iVar.f209c).getUseCompatPadding()) {
            iVar.I(0, 0, 0, 0);
            return;
        }
        q.c cVar = (q.c) ((Drawable) iVar.f208b);
        float f3 = cVar.e;
        float f4 = cVar.f4224a;
        AbstractC0330a abstractC0330a = (AbstractC0330a) iVar.f209c;
        int ceil = (int) Math.ceil(q.d.a(f3, f4, abstractC0330a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(q.d.b(f3, f4, abstractC0330a.getPreventCornerOverlap()));
        iVar.I(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z2 = this.f142r;
        MaterialCardView materialCardView = this.f128a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.f130c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
