package G3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public X2.a f1127a = new i();

    /* renamed from: b, reason: collision with root package name */
    public X2.a f1128b = new i();

    /* renamed from: c, reason: collision with root package name */
    public X2.a f1129c = new i();

    /* renamed from: d, reason: collision with root package name */
    public X2.a f1130d = new i();

    /* renamed from: e, reason: collision with root package name */
    public c f1131e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f1132f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f1133g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f1134h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public e f1135j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f1136k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f1137l = new e(0);

    public static j a(Context context, int i, int i4, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i4 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i4);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC4742a.f39438v);
        try {
            int i6 = obtainStyledAttributes.getInt(0, 0);
            int i9 = obtainStyledAttributes.getInt(3, i6);
            int i10 = obtainStyledAttributes.getInt(4, i6);
            int i11 = obtainStyledAttributes.getInt(2, i6);
            int i12 = obtainStyledAttributes.getInt(1, i6);
            c c9 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c9);
            c c11 = c(obtainStyledAttributes, 9, c9);
            c c12 = c(obtainStyledAttributes, 7, c9);
            c c13 = c(obtainStyledAttributes, 6, c9);
            j jVar = new j();
            X2.a h3 = Z2.d.h(i9);
            jVar.f1116a = h3;
            j.b(h3);
            jVar.f1120e = c10;
            X2.a h9 = Z2.d.h(i10);
            jVar.f1117b = h9;
            j.b(h9);
            jVar.f1121f = c11;
            X2.a h10 = Z2.d.h(i11);
            jVar.f1118c = h10;
            j.b(h10);
            jVar.f1122g = c12;
            X2.a h11 = Z2.d.h(i12);
            jVar.f1119d = h11;
            j.b(h11);
            jVar.f1123h = c13;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i4) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39432p, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new h(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z6 = this.f1137l.getClass().equals(e.class) && this.f1135j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f1136k.getClass().equals(e.class);
        float a9 = this.f1131e.a(rectF);
        return z6 && ((this.f1132f.a(rectF) > a9 ? 1 : (this.f1132f.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f1134h.a(rectF) > a9 ? 1 : (this.f1134h.a(rectF) == a9 ? 0 : -1)) == 0 && (this.f1133g.a(rectF) > a9 ? 1 : (this.f1133g.a(rectF) == a9 ? 0 : -1)) == 0) && ((this.f1128b instanceof i) && (this.f1127a instanceof i) && (this.f1129c instanceof i) && (this.f1130d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f1116a = this.f1127a;
        jVar.f1117b = this.f1128b;
        jVar.f1118c = this.f1129c;
        jVar.f1119d = this.f1130d;
        jVar.f1120e = this.f1131e;
        jVar.f1121f = this.f1132f;
        jVar.f1122g = this.f1133g;
        jVar.f1123h = this.f1134h;
        jVar.i = this.i;
        jVar.f1124j = this.f1135j;
        jVar.f1125k = this.f1136k;
        jVar.f1126l = this.f1137l;
        return jVar;
    }
}
