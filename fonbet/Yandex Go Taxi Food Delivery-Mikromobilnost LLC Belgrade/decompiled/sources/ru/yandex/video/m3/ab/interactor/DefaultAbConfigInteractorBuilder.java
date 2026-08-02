package ru.yandex.video.m3.ab.interactor;

import android.content.Context;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.g221;
import defpackage.ike;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.lse;
import defpackage.mdh;
import defpackage.oyr;
import defpackage.qf60;
import defpackage.qhw0;
import defpackage.qoi0;
import defpackage.sbx;
import defpackage.sjh;
import defpackage.sls;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xbi0;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.api.AbConfigApi;
import ru.yandex.video.m3.ab.database.impl.AbConfigDatabaseImpl;
import ru.yandex.video.m3.ab.interactor.strategy.UtilKt;
import ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler;
import ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateSchedulerImpl;
import ru.yandex.video.m3.ab.internal.SticknessHolderImpl;
import ru.yandex.video.m3.ab.internal.VpuidHolder;
import ru.yandex.video.m3.ab.internal.VpuidHolderImpl;
import ru.yandex.video.m3.ab.internal.testing.TestingAbConfigRepositoryImpl;
import ru.yandex.video.m3.ab.internal.testing.TestingAbConfigUpdateScheduler;
import ru.yandex.video.m3.ab.internal.testing.TestingParameters;
import ru.yandex.video.m3.ab.repository.AbConfigRepository;
import ru.yandex.video.m3.ab.repository.impl.AbConfigRepositoryImpl;
import ru.yandex.video.m3.ab.util.VsidToAbConfigHolder;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.provider.internal.UuidProviderImpl;
import ru.yandex.video.m3.player.provider.internal.VpuidProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rR+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010$\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010+\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020%8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0011\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010>\u001a\u0002082\u0006\u0010\u000f\u001a\u0002088@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0011\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010E\u001a\u00020?2\u0006\u0010\u000f\u001a\u00020?8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0011\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractorBuilder;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deviceId", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "createInfoProvider", "(Landroid/content/Context;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractor;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractor;", "build", "<set-?>", "context$delegate", "Lxbi0;", "getContext$video_player_internalRelease", "()Landroid/content/Context;", "setContext$video_player_internalRelease", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "okHttpClientProvider$delegate", "getOkHttpClientProvider$video_player_internalRelease", "()Lsls;", "setOkHttpClientProvider$video_player_internalRelease", "(Lsls;)V", "okHttpClientProvider", "Lsbx;", "json$delegate", "getJson$video_player_internalRelease", "()Lsbx;", "setJson$video_player_internalRelease", "(Lsbx;)V", "json", "Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "vsidToConfigHolder$delegate", "getVsidToConfigHolder$video_player_internalRelease", "()Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", "setVsidToConfigHolder$video_player_internalRelease", "(Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;)V", "vsidToConfigHolder", "", "updateStrategy", CA20Status.STATUS_USER_I, "getUpdateStrategy$video_player_internalRelease", "()I", "setUpdateStrategy$video_player_internalRelease", "(I)V", "Ljava/lang/String;", "getDeviceId$video_player_internalRelease", "()Ljava/lang/String;", "setDeviceId$video_player_internalRelease", "(Ljava/lang/String;)V", "", "abConfigUpdatePollingMs$delegate", "getAbConfigUpdatePollingMs$video_player_internalRelease", "()J", "setAbConfigUpdatePollingMs$video_player_internalRelease", "(J)V", "abConfigUpdatePollingMs", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "testingParameters$delegate", "getTestingParameters$video_player_internalRelease", "()Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "setTestingParameters$video_player_internalRelease", "(Lru/yandex/video/m3/ab/internal/testing/TestingParameters;)V", "testingParameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAbConfigInteractorBuilder {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("context", 0, "getContext$video_player_internalRelease()Landroid/content/Context;", DefaultAbConfigInteractorBuilder.class), oyr.B(qoi0.a, DefaultAbConfigInteractorBuilder.class, "okHttpClientProvider", "getOkHttpClientProvider$video_player_internalRelease()Lkotlin/jvm/functions/Function0;", 0), new MutablePropertyReference1Impl("json", 0, "getJson$video_player_internalRelease()Lkotlinx/serialization/json/Json;", DefaultAbConfigInteractorBuilder.class), new MutablePropertyReference1Impl("vsidToConfigHolder", 0, "getVsidToConfigHolder$video_player_internalRelease()Lru/yandex/video/m3/ab/util/VsidToAbConfigHolder;", DefaultAbConfigInteractorBuilder.class), new MutablePropertyReference1Impl("abConfigUpdatePollingMs", 0, "getAbConfigUpdatePollingMs$video_player_internalRelease()J", DefaultAbConfigInteractorBuilder.class), new MutablePropertyReference1Impl("testingParameters", 0, "getTestingParameters$video_player_internalRelease()Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", DefaultAbConfigInteractorBuilder.class)};
    public static final int $stable = 8;
    private String deviceId;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final xbi0 context = new qf60();

    /* renamed from: okHttpClientProvider$delegate, reason: from kotlin metadata */
    private final xbi0 okHttpClientProvider = new qf60();

    /* renamed from: json$delegate, reason: from kotlin metadata */
    private final xbi0 json = new qf60();

    /* renamed from: vsidToConfigHolder$delegate, reason: from kotlin metadata */
    private final xbi0 vsidToConfigHolder = new qf60();
    private int updateStrategy = 1;

    /* renamed from: abConfigUpdatePollingMs$delegate, reason: from kotlin metadata */
    private final xbi0 abConfigUpdatePollingMs = new qf60();

    /* renamed from: testingParameters$delegate, reason: from kotlin metadata */
    private final xbi0 testingParameters = new qf60();

    private final InfoProvider createInfoProvider(Context context, final String deviceId) {
        return deviceId == null ? new InfoProviderImpl(context) : new InfoProviderImpl(context, new VpuidProvider() { // from class: ru.yandex.video.m3.ab.interactor.DefaultAbConfigInteractorBuilder$createInfoProvider$deviceIdVpuidProvider$1
            @Override // ru.yandex.video.m3.player.provider.internal.VpuidProvider
            /* renamed from: getVpuid, reason: from getter */
            public String get$deviceId() {
                return deviceId;
            }
        });
    }

    public final DefaultAbConfigInteractor build$video_player_internalRelease() {
        AbConfigRepository abConfigRepositoryImpl;
        AbConfigUpdateScheduler abConfigUpdateSchedulerImpl;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        mdh.b.getClass();
        ike a2 = bvf0.a(cvw.U(a, g221.b.P(1)).plus(new DefaultAbConfigInteractorBuilder$build$$inlined$CoroutineExceptionHandler$1(lse.a)));
        InfoProvider createInfoProvider = createInfoProvider(getContext$video_player_internalRelease(), this.deviceId);
        AbConfigApi abConfigApi = new AbConfigApi((OkHttpClient) getOkHttpClientProvider$video_player_internalRelease().invoke(), new UuidProviderImpl(getContext$video_player_internalRelease().getApplicationContext()), createInfoProvider, getJson$video_player_internalRelease(), createInfoProvider.getAppInfo().getApplicationId(), null, null, 96, null);
        TestingParameters testingParameters$video_player_internalRelease = getTestingParameters$video_player_internalRelease();
        if (testingParameters$video_player_internalRelease instanceof TestingParameters.Debug) {
            TestingParameters.Debug debug = (TestingParameters.Debug) testingParameters$video_player_internalRelease;
            VpuidHolder vpuidHolder = debug.getVpuidHolder();
            VpuidHolderImpl vpuidHolderImpl = vpuidHolder instanceof VpuidHolderImpl ? (VpuidHolderImpl) vpuidHolder : null;
            if (vpuidHolderImpl != null) {
                String vpuid = createInfoProvider.getVpuid();
                if (vpuid == null) {
                    vpuid = "unknown_vpuid";
                }
                vpuidHolderImpl.onVpuidObtained$video_player_internalRelease(vpuid);
            }
            abConfigRepositoryImpl = new TestingAbConfigRepositoryImpl(new AbConfigRepositoryImpl(AbConfigDatabaseImpl.INSTANCE.get()), (SticknessHolderImpl) debug.getSticknessHolder());
            abConfigUpdateSchedulerImpl = new TestingAbConfigUpdateScheduler(new AbConfigUpdateSchedulerImpl(a2, abConfigRepositoryImpl, abConfigApi, getAbConfigUpdatePollingMs$video_player_internalRelease()));
        } else {
            if (!(testingParameters$video_player_internalRelease instanceof TestingParameters.Companion)) {
                w511.b();
                return null;
            }
            abConfigRepositoryImpl = new AbConfigRepositoryImpl(AbConfigDatabaseImpl.INSTANCE.get());
            abConfigUpdateSchedulerImpl = new AbConfigUpdateSchedulerImpl(a2, abConfigRepositoryImpl, abConfigApi, getAbConfigUpdatePollingMs$video_player_internalRelease());
        }
        return new DefaultAbConfigInteractor(abConfigRepositoryImpl, abConfigUpdateSchedulerImpl, UtilKt.toImpl(this.updateStrategy, abConfigRepositoryImpl.getConfig()), getVsidToConfigHolder$video_player_internalRelease());
    }

    public final long getAbConfigUpdatePollingMs$video_player_internalRelease() {
        return ((Number) this.abConfigUpdatePollingMs.getValue(this, $$delegatedProperties[4])).longValue();
    }

    public final Context getContext$video_player_internalRelease() {
        return (Context) this.context.getValue(this, $$delegatedProperties[0]);
    }

    /* renamed from: getDeviceId$video_player_internalRelease, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final sbx getJson$video_player_internalRelease() {
        return (sbx) this.json.getValue(this, $$delegatedProperties[2]);
    }

    public final sls getOkHttpClientProvider$video_player_internalRelease() {
        return (sls) this.okHttpClientProvider.getValue(this, $$delegatedProperties[1]);
    }

    public final TestingParameters getTestingParameters$video_player_internalRelease() {
        return (TestingParameters) this.testingParameters.getValue(this, $$delegatedProperties[5]);
    }

    /* renamed from: getUpdateStrategy$video_player_internalRelease, reason: from getter */
    public final int getUpdateStrategy() {
        return this.updateStrategy;
    }

    public final VsidToAbConfigHolder getVsidToConfigHolder$video_player_internalRelease() {
        return (VsidToAbConfigHolder) this.vsidToConfigHolder.getValue(this, $$delegatedProperties[3]);
    }

    public final void setAbConfigUpdatePollingMs$video_player_internalRelease(long j) {
        this.abConfigUpdatePollingMs.setValue(this, $$delegatedProperties[4], Long.valueOf(j));
    }

    public final void setContext$video_player_internalRelease(Context context) {
        this.context.setValue(this, $$delegatedProperties[0], context);
    }

    public final void setDeviceId$video_player_internalRelease(String str) {
        this.deviceId = str;
    }

    public final void setJson$video_player_internalRelease(sbx sbxVar) {
        this.json.setValue(this, $$delegatedProperties[2], sbxVar);
    }

    public final void setOkHttpClientProvider$video_player_internalRelease(sls slsVar) {
        this.okHttpClientProvider.setValue(this, $$delegatedProperties[1], slsVar);
    }

    public final void setTestingParameters$video_player_internalRelease(TestingParameters testingParameters) {
        this.testingParameters.setValue(this, $$delegatedProperties[5], testingParameters);
    }

    public final void setUpdateStrategy$video_player_internalRelease(int i) {
        this.updateStrategy = i;
    }

    public final void setVsidToConfigHolder$video_player_internalRelease(VsidToAbConfigHolder vsidToAbConfigHolder) {
        this.vsidToConfigHolder.setValue(this, $$delegatedProperties[3], vsidToAbConfigHolder);
    }
}
