package androidx.camera.core.processing;

import androidx.camera.core.AutoValue_SurfaceRequest_Result;
import androidx.camera.video.Recorder;
import androidx.collection.SimpleArrayMap;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import com.google.android.gms.internal.time.zzq;
import com.google.android.gms.internal.time.zzu;
import java.util.ArrayList;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final class Edge implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public Object mListener;

    public /* synthetic */ Edge(Object obj, int i) {
        this.$r8$classId = i;
        this.mListener = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Consumer) this.mListener).getClass();
                ((Consumer) this.mListener).accept(obj);
                return;
            case 1:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.mListener;
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith((AutoValue_SurfaceRequest_Result) obj);
                return;
            case 2:
                FontRequestWorker.TypefaceResult typefaceResult = (FontRequestWorker.TypefaceResult) obj;
                if (typefaceResult == null) {
                    typefaceResult = new FontRequestWorker.TypefaceResult(-3);
                }
                ((Recorder.AnonymousClass4) this.mListener).onTypefaceResult(typefaceResult);
                return;
            case 3:
                FontRequestWorker.TypefaceResult typefaceResult2 = (FontRequestWorker.TypefaceResult) obj;
                synchronized (FontRequestWorker.LOCK) {
                    try {
                        SimpleArrayMap simpleArrayMap = FontRequestWorker.PENDING_REPLIES;
                        ArrayList arrayList = (ArrayList) simpleArrayMap.get((String) this.mListener);
                        if (arrayList == null) {
                            return;
                        }
                        simpleArrayMap.remove((String) this.mListener);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((Consumer) arrayList.get(i)).accept(typefaceResult2);
                        }
                        return;
                    } finally {
                    }
                }
            default:
                ((zzu) this.mListener).zzc((zzq) obj);
                return;
        }
    }

    public /* synthetic */ Edge() {
        this.$r8$classId = 0;
    }
}
