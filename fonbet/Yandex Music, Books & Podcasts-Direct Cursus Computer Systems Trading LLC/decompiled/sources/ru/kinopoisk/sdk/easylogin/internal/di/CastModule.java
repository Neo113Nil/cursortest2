package ru.kinopoisk.sdk.easylogin.internal.di;

import android.content.SharedPreferences;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesTo;
import defpackage.b6e;
import defpackage.szm;
import defpackage.tah;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;
import ru.kinopoisk.sdk.easylogin.internal.D0;
import ru.kinopoisk.sdk.easylogin.internal.E0;
import ru.kinopoisk.sdk.easylogin.internal.F0;
import ru.kinopoisk.sdk.easylogin.internal.G0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1092j5;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1188q3;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;
import ru.kinopoisk.sdk.easylogin.internal.J;
import ru.kinopoisk.sdk.easylogin.internal.P0;
import ru.kinopoisk.sdk.easylogin.internal.T0;
import ru.kinopoisk.sdk.easylogin.internal.impl.CastTrackerImpl;
import ru.kinopoisk.sdk.easylogin.internal.impl.SessionLoggerPreferencesStorageImpl;
import timber.log.Timber;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H'¢\u0006\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/CastModule;", "", "Lru/kinopoisk/sdk/easylogin/internal/impl/CastTrackerImpl;", "impl", "Lru/kinopoisk/sdk/easylogin/internal/G0;", "bindCastTracker", "(Lru/kinopoisk/sdk/easylogin/internal/impl/CastTrackerImpl;)Lru/kinopoisk/sdk/easylogin/internal/G0;", "", "Lru/kinopoisk/sdk/easylogin/internal/z0$c;", "Lru/kinopoisk/sdk/easylogin/internal/z0;", "castDevicesManagers", "()Ljava/util/Map;", "Lru/kinopoisk/sdk/easylogin/internal/D0$a;", "castCastPlayerFactories", "Companion", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@ContributesTo(scope = J.class)
/* loaded from: classes5.dex */
public interface CastModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JI\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00062\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/di/CastModule$Companion;", "", "<init>", "()V", "Lru/kinopoisk/sdk/easylogin/internal/q0;", "castAvailabilityProvider", "", "Lru/kinopoisk/sdk/easylogin/internal/z0$c;", "Lszm;", "Lru/kinopoisk/sdk/easylogin/internal/z0;", "castDevicesManagers", "Lru/kinopoisk/sdk/easylogin/internal/F0;", "castSessionLogger", "Lru/kinopoisk/sdk/easylogin/internal/G0;", "castTracker", "provideCombinedCastDeviceManager", "(Lru/kinopoisk/sdk/easylogin/internal/q0;Ljava/util/Map;Lru/kinopoisk/sdk/easylogin/internal/F0;Lru/kinopoisk/sdk/easylogin/internal/G0;)Lru/kinopoisk/sdk/easylogin/internal/z0;", "Lru/kinopoisk/sdk/easylogin/internal/D0$a;", "castCastPlayerFactories", "castDevicesManager", "Lru/kinopoisk/sdk/easylogin/internal/D0;", "provideCombinedCastPlayer", "(Lru/kinopoisk/sdk/easylogin/internal/q0;Ljava/util/Map;Lru/kinopoisk/sdk/easylogin/internal/z0;Lru/kinopoisk/sdk/easylogin/internal/F0;Lru/kinopoisk/sdk/easylogin/internal/G0;)Lru/kinopoisk/sdk/easylogin/internal/D0;", "Lru/kinopoisk/sdk/easylogin/internal/q3;", "errorReporter", "Lru/kinopoisk/sdk/easylogin/internal/j6;", "logReporter", "Landroid/content/SharedPreferences;", "sharedPreferences", "provideCastLogger", "(Lru/kinopoisk/sdk/easylogin/internal/q3;Lru/kinopoisk/sdk/easylogin/internal/j6;Landroid/content/SharedPreferences;)Lru/kinopoisk/sdk/easylogin/internal/F0;", "provideCastAvailabilityProvider", "()Lru/kinopoisk/sdk/easylogin/internal/q0;", "products_android_sdk_easyloginmobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final InterfaceC1185q0 provideCastAvailabilityProvider() {
            return new InterfaceC1185q0() { // from class: ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCastAvailabilityProvider$1

                @Metadata(k = 3, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[InterfaceC1305z0.c.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            InterfaceC1305z0.c cVar = InterfaceC1305z0.c.Quasar;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            InterfaceC1305z0.c cVar2 = InterfaceC1305z0.c.Quasar;
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            InterfaceC1305z0.c cVar3 = InterfaceC1305z0.c.Quasar;
                            iArr[3] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            InterfaceC1305z0.c cVar4 = InterfaceC1305z0.c.Quasar;
                            iArr[4] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0
                public boolean isConnectAvailable(InterfaceC1305z0.c type) {
                    type.getClass();
                    return false;
                }

                @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1185q0
                public boolean isDiscoveryAvailable(InterfaceC1305z0.c type) {
                    type.getClass();
                    int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                    if (i == 1) {
                        return false;
                    }
                    if (i == 2 || i == 3 || i == 4 || i == 5) {
                        return true;
                    }
                    b6e.s();
                    return false;
                }
            };
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCastLogger$1] */
        @NotNull
        public final F0 provideCastLogger(@NotNull InterfaceC1188q3 errorReporter, @NotNull InterfaceC1093j6 logReporter, @NotNull SharedPreferences sharedPreferences) {
            errorReporter.getClass();
            logReporter.getClass();
            sharedPreferences.getClass();
            return new F0(new C1121l6(logReporter, new InterfaceC1092j5() { // from class: ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCastLogger$1
                private final Gson gson = new Gson();

                public <T> T from(String json, Type type) {
                    json.getClass();
                    type.getClass();
                    return null;
                }

                public final Gson getGson() {
                    return this.gson;
                }

                @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1092j5
                public <T> String to(T model) {
                    String j = this.gson.j(model);
                    j.getClass();
                    return j;
                }
            }, errorReporter), new SessionLoggerPreferencesStorageImpl(sharedPreferences, "cast"));
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCombinedCastDeviceManager$1] */
        @NotNull
        public final InterfaceC1305z0 provideCombinedCastDeviceManager(@NotNull InterfaceC1185q0 castAvailabilityProvider, @NotNull Map<InterfaceC1305z0.c, szm> castDevicesManagers, @NotNull F0 castSessionLogger, @NotNull G0 castTracker) {
            castAvailabilityProvider.getClass();
            castDevicesManagers.getClass();
            castSessionLogger.getClass();
            castTracker.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<InterfaceC1305z0.c, szm> entry : castDevicesManagers.entrySet()) {
                if (castAvailabilityProvider.isDiscoveryAvailable(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), (InterfaceC1305z0) ((szm) entry2.getValue()).get());
            }
            Timber.INSTANCE.tag("CastModule").d("activeCastDevicesManagers: %s", linkedHashMap2.keySet());
            return new P0(linkedHashMap2, new E0() { // from class: ru.kinopoisk.sdk.easylogin.internal.di.CastModule$Companion$provideCombinedCastDeviceManager$1
                @Override // ru.kinopoisk.sdk.easylogin.internal.E0
                public void start() {
                }
            }, castSessionLogger, castTracker);
        }

