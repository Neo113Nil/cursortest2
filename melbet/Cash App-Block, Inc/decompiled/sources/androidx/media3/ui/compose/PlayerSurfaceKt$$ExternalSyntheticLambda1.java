package androidx.media3.ui.compose;

import android.os.Build;
import android.view.SurfaceView;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerSurfaceKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda1(CoroutineScope coroutineScope, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = coroutineScope;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        CoroutineScope coroutineScope = this.f$0;
        switch (i) {
            case 0:
                SurfaceView surfaceView = (SurfaceView) obj;
                surfaceView.getClass();
                if (Build.VERSION.SDK_INT == 34 && !StringsKt__StringsJVMKt.equals(Build.FINGERPRINT, "robolectric", true)) {
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    JobKt.launch$default(coroutineScope, MainDispatcherLoader.dispatcher, null, new PlayerSurfaceKt$PlayerSurface$onSurfaceSizeChanged$1$1$1(surfaceView, mutableState, null), 2);
                }
                break;
            default:
                ((Long) obj).getClass();
                JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new ToastKt$Toast$7$1(mutableState, null, 17), 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
