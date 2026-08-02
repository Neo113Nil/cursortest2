package com.squareup.cash.paychecks.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.braze.Braze$$ExternalSyntheticLambda34;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputElement;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputProperties;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputSticker;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.applets.presenters.PaychecksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.viewmodels.ActiveDistributionSectionBodyViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel;
import com.squareup.cash.paychecks.viewmodels.DestinationAllocationRowViewModel$Icon$Color;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewModel;
import com.squareup.cash.paychecks.viewmodels.PaycheckIconModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewModel$Main;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog;
import com.squareup.cash.payments.presenters.ExpressivePreviewData;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.presenters.PersonalizationDraft;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PersonalizePaymentResult;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PreviewSticker;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.PaymentConfigurationViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.composer.NoteInputKt$NoteInput$3$1$1$1$3;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.Reaction;
import dev.zacsweers.metro.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaycheckCirclesKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(Modifier modifier, Reaction reaction) {
        this.$r8$classId = 27;
        this.f$1 = modifier;
        this.f$0 = reaction;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0480 A[LOOP:2: B:147:0x0450->B:160:0x0480, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04fa A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ExpressivePreviewData expressivePreviewData;
        PreviewSticker previewSticker;
        Object obj3;
        Integer num;
        Float f;
        Float f2;
        Integer num2;
        Integer num3;
        String str;
        int i = this.$r8$classId;
        PaycheckCircles paycheckCircles = PaycheckCircles.INSTANCE;
        int i2 = 21;
        ComposableLambdaImpl composableLambdaImpl = null;
        boolean z = false;
        boolean z2 = false;
        int i3 = 7;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final int i4 = 1;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                PaycheckIconModel.Avatar avatar = (PaycheckIconModel.Avatar) obj5;
                Modifier modifier = (Modifier) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    paycheckCircles.AvatarCircle(avatar.image, modifier, gapComposer, 3072);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PasskeyUpsellViewModel passkeyUpsellViewModel = (PasskeyUpsellViewModel) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1587841115, new PasskeyUpsellViewKt$$ExternalSyntheticLambda0(passkeyUpsellViewModel, function1, i4), gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                JvmActuals_jvmKt.UninstalledUI((PaychecksAppletTileModel.Uninstalled) obj5, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                Navigator navigator = (Navigator) obj;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                navigator.getClass();
                coroutineScope.getClass();
                DeviceBuildInfo deviceBuildInfo = ((PaychecksAppletTilePresenter$Factory$Impl) obj5).delegateFactory;
                AndroidClock androidClock = (AndroidClock) ((Provider) deviceBuildInfo.manufacturer).invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) ((Provider) deviceBuildInfo.model).invoke();
                BinaryBitmap binaryBitmap = (BinaryBitmap) ((TemporaryStorage.MetroFactory) deviceBuildInfo.osVersion).invoke();
                PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) ((Provider) deviceBuildInfo.osBuild).invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) deviceBuildInfo.fingerprint).invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) deviceBuildInfo.tags).invoke();
                SyncValueReader syncValueReader = (SyncValueReader) ((Provider) deviceBuildInfo.brand).invoke();
                ErrorReporter errorReporter = (ErrorReporter) ((Provider) deviceBuildInfo.apiLevel).invoke();
                SampleStrategy sampleStrategy = (SampleStrategy) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                androidClock.getClass();
                moneyAnalyticsService.getClass();
                promotedAppletTilePresenter$Factory$Impl.getClass();
                realRouter$Factory$Impl.getClass();
                androidStringManager.getClass();
                syncValueReader.getClass();
                errorReporter.getClass();
                sampleStrategy.getClass();
                Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(androidClock, moneyAnalyticsService, binaryBitmap, promotedAppletTilePresenter$Factory$Impl, realRouter$Factory$Impl, androidStringManager, syncValueReader, navigator, errorReporter, sampleStrategy)), coroutineScope, (LifecycleOwner) obj4);
                return new TaxesAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 15), (short) 0);
            case 4:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ArcadeActiveDistributionsSectionBody((ActiveDistributionSectionBodyViewModel) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Disclosure((PaychecksHomeViewModel.Content.DisclosureFooter) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DirectDepositSection((PaychecksHomeViewModel.Content.Section.DirectDeposit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DistributionsNullStateSection((PaychecksHomeViewModel.Content.Section.DistributionsNullState) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.ActiveDistributionSection((PaychecksHomeViewModel.Content.Section.ActiveDistribution) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Section((PaychecksHomeViewModel.Content.Section) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                DestinationAllocationRowViewModel destinationAllocationRowViewModel = (DestinationAllocationRowViewModel) obj5;
                Map map = (Map) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(destinationAllocationRowViewModel.title);
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        KeyMappingKt.appendInlineContent(builder, (String) it.next(), "�");
                    }
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2038, HelpSheetViewKt.toArcade(destinationAllocationRowViewModel.titleColor, gapComposer3), (Composer) gapComposer3, (Modifier) null, builder.toAnnotatedString(), (TextStyle) null, (TextLineBalancing) null, map, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.Icon((DestinationAllocationRowViewModel$Icon$Color) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 12:
                EditDistributionViewModel editDistributionViewModel = (EditDistributionViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    HelpSheetViewKt.EditDistribution(editDistributionViewModel, function12, ImageKt.verticalScroll$default(Modifier.Companion.$$INSTANCE, ImageKt.rememberScrollState(gapComposer4), false, 14), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                MutableState mutableState = (MutableState) obj4;
                Integer num4 = (Integer) obj;
                num4.getClass();
                Float f3 = (Float) obj2;
                f3.getClass();
                mutableState.setValue((DistributionWheelViewModel) ((EditDistributionViewModel.Content) obj5).updateWheelViewModel.invoke((DistributionWheelViewModel) mutableState.getValue(), num4, f3));
                return Unit.INSTANCE;
            case 14:
                MultipleAllocationViewModel.Active active = (MultipleAllocationViewModel.Active) obj5;
                Function1 function13 = (Function1) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1852828289, new MultipleAllocationViewKt$$ExternalSyntheticLambda3(active, function13), gapComposer5), gapComposer5, 24576, 15);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PaycheckAlertDialogViewModel paycheckAlertDialogViewModel = (PaycheckAlertDialogViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i5 = PaycheckAlertDialog.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    HelpSheetViewKt.PaycheckAlertDialog(paycheckAlertDialogViewModel, function14, gapComposer6, 0, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PaycheckIconModel.Overflow overflow = (PaycheckIconModel.Overflow) obj5;
                Modifier modifier2 = (Modifier) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    paycheckCircles.OverflowCircle(MLKEMEngine.KyberPolyBytes, gapComposer7, modifier2, overflow.text);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.DistributePaycheckWheelContent((DistributionWheelViewModel.Content.DistributePaycheckScreen) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.DistributionWheelInnerContent((DistributionWheelViewModel.Content) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 19:
                final LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main = (LowDiskSpaceAlertViewModel$Main) obj5;
                final Function1 function15 = (Function1) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i6 = LowDiskSpaceAlertDialog.$r8$clinit;
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (!gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    gapComposer8.skipToGroupEnd();
                } else {
                    if (lowDiskSpaceAlertViewModel$Main == null) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, -195688108, false);
                    }
                    gapComposer8.startReplaceGroup(-195686630);
                    String str2 = lowDiskSpaceAlertViewModel$Main.title;
                    String str3 = lowDiskSpaceAlertViewModel$Main.message;
                    final int i7 = r9 ? 1 : 0;
                    ModalKt.Modal((Modifier) null, str2, str3, Expect_jvmKt.rememberComposableLambda(-288309679, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i8 = i7;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main2 = lowDiskSpaceAlertViewModel$Main;
                            Function1 function16 = function15;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i8) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj6;
                                    Composer composer9 = (Composer) obj7;
                                    int intValue9 = ((Integer) obj8).intValue();
                                    int i9 = LowDiskSpaceAlertDialog.$r8$clinit;
                                    modalButtonScope.getClass();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((GapComposer) composer9).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer9 = (GapComposer) composer9;
                                    if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        boolean changed = gapComposer9.changed(function16);
                                        Object rememberedValue = gapComposer9.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy2) {
                                            rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(11, function16);
                                            gapComposer9.updateRememberedValue(rememberedValue);
                                        }
                                        final char c2 = c == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-33831588, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                int i10 = c2;
                                                LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main3 = lowDiskSpaceAlertViewModel$Main2;
                                                switch (i10) {
                                                    case 0:
                                                        Composer composer10 = (Composer) obj10;
                                                        int intValue10 = ((Integer) obj11).intValue();
                                                        int i11 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.negativeButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer10.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer11 = (Composer) obj10;
                                                        int intValue11 = ((Integer) obj11).intValue();
                                                        int i12 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.positiveButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer11.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer9), gapComposer9, (57344 & (intValue9 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj6;
                                    Composer composer10 = (Composer) obj7;
                                    int intValue10 = ((Integer) obj8).intValue();
                                    int i10 = LowDiskSpaceAlertDialog.$r8$clinit;
                                    modalButtonScope2.getClass();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((GapComposer) composer10).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        boolean changed2 = gapComposer10.changed(function16);
                                        Object rememberedValue2 = gapComposer10.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                                            rememberedValue2 = new HomeViewKt$$ExternalSyntheticLambda8(10, function16);
                                            gapComposer10.updateRememberedValue(rememberedValue2);
                                        }
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(1278949775, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                int i102 = objArr2;
                                                LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main3 = lowDiskSpaceAlertViewModel$Main2;
                                                switch (i102) {
                                                    case 0:
                                                        Composer composer102 = (Composer) obj10;
                                                        int intValue102 = ((Integer) obj11).intValue();
                                                        int i11 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer102 = (GapComposer) composer102;
                                                        if (gapComposer102.shouldExecute(intValue102 & 1, (intValue102 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer102, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.negativeButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer102.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer11 = (Composer) obj10;
                                                        int intValue11 = ((Integer) obj11).intValue();
                                                        int i12 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.positiveButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer11.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer10), gapComposer10, ((intValue10 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer8), Expect_jvmKt.rememberComposableLambda(-2003908270, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i8 = i4;
                            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                            final LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main2 = lowDiskSpaceAlertViewModel$Main;
                            Function1 function16 = function15;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i8) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj6;
                                    Composer composer9 = (Composer) obj7;
                                    int intValue9 = ((Integer) obj8).intValue();
                                    int i9 = LowDiskSpaceAlertDialog.$r8$clinit;
                                    modalButtonScope.getClass();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((GapComposer) composer9).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer9 = (GapComposer) composer9;
                                    if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        boolean changed = gapComposer9.changed(function16);
                                        Object rememberedValue = gapComposer9.rememberedValue();
                                        if (changed || rememberedValue == neverEqualPolicy2) {
                                            rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(11, function16);
                                            gapComposer9.updateRememberedValue(rememberedValue);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-33831588, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                int i102 = c2;
                                                LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main3 = lowDiskSpaceAlertViewModel$Main2;
                                                switch (i102) {
                                                    case 0:
                                                        Composer composer102 = (Composer) obj10;
                                                        int intValue102 = ((Integer) obj11).intValue();
                                                        int i11 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer102 = (GapComposer) composer102;
                                                        if (gapComposer102.shouldExecute(intValue102 & 1, (intValue102 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer102, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.negativeButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer102.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer11 = (Composer) obj10;
                                                        int intValue11 = ((Integer) obj11).intValue();
                                                        int i12 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.positiveButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer11.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer9), gapComposer9, (57344 & (intValue9 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj6;
                                    Composer composer10 = (Composer) obj7;
                                    int intValue10 = ((Integer) obj8).intValue();
                                    int i10 = LowDiskSpaceAlertDialog.$r8$clinit;
                                    modalButtonScope2.getClass();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((GapComposer) composer10).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        boolean changed2 = gapComposer10.changed(function16);
                                        Object rememberedValue2 = gapComposer10.rememberedValue();
                                        if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                                            rememberedValue2 = new HomeViewKt$$ExternalSyntheticLambda8(10, function16);
                                            gapComposer10.updateRememberedValue(rememberedValue2);
                                        }
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(1278949775, new Function3() { // from class: com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                int i102 = objArr2;
                                                LowDiskSpaceAlertViewModel$Main lowDiskSpaceAlertViewModel$Main3 = lowDiskSpaceAlertViewModel$Main2;
                                                switch (i102) {
                                                    case 0:
                                                        Composer composer102 = (Composer) obj10;
                                                        int intValue102 = ((Integer) obj11).intValue();
                                                        int i11 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer102 = (GapComposer) composer102;
                                                        if (gapComposer102.shouldExecute(intValue102 & 1, (intValue102 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer102, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.negativeButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer102.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer11 = (Composer) obj10;
                                                        int intValue11 = ((Integer) obj11).intValue();
                                                        int i12 = LowDiskSpaceAlertDialog.$r8$clinit;
                                                        ((RowScope) obj9).getClass();
                                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, lowDiskSpaceAlertViewModel$Main3.positiveButtonText, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer11.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer10), gapComposer10, ((intValue10 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer8), (Function3) null, gapComposer8, 27648, 33);
                    gapComposer8.end(false);
                }
                return Unit.INSTANCE;
            case 20:
                PaymentConfigurationPresenter paymentConfigurationPresenter = (PaymentConfigurationPresenter) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                PersonalizePaymentResult personalizePaymentResult = (PersonalizePaymentResult) obj2;
                ((PaymentScreens.PersonalizePayment.PersonalizePaymentQuestion) obj).getClass();
                if (personalizePaymentResult != null) {
                    PersonalizationDraft personalizationDraft = (PersonalizationDraft) paymentConfigurationPresenter.draftStore.draft.$$delegate_0.getValue();
                    PaymentRouterData paymentRouterData = (PaymentRouterData) mutableState2.getValue();
                    String str4 = (String) personalizePaymentResult.note.getValue();
                    if (personalizationDraft != null) {
                        Image image = personalizationDraft.backgroundImage;
                        Color color = personalizationDraft.backgroundColor;
                        List list = personalizationDraft.backgroundEffects;
                        Color color2 = personalizationDraft.textColor;
                        List list2 = personalizationDraft.elements;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list2) {
                            if (obj6 instanceof Sticker) {
                                arrayList.add(obj6);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Sticker sticker = (Sticker) it2.next();
                            List<PersonalizationInputElement> list3 = personalizationDraft.remotePersonalization.elements;
                            if (list3 != null) {
                                Iterator<T> it3 = list3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        PersonalizationInputElement.Element element = ((PersonalizationInputElement) obj3).element;
                                        if (element != null) {
                                            PersonalizationInputElement.Element.Sticker sticker2 = element instanceof PersonalizationInputElement.Element.Sticker ? (PersonalizationInputElement.Element.Sticker) element : null;
                                            PersonalizationInputSticker value = sticker2 != null ? sticker2.getValue() : null;
                                            if (value != null) {
                                                str = value.sticker_id;
                                                if (!Intrinsics.areEqual(str, sticker.remoteId)) {
                                                }
                                            }
                                        }
                                        str = null;
                                        if (!Intrinsics.areEqual(str, sticker.remoteId)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                PersonalizationInputElement personalizationInputElement = (PersonalizationInputElement) obj3;
                                if (personalizationInputElement != null) {
                                    int i8 = sticker.id;
                                    String str5 = sticker.mainUrl;
                                    PersonalizationInputProperties personalizationInputProperties = personalizationInputElement.properties;
                                    int intValue9 = (personalizationInputProperties == null || (num3 = personalizationInputProperties.x) == null) ? 0 : num3.intValue();
                                    PersonalizationInputProperties personalizationInputProperties2 = personalizationInputElement.properties;
                                    int intValue10 = (personalizationInputProperties2 == null || (num2 = personalizationInputProperties2.y) == null) ? 0 : num2.intValue();
                                    PersonalizationInputProperties personalizationInputProperties3 = personalizationInputElement.properties;
                                    float floatValue = (personalizationInputProperties3 == null || (f2 = personalizationInputProperties3.rotation) == null) ? 0.0f : f2.floatValue();
                                    PersonalizationInputProperties personalizationInputProperties4 = personalizationInputElement.properties;
                                    float floatValue2 = (personalizationInputProperties4 == null || (f = personalizationInputProperties4.scale_factor) == null) ? 1.0f : f.floatValue();
                                    PersonalizationInputProperties personalizationInputProperties5 = personalizationInputElement.properties;
                                    previewSticker = new PreviewSticker(i8, str5, intValue9, intValue10, floatValue, floatValue2, (personalizationInputProperties5 == null || (num = personalizationInputProperties5.z) == null) ? 0.0f : num.intValue(), sticker.accessibilityDescription);
                                    if (previewSticker == null) {
                                        arrayList2.add(previewSticker);
                                    }
                                }
                            }
                            previewSticker = null;
                            if (previewSticker == null) {
                            }
                        }
                        expressivePreviewData = new ExpressivePreviewData(image, color, list, color2, arrayList2);
                    } else {
                        expressivePreviewData = null;
                    }
                    mutableState2.setValue(PaymentRouterData.copy$default(paymentRouterData, null, str4, null, false, false, false, null, null, false, null, false, false, null, null, expressivePreviewData, null, null, null, false, 16515067));
                }
                return Unit.INSTANCE;
            case 21:
                final ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel = (ConfirmDuplicateDialogViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    final int i9 = r9 ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1618030766, new Function3() { // from class: com.squareup.cash.payments.views.ConfirmDuplicateDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i10 = i9;
                            ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel2 = confirmDuplicateDialogViewModel;
                            switch (i10) {
                                case 0:
                                    Composer composer10 = (Composer) obj8;
                                    int intValue12 = ((Integer) obj9).intValue();
                                    ((ColumnScope) obj7).getClass();
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                                        String str6 = confirmDuplicateDialogViewModel2.title;
                                        if (str6 == null) {
                                            gapComposer10.startReplaceGroup(-336571304);
                                        } else {
                                            gapComposer10.startReplaceGroup(-336571303);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer11 = (Composer) obj8;
                                    int intValue13 = ((Integer) obj9).intValue();
                                    ((ColumnScope) obj7).getClass();
                                    GapComposer gapComposer11 = (GapComposer) composer11;
                                    if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        String str7 = confirmDuplicateDialogViewModel2.message;
                                        if (str7 == null) {
                                            gapComposer11.startReplaceGroup(-904541543);
                                        } else {
                                            gapComposer11.startReplaceGroup(-904541542);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer11.end(false);
                                    } else {
                                        gapComposer11.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer9);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(93247601, new Function3() { // from class: com.squareup.cash.payments.views.ConfirmDuplicateDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i10 = i4;
                            ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel2 = confirmDuplicateDialogViewModel;
                            switch (i10) {
                                case 0:
                                    Composer composer10 = (Composer) obj8;
                                    int intValue12 = ((Integer) obj9).intValue();
                                    ((ColumnScope) obj7).getClass();
                                    GapComposer gapComposer10 = (GapComposer) composer10;
                                    if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                                        String str6 = confirmDuplicateDialogViewModel2.title;
                                        if (str6 == null) {
                                            gapComposer10.startReplaceGroup(-336571304);
                                        } else {
                                            gapComposer10.startReplaceGroup(-336571303);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer11 = (Composer) obj8;
                                    int intValue13 = ((Integer) obj9).intValue();
                                    ((ColumnScope) obj7).getClass();
                                    GapComposer gapComposer11 = (GapComposer) composer11;
                                    if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                                        String str7 = confirmDuplicateDialogViewModel2.message;
                                        if (str7 == null) {
                                            gapComposer11.startReplaceGroup(-904541543);
                                        } else {
                                            gapComposer11.startReplaceGroup(-904541542);
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                        }
                                        gapComposer11.end(false);
                                    } else {
                                        gapComposer11.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer9);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1069145827, new ProfileKt$$ExternalSyntheticLambda1(5, (Object) confirmDuplicateDialogViewModel, (Object) function16), gapComposer9);
                    String str6 = confirmDuplicateDialogViewModel.secondaryButtonText;
                    if (str6 == null) {
                        gapComposer9.startReplaceGroup(-101525702);
                        gapComposer9.end(false);
                    } else {
                        gapComposer9.startReplaceGroup(-101525701);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-326774360, new TabContentViewKt$$ExternalSyntheticLambda11(function16, str6, 25), gapComposer9);
                        gapComposer9.end(false);
                    }
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, composableLambdaImpl, (Function3) null, gapComposer9, 3504, 32);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Function1 function17 = (Function1) obj5;
                DuplicatePaymentViewModel duplicatePaymentViewModel = (DuplicatePaymentViewModel) obj4;
                Composer composer10 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    boolean changed = gapComposer10.changed(function17);
                    Object rememberedValue = gapComposer10.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(20, function17);
                        gapComposer10.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer10.changed(function17);
                    Object rememberedValue2 = gapComposer10.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HomeViewKt$$ExternalSyntheticLambda8(i2, function17);
                        gapComposer10.updateRememberedValue(rememberedValue2);
                    }
                    QuickPayViewKt.DuplicatePayment(0, gapComposer10, null, duplicatePaymentViewModel.title, duplicatePaymentViewModel.subtitle, function0, (Function0) rememberedValue2);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer11 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean changed3 = gapComposer11.changed(delegatingSoftwareKeyboardController) | gapComposer11.changed(function18);
                    Object rememberedValue3 = gapComposer11.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function18, 13);
                        gapComposer11.updateRememberedValue(rememberedValue3);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer11, ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue3, 15), ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.personalize_payment_tooltip), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                NoteRequiredViewModel noteRequiredViewModel = (NoteRequiredViewModel) obj5;
                Function1 function19 = (Function1) obj4;
                Composer composer12 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    String str7 = noteRequiredViewModel.title;
                    if (str7 == null) {
                        str7 = "";
                    }
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, str7, noteRequiredViewModel.body, Expect_jvmKt.rememberComposableLambda(-673146174, new ProfileKt$$ExternalSyntheticLambda1(i3, (Object) noteRequiredViewModel, function19), gapComposer12), (Function3) null, (Function3) null, gapComposer12, 3072, 48);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Function1 function110 = (Function1) obj5;
                PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                Composer composer13 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    gapComposer13.startReplaceGroup(1635727538);
                    float mo233toDpu2uoSUM = ((Density) gapComposer13.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer13.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() & BodyPartID.bodyIdMax));
                    gapComposer13.end(false);
                    float f4 = mo233toDpu2uoSUM * 0.6f;
                    Object[] objArr = new Object[0];
                    boolean changed4 = (((((384 & 896) == true ? 1 : 0) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer13.changed(false)) || (384 & MLKEMEngine.KyberPolyBytes) == 256) | gapComposer13.changed(-1) | gapComposer13.changed(true);
                    Object rememberedValue4 = gapComposer13.rememberedValue();
                    int i10 = 10;
                    Object obj7 = rememberedValue4;
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        Braze$$ExternalSyntheticLambda34 braze$$ExternalSyntheticLambda34 = new Braze$$ExternalSyntheticLambda34(r9, i10);
                        gapComposer13.updateRememberedValue(braze$$ExternalSyntheticLambda34);
                        obj7 = braze$$ExternalSyntheticLambda34;
                    }
                    CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) SaverKt.m581rememberSaveable(objArr, (Saver) CoreFlowRealSheetState.Saver, (Function0) obj7, (Composer) gapComposer13, 0);
                    CoreFlowSheetPosition coreFlowSheetPosition = (CoreFlowSheetPosition) coreFlowRealSheetState.draggableState.settledValue$delegate.getValue();
                    boolean changed5 = gapComposer13.changed(coreFlowRealSheetState) | gapComposer13.changed(function110);
                    Object rememberedValue5 = gapComposer13.rememberedValue();
                    Object obj8 = rememberedValue5;
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        MainPaymentView$Content$2$1 mainPaymentView$Content$2$1 = new MainPaymentView$Content$2$1(coreFlowRealSheetState, function110, z ? 1 : 0, 24);
                        gapComposer13.updateRememberedValue(mainPaymentView$Content$2$1);
                        obj8 = mainPaymentView$Content$2$1;
                    }
                    Updater.LaunchedEffect(gapComposer13, coreFlowSheetPosition, (Function2) obj8);
                    boolean changedInstance = gapComposer13.changedInstance(paymentConfigurationViewModel) | gapComposer13.changed(coreFlowRealSheetState);
                    Object rememberedValue6 = gapComposer13.rememberedValue();
                    Object obj9 = rememberedValue6;
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        OverlayKt$Overlay$1$1$1$1$1 overlayKt$Overlay$1$1$1$1$1 = new OverlayKt$Overlay$1$1$1$1$1(paymentConfigurationViewModel, coreFlowRealSheetState, z2 ? 1 : 0, 22);
                        gapComposer13.updateRememberedValue(overlayKt$Overlay$1$1$1$1$1);
                        obj9 = overlayKt$Overlay$1$1$1$1$1;
                    }
                    Updater.LaunchedEffect(gapComposer13, paymentConfigurationViewModel, (Function2) obj9);
                    boolean changed6 = gapComposer13.changed(function110);
                    Object rememberedValue7 = gapComposer13.rememberedValue();
                    Object obj10 = rememberedValue7;
                    if (changed6 || rememberedValue7 == neverEqualPolicy) {
                        WarningDialogViewKt$$ExternalSyntheticLambda5 warningDialogViewKt$$ExternalSyntheticLambda5 = new WarningDialogViewKt$$ExternalSyntheticLambda5(10, function110);
                        gapComposer13.updateRememberedValue(warningDialogViewKt$$ExternalSyntheticLambda5);
                        obj10 = warningDialogViewKt$$ExternalSyntheticLambda5;
                    }
                    DBUtil.BackHandler(false, (Function0) obj10, gapComposer13, 0, 1);
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1307454987, new PaymentConfigurationViewKt$$ExternalSyntheticLambda3(f4, function110, coreFlowRealSheetState, paymentConfigurationViewModel, mo233toDpu2uoSUM, 0), gapComposer13), gapComposer13, 3072, 7);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                QuickPayViewKt.SelectedTrackCard((SelectedTrack) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                Modifier modifier3 = (Modifier) obj4;
                Reaction reaction = (Reaction) obj5;
                Composer composer14 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Colors.Component component = colors.component;
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new MainPaymentViewKt$$ExternalSyntheticLambda0(i2);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue8, modifier3, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1324972916, new PoolListSectionKt$$ExternalSyntheticLambda2(reaction, i3), gapComposer14), gapComposer14, 1600902, 32);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                WarningDialogViewModel warningDialogViewModel = (WarningDialogViewModel) obj5;
                Function1 function111 = (Function1) obj4;
                Composer composer15 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Expect_jvmKt.rememberComposableLambda(1633263408, new WarningDialogViewKt$$ExternalSyntheticLambda2(warningDialogViewModel, r9 ? 1 : 0), gapComposer15), Expect_jvmKt.rememberComposableLambda(-518219727, new WarningDialogViewKt$$ExternalSyntheticLambda2(warningDialogViewModel, i4), gapComposer15), Expect_jvmKt.rememberComposableLambda(1105834501, new ProfileKt$$ExternalSyntheticLambda1(9, (Object) warningDialogViewModel, function111), gapComposer15), (Function3) null, (Function3) null, gapComposer15, 3504, 48);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((NoteInputKt$NoteInput$3$1$1$1$3) obj5).Decoration((ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel, Function1 function1) {
        this.$r8$classId = 21;
        this.f$0 = confirmDuplicateDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(NoteRequiredViewModel noteRequiredViewModel, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = noteRequiredViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(WarningDialogViewModel warningDialogViewModel, Function1 function1) {
        this.$r8$classId = 28;
        this.f$0 = warningDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ PaycheckCirclesKt$$ExternalSyntheticLambda3(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
