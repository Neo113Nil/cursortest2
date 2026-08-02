package com.squareup.cash.offers.db;

import android.content.Context;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import app.cash.paraphrase.FormattedResource;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.mooncake.components.AlertDialogView;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.SplitButtons;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHomeQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OffersHomeQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("offersHome");
                return Unit.INSTANCE;
            case 1:
                int i = SplitButtons.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj));
            case 2:
                int i2 = SplitButtons.$r8$clinit;
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top);
            case 3:
                int i3 = SplitButtons.$r8$clinit;
                return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
            case 4:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterTransitionImpl.None, ExitTransitionImpl.None);
            case 5:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 2).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4), 0.92f, 4)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
            case 6:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.second;
                bool.booleanValue();
                return bool;
            case 7:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                boolean booleanValue = ((Boolean) ((Pair) animatedContentTransitionScopeImpl.getTargetState()).second).booleanValue();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new MoneyTabUIKt$$ExternalSyntheticLambda24(booleanValue, 13)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new MoneyTabUIKt$$ExternalSyntheticLambda24(booleanValue, 12)));
            case 8:
                Context context = (Context) obj;
                context.getClass();
                return new AlertDialogView(context, null, true, 2);
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 10:
                Context context2 = (Context) obj;
                context2.getClass();
                return new MooncakeLargeIcon(context2, null, null, 6);
            case 11:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                return Unit.INSTANCE;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 0);
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver4, 0);
                return Unit.INSTANCE;
            case 16:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver5, 0);
                return Unit.INSTANCE;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver6);
                return Unit.INSTANCE;
            case 18:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 19:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setClip(false);
                return Unit.INSTANCE;
            case 20:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("offersCollectionDetail");
                return Unit.INSTANCE;
            case 21:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("offersRecentlyViewed");
                return Unit.INSTANCE;
            case 22:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("offersRecentlyViewed");
                return Unit.INSTANCE;
            case 23:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("offersSearch");
                return Unit.INSTANCE;
            case 24:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("offersSheet");
                return Unit.INSTANCE;
            case 25:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("offersSheet");
                return Unit.INSTANCE;
            case 26:
                Number number = (Number) obj;
                number.getClass();
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("days", number);
                return new FormattedResource(R.string.offer_detail_countdown_row_caption_days, arrayMap);
            case 27:
                Number number2 = (Number) obj;
                number2.getClass();
                ArrayMap arrayMap2 = new ArrayMap(1);
                arrayMap2.put("hours", number2);
                return new FormattedResource(R.string.offer_detail_countdown_row_caption_hours, arrayMap2);
            case 28:
                Number number3 = (Number) obj;
                number3.getClass();
                ArrayMap arrayMap3 = new ArrayMap(1);
                arrayMap3.put("minutes", number3);
                return new FormattedResource(R.string.offer_detail_countdown_row_caption_minutes, arrayMap3);
            default:
                Number number4 = (Number) obj;
                number4.getClass();
                ArrayMap arrayMap4 = new ArrayMap(1);
                arrayMap4.put("seconds", number4);
                return new FormattedResource(R.string.offer_detail_countdown_row_caption_seconds, arrayMap4);
        }
    }

    public /* synthetic */ OffersHomeQueries$$ExternalSyntheticLambda1(boolean z, int i) {
        this.$r8$classId = i;
    }
}
