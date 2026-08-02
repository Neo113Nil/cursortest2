package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rgi implements qep {
    public final woi a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final ydp f;

    public rgi(woi woiVar, List list, int i, int i2, boolean z, ydp ydpVar) {
        this.a = woiVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = ydpVar;
        if (list.size() > 1) {
            return;
        }
        vme.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static void n(yoi yoiVar, ydp ydpVar, idp idpVar, int i, int i2) {
        ydp ydpVar2;
        if (ydpVar.c) {
            ydpVar2 = new ydp(idpVar.a(i2), idpVar.a(i), i2 > i);
        } else {
            ydpVar2 = new ydp(idpVar.a(i), idpVar.a(i2), i > i2);
        }
        if (i > i2) {
            vme.c("minOffset should be less than or equal to maxOffset: " + ydpVar2);
        }
        long j = idpVar.a;
        int c = yoiVar.c(j);
        Object[] objArr = yoiVar.c;
        Object obj = objArr[c];
        yoiVar.b[c] = j;
        objArr[c] = ydpVar2;
    }

    @Override // defpackage.qep
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.qep
    public final idp b() {
        return this.e ? j() : i();
    }

    @Override // defpackage.qep
    public final idp c() {
        return e() == iu6.a ? i() : j();
    }

    @Override // defpackage.qep
    public final int d() {
        return this.d;
    }

    @Override // defpackage.qep
    public final iu6 e() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return iu6.b;
        }
        if (i > i2) {
            return iu6.a;
        }
        return ((idp) this.b.get(i / 2)).b();
    }

    @Override // defpackage.qep
    public final int f() {
        return this.b.size();
    }

    @Override // defpackage.qep
    public final void g(Function1 function1) {
        int o = o(c().a);
        int o2 = o((e() == iu6.a ? j() : i()).a);
        int i = o + 1;
        if (i >= o2) {
            return;
        }
        while (i < o2) {
            function1.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // defpackage.qep
    public final ydp h() {
        return this.f;
    }

    @Override // defpackage.qep
    public final idp i() {
        return (idp) this.b.get(p(this.d, false));
    }

    @Override // defpackage.qep
    public final idp j() {
        return (idp) this.b.get(p(this.c, true));
    }

    @Override // defpackage.qep
    public final int k() {
        return this.c;
    }

    @Override // defpackage.qep
    public final boolean l(qep qepVar) {
        if (this.f != null && qepVar != null && (qepVar instanceof rgi) && this.e == qepVar.a() && this.c == qepVar.k() && this.d == qepVar.d()) {
            List list = ((rgi) qepVar).b;
            List list2 = this.b;
            if (list2.size() == list.size()) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    idp idpVar = (idp) list2.get(i);
                    idp idpVar2 = (idp) list.get(i);
                    if (idpVar.a != idpVar2.a || idpVar.c != idpVar2.c || idpVar.d != idpVar2.d) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qep
    public final yoi m(ydp ydpVar) {
        xdp xdpVar = ydpVar.a;
        boolean z = ydpVar.c;
        long j = xdpVar.c;
        int i = xdpVar.b;
        xdp xdpVar2 = ydpVar.b;
        long j2 = xdpVar2.c;
        int i2 = xdpVar2.b;
        if (j != j2) {
            yoi yoiVar = yug.a;
            yoi yoiVar2 = new yoi();
            n(yoiVar2, ydpVar, c(), (z ? xdpVar2 : xdpVar).b, c().f.a.a.b.length());
            g(new afg(this, yoiVar2, ydpVar));
            if (!z) {
                xdpVar = xdpVar2;
            }
            n(yoiVar2, ydpVar, e() == iu6.a ? j() : i(), 0, xdpVar.b);
            return yoiVar2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            vme.c("unexpectedly miss-crossed selection: " + ydpVar);
        }
        long j3 = xdpVar.c;
        yoi yoiVar3 = yug.a;
        yoi yoiVar4 = new yoi();
        yoiVar4.h(j3, ydpVar);
        return yoiVar4;
    }

    public final int o(long j) {
        try {
            return this.a.c(j);
        } catch (NoSuchElementException e) {
            b6e.o(dfi.d(j, "Invalid selectableId: "), e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(int i, boolean z) {
        int ordinal = e().ordinal();
        int i2 = z;
        if (ordinal == 0) {
            if (z != 0) {
                i2 = 0;
                return (i - (i2 ^ 1)) / 2;
            }
            i2 = 1;
            return (i - (i2 ^ 1)) / 2;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                return 0;
            }
            i2 = 1;
        }
        return (i - (i2 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((this.c + 1) / f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / f);
        sb.append(", crossed=");
        sb.append(e());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            idp idpVar = (idp) list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(idpVar);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
