package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class ShownPushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;

    public ShownPushEvent(String str) {
        this.b = str;
    }

    public String getPayload() {
        return this.c;
    }

    public String getPushId() {
        return this.b;
    }

    public String getTransport() {
        return this.a;
    }

    public ShownPushEvent withPayload(String str) {
        this.c = str;
        return this;
    }

    public ShownPushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
