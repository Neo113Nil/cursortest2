package ru.yandex.taxi.promotions.factory;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.ah00;
import defpackage.d5v0;
import defpackage.e5v0;
import defpackage.el00;
import defpackage.g6u;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.scc;
import defpackage.sjh;
import defpackage.srx;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.w03;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lw03;", "<anonymous>", "(Ltse;)Lw03;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.promotions.factory.ApplicationStateFactory$create$2", f = "ApplicationStateFactory.kt", l = {40, 44, 46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ApplicationStateFactory$create$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "Luc4;", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.promotions.factory.ApplicationStateFactory$create$2$1", f = "ApplicationStateFactory.kt", l = {41}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.promotions.factory.ApplicationStateFactory$create$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String d = ((el00) this.this$0.d.get()).d();
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                ah00 ah00Var = (ah00) this.this$0.c.get();
                this.L$0 = d;
                this.label = 1;
                Object K = ru.yandex.taxi.map.utils.a.K(ah00Var, this);
                if (K == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = K;
                str = d;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$0;
                b.b(obj);
            }
            return new Pair(str, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationStateFactory$create$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationStateFactory$create$2 applicationStateFactory$create$2 = new ApplicationStateFactory$create$2(this.this$0, continuation);
        applicationStateFactory$create$2.L$0 = obj;
        return applicationStateFactory$create$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationStateFactory$create$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
    
        if (r1 == r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Object k0;
        String str;
        uc4 uc4Var;
        Object k;
        zzs a;
        Object a2;
        uc4 uc4Var2;
        String str2;
        Zone zone;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Throwable th = null;
        if (i == 0) {
            b.b(obj);
            h = tje.h(tseVar, null, null, new ApplicationStateFactory$create$2$locationAsync$1(this.this$0, null), 3);
            this.this$0.g.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.L$0 = null;
            this.L$1 = h;
            this.label = 1;
            k0 = tje.k0(g6uVar, anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    uc4 uc4Var3 = (uc4) this.L$3;
                    String str3 = (String) this.L$2;
                    b.b(obj);
                    str = str3;
                    uc4Var = uc4Var3;
                    k = obj;
                    a = ((mo21) k).a();
                    a aVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = str;
                    this.L$3 = uc4Var;
                    this.L$4 = a;
                    this.label = 3;
                    a2 = a.a(aVar, this);
                    if (a2 != coroutineSingletons) {
                        uc4Var2 = uc4Var;
                        str2 = str;
                        zzs zzsVar = a;
                        List list = (List) a2;
                        Integer num = new Integer(zzsVar.c);
                        ZoneAddress f = this.this$0.b.f();
                        if (f != null) {
                        }
                        List a3 = this.this$0.e.a();
                        List a4 = this.this$0.b.a.G.a();
                        List list2 = a4;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        int i2 = 0;
                        while (r2.hasNext()) {
                        }
                        return new w03(zzsVar, num, uc4Var2, r12, a3, arrayList, new srx(this.this$0.f.b(), str2), list);
                    }
                    return coroutineSingletons;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = (zzs) this.L$4;
                uc4 uc4Var4 = (uc4) this.L$3;
                str2 = (String) this.L$2;
                b.b(obj);
                a2 = obj;
                uc4Var2 = uc4Var4;
                zzs zzsVar2 = a;
                List list3 = (List) a2;
                Integer num2 = new Integer(zzsVar2.c);
                ZoneAddress f2 = this.this$0.b.f();
                String str4 = (f2 != null || (zone = f2.b) == null) ? null : zone.a;
                List a32 = this.this$0.e.a();
                List a42 = this.this$0.b.a.G.a();
                List list22 = a42;
                ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
                int i22 = 0;
                for (Object obj2 : list22) {
                    int i3 = i22 + 1;
                    if (i22 < 0) {
                        Throwable th2 = th;
                        scc.m();
                        throw th2;
                    }
                    Address address = (Address) obj2;
                    zzs B = address.B();
                    String uri = address.getUri();
                    if (uri == null) {
                        uri = "";
                    }
                    String str5 = uri;
                    String c2 = address.c2();
                    d5v0 d5v0Var = e5v0.Companion;
                    Throwable th3 = th;
                    int size = a42.size();
                    d5v0Var.getClass();
                    arrayList2.add(new e5v0(B, str5, c2, d5v0.a(i22, size), address.J1(), address.D1()));
                    i22 = i3;
                    th = th3;
                }
                return new w03(zzsVar2, num2, uc4Var2, str4, a32, arrayList2, new srx(this.this$0.f.b(), str2), list3);
            }
            h = (noh) this.L$1;
            b.b(obj);
            k0 = obj;
        }
        Pair pair = (Pair) k0;
        str = (String) pair.getFirst();
        uc4Var = (uc4) pair.getSecond();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = str;
        this.L$3 = uc4Var;
        this.label = 2;
        k = h.k(this);
    }
}
