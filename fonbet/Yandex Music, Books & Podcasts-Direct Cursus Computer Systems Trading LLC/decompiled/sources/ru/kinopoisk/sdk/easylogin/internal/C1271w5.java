package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.DIALService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.a4g;
import defpackage.aij;
import defpackage.alc;
import defpackage.aur;
import defpackage.bm5;
import defpackage.clc;
import defpackage.fm5;
import defpackage.gld;
import defpackage.l1j;
import defpackage.lbq;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.qgg;
import defpackage.suh;
import defpackage.tf6;
import defpackage.u0q;
import defpackage.u21;
import defpackage.ub7;
import defpackage.v5g;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1271w5 implements InterfaceC1305z0 {
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final G5 a;

    @NotNull
    public final F0 b;

    @NotNull
    public final I5 c;

    @NotNull
    public final CoroutineContext d;

    @NotNull
    public final CopyOnWriteArrayList<ConnectableDevice> e;

    @NotNull
    public final u0q f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/w5$a;", "", "", "TAG", "Ljava/lang/String;", "UNKNOWN_MODEL", "android_cast_connectivitymobile_lg"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w5$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$connect$1", f = "LgCastDeviceManager.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.w5$b */
    public static final class b extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ InterfaceC1305z0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1305z0.a aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = aVar;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C1271w5.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1271w5.this.new b(this.c, (Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                I5 i5 = C1271w5.this.c;
                String str = this.c.a;
                this.a = 1;
                if (i5.a(str, this) == nm6Var) {
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

    public C1271w5(@NotNull G5 g5, @NotNull F0 f0, @NotNull I5 i5, @NotNull Q2 q2, @NotNull C1198r0 c1198r0, @NotNull String str) {
        g5.getClass();
        f0.getClass();
        i5.getClass();
        q2.getClass();
        c1198r0.getClass();
        str.getClass();
        this.a = g5;
        this.b = f0;
        this.c = i5;
        CoroutineContext plus = q2.a().plus(new C1187q2("LgCastDeviceManager"));
        this.d = plus;
        tf6 e = gld.e(kotlin.coroutines.e.c(a4g.n(), plus));
        this.e = new CopyOnWriteArrayList<>();
        DIALService.registerApp(str);
        this.f = zsd.D0(new alc(new clc(new ub7(12, zsd.b0(new clc(new u21(10, new ub7(12, new clc(zsd.M0(new ub7(12, new ub7(12, zsd.b0(zsd.M0(c1198r0.a.getAuthTokenState(), new C1240u0(null, c1198r0))), new C1266w0(null)), new C1284x5(this, null)), new F5(null, this)), new C1297y5(this, null)), new C1310z5(this, null)), i5.c, new A5(this, null)), new B5(null))), new C5(this, null)), new D5(this, null)), new E5(this, null)), e, lbq.b);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final bm5 a(@NotNull InterfaceC1305z0.a aVar) {
        aVar.getClass();
        CoroutineContext coroutineContext = this.d;
        b bVar = new b(aVar, null);
        if (coroutineContext.get(o6c.l) == null) {
            return new fm5(0, new suh(16, coroutineContext, bVar));
        }
        l1j.p(coroutineContext, "Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    @NotNull
    public final aij b() {
        return v5g.t(this.f);
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0
    public final void a() {
        this.c.a();
    }
}
