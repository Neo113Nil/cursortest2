package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class OpenPushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;
    private String d;

    public OpenPushEvent(String str) {
        this.b = str;
    }

    public String getPayload() {
        return this.d;
    }

    public String getPushId() {
        return this.b;
    }

    public String getTargetActionUri() {
        return this.c;
    }

    public String getTransport() {
        return this.a;
    }

    public OpenPushEvent withPayload(String str) {
        this.d = str;
        return this;
    }

    public OpenPushEvent withTargetActionUri(String str) {
        this.c = str;
        return this;
    }

    public OpenPushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
