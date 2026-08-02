package ru.yandex.taxi.am;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import defpackage.cne0;
import defpackage.g6u;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.hhz;
import defpackage.hm;
import defpackage.kgx;
import defpackage.kj;
import defpackage.kl;
import defpackage.mrj0;
import defpackage.mth;
import defpackage.no90;
import defpackage.ny61;
import defpackage.o400;
import defpackage.owx;
import defpackage.pz40;
import defpackage.qme0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class g {
    public final k a;
    public final ru.yandex.taxi.startup.launch.h b;
    public final no90 c;
    public final h d;
    public final tt2 e;
    public final m f;
    public final hhz g;
    public final kl h;
    public final mrj0 i;
    public final hm j;
    public final ru.yandex.taxi.am.internal.b k;
    public final ru.yandex.taxi.am.token.a l;

    public g(k kVar, ru.yandex.taxi.startup.launch.h hVar, no90 no90Var, h hVar2, tt2 tt2Var, m mVar, hhz hhzVar, kl klVar, mrj0 mrj0Var, hm hmVar, ru.yandex.taxi.am.internal.b bVar, ru.yandex.taxi.am.token.a aVar, ru.yandex.taxi.am.internal.a aVar2) {
        this.a = kVar;
        this.b = hVar;
        this.c = no90Var;
        this.d = hVar2;
        this.e = tt2Var;
        this.f = mVar;
        this.g = hhzVar;
        this.h = klVar;
        this.i = mrj0Var;
        this.j = hmVar;
        this.k = bVar;
        this.l = aVar;
        if (((cne0) kVar.b).c("phone number")) {
            aVar2.a();
        }
    }

    public final gci0 a() {
        return kotlinx.coroutines.flow.e.d((pz40) this.a.B.getValue());
    }

    public final String b() {
        return this.l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(kj kjVar, ContinuationImpl continuationImpl) {
        AccountManagerImpl$handleAutoLoginResult$1 accountManagerImpl$handleAutoLoginResult$1;
        int i;
        if (continuationImpl instanceof AccountManagerImpl$handleAutoLoginResult$1) {
            accountManagerImpl$handleAutoLoginResult$1 = (AccountManagerImpl$handleAutoLoginResult$1) continuationImpl;
            int i2 = accountManagerImpl$handleAutoLoginResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountManagerImpl$handleAutoLoginResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountManagerImpl$handleAutoLoginResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountManagerImpl$handleAutoLoginResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    AccountManagerImpl$handleAutoLoginResult$2 accountManagerImpl$handleAutoLoginResult$2 = new AccountManagerImpl$handleAutoLoginResult$2(this, kjVar, null);
                    accountManagerImpl$handleAutoLoginResult$1.L$0 = null;
                    accountManagerImpl$handleAutoLoginResult$1.label = 1;
                    obj = tje.k0(g6uVar, accountManagerImpl$handleAutoLoginResult$2, accountManagerImpl$handleAutoLoginResult$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        accountManagerImpl$handleAutoLoginResult$1 = new AccountManagerImpl$handleAutoLoginResult$1(this, continuationImpl);
        Object obj2 = accountManagerImpl$handleAutoLoginResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountManagerImpl$handleAutoLoginResult$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final void d(owx owxVar) {
        boolean z = owxVar.a;
        boolean f = f();
        boolean z2 = owxVar.o;
        k kVar = this.a;
        qme0 qme0Var = kVar.D;
        kgx[] kgxVarArr = k.S;
        qme0Var.setValue(kVar, kgxVarArr[3], Boolean.valueOf(z));
        kVar.C.g(Boolean.valueOf(z));
        kVar.E.setValue(kVar, kgxVarArr[4], Boolean.valueOf(z2));
        if (!z && !z2) {
            if (f) {
                ((cne0) kVar.b).u("recently_reset", true);
            }
            this.i.b(false);
        } else if (!f && z && z2) {
            gtq0.F("Authorized without uid", null, new IllegalStateException("Launch return that user is authorized but no uid in cache was saved"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(long j, ContinuationImpl continuationImpl) {
        AccountManagerImpl$handleNewToken$1 accountManagerImpl$handleNewToken$1;
        int i;
        Object d;
        Throwable a;
        if (continuationImpl instanceof AccountManagerImpl$handleNewToken$1) {
            accountManagerImpl$handleNewToken$1 = (AccountManagerImpl$handleNewToken$1) continuationImpl;
            int i2 = accountManagerImpl$handleNewToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountManagerImpl$handleNewToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountManagerImpl$handleNewToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountManagerImpl$handleNewToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.x.a.q(j, "uid");
                    accountManagerImpl$handleNewToken$1.J$0 = j;
                    accountManagerImpl$handleNewToken$1.label = 1;
                    d = this.l.d(true, accountManagerImpl$handleNewToken$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    hhz hhzVar = this.g;
                    hhzVar.getClass();
                    hhzVar.a.a("LOGIN: TrackAuthToken handleNewToken", new HashMap(), 1, new HashMap());
                }
                a = Result.a(d);
                if (a != null && (a instanceof PassportAccountNotFoundException)) {
                    gtq0.F("Account not found while handle new token", null, a);
                }
                return d;
            }
        }
        accountManagerImpl$handleNewToken$1 = new AccountManagerImpl$handleNewToken$1(this, continuationImpl);
        Object obj2 = accountManagerImpl$handleNewToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountManagerImpl$handleNewToken$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        a = Result.a(d);
        if (a != null) {
            gtq0.F("Account not found while handle new token", null, a);
        }
        return d;
    }

    public final boolean f() {
        return this.a.x.a().a();
    }

    public final boolean g() {
        return this.a.Kg() && this.l.g();
    }

    public final mth h() {
        return this.f.f;
    }

    public final long i() {
        return this.a.x.a().a;
    }
}
