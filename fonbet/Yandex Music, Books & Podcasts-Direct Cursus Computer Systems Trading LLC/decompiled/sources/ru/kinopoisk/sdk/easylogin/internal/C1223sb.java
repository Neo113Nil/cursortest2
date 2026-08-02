package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.alc;
import defpackage.aur;
import defpackage.bqi;
import defpackage.c5b;
import defpackage.clc;
import defpackage.dzf;
import defpackage.kg5;
import defpackage.lyf;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.ot0;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.s1n;
import defpackage.ssa;
import defpackage.su2;
import defpackage.ub7;
import defpackage.vbt;
import defpackage.we7;
import defpackage.xdr;
import defpackage.yd5;
import defpackage.ydr;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.Za;
import ru.kinopoisk.sdk.easylogin.internal.impl.TvDiscoveryTrackerImpl;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1223sb extends su2 {
    public static final /* synthetic */ int j = 0;

    @NotNull
    public final O2 a;

    @NotNull
    public final Gb b;

    @NotNull
    public final Q2 c;

    @NotNull
    public final Hb d;

    @NotNull
    public final C1288x9 e;

    @NotNull
    public final TvDiscoveryTrackerImpl f;

    @NotNull
    public final Ba g;

    @NotNull
    public final bqi h;

    @NotNull
    public final bqi i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/sb$a;", "", "", "TAG", "Ljava/lang/String;", "android_easylogin_tvauthdiscovery_mobileimpl"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvDiscoveryViewModel$searchTv$1", f = "TvDiscoveryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb$b */
    public static final class b extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C1223sb.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C1223sb.this.new b((Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            C1223sb c1223sb = C1223sb.this;
            if (!c1223sb.g.a) {
                ((xdr) c1223sb.h).l(Za.d.a);
            }
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvDiscoveryViewModel$searchTv$2", f = "TvDiscoveryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb$c */
    public static final class c extends aur implements pyc {
        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C1223sb.this.new c((Continuation) obj3).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            List list;
            Object aVar;
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            C1223sb c1223sb = C1223sb.this;
            int i = C1223sb.j;
            Object value = ((xdr) c1223sb.h).getValue();
            Za.a aVar2 = value instanceof Za.a ? (Za.a) value : null;
            if (aVar2 == null || (list = aVar2.a) == null) {
                list = c5b.a;
            }
            bqi bqiVar = C1223sb.this.h;
            if (list.isEmpty()) {
                aVar = Za.b.a;
            } else {
                C1223sb c1223sb2 = C1223sb.this;
                c1223sb2.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (c1223sb2.d.a((H3) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                aVar = new Za.a(arrayList, true);
            }
            ((xdr) bqiVar).l(aVar);
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvDiscoveryViewModel$searchTv$3", f = "TvDiscoveryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb$d */
    public static final class d extends aur implements Function2<List<? extends H3>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C1223sb.this.new d(continuation);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            d dVar = C1223sb.this.new d((Continuation) obj2);
            dVar.a = (List) obj;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            List list = (List) this.a;
            C1223sb c1223sb = C1223sb.this;
            bqi bqiVar = c1223sb.h;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (c1223sb.d.a((H3) obj2)) {
                    arrayList.add(obj2);
                }
            }
            Za.a aVar = new Za.a(arrayList, false);
            xdr xdrVar = (xdr) bqiVar;
            xdrVar.getClass();
            xdrVar.m(null, aVar);
            return Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvDiscoveryViewModel$searchTv$4", f = "TvDiscoveryViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.sb$e */
    public static final class e extends aur implements pyc {
        public /* synthetic */ Throwable a;

        public e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // defpackage.pyc
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            e eVar = C1223sb.this.new e((Continuation) obj3);
            eVar.a = (Throwable) obj2;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            qgg.h0(obj);
            Throwable th = this.a;
            C1223sb c1223sb = C1223sb.this;
            c1223sb.f.trackError(th, (Za) ((xdr) c1223sb.h).getValue());
            Timber.INSTANCE.w(th, "Failed to discover", new Object[0]);
            ((xdr) C1223sb.this.h).l(Za.b.a);
            return Unit.a;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223sb(@NotNull O2 o2, @NotNull Gb gb, @NotNull Q2 q2, @NotNull Hb hb, @NotNull C1288x9 c1288x9, @NotNull TvDiscoveryTrackerImpl tvDiscoveryTrackerImpl, @NotNull Ba ba) {
        super("TvDiscoveryViewModel");
        o2.getClass();
        gb.getClass();
        q2.getClass();
        hb.getClass();
        c1288x9.getClass();
        tvDiscoveryTrackerImpl.getClass();
        ba.getClass();
        this.a = o2;
        this.b = gb;
        this.c = q2;
        this.d = hb;
        this.e = c1288x9;
        this.f = tvDiscoveryTrackerImpl;
        this.g = ba;
        xdr a2 = ydr.a(ba.a ? Za.e.a : Za.c.a);
        this.h = a2;
        this.i = a2;
        zsd.r0(ot0.F(this), zsd.k0(new clc(new ub7(12, kg5.t(zsd.a0(a2, C1237tb.a), getLifecycle(), lyf.e), new C1251ub(tvDiscoveryTrackerImpl)), new C1264vb(null)), q2.b()));
        if (ba.a) {
            tvDiscoveryTrackerImpl.trackFindClick((Za) a2.getValue());
            a();
        }
    }

    public final void a() {
        Gb gb = this.b;
        int i = 12;
        ub7 ub7Var = new ub7(i, new alc(new clc(zsd.k0(new clc(new Db(new Cb(new Eb(zsd.I(new s1n(gb.a.b(), (Continuation) null, 23)), gb), gb), gb), new Fb(gb, null)), gb.b.a()), new b(null)), new c(null)), new d(null));
        msa msaVar = nsa.b;
        zsd.r0(ot0.F(this), zsd.k0(new clc(zsd.K(new C1124l9(ub7Var, nsa.f(yd5.N(this.e.a().e, ssa.SECONDS)), null)), new e(null)), this.c.a()));
    }

    @Override // defpackage.yn7
    public void onCreate(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onDestroy(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onPause(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onResume(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onStart(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public void onStop(@NotNull dzf dzfVar) {
        dzfVar.getClass();
    }

    public final void a(@NotNull H3 h3) {
        List list;
        h3.getClass();
        Object value = ((xdr) this.h).getValue();
        Za.a aVar = value instanceof Za.a ? (Za.a) value : null;
        if (aVar == null || (list = aVar.a) == null) {
            list = c5b.a;
        }
        this.f.trackConnectClick(h3, list.indexOf(h3), list.size());
        O2 o2 = this.a;
        o2.getClass();
        Z7.a(o2.a);
        Z7.a(o2.a, new vbt(new B2(h3), o2.b.a.b()));
    }
}
