package ru.yandex.taxi.persuggest.source;

import android.os.SystemClock;
import defpackage.bhq0;
import defpackage.br3;
import defpackage.bvf0;
import defpackage.chq0;
import defpackage.co40;
import defpackage.d2t;
import defpackage.dhq0;
import defpackage.dr3;
import defpackage.evu0;
import defpackage.fyc;
import defpackage.gr3;
import defpackage.gwk0;
import defpackage.hr3;
import defpackage.i4v0;
import defpackage.ir3;
import defpackage.k4v0;
import defpackage.m6r;
import defpackage.ms2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o9j0;
import defpackage.os2;
import defpackage.p0t;
import defpackage.p820;
import defpackage.p9j0;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.q9j0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u6r;
import defpackage.udq0;
import defpackage.v03;
import defpackage.v6r;
import defpackage.v8e;
import defpackage.wls;
import defpackage.xne;
import defpackage.xv21;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.persuggest.analytics.SelectedLocationChangedAnalytics$AppLaunchType;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;
import ru.yandex.taxi.persuggest.repository.RequestedSourcePointInfoRepositoryImpl;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv6r;", "<anonymous>", "(Ltse;)Lv6r;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2", f = "FinalSuggestRepositoryImpl.kt", l = {103, 239}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class FinalSuggestRepositoryImpl$request$2 extends SuspendLambda implements wls {
    final /* synthetic */ Action $action;
    final /* synthetic */ i4v0 $analyticsData;
    final /* synthetic */ d2t $params;
    final /* synthetic */ Float $zoom;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalSuggestRepositoryImpl$request$2(d2t d2tVar, c cVar, Float f, Action action, i4v0 i4v0Var, Continuation continuation) {
        super(2, continuation);
        this.$params = d2tVar;
        this.this$0 = cVar;
        this.$zoom = f;
        this.$action = action;
        this.$analyticsData = i4v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FinalSuggestRepositoryImpl$request$2(this.$params, this.this$0, this.$zoom, this.$action, this.$analyticsData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FinalSuggestRepositoryImpl$request$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x022c, code lost:
    
        if (r6 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0254, code lost:
    
        if (r2 == null) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0383  */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v46, types: [p0t] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.util.concurrent.ConcurrentHashMap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        a aVar;
        boolean z;
        o9j0 o9j0Var;
        Object b;
        p820 p820Var;
        int i;
        v03 v03Var;
        String str2;
        q6r q6rVar;
        v03 v03Var2;
        q0t q0tVar;
        fyc b2;
        Object n;
        v03 v03Var3;
        int i2;
        o9j0 o9j0Var2;
        ArrayList arrayList;
        co40 co40Var;
        boolean z2;
        Iterator it;
        String str3;
        chq0 chq0Var;
        ?? r1;
        Throwable th;
        Pair pair;
        i4v0 i4v0Var;
        i4v0 i4v0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        try {
            if (i3 == 0) {
                kotlin.b.b(obj);
                d2t d2tVar = this.$params;
                o9j0 o9j0Var3 = d2tVar.a;
                p820 p820Var2 = d2tVar.b;
                ms2 ms2Var = this.this$0.f;
                Milestone milestone = Milestone.Suggest;
                ms2Var.getClass();
                ((os2) ms2Var).d(milestone, SystemClock.elapsedRealtime());
                c cVar = this.this$0;
                a aVar2 = cVar.e;
                String str4 = o9j0Var3.h;
                Float f = this.$zoom;
                Action action = this.$action;
                LinkedHashMap a = cVar.j.a();
                f fVar = (f) this.this$0.k;
                if (fVar.b) {
                    fVar.b = false;
                    str = FinalSuggestScreen.DEEPLINK.getValue();
                } else {
                    str = fVar.a;
                }
                List list = o9j0Var3.k;
                if (o9j0Var3.a == RoutePointType.POINT_A) {
                    aVar = aVar2;
                    z = true;
                } else {
                    aVar = aVar2;
                    z = false;
                }
                this.L$0 = o9j0Var3;
                this.L$1 = p820Var2;
                this.label = 1;
                o9j0Var = o9j0Var3;
                b = a.b(aVar, str4, f, action, a, str, list, null, z, this, 64);
                if (b != coroutineSingletons) {
                    p820Var = p820Var2;
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.I$0;
                r1 = (p0t) this.L$4;
                v03Var3 = (v03) this.L$2;
                o9j0Var2 = (o9j0) this.L$0;
                try {
                    kotlin.b.b(obj);
                    q0tVar = r1;
                    n = obj;
                    pair = (Pair) n;
                    this.this$0.o.remove(q0tVar);
                    u6r u6rVar = (u6r) pair.getFirst();
                    if (((Boolean) pair.getSecond()).booleanValue()) {
                        this.this$0.d(o9j0Var2.a, u6rVar);
                    }
                    if (i2 != 0) {
                        ir3 ir3Var = this.this$0.n;
                        synchronized (ir3Var) {
                            try {
                                if (((dr3) ir3Var.a).a()) {
                                    br3 br3Var = (br3) ((dr3) ir3Var.a).a.a.getValue();
                                    if (br3Var == null) {
                                        br3Var = br3.d;
                                    }
                                    ir3Var.f = br3Var.b();
                                    ir3Var.g = br3Var.a();
                                    int i4 = hr3.a[ir3Var.c.ordinal()];
                                    if (i4 == 1 || i4 == 2) {
                                        ir3Var.d = SystemClock.elapsedRealtime();
                                        ir3Var.c = AutoFsSessionPhase.WarmUp;
                                        v8e v8eVar = ir3Var.i;
                                        if (v8eVar != null) {
                                            v8eVar.j();
                                        }
                                        ir3Var.i = null;
                                        long j = ir3Var.f;
                                        if (j > 0) {
                                            ir3Var.i = ir3Var.b.a(j, new gr3(ir3Var, 0));
                                        }
                                    } else if (i4 != 3 && i4 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c cVar2 = this.this$0;
                    i4v0Var = this.$analyticsData;
                    Action action2 = this.$action;
                    zzs zzsVar = v03Var3.k;
                    if (i4v0Var != null) {
                        cVar2.l.getClass();
                        i4v0Var = k4v0.a(action2, zzsVar, u6rVar);
                    } else {
                        cVar2.getClass();
                        if (i4v0Var.b == null) {
                            String str5 = i4v0Var.a;
                            String str6 = i4v0Var.c;
                            if (str6 == null) {
                                str6 = u6rVar.n;
                            }
                            i4v0Var2 = new i4v0(str5, zzsVar, str6, i4v0Var.d, i4v0Var.e, i4v0Var.f, i4v0Var.g, i4v0Var.h, i4v0Var.i);
                            return new v6r(u6rVar, i4v0Var2, this.$action, o9j0Var2.i, o9j0Var2.j);
                        }
                    }
                    i4v0Var2 = i4v0Var;
                    return new v6r(u6rVar, i4v0Var2, this.$action, o9j0Var2.i, o9j0Var2.j);
                } catch (Throwable th2) {
                    th = th2;
                    this.this$0.o.remove(r1);
                    throw th;
                }
            }
            p820 p820Var3 = (p820) this.L$1;
            o9j0 o9j0Var4 = (o9j0) this.L$0;
            kotlin.b.b(obj);
            p820Var = p820Var3;
            o9j0Var = o9j0Var4;
            b = obj;
            FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1 finalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1 = new FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1(EmptyCoroutineContext.a, null, b2, this.this$0, q6rVar, p820Var, q0tVar);
            this.L$0 = o9j0Var;
            this.L$1 = null;
            this.L$2 = v03Var2;
            this.L$3 = null;
            this.L$4 = q0tVar;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = i;
            this.label = 2;
            n = bvf0.n(finalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1, this);
            if (n != coroutineSingletons) {
                v03Var3 = v03Var2;
                i2 = i;
                o9j0Var2 = o9j0Var;
                pair = (Pair) n;
                this.this$0.o.remove(q0tVar);
                u6r u6rVar2 = (u6r) pair.getFirst();
                if (((Boolean) pair.getSecond()).booleanValue()) {
                }
                if (i2 != 0) {
                }
                c cVar22 = this.this$0;
                i4v0Var = this.$analyticsData;
                Action action22 = this.$action;
                zzs zzsVar2 = v03Var3.k;
                if (i4v0Var != null) {
                }
                i4v0Var2 = i4v0Var;
                return new v6r(u6rVar2, i4v0Var2, this.$action, o9j0Var2.i, o9j0Var2.j);
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            r1 = q0tVar;
            this.this$0.o.remove(r1);
            throw th;
        }
        v03 v03Var4 = (v03) b;
        p820Var.k = v03Var4.f;
        i = o9j0Var.a == RoutePointType.POINT_A ? 1 : 0;
        if (i != 0) {
            m6r m6rVar = this.this$0.i;
            Action action3 = this.$action;
            ru.yandex.taxi.perf.b bVar = m6rVar.b;
            String c = bVar.c();
            co40 co40Var2 = m6rVar.a;
            String str7 = p820Var.b;
            String str8 = p820Var.g;
            if (str8 == null) {
                str8 = action3.getTag().a;
            }
            String str9 = str8;
            String b3 = o9j0Var.b.b();
            boolean z3 = o9j0Var.d;
            boolean z4 = o9j0Var.e;
            String str10 = p820Var.f.a;
            dhq0 dhq0Var = new dhq0(c);
            SelectedLocationChangedAnalytics$AppLaunchType valueOf = SelectedLocationChangedAnalytics$AppLaunchType.valueOf(bVar.b().name());
            Long l = o9j0Var.b.e;
            String a2 = l != null ? xv21.a(new Date(l.longValue())) : null;
            zzs zzsVar3 = v03Var4.k;
            String b4 = zzsVar3 != null ? zzsVar3.b() : null;
            zzs zzsVar4 = v03Var4.k;
            String str11 = zzsVar4 != null ? zzsVar4.d : null;
            List list2 = v03Var4.c;
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    xne xneVar = (xne) it2.next();
                    String str12 = xneVar.a;
                    v03 v03Var5 = v03Var4;
                    String lowerCase = str12 != null ? str12.toLowerCase(Locale.ROOT) : null;
                    zzs zzsVar5 = xneVar.b;
                    if (zzsVar5 != null) {
                        co40Var = co40Var2;
                        z2 = z3;
                        it = it2;
                        str3 = c;
                        chq0Var = new chq0(zzsVar5.a, zzsVar5.b);
                    } else {
                        co40Var = co40Var2;
                        z2 = z3;
                        it = it2;
                        str3 = c;
                        chq0Var = null;
                    }
                    arrayList2.add(new bhq0(lowerCase, chq0Var, xneVar.c, xneVar.d, xneVar.e, xneVar.f, xneVar.h));
                    v03Var4 = v03Var5;
                    co40Var2 = co40Var;
                    it2 = it;
                    z3 = z2;
                    c = str3;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            v03Var = v03Var4;
            String str13 = c;
            co40Var2.a(str7, str9, b3, z3, z4, str10, dhq0Var, valueOf, str13, str13, a2, b4, str11, arrayList);
            this.this$0.g.a.q(System.currentTimeMillis(), "source_point_changed_time");
        } else {
            v03Var = v03Var4;
        }
        Action action4 = this.$action;
        c cVar3 = this.this$0;
        String str14 = o9j0Var.g;
        if (str14 == null || o9j0Var.a != RoutePointType.POINT_B || evu0.J(str14)) {
            str14 = null;
        }
        zzs zzsVar6 = o9j0Var.b;
        Long l2 = zzsVar6.e;
        String a3 = l2 != null ? xv21.a(new Date(l2.longValue())) : null;
        String str15 = o9j0Var.b.d;
        LocationProvider G = str15 != null ? udq0.G(str15) : null;
        PositionInitAction positionInitAction = o9j0Var.j;
        String str16 = o9j0Var.c;
        if (str14 != null) {
            str2 = action4 == Action.FINALIZE ? str14 : null;
        }
        str2 = (String) cVar3.c.a.get(o9j0Var.a.getType());
        String str17 = str2;
        boolean z5 = o9j0Var.d;
        String type = o9j0Var.a.getType();
        if (str14 != null) {
            if (action4 != Action.PIN_DROP) {
                str14 = null;
            }
        }
        str14 = o9j0Var.f;
        v03Var2 = v03Var;
        q6rVar = new q6r(action4, zzsVar6, a3, G, positionInitAction, v03Var2, str16, str17, z5, type, str14, o9j0Var.e, null);
        q0tVar = p820Var.f;
        b2 = gwk0.b();
        this.this$0.o.put(q0tVar, b2);
        if (i != 0) {
            q9j0 q9j0Var = this.this$0.h;
            d2t d2tVar2 = this.$params;
            RequestedSourcePointInfoRepositoryImpl requestedSourcePointInfoRepositoryImpl = (RequestedSourcePointInfoRepositoryImpl) q9j0Var;
            requestedSourcePointInfoRepositoryImpl.getClass();
            p9j0 p9j0Var = new p9j0(d2tVar2, q6rVar);
            requestedSourcePointInfoRepositoryImpl.c = d2tVar2.b.f;
            requestedSourcePointInfoRepositoryImpl.a.g(p9j0Var);
        }
    }
}
