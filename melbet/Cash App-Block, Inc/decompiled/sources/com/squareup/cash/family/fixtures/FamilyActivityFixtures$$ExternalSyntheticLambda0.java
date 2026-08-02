package com.squareup.cash.family.fixtures;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewEvent;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewEvent;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyActivityFixtures$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FamilyActivityFixtures$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        Object obj2 = null;
        switch (this.$r8$classId) {
            case 0:
                ((ActivityItemViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                list.getClass();
                for (Object obj3 : list) {
                    SponsorshipState sponsorshipState = ((Sponsor) obj3).status;
                    if (sponsorshipState == SponsorshipState.ACTIVE || sponsorshipState == SponsorshipState.SUSPENDED) {
                        obj2 = obj3;
                        return (Sponsor) obj2;
                    }
                }
                return (Sponsor) obj2;
            case 2:
                SavingsConfig savingsConfig = (SavingsConfig) obj;
                savingsConfig.getClass();
                return savingsConfig.goal_celebration_animation;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 4:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver3, 0);
                return Unit.INSTANCE;
            case 8:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl);
            case 9:
                ((AllowanceViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                ((ActivityItemViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((ActivityItemViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((ActivityEmbeddedViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((SelectContactMethodViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl2);
            case 15:
                ((SafetyHubViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 16:
                FamilyProfile familyProfile = (FamilyProfile) obj;
                familyProfile.getClass();
                if (Intrinsics.areEqual(familyProfile, FamilyProfile.Standard.INSTANCE)) {
                    return SectionAvailabilityState.UNAVAILABLE;
                }
                if (familyProfile instanceof FamilyProfile.ManagedAccount) {
                    return SectionAvailabilityState.AVAILABLE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 17:
                Favorite favorite = (Favorite) obj;
                favorite.getClass();
                String str = favorite.favorite_customer_token;
                str.getClass();
                return str;
            case 18:
                String str2 = ((Favorite) obj).favorite_customer_token;
                str2.getClass();
                return str2;
            case 19:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 21:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                ((FidesmoProvisioningViewEvent) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                float floatValue = ((Float) obj).floatValue();
                if (floatValue < 0.5f) {
                    f = 2.0f * floatValue * floatValue;
                } else {
                    float f2 = ((-2.0f) * floatValue) + 2.0f;
                    f = 1.0f - ((f2 * f2) / 2.0f);
                }
                return Float.valueOf(f);
            case 26:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl3.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl3);
            default:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
        }
    }
}
