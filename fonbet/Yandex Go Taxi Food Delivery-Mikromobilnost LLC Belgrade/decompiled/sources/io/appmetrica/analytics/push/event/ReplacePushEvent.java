package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class ReplacePushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;

    public ReplacePushEvent(String str) {
        this.b = str;
    }

    public String getNewPushId() {
        return this.c;
    }

    public String getPushId() {
        return this.b;
    }

    public String getTransport() {
        return this.a;
    }

    public ReplacePushEvent withNewPushId(String str) {
        this.c = str;
        return this;
    }

    public ReplacePushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
