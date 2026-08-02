package com.squareup.cash.blockers.actions.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionConfirmSheetViewModel;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$models$7$1;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class BlockerActionConfirmSheetPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AppForegroundStateProvider appForegroundStateProvider;
    public final BlockersScreens.BlockerActionConfirmSheetScreen args;
    public final BlockerActionUriDecoder blockerActionUriDecoder;
    public final MultiBlockerFacilitator$Resolver blockerResolver;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final BlockerAction scheduledAction;
    public final Long scheduledActionDelayMs;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockerAction.ConfirmationSheet.Variant.values().length];
            try {
                iArr[BlockerAction.ConfirmationSheet.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockerAction.ConfirmationSheet.Variant.VARIANT_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockerAction.ConfirmationSheet.Variant.VARIANT_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BlockerActionConfirmSheetPresenter(RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersScreens.BlockerActionConfirmSheetScreen blockerActionConfirmSheetScreen, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AppForegroundStateProvider appForegroundStateProvider, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator, Analytics analytics, BlockerActionUriDecoder blockerActionUriDecoder) {
        blockerActionConfirmSheetScreen.getClass();
        this.args = blockerActionConfirmSheetScreen;
        this.appForegroundStateProvider = appForegroundStateProvider;
        this.navigator = screenNavigator;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.blockerActionUriDecoder = blockerActionUriDecoder;
        this.blockerResolver = realMultiBlockerFacilitator.getResolver(screenNavigator, blockerActionConfirmSheetScreen);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        BlockerAction.ConfirmationSheet confirmationSheet = blockerActionConfirmSheetScreen.confirmationSheet;
        this.scheduledActionDelayMs = confirmationSheet.scheduled_action_delay_ms;
        this.scheduledAction = confirmationSheet.scheduled_action;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object original;
        Object obj;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-997920016);
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState(((RealAppForegroundStateProvider) this.appForegroundStateProvider).appForegroundState, null, gapComposer, 1);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
        AppForegroundState appForegroundState = (AppForegroundState) collectAsState.getValue();
        boolean changed = gapComposer.changed(collectAsState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj2) {
            rememberedValue4 = new CardSchemePresenter$models$7$1(1, collectAsState, parcelableSnapshotMutableIntState, null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, appForegroundState, (Function2) rememberedValue4);
        if (this.scheduledActionDelayMs == null || ((AppForegroundState) collectAsState.getValue()) != AppForegroundState.FOREGROUND) {
            gapComposer.startReplaceGroup(729615666);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(729059247);
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            Boolean bool = (Boolean) mutableState.getValue();
            bool.getClass();
            AppForegroundState appForegroundState2 = (AppForegroundState) collectAsState.getValue();
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == obj2) {
                rememberedValue5 = new SsnPresenter$models$2$2(this, mutableState, continuation, 4);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(valueOf, bool, appForegroundState2, (Function2) rememberedValue5, gapComposer);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, parcelableSnapshotMutableIntState, mutableState, mutableState2, 26));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            obj = BlockerActionConfirmSheetViewModel.LoadingSubmit.INSTANCE;
        } else if (((ApiResult.Success) mutableState2.getValue()) != null) {
            obj = BlockerActionConfirmSheetViewModel.SubmitSuccess.INSTANCE;
        } else {
            BlockerAction.ConfirmationSheet confirmationSheet = this.args.confirmationSheet;
            Avatar avatar = confirmationSheet.avatar;
            UiAvatar uiAvatar = avatar != null ? StackedAvatarViewModelKt.toUiAvatar(avatar) : null;
            BlockerAction.ConfirmationSheet.Variant variant = confirmationSheet.variant;
            int i2 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
            if (i2 == -1 || i2 == 1) {
                String str = confirmationSheet.title;
                str.getClass();
                String str2 = confirmationSheet.subtitle;
                String str3 = confirmationSheet.message;
                str3.getClass();
                String str4 = confirmationSheet.confirm_button_text;
                String str5 = confirmationSheet.return_button_text;
                Boolean bool2 = confirmationSheet.invert_button_treatment;
                original = new BlockerActionConfirmSheetViewModel.Main.Original(uiAvatar, str, str2, str3, str4, str5, bool2 != null ? bool2.booleanValue() : false);
            } else if (i2 == 2) {
                String str6 = confirmationSheet.title;
                str6.getClass();
                String str7 = confirmationSheet.message;
                str7.getClass();
                String str8 = confirmationSheet.confirm_button_text;
                String str9 = confirmationSheet.return_button_text;
                Boolean bool3 = confirmationSheet.invert_button_treatment;
                original = new BlockerActionConfirmSheetViewModel.Main.VariantA(uiAvatar, str6, str7, str8, str9, bool3 != null ? bool3.booleanValue() : false);
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                String str10 = confirmationSheet.title;
                str10.getClass();
                String str11 = confirmationSheet.message;
                str11.getClass();
                String str12 = confirmationSheet.confirm_button_text;
                String str13 = confirmationSheet.return_button_text;
                Boolean bool4 = confirmationSheet.invert_button_treatment;
                original = new BlockerActionConfirmSheetViewModel.Main.VariantC(uiAvatar, str10, str11, str12, str13, bool4 != null ? bool4.booleanValue() : false);
            }
            obj = original;
        }
        gapComposer.end(false);
        return obj;
    }
}
