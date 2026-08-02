package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fhb extends jhb {
    public final bns d;
    public final jhb e;
    public final jhb f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhb(bns bnsVar, jhb jhbVar, jhb jhbVar2, String str) {
        super(str);
        jhbVar.getClass();
        jhbVar2.getClass();
        str.getClass();
        this.d = bnsVar;
        this.e = jhbVar;
        this.f = jhbVar2;
        this.g = str;
        this.h = CollectionsKt.g0(jhbVar.c(), jhbVar2.c());
        this.i = CollectionsKt.g0(jhbVar.b(), jhbVar2.b());
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        Object t7oVar;
        jhb jhbVar = this.e;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = h4bVar.h(jhbVar);
            d(jhbVar.b);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (z7o.a(t7oVar) == null) {
            return t7oVar;
        }
        jhb jhbVar2 = this.f;
        Object h = h4bVar.h(jhbVar2);
        d(jhbVar2.b);
        return h;
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.i;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhb)) {
            return false;
        }
        fhb fhbVar = (fhb) obj;
        return Intrinsics.d(this.d, fhbVar.d) && Intrinsics.d(this.e, fhbVar.e) && Intrinsics.d(this.f, fhbVar.f) && Intrinsics.d(this.g, fhbVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.e + ' ' + this.d + ' ' + this.f + ')';
    }
}
