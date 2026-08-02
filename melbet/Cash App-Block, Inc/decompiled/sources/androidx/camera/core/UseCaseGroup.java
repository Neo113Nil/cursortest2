package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.core.util.Consumer;
import androidx.core.util.Pair;
import androidx.media3.extractor.text.CueEncoder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class UseCaseGroup implements FutureCallback {
    public static final UseCaseGroup DEFAULT;
    public final /* synthetic */ int $r8$classId;
    public final Object mEffects;
    public final Object mUseCases;

    public final class Builder {
        public static final List SUPPORTED_TARGETS = Arrays.asList(1, 2, 4, 3, 7);
        public final ArrayList mUseCases = new ArrayList();
        public final ArrayList mEffects = new ArrayList();
    }

    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        DEFAULT = new UseCaseGroup(1, new Pair(valueOf2, valueOf2), new Pair(valueOf, valueOf));
    }

    public UseCaseGroup(File file) {
        this.$r8$classId = 4;
        this.mUseCases = file;
        this.mEffects = new CueEncoder(3);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        int i = this.$r8$classId;
        Object obj = this.mEffects;
        Object obj2 = this.mUseCases;
        switch (i) {
            case 2:
                if (!(th instanceof SurfaceRequest.RequestCancelledException)) {
                    TransactorKt.checkState(null, ((CallbackToFutureAdapter$Completer) obj2).set(null));
                    break;
                } else {
                    TransactorKt.checkState(null, ((CallbackToFutureAdapter$SafeFuture) obj).cancel(false));
                    break;
                }
            default:
                TransactorKt.checkState("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof SurfaceRequest.RequestCancelledException);
                ((Consumer) obj2).accept(new AutoValue_SurfaceRequest_Result(1, (Surface) obj));
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.mUseCases;
        switch (i) {
            case 2:
                TransactorKt.checkState(null, ((CallbackToFutureAdapter$Completer) obj2).set(null));
                break;
            default:
                ((Consumer) obj2).accept(new AutoValue_SurfaceRequest_Result(0, (Surface) this.mEffects));
                break;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 4:
                return "OutputFileOptions{mFile=" + ((File) this.mUseCases) + ", mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=" + ((CueEncoder) this.mEffects) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ UseCaseGroup(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.mUseCases = obj;
        this.mEffects = obj2;
    }
}
