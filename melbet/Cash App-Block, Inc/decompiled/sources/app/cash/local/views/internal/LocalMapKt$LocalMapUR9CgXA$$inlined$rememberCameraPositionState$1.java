package app.cash.local.views.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import kotlin.jvm.functions.Function0;

/* renamed from: app.cash.local.views.internal.LocalMapKt$LocalMap-UR9CgXA$$inlined$rememberCameraPositionState$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
        }
        return new CameraPositionState(new CameraPosition(new LatLng(0.0d, 0.0d), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
    }
}
