package com.squareup.cash.blockers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewModel;
import com.squareup.cash.blockers.actions.views.BlockerActionDialogActionViewKt;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewModel;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanLoadingViewModel;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanErrorView;
import com.squareup.cash.blockers.scenarioplan.views.ScenarioPlanLoadingView;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.AtmPickerAmountBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadErrorViewModel;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewModel;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.SelectionViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.qrcodes.views.CashQrCameraXScannerView;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public final /* synthetic */ class BirthdayView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BirthdayView$$ExternalSyntheticLambda0(Function3 function3, Function3 function32, FilesetUploadErrorViewModel filesetUploadErrorViewModel) {
        this.$r8$classId = 6;
        this.f$0 = function3;
        this.f$1 = function32;
        this.f$2 = filesetUploadErrorViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Icons icons;
        Modifier.Companion companion;
        boolean z;
        Object obj3;
        int i2 = this.$r8$classId;
        int i3 = 48;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        int i4 = 3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                int i5 = BirthdayView.$r8$clinit;
                ((BirthdayView) obj6).Content((BirthdayViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                BlockerActionDialogActionViewKt.BlockerActionDialog((BlockerActionDialogActionViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((ScenarioPlanErrorView) obj6).Content((ScenarioPlanErrorViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i6 = ScenarioPlanLoadingView.$r8$clinit;
                ((ScenarioPlanLoadingView) obj6).Content((ScenarioPlanLoadingViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj6;
                AmountConfig amountConfig = (AmountConfig) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TickersAmountCaptionKt.FullscreenAmountPicker(amountPickerViewModel, amountConfig, function1, null, null, gapComposer, 64, 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i7 = ArcadeFilesetUploadErrorDialogView.$r8$clinit;
                ((ArcadeFilesetUploadErrorDialogView) obj6).Content((FilesetUploadErrorViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Function3 function3 = (Function3) obj6;
                Function3 function32 = (Function3) obj5;
                FilesetUploadErrorViewModel filesetUploadErrorViewModel = (FilesetUploadErrorViewModel) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i8 = 1;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, Expect_jvmKt.rememberComposableLambda(223107995, new ArcadeFilesetUploadErrorDialogViewKt$$ExternalSyntheticLambda4(filesetUploadErrorViewModel, 0), gapComposer2), Expect_jvmKt.rememberComposableLambda(-1380895878, new ArcadeFilesetUploadErrorDialogViewKt$$ExternalSyntheticLambda4(filesetUploadErrorViewModel, i8), gapComposer2), function3, function32, (Function3) null, gapComposer2, 432, 32);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int i9 = ArcadeFilesetUploadLoadingDialogView.$r8$clinit;
                ((ArcadeFilesetUploadLoadingDialogView) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(789953583, new ArcadeFilesetUploadViewKt$$ExternalSyntheticLambda5(filesetUploadViewModel, function12, 0), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AmountBlockerViewKt.Content((AtmPickerAmountBlockerViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel = (EarnerEnrollmentBlockerViewModel) obj6;
                Function1 function13 = (Function1) obj4;
                BlockersScreens.EarnerEnrollmentBlockerScreenArgs earnerEnrollmentBlockerScreenArgs = (BlockersScreens.EarnerEnrollmentBlockerScreenArgs) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlocker(earnerEnrollmentBlockerViewModel, function13, earnerEnrollmentBlockerScreenArgs instanceof BlockersScreens.EarnerEnrollmentBlockerSheet, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                EarnerEnrollmentBlockerViewModel earnerEnrollmentBlockerViewModel2 = (EarnerEnrollmentBlockerViewModel) obj6;
                Function1 function14 = (Function1) obj4;
                BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs earnerEnrollmentSuccessBlockerScreenArgs = (BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs) obj5;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlocker(earnerEnrollmentBlockerViewModel2, function14, earnerEnrollmentSuccessBlockerScreenArgs instanceof BlockersScreens.EarnerEnrollmentSuccessBlockerSheet, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                EarnerUpsellBlockerViewModel earnerUpsellBlockerViewModel = (EarnerUpsellBlockerViewModel) obj6;
                Function1 function15 = (Function1) obj4;
                BlockersScreens.EarnerUpsellBlockerScreenArgs earnerUpsellBlockerScreenArgs = (BlockersScreens.EarnerUpsellBlockerScreenArgs) obj5;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    EarnerUpsellBlockerViewKt.EarnerUpsellBlocker(earnerUpsellBlockerViewModel, function15, earnerUpsellBlockerScreenArgs instanceof BlockersScreens.EarnerUpsellBlockerSheet, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((CashQrCameraXScannerView) obj6).Content((CardActivationQrViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                SsnViewKt.CardActivationQrScanner((CardActivationQrViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i10 = ConfirmCvvView.$r8$clinit;
                ((ConfirmCvvView) obj6).Content((ConfirmCvvViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                SsnViewKt.ConfirmCvv((ConfirmCvvViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i11 = FilesetUploadOptionsSheet.$r8$clinit;
                ((FilesetUploadOptionsSheet) obj6).Content((Unit) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i12 = GpsExplainerSheet.$r8$clinit;
                ((GpsExplainerSheet) obj6).Content((GpsExplainerViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                Icons icons2 = (Icons) obj6;
                GpsExplainerViewModel gpsExplainerViewModel = (GpsExplainerViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    Strings.getSizes(gapComposer7).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (icons2 == null) {
                        gapComposer7.startReplaceGroup(-437852815);
                        i = 0;
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-437852814);
                        TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", Strings.getColors(gapComposer7).semantic.background.brand, null, new AvatarImage.LocalIcon(icons2, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer7, 6, 28);
                        i = 0;
                        gapComposer7.end(false);
                    }
                    DBUtil.SpacerWithinSectionSmall(i, 1, gapComposer7, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer7).semantic.text.standard, (Composer) gapComposer7, (Modifier) null, Strings.getTypography(gapComposer7).header, (TextLineBalancing) null, gpsExplainerViewModel.title, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer7, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer7).semantic.text.subtle, (Composer) gapComposer7, (Modifier) null, Strings.getTypography(gapComposer7).bodyMedium, (TextLineBalancing) null, gpsExplainerViewModel.description, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    gapComposer7.startReplaceGroup(401542975);
                    ArrayList<GpsExplainerViewModel.DetailModel> arrayList = gpsExplainerViewModel.details;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (GpsExplainerViewModel.DetailModel detailModel : arrayList) {
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                        Strings.getSizes(gapComposer7).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, RecyclerView.DECELERATION_RATE, 16.0f, 1);
                        Strings.getSizes(gapComposer7).getClass();
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer7, i3);
                        int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m300paddingVpY3zN4$default2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer7.startReusableNode();
                        if (gapComposer7.inserting) {
                            gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer7.useNode();
                        }
                        Updater.m576setimpl(gapComposer7, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        String str = detailModel.icon.arcade_id;
                        if (str != null) {
                            Icons.Companion.getClass();
                            icons = zzd.get(str);
                        } else {
                            icons = null;
                        }
                        if (icons == null) {
                            gapComposer7.startReplaceGroup(-1389975673);
                            gapComposer7.end(false);
                        } else {
                            gapComposer7.startReplaceGroup(-1389975672);
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, Strings.getColors(gapComposer7).semantic.icon.standard, gapComposer7, 48, 4);
                            gapComposer7.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer7).semantic.text.standard, (Composer) gapComposer7, (Modifier) null, Strings.getTypography(gapComposer7).labelMedium, (TextLineBalancing) null, detailModel.title, (Map) null, (Function1) null, false);
                        gapComposer7.end(true);
                        arrayList2.add(Unit.INSTANCE);
                        i3 = 48;
                    }
                    gapComposer7.end(false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    String str2 = gpsExplainerViewModel.footerMarkdown;
                    MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer7).semantic.text.link, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434), 2);
                    TextStyle textStyle = Strings.getTypography(gapComposer7).bodyXSmall;
                    long j = Strings.getColors(gapComposer7).semantic.text.subtle;
                    boolean changed = gapComposer7.changed(function16);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(1, function16);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.m304MarkdownTextpCuZGqc(str2, (Function2) rememberedValue, fillMaxWidth3, textStyle, j, markdownSpanValues, null, null, 0, 0, 3, gapComposer7, MLKEMEngine.KyberPolyBytes, 960);
                    Strings.getSizes(gapComposer7).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion2, 32.0f));
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    boolean changed2 = gapComposer7.changed(function16);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashtagViewKt$$ExternalSyntheticLambda6(22, function16);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1601834568, new SsnViewKt$$ExternalSyntheticLambda2(gpsExplainerViewModel, 18), gapComposer7), gapComposer7, 1573296, 56);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                int i13 = GpsLocationConsentBlockerView.$r8$clinit;
                ((GpsLocationConsentBlockerView) obj6).Content((GpsLocationConsentBlockerViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                GpsLocationConsentBlockerViewModel.Loaded loaded = (GpsLocationConsentBlockerViewModel.Loaded) obj6;
                final Function1 function17 = (Function1) obj4;
                Icons icons3 = (Icons) obj5;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                boolean shouldExecute2 = gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2);
                Applier applier2 = gapComposer8.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer8, 48);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer8, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer8, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion2, ImageKt.rememberScrollState(gapComposer8), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode4 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer8, verticalScroll$default);
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer8, composeUiNode$Companion$SetModifier$13, gapComposer8, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer8, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed3 = gapComposer8.changed(function17);
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    Object obj7 = rememberedValue3;
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        CashtagViewKt$$ExternalSyntheticLambda6 cashtagViewKt$$ExternalSyntheticLambda6 = new CashtagViewKt$$ExternalSyntheticLambda6(23, function17);
                        gapComposer8.updateRememberedValue(cashtagViewKt$$ExternalSyntheticLambda6);
                        obj7 = cashtagViewKt$$ExternalSyntheticLambda6;
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj7, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer8, null);
                    Countries.PageHeader(loaded.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-349892941, new InfoSectionKt$$ExternalSyntheticLambda6(icons3, 10), gapComposer8), loaded.description, gapComposer8, MLKEMEngine.KyberPolyBytes, 2);
                    gapComposer8.end(true);
                    SpacerKt.Spacer(gapComposer8, new LayoutWeightElement(1.0f, true));
                    final GpsLocationConsentBlockerViewModel.Loaded.Button button = loaded.subtleButton;
                    if (button == null) {
                        gapComposer8.startReplaceGroup(430581798);
                        gapComposer8.end(false);
                        z = false;
                        companion = companion2;
                    } else {
                        gapComposer8.startReplaceGroup(430581799);
                        ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                        companion = companion2;
                        Modifier fillMaxWidth5 = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth5, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        boolean changed4 = gapComposer8.changed(function17) | gapComposer8.changedInstance(button);
                        Object rememberedValue4 = gapComposer8.rememberedValue();
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            z = false;
                            final boolean z2 = false ? 1 : 0;
                            Function0 function0 = new Function0() { // from class: com.squareup.cash.blockers.views.GpsLocationConsentBlockerViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (z2) {
                                        case 0:
                                            function17.invoke(button.event);
                                            break;
                                        default:
                                            function17.invoke(button.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer8.updateRememberedValue(function0);
                            obj3 = function0;
                        } else {
                            z = false;
                            obj3 = rememberedValue4;
                        }
                        final int i14 = z ? 1 : 0;
                        coil3.size.SizeKt.ButtonCta((Function0) obj3, m300paddingVpY3zN4$default3, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(440003126, new Function3() { // from class: com.squareup.cash.blockers.views.GpsLocationConsentBlockerViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                int i15 = i14;
                                GpsLocationConsentBlockerViewModel.Loaded.Button button2 = button;
                                switch (i15) {
                                    case 0:
                                        Composer composer9 = (Composer) obj9;
                                        int intValue9 = ((Integer) obj10).intValue();
                                        ((RowScope) obj8).getClass();
                                        GapComposer gapComposer9 = (GapComposer) composer9;
                                        if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer10 = (Composer) obj9;
                                        int intValue10 = ((Integer) obj10).intValue();
                                        ((RowScope) obj8).getClass();
                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer8), gapComposer8, 1573248, 56);
                        DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, 1, gapComposer8, null);
                        gapComposer8.end(z);
                    }
                    final GpsLocationConsentBlockerViewModel.Loaded.Button button2 = loaded.standardButton;
                    if (button2 == null) {
                        gapComposer8.startReplaceGroup(430903237);
                        gapComposer8.end(z);
                    } else {
                        gapComposer8.startReplaceGroup(430903238);
                        boolean changed5 = gapComposer8.changed(function17) | gapComposer8.changedInstance(button2);
                        Object rememberedValue5 = gapComposer8.rememberedValue();
                        Object obj8 = rememberedValue5;
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            final int i15 = 1;
                            Function0 function02 = new Function0() { // from class: com.squareup.cash.blockers.views.GpsLocationConsentBlockerViewKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            function17.invoke(button2.event);
                                            break;
                                        default:
                                            function17.invoke(button2.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer8.updateRememberedValue(function02);
                            obj8 = function02;
                        }
                        Function0 function03 = (Function0) obj8;
                        Modifier fillMaxWidth6 = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        final int i16 = 1;
                        coil3.size.SizeKt.ButtonCta(function03, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth6, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, false, false, null, Expect_jvmKt.rememberComposableLambda(1631383327, new Function3() { // from class: com.squareup.cash.blockers.views.GpsLocationConsentBlockerViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj82, Object obj9, Object obj10) {
                                int i152 = i16;
                                GpsLocationConsentBlockerViewModel.Loaded.Button button22 = button2;
                                switch (i152) {
                                    case 0:
                                        Composer composer9 = (Composer) obj9;
                                        int intValue9 = ((Integer) obj10).intValue();
                                        ((RowScope) obj82).getClass();
                                        GapComposer gapComposer9 = (GapComposer) composer9;
                                        if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer10 = (Composer) obj9;
                                        int intValue10 = ((Integer) obj10).intValue();
                                        ((RowScope) obj82).getClass();
                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button22.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer8), gapComposer8, 1572864, 60);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer8, null);
                        gapComposer8.end(false);
                    }
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth7 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default4 = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth7, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed6 = gapComposer8.changed(function17) | gapComposer8.changedInstance(loaded);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    Object obj9 = rememberedValue6;
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        BulletinTileKt$$ExternalSyntheticLambda12 bulletinTileKt$$ExternalSyntheticLambda12 = new BulletinTileKt$$ExternalSyntheticLambda12(14, function17, loaded);
                        gapComposer8.updateRememberedValue(bulletinTileKt$$ExternalSyntheticLambda12);
                        obj9 = bulletinTileKt$$ExternalSyntheticLambda12;
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) obj9, m300paddingVpY3zN4$default4, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(740694863, new SsnViewKt$$ExternalSyntheticLambda2(loaded, 19), gapComposer8), gapComposer8, 1573248, 56);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer8, null);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int i17 = HelpOptionsSheet.$r8$clinit;
                ((HelpOptionsSheet) obj6).Content((HelpOptionsViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                SsnViewKt.HelpOptions((HelpOptionsViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                int i18 = InputCardInfoView.$r8$clinit;
                ((InputCardInfoView) obj6).Content((InputCardInfoViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                InputCardInfoViewModel inputCardInfoViewModel = (InputCardInfoViewModel) obj6;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj5;
                Function1 function18 = (Function1) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(1 & intValue9, (intValue9 & 3) != 2)) {
                    CardState rememberCardState = SsnViewKt.rememberCardState(gapComposer9);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    boolean z3 = inputCardInfoViewModel instanceof InputCardInfoViewModel.Loading;
                    Strings.LoadableFullScreenContent(inputCardInfoViewModel, z3, imePadding, null, z3 ? ((InputCardInfoViewModel.Loading) inputCardInfoViewModel).loadingMessage : null, Expect_jvmKt.rememberComposableLambda(-386843868, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(rememberCardState, focusOwnerImpl, function18, i4), gapComposer9), gapComposer9, 196608, 8);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                int i19 = OnboardingInternalRouteView.$r8$clinit;
                ((OnboardingInternalRouteView) obj6).Content((OnboardingInternalRouteViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                int i20 = SelectionView.$r8$clinit;
                ((SelectionView) obj6).Content((SelectionViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                SelectionViewKt.SelectionBlockerUi((SelectionViewModel) obj6, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ((P2PListView) obj6).Content((StatusResultViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BirthdayView$$ExternalSyntheticLambda0(ComposeUiView composeUiView, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = composeUiView;
        this.f$1 = obj;
        this.f$2 = function1;
    }

    public /* synthetic */ BirthdayView$$ExternalSyntheticLambda0(Object obj, Object obj2, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = function1;
    }

    public /* synthetic */ BirthdayView$$ExternalSyntheticLambda0(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ BirthdayView$$ExternalSyntheticLambda0(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = modifier;
    }
}
