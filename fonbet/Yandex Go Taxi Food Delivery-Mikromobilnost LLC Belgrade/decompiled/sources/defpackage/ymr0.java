package defpackage;

import androidx.datastore.core.NativeSharedCounter;

/* loaded from: classes.dex */
public final class ymr0 {
    public static final /* synthetic */ ymr0 a = new ymr0();
    public static final NativeSharedCounter b;

    static {
        System.loadLibrary("datastore_shared_counter");
        b = new NativeSharedCounter();
    }
}
