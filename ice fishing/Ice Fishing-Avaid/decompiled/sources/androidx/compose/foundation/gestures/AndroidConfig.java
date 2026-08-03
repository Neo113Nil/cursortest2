package androidx.compose.foundation.gestures;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.foundation.gestures.ScrollConfig;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidScrollable.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\t*\u00020\nH\u0001¢\u0006\u0002\b\u000bJ\u0011\u0010\f\u001a\u00020\t*\u00020\nH\u0001¢\u0006\u0002\b\rJ#\u0010\u000e\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/AndroidConfig;", "Landroidx/compose/foundation/gestures/ScrollConfig;", "viewConfiguration", "Landroid/view/ViewConfiguration;", "<init>", "(Landroid/view/ViewConfiguration;)V", "getViewConfiguration", "()Landroid/view/ViewConfiguration;", "getVerticalScrollFactor", "", "Landroidx/compose/ui/unit/Density;", "getVerticalScrollFactor$foundation", "getHorizontalScrollFactor", "getHorizontalScrollFactor$foundation", "calculateMouseWheelScroll", "Landroidx/compose/ui/geometry/Offset;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerEvent;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "calculateMouseWheelScroll-8xgXZGE", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class AndroidConfig implements ScrollConfig {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public /* synthetic */ boolean isPreciseWheelScroll(PointerEvent pointerEvent) {
        return ScrollConfig.CC.$default$isPreciseWheelScroll(this, pointerEvent);
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    public /* synthetic */ boolean isSmoothScrollingEnabled() {
        return ScrollConfig.CC.$default$isSmoothScrollingEnabled(this);
    }

    public AndroidConfig(ViewConfiguration viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final float getVerticalScrollFactor$foundation(Density density) {
        if (Build.VERSION.SDK_INT > 26) {
            return ViewConfigurationApi26Impl.INSTANCE.getVerticalScrollFactor(this.viewConfiguration);
        }
        return density.mo528toPx0680j_4(Dp.m9732constructorimpl(64));
    }

    public final float getHorizontalScrollFactor$foundation(Density density) {
        if (Build.VERSION.SDK_INT > 26) {
            return ViewConfigurationApi26Impl.INSTANCE.getHorizontalScrollFactor(this.viewConfiguration);
        }
        return density.mo528toPx0680j_4(Dp.m9732constructorimpl(64));
    }

    @Override // androidx.compose.foundation.gestures.ScrollConfig
    /* renamed from: calculateMouseWheelScroll-8xgXZGE, reason: not valid java name */
    public long mo557calculateMouseWheelScroll8xgXZGE(Density density, PointerEvent pointerEvent, long j) {
        float f = -getVerticalScrollFactor$foundation(density);
        float f2 = -getHorizontalScrollFactor$foundation(density);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        Offset m6508boximpl = Offset.m6508boximpl(Offset.INSTANCE.m6535getZeroF1C5BW0());
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            m6508boximpl = Offset.m6508boximpl(Offset.m6524plusMKHz9U(m6508boximpl.m6529unboximpl(), changes.get(i).getScrollDelta()));
        }
        long m6529unboximpl = m6508boximpl.m6529unboximpl();
        float intBitsToFloat = Float.intBitsToFloat((int) (m6529unboximpl >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m6529unboximpl & 4294967295L)) * f;
        return Offset.m6511constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }
}
