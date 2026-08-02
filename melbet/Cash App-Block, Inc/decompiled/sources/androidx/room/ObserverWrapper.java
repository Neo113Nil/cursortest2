package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.camera.video.VideoEncoderSession;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes3.dex */
public final class ObserverWrapper {
    public final CallResult observer;
    public final Set singleTableSet;
    public final int[] tableIds;
    public final String[] tableNames;

    public ObserverWrapper(CallResult callResult, int[] iArr, String[] strArr) {
        callResult.getClass();
        iArr.getClass();
        strArr.getClass();
        this.observer = callResult;
        this.tableIds = iArr;
        this.tableNames = strArr;
        if (iArr.length == strArr.length) {
            this.singleTableSet = !(strArr.length == 0) ? SetsKt__SetsJVMKt.setOf(strArr[0]) : EmptySet.INSTANCE;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            throw null;
        }
    }

    public final void notifyByTableIds$room_runtime_release(Set set) {
        Collection collection;
        set.getClass();
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length == 0) {
            collection = EmptySet.INSTANCE;
        } else if (length != 1) {
            SetBuilder setBuilder = new SetBuilder();
            int length2 = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                int i3 = i2 + 1;
                if (set.contains(Integer.valueOf(iArr[i]))) {
                    setBuilder.add(this.tableNames[i2]);
                }
                i++;
                i2 = i3;
            }
            collection = SetsKt__SetsJVMKt.build(setBuilder);
        } else {
            collection = set.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : EmptySet.INSTANCE;
        }
        if (collection.isEmpty()) {
            return;
        }
        CallResult callResult = this.observer;
        callResult.getClass();
        collection.getClass();
        VideoEncoderSession videoEncoderSession = (VideoEncoderSession) callResult.serviceNames;
        if (((AtomicBoolean) videoEncoderSession.mActiveSurface).get()) {
            return;
        }
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = (IMultiInstanceInvalidationService) videoEncoderSession.mSurfaceRequest;
            if (iMultiInstanceInvalidationService != null) {
                iMultiInstanceInvalidationService.broadcastInvalidation((String[]) collection.toArray(new String[0]), videoEncoderSession.mVideoEncoderState);
            }
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot broadcast invalidation", e);
        }
    }
}
