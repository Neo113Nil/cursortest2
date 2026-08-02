package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SemanticsPropertiesKt.m950setRolekuIjeqM((SemanticsPropertyReceiver) obj, 0);
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                ((SelectionMovementDeletionContext) obj).moveCursorLeftByChar();
                return Unit.INSTANCE;
            case 3:
                ((SelectionMovementDeletionContext) obj).moveCursorRightByChar();
                return Unit.INSTANCE;
            case 4:
                return Boolean.TRUE;
            case 5:
                return new SelectionRegistrarImpl(((Long) obj).longValue());
            case 6:
                return Unit.INSTANCE;
            case 7:
                TweenSpec tweenSpec = DrawerKt.AnimationSpec;
                return Boolean.TRUE;
            case 8:
                return Boolean.TRUE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.durationMillis = 1332;
                keyframesSpecConfig.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 0).easing = ProgressIndicatorKt.CircularEasing;
                keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case 11:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig2 = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig2.durationMillis = 1332;
                keyframesSpecConfig2.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 666).easing = ProgressIndicatorKt.CircularEasing;
                keyframesSpecConfig2.at(Float.valueOf(290.0f), keyframesSpecConfig2.durationMillis);
                return Unit.INSTANCE;
            case 12:
                ((FadeInFadeOutAnimationItem) obj).getClass();
                return true;
            case 13:
                SemanticsPropertiesKt.setContainer((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            case 14:
                return new FixedThreshold();
            case 15:
                return Unit.INSTANCE;
            case 16:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                GrpcMethod grpcMethod = layoutNodeDrawScope.canvasDrawScope.drawContext;
                long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                grpcMethod.getCanvas().save();
                try {
                    ((Extras.Key) grpcMethod.path).m1435clipRectN_I0leg(-3.4028235E38f, RecyclerView.DECELERATION_RATE, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    layoutNodeDrawScope.drawContent();
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    throw th;
                }
            case 17:
                SemanticsPropertiesKt.m950setRolekuIjeqM((SemanticsPropertyReceiver) obj, 0);
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertiesKt.setContainer((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            case 20:
                SemanticsPropertiesKt.setContainer((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            case 21:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 22:
                return Unit.INSTANCE;
            case 23:
                ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new TextKt$$ExternalSyntheticLambda0(13), new TextKt$$ExternalSyntheticLambda0(13));
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.HorizontalScrollAxisRange;
                KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[12];
                ((SemanticsPropertyReceiver) obj).set(semanticsPropertyKey, scrollAxisRange);
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                SemanticsPropertiesKt.m950setRolekuIjeqM((SemanticsPropertyReceiver) obj, 0);
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig3 = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig3.durationMillis = 6000;
                Float valueOf = Float.valueOf(90.0f);
                keyframesSpecConfig3.at(valueOf, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE).easing = MotionTokens.EasingEmphasizedDecelerateCubicBezier;
                keyframesSpecConfig3.at(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                keyframesSpecConfig3.at(valueOf2, 1800);
                keyframesSpecConfig3.at(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                keyframesSpecConfig3.at(valueOf3, 3300);
                keyframesSpecConfig3.at(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                keyframesSpecConfig3.at(valueOf4, 4800);
                keyframesSpecConfig3.at(valueOf4, 6000);
                return Unit.INSTANCE;
            default:
                SemanticsPropertiesKt.setContainer((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
        }
    }
}
