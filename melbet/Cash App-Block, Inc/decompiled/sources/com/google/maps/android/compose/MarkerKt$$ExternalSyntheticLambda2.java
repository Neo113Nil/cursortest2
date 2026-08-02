package com.google.maps.android.compose;

import android.view.MotionEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.Marker;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.address.typeahead.views.AddressTypeaheadStateKt;
import com.squareup.cardcustomizations.stampview.FadingStamp;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.cell.RealCellSearchResultAccessoryScope;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class MarkerKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 4;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                ((Marker) obj).getClass();
                return Unit.INSTANCE;
            case 2:
                ((GoogleMapEngine.GoogleClusterItemAdapter) obj).getClass();
                return Unit.INSTANCE;
            case 3:
                ((GoogleMapEngine.GoogleClusterItemAdapter) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 5:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 6:
                ((RowScope) obj).getClass();
                return companion;
            case 7:
                ((RowScope) obj).getClass();
                return companion;
            case 8:
                ((RowScope) obj).getClass();
                return companion;
            case 9:
                ((RowScope) obj).getClass();
                return companion;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((TextLayoutResult) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                Modifier modifier = (Modifier) obj;
                modifier.getClass();
                return AnimatedContentKt.animateContentSize$default(modifier, null, 3);
            case 13:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                MatcherMatchResult$groups$1 groups = matchResult.getGroups();
                if (groups.getSize() <= 5 || groups.get(5) == null) {
                    return groups.get(4) != null ? matchResult.getValue() : "&".concat(matchResult.getValue().substring(1));
                }
                MatchGroup matchGroup = groups.get(5);
                matchGroup.getClass();
                return String.valueOf(matchGroup.value.charAt(0));
            case 14:
                RealCellSearchResultAccessoryScope realCellSearchResultAccessoryScope = (RealCellSearchResultAccessoryScope) obj;
                realCellSearchResultAccessoryScope.getClass();
                realCellSearchResultAccessoryScope.setContent(AddressTypeaheadStateKt.f98lambda$1403269871);
                return Unit.INSTANCE;
            case 15:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return (Intrinsics.areEqual(animatedContentTransitionScopeImpl.getInitialState(), AddressModel.Initializing.INSTANCE) || (animatedContentTransitionScopeImpl.getTargetState() instanceof AddressModel.Condensed)) ? new ContentTransform(EnterTransitionImpl.None, ExitTransitionImpl.None, RecyclerView.DECELERATION_RATE, i2) : AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3));
            case 16:
                AddressModel addressModel = (AddressModel) obj;
                addressModel.getClass();
                return Reflection.factory.getOrCreateKotlinClass(addressModel.getClass());
            case 17:
                ((String) obj).getClass();
                throw new IllegalStateException();
            case 18:
                FadingStamp fadingStamp = (FadingStamp) obj;
                fadingStamp.getClass();
                return Boolean.valueOf(fadingStamp.isComplete());
            case 19:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl2);
            case 20:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = AccountToDoKt.f110lambda$464594160;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(AccountToDoKt.f100lambda$1155215751);
                return Unit.INSTANCE;
            case 21:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3));
            case 22:
                RealSegmentedControlScope realSegmentedControlScope2 = (RealSegmentedControlScope) obj;
                realSegmentedControlScope2.getClass();
                ComposableLambdaImpl composableLambdaImpl2 = AccountToDoKt.lambda$141152320;
                SnapshotStateList snapshotStateList2 = realSegmentedControlScope2.segments;
                snapshotStateList2.add(composableLambdaImpl2);
                snapshotStateList2.add(AccountToDoKt.lambda$658460023);
                return Unit.INSTANCE;
            case 23:
                ((ProfileViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                ((MotionEvent) obj).getClass();
                return Boolean.TRUE;
            case 26:
                ((MainPaymentPadViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                float intBitsToFloat = Float.intBitsToFloat((int) (((Size) obj).packedValue >> 32)) / 2.0f;
                return new Offset((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r9.packedValue & BodyPartID.bodyIdMax)) * 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            case 28:
                float intBitsToFloat2 = Float.intBitsToFloat((int) (((Size) obj).packedValue >> 32)) / 2.0f;
                return new Offset((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r9.packedValue & BodyPartID.bodyIdMax)) * 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32));
            default:
                float intBitsToFloat3 = Float.intBitsToFloat((int) (((Size) obj).packedValue >> 32)) / 2.0f;
                return new Offset((Float.floatToRawIntBits(Float.intBitsToFloat((int) (r9.packedValue & BodyPartID.bodyIdMax)) * 2.0f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
        }
    }
}
