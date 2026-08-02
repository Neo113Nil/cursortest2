package com.squareup.cash.data.blockers;

import android.os.Parcelable;
import androidx.tracing.Trace;
import androidx.viewbinding.ViewBindings;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.LinkingFlowsData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.requirements.SetAddressRequirementData;
import com.squareup.protos.franklin.accounts.AddressSource;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.wire.AndroidMessage;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public interface FlowStarter {
    static BlockersData startFlow$default(FlowStarter flowStarter, BlockersData.Flow flow, Screen screen, ScenarioPlan scenarioPlan, ClientScenario clientScenario, String str, Screen screen2, BlockersData.AnalyticsData analyticsData, BlockersData.MoneybotContext moneybotContext, Function1 function1, int i) {
        Boolean bool;
        Boolean bool2;
        Continuation continuation = null;
        ScenarioPlan scenarioPlan2 = (i & 4) != 0 ? null : scenarioPlan;
        ClientScenario clientScenario2 = (i & 8) != 0 ? null : clientScenario;
        boolean z = true;
        boolean z2 = (i & 16) != 0;
        String str2 = (i & 32) != 0 ? null : str;
        Screen screen3 = (i & 64) != 0 ? screen : screen2;
        BlockersData.AnalyticsData analyticsData2 = (i & 128) != 0 ? null : analyticsData;
        BlockersData.MoneybotContext moneybotContext2 = (i & 256) != 0 ? null : moneybotContext;
        Function1 matcher$$ExternalSyntheticLambda9 = (i & 512) != 0 ? new Matcher$$ExternalSyntheticLambda9(24) : function1;
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        flow.getClass();
        screen.getClass();
        screen3.getClass();
        if (!realFlowStarter.blockersConfigReady.isCompleted() || !realFlowStarter.instrumentLinkingConfigReady.isCompleted()) {
            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new CardModelView.AnonymousClass1.C00581(realFlowStarter, continuation, 27));
        }
        BlockersConfig blockersConfig = realFlowStarter.blockersConfig;
        if (blockersConfig == null) {
            a$$ExternalSyntheticBUOutline0.m$3("blockersConfig failed to initialize prior to startFlow request");
            return null;
        }
        InstrumentLinkingConfig instrumentLinkingConfig = realFlowStarter.instrumentLinkingConfig;
        if (instrumentLinkingConfig == null) {
            a$$ExternalSyntheticBUOutline0.m$3("instrumentLinkingConfig failed to initialize prior to startFlow request");
            return null;
        }
        BankAccountLinkingConfig bankAccountLinkingConfig = instrumentLinkingConfig.bank_account_linking_config;
        if (str2 == null) {
            BlockersData.Flow.INSTANCE.getClass();
            str2 = BlockersData.Flow.Companion.generateToken();
        }
        Region region = realFlowStarter.regionProvider.get();
        BlockersData.Style style = scenarioPlan2 != null ? Intrinsics.areEqual(scenarioPlan2.display_in_dialog, Boolean.TRUE) : false ? BlockersData.Style.DIALOG : BlockersData.Style.FULLSCREEN;
        if (bankAccountLinkingConfig != null && (bool2 = bankAccountLinkingConfig.manual_ach_enabled) != null) {
            z = bool2.booleanValue();
        }
        boolean booleanValue = (bankAccountLinkingConfig == null || (bool = bankAccountLinkingConfig.force_manual_ach) == null) ? false : bool.booleanValue();
        LinkingFlowsData linkingFlowsData = new LinkingFlowsData(bankAccountLinkingConfig != null ? bankAccountLinkingConfig.supported_linking_flows : null, bankAccountLinkingConfig != null ? bankAccountLinkingConfig.preferred_linking_flow : null);
        OAuthConfig oAuthConfig = bankAccountLinkingConfig != null ? bankAccountLinkingConfig.bank_account_oauth_config : null;
        BlockersData.BankAccountOAuthConfigSource bankAccountOAuthConfigSource = BlockersData.BankAccountOAuthConfigSource.APP_CONFIG;
        Boolean bool3 = blockersConfig.address_typeahead_enabled;
        boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.firstOrNull(Trace.generateNextBlockers(scenarioPlan2, null));
        BlockersData copy$default = BlockersData.copy$default((BlockersData) matcher$$ExternalSyntheticLambda9.invoke(new BlockersData(flow, str2, screen, screen3, "CUSTOMER_PASSCODE", z, booleanValue, linkingFlowsData, oAuthConfig, bankAccountOAuthConfigSource, booleanValue2, clientScenario2, style, scenarioPlan2, analyticsData2, region, new RequestContext(null, null, blockerDescriptor != null ? blockerDescriptor.id : null, null, null, null, null, null, 8127), moneybotContext2, -523972, 40911)), null, null, Long.valueOf(realFlowStarter.clock.millis()), null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -5, 65535);
        if (z2) {
            BlockerFlowListener.onFlowStarted$default(realFlowStarter.blockersFlowAnalytics, copy$default, null, null, 14);
        }
        return copy$default;
    }

    static BlockersScreens.RegisterAliasScreen startOnboardingFlow$default(FlowStarter flowStarter) {
        ClientScenario clientScenario = ClientScenario.ONBOARDING;
        clientScenario.getClass();
        BlockersScreens.RegisterAliasScreen.Mode mode = null;
        RedactedString redactedString = null;
        return new BlockersScreens.RegisterAliasScreen(startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.ONBOARDING, PaymentScreens$HomeScreens$Home.INSTANCE, null, clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), mode, redactedString, null, null, null, null, null, false, false, null, 2046);
    }

    static BlockersScreens.StartFlowEntryPointScreen startPlasmaFlow$default(FlowStarter flowStarter, Flow$Type flow$Type, Screen screen, Screen screen2, BlockersScreens.StartFlowEntryPointScreen.Origin origin, int i) {
        Screen screen3 = (i & 4) != 0 ? screen : screen2;
        BlockersScreens.StartFlowEntryPointScreen.Origin origin2 = (i & 8) != 0 ? null : origin;
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        flow$Type.getClass();
        screen.getClass();
        return new BlockersScreens.StartFlowEntryPointScreen(startFlow$default(realFlowStarter, flow$Type == Flow$Type.POST_SIGN_IN ? BlockersData.Flow.ONBOARDING : BlockersData.Flow.CLIENT_SCENARIO, screen, null, ClientScenario.PLASMA, null, null, null, null, new RealFlowStarter$$ExternalSyntheticLambda5(flow$Type, 0), 500), (String) null, screen3, origin2, 10);
    }

    static BlockersScreens.StartFlowEntryPoint startPlasmaFlowWithParams$default(FlowStarter flowStarter, Flow$Type flow$Type, AndroidMessage androidMessage, Screen screen, ScenarioInitiatorType scenarioInitiatorType, Screen screen2, BlockersData.AnalyticsData analyticsData, ColorModel colorModel, int i) {
        ScenarioInitiatorType scenarioInitiatorType2 = (i & 8) != 0 ? null : scenarioInitiatorType;
        Screen screen3 = (i & 32) != 0 ? null : screen2;
        BlockersData.AnalyticsData analyticsData2 = (i & 64) != 0 ? null : analyticsData;
        ColorModel colorModel2 = (i & 128) != 0 ? null : colorModel;
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        flow$Type.getClass();
        androidMessage.getClass();
        screen.getClass();
        return realFlowStarter.startPlasmaFlowWithParams(ViewBindings.buildInitiationData(flow$Type, androidMessage), screen, scenarioInitiatorType2, null, screen3, analyticsData2, colorModel2, false, null);
    }

    static BlockersData startProfileBlockersFlow$default(FlowStarter flowStarter, ClientScenario clientScenario, Screen screen, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        FlowStarter$$ExternalSyntheticLambda0 flowStarter$$ExternalSyntheticLambda0 = new FlowStarter$$ExternalSyntheticLambda0(0);
        clientScenario.getClass();
        screen.getClass();
        return startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.PROFILE_BLOCKERS, screen, null, clientScenario, str2, null, null, null, flowStarter$$ExternalSyntheticLambda0, 468);
    }

    static BlockersScreens.RegisterAliasScreen startRegisterEmailFlow$default(FlowStarter flowStarter, Screen screen, String str, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        screen.getClass();
        return new BlockersScreens.RegisterAliasScreen(startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, screen, null, ClientScenario.ACQUIRE_ALIAS, null, null, null, null, null, 884), BlockersScreens.RegisterAliasScreen.Mode.REGISTER_EMAIL, new RedactedString(str2), null, null, null, null, null, false, false, BlockersScreens.RegisterAliasScreen.RegisterAliasType.RegisterAliasOnly.INSTANCE, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
    }

    static BlockersScreens.RegisterAliasScreen startRegisterSmsFlow$default(FlowStarter flowStarter, Screen screen, String str, int i) {
        String str2 = (i & 2) != 0 ? null : str;
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        screen.getClass();
        return new BlockersScreens.RegisterAliasScreen(startFlow$default(realFlowStarter, BlockersData.Flow.PROFILE_BLOCKERS, screen, null, ClientScenario.ACQUIRE_ALIAS, null, null, null, null, null, 884), BlockersScreens.RegisterAliasScreen.Mode.REGISTER_SMS, new RedactedString(str2), null, null, null, null, null, false, false, BlockersScreens.RegisterAliasScreen.RegisterAliasType.RegisterAliasOnly.INSTANCE, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
    }

    static BlockersScreens.StartFlowEntryPoint startSetAddressFlow$default(FlowStarter flowStarter, int i) {
        AddressSource addressSource = AddressSource.BUSINESS;
        if ((i & 2) != 0) {
            addressSource = null;
        }
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        Flow$Type flow$Type = Flow$Type.SET_ADDRESS;
        SetAddressRequirementData setAddressRequirementData = new SetAddressRequirementData(true, addressSource);
        ProfileScreens.AccountInfoScreen accountInfoScreen = ProfileScreens.AccountInfoScreen.INSTANCE;
        return startPlasmaFlowWithParams$default(realFlowStarter, flow$Type, setAddressRequirementData, accountInfoScreen, null, accountInfoScreen, null, null, 984);
    }

    static /* synthetic */ BlockersScreens.StatusResultFullScreen startStatusResultFlow$default(FlowStarter flowStarter, StatusResult statusResult, List list, Screen screen, ClientScenario clientScenario, String str, int i) {
        if ((i & 8) != 0) {
            clientScenario = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return ((RealFlowStarter) flowStarter).startStatusResultFlow(statusResult, list, screen, clientScenario, str, null);
    }

    static BlockersData startTransferFlow$default(FlowStarter flowStarter, Screen screen, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
        realFlowStarter.getClass();
        screen.getClass();
        return startFlow$default(realFlowStarter, BlockersData.Flow.TRANSFER, screen, null, ClientScenario.TRANSFER_FUNDS, str, null, null, null, null, 724);
    }

    static /* synthetic */ BlockersScreens.StartFlowEntryPoint startPlasmaFlowWithParams$default(FlowStarter flowStarter, String str, Screen screen, ScenarioInitiatorType scenarioInitiatorType, String str2, Screen screen2, BlockersData.AnalyticsData analyticsData, boolean z, BlockersData.MoneybotContext moneybotContext, int i) {
        if ((i & 4) != 0) {
            scenarioInitiatorType = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            screen2 = null;
        }
        if ((i & 32) != 0) {
            analyticsData = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return ((RealFlowStarter) flowStarter).startPlasmaFlowWithParams(str, screen, scenarioInitiatorType, str2, screen2, analyticsData, null, z, (i & 256) != 0 ? null : moneybotContext);
    }
}
