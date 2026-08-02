package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.bms;
import defpackage.wls;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import io.appmetrica.analytics.push.notification.providers.AdditionalActionsProvider;
import io.appmetrica.analytics.push.notification.providers.AutoCancelProvider;
import io.appmetrica.analytics.push.notification.providers.CategoryProvider;
import io.appmetrica.analytics.push.notification.providers.ChannelIdProvider;
import io.appmetrica.analytics.push.notification.providers.ColorProvider;
import io.appmetrica.analytics.push.notification.providers.ContentInfoProvider;
import io.appmetrica.analytics.push.notification.providers.ContentIntentProvider;
import io.appmetrica.analytics.push.notification.providers.ContentTextProvider;
import io.appmetrica.analytics.push.notification.providers.ContentTitleProvider;
import io.appmetrica.analytics.push.notification.providers.DefaultsProvider;
import io.appmetrica.analytics.push.notification.providers.DeleteIntentProvider;
import io.appmetrica.analytics.push.notification.providers.GroupProvider;
import io.appmetrica.analytics.push.notification.providers.GroupSummaryProvider;
import io.appmetrica.analytics.push.notification.providers.LargeIconProvider;
import io.appmetrica.analytics.push.notification.providers.LightsProvider;
import io.appmetrica.analytics.push.notification.providers.NumberProvider;
import io.appmetrica.analytics.push.notification.providers.OngoingProvider;
import io.appmetrica.analytics.push.notification.providers.OnlyAlertOnceProvider;
import io.appmetrica.analytics.push.notification.providers.PriorityProvider;
import io.appmetrica.analytics.push.notification.providers.ShowWhenProvider;
import io.appmetrica.analytics.push.notification.providers.SmallIconProvider;
import io.appmetrica.analytics.push.notification.providers.SortKeyProvider;
import io.appmetrica.analytics.push.notification.providers.SoundProvider;
import io.appmetrica.analytics.push.notification.providers.StyleProvider;
import io.appmetrica.analytics.push.notification.providers.SubTextProvider;
import io.appmetrica.analytics.push.notification.providers.TickerProvider;
import io.appmetrica.analytics.push.notification.providers.TimeoutProvider;
import io.appmetrica.analytics.push.notification.providers.VibrateProvider;
import io.appmetrica.analytics.push.notification.providers.VisibilityProvider;
import io.appmetrica.analytics.push.notification.providers.WhenProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.push.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1078u0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public C1078u0(Context context) {
        a(C1008a0.a, new AdditionalActionsProvider(context));
        a(C1052l0.a, new AutoCancelProvider());
        a(C1058n0.a, new CategoryProvider());
        a(C1061o0.a, new ChannelIdProvider(context));
        a(C1064p0.a, new ColorProvider());
        a(C1067q0.a, new ContentInfoProvider());
        a(C1069r0.a, new ContentIntentProvider(context));
        a(C1072s0.a, new ContentTextProvider());
        a(C1075t0.a, new ContentTitleProvider());
        a(P.a, new DefaultsProvider());
        a(Q.a, new DeleteIntentProvider(context));
        a(S.a, new GroupProvider());
        a(T.a, new GroupSummaryProvider());
        a(U.a, new LargeIconProvider());
        a(V.a, new LightsProvider());
        a(W.a, new NumberProvider());
        a(X.a, new OngoingProvider());
        a(Y.a, new OnlyAlertOnceProvider());
        a(Z.a, new PriorityProvider());
        a(C1012b0.a, new ShowWhenProvider());
        a(C1016c0.a, new SmallIconProvider(context));
        a(C1020d0.a, new SortKeyProvider());
        a(C1024e0.a, new SoundProvider());
        a(C1028f0.a, new StyleProvider());
        a(C1032g0.a, new SubTextProvider());
        a(C1036h0.a, new TickerProvider());
        a(C1040i0.a, new TimeoutProvider(context));
        a(C1044j0.a, new VibrateProvider());
        a(C1048k0.a, new VisibilityProvider());
        a(C1055m0.a, new WhenProvider());
    }

    public static final void a(bms bmsVar, NotificationValueProvider notificationValueProvider, androidx.core.app.v vVar, PushMessage pushMessage) {
        List list = (List) notificationValueProvider.get(pushMessage);
        if (list != null) {
        }
    }

    public static final void b(wls wlsVar, NotificationValueProvider notificationValueProvider, androidx.core.app.v vVar, PushMessage pushMessage) {
        Object obj = notificationValueProvider.get(pushMessage);
        if (obj != null) {
        }
    }

    public static final void a(wls wlsVar, NotificationValueProvider notificationValueProvider, androidx.core.app.v vVar, PushMessage pushMessage) {
        List list = (List) notificationValueProvider.get(pushMessage);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wlsVar.invoke(vVar, it.next());
            }
        }
    }

    public final void a(wls wlsVar, NotificationValueProvider notificationValueProvider) {
        this.a.put(wlsVar, new a3(wlsVar, notificationValueProvider, 1));
    }

    public final void a(V v, LightsProvider lightsProvider) {
        this.a.put(v, new a3(v, lightsProvider, 2));
    }

    public final void a(C1008a0 c1008a0, AdditionalActionsProvider additionalActionsProvider) {
        this.a.put(c1008a0, new a3(c1008a0, additionalActionsProvider, 0));
    }
}
