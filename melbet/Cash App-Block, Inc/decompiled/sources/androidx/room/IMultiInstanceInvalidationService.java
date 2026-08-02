package androidx.room;

import android.os.IInterface;

/* loaded from: classes3.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String DESCRIPTOR = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void broadcastInvalidation(String[] strArr, int i);

    int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i);
}
