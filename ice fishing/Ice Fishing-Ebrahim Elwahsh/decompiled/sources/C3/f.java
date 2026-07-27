package C3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import v3.C5125a;

/* loaded from: classes2.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f383a;

    /* renamed from: b, reason: collision with root package name */
    public C5125a f384b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f385c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f386d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f387e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f388f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f389g;

    /* renamed from: h, reason: collision with root package name */
    public final float f390h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f391j;

    /* renamed from: k, reason: collision with root package name */
    public int f392k;

    /* renamed from: l, reason: collision with root package name */
    public float f393l;

    /* renamed from: m, reason: collision with root package name */
    public float f394m;

    /* renamed from: n, reason: collision with root package name */
    public int f395n;

    /* renamed from: o, reason: collision with root package name */
    public int f396o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f397p;

    public f(k kVar) {
        this.f385c = null;
        this.f386d = null;
        this.f387e = null;
        this.f388f = PorterDuff.Mode.SRC_IN;
        this.f389g = null;
        this.f390h = 1.0f;
        this.i = 1.0f;
        this.f392k = com.anythink.basead.exoplayer.k.p.f8630b;
        this.f393l = 0.0f;
        this.f394m = 0.0f;
        this.f395n = 0;
        this.f396o = 0;
        this.f397p = Paint.Style.FILL_AND_STROKE;
        this.f383a = kVar;
        this.f384b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f417x = true;
        return gVar;
    }

    public f(f fVar) {
        this.f385c = null;
        this.f386d = null;
        this.f387e = null;
        this.f388f = PorterDuff.Mode.SRC_IN;
        this.f389g = null;
        this.f390h = 1.0f;
        this.i = 1.0f;
        this.f392k = com.anythink.basead.exoplayer.k.p.f8630b;
        this.f393l = 0.0f;
        this.f394m = 0.0f;
        this.f395n = 0;
        this.f396o = 0;
        this.f397p = Paint.Style.FILL_AND_STROKE;
        this.f383a = fVar.f383a;
        this.f384b = fVar.f384b;
        this.f391j = fVar.f391j;
        this.f385c = fVar.f385c;
        this.f386d = fVar.f386d;
        this.f388f = fVar.f388f;
        this.f387e = fVar.f387e;
        this.f392k = fVar.f392k;
        this.f390h = fVar.f390h;
        this.f396o = fVar.f396o;
        this.i = fVar.i;
        this.f393l = fVar.f393l;
        this.f394m = fVar.f394m;
        this.f395n = fVar.f395n;
        this.f397p = fVar.f397p;
        if (fVar.f389g != null) {
            this.f389g = new Rect(fVar.f389g);
        }
    }
}
