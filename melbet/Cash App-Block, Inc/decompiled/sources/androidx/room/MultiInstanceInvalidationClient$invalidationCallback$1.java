package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.camera.video.VideoEncoderSession;
import androidx.compose.material3.SliderState$drag$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationClient$invalidationCallback$1 extends Binder implements IMultiInstanceInvalidationCallback {
    public final /* synthetic */ VideoEncoderSession this$0;

    public MultiInstanceInvalidationClient$invalidationCallback$1(VideoEncoderSession videoEncoderSession) {
        this.this$0 = videoEncoderSession;
        attachInterface(this, IMultiInstanceInvalidationCallback.DESCRIPTOR);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void onInvalidation(String[] strArr) {
        strArr.getClass();
        VideoEncoderSession videoEncoderSession = this.this$0;
        JobKt.launch$default((CoroutineScope) videoEncoderSession.mVideoEncoder, null, null, new SliderState$drag$2(strArr, videoEncoderSession, (Continuation) null, 15), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = IMultiInstanceInvalidationCallback.DESCRIPTOR;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        onInvalidation(parcel.createStringArray());
        return true;
    }
}
