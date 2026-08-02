package androidx.core.provider;

import androidx.camera.video.Recorder;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.libraries.places.internal.zzaze;
import com.google.android.libraries.places.internal.zzcbr;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;

/* loaded from: classes3.dex */
public final class CallbackWrapper$2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object val$callback;
    public final int val$reason;

    public CallbackWrapper$2(int i, ViewPager2.RecyclerViewImpl recyclerViewImpl) {
        this.$r8$classId = 1;
        this.val$reason = i;
        this.val$callback = recyclerViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = this.val$reason;
        Object obj = this.val$callback;
        switch (i) {
            case 0:
                ResourcesCompat.FontCallback fontCallback = (ResourcesCompat.FontCallback) ((Recorder.AnonymousClass6) obj).this$0;
                if (fontCallback != null) {
                    fontCallback.onFontRetrievalFailed(i2);
                    break;
                }
                break;
            case 1:
                ((RecyclerView) obj).smoothScrollToPosition(i2);
                break;
            case 2:
                ((zabk) obj).zaD(i2);
                break;
            case 3:
                zzaze zzazeVar = (zzaze) obj;
                if (!zzazeVar.zzs) {
                    if (zzazeVar.zzl.endY != 4) {
                        zzazeVar.zzk += i2;
                        break;
                    } else {
                        zzazeVar.zzt.zzc(i2);
                        break;
                    }
                }
                break;
            case 4:
                ((zzcbr) obj).zzg.zzc(i2);
                break;
            case 5:
                ((MaterialCalendar) obj).recyclerView.smoothScrollToPosition(i2);
                break;
            default:
                try {
                    Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
                } catch (InterruptedException unused) {
                }
                ((PreCachingAlgorithmDecorator) obj).getClustersInternal(i2);
                break;
        }
    }

    public /* synthetic */ CallbackWrapper$2(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.val$callback = obj;
        this.val$reason = i;
    }
}
