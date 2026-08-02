package defpackage;

import java.util.Objects;
import ru.yandex.taxi.superapp.orders.models.ActionAccessibilityType;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes6.dex */
public final class xw {
    public final ActionType a;
    public final CharSequence b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final ActionAccessibilityType k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public xw(ww wwVar) {
        ActionType actionType = wwVar.a;
        this.a = actionType;
        this.b = wwVar.b;
        this.c = wwVar.c;
        this.d = wwVar.d;
        this.e = wwVar.e;
        this.f = wwVar.f;
        this.g = wwVar.g;
        this.i = wwVar.h;
        this.j = wwVar.i;
        this.k = wwVar.j;
        this.l = wwVar.k;
        this.m = wwVar.l;
        this.n = wwVar.m;
        this.o = wwVar.n;
        this.p = wwVar.o;
        this.h = actionType.getDrawableId();
    }

    public final ActionType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xw.class.equals(obj.getClass())) {
            return false;
        }
        xw xwVar = (xw) obj;
        return this.g == xwVar.g && this.h == xwVar.h && this.i == xwVar.i && this.j == xwVar.j && this.l == xwVar.l && this.m == xwVar.m && this.n == xwVar.n && this.o == xwVar.o && this.p == xwVar.p && this.a == xwVar.a && Objects.equals(this.b, xwVar.b) && Objects.equals(this.c, xwVar.c) && Objects.equals(this.d, xwVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, null, this.c, this.d, Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Boolean.valueOf(this.l), Boolean.TRUE, Boolean.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), Boolean.valueOf(this.p));
    }
}
