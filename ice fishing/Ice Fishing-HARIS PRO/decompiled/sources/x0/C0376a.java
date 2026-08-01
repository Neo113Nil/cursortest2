package x0;

import L0.i;
import L0.j;
import L0.m;
import O.K;
import P0.d;
import S0.g;
import S0.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import v0.AbstractC0360a;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376a extends Drawable implements i {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4713a;

    /* renamed from: b, reason: collision with root package name */
    public final g f4714b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4715c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4716d;
    public final c e;

    /* renamed from: f, reason: collision with root package name */
    public float f4717f;

    /* renamed from: g, reason: collision with root package name */
    public float f4718g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4719h;
    public float i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f4720k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f4721l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f4722m;

    public C0376a(Context context, b bVar) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f4713a = weakReference;
        m.c(context, m.f518b, "Theme.MaterialComponents");
        this.f4716d = new Rect();
        j jVar = new j(this);
        this.f4715c = jVar;
        TextPaint textPaint = jVar.f511a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, bVar);
        this.e = cVar;
        boolean e = e();
        b bVar2 = cVar.f4751b;
        g gVar = new g(k.a(context, e ? bVar2.f4732g.intValue() : bVar2.e.intValue(), e() ? bVar2.f4733h.intValue() : bVar2.f4731f.intValue(), new S0.a(0)).a());
        this.f4714b = gVar;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && jVar.f516g != (dVar = new d(context2, bVar2.f4730d.intValue()))) {
            jVar.b(dVar, context2);
            textPaint.setColor(bVar2.f4729c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = bVar2.f4735l;
        if (i != -2) {
            this.f4719h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f4719h = bVar2.f4736m;
        }
        jVar.e = true;
        i();
        invalidateSelf();
        jVar.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar2.f4728b.intValue());
        if (gVar.f1076a.f1064c != valueOf) {
            gVar.m(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f4729c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f4721l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f4721l.get();
            WeakReference weakReference3 = this.f4722m;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(bVar2.f4743t.booleanValue(), false);
    }

    @Override // L0.i
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        c cVar = this.e;
        b bVar = cVar.f4751b;
        String str = bVar.j;
        boolean z2 = str != null;
        WeakReference weakReference = this.f4713a;
        if (z2) {
            int i = bVar.f4735l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i2 = this.f4719h;
        b bVar2 = cVar.f4751b;
        if (i2 == -2 || d() <= this.f4719h) {
            return NumberFormat.getInstance(bVar2.f4737n).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(bVar2.f4737n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f4719h), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f4722m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.e.f4751b.f4734k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b2;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f4714b.draw(canvas);
        if (!e() || (b2 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        j jVar = this.f4715c;
        jVar.f511a.getTextBounds(b2, 0, b2.length(), rect);
        float exactCenterY = this.f4718g - rect.exactCenterY();
        canvas.drawText(b2, this.f4717f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), jVar.f511a);
    }

    public final boolean e() {
        return this.e.f4751b.j != null || f();
    }

    public final boolean f() {
        b bVar = this.e.f4751b;
        return bVar.j == null && bVar.f4734k != -1;
    }

    public final void g() {
        Context context = (Context) this.f4713a.get();
        if (context == null) {
            return;
        }
        boolean e = e();
        c cVar = this.e;
        this.f4714b.setShapeAppearanceModel(k.a(context, e ? cVar.f4751b.f4732g.intValue() : cVar.f4751b.e.intValue(), e() ? cVar.f4751b.f4733h.intValue() : cVar.f4751b.f4731f.intValue(), new S0.a(0)).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.f4751b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4716d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4716d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.f4721l = new WeakReference(view);
        this.f4722m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        float f2;
        float f3;
        float y2;
        float x2;
        float height;
        float width;
        float f4;
        float f5;
        WeakReference weakReference = this.f4713a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f4721l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f4716d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f4722m;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean e = e();
        c cVar = this.e;
        float f6 = e ? cVar.f4753d : cVar.f4752c;
        this.i = f6;
        if (f6 != -1.0f) {
            this.j = f6;
            this.f4720k = f6;
        } else {
            this.j = Math.round((e() ? cVar.f4755g : cVar.e) / 2.0f);
            this.f4720k = Math.round((e() ? cVar.f4756h : cVar.f4754f) / 2.0f);
        }
        if (e()) {
            String b2 = b();
            float f7 = this.j;
            j jVar = this.f4715c;
            if (jVar.e) {
                jVar.a(b2);
                f4 = jVar.f513c;
            } else {
                f4 = jVar.f513c;
            }
            this.j = Math.max(f7, (f4 / 2.0f) + cVar.f4751b.f4744u.intValue());
            float f8 = this.f4720k;
            if (jVar.e) {
                jVar.a(b2);
                f5 = jVar.f514d;
            } else {
                f5 = jVar.f514d;
            }
            float max = Math.max(f8, (f5 / 2.0f) + cVar.f4751b.f4745v.intValue());
            this.f4720k = max;
            this.j = Math.max(this.j, max);
        }
        int intValue = cVar.f4751b.f4747x.intValue();
        boolean e2 = e();
        b bVar = cVar.f4751b;
        if (e2) {
            intValue = bVar.f4749z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                intValue = AbstractC0360a.c(intValue, intValue - bVar.f4725C.intValue(), AbstractC0360a.b(RecyclerView.f2111C0, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        int i = cVar.f4757k;
        if (i == 0) {
            intValue -= Math.round(this.f4720k);
        }
        int intValue2 = bVar.f4724B.intValue() + intValue;
        int intValue3 = bVar.f4742s.intValue();
        if (intValue3 == 8388691 || intValue3 == 8388693) {
            this.f4718g = rect3.bottom - intValue2;
        } else {
            this.f4718g = rect3.top + intValue2;
        }
        int intValue4 = e() ? bVar.f4748y.intValue() : bVar.f4746w.intValue();
        if (i == 1) {
            intValue4 += e() ? cVar.j : cVar.i;
        }
        int intValue5 = bVar.f4723A.intValue() + intValue4;
        int intValue6 = bVar.f4742s.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            WeakHashMap weakHashMap = K.f747a;
            this.f4717f = view.getLayoutDirection() == 0 ? (rect3.left - this.j) + intValue5 : (rect3.right + this.j) - intValue5;
        } else {
            WeakHashMap weakHashMap2 = K.f747a;
            this.f4717f = view.getLayoutDirection() == 0 ? (rect3.right + this.j) - intValue5 : (rect3.left - this.j) + intValue5;
        }
        if (bVar.f4726D.booleanValue()) {
            View c2 = c();
            if (c2 != null) {
                FrameLayout c3 = c();
                if (c3 == null || c3.getId() != R.id.mtrl_anchor_parent) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else if (c2.getParent() instanceof View) {
                    f2 = c2.getY();
                    f3 = c2.getX();
                    c2 = (View) c2.getParent();
                }
                y2 = c2.getY() + (this.f4718g - this.f4720k) + f2;
                x2 = c2.getX() + (this.f4717f - this.j) + f3;
                if (!(c2.getParent() instanceof View)) {
                }
                if (!(c2.getParent() instanceof View)) {
                }
                if (y2 < RecyclerView.f2111C0) {
                }
                if (x2 < RecyclerView.f2111C0) {
                }
                if (height > RecyclerView.f2111C0) {
                }
                if (width > RecyclerView.f2111C0) {
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                f3 = view.getX();
                View view2 = (View) view.getParent();
                f2 = y3;
                c2 = view2;
                y2 = c2.getY() + (this.f4718g - this.f4720k) + f2;
                x2 = c2.getX() + (this.f4717f - this.j) + f3;
                height = !(c2.getParent() instanceof View) ? ((this.f4718g + this.f4720k) - (((View) c2.getParent()).getHeight() - c2.getY())) + f2 : 0.0f;
                width = !(c2.getParent() instanceof View) ? ((this.f4717f + this.j) - (((View) c2.getParent()).getWidth() - c2.getX())) + f3 : 0.0f;
                if (y2 < RecyclerView.f2111C0) {
                    this.f4718g = Math.abs(y2) + this.f4718g;
                }
                if (x2 < RecyclerView.f2111C0) {
                    this.f4717f = Math.abs(x2) + this.f4717f;
                }
                if (height > RecyclerView.f2111C0) {
                    this.f4718g -= Math.abs(height);
                }
                if (width > RecyclerView.f2111C0) {
                    this.f4717f -= Math.abs(width);
                }
            }
        }
        float f9 = this.f4717f;
        float f10 = this.f4718g;
        float f11 = this.j;
        float f12 = this.f4720k;
        rect2.set((int) (f9 - f11), (int) (f10 - f12), (int) (f9 + f11), (int) (f10 + f12));
        float f13 = this.i;
        g gVar = this.f4714b;
        if (f13 != -1.0f) {
            S0.j e3 = gVar.f1076a.f1062a.e();
            e3.e = new S0.a(f13);
            e3.f1100f = new S0.a(f13);
            e3.f1101g = new S0.a(f13);
            e3.f1102h = new S0.a(f13);
            gVar.setShapeAppearanceModel(e3.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        gVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, L0.i
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c cVar = this.e;
        cVar.f4750a.i = i;
        cVar.f4751b.i = i;
        this.f4715c.f511a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
