package S0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public R.j f1105a = new i();

    /* renamed from: b, reason: collision with root package name */
    public R.j f1106b = new i();

    /* renamed from: c, reason: collision with root package name */
    public R.j f1107c = new i();

    /* renamed from: d, reason: collision with root package name */
    public R.j f1108d = new i();
    public c e = new a(RecyclerView.f2111C0);

    /* renamed from: f, reason: collision with root package name */
    public c f1109f = new a(RecyclerView.f2111C0);

    /* renamed from: g, reason: collision with root package name */
    public c f1110g = new a(RecyclerView.f2111C0);

    /* renamed from: h, reason: collision with root package name */
    public c f1111h = new a(RecyclerView.f2111C0);
    public e i = new e(0);
    public e j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f1112k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f1113l = new e(0);

    public static j a(Context context, int i, int i2, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0358a.f4432C);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            R.j q2 = R.j.q(i4);
            jVar.f1096a = q2;
            j.b(q2);
            jVar.e = c3;
            R.j q3 = R.j.q(i5);
            jVar.f1097b = q3;
            j.b(q3);
            jVar.f1100f = c4;
            R.j q4 = R.j.q(i6);
            jVar.f1098c = q4;
            j.b(q4);
            jVar.f1101g = c5;
            R.j q5 = R.j.q(i7);
            jVar.f1099d = q5;
            j.b(q5);
            jVar.f1102h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4455t, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z2 = this.f1113l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.i.getClass().equals(e.class) && this.f1112k.getClass().equals(e.class);
        float a2 = this.e.a(rectF);
        return z2 && ((this.f1109f.a(rectF) > a2 ? 1 : (this.f1109f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f1111h.a(rectF) > a2 ? 1 : (this.f1111h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f1110g.a(rectF) > a2 ? 1 : (this.f1110g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f1106b instanceof i) && (this.f1105a instanceof i) && (this.f1107c instanceof i) && (this.f1108d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f1096a = this.f1105a;
        jVar.f1097b = this.f1106b;
        jVar.f1098c = this.f1107c;
        jVar.f1099d = this.f1108d;
        jVar.e = this.e;
        jVar.f1100f = this.f1109f;
        jVar.f1101g = this.f1110g;
        jVar.f1102h = this.f1111h;
        jVar.i = this.i;
        jVar.j = this.j;
        jVar.f1103k = this.f1112k;
        jVar.f1104l = this.f1113l;
        return jVar;
    }
}
