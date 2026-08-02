package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ehb extends jhb {
    public final ans d;
    public final jhb e;
    public final jhb f;
    public final jhb g;
    public final String h;
    public final ArrayList i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehb(jhb jhbVar, jhb jhbVar2, jhb jhbVar3, String str) {
        super(str);
        jhbVar.getClass();
        jhbVar2.getClass();
        jhbVar3.getClass();
        str.getClass();
        this.d = ans.a;
        this.e = jhbVar;
        this.f = jhbVar2;
        this.g = jhbVar3;
        this.h = str;
        this.i = CollectionsKt.g0(CollectionsKt.g0(jhbVar.c(), jhbVar2.c()), jhbVar3.c());
        this.j = CollectionsKt.g0(CollectionsKt.g0(jhbVar.b(), jhbVar2.b()), jhbVar3.b());
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        ans ansVar = this.d;
        if (ansVar == null) {
            ghh.I(this.a, ansVar + " was incorrectly parsed as a ternary operator.", null);
            throw null;
        }
        jhb jhbVar = this.e;
        Object h = h4bVar.h(jhbVar);
        d(jhbVar.b);
        boolean z = h instanceof Boolean;
        jhb jhbVar2 = this.g;
        jhb jhbVar3 = this.f;
        if (z) {
            if (((Boolean) h).booleanValue()) {
                Object h2 = h4bVar.h(jhbVar3);
                d(jhbVar3.b);
                return h2;
            }
            Object h3 = h4bVar.h(jhbVar2);
            d(jhbVar2.b);
            return h3;
        }
        ghh.I(jhbVar + " ? " + jhbVar3 + " : " + jhbVar2, "Ternary must be called with a Boolean value as a condition.", null);
        throw null;
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.j;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehb)) {
            return false;
        }
        ehb ehbVar = (ehb) obj;
        return Intrinsics.d(this.d, ehbVar.d) && Intrinsics.d(this.e, ehbVar.e) && Intrinsics.d(this.f, ehbVar.f) && Intrinsics.d(this.g, ehbVar.g) && Intrinsics.d(this.h, ehbVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.e + ' ' + zms.a + ' ' + this.f + ' ' + yms.a + ' ' + this.g + ')';
    }
}
