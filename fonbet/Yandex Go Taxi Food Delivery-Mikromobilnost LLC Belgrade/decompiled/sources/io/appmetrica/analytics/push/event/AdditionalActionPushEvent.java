package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class AdditionalActionPushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;
    private String d;
    private String e;

    public AdditionalActionPushEvent(String str) {
        this.b = str;
    }

    public String getActionId() {
        return this.c;
    }

    public String getPayload() {
        return this.e;
    }

    public String getPushId() {
        return this.b;
    }

    public String getTargetActionUri() {
        return this.d;
    }

    public String getTransport() {
        return this.a;
    }

    public AdditionalActionPushEvent withActionId(String str) {
        this.c = str;
        return this;
    }

    public AdditionalActionPushEvent withPayload(String str) {
        this.e = str;
        return this;
    }

    public AdditionalActionPushEvent withTargetActionUri(String str) {
        this.d = str;
        return this;
    }

    public AdditionalActionPushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
