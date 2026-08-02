package io.appmetrica.analytics.push;

import android.app.NotificationChannel;
import android.content.Context;
import io.appmetrica.analytics.push.event.AdditionalActionPushEvent;
import io.appmetrica.analytics.push.event.DismissPushEvent;
import io.appmetrica.analytics.push.event.ExpiredPushEvent;
import io.appmetrica.analytics.push.event.IgnoredPushEvent;
import io.appmetrica.analytics.push.event.InlineAdditionalActionPushEvent;
import io.appmetrica.analytics.push.event.OpenPushEvent;
import io.appmetrica.analytics.push.event.ProcessSilentPushEvent;
import io.appmetrica.analytics.push.event.PushEvent;
import io.appmetrica.analytics.push.event.PushEventListener;
import io.appmetrica.analytics.push.event.ReceivePushEvent;
import io.appmetrica.analytics.push.event.RemovedPushEvent;
import io.appmetrica.analytics.push.event.ReplacePushEvent;
import io.appmetrica.analytics.push.event.ShownPushEvent;
import io.appmetrica.analytics.push.impl.AbstractC1010a2;
import io.appmetrica.analytics.push.impl.AbstractC1013b1;
import io.appmetrica.analytics.push.impl.AbstractC1021d1;
import io.appmetrica.analytics.push.impl.AbstractC1070r1;
import io.appmetrica.analytics.push.impl.C1080v;
import io.appmetrica.analytics.push.impl.P1;
import io.appmetrica.analytics.push.impl.V0;
import io.appmetrica.analytics.push.impl.Y1;
import io.appmetrica.analytics.push.impl.Z1;
import io.appmetrica.analytics.push.impl.r;
import io.appmetrica.analytics.push.impl.y2;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.location.LocationProvider;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.notification.NotificationCustomizersHolder;
import io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider;
import io.appmetrica.analytics.push.provider.firebase.FirebasePushServiceControllerProvider;
import io.appmetrica.analytics.push.settings.AutoTrackingConfiguration;
import io.appmetrica.analytics.push.settings.PassportUidProvider;
import io.appmetrica.analytics.push.settings.PushFilter;
import io.appmetrica.analytics.push.settings.PushFilteredCallback;
import io.appmetrica.analytics.push.settings.PushMessageTracker;
import io.appmetrica.analytics.push.settings.PushNotificationFactory;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AppMetricaPush {
    public static final String EXTRA_ACTION_INFO = "io.appmetrica.analytics.push.extra.ACTION_INFO";
    public static final String EXTRA_PAYLOAD = ".extra.payload";
    public static final String OPEN_DEFAULT_ACTIVITY_ACTION = "io.appmetrica.analytics.push.action.OPEN";
    private static volatile r a;
    private static final Object b = new Object();

    public static synchronized void activate(Context context) {
        synchronized (AppMetricaPush.class) {
            if (a == null) {
                synchronized (b) {
                    try {
                        if (a == null) {
                            r a2 = r.a(context);
                            a2.getClass();
                            a2.a(new FirebasePushServiceControllerProvider(a2.a));
                            a = a2;
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public static void addPushEventListener(PushEventListener pushEventListener) {
        Y1 y1 = Y1.b;
        y1.a.add(new P1(pushEventListener));
    }

    public static void addPushFilter(Context context, PushFilter pushFilter) {
        r a2 = r.a(context);
        a2.e().a.a.add(pushFilter);
        a2.c().a.a.add(pushFilter);
    }

    public static void addPushFilteredCallback(Context context, PushFilteredCallback pushFilteredCallback) {
        r a2 = r.a(context);
        a2.e().a.b.add(pushFilteredCallback);
        a2.c().a.b.add(pushFilteredCallback);
    }

    @Deprecated
    public static void addPushMessageTracker(PushMessageTracker pushMessageTracker) {
        Y1 y1 = Y1.b;
        y1.a.add(new Z1(pushMessageTracker));
    }

    public static void enableLogger() {
        PublicLogger.INSTANCE.setEnabled(true);
    }

    public static synchronized NotificationChannel getDefaultNotificationChannel() {
        NotificationChannel notificationChannel;
        synchronized (AppMetricaPush.class) {
            synchronized (b) {
                if (a == null) {
                    throw new IllegalStateException("AppMetricaPush should be activated by calling AppMetricaPush.activate(Context).");
                }
            }
            notificationChannel = a.b().b;
        }
        return notificationChannel;
    }

    public static PushNotificationFactory getDefaultPushNotificationFactory() {
        return AbstractC1010a2.a;
    }

    public static NotificationCustomizersHolder getNotificationCustomizersHolder() {
        return AbstractC1070r1.a;
    }

    public static synchronized Map<String, String> getTokens() {
        synchronized (AppMetricaPush.class) {
            synchronized (b) {
                if (a == null) {
                    throw new IllegalStateException("AppMetricaPush should be activated by calling AppMetricaPush.activate(Context).");
                }
            }
            y2 y2Var = a.e;
            if (y2Var == null) {
                return null;
            }
            return y2Var.a();
        }
    }

    public static void reportPushEvent(Context context, PushEvent pushEvent) {
        if (pushEvent != null) {
            V0 v0 = r.a(context).g;
            v0.getClass();
            if (pushEvent instanceof AdditionalActionPushEvent) {
                AdditionalActionPushEvent additionalActionPushEvent = (AdditionalActionPushEvent) pushEvent;
                v0.a.a(additionalActionPushEvent.getPushId(), additionalActionPushEvent.getActionId(), additionalActionPushEvent.getPayload(), additionalActionPushEvent.getTransport(), additionalActionPushEvent.getTargetActionUri());
                return;
            }
            if (pushEvent instanceof DismissPushEvent) {
                DismissPushEvent dismissPushEvent = (DismissPushEvent) pushEvent;
                v0.a.onNotificationCleared(dismissPushEvent.getPushId(), dismissPushEvent.getPayload(), dismissPushEvent.getTransport());
                return;
            }
            if (pushEvent instanceof ExpiredPushEvent) {
                ExpiredPushEvent expiredPushEvent = (ExpiredPushEvent) pushEvent;
                v0.a.onNotificationExpired(expiredPushEvent.getPushId(), expiredPushEvent.getCategory(), expiredPushEvent.getPayload(), expiredPushEvent.getTransport());
                return;
            }
            if (pushEvent instanceof IgnoredPushEvent) {
                IgnoredPushEvent ignoredPushEvent = (IgnoredPushEvent) pushEvent;
                v0.a.onNotificationIgnored(ignoredPushEvent.getPushId(), ignoredPushEvent.getCategory(), ignoredPushEvent.getDetails(), ignoredPushEvent.getPayload(), ignoredPushEvent.getTransport());
                return;
            }
            if (pushEvent instanceof InlineAdditionalActionPushEvent) {
                InlineAdditionalActionPushEvent inlineAdditionalActionPushEvent = (InlineAdditionalActionPushEvent) pushEvent;
                v0.a.a(inlineAdditionalActionPushEvent.getPushId(), inlineAdditionalActionPushEvent.getActionId(), inlineAdditionalActionPushEvent.getPayload(), inlineAdditionalActionPushEvent.getText(), inlineAdditionalActionPushEvent.getTransport(), inlineAdditionalActionPushEvent.getTargetActionUri());
                return;
            }
            if (pushEvent instanceof OpenPushEvent) {
                OpenPushEvent openPushEvent = (OpenPushEvent) pushEvent;
                v0.a.a(openPushEvent.getPushId(), openPushEvent.getPayload(), openPushEvent.getTransport(), openPushEvent.getTargetActionUri());
                return;
            }
            if (pushEvent instanceof RemovedPushEvent) {
                RemovedPushEvent removedPushEvent = (RemovedPushEvent) pushEvent;
                v0.a.onRemovingSilentPushProcessed(removedPushEvent.getPushId(), removedPushEvent.getCategory(), removedPushEvent.getDetails(), removedPushEvent.getPayload(), removedPushEvent.getTransport());
                return;
            }
            if (pushEvent instanceof ProcessSilentPushEvent) {
                ProcessSilentPushEvent processSilentPushEvent = (ProcessSilentPushEvent) pushEvent;
                v0.a.onSilentPushProcessed(processSilentPushEvent.getPushId(), processSilentPushEvent.getPayload(), processSilentPushEvent.getTransport());
                return;
            }
            if (pushEvent instanceof ReceivePushEvent) {
                ReceivePushEvent receivePushEvent = (ReceivePushEvent) pushEvent;
                v0.a.onMessageReceived(receivePushEvent.getPushId(), receivePushEvent.getPayload(), receivePushEvent.getTransport());
            } else if (pushEvent instanceof ReplacePushEvent) {
                ReplacePushEvent replacePushEvent = (ReplacePushEvent) pushEvent;
                v0.a.onNotificationReplace(replacePushEvent.getPushId(), replacePushEvent.getNewPushId(), replacePushEvent.getTransport());
            } else if (pushEvent instanceof ShownPushEvent) {
                ShownPushEvent shownPushEvent = (ShownPushEvent) pushEvent;
                v0.a.onNotificationShown(shownPushEvent.getPushId(), shownPushEvent.getPayload(), shownPushEvent.getTransport());
            }
        }
    }

    public static void setAutoTrackingConfiguration(Context context, AutoTrackingConfiguration autoTrackingConfiguration) {
        C1080v c1080v = r.a(context).f;
        synchronized (c1080v.a) {
            c1080v.g = autoTrackingConfiguration;
        }
    }

    public static void setLazyPushTransformRuleProvider(LazyPushTransformRuleProvider lazyPushTransformRuleProvider) {
        AbstractC1013b1.a = lazyPushTransformRuleProvider;
    }

    public static void setLocationProvider(LocationProvider locationProvider) {
        AbstractC1021d1.a = locationProvider;
    }

    public static void setPassportUidProvider(Context context, PassportUidProvider passportUidProvider) {
        r.a(context).f.o = passportUidProvider;
    }

    public static void setPushNotificationFactory(Context context, PushNotificationFactory pushNotificationFactory) {
        AbstractC1010a2.b = pushNotificationFactory;
    }

    public static synchronized void setTokenUpdateListener(TokenUpdateListener tokenUpdateListener) {
        synchronized (AppMetricaPush.class) {
            synchronized (b) {
                if (a == null) {
                    throw new IllegalStateException("AppMetricaPush should be activated by calling AppMetricaPush.activate(Context).");
                }
            }
            r rVar = a;
            rVar.getClass();
            PublicLogger.INSTANCE.info("Setting token update listener", new Object[0]);
            rVar.h = tokenUpdateListener;
        }
    }

    public static synchronized void activate(Context context, PushServiceControllerProvider... pushServiceControllerProviderArr) {
        synchronized (AppMetricaPush.class) {
            if (a == null) {
                synchronized (b) {
                    try {
                        if (a == null) {
                            r a2 = r.a(context);
                            a2.a(pushServiceControllerProviderArr);
                            a = a2;
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
