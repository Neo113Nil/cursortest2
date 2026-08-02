package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class u79 extends ViewGroup.MarginLayoutParams {
    public static final /* synthetic */ s9f[] i;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public final n7b e;
    public final n7b f;
    public int g;
    public int h;

    static {
        opi opiVar = new opi(u79.class, "columnSpan", "getColumnSpan()I", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar, new opi(u79.class, "rowSpan", "getRowSpan()I", 0)};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u79(u79 u79Var) {
        super((ViewGroup.MarginLayoutParams) u79Var);
        this.a = 8388659;
        n7b n7bVar = new n7b(27);
        this.e = n7bVar;
        n7b n7bVar2 = new n7b(27);
        this.f = n7bVar2;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.a = u79Var.a;
        this.b = u79Var.b;
        this.c = u79Var.c;
        this.d = u79Var.d;
        int a = u79Var.a();
        s9f[] s9fVarArr = i;
        s9f s9fVar = s9fVarArr[0];
        Integer valueOf = Integer.valueOf(a);
        n7bVar.a = valueOf.doubleValue() <= 0.0d ? r1 : valueOf;
        int c = u79Var.c();
        s9f s9fVar2 = s9fVarArr[1];
        Integer valueOf2 = Integer.valueOf(c);
        n7bVar2.a = valueOf2.doubleValue() > 0.0d ? valueOf2 : 1;
        this.g = u79Var.g;
        this.h = u79Var.h;
    }

    public final int a() {
        s9f s9fVar = i[0];
        return ((Number) this.e.a).intValue();
    }

    public final int b() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final int c() {
        s9f s9fVar = i[1];
        return ((Number) this.f.a).intValue();
    }

    public final int d() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u79.class != obj.getClass()) {
            return false;
        }
        u79 u79Var = (u79) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) u79Var).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) u79Var).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) u79Var).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) u79Var).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) u79Var).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) u79Var).bottomMargin && this.a == u79Var.a && this.b == u79Var.b && a() == u79Var.a() && c() == u79Var.c() && this.c == u79Var.c && this.d == u79Var.d && this.g == u79Var.g && this.h == u79Var.h;
    }

    public final int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.d) + ((Float.floatToIntBits(this.c) + ((c() + ((a() + (((((super.hashCode() * 31) + this.a) * 31) + (this.b ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i2 = this.g;
        if (i2 == Integer.MAX_VALUE) {
            i2 = 0;
        }
        int i3 = (floatToIntBits + i2) * 31;
        int i4 = this.h;
        return i3 + (i4 != Integer.MAX_VALUE ? i4 : 0);
    }

    public u79(int i2, int i3) {
        super(i2, i3);
        this.a = 8388659;
        this.e = new n7b(27);
        this.f = new n7b(27);
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    public u79(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 8388659;
        this.e = new n7b(27);
        this.f = new n7b(27);
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    public u79(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 8388659;
        this.e = new n7b(27);
        this.f = new n7b(27);
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    public u79(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 8388659;
        this.e = new n7b(27);
        this.f = new n7b(27);
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }
}
