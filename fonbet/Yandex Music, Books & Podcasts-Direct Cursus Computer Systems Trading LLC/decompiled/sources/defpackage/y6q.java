package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y6q extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ a7q k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6q(a7q a7qVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = a7qVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new y6q(this.k, this.l, this.m, continuation, 0);
            case 1:
                return new y6q(this.k, this.l, this.m, continuation, 1);
            case 2:
                return new y6q(this.k, this.l, this.m, continuation, 2);
            default:
                return new y6q(this.k, this.l, this.m, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((y6q) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object putIfAbsent;
        Object putIfAbsent2;
        Object putIfAbsent3;
        be6 be6Var;
        Object putIfAbsent4;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                d18 d18Var = this.k.s;
                String str = this.l;
                d18Var.getClass();
                str.getClass();
                xol xolVar = (xol) d18Var.c;
                xolVar.getClass();
                ConcurrentHashMap concurrentHashMap = xolVar.l;
                Object obj2 = concurrentHashMap.get(str);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = hld.i(fwk.NEXT)))) != null) {
                    obj2 = putIfAbsent;
                }
                ((gm5) obj2).U(fwk.NEXT);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                d18 d18Var2 = this.k.s;
                String str2 = this.l;
                d18Var2.getClass();
                str2.getClass();
                xol xolVar2 = (xol) d18Var2.c;
                xolVar2.getClass();
                ConcurrentHashMap concurrentHashMap2 = xolVar2.l;
                Object obj3 = concurrentHashMap2.get(str2);
                if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(str2, (obj3 = hld.i(fwk.OTHER)))) != null) {
                    obj3 = putIfAbsent2;
                }
                ((gm5) obj3).U(fwk.OTHER);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                d18 d18Var3 = this.k.s;
                String str3 = this.l;
                d18Var3.getClass();
                str3.getClass();
                xol xolVar3 = (xol) d18Var3.c;
                xolVar3.getClass();
                ConcurrentHashMap concurrentHashMap3 = xolVar3.l;
                Object obj4 = concurrentHashMap3.get(str3);
                if (obj4 == null && (putIfAbsent3 = concurrentHashMap3.putIfAbsent(str3, (obj4 = hld.i(fwk.FROM_QUEUE)))) != null) {
                    obj4 = putIfAbsent3;
                }
                ((gm5) obj4).U(fwk.FROM_QUEUE);
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                d18 d18Var4 = this.k.s;
                String str4 = this.l;
                String str5 = this.m;
                d18Var4.getClass();
                str4.getClass();
                xol xolVar4 = (xol) d18Var4.c;
                xolVar4.getClass();
                ConcurrentHashMap concurrentHashMap4 = xolVar4.l;
                Object obj5 = concurrentHashMap4.get(str4);
                if (obj5 == null && (putIfAbsent4 = concurrentHashMap4.putIfAbsent(str4, (obj5 = hld.i(fwk.SKIPPED)))) != null) {
                    obj5 = putIfAbsent4;
                }
                ((gm5) obj5).U(fwk.SKIPPED);
                wol wolVar = xolVar4.e;
                if (wolVar != null && wolVar.c > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - wolVar.c;
                    boolean d = Intrinsics.d(xolVar4.f, wolVar.a);
                    t7g t7gVar = wolVar.a;
                    if (t7gVar instanceof ugl) {
                        be6Var = null;
                    } else if (!(t7gVar instanceof vgl)) {
                        b6e.s();
                        break;
                    } else {
                        be6Var = ((vgl) t7gVar).d;
                    }
                    String S = be6Var != null ? asq.S(be6Var) : null;
                    qdc qdcVar = (qdc) xolVar4.a.a.b;
                    mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                    p3i p3iVar = new p3i(450);
                    p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                    new jzn(elapsedRealtime, str5, S, d).d(p3iVar);
                    LinkedHashMap a = p3iVar.a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a.size()));
                    for (Map.Entry entry : a.entrySet()) {
                        linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                    }
                    mibVar.b("TRACK_IS_SKIPPED2", linkedHashMap);
                }
                break;
        }
        return Unit.a;
    }
}
