package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.fillr.e0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewModel;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.FileBlocker;
import com.squareup.protos.franklin.api.FileCategory;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class FileBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.FileBlockerScreen args;
    public final e0 blockerImageUploader;
    public final RealBlockersHelper blockersHelper;
    public final BlockersDataNavigator blockersNavigator;
    public final FileCategory category;
    public final BetterNavigator.ScreenNavigator navigator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UploadState {
        public static final /* synthetic */ UploadState[] $VALUES;
        public static final UploadState FAILED;
        public static final UploadState IDLE;
        public static final UploadState IN_PROGRESS;

        static {
            UploadState uploadState = new UploadState("IDLE", 0);
            IDLE = uploadState;
            UploadState uploadState2 = new UploadState("IN_PROGRESS", 1);
            IN_PROGRESS = uploadState2;
            UploadState uploadState3 = new UploadState("FAILED", 2);
            FAILED = uploadState3;
            $VALUES = new UploadState[]{uploadState, uploadState2, uploadState3};
        }

        public static UploadState valueOf(String str) {
            return (UploadState) Enum.valueOf(UploadState.class, str);
        }

        public static UploadState[] values() {
            return (UploadState[]) $VALUES.clone();
        }
    }

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileCategory.values().length];
            try {
                iArr[FileCategory.DEBIT_CARD_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileCategory.DEBIT_CARD_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileCategory.GOVERNMENT_ISSUED_ID_FRONT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FileCategory.GOVERNMENT_ISSUED_ID_BACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FileBlockerPresenter(Analytics analytics, BlockersDataNavigator blockersDataNavigator, BlockerImageUploader$Factory$Impl blockerImageUploader$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.FileBlockerScreen fileBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.args = fileBlockerScreen;
        this.navigator = screenNavigator;
        this.category = fileBlockerScreen.category;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = blockerImageUploader$Factory$Impl.delegateFactory;
        BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
        RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics2 = (Analytics) blockerImageUploader$MetroFactory.analytics.getValue();
        CoroutineContext coroutineContext = (CoroutineContext) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
        blockersDataNavigator2.getClass();
        realMultiBlockerFacilitator.getClass();
        androidStringManager.getClass();
        analytics2.getClass();
        coroutineContext.getClass();
        this.blockerImageUploader = new e0(screenNavigator, blockersDataNavigator2, realMultiBlockerFacilitator, androidStringManager, analytics2, coroutineContext, 23);
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(366326832);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new MLKitTitleGenerator$1(this, null, 26);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(UploadState.IDLE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState3 = (MutableState) rememberedValue4;
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState3, (Object) mutableState2, (State) mutableState, 2));
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        UploadState uploadState = (UploadState) mutableState.getValue();
        boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
        BlockersScreens.FileBlockerScreen fileBlockerScreen = this.args;
        FileCategory fileCategory = fileBlockerScreen.category;
        String str = fileBlockerScreen.mainText;
        String str2 = fileBlockerScreen.confirmationMainText;
        String str3 = fileBlockerScreen.footerText;
        FileBlocker.FooterIcon footerIcon = fileBlockerScreen.footerIcon;
        List list = fileBlockerScreen.helpItems;
        FileBlockerViewModel fileBlockerViewModel = new FileBlockerViewModel(fileCategory, str, str2, str3, footerIcon, !(list == null || list.isEmpty()), new FileBlockerViewModel.LoadingState(booleanValue || uploadState == UploadState.IN_PROGRESS, uploadState == UploadState.IN_PROGRESS), uploadState == UploadState.FAILED, booleanValue2);
        gapComposer.end(false);
        return fileBlockerViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final InstanceFactory blockerImageUploaderFactory;
        public final Provider blockersHelperFactory;
        public final Provider blockersNavigator;

        public /* synthetic */ MetroFactory(MoneyUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, RealMessageSigner.MetroFactory metroFactory2, InstanceFactory instanceFactory) {
            this.blockersNavigator = metroFactory;
            this.analytics = doubleCheck;
            this.blockersHelperFactory = metroFactory2;
            this.blockerImageUploaderFactory = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2) {
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.blockerImageUploaderFactory = instanceFactory;
            this.blockersHelperFactory = instanceFactory2;
        }
    }
}
