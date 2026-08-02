package ru.kinopoisk.sdk.easylogin.internal.impl;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.squareup.anvil.annotations.ContributesBinding;
import defpackage.aur;
import defpackage.cg6;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.tah;
import defpackage.tyc;
import defpackage.ub7;
import defpackage.v75;
import defpackage.vdr;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.B3;
import ru.kinopoisk.sdk.easylogin.internal.C1282x3;
import ru.kinopoisk.sdk.easylogin.internal.C1295y3;
import ru.kinopoisk.sdk.easylogin.internal.D2;
import ru.kinopoisk.sdk.easylogin.internal.F2;
import ru.kinopoisk.sdk.easylogin.internal.G;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.Pc;
import ru.kinopoisk.sdk.easylogin.internal.Q2;
import ru.kinopoisk.sdk.easylogin.internal.S2;

@ContributesBinding(scope = J.class)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u00012BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EasyLoginGenaGlobalParamsProvider;", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParamsProvider;", "Lru/kinopoisk/sdk/easylogin/internal/t2;", "currentPuidProvider", "Lru/kinopoisk/sdk/easylogin/internal/Q2;", "dispatchersProvider", "Lru/kinopoisk/sdk/easylogin/internal/D2;", "deviceIdentifierProvider", "Lru/kinopoisk/sdk/easylogin/internal/B3;", "expsProvider", "Lru/kinopoisk/sdk/easylogin/internal/x3;", "evgenFeatureFlagsProvider", "Lru/kinopoisk/sdk/easylogin/internal/F2;", "deviceSpecificationProvider", "Lru/kinopoisk/sdk/easylogin/internal/G;", "appSessionIdProvider", "<init>", "(Lru/kinopoisk/sdk/easylogin/internal/t2;Lru/kinopoisk/sdk/easylogin/internal/Q2;Lru/kinopoisk/sdk/easylogin/internal/D2;Lru/kinopoisk/sdk/easylogin/internal/B3;Lru/kinopoisk/sdk/easylogin/internal/x3;Lru/kinopoisk/sdk/easylogin/internal/F2;Lru/kinopoisk/sdk/easylogin/internal/G;)V", "", "puid", "", "deviceId", "", "", "experiments", "", "featureToggles", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;", "buildAnalyticsGlobalParams", "(JLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;", "Lru/kinopoisk/sdk/easylogin/internal/impl/Lang;", "getAnalyticsLang", "()Lru/kinopoisk/sdk/easylogin/internal/impl/Lang;", "Lru/kinopoisk/sdk/easylogin/internal/impl/TextDirection;", "getTextDirection", "()Lru/kinopoisk/sdk/easylogin/internal/impl/TextDirection;", "", "Lru/kinopoisk/sdk/easylogin/internal/y3;", "exps", "getExperiments", "(Ljava/util/List;)Ljava/util/Map;", "getGlobalParams", "()Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;", "Lru/kinopoisk/sdk/easylogin/internal/F2;", "Lru/kinopoisk/sdk/easylogin/internal/G;", "Lmm6;", "scope", "Lmm6;", "analyticsGlobalParams", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;", "Companion", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class EasyLoginGenaGlobalParamsProvider implements EvgenEasyLoginAnalyticsGlobalParamsProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEFAULT_DEVICE_ID = "-1";

    @NotNull
    private static final String SCOPE_NAME = "EasyLoginGenaGlobalParamsProvider";
    private static final long UNAUTHORIZED_PUID_VALUE = -1;

    @NotNull
    private volatile EvgenEasyLoginAnalyticsGlobalParams analyticsGlobalParams;

    @NotNull
    private final G appSessionIdProvider;

    @NotNull
    private final F2 deviceSpecificationProvider;

    @NotNull
    private final mm6 scope;

    @we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$4", f = "EasyLoginGenaGlobalParamsProvider.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;"}, k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$4, reason: invalid class name */
    public static final class AnonymousClass4 extends aur implements Function2<EvgenEasyLoginAnalyticsGlobalParams, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = EasyLoginGenaGlobalParamsProvider.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EvgenEasyLoginAnalyticsGlobalParams evgenEasyLoginAnalyticsGlobalParams, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(evgenEasyLoginAnalyticsGlobalParams, continuation)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            if (this.label != 0) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            EasyLoginGenaGlobalParamsProvider.this.analyticsGlobalParams = (EvgenEasyLoginAnalyticsGlobalParams) this.L$0;
            return Unit.a;
        }
    }

    public EasyLoginGenaGlobalParamsProvider(@NotNull InterfaceC1228t2 interfaceC1228t2, @NotNull Q2 q2, @NotNull D2 d2, @NotNull B3 b3, @NotNull C1282x3 c1282x3, @NotNull F2 f2, @NotNull G g) {
        interfaceC1228t2.getClass();
        q2.getClass();
        d2.getClass();
        b3.getClass();
        c1282x3.getClass();
        f2.getClass();
        g.getClass();
        this.deviceSpecificationProvider = f2;
        this.appSessionIdProvider = g;
        mm6 a = S2.a(q2, SCOPE_NAME);
        this.scope = a;
        Pc puid = interfaceC1228t2.getPuid();
        long j = puid != null ? puid.a : UNAUTHORIZED_PUID_VALUE;
        d2.get();
        this.analyticsGlobalParams = buildAnalyticsGlobalParams(j, DEFAULT_DEVICE_ID, getExperiments((List) b3.a().getValue()), (Map) c1282x3.e.getValue());
        final pjc puidFlow = interfaceC1228t2.getPuidFlow();
        pjc pjcVar = new pjc() { // from class: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$1

            @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements rjc {
                final /* synthetic */ rjc $this_unsafeFlow;

                @we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$1$2", f = "EasyLoginGenaGlobalParamsProvider.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends cg6 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // defpackage.kq2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(rjc rjcVar) {
                    this.$this_unsafeFlow = rjcVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.rjc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            nm6 nm6Var = nm6.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                qgg.h0(obj2);
                                rjc rjcVar = this.$this_unsafeFlow;
                                Pc pc = (Pc) obj;
                                Long l = new Long(pc != null ? pc.a : -1L);
                                anonymousClass1.label = 1;
                                if (rjcVar.emit(l, anonymousClass1) == nm6Var) {
                                    return nm6Var;
                                }
                            } else {
                                if (i != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    nm6 nm6Var2 = nm6.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.pjc
            public Object collect(rjc rjcVar, Continuation continuation) {
                Object collect = pjc.this.collect(new AnonymousClass2(rjcVar), continuation);
                return collect == nm6.a ? collect : Unit.a;
            }
        };
        pjc a2 = d2.a();
        final vdr a3 = b3.a();
        zsd.r0(a, new ub7(12, zsd.P(pjcVar, a2, new pjc() { // from class: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$2

            @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements rjc {
                final /* synthetic */ rjc $this_unsafeFlow;
                final /* synthetic */ EasyLoginGenaGlobalParamsProvider receiver$inlined;

                @we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$2$2", f = "EasyLoginGenaGlobalParamsProvider.kt", l = {50}, m = "emit")
                @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends cg6 {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // defpackage.kq2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(rjc rjcVar, EasyLoginGenaGlobalParamsProvider easyLoginGenaGlobalParamsProvider) {
                    this.$this_unsafeFlow = rjcVar;
                    this.receiver$inlined = easyLoginGenaGlobalParamsProvider;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // defpackage.rjc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Map experiments;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            nm6 nm6Var = nm6.a;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                qgg.h0(obj2);
                                rjc rjcVar = this.$this_unsafeFlow;
                                experiments = this.receiver$inlined.getExperiments((List) obj);
                                anonymousClass1.label = 1;
                                if (rjcVar.emit(experiments, anonymousClass1) == nm6Var) {
                                    return nm6Var;
                                }
                            } else {
                                if (i != 1) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj2);
                            }
                            return Unit.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    nm6 nm6Var2 = nm6.a;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.a;
                }
            }

            @Override // defpackage.pjc
            public Object collect(rjc rjcVar, Continuation continuation) {
                Object collect = pjc.this.collect(new AnonymousClass2(rjcVar, this), continuation);
                return collect == nm6.a ? collect : Unit.a;
            }
        }, c1282x3.e, new AnonymousClass3(null)), new AnonymousClass4(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EvgenEasyLoginAnalyticsGlobalParams buildAnalyticsGlobalParams(long puid, String deviceId, Map<String, ? extends Object> experiments, Map<String, Boolean> featureToggles) {
        String valueOf = String.valueOf(Long.valueOf(puid));
        Lang analyticsLang = getAnalyticsLang();
        TextDirection textDirection = getTextDirection();
        this.appSessionIdProvider.getClass();
        return new EvgenEasyLoginAnalyticsGlobalParams(experiments, featureToggles, deviceId, valueOf, G.b, analyticsLang, textDirection);
    }

    private final Lang getAnalyticsLang() {
        return Lang.Ru;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getExperiments(List<C1295y3> exps) {
        int a = tah.a(v75.o(exps, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (C1295y3 c1295y3 : exps) {
            linkedHashMap.put(c1295y3.a, tah.b(new Pair(Integer.valueOf(c1295y3.b), c1295y3.c)));
        }
        return linkedHashMap;
    }

    private final TextDirection getTextDirection() {
        return this.deviceSpecificationProvider.c() ? TextDirection.Ltr : TextDirection.Rtl;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.impl.EvgenEasyLoginAnalyticsGlobalParamsProvider
    @NotNull
    /* renamed from: getGlobalParams, reason: from getter */
    public EvgenEasyLoginAnalyticsGlobalParams getAnalyticsGlobalParams() {
        return this.analyticsGlobalParams;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/impl/EasyLoginGenaGlobalParamsProvider$Companion;", "", "()V", "DEFAULT_DEVICE_ID", "", "SCOPE_NAME", "UNAUTHORIZED_PUID_VALUE", "", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @we7(c = "ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$3", f = "EasyLoginGenaGlobalParamsProvider.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000(\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004H\u008a@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "puid", "Lru/kinopoisk/sdk/easylogin/internal/D2$a;", "deviceIdentifier", "", "", "", "experiments", "", "features", "Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;", "<anonymous>", "(JLru/kinopoisk/sdk/easylogin/internal/D2$a;Ljava/util/Map;Ljava/util/Map;)Lru/kinopoisk/sdk/easylogin/internal/impl/EvgenEasyLoginAnalyticsGlobalParams;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.impl.EasyLoginGenaGlobalParamsProvider$3, reason: invalid class name */
    public static final class AnonymousClass3 extends aur implements tyc {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(5, continuation);
        }

        @Override // defpackage.tyc
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return invoke(((Number) obj).longValue(), (D2.a) obj2, (Map<String, ? extends Object>) obj3, (Map<String, Boolean>) obj4, (Continuation<? super EvgenEasyLoginAnalyticsGlobalParams>) obj5);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qgg.h0(obj);
            D2.a aVar = (D2.a) this.L$0;
            aVar.getClass();
            throw null;
        }

        public final Object invoke(long j, D2.a aVar, Map<String, ? extends Object> map, Map<String, Boolean> map2, Continuation<? super EvgenEasyLoginAnalyticsGlobalParams> continuation) {
            AnonymousClass3 anonymousClass3 = EasyLoginGenaGlobalParamsProvider.this.new AnonymousClass3(continuation);
            anonymousClass3.J$0 = j;
            anonymousClass3.L$0 = aVar;
            anonymousClass3.L$1 = map;
            anonymousClass3.L$2 = map2;
            return anonymousClass3.invokeSuspend(Unit.a);
        }
    }
}
