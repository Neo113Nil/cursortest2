package com.squareup.cash.family.familyhub.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import com.squareup.cash.family.fixtures.FamilyAvatarFixtures;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectContactMethodViewModel;
import com.squareup.cash.family.requestsponsorship.views.SponsorRowViewKt;
import com.squareup.cash.family.safetyhub.fixtures.SafetyEducationHubFixtures;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyHubViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FamilyHomeSectionsKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FamilyHomeSectionsKt$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AllowanceViewKt.LoadingFamilyHomeListItem((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Control24, (String) null, (Modifier) null, ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer, 54, 4);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.profile_family_account_detail_controls_and_limits_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.profile_family_account_detail_controls_and_limits_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Notifications24, (String) null, (Modifier) null, ((Color) gapComposer4.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer4, 54, 4);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Block24, (String) null, (Modifier) null, 0L, gapComposer5, 54, 12);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Unit unit = Unit.INSTANCE;
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    Strings.LoadableFullScreenContent(unit, true, ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, null, AllowanceViewKt.lambda$1159175003, gapComposer6, 196662, 24);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(FamilyAvatarFixtures.AVATAR_A, null, null, gapComposer7, 8, 3), null, false, gapComposer7, 6, 28);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ShimmeringDetails((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AllowanceViewKt.DependentDetailLoadingState((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AllowanceViewKt.AvatarLoadingView((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                AllowanceViewKt.Loading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                AllowanceViewKt.LoadingSubtitle((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                AllowanceViewKt.FamilyPendingRequestRowContentLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AllowanceViewKt.LoadingTitle((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                SponsorDetailViewKt.SponsorLedInviteContentLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ContactMethod.Type type2 = ContactMethod.Type.Sms;
                    SelectContactMethodViewEvent.Close close = SelectContactMethodViewEvent.Close.INSTANCE;
                    SelectContactMethodViewModel.Content content = new SelectContactMethodViewModel.Content("Slimeguy", CollectionsKt__CollectionsKt.listOf((Object[]) new ContactMethod[]{new ContactMethod(type2, "(555) 123-1234", "Home", close), new ContactMethod(ContactMethod.Type.Email, "slimeguy@squareup.com", "Work", close)}));
                    Object rememberedValue = gapComposer8.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new FamilyActivityFixtures$$ExternalSyntheticLambda0(13);
                        gapComposer8.updateRememberedValue(rememberedValue);
                    }
                    SponsorRowViewKt.SelectContactMethodContent(content, (Function1) rememberedValue, gapComposer8, 48);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.standard, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer9, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer9.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer9, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer9, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    SafetyHubViewModel.Loaded loaded = new SafetyHubViewModel.Loaded(SafetyEducationHubFixtures.SAFETY_EDUCATION_HUB);
                    Object rememberedValue2 = gapComposer9.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(15);
                        gapComposer9.updateRememberedValue(rememberedValue2);
                    }
                    SafetyHubViewKt.SafetyHubView(loaded, (Function1) rememberedValue2, gapComposer9, 48);
                    gapComposer9.end(true);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size48;
                    String stringResource = Room.stringResource(gapComposer10, R.string.empty_favorites_message);
                    Colors colors3 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry(stringResource, colors3.base.brandGreenS1, null, new AvatarImage.LocalIcon(Icons.FavoriteFill32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer10, 6, 28);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Modifier height = OffsetKt.height(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer11, 0);
                    int hashCode2 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer11, height);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Success.Provisioned provisioned = new FidesmoProvisioningViewModel.Success.Provisioned("Your new Charm is set up exactly like your Cash App Card.", FidesmoProvisioningViewKt.successBookletGridPreview, new FidesmoProvisioningViewModel.Success.Provisioned.Tile(new Image("fake:///bufo-art.png", "fake:///bufo-art.png", 4), "The new shape of money", "[Learn more →](https://cash.app/charm)"), 224);
                    Object rememberedValue3 = gapComposer11.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(19);
                        gapComposer11.updateRememberedValue(rememberedValue3);
                    }
                    FidesmoProvisioningViewKt.ProvisionSuccess(provisioned, (Function1) rememberedValue3, false, gapComposer11, 48);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors5 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    Modifier height2 = OffsetKt.height(ImageKt.m177backgroundbw27NRU(fillMaxSize3, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer12, 0);
                    int hashCode3 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer12, height2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Success.Provisioned provisioned2 = new FidesmoProvisioningViewModel.Success.Provisioned("Your new tag is set up exactly like your Cash App Card.", FidesmoProvisioningViewKt.successBookletGridPreview, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
                    Object rememberedValue4 = gapComposer12.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(24);
                        gapComposer12.updateRememberedValue(rememberedValue4);
                    }
                    FidesmoProvisioningViewKt.ProvisionSuccess(provisioned2, (Function1) rememberedValue4, false, gapComposer12, 48);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    Colors colors6 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors6.semantic.background.danger, null, new AvatarImage.LocalIcon(Icons.Failed32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer13, 6, 28);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors7 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Modifier height3 = OffsetKt.height(ImageKt.m177backgroundbw27NRU(fillMaxSize4, colors7.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), IntrinsicSize.Max);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer14, 0);
                    int hashCode4 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer14, height3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Success.Provisioned provisioned3 = new FidesmoProvisioningViewModel.Success.Provisioned("Your new Charm is set up exactly like your Cash App Card.", null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                    Object rememberedValue5 = gapComposer14.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(22);
                        gapComposer14.updateRememberedValue(rememberedValue5);
                    }
                    FidesmoProvisioningViewKt.ProvisionSuccess(provisioned3, (Function1) rememberedValue5, false, gapComposer14, 48);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    Colors colors8 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    TextViewKt.Avatar(avatarSize3, new AvatarEntry("", colors8.semantic.background.inverse, null, new AvatarImage.LocalIcon(Icons.Check24, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer15, 6, 28);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors9 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors9.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer16, 0);
                    int hashCode5 = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer16, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Scanning.InProgress inProgress = new FidesmoProvisioningViewModel.Scanning.InProgress("Waking up your Wand", 1, 6, null, null, null, 504);
                    Object rememberedValue6 = gapComposer16.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(20);
                        gapComposer16.updateRememberedValue(rememberedValue6);
                    }
                    FidesmoProvisioningViewKt.ScanningContent(inProgress, (Function1) rememberedValue6, null, false, null, null, gapComposer16, 48, 60);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors10 = (Colors) gapComposer17.consume(ArcadeThemeKt.LocalColors);
                    if (colors10 == null) {
                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer17, -1762997026, gapComposer17, false);
                    } else {
                        gapComposer17.startReplaceGroup(-1762997739);
                        gapComposer17.end(false);
                    }
                    Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxWidth2, colors10.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer17, 0);
                    int hashCode6 = Long.hashCode(gapComposer17.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer17.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer17, m177backgroundbw27NRU3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer17.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer17.startReusableNode();
                    if (gapComposer17.inserting) {
                        gapComposer17.createNode(layoutNode$Companion$Constructor$16);
                    } else {
                        gapComposer17.useNode();
                    }
                    Updater.m576setimpl(gapComposer17, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer17, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer17, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Scanning.Disconnected disconnected = new FidesmoProvisioningViewModel.Scanning.Disconnected("Disconnected. Place your phone closer to your Wand.", new FidesmoProvisioningViewModel.Button("Having trouble?", FidesmoProvisioningViewModel.ButtonAction.Close.INSTANCE));
                    Object rememberedValue7 = gapComposer17.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(23);
                        gapComposer17.updateRememberedValue(rememberedValue7);
                    }
                    FidesmoProvisioningViewKt.ScanningContent(disconnected, (Function1) rememberedValue7, null, false, null, null, gapComposer17, 48, 60);
                    gapComposer17.end(true);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors11 = (Colors) gapComposer18.consume(ArcadeThemeKt.LocalColors);
                    if (colors11 == null) {
                        colors11 = re$$ExternalSyntheticOutline0.m(gapComposer18, -1762997026, gapComposer18, false);
                    } else {
                        gapComposer18.startReplaceGroup(-1762997739);
                        gapComposer18.end(false);
                    }
                    Modifier m177backgroundbw27NRU4 = ImageKt.m177backgroundbw27NRU(fillMaxWidth3, colors11.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer18, 0);
                    int hashCode7 = Long.hashCode(gapComposer18.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer18.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer18, m177backgroundbw27NRU4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer18.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer18.startReusableNode();
                    if (gapComposer18.inserting) {
                        gapComposer18.createNode(layoutNode$Companion$Constructor$17);
                    } else {
                        gapComposer18.useNode();
                    }
                    Updater.m576setimpl(gapComposer18, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer18, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer18, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer18, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer18, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                    FidesmoProvisioningViewModel.Scanning.InProgress inProgress2 = new FidesmoProvisioningViewModel.Scanning.InProgress("Waking up your Wand", null, null, null, null, null, 504);
                    Object rememberedValue8 = gapComposer18.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(21);
                        gapComposer18.updateRememberedValue(rememberedValue8);
                    }
                    FidesmoProvisioningViewKt.ScanningContent(inProgress2, (Function1) rememberedValue8, null, false, null, null, gapComposer18, 48, 60);
                    gapComposer18.end(true);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.InformationOutline24, (String) null, (Modifier) null, 0L, gapComposer19, 54, 12);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (!gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (!gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FamilyHomeSectionsKt$$ExternalSyntheticLambda6(int i, int i2) {
        this.$r8$classId = i2;
    }
}
