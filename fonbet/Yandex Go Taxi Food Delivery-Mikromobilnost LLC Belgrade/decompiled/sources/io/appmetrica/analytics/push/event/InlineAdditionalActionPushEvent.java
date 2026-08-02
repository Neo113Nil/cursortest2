package io.appmetrica.analytics.push.event;

/* loaded from: classes4.dex */
public class InlineAdditionalActionPushEvent extends PushEvent {
    private String a = "unknown";
    private final String b;
    private String c;
    private String d;
    private String e;
    private final String f;

    public InlineAdditionalActionPushEvent(String str, String str2) {
        this.b = str;
        this.f = str2;
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

    public String getText() {
        return this.f;
    }

    public String getTransport() {
        return this.a;
    }

    public InlineAdditionalActionPushEvent withActionId(String str) {
        this.c = str;
        return this;
    }

    public InlineAdditionalActionPushEvent withPayload(String str) {
        this.e = str;
        return this;
    }

    public InlineAdditionalActionPushEvent withTargetActionUri(String str) {
        this.d = str;
        return this;
    }

    public InlineAdditionalActionPushEvent withTransport(String str) {
        this.a = str;
        return this;
    }
}
