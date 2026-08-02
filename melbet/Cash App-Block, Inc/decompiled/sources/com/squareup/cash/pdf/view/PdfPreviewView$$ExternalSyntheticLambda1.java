package com.squareup.cash.pdf.view;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
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
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.MainPaymentViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentEntrypointButtonViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.views.MainPaymentViewKt;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.composer.SelectRecipientKt;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.persona.views.PersonaDidvView;
import com.squareup.cash.phoneplans.PhonePlansHomeViewKt;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdfPreviewView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus, Function0 function0, Function0 function02) {
        this.$r8$classId = 8;
        this.f$0 = loadingStatus;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifier;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = PdfPreviewView.$r8$clinit;
                ((PdfPreviewView) obj5).Content((PdfPreviewViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj5;
                Function1 function1 = (Function1) obj4;
                MainPaymentViewModel mainPaymentViewModel = (MainPaymentViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 14);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    PersonalizePaymentEntrypointButtonViewModel personalizePaymentEntrypointButtonViewModel = mainPaymentViewModel.personalizePaymentButtonState;
                    AlphaKt.PersonalizePaymentButton(null, (Function0) rememberedValue, personalizePaymentEntrypointButtonViewModel.enabled, personalizePaymentEntrypointButtonViewModel.animate, personalizePaymentEntrypointButtonViewModel.animation, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                MainPaymentViewKt.MainPayment((MainPaymentViewModel) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                QuickPayViewKt.QuickPayDetailsSheet((Function1) obj4, (QuickPayDetailsViewModel) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (quickPayViewModel instanceof QuickPayViewModel.Ready) {
                    gapComposer2.startReplaceGroup(2062931416);
                    QuickPayViewKt.QuickPay((QuickPayViewModel.Ready) quickPayViewModel, function12, realImageLoader, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(2062980427);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                QuickPayViewKt.QuickPay((QuickPayViewModel.Ready) obj5, (Function1) obj4, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                QuickPayViewKt.WeekDates((Function1) obj4, (ImmutableList) obj5, (ScheduleCalendarDate) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Modifier modifier2 = (Modifier) obj5;
                SelectedTrack selectedTrack = (SelectedTrack) obj3;
                MutableState mutableState = (MutableState) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer3.applier;
                if (shouldExecute) {
                    Modifier clip = ClipKt.clip(modifier2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, clip);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    String urlForTheme = ThemablesKt.urlForTheme(selectedTrack.albumArt, gapComposer3);
                    Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(BlurKt.m586blurF8QBwvs(BoxScopeInstance.INSTANCE.matchParentSize(), 25.0f, ColorKt.RectangleShape), 0.8f);
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Crop;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, alpha, null, contentScale$Companion$Fit$1, null, gapComposer3, 1572912, 1976);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MainPaymentViewKt$$ExternalSyntheticLambda25(16);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, true, (Function1) rememberedValue2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer3, 54);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, semantics);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(selectedTrack.albumArt, gapComposer3), null, ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 48.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), null, contentScale$Companion$Fit$1, null, gapComposer3, 1572912, 1976);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                    if (((AndroidImageBitmap) mutableState.getValue()) != null) {
                        gapComposer3.startReplaceGroup(-1408082484);
                        AndroidImageBitmap androidImageBitmap = (AndroidImageBitmap) mutableState.getValue();
                        androidImageBitmap.getClass();
                        modifier = QuickPayViewKt.movingImageBackground(companion, androidImageBitmap, gapComposer3);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1407995343);
                        gapComposer3.end(false);
                        modifier = companion;
                    }
                    Modifier then = layoutWeightElement.then(modifier);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(2.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer3, 6);
                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, then);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String str = selectedTrack.title;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3994, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3994, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, selectedTrack.artist, (Map) null, (Function1) null, false);
                    gapComposer3.end(true);
                    Icons icons = Icons.NavigationVolumeOn;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), colors.component.cell.controls.icon.f174default, gapComposer3, 438, 0);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus = (PaymentConfigurationViewModel.Loading.LoadingStatus) obj5;
                Function0 function0 = (Function0) obj3;
                Function0 function02 = (Function0) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer4, 6);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    if (loadingStatus == null) {
                        gapComposer4.startReplaceGroup(1434246743);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer4, null);
                        ProgressCircularKt.ProgressCircular(6, 0, gapComposer4, SizeKt.fillMaxWidth(companion, 1.0f));
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer4, null);
                        gapComposer4.end(false);
                    } else if (loadingStatus instanceof PaymentConfigurationViewModel.Loading.LoadingStatus.Errored) {
                        gapComposer4.startReplaceGroup(-923559817);
                        ErrorKt.Error(function0, null, gapComposer4, 0, 2);
                        gapComposer4.end(false);
                    } else {
                        if (!(loadingStatus instanceof PaymentConfigurationViewModel.Loading.LoadingStatus.OpenedOwnLink)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, -923566147, false);
                        }
                        gapComposer4.startReplaceGroup(-923557723);
                        ErrorKt.OwnLinkMessage(function02, null, gapComposer4, 0, 2);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ErrorKt.PaymentConfigurationTitle((PaymentConfigurationTitleViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ErrorKt.InstrumentSelectionInformation((InstrumentSelectionRowViewModel) obj5, (Function0) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ErrorKt.NavigationIcon((NavigationType) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 12:
                Subject subject = (Subject) obj5;
                String str2 = (String) obj3;
                Function0 function03 = (Function0) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), AnimatableKt.tween$default(100, 0, null, 6), 2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, animateContentSize$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    gapComposer5.startReplaceGroup(1241641981);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    builder.append(str2);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    int pushStyle = builder.pushStyle(new SpanStyle(colors2.semantic.text.subtle, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                    try {
                        builder.append(" to");
                        builder.pop(pushStyle);
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        gapComposer5.end(false);
                        ErrorKt.optionalClickable(gapComposer5);
                        Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer5, (Modifier) companion2, annotatedString, (TextStyle) null, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer5, null);
                        EnterTransitionImpl fadeIn = EnterExitTransitionKt.fadeIn(0.05f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6));
                        ExitTransitionImpl exitTransitionImpl = ExitTransitionImpl.None;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2089415896, new ProfileKt$$ExternalSyntheticLambda1(10, subject, function03), gapComposer5);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        AnimatedContentKt.AnimatedVisibility(columnScopeInstance, true, null, fadeIn, exitTransitionImpl, null, rememberComposableLambda, gapComposer5, 1575942, 18);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer5, null);
                        AnimatedContentKt.AnimatedVisibility(columnScopeInstance, false, null, EnterExitTransitionKt.fadeIn(0.05f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6)), exitTransitionImpl, null, Expect_jvmKt.rememberComposableLambda(-921759393, new PoolsAppletTileKt$$ExternalSyntheticLambda3(8), gapComposer5), gapComposer5, 1575942, 18);
                        gapComposer5.end(true);
                    } catch (Throwable th) {
                        builder.pop(pushStyle);
                        throw th;
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                TextFieldState textFieldState = (TextFieldState) obj5;
                FocusRequester focusRequester = (FocusRequester) obj3;
                Function1 function13 = (Function1) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed2 = gapComposer6.changed(textFieldState);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SearchBarKt$$ExternalSyntheticLambda1(17, textFieldState);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    SelectRecipientKt.SearchTextField(textFieldState, focusRequester, function13, (Function0) rememberedValue3, null, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayRequestHelpContent((NearbyPayRequestHelpViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPeopleOverflowSheetContent((NearbyPeopleOverflowSheetViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPermissionsPromptSheetContent((NearbyPermissionsPromptSheetViewModel.Ready) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                AlphaKt.CustomContent((Modifier) obj5, (Function1) obj4, (PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                AlphaKt.UiElement((Modifier) obj5, (Element) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                AlphaKt.UiElement((Element) obj5, (Set) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                AlphaKt.TransparentButton((Function0) obj5, (Modifier) obj3, (Shape) obj4, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                AlphaKt.TransformedContent((Modifier) obj5, (Element) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                PdfPreviewViewKt.PdfPreview((PdfPreviewViewModel) obj3, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                int i3 = PersonaDidvView.$r8$clinit;
                ((PersonaDidvView) obj5).Content((Unit) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.InfoCard((PhonePlansHomeViewModel.Content.InfoCard) obj5, (Function0) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                KycAppletTile kycAppletTile = (KycAppletTile) obj5;
                AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj3;
                State state = (State) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    PoolsAppletTileKt.PoolsApplet((TaxesAppletViewsModule$$ExternalSyntheticLambda1) kycAppletTile.onClick, (PoolsAppletTileModel) state.getValue(), appletTileAppearance, null, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                PoolsAppletTileKt.InstalledPoolsUI((PoolsAppletTileModel.Installed) obj5, (AppletTile.AppletTileAppearance) obj3, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeAmountAtm((PoolContributeWithNoteViewModel.AmountAtmPicker) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeAmountCustom((PoolContributeWithNoteViewModel.AmountCustomPicker) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeNote((PoolContributeWithNoteViewModel.InputNote) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(Subject subject, String str, Function0 function0) {
        this.$r8$classId = 12;
        this.f$0 = subject;
        this.f$1 = str;
        this.f$2 = function0;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(PdfPreviewViewModel pdfPreviewViewModel, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 22;
        this.f$1 = pdfPreviewViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ PdfPreviewView$$ExternalSyntheticLambda1(Function1 function1, Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = function1;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
