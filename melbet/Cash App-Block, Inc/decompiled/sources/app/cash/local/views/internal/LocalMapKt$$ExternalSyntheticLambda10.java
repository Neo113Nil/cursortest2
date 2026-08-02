package app.cash.local.views.internal;

import android.location.Location;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material.DismissValue;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.arcade.components.CopyCodeState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMapKt$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ LocalMapKt$$ExternalSyntheticLambda10(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                ((LatLng) obj).getClass();
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                Object invoke = function0.invoke();
                Float f = (Float) (Float.isNaN(((Number) invoke).floatValue()) ? null : invoke);
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f != null ? f.floatValue() : 0.0f, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, 1.0f), 0));
                break;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                Object invoke2 = function0.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) invoke2).floatValue()) ? null : invoke2);
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver2, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, 1.0f), 0));
                break;
            case 7:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setTranslationY(reusableGraphicsLayerScope.graphicsDensity.getDensity() * (2.0f - ((Number) function0.invoke()).floatValue()));
                break;
            case 8:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                break;
            case 9:
                ((LatLng) obj).getClass();
                function0.invoke();
                break;
            case 10:
                ((Location) obj).getClass();
                function0.invoke();
                break;
            case 11:
                ((PointOfInterest) obj).getClass();
                function0.invoke();
                break;
            case 12:
                if (((Integer) obj).intValue() == 1) {
                    function0.invoke();
                }
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                if (function0 != null) {
                    SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 0);
                }
                break;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                if (function0 != null) {
                    SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver4);
                }
                break;
            case 15:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                break;
            case 16:
                ((SwipeToDismissBoxValue) obj).getClass();
                function0.invoke();
                break;
            case 17:
                ((CopyCodeState) obj).getClass();
                function0.invoke();
                break;
            case 18:
                ((CopyCodeState) obj).getClass();
                function0.invoke();
                break;
            case 19:
                function0.invoke();
                break;
            case 20:
                function0.invoke();
                break;
            case 21:
                if (((Boolean) obj).booleanValue()) {
                    function0.invoke();
                }
                break;
            case 22:
                ((CopyCodeState) obj).getClass();
                function0.invoke();
                break;
            case 23:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                break;
            case 24:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                break;
            case 25:
                ((KeyboardActionScope) obj).getClass();
                function0.invoke();
                break;
            case 26:
                DismissValue dismissValue = (DismissValue) obj;
                dismissValue.getClass();
                boolean z = dismissValue == DismissValue.DismissedToStart;
                if (z) {
                    function0.invoke();
                }
                break;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                if (function0 != null) {
                    SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver5, 0);
                }
                break;
            case 28:
                ((List) obj).getClass();
                function0.invoke();
                break;
            default:
                ActivityItemViewEvent activityItemViewEvent = (ActivityItemViewEvent) obj;
                activityItemViewEvent.getClass();
                if (Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.AvatarClicked.INSTANCE) || Intrinsics.areEqual(activityItemViewEvent, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
