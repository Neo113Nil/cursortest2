package defpackage;

import android.content.SharedPreferences;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.plus.experiments.impl.cooldown.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class z62 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(Continuation continuation, klg klgVar, long j, klg klgVar2) {
        super(2, continuation);
        this.j = 2;
        this.l = klgVar;
        this.k = j;
        this.m = klgVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z62(this.k, (a72) this.l, (String) this.m, continuation, 0);
            case 1:
                return new z62(this.k, (klg) this.l, (Function2) this.m, continuation, 1);
            case 2:
                return new z62(continuation, (klg) this.l, this.k, (klg) this.m);
            case 3:
                z62 z62Var = new z62((wqn) this.l, (vqn) this.m, continuation);
                z62Var.k = ((Number) obj).longValue();
                return z62Var;
            default:
                z62 z62Var2 = new z62((c) this.m, this.k, continuation);
                z62Var2.l = obj;
                return z62Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((z62) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((z62) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((z62) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((z62) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((z62) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        boolean contains;
        Object t7oVar;
        boolean z = true;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                yfx yfxVar = ((a72) this.l).a;
                String str = (String) this.m;
                long j = this.k;
                str.getClass();
                xdr xdrVar = saa.a;
                String str2 = ((frt) yfxVar.c).c().a;
                str2.getClass();
                ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "update for " + str + " last use timestamp = " + j + "  for user " + str2, null);
                hb2 a = ((w62) yfxVar.b).a(str2);
                x62 x62Var = new x62(j);
                a.getClass();
                up6.F(a.a, false, true, new kc(27, x62Var, str));
                return Unit.a;
            case 1:
                long j2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar = (klg) this.l;
                    cvl f = klgVar.c.f(j2);
                    if (f == null) {
                        return null;
                    }
                    klgVar.b.getClass();
                    ArrayList a2 = cus.a(f);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (((Boolean) ((Function2) this.m).invoke(f, (mqs) next)).booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new t2m(((mqs) it2.next()).d(), null));
                    }
                    rrl rrlVar = new rrl(f, arrayList2, arrayList);
                    if (!ivf.I(f)) {
                        if (arrayList2.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar;
                } catch (IllegalStateException e) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(dfi.d(j2, "Failed to get playlist databaseId: "), e));
                    return null;
                }
            case 2:
                long j3 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    klg klgVar2 = (klg) this.l;
                    cvl f2 = klgVar2.c.f(j3);
                    if (f2 == null) {
                        return null;
                    }
                    klgVar2.b.getClass();
                    ArrayList a3 = cus.a(f2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = a3.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        mqs mqsVar = (mqs) next2;
                        if (((Boolean) ((klg) this.m).g.invoke(f2, mqsVar)).booleanValue()) {
                            if (mqsVar == null) {
                                Assertions.throwOrSkip$default(new FailedAssertionException("PermanentCachedTrackPredicate: track is null"), null, 2, null);
                                contains = false;
                            } else {
                                l18 l18Var = l18.b;
                                bdt I = hag.I(uaa.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                            }
                            if (contains) {
                                arrayList3.add(next2);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new t2m(((mqs) it4.next()).d(), null));
                    }
                    rrl rrlVar2 = new rrl(f2, arrayList4, arrayList3);
                    if (!ivf.I(f2)) {
                        if (arrayList4.isEmpty()) {
                            return null;
                        }
                    }
                    return rrlVar2;
                } catch (IllegalStateException e2) {
                    Assertions.throwOrSkip("LocalPlaylistRepository", new FailedAssertionException(dfi.d(j3, "Failed to get playlist databaseId: "), e2));
                    return null;
                }
            case 3:
                long j4 = this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                long j5 = ((wqn) this.l).a;
                vqn vqnVar = (vqn) this.m;
                if (j4 != j5) {
                    vqnVar.a = 5;
                } else {
                    int i = vqnVar.a;
                    vqnVar.a = i - 1;
                    if (i <= 0) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                c cVar = (c) this.m;
                long j6 = this.k;
                try {
                    r7o r7oVar = z7o.b;
                    SharedPreferences.Editor edit = ((SharedPreferences) cVar.e).edit();
                    msa msaVar = nsa.b;
                    edit.putLong("RECHARGE_END", nsa.s(j6, ssa.SECONDS));
                    edit.commit();
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                return new z7o(t7oVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(wqn wqnVar, vqn vqnVar, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = wqnVar;
        this.m = vqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(c cVar, long j, Continuation continuation) {
        super(2, continuation);
        this.j = 4;
        this.m = cVar;
        this.k = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(long j, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.k = j;
    }
}
