package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u7u implements n7q {
    public final m4q a;
    public final i5u b;
    public final i5u c;
    public final i5u d;
    public final long e;
    public final noh f;
    public final ArrayList g;
    public final List h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final gxc m;
    public final b3l n;

    public u7u(m4q m4qVar, i5u i5uVar, i5u i5uVar2, i5u i5uVar3, long j, noh nohVar, ArrayList arrayList, c5b c5bVar, int i, boolean z, boolean z2, String str, gxc gxcVar, b3l b3lVar) {
        nohVar.getClass();
        c5bVar.getClass();
        str.getClass();
        gxcVar.getClass();
        this.a = m4qVar;
        this.b = i5uVar;
        this.c = i5uVar2;
        this.d = i5uVar3;
        this.e = j;
        this.f = nohVar;
        this.g = arrayList;
        this.h = c5bVar;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = str;
        this.m = gxcVar;
        this.n = b3lVar;
    }

    @Override // defpackage.n7q
    public final noh a() {
        return this.f;
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return this.c;
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return this.n;
    }

    @Override // defpackage.n7q
    public final boolean d() {
        return false;
    }

    @Override // defpackage.n7q
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7u)) {
            return false;
        }
        u7u u7uVar = (u7u) obj;
        return this.a.equals(u7uVar.a) && Intrinsics.d(this.b, u7uVar.b) && this.c.equals(u7uVar.c) && Intrinsics.d(this.d, u7uVar.d) && this.e == u7uVar.e && Intrinsics.d(this.f, u7uVar.f) && this.g.equals(u7uVar.g) && Intrinsics.d(this.h, u7uVar.h) && this.i == u7uVar.i && this.j == u7uVar.j && this.k == u7uVar.k && Intrinsics.d(this.l, u7uVar.l) && Intrinsics.d(this.m, u7uVar.m) && this.n.equals(u7uVar.n);
    }

    @Override // defpackage.n7q
    public final h4q f() {
        return h4q.b;
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i5u i5uVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (i5uVar == null ? 0 : i5uVar.hashCode())) * 31)) * 31;
        i5u i5uVar2 = this.d;
        return this.n.hashCode() + ((this.m.hashCode() + k5r.c(k5r.e(k5r.e(f1d.a(this.i, k5r.d(dfi.b(this.g, (this.f.hashCode() + tlm.c(this.e, (hashCode2 + (i5uVar2 != null ? i5uVar2.hashCode() : 0)) * 31, 31)) * 31, 31), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClipRadioQueueState {previous=");
        sb.append(this.b);
        sb.append(", current=");
        sb.append(this.c);
        sb.append(", pending=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.i);
        sb.append(", prevPossible=");
        dfi.t(sb, this.j, ", skipPossible=", this.k, ", radioSessionId=");
        return su4.o(sb, this.l, " }");
    }
}
