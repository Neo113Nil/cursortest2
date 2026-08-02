package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class RemovedPushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;
    private String d;
    private String e;

    public RemovedPushEvent(String str) {
        this.b = str;
    }

    public String getCategory() {
        return this.d;
    }

    public String getDetails() {
        return this.e;
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

    public RemovedPushEvent withCategory(String str) {
        this.d = str;
        return this;
    }

    public RemovedPushEvent withDetails(String str) {
        this.e = str;
        return this;
    }

    public RemovedPushEvent withPayload(String str) {
        this.c = str;
        return this;
    }

    public RemovedPushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
