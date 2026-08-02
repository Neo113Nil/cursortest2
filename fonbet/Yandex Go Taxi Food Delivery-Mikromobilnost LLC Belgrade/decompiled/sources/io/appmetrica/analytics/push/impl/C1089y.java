package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.ModulesFacade;
import io.appmetrica.analytics.push.BuildConfig;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.push.impl.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C1089y implements U0 {
    public final C1086x a;

    public C1089y(M1 m1) {
        this.a = new C1086x(m1, "app");
    }

    public final void a(C1066q c1066q) {
        int i = c1066q.a;
        int b = AbstractC1071s.b(i);
        String a = AbstractC1071s.a(i);
        String a2 = c1066q.a();
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("appmetrica_push_version_name", BuildConfig.VERSION_NAME);
        hashMap.put("appmetrica_push_transport", c1066q.b);
        hashMap.put("appmetrica_push_event_id", Long.valueOf(this.a.a()));
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(b).withName(a).withValue(a2).withEnvironment(hashMap).build());
        AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onMessageReceived(String str, String str2, String str3) {
        a(new C1066q(str, str3, new C1039i(1)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onNotificationCleared(String str, String str2, String str3) {
        a(new C1066q(str, str3, new C1039i(2)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onNotificationExpired(String str, String str2, String str3, String str4) {
        a(new C1066q(str, str4, new C1051l(str2)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onNotificationIgnored(String str, String str2, String str3, String str4, String str5) {
        a(new C1066q(str, str5, new C1054m(str2, str3)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onNotificationReplace(String str, String str2, String str3) {
        a(new C1066q(str, str3, new C1063p(str2)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onNotificationShown(String str, String str2, String str3) {
        a(new C1066q(str, str3, new C1039i(6)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onPushTokenInited(String str, String str2) {
        int b = AbstractC1071s.b(1);
        String a = AbstractC1071s.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("appmetrica_push_version_name", BuildConfig.VERSION_NAME);
        hashMap.put("appmetrica_push_transport", str2);
        hashMap.put("appmetrica_push_event_id", Long.valueOf(this.a.a()));
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(b).withName(a).withValue(str).withEnvironment(hashMap).build());
        AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onPushTokenUpdated(String str, String str2) {
        int b = AbstractC1071s.b(1);
        String a = AbstractC1071s.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("appmetrica_push_version_name", BuildConfig.VERSION_NAME);
        hashMap.put("appmetrica_push_transport", str2);
        hashMap.put("appmetrica_push_event_id", Long.valueOf(this.a.a()));
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(b).withName(a).withValue(str).withEnvironment(hashMap).build());
        AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onRemovingSilentPushProcessed(String str, String str2, String str3, String str4, String str5) {
        a(new C1066q(str, str5, new C1060o(str2, str3)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void onSilentPushProcessed(String str, String str2, String str3) {
        a(new C1066q(str, str3, new C1039i(5)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void a(String str) {
        int b = AbstractC1071s.b(1);
        String a = AbstractC1071s.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("appmetrica_push_version", String.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("appmetrica_push_version_name", BuildConfig.VERSION_NAME);
        hashMap.put("appmetrica_push_transport", "system_info_provider");
        hashMap.put("appmetrica_push_event_id", Long.valueOf(this.a.a()));
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(b).withName(a).withValue(str).withEnvironment(hashMap).build());
        AppMetrica.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void a(String str, String str2, String str3, String str4) {
        a(new C1066q(str, str3, new C1057n(str4)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void a(String str, String str2, String str3, String str4, String str5) {
        a(new C1066q(str, str4, new C1047k(str2, str5, null)));
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        a(new C1066q(str, str5, new C1047k(str2, str6, str4)));
    }
}
