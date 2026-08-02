package androidx.lifecycle.compose;

import android.os.Looper;
import androidx.compose.runtime.ProduceStateScope;
import androidx.navigation.NavBackStackEntry;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.education.stories.backend.api.GetStoriesResult;
import com.squareup.cash.graphics.views.effect.LightSource;
import com.squareup.cash.graphics.views.effect.LightSourceKt$emulateGyro$1;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.sensors.GyroscopeEvent;
import com.squareup.cash.wallet.views.CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes3.dex */
public final class FlowExtKt$collectAsStateWithLifecycle$1$1$1$1 implements FlowCollector {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FlowExtKt$collectAsStateWithLifecycle$1$1$1$1(ProduceStateScope produceStateScope, int i) {
        this.$r8$classId = i;
        this.$$this$produceState = produceStateScope;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        LightSource lightSource;
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.$$this$produceState;
        switch (i) {
            case 0:
                produceStateScope.setValue(obj);
                break;
            case 1:
                produceStateScope.setValue(obj);
                break;
            case 2:
                produceStateScope.setValue(obj);
                break;
            case 3:
                produceStateScope.setValue((GetStoriesResult) obj);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                produceStateScope.setValue(bool);
                break;
            case 5:
                produceStateScope.setValue(new Float(((Number) obj).floatValue()));
                break;
            case 6:
                GyroscopeEvent gyroscopeEvent = (GyroscopeEvent) obj;
                if (!(gyroscopeEvent instanceof GyroscopeEvent.Data)) {
                    if (!(gyroscopeEvent instanceof GyroscopeEvent.MissingSensor)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        JobKt.launch$default(produceStateScope, null, null, new LightSourceKt$emulateGyro$1(new CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(produceStateScope, 1), null), 3);
                    }
                } else {
                    GyroscopeEvent.Data data = (GyroscopeEvent.Data) gyroscopeEvent;
                    float f = data.xRot;
                    long j = data.timestamp;
                    LightSource lightSource2 = (LightSource) produceStateScope.getValue();
                    long j2 = lightSource2.timestamp;
                    float f2 = lightSource2.yAngle;
                    float f3 = lightSource2.xAngle;
                    if (j2 == 0) {
                        lightSource = new LightSource(f3, f2, j);
                    } else {
                        float f4 = data.yRot;
                        float sqrt = (float) Math.sqrt((float) Math.pow(((float) Math.pow(f, 2.0d)) + f4, 2.0d));
                        if (sqrt > 0.17453294f) {
                            sqrt = 0.17453294f;
                        }
                        float f5 = (1.0f - (sqrt / 0.17453294f)) * 0.01f;
                        float f6 = (j - lightSource2.timestamp) / 1.0E9f;
                        float f7 = 1.0f - f5;
                        float f8 = 1.5707964f * f5;
                        lightSource = new LightSource((RangesKt___RangesKt.coerceIn((f4 * f6) + f3, RecyclerView.DECELERATION_RATE, 3.1415927f) * f7) + f8, (RangesKt___RangesKt.coerceIn(f2 - (f * f6), RecyclerView.DECELERATION_RATE, 3.1415927f) * f7) + f8, j);
                    }
                    produceStateScope.setValue(lightSource);
                }
                break;
            case 7:
                produceStateScope.setValue((StockDetails) obj);
                break;
            case 8:
                produceStateScope.setValue((StockDetails) obj);
                break;
            case 9:
                produceStateScope.setValue((NavBackStackEntry) obj);
                break;
            case 10:
                Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
                produceStateScope.setValue(obj);
                break;
            default:
                produceStateScope.setValue(obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