        @NotNull
        public final D0 provideCombinedCastPlayer(@NotNull InterfaceC1185q0 castAvailabilityProvider, @NotNull Map<InterfaceC1305z0.c, szm> castCastPlayerFactories, @NotNull InterfaceC1305z0 castDevicesManager, @NotNull F0 castSessionLogger, @NotNull G0 castTracker) {
            castAvailabilityProvider.getClass();
            castCastPlayerFactories.getClass();
            castDevicesManager.getClass();
            castSessionLogger.getClass();
            castTracker.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<InterfaceC1305z0.c, szm> entry : castCastPlayerFactories.entrySet()) {
                if (castAvailabilityProvider.isConnectAvailable(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), (D0.a) ((szm) entry2.getValue()).get());
            }
            Timber.INSTANCE.tag("CastModule").d("activeCastPlayerFactories: %s", linkedHashMap2.keySet());
            return new T0(linkedHashMap2, castDevicesManager, castSessionLogger, castTracker);
        }
    }

    @NotNull
    G0 bindCastTracker(@NotNull CastTrackerImpl impl);

    @NotNull
    Map<InterfaceC1305z0.c, D0.a> castCastPlayerFactories();

    @NotNull
    Map<InterfaceC1305z0.c, InterfaceC1305z0> castDevicesManagers();
}
