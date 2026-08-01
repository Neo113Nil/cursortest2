package E3;

import L3.F;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import k3.AbstractC4632a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public A8.b f785a = new i();

    /* renamed from: b, reason: collision with root package name */
    public A8.b f786b = new i();

    /* renamed from: c, reason: collision with root package name */
    public A8.b f787c = new i();

    /* renamed from: d, reason: collision with root package name */
    public A8.b f788d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f789e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f790f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f791g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f792h = new a(0.0f);
    public e i = new e();

    /* renamed from: j, reason: collision with root package name */
    public e f793j = new e();

    /* renamed from: k, reason: collision with root package name */
    public e f794k = new e();

    /* renamed from: l, reason: collision with root package name */
    public e f795l = new e();

    public static j a(Context context, int i, int i6, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i6 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i6);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC4632a.f38649v);
        try {
            int i9 = obtainStyledAttributes.getInt(0, 0);
            int i10 = obtainStyledAttributes.getInt(3, i9);
            int i11 = obtainStyledAttributes.getInt(4, i9);
            int i12 = obtainStyledAttributes.getInt(2, i9);
            int i13 = obtainStyledAttributes.getInt(1, i9);
            c c9 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c9);
            c c11 = c(obtainStyledAttributes, 9, c9);
            c c12 = c(obtainStyledAttributes, 7, c9);
            c c13 = c(obtainStyledAttributes, 6, c9);
            j jVar = new j();
            A8.b j6 = F.j(i10);
            jVar.f774a = j6;
            j.b(j6);
            jVar.f778e = c10;
            A8.b j9 = F.j(i11);
            jVar.f775b = j9;
            j.b(j9);
            jVar.f779f = c11;
            A8.b j10 = F.j(i12);
            jVar.f776c = j10;
            j.b(j10);
            jVar.f780g = c12;
            A8.b j11 = F.j(i13);
            jVar.f777d = j11;
            j.b(j11);
            jVar.f781h = c13;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i6) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38643p, i, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i6 = peekValue.type;
            if (i6 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i6 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z3 = this.f795l.getClass().equals(e.class) && this.f793j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f794k.getClass().equals(e.class);
        float a9 = this.f789e.a(rectF);
        return z3 && ((this.f790f.a(rectF) > a9 ? 1 : (this.f790f.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f792h.a(rectF) > a9 ? 1 : (this.f792h.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f791g.a(rectF) > a9 ? 1 : (this.f791g.a(rectF) == a9 ? 0 : -1)) == 0) && ((this.f786b instanceof i) && (this.f785a instanceof i) && (this.f787c instanceof i) && (this.f788d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f774a = this.f785a;
        jVar.f775b = this.f786b;
        jVar.f776c = this.f787c;
        jVar.f777d = this.f788d;
        jVar.f778e = this.f789e;
        jVar.f779f = this.f790f;
        jVar.f780g = this.f791g;
        jVar.f781h = this.f792h;
        jVar.i = this.i;
        jVar.f782j = this.f793j;
        jVar.f783k = this.f794k;
        jVar.f784l = this.f795l;
        return jVar;
    }
}
