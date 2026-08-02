package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mzt extends ozt implements Iterable, j9f {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public mzt(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof mzt)) {
            mzt mztVar = (mzt) obj;
            return Intrinsics.d(this.a, mztVar.a) && this.b == mztVar.b && this.c == mztVar.c && this.d == mztVar.d && this.e == mztVar.e && this.f == mztVar.f && this.g == mztVar.g && this.h == mztVar.h && Intrinsics.d(this.i, mztVar.i) && Intrinsics.d(this.j, mztVar.j);
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + k5r.d(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(eta.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j7(this);
    }
}
