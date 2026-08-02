package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdServiceInfo;
import defpackage.aur;
import defpackage.clc;
import defpackage.eno;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.ou7;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.ub7;
import defpackage.uif;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.C1205r7;
import ru.kinopoisk.sdk.easylogin.internal.Q6;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$handleFoundDevice$2", f = "PairingManagerImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.s7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1219s7 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C1205r7 d;
    public final /* synthetic */ Q6.b e;
    public final /* synthetic */ ltm f;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.s7$a */
    public static final class a extends uif implements Function1<Throwable, Unit> {
        public final /* synthetic */ C1205r7 a;
        public final /* synthetic */ LinkedHashMap b;
        public final /* synthetic */ ltm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1205r7 c1205r7, LinkedHashMap linkedHashMap, ltm ltmVar) {
            super(1);
            this.a = c1205r7;
            this.b = linkedHashMap;
            this.c = ltmVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            C1205r7 c1205r7 = this.a;
            LinkedHashMap linkedHashMap = this.b;
            int i = C1205r7.i;
            c1205r7.getClass();
            ArrayList a = C1205r7.a(linkedHashMap);
            Timber.INSTANCE.tag("PairingManager").d((Throwable) obj, "resolve completed: %s", this.b);
            ((oc4) this.c).c(a);
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.pairing.PairingManagerImpl$handleFoundDevice$2$resolveDeviceDeferred$1", f = "PairingManagerImpl.kt", l = {158}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.s7$b */
    public static final class b extends aur implements Function2<mm6, Continuation<? super C1164o7>, Object> {
        public String a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ C1205r7 d;
        public final /* synthetic */ Q6.b e;
        public final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1205r7 c1205r7, Q6.b bVar, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = c1205r7;
            this.e = bVar;
            this.f = str;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.d, this.e, this.f, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            t7o t7oVar;
            C1205r7 c1205r7;
            String str;
            nm6 nm6Var = nm6.a;
            int i = this.b;
            try {
                if (i == 0) {
                    qgg.h0(obj);
                    c1205r7 = this.d;
                    Q6.b bVar = this.e;
                    String str2 = this.f;
                    r7o r7oVar = z7o.b;
                    V6 v6 = c1205r7.e;
                    this.c = c1205r7;
                    this.a = str2;
                    this.b = 1;
                    v6.getClass();
                    obj = zsd.g0(new clc(zsd.k0(new ub7(12, new eno(new W6(bVar, v6, null)), new X6(null)), v6.c), new Y6(v6, null)), this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str = str2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.a;
                    c1205r7 = (C1205r7) this.c;
                    qgg.h0(obj);
                }
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) obj;
                c1205r7.f.getClass();
                C1164o7 a = C1178p7.a(nsdServiceInfo);
                c1205r7.h.put(str, new C1205r7.b(new C1260v7(a.a, C1205r7.a(c1205r7, nsdServiceInfo), nsdServiceInfo.getPort()), a));
                r7o r7oVar2 = z7o.b;
                t7oVar = a;
            } catch (Throwable th) {
                r7o r7oVar3 = z7o.b;
                t7oVar = new t7o(th);
            }
            Q6.b bVar2 = this.e;
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                Timber.INSTANCE.tag("PairingManager").d(a2, "failed resolve: %s", bVar2);
            }
            if (t7oVar instanceof t7o) {
                return null;
            }
            return t7oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219s7(LinkedHashMap linkedHashMap, String str, C1205r7 c1205r7, Q6.b bVar, ltm ltmVar, Continuation continuation) {
        super(2, continuation);
        this.b = linkedHashMap;
        this.c = str;
        this.d = c1205r7;
        this.e = bVar;
        this.f = ltmVar;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1219s7 c1219s7 = new C1219s7(this.b, this.c, this.d, this.e, this.f, continuation);
        c1219s7.a = obj;
        return c1219s7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1219s7) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        ou7 p = x97.p((mm6) this.a, null, null, new b(this.d, this.e, this.c, null), 3);
        p.R(new a(this.d, this.b, this.f));
        this.b.put(this.c, p);
        return Unit.a;
    }
}
