package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cu7 {
    public final egc a;
    public final List b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final int f;

    public cu7(egc egcVar, List list) {
        egcVar.getClass();
        list.getClass();
        this.a = egcVar;
        this.b = list;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: bu7
            public final /* synthetic */ cu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        cu7 cu7Var = this.b;
                        return CollectionsKt.g0(cu7Var.a.getElements(), cu7Var.b);
                    case 1:
                        cu7 cu7Var2 = this.b;
                        return CollectionsKt.g0(cu7Var2.a.f(), cu7Var2.b);
                    default:
                        egc egcVar2 = this.b.a;
                        if (egcVar2 instanceof xeq) {
                            return new eyu(((xeq) egcVar2).b);
                        }
                        if ((egcVar2 instanceof km7) || Intrinsics.d(egcVar2, y4b.a)) {
                            return dyu.a;
                        }
                        b6e.s();
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: bu7
            public final /* synthetic */ cu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        cu7 cu7Var = this.b;
                        return CollectionsKt.g0(cu7Var.a.getElements(), cu7Var.b);
                    case 1:
                        cu7 cu7Var2 = this.b;
                        return CollectionsKt.g0(cu7Var2.a.f(), cu7Var2.b);
                    default:
                        egc egcVar2 = this.b.a;
                        if (egcVar2 instanceof xeq) {
                            return new eyu(((xeq) egcVar2).b);
                        }
                        if ((egcVar2 instanceof km7) || Intrinsics.d(egcVar2, y4b.a)) {
                            return dyu.a;
                        }
                        b6e.s();
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.e = btf.b(new Function0(this) { // from class: bu7
            public final /* synthetic */ cu7 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        cu7 cu7Var = this.b;
                        return CollectionsKt.g0(cu7Var.a.getElements(), cu7Var.b);
                    case 1:
                        cu7 cu7Var2 = this.b;
                        return CollectionsKt.g0(cu7Var2.a.f(), cu7Var2.b);
                    default:
                        egc egcVar2 = this.b.a;
                        if (egcVar2 instanceof xeq) {
                            return new eyu(((xeq) egcVar2).b);
                        }
                        if ((egcVar2 instanceof km7) || Intrinsics.d(egcVar2, y4b.a)) {
                            return dyu.a;
                        }
                        b6e.s();
                        return null;
                }
            }
        });
        this.f = list.size() + egcVar.getElements().size();
    }

    public static cu7 a(cu7 cu7Var, egc egcVar, List list, int i) {
        if ((i & 1) != 0) {
            egcVar = cu7Var.a;
        }
        if ((i & 2) != 0) {
            list = cu7Var.b;
        }
        cu7Var.getClass();
        egcVar.getClass();
        list.getClass();
        return new cu7(egcVar, list);
    }

    public final int b(int i) {
        egc egcVar = this.a;
        return Intrinsics.e(i, egcVar.getElements().size()) < 0 ? egcVar.d(i) : i;
    }

    public final int c(int i) {
        egc egcVar = this.a;
        return Intrinsics.e(i, egcVar.getElements().size()) < 0 ? egcVar.c(i) : i;
    }

    public final mwk d(int i) {
        if (!f(i)) {
            rj7.g("Queue does not contain element at position ".concat(ran.a(i)));
            return null;
        }
        egc egcVar = this.a;
        int size = egcVar.getElements().size();
        return Intrinsics.e(i, size) < 0 ? egcVar.e(i) : (mwk) this.b.get(i - size);
    }

    public final List e() {
        return (List) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu7)) {
            return false;
        }
        cu7 cu7Var = (cu7) obj;
        return Intrinsics.d(this.a, cu7Var.a) && Intrinsics.d(this.b, cu7Var.b);
    }

    public final boolean f(int i) {
        return i >= 0 && i < this.f;
    }

    public final boolean g(int i) {
        return i >= 0 && i < this.a.getElements().size();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.f("WaveQueue {fixedQueue size=", this.a.getElements().size(), this.b.size(), ", recommendedElements size=", "}");
    }
}
