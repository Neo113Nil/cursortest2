package g5;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.core.internal.config.c;
import f5.InterfaceC4515a;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import t4.f;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4529a implements InterfaceC4515a {
    public static final C0254a Companion = new C0254a(null);
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> firebaseAnalyticsClass;
    private final f _applicationService;
    private final c _configModelStore;
    private final G4.a _time;
    private AtomicLong lastOpenedTime;
    private String lastReceivedNotificationCampaign;
    private String lastReceivedNotificationId;
    private AtomicLong lastReceivedTime;
    private Object mFirebaseAnalyticsInstance;

    /* renamed from: g5.a$a, reason: collision with other inner class name */
    public static final class C0254a {
        public /* synthetic */ C0254a(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getInstanceMethod(Class<?> cls) {
            try {
                h.b(cls);
                return cls.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getTrackMethod(Class<?> cls) {
            try {
                h.b(cls);
                return cls.getMethod("logEvent", String.class, Bundle.class);
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
                return null;
            }
        }

        public final boolean canTrack() {
            try {
                C4529a.firebaseAnalyticsClass = Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        private C0254a() {
        }
    }

    public C4529a(f _applicationService, c _configModelStore, G4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_configModelStore, "_configModelStore");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    private final Object getFirebaseAnalyticsInstance() {
        if (this.mFirebaseAnalyticsInstance == null) {
            Method instanceMethod = Companion.getInstanceMethod(firebaseAnalyticsClass);
            try {
                h.b(instanceMethod);
                this.mFirebaseAnalyticsInstance = instanceMethod.invoke(null, this._applicationService.getAppContext());
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private final boolean isEnabled() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getFirebaseAnalytics();
    }

    @Override // f5.InterfaceC4515a
    public void trackInfluenceOpenEvent() {
        if (!isEnabled() || this.lastReceivedTime == null || this.lastReceivedNotificationId == null) {
            return;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        AtomicLong atomicLong = this.lastReceivedTime;
        h.b(atomicLong);
        if (currentTimeMillis - atomicLong.get() > 120000) {
            return;
        }
        AtomicLong atomicLong2 = this.lastOpenedTime;
        if (atomicLong2 != null) {
            h.b(atomicLong2);
            if (currentTimeMillis - atomicLong2.get() < 30000) {
                return;
            }
        }
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
            Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", com.onesignal.common.threading.b.BASE_THREAD_NAME);
            bundle.putString("medium", "notification");
            String str = this.lastReceivedNotificationId;
            h.b(str);
            bundle.putString(H5.e.NOTIFICATION_ID_TAG, str);
            String str2 = this.lastReceivedNotificationCampaign;
            h.b(str2);
            bundle.putString("campaign", str2);
            h.b(trackMethod);
            trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // f5.InterfaceC4515a
    public void trackOpenedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
        if (isEnabled()) {
            if (this.lastOpenedTime == null) {
                this.lastOpenedTime = new AtomicLong();
            }
            AtomicLong atomicLong = this.lastOpenedTime;
            h.b(atomicLong);
            atomicLong.set(this._time.getCurrentTimeMillis());
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", com.onesignal.common.threading.b.BASE_THREAD_NAME);
                bundle.putString("medium", "notification");
                bundle.putString(H5.e.NOTIFICATION_ID_TAG, notificationId);
                bundle.putString("campaign", campaign);
                h.b(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_OPENED, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // f5.InterfaceC4515a
    public void trackReceivedEvent(String notificationId, String campaign) {
        h.e(notificationId, "notificationId");
        h.e(campaign, "campaign");
        if (isEnabled()) {
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", com.onesignal.common.threading.b.BASE_THREAD_NAME);
                bundle.putString("medium", "notification");
                bundle.putString(H5.e.NOTIFICATION_ID_TAG, notificationId);
                bundle.putString("campaign", campaign);
                h.b(trackMethod);
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_RECEIVED, bundle);
                if (this.lastReceivedTime == null) {
                    this.lastReceivedTime = new AtomicLong();
                }
                AtomicLong atomicLong = this.lastReceivedTime;
                h.b(atomicLong);
                atomicLong.set(this._time.getCurrentTimeMillis());
                this.lastReceivedNotificationId = notificationId;
                this.lastReceivedNotificationCampaign = campaign;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
