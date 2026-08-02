package G3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import z3.C5232a;

/* loaded from: classes2.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f1078a;

    /* renamed from: b, reason: collision with root package name */
    public C5232a f1079b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1080c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1081d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f1082e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f1083f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1084g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1085h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1086j;

    /* renamed from: k, reason: collision with root package name */
    public int f1087k;

    /* renamed from: l, reason: collision with root package name */
    public float f1088l;

    /* renamed from: m, reason: collision with root package name */
    public float f1089m;

    /* renamed from: n, reason: collision with root package name */
    public int f1090n;

    /* renamed from: o, reason: collision with root package name */
    public int f1091o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f1092p;

    public f(k kVar) {
        this.f1080c = null;
        this.f1081d = null;
        this.f1082e = null;
        this.f1083f = PorterDuff.Mode.SRC_IN;
        this.f1084g = null;
        this.f1085h = 1.0f;
        this.i = 1.0f;
        this.f1087k = com.anythink.basead.exoplayer.k.p.f9259b;
        this.f1088l = 0.0f;
        this.f1089m = 0.0f;
        this.f1090n = 0;
        this.f1091o = 0;
        this.f1092p = Paint.Style.FILL_AND_STROKE;
        this.f1078a = kVar;
        this.f1079b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f1112x = true;
        return gVar;
    }

    public f(f fVar) {
        this.f1080c = null;
        this.f1081d = null;
        this.f1082e = null;
        this.f1083f = PorterDuff.Mode.SRC_IN;
        this.f1084g = null;
        this.f1085h = 1.0f;
        this.i = 1.0f;
        this.f1087k = com.anythink.basead.exoplayer.k.p.f9259b;
        this.f1088l = 0.0f;
        this.f1089m = 0.0f;
        this.f1090n = 0;
        this.f1091o = 0;
        this.f1092p = Paint.Style.FILL_AND_STROKE;
        this.f1078a = fVar.f1078a;
        this.f1079b = fVar.f1079b;
        this.f1086j = fVar.f1086j;
        this.f1080c = fVar.f1080c;
        this.f1081d = fVar.f1081d;
        this.f1083f = fVar.f1083f;
        this.f1082e = fVar.f1082e;
        this.f1087k = fVar.f1087k;
        this.f1085h = fVar.f1085h;
        this.f1091o = fVar.f1091o;
        this.i = fVar.i;
        this.f1088l = fVar.f1088l;
        this.f1089m = fVar.f1089m;
        this.f1090n = fVar.f1090n;
        this.f1092p = fVar.f1092p;
        if (fVar.f1084g != null) {
            this.f1084g = new Rect(fVar.f1084g);
        }
    }
}
