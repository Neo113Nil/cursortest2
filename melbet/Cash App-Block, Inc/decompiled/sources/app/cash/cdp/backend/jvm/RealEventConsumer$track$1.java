package app.cash.cdp.backend.jvm;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.cdp.api.providers.ApplicationInfo;
import app.cash.cdp.api.providers.DeviceInfo;
import app.cash.cdp.api.providers.NetworkType;
import app.cash.cdp.api.providers.OperatingSystemInfo;
import app.cash.cdp.backend.android.AndroidDeviceInfoProvider;
import app.cash.cdp.backend.android.CashApplicationInfoProvider;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda1;
import app.cash.cdp.integration.CdpModule$Companion$provideCashCDP$1;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.protos.cash.cdpproxy.api.AnalyticsMessage;
import com.squareup.protos.cash.cdpproxy.api.Application;
import com.squareup.protos.cash.cdpproxy.api.Device;
import com.squareup.protos.cash.cdpproxy.api.Library;
import com.squareup.protos.cash.cdpproxy.api.MessageContext;
import com.squareup.protos.cash.cdpproxy.api.Network;
import com.squareup.protos.cash.cdpproxy.api.OperatingSystem;
import com.squareup.protos.cash.cdpproxy.api.OperatingSystemName;
import com.squareup.protos.cash.cdpproxy.api.ScreenOrientation;
import com.squareup.protos.cash.cdpproxy.api.TrackMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealEventConsumer$track$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $customerToken;
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long $timestampMillis;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealEventConsumer$track$1(RealEventConsumer realEventConsumer, Event event, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realEventConsumer;
        this.$event = event;
        this.$customerToken = str;
        this.$timestampMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$customerToken;
        Object obj3 = this.$event;
        switch (i) {
            case 0:
                return new RealEventConsumer$track$1((RealEventConsumer) this.this$0, (Event) obj3, (String) obj2, this.$timestampMillis, continuation);
            default:
                return new RealEventConsumer$track$1((ProducerScope) obj3, (BufferedChannel) obj2, this.$timestampMillis, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((RealEventConsumer$track$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((RealEventConsumer$track$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r2, r37) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r11 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r6)._channel.send(r11, r37) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        if (r2.length() > 0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:14:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        NetworkType networkType;
        int i;
        ScreenOrientation screenOrientation;
        com.squareup.protos.cash.cdpproxy.api.NetworkType networkType2;
        app.cash.cdp.persistence.api.Event event;
        Object obj2;
        ProducerScope producerScope;
        int i2 = this.$r8$classId;
        long j = this.$timestampMillis;
        Object obj3 = this.$customerToken;
        Object obj4 = this.$event;
        switch (i2) {
            case 0:
                Event event2 = (Event) obj4;
                RealEventConsumer realEventConsumer = (RealEventConsumer) this.this$0;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    WorkLauncherImpl workLauncherImpl = realEventConsumer.payloadSerializer;
                    event2.getClass();
                    Map parameters = event2.getParameters();
                    EmptySet emptySet = EmptySet.INSTANCE;
                    parameters.getClass();
                    emptySet.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : parameters.entrySet()) {
                        Object value = entry.getValue();
                        if (!(value instanceof Map) && !(value instanceof List)) {
                            entry.getKey();
                            linkedHashMap.put(entry.getKey(), value);
                        }
                    }
                    String json = ((Moshi) workLauncherImpl.processor).adapter((Util.ParameterizedTypeImpl) workLauncherImpl.workTaskExecutor).toJson(linkedHashMap);
                    json.getClass();
                    String name = event2.getName();
                    EmptyList emptyList = EmptyList.INSTANCE;
                    ByteString byteString = ByteString.EMPTY;
                    TrackMessage trackMessage = new TrackMessage(name, json, emptyList, byteString);
                    String str2 = (String) obj3;
                    String simpleName = event2.getClass().getSimpleName();
                    Timber.Forest forest = Timber.Forest;
                    forest.v("EventConsumer track: " + trackMessage, new Object[0]);
                    if (trackMessage.event_name == null) {
                        forest.e(new IllegalStateException("CASHA-8148: Tracked messages shouldn't be tracked with null event names: message = " + trackMessage + ", className = " + simpleName));
                        event = null;
                    } else {
                        ImageLoader$Builder imageLoader$Builder = realEventConsumer.contextProvider;
                        String str3 = (String) ((ReadonlyStateFlow) imageLoader$Builder.extras).$$delegate_0.getValue();
                        String appTokenOrNull = PlatformKt.appTokenOrNull(((CdpModule$Companion$provideCashCDP$1) imageLoader$Builder.application).$tmp0);
                        DeviceInfo deviceInfo = ((AndroidDeviceInfoProvider) imageLoader$Builder.defaults).getDeviceInfo();
                        OperatingSystemInfo.Name name2 = OperatingSystemInfo.Name.ANDROID;
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        ApplicationInfo applicationInfo = ((CashApplicationInfoProvider) imageLoader$Builder.mainCoroutineContextLazy).getApplicationInfo();
                        String languageTag = ((Locale) ((Function0) imageLoader$Builder.memoryCacheLazy).invoke()).toLanguageTag();
                        languageTag.getClass();
                        String str5 = ((CdpModule$Companion$$ExternalSyntheticLambda1) imageLoader$Builder.diskCacheLazy).f$0;
                        WorkLauncherImpl workLauncherImpl2 = (WorkLauncherImpl) imageLoader$Builder.eventListenerFactory;
                        TelephonyManager telephonyManager = (TelephonyManager) workLauncherImpl2.workTaskExecutor;
                        if (telephonyManager.getPhoneType() != 2) {
                            str = telephonyManager.getNetworkOperatorName();
                            str.getClass();
                            break;
                        }
                        str = null;
                        ConnectivityManager connectivityManager = (ConnectivityManager) workLauncherImpl2.processor;
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            if (networkCapabilities.hasTransport(1)) {
                                networkType = NetworkType.WIFI;
                            } else if (networkCapabilities.hasTransport(0)) {
                                networkType = NetworkType.CELLULAR;
                            } else if (networkCapabilities.hasTransport(2)) {
                                networkType = NetworkType.BLUETOOTH;
                            }
                            String id = TimeZone.getDefault().getID();
                            id.getClass();
                            String str6 = ((ProductionAppsFlyerClient) ((AppsFlyerClient) ((OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) imageLoader$Builder.componentRegistry).f$0)).appsFlyerId;
                            NetworkType networkType3 = networkType;
                            String str7 = deviceInfo.id;
                            String str8 = Build.MANUFACTURER;
                            String str9 = Build.MODEL;
                            DeviceInfo.Sim sim = deviceInfo.sim;
                            String str10 = sim.countryIso;
                            String str11 = sim.mcc;
                            String str12 = sim.mnc;
                            DeviceInfo.Screen screen = deviceInfo.screen;
                            Integer valueOf = Integer.valueOf(screen.height);
                            Integer valueOf2 = Integer.valueOf(screen.width);
                            String str13 = screen.dpi;
                            DeviceInfo.Screen.Orientation orientation = screen.orientation;
                            i = orientation != null ? -1 : RealEventConsumerKt$WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
                            if (i != -1) {
                                screenOrientation = ScreenOrientation.UNSPECIFIED;
                            } else if (i == 1) {
                                screenOrientation = ScreenOrientation.PORTRAIT;
                            } else {
                                if (i != 2) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenOrientation = ScreenOrientation.LANDSCAPE;
                            }
                            Device device = new Device(str7, null, str8, str9, str10, str11, str12, valueOf, valueOf2, str13, screenOrientation, null, null, byteString);
                            if (RealEventConsumerKt$WhenMappings.$EnumSwitchMapping$2[0] == 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            OperatingSystem operatingSystem = new OperatingSystem(OperatingSystemName.ANDROID, str4, byteString);
                            Application application = new Application("cash-android", applicationInfo.version, applicationInfo.build, applicationInfo.packageName, byteString);
                            Library library = new Library("cashapp_android_cdp", "1.0.0", byteString);
                            int i4 = networkType3 == null ? -1 : RealEventConsumerKt$WhenMappings.$EnumSwitchMapping$0[networkType3.ordinal()];
                            if (i4 == -1) {
                                networkType2 = null;
                            } else if (i4 == 1) {
                                networkType2 = com.squareup.protos.cash.cdpproxy.api.NetworkType.BLUETOOTH;
                            } else if (i4 == 2) {
                                networkType2 = com.squareup.protos.cash.cdpproxy.api.NetworkType.WIFI;
                            } else {
                                if (i4 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                networkType2 = com.squareup.protos.cash.cdpproxy.api.NetworkType.CELLULAR;
                            }
                            AnalyticsMessage analyticsMessage = new AnalyticsMessage(new MessageContext(device, operatingSystem, application, library, languageTag, new Network(str, networkType2, null, byteString), str5, null, id, null, null, null, byteString), UUID.randomUUID().toString(), str2, appTokenOrNull, Long.valueOf(j), new AnalyticsMessage.Payload.Track(trackMessage), str3, str6, null, null, byteString);
                            forest.v("Persisting: " + analyticsMessage, new Object[0]);
                            String str14 = analyticsMessage.message_uuid;
                            str14.getClass();
                            Long l = analyticsMessage.timestamp_since_epoch_millis;
                            l.getClass();
                            event = new app.cash.cdp.persistence.api.Event(str14, l.longValue(), AnalyticsMessage.ADAPTER.encode(analyticsMessage));
                        }
                        networkType = null;
                        String id2 = TimeZone.getDefault().getID();
                        id2.getClass();
                        String str62 = ((ProductionAppsFlyerClient) ((AppsFlyerClient) ((OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) imageLoader$Builder.componentRegistry).f$0)).appsFlyerId;
                        NetworkType networkType32 = networkType;
                        String str72 = deviceInfo.id;
                        String str82 = Build.MANUFACTURER;
                        String str92 = Build.MODEL;
                        DeviceInfo.Sim sim2 = deviceInfo.sim;
                        String str102 = sim2.countryIso;
                        String str112 = sim2.mcc;
                        String str122 = sim2.mnc;
                        DeviceInfo.Screen screen2 = deviceInfo.screen;
                        Integer valueOf3 = Integer.valueOf(screen2.height);
                        Integer valueOf22 = Integer.valueOf(screen2.width);
                        String str132 = screen2.dpi;
                        DeviceInfo.Screen.Orientation orientation2 = screen2.orientation;
                        if (orientation2 != null) {
                        }
                        if (i != -1) {
                        }
                        Device device2 = new Device(str72, null, str82, str92, str102, str112, str122, valueOf3, valueOf22, str132, screenOrientation, null, null, byteString);
                        if (RealEventConsumerKt$WhenMappings.$EnumSwitchMapping$2[0] == 1) {
                        }
                    }
                    if (event != null) {
                        PersistedEventRepository persistedEventRepository = realEventConsumer.eventRepository;
                        this.label = 1;
                        Object withContext = JobKt.withContext(persistedEventRepository.ioDispatcher, new RealGcmRegistrar$unregister$2(persistedEventRepository, event, null, 6), this);
                        if (withContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj5) {
                            return obj5;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        producerScope = (ProducerScope) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        obj2 = obj;
                        this.this$0 = null;
                        this.label = 2;
                        break;
                    } else if (i5 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        this.label = 3;
                        break;
                    } else if (i5 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                producerScope = (ProducerScope) obj4;
                this.this$0 = producerScope;
                this.label = 1;
                obj2 = BufferedChannel.receive$suspendImpl((BufferedChannel) obj3, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealEventConsumer$track$1(ProducerScope producerScope, BufferedChannel bufferedChannel, long j, Continuation continuation) {
        super(2, continuation);
        this.$event = producerScope;
        this.$customerToken = bufferedChannel;
        this.$timestampMillis = j;
    }
}
