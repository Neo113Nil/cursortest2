package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class yo4 extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final rmb e;
    public final tp4 f;
    public final vo4 g;
    public final xdr h;
    public final jyr i;

    public yo4(s63 s63Var, rmb rmbVar, tp4 tp4Var) {
        drf drfVar = s63Var.a;
        this.d = bow.s((uvn) drfVar);
        this.e = rmbVar;
        this.f = tp4Var;
        vo4 vo4Var = (vo4) drfVar;
        this.g = vo4Var;
        String str = vo4Var.d;
        this.h = ydr.a(new jgt(true));
        this.i = btf.b(new ym4(6));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof wgt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b9, code lost:
    
        if (r25.d.a(r2, r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bb, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0062, code lost:
    
        if (r2 == r4) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        xo4 xo4Var;
        int i;
        rj6 rj6Var;
        String str;
        String e;
        boolean z2 = z;
        if (cg6Var instanceof xo4) {
            xo4Var = (xo4) cg6Var;
            int i2 = xo4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xo4Var.m = i2 - Integer.MIN_VALUE;
                Object obj = xo4Var.k;
                nm6 nm6Var = nm6.a;
                i = xo4Var.m;
                xdr xdrVar = this.h;
                vo4 vo4Var = this.g;
                Throwable th = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        String str2 = vo4Var.d;
                        jgt jgtVar = new jgt(true);
                        xdrVar.getClass();
                        xdrVar.m(null, jgtVar);
                    }
                    xo4Var.j = z2;
                    xo4Var.m = 1;
                    obj = this.f.a(vo4Var, z2, xo4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(vo4Var);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = xo4Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        String str3 = vo4Var.d;
                        jgt jgtVar2 = new jgt(false);
                        xdrVar.getClass();
                        xdrVar.m(null, jgtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(vo4Var);
                }
                ap4 ap4Var = (ap4) ((qj6) rj6Var).a;
                ArrayList arrayList = ap4Var.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                int i3 = 0;
                for (Object obj2 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        Throwable th2 = th;
                        u75.n();
                        throw th2;
                    }
                    bp4 bp4Var = (bp4) obj2;
                    cp4 cp4Var = (cp4) this.i.getValue();
                    cp4Var.getClass();
                    bp4Var.getClass();
                    Throwable th3 = th;
                    List list = bp4Var.f;
                    Object X = list != null ? CollectionsKt.X(list, ", ", null, null, new sm4(5), 30) : th3;
                    String str4 = X == null ? "" : X;
                    Long l = bp4Var.d;
                    str = "";
                    String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(l.longValue() / 60), Long.valueOf(l.longValue() % 60)}, 2));
                    skr skrVar = (skr) cp4Var.a.getValue();
                    msa msaVar = nsa.b;
                    String d = skrVar.d(R.string.player_duration_description, saf.r0(yd5.N(l.longValue(), ssa.SECONDS)));
                    String str5 = bp4Var.g;
                    u9b u9bVar = bp4Var.a;
                    String str6 = (u9bVar == null || (e = u9bVar.e(720, WebPath$Storage.AVATARS)) == null) ? str : e;
                    String str7 = bp4Var.e;
                    str = str7 != null ? str7 : "";
                    Boolean bool = bp4Var.b;
                    arrayList2.add(new z9u(i3, str5, null, str6, str, str4, format, bp4Var.h, bool != null ? bool.booleanValue() : false, d));
                    th = th3;
                    i3 = i4;
                }
                Throwable th4 = th;
                boolean isEmpty = arrayList2.isEmpty();
                if (!isEmpty) {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    wgt wgtVar = new wgt(vo4Var.d, arrayList2);
                    xdrVar.getClass();
                    xdrVar.m(th4, wgtVar);
                } else if (!n()) {
                    String str8 = vo4Var.d;
                    jgt jgtVar3 = new jgt(false);
                    xdrVar.getClass();
                    xdrVar.m(th4, jgtVar3);
                }
                int size = arrayList2.size();
                p43 p43Var = ap4Var.b;
                this.e.g(size, p43Var != null ? p43Var.a : null);
                boolean isEmpty2 = arrayList2.isEmpty();
                xo4Var.j = z2;
                xo4Var.m = 2;
            }
        }
        xo4Var = new xo4(this, cg6Var);
        Object obj3 = xo4Var.k;
        nm6 nm6Var2 = nm6.a;
        i = xo4Var.m;
        xdr xdrVar2 = this.h;
        vo4 vo4Var2 = this.g;
        Throwable th5 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }
}
