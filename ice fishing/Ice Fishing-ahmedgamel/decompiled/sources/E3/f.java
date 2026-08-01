package E3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import x3.C5196a;

/* loaded from: classes2.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f736a;

    /* renamed from: b, reason: collision with root package name */
    public C5196a f737b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f738c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f739d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f740e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f741f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f742g;

    /* renamed from: h, reason: collision with root package name */
    public final float f743h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f744j;

    /* renamed from: k, reason: collision with root package name */
    public int f745k;

    /* renamed from: l, reason: collision with root package name */
    public float f746l;

    /* renamed from: m, reason: collision with root package name */
    public float f747m;

    /* renamed from: n, reason: collision with root package name */
    public int f748n;

    /* renamed from: o, reason: collision with root package name */
    public int f749o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f750p;

    public f(k kVar) {
        this.f738c = null;
        this.f739d = null;
        this.f740e = null;
        this.f741f = PorterDuff.Mode.SRC_IN;
        this.f742g = null;
        this.f743h = 1.0f;
        this.i = 1.0f;
        this.f745k = com.anythink.basead.exoplayer.k.p.f8473b;
        this.f746l = 0.0f;
        this.f747m = 0.0f;
        this.f748n = 0;
        this.f749o = 0;
        this.f750p = Paint.Style.FILL_AND_STROKE;
        this.f736a = kVar;
        this.f737b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f770x = true;
        return gVar;
    }

    public f(f fVar) {
        this.f738c = null;
        this.f739d = null;
        this.f740e = null;
        this.f741f = PorterDuff.Mode.SRC_IN;
        this.f742g = null;
        this.f743h = 1.0f;
        this.i = 1.0f;
        this.f745k = com.anythink.basead.exoplayer.k.p.f8473b;
        this.f746l = 0.0f;
        this.f747m = 0.0f;
        this.f748n = 0;
        this.f749o = 0;
        this.f750p = Paint.Style.FILL_AND_STROKE;
        this.f736a = fVar.f736a;
        this.f737b = fVar.f737b;
        this.f744j = fVar.f744j;
        this.f738c = fVar.f738c;
        this.f739d = fVar.f739d;
        this.f741f = fVar.f741f;
        this.f740e = fVar.f740e;
        this.f745k = fVar.f745k;
        this.f743h = fVar.f743h;
        this.f749o = fVar.f749o;
        this.i = fVar.i;
        this.f746l = fVar.f746l;
        this.f747m = fVar.f747m;
        this.f748n = fVar.f748n;
        this.f750p = fVar.f750p;
        if (fVar.f742g != null) {
            this.f742g = new Rect(fVar.f742g);
        }
    }
}
