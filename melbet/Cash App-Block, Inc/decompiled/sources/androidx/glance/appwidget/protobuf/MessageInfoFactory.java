package androidx.glance.appwidget.protobuf;

/* loaded from: classes3.dex */
public interface MessageInfoFactory {
    boolean isSupported(Class cls);

    RawMessageInfo messageInfoFor(Class cls);
}
