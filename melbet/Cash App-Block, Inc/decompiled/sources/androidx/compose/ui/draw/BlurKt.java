package androidx.compose.ui.draw;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlurEffect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.cdf.performance.PerformanceMeasureCrash;
import com.squareup.cash.integration.analytics.Analytics;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class BlurKt {
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m586blurF8QBwvs(Modifier modifier, final float f, final RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1) {
        final boolean z;
        final int i;
        if (rectangleShapeKt$RectangleShape$1 != null) {
            i = 0;
            z = true;
        } else {
            z = false;
            i = 3;
        }
        return ((Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) <= 0 || Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) <= 0) && !z) ? modifier : ColorKt.graphicsLayer(modifier, new Function1() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                float density = reusableGraphicsLayerScope.graphicsDensity.getDensity() * f;
                float density2 = reusableGraphicsLayerScope.graphicsDensity.getDensity() * f;
                reusableGraphicsLayerScope.setRenderEffect((density <= RecyclerView.DECELERATION_RATE || density2 <= RecyclerView.DECELERATION_RATE) ? null : new BlurEffect(density, density2, i));
                Shape shape = rectangleShapeKt$RectangleShape$1;
                if (shape == null) {
                    shape = ColorKt.RectangleShape;
                }
                reusableGraphicsLayerScope.setShape(shape);
                reusableGraphicsLayerScope.setClip(z);
                return Unit.INSTANCE;
            }
        });
    }

    public static final String formatPerformancePercent(NumberFormat numberFormat, double d) {
        numberFormat.getClass();
        String format2 = numberFormat.format(d);
        if (d > 0.0d) {
            return Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, format2);
        }
        format2.getClass();
        return format2;
    }

    public static String reportAppCrash(Throwable th, Analytics analytics) {
        th.getClass();
        analytics.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        StackTraceElement stackTraceElement = stackTrace.length == 0 ? null : th.getStackTrace()[0];
        String className = stackTraceElement != null ? stackTraceElement.getClassName() : null;
        String m = stackTraceElement != null ? Recorder$$ExternalSyntheticOutline2.m(className, ".", stackTraceElement.getMethodName()) : null;
        String m2 = Boxes$$ExternalSyntheticOutline1.m();
        analytics.track(new PerformanceMeasureCrash(m2, th.getMessage(), th.getClass().getName(), className, m), null);
        return m2;
    }
}
