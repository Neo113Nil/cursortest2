package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uek extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vek k;
    public final /* synthetic */ xgr l;
    public final /* synthetic */ long m;
    public final /* synthetic */ fzc n;
    public final /* synthetic */ String o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uek(vek vekVar, xgr xgrVar, long j, fzc fzcVar, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.k = vekVar;
        this.l = xgrVar;
        this.m = j;
        this.n = fzcVar;
        this.o = str;
        this.p = list;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        uek uekVar = new uek(this.k, this.l, this.m, this.n, this.o, this.p, continuation);
        uekVar.j = obj;
        return uekVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uek) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if ((r13 - r5) > 600000) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if ((r13 - r5) > 600000) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xgr xgrVar;
        Long l;
        String str;
        Object obj2;
        Integer num;
        xgr xgrVar2 = this.l;
        float f = xgrVar2.b;
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        String str2 = (String) lpiVar.a(wek.a);
        okp okpVar = null;
        if (str2 != null && (l = (Long) lpiVar.a(wek.b)) != null) {
            long longValue = l.longValue();
            Long l2 = (Long) lpiVar.a(wek.c);
            if (l2 != null) {
                long longValue2 = l2.longValue();
                String str3 = (String) lpiVar.a(wek.d);
                if (str3 != null && (str = (String) lpiVar.a(wek.e)) != null) {
                    Iterator it = xgr.t.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (str.equals(((xgr) obj2).a)) {
                            break;
                        }
                    }
                    xgr xgrVar3 = (xgr) obj2;
                    if (xgrVar3 != null && (num = (Integer) lpiVar.a(wek.f)) != null) {
                        okpVar = new okp(str2, longValue, longValue2, str3, xgrVar3, num.intValue());
                    }
                }
            }
        }
        fzc fzcVar = this.n;
        vek vekVar = this.k;
        if (okpVar != null) {
            long j = okpVar.c;
            int i = okpVar.f;
            xgr xgrVar4 = okpVar.e;
            if (24026391 == i && Intrinsics.d(fzcVar.a, okpVar.d)) {
                boolean z = xgrVar4.c;
                long j2 = this.m;
                if (z) {
                    if (!xgrVar2.c) {
                        if (!xgrVar2.d) {
                        }
                    }
                }
                if (f <= xgrVar4.b) {
                }
                okp okpVar2 = okpVar;
                xgrVar = okpVar2.e;
                float f2 = xgrVar.b;
                if (!xgrVar.c) {
                    long j3 = this.m;
                    if (f <= f2) {
                        okpVar2 = okp.a(okpVar2, 0L, j3, null, 59);
                    } else {
                        Iterator it2 = xgr.t.iterator();
                        while (it2.hasNext()) {
                            xgr xgrVar5 = (xgr) it2.next();
                            if (!xgrVar5.c) {
                                float f3 = xgrVar5.b;
                                if (f3 > f2 && f3 < f) {
                                    vekVar.c(xgrVar5, xgrVar, okpVar2.a, null, null);
                                    xgrVar = xgrVar5;
                                }
                            }
                        }
                        vekVar.c(xgrVar2, xgrVar, okpVar2.a, this.o, this.p);
                        okpVar2 = okp.a(okpVar2, j3, j3, xgrVar2, 41);
                    }
                }
                lpiVar.g(wek.a, okpVar2.a);
                lpiVar.g(wek.b, Long.valueOf(okpVar2.b));
                lpiVar.g(wek.c, Long.valueOf(okpVar2.c));
                lpiVar.g(wek.d, okpVar2.d);
                lpiVar.g(wek.e, okpVar2.e.a);
                lpiVar.g(wek.f, Integer.valueOf(okpVar2.f));
                return Unit.a;
            }
        }
        String str4 = fzcVar.a;
        String e = eta.e();
        xgr xgrVar6 = xgr.e;
        long j4 = this.m;
        okpVar = new okp(e, j4, j4, str4, xgrVar6, 24026391);
        vekVar.c(xgrVar6, null, e, null, null);
        okp okpVar22 = okpVar;
        xgrVar = okpVar22.e;
        float f22 = xgrVar.b;
        if (!xgrVar.c) {
        }
        lpiVar.g(wek.a, okpVar22.a);
        lpiVar.g(wek.b, Long.valueOf(okpVar22.b));
        lpiVar.g(wek.c, Long.valueOf(okpVar22.c));
        lpiVar.g(wek.d, okpVar22.d);
        lpiVar.g(wek.e, okpVar22.e.a);
        lpiVar.g(wek.f, Integer.valueOf(okpVar22.f));
        return Unit.a;
    }
}
