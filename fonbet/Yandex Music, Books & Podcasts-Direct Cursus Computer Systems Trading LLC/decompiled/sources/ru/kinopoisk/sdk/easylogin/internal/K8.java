package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.azo;
import defpackage.b6e;
import defpackage.bqi;
import defpackage.bzo;
import defpackage.czo;
import defpackage.dzo;
import defpackage.e5p;
import defpackage.eno;
import defpackage.g3a;
import defpackage.gw0;
import defpackage.hrg;
import defpackage.jjo;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rjc;
import defpackage.t7o;
import defpackage.uif;
import defpackage.un4;
import defpackage.v7o;
import defpackage.veb;
import defpackage.vjp;
import defpackage.we7;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y7g;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import defpackage.zyo;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class K8 {
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final O8 a;

    @NotNull
    public final J8 b;

    @NotNull
    public final F0 c;

    @NotNull
    public final bqi d;
    public final dzo e;

    @NotNull
    public final ConcurrentHashMap f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/K8$a;", "", "", "APP_ID", "Ljava/lang/String;", "CHANNEL_ID", "TAG", "UNKNOWN_MODEL", "android_cast_connectivitymobile_samsung"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c implements czo, azo, bzo {

        @NotNull
        public final dzo a;

        @NotNull
        public final ltm b;

        public c(@NotNull dzo dzoVar, @NotNull ltm ltmVar) {
            dzoVar.getClass();
            ltmVar.getClass();
            this.a = dzoVar;
            this.b = ltmVar;
        }

        @Override // defpackage.azo
        public final void onFound(@NotNull vjp vjpVar) {
            vjpVar.getClass();
            mm6 mm6Var = this.b;
            List unmodifiableList = Collections.unmodifiableList(this.a.i);
            unmodifiableList.getClass();
            ((oc4) mm6Var).c(unmodifiableList);
        }

        @Override // defpackage.bzo
        public final void onLost(@NotNull vjp vjpVar) {
            vjpVar.getClass();
            mm6 mm6Var = this.b;
            List unmodifiableList = Collections.unmodifiableList(this.a.i);
            unmodifiableList.getClass();
            ((oc4) mm6Var).c(unmodifiableList);
        }

        @Override // defpackage.czo
        public final void onStop() {
            mm6 mm6Var = this.b;
            List unmodifiableList = Collections.unmodifiableList(this.a.i);
            unmodifiableList.getClass();
            ((oc4) mm6Var).c(unmodifiableList);
        }
    }

    public interface d {

        public static final class a implements d {

            @NotNull
            public final gw0 a;

            @NotNull
            public final String b;

            public a(@NotNull gw0 gw0Var, @NotNull String str) {
                gw0Var.getClass();
                str.getClass();
                this.a = gw0Var;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.a, aVar.a) && Intrinsics.d(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Connected(app=" + this.a + ", deviceId=" + this.b + ")";
            }
        }

        public static final class b implements d {

            @NotNull
            public final String a;

            public b(@NotNull String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return hrg.q("Connecting(deviceId=", this.a, ")");
            }
        }

        public static final class c implements d {

            @NotNull
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -104707174;
            }

            @NotNull
            public final String toString() {
                return "Disconnected";
            }
        }

        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.K8$d$d, reason: collision with other inner class name */
        public static final class C0030d implements d {

            @NotNull
            public final b a;

            public C0030d(@NotNull b bVar) {
                bVar.getClass();
                this.a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0030d) && Intrinsics.d(this.a, ((C0030d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "Error(error=" + this.a + ")";
            }
        }
    }

    public static final class e implements v7o {
        public final /* synthetic */ gw0 b;
        public final /* synthetic */ String c;

        public e(gw0 gw0Var, String str) {
            this.b = gw0Var;
            this.c = str;
        }

        @Override // defpackage.v7o
        public final void onError(veb vebVar) {
            vebVar.getClass();
            bqi bqiVar = K8.this.d;
            d.C0030d c0030d = new d.C0030d(new b(null, vebVar.a + ": " + vebVar.c, 1, null));
            xdr xdrVar = (xdr) bqiVar;
            xdrVar.getClass();
            xdrVar.m(null, c0030d);
        }

        @Override // defpackage.v7o
        public final void onSuccess(Object obj) {
            ((un4) obj).getClass();
            bqi bqiVar = K8.this.d;
            gw0 gw0Var = this.b;
            gw0Var.getClass();
            d.a aVar = new d.a(gw0Var, this.c);
            xdr xdrVar = (xdr) bqiVar;
            xdrVar.getClass();
            xdrVar.m(null, aVar);
        }
    }

    @we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$discover$$inlined$flatMapLatest$1", f = "SmartViewConnector.kt", l = {189}, m = "invokeSuspend")
    public static final class f extends aur implements pyc {
        public int a;
        public /* synthetic */ rjc b;
        public /* synthetic */ Object c;
        public final /* synthetic */ K8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Continuation continuation, K8 k8) {
            super(3, continuation);
            this.d = k8;
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            f fVar = new f((Continuation) obj3, this.d);
            fVar.b = (rjc) obj;
            fVar.c = obj2;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                rjc rjcVar = this.b;
                List list = (List) this.c;
                K8 k8 = this.d;
                int i2 = K8.g;
                k8.getClass();
                eno enoVar = new eno(new M8(list, k8, null));
                this.a = 1;
                if (zsd.e0(rjcVar, enoVar, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    public K8(@NotNull Context context, @NotNull O8 o8, @NotNull J8 j8, @NotNull F0 f0) {
        context.getClass();
        o8.getClass();
        j8.getClass();
        f0.getClass();
        this.a = o8;
        this.b = j8;
        this.c = f0;
        this.d = ydr.a(d.c.a);
        if (dzo.m == null) {
            dzo.m = new dzo(context);
        }
        this.e = dzo.m;
        this.f = new ConcurrentHashMap();
    }

    public final void a(@NotNull String str) {
        Object t7oVar;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            b(str);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            throw new b(a2);
        }
    }

    public final void b(String str) {
        Object obj;
        d dVar = (d) ((xdr) this.d).getValue();
        if (dVar instanceof d.a ? true : dVar instanceof d.b) {
            return;
        }
        List unmodifiableList = Collections.unmodifiableList(this.e.i);
        unmodifiableList.getClass();
        Iterator it = unmodifiableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.d(((vjp) obj).a, str)) {
                    break;
                }
            }
        }
        vjp vjpVar = (vjp) obj;
        if (vjpVar == null) {
            throw new b(null, hrg.q("service with ", str, " not found"), 1, null);
        }
        Uri parse = Uri.parse("discoverin.HD");
        SecureRandom secureRandom = gw0.q;
        parse.getClass();
        gw0 gw0Var = new gw0(vjpVar, parse);
        gw0Var.f = new g3a(28, this);
        bqi bqiVar = this.d;
        d.b bVar = new d.b(str);
        xdr xdrVar = (xdr) bqiVar;
        xdrVar.getClass();
        xdrVar.m(null, bVar);
        gw0Var.b(new e(gw0Var, str));
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/K8$b;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "android_cast_connectivitymobile_samsung"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b extends RuntimeException {
        public b(Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            super((i & 2) != 0 ? null : str, (i & 1) != 0 ? null : th);
        }

        public b(Throwable th) {
            super("An error occurred while connecting to the TV", th);
        }
    }

    @we7(c = "ru.kinopoisk.cast.samsung.smartview.SmartViewConnector$discover$1", f = "SmartViewConnector.kt", l = {50}, m = "invokeSuspend")
    public static final class g extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = K8.this.new g(continuation);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            g gVar = K8.this.new g((Continuation) obj2);
            gVar.b = (ltm) obj;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            mm6 mm6Var;
            Throwable th;
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                ltm ltmVar = (ltm) this.b;
                try {
                    dzo dzoVar = K8.this.e;
                    dzoVar.getClass();
                    c cVar = new c(dzoVar, ltmVar);
                    K8.this.e.j = cVar;
                    K8.this.e.k = cVar;
                    K8.this.e.l = cVar;
                    K8.this.e.a();
                    a aVar = new a(ltmVar, K8.this);
                    this.b = ltmVar;
                    this.a = 1;
                    if (y7g.q(ltmVar, aVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } catch (Throwable th2) {
                    mm6Var = ltmVar;
                    th = th2;
                    ((oc4) mm6Var).p0(th);
                    return Unit.a;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mm6Var = (ltm) this.b;
                try {
                    qgg.h0(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ((oc4) mm6Var).p0(th);
                    return Unit.a;
                }
            }
            return Unit.a;
        }

        public static final class a extends uif implements Function0<Unit> {
            public final /* synthetic */ K8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ltm ltmVar, K8 k8) {
                super(0);
                this.a = k8;
            }

            public final void a() {
                K8 k8 = this.a;
                try {
                    r7o r7oVar = z7o.b;
                    k8.e.j = null;
                    k8.e.k = new b6e();
                    k8.e.l = new b6e();
                    dzo dzoVar = k8.e;
                    Iterator it = dzoVar.b.iterator();
                    while (it.hasNext()) {
                        jjo.a(new zyo(dzoVar, (e5p) it.next(), 1));
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (Throwable unused) {
                    r7o r7oVar3 = z7o.b;
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.a;
            }

            public static final void b(vjp vjpVar) {
            }

            public static final void a(vjp vjpVar) {
            }
        }
    }

    @NotNull
    public final pjc a() {
        return zsd.M0(zsd.K(new g(null)), new f(null, this));
    }

    public static final void a(K8 k8, un4 un4Var) {
        ((xdr) k8.d).l(d.c.a);
    }
}
