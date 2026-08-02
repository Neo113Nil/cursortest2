package ru.yandex.taxi.analytics;

import android.content.Context;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.go.proxyprovision.a;
import defpackage.bvf0;
import defpackage.dne0;
import defpackage.eb20;
import defpackage.evu0;
import defpackage.g2c;
import defpackage.h2c;
import defpackage.hc20;
import defpackage.jst;
import defpackage.ju6;
import defpackage.mvg;
import defpackage.nbj;
import defpackage.not;
import defpackage.ny61;
import defpackage.rcj;
import defpackage.tse;
import defpackage.uza;
import defpackage.wls;
import defpackage.xby;
import defpackage.yg4;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.AppMetricaYandexConfig;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.MviConfig;
import io.appmetrica.analytics.MviTimestamp;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.push.AppMetricaPush;
import io.appmetrica.analytics.push.provider.firebase.FirebasePushServiceControllerProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.MetricaWrapper$init$1", f = "MetricaWrapper.kt", l = {103, 108, 113, HProv.PP_PASSWD_TERM, HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MetricaWrapper$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ MviTimestamp $startupMviTime;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaWrapper$init$1(q qVar, MviTimestamp mviTimestamp, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$startupMviTime = mviTimestamp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetricaWrapper$init$1(this.this$0, this.$startupMviTime, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MetricaWrapper$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f7, code lost:
    
        if (r10 == r2) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h2c h2cVar;
        Object n;
        Map<String, String> map;
        Object d;
        h2c h2cVar2;
        Map<String, String> map2;
        ?? r5;
        Object b;
        Map<String, String> map3;
        int i;
        boolean booleanValue;
        q qVar;
        Object a;
        AppMetricaYandexConfig.Builder builder;
        int i2;
        AppMetricaYandexConfig.Builder withCustomHosts;
        Object a2;
        AppMetricaYandexConfig.Builder builder2;
        PulseConfig.Builder builder3;
        String uuid;
        String str;
        byte[] bArr;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            h2cVar = new h2c(new dne0(this.this$0.a));
            Map map4 = h2cVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map4.entrySet()) {
                if (!"0".equals((String) entry.getValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                map = h2cVar.b;
                a aVar = (a) this.this$0.c.get();
                this.L$0 = h2cVar;
                this.L$1 = map;
                this.label = 2;
                d = aVar.d(this);
                if (d != coroutineSingletons) {
                    Map<String, String> map5 = map;
                    h2cVar2 = h2cVar;
                    map2 = map5;
                    if (((Boolean) d).booleanValue()) {
                    }
                    r5 = 0;
                    AppMetrica.setDataSendingEnabled(r5);
                    jst.e.getClass();
                    eb20 eb20Var = (eb20) this.this$0.g.get();
                    this.L$0 = h2cVar2;
                    this.L$1 = map2;
                    this.I$0 = r5;
                    this.label = 3;
                    b = eb20Var.a.b(this);
                    if (b != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            g2c g2cVar = new g2c();
            Context context = this.this$0.a;
            Set set = h2cVar.c;
            this.L$0 = h2cVar;
            this.label = 1;
            n = bvf0.n(new ClidManagerInteractor$loadClids$2(context, set, g2cVar, null), this);
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    map2 = (Map) this.L$1;
                    h2c h2cVar3 = (h2c) this.L$0;
                    kotlin.b.b(obj);
                    h2cVar2 = h2cVar3;
                    d = obj;
                    if (((Boolean) d).booleanValue()) {
                        yg4 yg4Var = (yg4) this.this$0.d.get();
                        if (!((Boolean) yg4Var.b.getValue(yg4Var, yg4.c[0])).booleanValue()) {
                            r5 = 1;
                            AppMetrica.setDataSendingEnabled(r5);
                            jst.e.getClass();
                            eb20 eb20Var2 = (eb20) this.this$0.g.get();
                            this.L$0 = h2cVar2;
                            this.L$1 = map2;
                            this.I$0 = r5;
                            this.label = 3;
                            b = eb20Var2.a.b(this);
                            if (b != coroutineSingletons) {
                                int i4 = r5;
                                map3 = map2;
                                i = i4;
                                booleanValue = ((Boolean) b).booleanValue();
                                jst.e.getClass();
                                this.this$0.f.getClass();
                                AppMetricaYandexConfig.Builder withDataSendingEnabled = AppMetricaYandexConfig.newBuilder("286e632e-50db-431a-9ee2-c4335814639b").withDataSendingEnabled(i == 0);
                                this.this$0.e.getClass();
                                this.this$0.e.getClass();
                                AppMetricaYandexConfig.Builder withAnrMonitoring = withDataSendingEnabled.withAppVersion("5.89.0 128354").withClids(map3, Boolean.TRUE).withNativeCrashReporting(false).withAnrMonitoring(booleanValue);
                                qVar = this.this$0;
                                com.yandex.go.proxyprovision.k kVar = qVar.h;
                                this.L$0 = h2cVar2;
                                this.L$1 = null;
                                this.L$2 = withAnrMonitoring;
                                this.L$3 = qVar;
                                this.I$0 = i;
                                this.Z$0 = booleanValue;
                                this.label = 4;
                                a = kVar.a(this);
                                if (a != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    r5 = 0;
                    AppMetrica.setDataSendingEnabled(r5);
                    jst.e.getClass();
                    eb20 eb20Var22 = (eb20) this.this$0.g.get();
                    this.L$0 = h2cVar2;
                    this.L$1 = map2;
                    this.I$0 = r5;
                    this.label = 3;
                    b = eb20Var22.a.b(this);
                    if (b != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i3 == 3) {
                    i = this.I$0;
                    Map<String, String> map6 = (Map) this.L$1;
                    h2c h2cVar4 = (h2c) this.L$0;
                    kotlin.b.b(obj);
                    h2cVar2 = h2cVar4;
                    map3 = map6;
                    b = obj;
                    booleanValue = ((Boolean) b).booleanValue();
                    jst.e.getClass();
                    this.this$0.f.getClass();
                    AppMetricaYandexConfig.Builder withDataSendingEnabled2 = AppMetricaYandexConfig.newBuilder("286e632e-50db-431a-9ee2-c4335814639b").withDataSendingEnabled(i == 0);
                    this.this$0.e.getClass();
                    this.this$0.e.getClass();
                    AppMetricaYandexConfig.Builder withAnrMonitoring2 = withDataSendingEnabled2.withAppVersion("5.89.0 128354").withClids(map3, Boolean.TRUE).withNativeCrashReporting(false).withAnrMonitoring(booleanValue);
                    qVar = this.this$0;
                    com.yandex.go.proxyprovision.k kVar2 = qVar.h;
                    this.L$0 = h2cVar2;
                    this.L$1 = null;
                    this.L$2 = withAnrMonitoring2;
                    this.L$3 = qVar;
                    this.I$0 = i;
                    this.Z$0 = booleanValue;
                    this.label = 4;
                    a = kVar2.a(this);
                    if (a != coroutineSingletons) {
                        builder = withAnrMonitoring2;
                        i2 = i;
                        qVar.p = ((Boolean) a).booleanValue();
                        this.this$0.f.getClass();
                        if (!evu0.J("YandexGoAndroid")) {
                            Context context2 = this.this$0.a;
                            RtmConfig.Builder newBuilder = RtmConfig.newBuilder();
                            newBuilder.withProjectName("YandexGoAndroid");
                            newBuilder.withEnvironment(RtmConfig.Environment.PRODUCTION);
                            uuid = AppMetricaYandex.getUuid(context2);
                            if (uuid != null) {
                            }
                            str = null;
                            if (str != null) {
                            }
                            builder.withRtmConfig(newBuilder.build());
                        }
                        not notVar = (not) ((ju6) this.this$0.i.get());
                        notVar.getClass();
                        String a3 = notVar.a(HostMobSupportedApiNames.METRICA);
                        if (a3 != null) {
                        }
                        this.this$0.f.getClass();
                        if (!evu0.J("ATAXI")) {
                        }
                        AppMetricaYandex.initialize(this.this$0.a, withCustomHosts.build());
                        q qVar2 = this.this$0;
                        ru.yandex.taxi.vendor_api.push.b bVar = qVar2.b;
                        Context context3 = qVar2.a;
                        AppMetricaPush.addPushFilter(context3, bVar.a);
                        AppMetricaPush.activate(context3, new FirebasePushServiceControllerProvider(context3));
                        Context context4 = rcj.a;
                        q qVar3 = this.this$0;
                        rcj.a = qVar3.a;
                        qVar3.q.j0();
                        q qVar4 = this.this$0;
                        qVar4.k(qVar4.a);
                        q qVar5 = this.this$0;
                        AppMetricaYandex.requestStartupParams(qVar5.a, new hc20(qVar5, h2cVar2), IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    builder3 = (PulseConfig.Builder) this.L$6;
                    builder2 = (AppMetricaYandexConfig.Builder) this.L$2;
                    h2c h2cVar5 = (h2c) this.L$0;
                    kotlin.b.b(obj);
                    h2cVar2 = h2cVar5;
                    a2 = obj;
                    str2 = (String) a2;
                    if (str2 != null) {
                        builder3.withUploadUrl(str2);
                    }
                    Pair pair = new Pair("perf_class", ((com.yandex.go.performance_class.a) ((nbj) this.this$0.k.get())).d());
                    builder3.addVariation((String) pair.c(), (String) pair.f());
                    builder3.withMviConfig(new MviConfig.Builder(this.$startupMviTime).withCustomMetricsReporter(this.this$0.l).build());
                    withCustomHosts = builder2.withPulseConfig(builder3.build());
                    AppMetricaYandex.initialize(this.this$0.a, withCustomHosts.build());
                    q qVar22 = this.this$0;
                    ru.yandex.taxi.vendor_api.push.b bVar2 = qVar22.b;
                    Context context32 = qVar22.a;
                    AppMetricaPush.addPushFilter(context32, bVar2.a);
                    AppMetricaPush.activate(context32, new FirebasePushServiceControllerProvider(context32));
                    Context context42 = rcj.a;
                    q qVar32 = this.this$0;
                    rcj.a = qVar32.a;
                    qVar32.q.j0();
                    q qVar42 = this.this$0;
                    qVar42.k(qVar42.a);
                    q qVar52 = this.this$0;
                    AppMetricaYandex.requestStartupParams(qVar52.a, new hc20(qVar52, h2cVar2), IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
                    return zy11.a;
                }
                boolean z = this.Z$0;
                int i5 = this.I$0;
                q qVar6 = (q) this.L$3;
                AppMetricaYandexConfig.Builder builder4 = (AppMetricaYandexConfig.Builder) this.L$2;
                h2c h2cVar6 = (h2c) this.L$0;
                kotlin.b.b(obj);
                a = obj;
                builder = builder4;
                h2cVar2 = h2cVar6;
                qVar = qVar6;
                i2 = i5;
                booleanValue = z;
                qVar.p = ((Boolean) a).booleanValue();
                this.this$0.f.getClass();
                if (!evu0.J("YandexGoAndroid") && this.this$0.p) {
                    Context context22 = this.this$0.a;
                    RtmConfig.Builder newBuilder2 = RtmConfig.newBuilder();
                    newBuilder2.withProjectName("YandexGoAndroid");
                    newBuilder2.withEnvironment(RtmConfig.Environment.PRODUCTION);
                    uuid = AppMetricaYandex.getUuid(context22);
                    if (uuid != null) {
                        try {
                            bArr = MessageDigest.getInstance("MD5").digest(uuid.getBytes(uza.a));
                        } catch (Exception e) {
                            xby.d.k(e, "Got crypto exception");
                            bArr = null;
                        }
                        if (bArr != null) {
                            str = String.valueOf(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).getLong());
                            if (str != null) {
                                newBuilder2.withUserId(str);
                            }
                            builder.withRtmConfig(newBuilder2.build());
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                    builder.withRtmConfig(newBuilder2.build());
                }
                not notVar2 = (not) ((ju6) this.this$0.i.get());
                notVar2.getClass();
                String a32 = notVar2.a(HostMobSupportedApiNames.METRICA);
                withCustomHosts = (a32 != null || evu0.J(a32)) ? builder : builder.withCustomHosts(Collections.singletonList(a32));
                this.this$0.f.getClass();
                if (!evu0.J("ATAXI")) {
                    PulseConfig.Builder newBuilder3 = PulseConfig.newBuilder(this.this$0.a, "ATAXI");
                    this.this$0.f.getClass();
                    newBuilder3.withChannelId(4);
                    com.yandex.go.proxyprovision.mob.e eVar = this.this$0.j;
                    this.L$0 = h2cVar2;
                    this.L$1 = null;
                    this.L$2 = withCustomHosts;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = newBuilder3;
                    this.I$0 = i2;
                    this.Z$0 = booleanValue;
                    this.label = 5;
                    a2 = eVar.a(this);
                    if (a2 != coroutineSingletons) {
                        builder2 = withCustomHosts;
                        builder3 = newBuilder3;
                        str2 = (String) a2;
                        if (str2 != null) {
                        }
                        Pair pair2 = new Pair("perf_class", ((com.yandex.go.performance_class.a) ((nbj) this.this$0.k.get())).d());
                        builder3.addVariation((String) pair2.c(), (String) pair2.f());
                        builder3.withMviConfig(new MviConfig.Builder(this.$startupMviTime).withCustomMetricsReporter(this.this$0.l).build());
                        withCustomHosts = builder2.withPulseConfig(builder3.build());
                    }
                    return coroutineSingletons;
                }
                AppMetricaYandex.initialize(this.this$0.a, withCustomHosts.build());
                q qVar222 = this.this$0;
                ru.yandex.taxi.vendor_api.push.b bVar22 = qVar222.b;
                Context context322 = qVar222.a;
                AppMetricaPush.addPushFilter(context322, bVar22.a);
                AppMetricaPush.activate(context322, new FirebasePushServiceControllerProvider(context322));
                Context context422 = rcj.a;
                q qVar322 = this.this$0;
                rcj.a = qVar322.a;
                qVar322.q.j0();
                q qVar422 = this.this$0;
                qVar422.k(qVar422.a);
                q qVar522 = this.this$0;
                AppMetricaYandex.requestStartupParams(qVar522.a, new hc20(qVar522, h2cVar2), IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
                return zy11.a;
            }
            h2cVar = (h2c) this.L$0;
            kotlin.b.b(obj);
            n = obj;
        }
        map = (Map) n;
        h2cVar.a(map);
        a aVar2 = (a) this.this$0.c.get();
        this.L$0 = h2cVar;
        this.L$1 = map;
        this.label = 2;
        d = aVar2.d(this);
        if (d != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
