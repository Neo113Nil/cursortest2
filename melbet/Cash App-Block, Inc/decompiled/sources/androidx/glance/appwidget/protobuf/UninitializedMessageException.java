package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public final class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
