package com.squareup.cash.dialog;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmExplainerViewModel;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositSingleInputViewModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.earningstracker.applets.views.graph.GraphConfigKt;
import com.squareup.cash.earningstracker.views.components.BarChartConfigKt;
import com.squareup.cash.earningstracker.views.components.BarChartKt;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.family.familyhub.viewmodels.BadgeName;
import com.squareup.cash.family.familyhub.viewmodels.ControlErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentGraduationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMemberRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SetDependentCustomLimitErrorViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.familyhub.viewmodels.U13CelebrationViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import com.squareup.cash.family.safetyhub.views.MultiColorPageTitleKt;
import com.squareup.cash.family.safetyhub.views.SafetyHubSubsectionKt;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.formview.components.ArcadeFormButtonView;
import com.squareup.cash.formview.components.ArcadeFormViewTitleBar;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.aegis.core.ContentSection;
import com.squareup.protos.cash.aegis.core.DropDownElement;
import com.squareup.protos.cash.aegis.core.DropDownSection;
import com.squareup.protos.cash.aegis.core.SafetyEducationPage;
import com.squareup.protos.cash.aegis.core.Subsection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.Strings;
import com.squareup.util.cash.StringsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ArcadeModal$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    private final Object invoke$com$squareup$cash$family$safetyhub$views$SafetyEducationPageViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        ?? r4;
        Modifier modifier;
        SafetyEducationPageViewModel safetyEducationPageViewModel = (SafetyEducationPageViewModel) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ScrollingScaffoldContentScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            SafetyEducationPage safetyEducationPage = safetyEducationPageViewModel.page;
            MultiColorPageTitleKt.MultiColorPageTitle(0, gapComposer, safetyEducationPage.colored_title);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ContentSection contentSection = safetyEducationPage.content_section;
            if (contentSection == null) {
                gapComposer.startReplaceGroup(-2058631890);
                gapComposer.end(false);
                modifier = null;
            } else {
                gapComposer.startReplaceGroup(-2058631889);
                LocalizedString localizedString = contentSection.title;
                if (localizedString == null) {
                    gapComposer.startReplaceGroup(-1928570786);
                    gapComposer.end(false);
                    r4 = 0;
                } else {
                    gapComposer.startReplaceGroup(-1928570785);
                    r4 = 0;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, StringsKt.translated(localizedString), (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                }
                gapComposer.startReplaceGroup(-759139181);
                int i = 0;
                for (Object obj4 : contentSection.paragraphs) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r4;
                    }
                    LocalizedString localizedString2 = (LocalizedString) obj4;
                    if (i > 0) {
                        gapComposer.startReplaceGroup(54307027);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, r4);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(54356999);
                        gapComposer.end(false);
                    }
                    GapComposer gapComposer2 = gapComposer;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, StringsKt.translated(localizedString2), (Map) null, (Function1) null, false);
                    gapComposer = gapComposer2;
                    i = i2;
                }
                gapComposer.end(false);
                Image image = contentSection.image;
                if (image == null) {
                    gapComposer.startReplaceGroup(-1928176869);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1928176868);
                    DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, r4);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.prominent, ColorKt.RectangleShape), 210.0f), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(image, gapComposer), null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, null, gapComposer, 1573296, 1976);
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, r4);
                gapComposer.startReplaceGroup(-759109305);
                int i3 = 0;
                for (Object obj6 : contentSection.subsections) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r4;
                    }
                    Subsection subsection = (Subsection) obj6;
                    if (i3 > 0) {
                        gapComposer.startReplaceGroup(1815560963);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, r4);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1815612857);
                        gapComposer.end(false);
                    }
                    SafetyHubSubsectionKt.SafetyHubSubsection(subsection, gapComposer, 0);
                    i3 = i4;
                }
                gapComposer.end(false);
                gapComposer.end(false);
                modifier = r4;
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier);
            ModalKt.HorizontalDivider(0, 1, gapComposer, modifier);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier);
            DropDownSection dropDownSection = safetyEducationPage.drop_down_section;
            if (dropDownSection == null) {
                gapComposer.startReplaceGroup(-2057226536);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2057226535);
                LocalizedString localizedString3 = dropDownSection.title;
                if (localizedString3 == null) {
                    gapComposer.startReplaceGroup(1985747463);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1985747464);
                    GapComposer gapComposer3 = gapComposer;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, StringsKt.translated(localizedString3), (Map) null, (Function1) null, false);
                    gapComposer = gapComposer3;
                    gapComposer.end(false);
                }
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, modifier);
                gapComposer.startReplaceGroup(-759091778);
                for (DropDownElement dropDownElement : dropDownSection.elements) {
                    LocalizedString localizedString4 = dropDownElement.title;
                    localizedString4.getClass();
                    GapComposer gapComposer4 = gapComposer;
                    VisibleKt.m3487DrawerViewWe2iE6E(null, StringsKt.translated(localizedString4), null, 0L, Expect_jvmKt.rememberComposableLambda(1865643628, new ArcadeModal$$ExternalSyntheticLambda3(dropDownElement, 23), gapComposer), 0L, RecyclerView.DECELERATION_RATE, gapComposer4, 24576);
                    gapComposer = gapComposer4;
                }
                gapComposer.end(false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda79(Object obj, Object obj2, Object obj3) {
        FidesmoProvisioningViewModel.Success.Provisioned provisioned = (FidesmoProvisioningViewModel.Success.Provisioned) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, provisioned.doneButtonText, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$ArcadeFormButtonView$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        ArcadeFormButtonView arcadeFormButtonView = (ArcadeFormButtonView) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            BlockerAction blockerAction = arcadeFormButtonView.element.action;
            blockerAction.getClass();
            String str = blockerAction.text;
            str.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$formview$components$ArcadeFormViewTitleBar$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        ArcadeFormViewTitleBar arcadeFormViewTitleBar = (ArcadeFormViewTitleBar) this.f$0;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        int i2 = intValue;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = (String) arcadeFormViewTitleBar.accessoryText$delegate.getValue();
            if (str == null) {
                gapComposer.startReplaceGroup(1916279722);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1916279723);
                TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(-51937537, new ArcadeModal2Kt$$ExternalSyntheticLambda0(25, str, arcadeFormViewTitleBar), gapComposer), gapComposer, (i2 & 14) | 3072, 3);
                gapComposer.end(false);
            }
            if (((Boolean) arcadeFormViewTitleBar.showHelpButton$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1916564179);
                int i3 = (i2 & 14) | 48;
                i = i2;
                z = false;
                TransactorKt.IconAction(titleBarActionScope, Icons.NavigationHelp, Room.stringResource(gapComposer, R.string.blockers_help), arcadeFormViewTitleBar.onHelpClick, null, null, null, null, null, null, false, gapComposer, i3, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(false);
            } else {
                i = i2;
                z = false;
                gapComposer.startReplaceGroup(1916743886);
                gapComposer.end(false);
            }
            if (((Boolean) arcadeFormViewTitleBar.showCloseButton$delegate.getValue()).booleanValue() && ((Boolean) arcadeFormViewTitleBar.showRetreatButton$delegate.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1916800399);
                TransactorKt.IconAction(titleBarActionScope, Icons.NavigationClose, Room.stringResource(gapComposer, R.string.blockers_cancel), arcadeFormViewTitleBar.onCloseClick, null, null, null, null, null, null, false, gapComposer, (i & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1916983950);
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        String stringResource;
        BadgeName badgeName;
        String str;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ArcadeModal arcadeModal = (ArcadeModal) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean changed = gapComposer.changed(arcadeModal);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ArcadeModal$$ExternalSyntheticLambda4(arcadeModal, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, gapComposer, 0, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                BitcoinP2pConversionPercentageViewModel.Content content = (BitcoinP2pConversionPercentageViewModel.Content) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer2, 54);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 482, Strings.getColors(gapComposer2).semantic.text.standard, 0L, gapComposer2, null, Strings.getTypography(gapComposer2).numeralLarge, content.percentageDisplayText, null);
                    zzacn.m2012AutoScaleTextZLomxE(1, 0, 0, 24576, 482, Strings.getColors(gapComposer2).semantic.text.subtle, 0L, gapComposer2, null, Strings.getTypography(gapComposer2).bodyMedium, content.percentageSubtitleText, null);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LocationDeniedScreen locationDeniedScreen = (LocationDeniedScreen) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, locationDeniedScreen.updatePermissionsText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                AtmExplainerViewModel atmExplainerViewModel = (AtmExplainerViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, atmExplainerViewModel.helpButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel = (PaperMoneyDepositOnboardingViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, paperMoneyDepositOnboardingViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                DirectDepositSingleInputViewModel directDepositSingleInputViewModel = (DirectDepositSingleInputViewModel) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, directDepositSingleInputViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj).getClass();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl.maxLineSpan / ((Ref$IntRef) obj4).element));
            case 7:
                EarningsHomeViewModel.EarningsActivity earningsActivity = (EarningsHomeViewModel.EarningsActivity) obj4;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    String str2 = earningsActivity.title;
                    boolean changedInstance = gapComposer7.changedInstance(earningsActivity);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ArcadeModal$$ExternalSyntheticLambda2(earningsActivity, 13);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    embeddedHeaderScope.DefaultHeaderWithoutSpace((intValue7 << 9) & 7168, 2, gapComposer7, str2, null, (Function0) rememberedValue2);
                    gapComposer7.startReplaceGroup(-911826972);
                    gapComposer7.end(false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                EarningsHomeViewModel.Loaded.Button button = (EarningsHomeViewModel.Loaded.Button) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                EarningsHomeViewModel.EarnerModeSheet earnerModeSheet = (EarningsHomeViewModel.EarnerModeSheet) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, earnerModeSheet.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                EarningsAppletTileModel.Installed installed = (EarningsAppletTileModel.Installed) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    GraphConfigKt.AxisFreeGraph(((EarningsAppletTileModel.Installed.Chart) installed).chartBars, SizeKt.fillMaxWidth(companion, 1.0f), null, gapComposer10, 48);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                DateFilter dateFilter = (DateFilter) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    if (dateFilter instanceof DateFilter.Monthly) {
                        IntRange intRange = new IntRange(1, 31, 1);
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                        IntProgressionIterator it = intRange.iterator();
                        while (it.hasNext) {
                            int nextInt = it.nextInt();
                            arrayList.add(new EarningsBarViewModel(String.valueOf(nextInt), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 7, 14, 21, 28}).contains(Integer.valueOf(nextInt)), 0L, EarningsBarViewModel.Color.FUTURE));
                        }
                    } else if (dateFilter instanceof DateFilter.Yearly) {
                        IntRange intRange2 = new IntRange(1, 12, 1);
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10));
                        IntProgressionIterator it2 = intRange2.iterator();
                        while (it2.hasNext) {
                            arrayList3.add(new EarningsBarViewModel("", CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 4, 7, 10}).contains(Integer.valueOf(it2.nextInt())), 0L, EarningsBarViewModel.Color.FUTURE));
                        }
                        arrayList2 = arrayList3;
                        BarChartKt.BarChart(arrayList2, Room.stringResource(gapComposer11, R.string.earnings_bar_shimmer_content_description), null, EarningsBarChartConfig.m3457copyY9O4PVA$default(BarChartConfigKt.DEFAULT_BAR_CHART_CONFIG, null, null, true, false, 63), null, null, gapComposer11, 0, 52);
                    } else {
                        if (!(dateFilter instanceof DateFilter.AllTime)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        IntRange intRange3 = new IntRange(1, 3, 1);
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange3, 10));
                        IntProgressionIterator it3 = intRange3.iterator();
                        while (it3.hasNext) {
                            it3.nextInt();
                            arrayList.add(new EarningsBarViewModel("", true, 0L, EarningsBarViewModel.Color.FUTURE));
                        }
                    }
                    arrayList2 = arrayList;
                    BarChartKt.BarChart(arrayList2, Room.stringResource(gapComposer11, R.string.earnings_bar_shimmer_content_description), null, EarningsBarChartConfig.m3457copyY9O4PVA$default(BarChartConfigKt.DEFAULT_BAR_CHART_CONFIG, null, null, true, false, 63), null, null, gapComposer11, 0, 52);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                EducationStoryViewModel.Error error = (EducationStoryViewModel.Error) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, error.refreshLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ControlErrorViewModel controlErrorViewModel = (ControlErrorViewModel) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(1 & intValue13, (intValue13 & 17) != 16)) {
                    String str3 = controlErrorViewModel.buttonText;
                    TextStyle textStyle = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                    Colors colors = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.button.destructive.standard.text.f156default, (Composer) gapComposer13, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(1 & intValue14, (intValue14 & 17) != 16)) {
                    String str4 = (dependentDetailViewModel == null || (badgeName = dependentDetailViewModel.badgeName) == null) ? null : badgeName.firstName;
                    if (str4 == null) {
                        gapComposer14.startReplaceGroup(-338004994);
                        z = false;
                        gapComposer14.end(false);
                        stringResource = null;
                    } else {
                        z = false;
                        gapComposer14.startReplaceGroup(-338004993);
                        stringResource = Room.stringResource(R.string.dependent_detail_cash_balance_header_send_cta, new Object[]{str4}, gapComposer14);
                        gapComposer14.end(false);
                    }
                    if (stringResource == null) {
                        stringResource = re$$ExternalSyntheticOutline0.m(gapComposer14, 2067310453, R.string.profile_family_account_detail_screen_send_money, gapComposer14, z);
                    } else {
                        gapComposer14.startReplaceGroup(2067305772);
                        gapComposer14.end(z);
                    }
                    String str5 = stringResource;
                    TextStyle textStyle2 = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors2 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, z);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(z);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors2.component.button.prominent.text.f162default, (Composer) gapComposer14, (Modifier) null, textStyle2, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                FamilyMemberRowViewModel familyMemberRowViewModel = (FamilyMemberRowViewModel) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                boolean shouldExecute = gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16);
                Applier applier = gapComposer15.applier;
                if (shouldExecute) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer15.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 8.0f);
                    ((DefaultSizes) gapComposer15.consume(staticProvidableCompositionLocal)).getClass();
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer15, 0);
                    int hashCode3 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer15, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer15.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer15, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer15, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer15, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer15, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(familyMemberRowViewModel.avatar, null, null, gapComposer15, 8, 3), null, false, gapComposer15, 6, 28);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Bottom, gapComposer15, 48);
                    int hashCode4 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer15, fillMaxWidth2);
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer15, composeUiNode$Companion$SetModifier$13, gapComposer15, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer15, materializeModifier4, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    ((DefaultSizes) gapComposer15.consume(staticProvidableCompositionLocal)).getClass();
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer15, 0);
                    int hashCode5 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer15, m);
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer15, composeUiNode$Companion$SetModifier$13, gapComposer15, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer15, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    AllowanceViewKt.FamilyMemberAccountType(familyMemberRowViewModel.sponsorshipTierText, gapComposer15, 0);
                    AllowanceViewKt.FamilyMemberFullName(familyMemberRowViewModel.fullName, gapComposer15, 0);
                    gapComposer15.end(true);
                    ((DefaultSizes) gapComposer15.consume(staticProvidableCompositionLocal)).getClass();
                    SpacerKt.Spacer(gapComposer15, SizeKt.m290width3ABfNKs(companion, 16.0f));
                    AllowanceViewKt.FamilyMemberBalance(familyMemberRowViewModel.balanceText, gapComposer15, 0);
                    gapComposer15.end(true);
                    gapComposer15.end(true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                SetDependentCustomLimitErrorViewModel setDependentCustomLimitErrorViewModel = (SetDependentCustomLimitErrorViewModel) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, setDependentCustomLimitErrorViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                DependentGraduationViewModel dependentGraduationViewModel = (DependentGraduationViewModel) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentGraduationViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                SponsorDetailViewModel sponsorDetailViewModel = (SponsorDetailViewModel) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    if (sponsorDetailViewModel == null || (str = sponsorDetailViewModel.inviteFriendsButtonText) == null) {
                        str = "";
                    }
                    String str6 = str;
                    TextStyle textStyle3 = ((Typography) gapComposer18.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors3 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                    } else {
                        gapComposer18.startReplaceGroup(-1762997739);
                        gapComposer18.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors3.component.button.subtle.text.f168default, (Composer) gapComposer18, (Modifier) null, textStyle3, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                SponsorLedInviteViewModel.Loaded loaded = (SponsorLedInviteViewModel.Loaded) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    String str7 = loaded.buttonText;
                    TextStyle textStyle4 = ((Typography) gapComposer19.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors4 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.component.button.subtle.text.f168default, (Composer) gapComposer19, (Modifier) null, textStyle4, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                U13CelebrationViewModel u13CelebrationViewModel = (U13CelebrationViewModel) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, u13CelebrationViewModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                SelectSponsorViewModel.SelectSponsor selectSponsor = (SelectSponsorViewModel.SelectSponsor) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectSponsor.sendInviteButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$family$safetyhub$views$SafetyEducationPageViewKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            case 23:
                DropDownElement dropDownElement = (DropDownElement) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer22, 0);
                    int hashCode6 = Long.hashCode(gapComposer22.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer22.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer22, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer22.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer22.startReusableNode();
                    if (gapComposer22.inserting) {
                        gapComposer22.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer22.useNode();
                    }
                    Updater.m576setimpl(gapComposer22, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer22, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer22, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer22, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer22, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    gapComposer22.startReplaceGroup(-1771211437);
                    int i2 = 0;
                    for (Object obj5 : dropDownElement.paragraphs) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        LocalizedString localizedString = (LocalizedString) obj5;
                        if (i2 > 0) {
                            gapComposer22.startReplaceGroup(710643459);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer22, null);
                            gapComposer22.end(false);
                        } else {
                            gapComposer22.startReplaceGroup(710708807);
                            gapComposer22.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer22, (Modifier) null, ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, StringsKt.translated(localizedString), (Map) null, (Function1) null, false);
                        i2 = i3;
                    }
                    gapComposer22.end(false);
                    gapComposer22.end(true);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                FidesmoProvisioningViewModel.Success.Deprovisioned deprovisioned = (FidesmoProvisioningViewModel.Success.Deprovisioned) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deprovisioned.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                FidesmoProvisioningViewModel.Failed failed = (FidesmoProvisioningViewModel.Failed) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, failed.doneButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$fidesmo$views$FidesmoProvisioningViewKt$$ExternalSyntheticLambda79(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$formview$components$ArcadeFormButtonView$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$formview$components$ArcadeFormViewTitleBar$$ExternalSyntheticLambda5(obj, obj2, obj3);
            default:
                Alignment.Horizontal horizontal2 = (Alignment.Horizontal) obj4;
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(constraints.value);
                long j = constraints.value;
                int m1025getMaxWidthimpl = (int) (Constraints.m1025getMaxWidthimpl(j) * 1.0f);
                int i4 = mo833measureBRTryo0.width;
                int i5 = m1025getMaxWidthimpl < i4 ? i4 : m1025getMaxWidthimpl;
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), mo833measureBRTryo0.height, new DatePickerKt$$ExternalSyntheticLambda6(horizontal2, i5, constraints, measureScope, measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, i5, i5, 0, 0, 12)), 1));
        }
    }
}
