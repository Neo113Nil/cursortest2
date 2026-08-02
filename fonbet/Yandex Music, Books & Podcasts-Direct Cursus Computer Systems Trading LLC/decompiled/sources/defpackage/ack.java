package defpackage;

/* loaded from: classes4.dex */
public enum ack {
    Network("network"),
    /* JADX INFO: Fake field, exist only in values array */
    NetworkUnknown("networkUnknown"),
    Ssl("ssl"),
    Http("http"),
    Parse("parse"),
    Unknown("unknown");

    public final String a;

    ack(String str) {
        this.a = str;
    }
}
