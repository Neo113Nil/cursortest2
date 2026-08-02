package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import defpackage.zt3;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$sendMessage$2", f = "AndroidTvInteractor.kt", l = {205, 210}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1304z extends aur implements Function2<mm6, Continuation<? super C1032f1<Object>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r c;
    public final /* synthetic */ JSONObject d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Type f;
    public final /* synthetic */ InterfaceC1122l7 g;

    @we7(c = "ru.kinopoisk.cast.androidtv.interaction.AndroidTvInteractor$sendMessage$2$responseDeferred$1", f = "AndroidTvInteractor.kt", l = {202}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.z$a */
    public static final class a extends aur implements Function2<mm6, Continuation<? super C1032f1<Object>>, Object> {
        public int a;
        public final /* synthetic */ r b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Type d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, String str, Type type, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = rVar;
            this.c = str;
            this.d = type;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            r rVar = this.b;
            String str = this.c;
            Type type = this.d;
            this.a = 1;
            int i2 = r.o;
            zt3 zt3Var = new zt3(1, qxe.b(this));
            zt3Var.s();
            rVar.l.put(str, new C1211s(type, zt3Var));
            Object q = zt3Var.q();
            return q == nm6Var ? nm6Var : q;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1304z(r rVar, JSONObject jSONObject, String str, Type type, InterfaceC1122l7 interfaceC1122l7, Continuation<? super C1304z> continuation) {
        super(2, continuation);
        this.c = rVar;
        this.d = jSONObject;
        this.e = str;
        this.f = type;
        this.g = interfaceC1122l7;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1304z c1304z = new C1304z(this.c, this.d, this.e, this.f, this.g, continuation);
        c1304z.b = obj;
        return c1304z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1304z) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [mu7] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ou7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [mu7] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        ?? r1;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            t7oVar = new t7o(th);
            r1 = i;
        }
        if (i == 0) {
            qgg.h0(obj);
            mm6 mm6Var = (mm6) this.b;
            Timber.INSTANCE.tag(this.c.h).d("Sending message %s", this.d);
            ?? p = x97.p(mm6Var, null, null, new a(this.c, this.e, this.f, null), 3);
            InterfaceC1122l7 interfaceC1122l7 = this.g;
            JSONObject jSONObject = this.d;
            r7o r7oVar2 = z7o.b;
            this.b = p;
            this.a = 1;
            i = p;
            if (interfaceC1122l7.a(jSONObject, this) == nm6Var) {
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r12 = (mu7) this.b;
            qgg.h0(obj);
            i = r12;
        }
        t7oVar = Unit.a;
        r7o r7oVar3 = z7o.b;
        r1 = i;
        r rVar = this.c;
        if (!(t7oVar instanceof t7o)) {
            Timber.INSTANCE.tag(rVar.h).v("Message has successfully been sent", new Object[0]);
        }
        r rVar2 = this.c;
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            Timber.INSTANCE.tag(rVar2.h).w(a2, "Send message failure", new Object[0]);
        }
        qgg.h0(t7oVar);
        this.b = null;
        this.a = 2;
        Object H = r1.H(this);
        return H == nm6Var ? nm6Var : H;
    }
}
