package com.squareup.cash.data.blockers;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.analytics.BlockerFlowAnalyticsHelperKt;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableSubJourneyTracking;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.IdentityVerificationBlocker;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.BlockersSupplement;
import com.squareup.protos.franklin.common.scenarios.IdentityVerificationBlockerSupplement;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClientBlockersNavigator implements BlockersDataNavigator {
    public final Analytics analytics;
    public final BlockersDescriptorNavigator blockersDescriptorNavigator;
    public final FeatureFlagManager featureFlagManager;
    public final RealUserJourneyTracker subUserJourneyTracker;
    public final UserJourneyTracker userJourneyTracker;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BlockersData.Flow.values().length];
            try {
                iArr[BlockersData.Flow.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockersData.Flow.TRANSFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockersData.Flow.PAYMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockersData.Flow.LINK_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockersData.Flow.PROFILE_BLOCKERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockersData.Flow.SERVER_FLOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockersData.Flow.INSTRUMENT_SELECTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockersData.Flow.STATUS_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockersData.Flow.CASHTAG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockersData.Flow.CLIENT_SCENARIO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[JourneyOutcome.values().length];
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_SUCCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_USER_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_PROCESS_CRASHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_PROCESS_KILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[JourneyOutcome.JOURNEY_OUTCOME_TERMINATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ClientBlockersNavigator(BlockersDescriptorNavigator blockersDescriptorNavigator, Analytics analytics, UserJourneyTracker userJourneyTracker, RealUserJourneyTracker realUserJourneyTracker, FeatureFlagManager featureFlagManager) {
        this.blockersDescriptorNavigator = blockersDescriptorNavigator;
        this.analytics = analytics;
        this.userJourneyTracker = userJourneyTracker;
        this.subUserJourneyTracker = realUserJourneyTracker;
        this.featureFlagManager = featureFlagManager;
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final boolean canGoBack(Screen screen, BlockersData blockersData) {
        screen.getClass();
        return BlockersNavigationUtil.canGoBack(screen, blockersData);
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final Screen getBack(Screen screen, BlockersData blockersData) {
        screen.getClass();
        blockersData.getClass();
        return ((RealBlockersDescriptorNavigator) this.blockersDescriptorNavigator).getBack(screen, blockersData);
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final Screen getNext(Screen screen, BlockersData blockersData) {
        UserJourneyTracker userJourneyTracker;
        IdentityVerificationBlocker identityVerificationBlocker;
        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement;
        IdentityVerificationBlocker identityVerificationBlocker2;
        Boolean bool;
        List<BlockerDescriptor> list;
        List<BlockerDescriptor> list2;
        List<BlockerDescriptor> list3;
        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement2;
        List<BlockerDescriptor> list4;
        UserJourney$Outcome userJourney$Outcome;
        blockersData.getClass();
        BlockersData.JourneyContext journeyContext = blockersData.journeyContext;
        ScenarioPlan scenarioPlan = blockersData.scenarioPlan;
        BlockersData.Flow flow = blockersData.flow;
        Screen screen2 = blockersData.exitScreen;
        Iterator it = journeyContext.frustrationSignals.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            userJourneyTracker = this.userJourneyTracker;
            if (!hasNext) {
                break;
            }
            final String str = (String) it.next();
            UserJourney$Friction userJourney$Friction = new UserJourney$Friction(str) { // from class: com.squareup.cash.userjourneys.tracker.UserJourney$Frustration$ResponseContext
                public final String frustration;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(str);
                    str.getClass();
                    this.frustration = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof UserJourney$Frustration$ResponseContext) && Intrinsics.areEqual(this.frustration, ((UserJourney$Frustration$ResponseContext) obj).frustration);
                }

                public final int hashCode() {
                    return this.frustration.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ResponseContext(frustration=", this.frustration, ")");
                }
            };
            UserJourneyTracker.Companion companion = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addFrustrationSignal(null, userJourney$Friction);
        }
        Iterator it2 = journeyContext.frictionSignals.iterator();
        while (it2.hasNext()) {
            UserJourney$Friction.ResponseContext responseContext = new UserJourney$Friction.ResponseContext((String) it2.next());
            UserJourneyTracker.Companion companion2 = UserJourneyTracker.Companion;
            ((RealUserJourneyTracker) userJourneyTracker).addFrictionSignal(null, responseContext);
        }
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$EnableSubJourneyTracking.INSTANCE)).enabled();
        RealUserJourneyTracker realUserJourneyTracker = this.subUserJourneyTracker;
        if (enabled) {
            for (Map.Entry entry : journeyContext.subJourneyOutcomes.entrySet()) {
                String str2 = (String) entry.getKey();
                switch (WhenMappings.$EnumSwitchMapping$1[((JourneyOutcome) entry.getValue()).ordinal()]) {
                    case 1:
                        userJourney$Outcome = UserJourney$Outcome.Succeeded.INSTANCE;
                        break;
                    case 2:
                        userJourney$Outcome = UserJourney$Outcome.Failed.INSTANCE;
                        break;
                    case 3:
                        userJourney$Outcome = UserJourney$Outcome.UserCanceled.INSTANCE;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        userJourney$Outcome = null;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                if (userJourney$Outcome != null) {
                    str2.getClass();
                    UserJourney$Name userJourneyName = RealUserJourneyTracker.toUserJourneyName(str2);
                    if (userJourneyName != null) {
                        realUserJourneyTracker.endJourney(userJourneyName, userJourney$Outcome);
                    }
                }
            }
        }
        JourneyOutcome journeyOutcome = journeyContext.outcome;
        if (journeyOutcome != null) {
            BlockerFlowAnalyticsHelperKt.logReceiveJourneyOutcome(this.analytics, blockersData.clientScenario, blockersData.flowType, blockersData.flowToken, blockersData.flowPath, blockersData.getNextBlockerType(), journeyOutcome, null, false);
        }
        if (enabled) {
            for (String str3 : journeyContext.subJourneysStarted) {
                str3.getClass();
                UserJourney$Name userJourneyName2 = RealUserJourneyTracker.toUserJourneyName(str3);
                if (userJourneyName2 != null) {
                    UserJourneyTracker.Companion.getClass();
                    realUserJourneyTracker.m3787startJourneytmZmOBY(userJourneyName2, UserJourneyTracker.Companion.defaultTimeout, null, null, true);
                }
            }
        }
        int i = WhenMappings.$EnumSwitchMapping$0[flow.ordinal()];
        BlockersDescriptorNavigator blockersDescriptorNavigator = this.blockersDescriptorNavigator;
        switch (i) {
            case 1:
                if (scenarioPlan != null && Intrinsics.areEqual(scenarioPlan.end_onboarding, Boolean.TRUE)) {
                    return !(screen instanceof BlockersScreens.WelcomeScreen) ? new BlockersScreens.WelcomeScreen(blockersData) : screen2;
                }
                if (screen != null) {
                    if ((screen instanceof BlockersScreens.SetNameScreen) && ((BlockersScreens.SetNameScreen) screen).nameType == BlockersScreens.SetNameScreen.NameType.LEGAL) {
                        if (scenarioPlan == null || (list4 = scenarioPlan.blocker_descriptors) == null) {
                            identityVerificationBlockerSupplement2 = null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it3 = list4.iterator();
                            while (it3.hasNext()) {
                                BlockersSupplement blockersSupplement = ((BlockerDescriptor) it3.next()).supplement;
                                IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement3 = blockersSupplement != null ? blockersSupplement.identity_verification : null;
                                if (identityVerificationBlockerSupplement3 != null) {
                                    arrayList.add(identityVerificationBlockerSupplement3);
                                }
                            }
                            identityVerificationBlockerSupplement2 = (IdentityVerificationBlockerSupplement) CollectionsKt.firstOrNull((List) arrayList);
                        }
                        return new BlockersScreens.BirthdayScreen(blockersData, new RedactedString(identityVerificationBlockerSupplement2 != null ? identityVerificationBlockerSupplement2.birthdate_main_text : null), blockersData.birthday);
                    }
                    if (screen instanceof BlockersScreens.BirthdayScreen) {
                        if (scenarioPlan == null || (list3 = scenarioPlan.blocker_descriptors) == null) {
                            identityVerificationBlocker = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it4 = list3.iterator();
                            while (it4.hasNext()) {
                                Blockers blockers = ((BlockerDescriptor) it4.next()).blocker;
                                IdentityVerificationBlocker identityVerificationBlocker3 = blockers != null ? blockers.identity_verification : null;
                                if (identityVerificationBlocker3 != null) {
                                    arrayList2.add(identityVerificationBlocker3);
                                }
                            }
                            identityVerificationBlocker = (IdentityVerificationBlocker) CollectionsKt.firstOrNull((List) arrayList2);
                        }
                        if (scenarioPlan == null || (list2 = scenarioPlan.blocker_descriptors) == null) {
                            identityVerificationBlockerSupplement = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<T> it5 = list2.iterator();
                            while (it5.hasNext()) {
                                BlockersSupplement blockersSupplement2 = ((BlockerDescriptor) it5.next()).supplement;
                                IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement4 = blockersSupplement2 != null ? blockersSupplement2.identity_verification : null;
                                if (identityVerificationBlockerSupplement4 != null) {
                                    arrayList3.add(identityVerificationBlockerSupplement4);
                                }
                            }
                            identityVerificationBlockerSupplement = (IdentityVerificationBlockerSupplement) CollectionsKt.firstOrNull((List) arrayList3);
                        }
                        boolean z = false;
                        if (identityVerificationBlocker != null ? Intrinsics.areEqual(identityVerificationBlocker.requires_address, Boolean.TRUE) : false) {
                            return new BlockersScreens.StreetAddressScreen(blockersData, BlockersScreens.StreetAddressScreen.FormType.FULL_ADDRESS, blockersData.address, null, null, null, blockersData.addressTypeaheadEnabled, identityVerificationBlockerSupplement != null ? identityVerificationBlockerSupplement.additional_help_items : null, false, false, 1536);
                        }
                        if (scenarioPlan == null || (list = scenarioPlan.blocker_descriptors) == null) {
                            identityVerificationBlocker2 = null;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            Iterator<T> it6 = list.iterator();
                            while (it6.hasNext()) {
                                Blockers blockers2 = ((BlockerDescriptor) it6.next()).blocker;
                                IdentityVerificationBlocker identityVerificationBlocker4 = blockers2 != null ? blockers2.identity_verification : null;
                                if (identityVerificationBlocker4 != null) {
                                    arrayList4.add(identityVerificationBlocker4);
                                }
                            }
                            identityVerificationBlocker2 = (IdentityVerificationBlocker) CollectionsKt.firstOrNull((List) arrayList4);
                        }
                        if (identityVerificationBlocker2 != null && (bool = identityVerificationBlocker2.requires_full_ssn) != null) {
                            z = bool.booleanValue();
                        }
                        return new BlockersScreens.SsnScreen(blockersData, z, blockersData.ssn, new RedactedString(identityVerificationBlockerSupplement != null ? identityVerificationBlockerSupplement.ssn_main_text : null), identityVerificationBlockerSupplement != null ? identityVerificationBlockerSupplement.additional_help_items : null);
                    }
                    if (screen instanceof BlockersScreens.WelcomeScreen) {
                        return screen2;
                    }
                }
                return ((RealBlockersDescriptorNavigator) blockersDescriptorNavigator).getNext(screen, blockersData);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Screen next = ((RealBlockersDescriptorNavigator) blockersDescriptorNavigator).getNext(screen, blockersData);
                ClientScenario clientScenario = blockersData.clientScenario;
                return ((clientScenario == ClientScenario.CHANGE_PASSCODE || clientScenario == ClientScenario.RESET_PASSCODE || (clientScenario == ClientScenario.PROFILE && flow == BlockersData.Flow.LINK_CARD)) && next == screen2 && !(screen instanceof BlockersScreens.CheckmarkScreen) && !(screen instanceof BlockersScreens.StatusResultScreen)) ? new BlockersScreens.CheckmarkScreen(blockersData) : next;
            case 8:
                if (screen instanceof BlockersScreens.StatusResultScreen) {
                    return screen2;
                }
                break;
            case 9:
                return ((RealBlockersDescriptorNavigator) blockersDescriptorNavigator).getNext(screen, blockersData);
            case 10:
                return ((RealBlockersDescriptorNavigator) blockersDescriptorNavigator).getNext(screen, blockersData);
        }
        throw new IllegalArgumentException(Boxes$$ExternalSyntheticOutline1.m("Screen ", screen != null ? screen.getClass().getName() : null, " in flow ", flow.name(), " has no next."));
    }

    @Override // com.squareup.cash.data.blockers.BlockersDataNavigator
    public final Screen getSkip(Screen screen, BlockersData blockersData) {
        screen.getClass();
        blockersData.getClass();
        return ((RealBlockersDescriptorNavigator) this.blockersDescriptorNavigator).getSkip(screen, blockersData);
    }
}
