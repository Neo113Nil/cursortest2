package defpackage;

import android.app.Application;
import com.yandex.plus2.sdk.widget.daily.internal.entry.DailyWidgetWorker;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class h87 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public e87 k;
    public int l;
    public final /* synthetic */ n87 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h87(n87 n87Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = n87Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h87(this.m, continuation, 0);
            default:
                return new h87(this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h87) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        if (r0 != r12) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (defpackage.ime.I(r1, r2, "Last app widget removed", r25) == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0055, code lost:
    
        if (r0 == r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0198, code lost:
    
        if (r2.h0(r3, r4, r1, r0, r25) != r12) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (defpackage.ime.I(r1, r2, "First app widget added", r25) == r12) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0138, code lost:
    
        if (r0 == r12) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g0;
        e87 e87Var;
        Object d;
        e87 e87Var2;
        Object g02;
        e87 e87Var3;
        Object d2;
        e87 e87Var4;
        Object j0;
        int i = this.j;
        n87 n87Var = this.m;
        nm6 nm6Var = nm6.a;
        switch (i) {
            case 0:
                int i2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(n87Var.o, 18);
                    this.l = 1;
                    g0 = zsd.g0(bcaVar, this);
                    break;
                } else if (i2 == 1) {
                    qgg.h0(obj);
                    g0 = obj;
                } else if (i2 == 2) {
                    e87Var = this.k;
                    qgg.h0(obj);
                    e87 e87Var5 = e87Var;
                    syb sybVar = n87Var.h;
                    String str = e87Var5.d;
                    String str2 = e87Var5.c;
                    z77 z77Var = e87Var5.b;
                    String str3 = n87Var.n;
                    str3.getClass();
                    this.k = e87Var5;
                    this.l = 3;
                    d = sybVar.d(str, str2, z77Var, str3, this);
                    if (d != nm6Var) {
                        e87Var2 = e87Var5;
                        r7o r7oVar = z7o.b;
                        if (d instanceof t7o) {
                        }
                        j7a j7aVar = (j7a) d;
                        cr crVar = n87Var.e;
                        String str4 = e87Var2.c;
                        if (j7aVar == null) {
                        }
                        if (j7aVar == null) {
                        }
                        z77 z77Var2 = e87Var2.b;
                        this.k = null;
                        this.l = 4;
                    }
                    break;
                } else if (i2 == 3) {
                    e87Var2 = this.k;
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                    r7o r7oVar2 = z7o.b;
                    if (d instanceof t7o) {
                        d = null;
                    }
                    j7a j7aVar2 = (j7a) d;
                    cr crVar2 = n87Var.e;
                    String str42 = e87Var2.c;
                    String str5 = j7aVar2 == null ? j7aVar2.a : null;
                    String str6 = j7aVar2 == null ? j7aVar2.b : null;
                    z77 z77Var22 = e87Var2.b;
                    this.k = null;
                    this.l = 4;
                    break;
                } else if (i2 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    Application application = n87Var.c.a;
                    msa msaVar = nsa.b;
                    long M = yd5.M(12, ssa.HOURS);
                    g4w d3 = g4w.d(application);
                    d3.getClass();
                    ssa ssaVar = ssa.MINUTES;
                    long s = nsa.s(M, ssaVar);
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    qkk qkkVar = new qkk(DailyWidgetWorker.class, s, timeUnit);
                    g2j g2jVar = g2j.a;
                    fa6 fa6Var = new fa6(new f1j(null), g2j.b, false, false, false, false, -1L, -1L, CollectionsKt.A0(new LinkedHashSet()));
                    ((Set) qkkVar.d).add("PLUS_DAILY_WIDGET_WORKER_TAG");
                    ((t4w) qkkVar.c).j = fa6Var;
                    bk2 bk2Var = bk2.a;
                    qkkVar.a = true;
                    t4w t4wVar = (t4w) qkkVar.c;
                    t4wVar.l = bk2Var;
                    String str7 = t4w.z;
                    t4wVar.m = yhn.f(60000L, 10000L, 18000000L);
                    d3.b("PLUS_DAILY_WIDGET_WORKER_TAG", mpb.a, (rkk) ((qkk) qkkVar.l(nsa.s(M, ssaVar), timeUnit)).a());
                    break;
                }
                e87Var = (e87) g0;
                ime imeVar = n87Var.f;
                z77 z77Var3 = e87Var.b;
                this.k = e87Var;
                this.l = 2;
                break;
            default:
                int i3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    bca bcaVar2 = new bca(n87Var.o, 18);
                    this.l = 1;
                    g02 = zsd.g0(bcaVar2, this);
                    break;
                } else if (i3 == 1) {
                    qgg.h0(obj);
                    g02 = obj;
                } else if (i3 == 2) {
                    e87Var3 = this.k;
                    qgg.h0(obj);
                    e87 e87Var6 = e87Var3;
                    syb sybVar2 = n87Var.h;
                    String str8 = e87Var6.d;
                    String str9 = e87Var6.c;
                    z77 z77Var4 = e87Var6.b;
                    String str10 = n87Var.n;
                    str10.getClass();
                    this.k = e87Var6;
                    this.l = 3;
                    d2 = sybVar2.d(str8, str9, z77Var4, str10, this);
                    if (d2 != nm6Var) {
                        e87Var4 = e87Var6;
                        r7o r7oVar3 = z7o.b;
                        if (d2 instanceof t7o) {
                        }
                        j7a j7aVar3 = (j7a) d2;
                        cr crVar3 = n87Var.e;
                        String str11 = e87Var4.c;
                        if (j7aVar3 == null) {
                        }
                        if (j7aVar3 == null) {
                        }
                        z77 z77Var5 = e87Var4.b;
                        this.k = null;
                        this.l = 4;
                        j0 = x97.y((tf6) crVar3.g, (a) crVar3.h, null, new r60(crVar3, str11, r16, r17, z77Var5, null, 1), 2).j0(this);
                        if (j0 != nm6Var) {
                        }
                    }
                    break;
                } else if (i3 == 3) {
                    e87Var4 = this.k;
                    qgg.h0(obj);
                    d2 = ((z7o) obj).a;
                    r7o r7oVar32 = z7o.b;
                    if (d2 instanceof t7o) {
                        d2 = null;
                    }
                    j7a j7aVar32 = (j7a) d2;
                    cr crVar32 = n87Var.e;
                    String str112 = e87Var4.c;
                    String str12 = j7aVar32 == null ? j7aVar32.a : null;
                    String str13 = j7aVar32 == null ? j7aVar32.b : null;
                    z77 z77Var52 = e87Var4.b;
                    this.k = null;
                    this.l = 4;
                    j0 = x97.y((tf6) crVar32.g, (a) crVar32.h, null, new r60(crVar32, str112, str12, str13, z77Var52, null, 1), 2).j0(this);
                    if (j0 != nm6Var) {
                        j0 = Unit.a;
                        break;
                    }
                } else if (i3 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    g4w d4 = g4w.d(n87Var.c.a);
                    d4.getClass();
                    ogp ogpVar = d4.b.m;
                    String concat = "CancelWorkByName_".concat("PLUS_DAILY_WIDGET_WORKER_TAG");
                    qhp qhpVar = d4.d.a;
                    qhpVar.getClass();
                    a4g.K(ogpVar, concat, qhpVar, new st3(d4, 0));
                    break;
                }
                e87Var3 = (e87) g02;
                ime imeVar2 = n87Var.f;
                z77 z77Var6 = e87Var3.b;
                this.k = e87Var3;
                this.l = 2;
                break;
        }
        return Unit.a;
    }
}
