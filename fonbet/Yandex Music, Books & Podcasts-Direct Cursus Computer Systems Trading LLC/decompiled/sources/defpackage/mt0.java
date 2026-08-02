package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mt0 extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        readClassDescriptor.getClass();
        if (Intrinsics.d(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            readClassDescriptor = ObjectStreamClass.lookup(ka.class);
        } else if (Intrinsics.d(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            readClassDescriptor = ObjectStreamClass.lookup(gt0.class);
        }
        readClassDescriptor.getClass();
        return readClassDescriptor;
    }
}
