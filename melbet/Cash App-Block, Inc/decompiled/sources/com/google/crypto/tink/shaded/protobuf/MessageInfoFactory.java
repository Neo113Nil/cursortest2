package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public interface MessageInfoFactory {
    boolean isSupported(Class cls);

    RawMessageInfo messageInfoFor(Class cls);
}
