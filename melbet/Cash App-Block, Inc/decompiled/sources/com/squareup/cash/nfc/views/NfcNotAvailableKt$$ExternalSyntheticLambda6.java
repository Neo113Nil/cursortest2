package com.squareup.cash.nfc.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.moneyformatter.MoneyKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.FilterGroupsSectionViewModel;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import com.squareup.cash.offers.views.OffersFilterGroupSheetKt;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.collection.OffersCollectionListingKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class NfcNotAvailableKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                NfcNotAvailableKt.EnableNfc((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    KeypadKt.SearchIcon(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.search_close, 0, gapComposer2);
                    String stringResource = Room.stringResource(gapComposer2, R.string.clear_search);
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 8.0f);
                    long j = MooncakeTheme.getColors(gapComposer2).tertiaryLabel;
                    ImageKt.Image(painterResource, stringResource, m298padding3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                KeypadKt.SearchIcon((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel = OffersFilterGroupSheetKt.filterGroupSheetViewModel;
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(i2);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    OffersFilterGroupSheetKt.OffersFilterGroupSheet(offersFilterGroupSheetViewModel, (Function1) rememberedValue, null, gapComposer6, 48);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    MoneyKt.m3505FakeBottomSheet3IgeMak(null, colors.semantic.background.f1047app, UtilsKt.f512lambda$1507546186, gapComposer7, MLKEMEngine.KyberPolyBytes, 1);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState = (OffersCollapsibleHeaderScaffoldState) obj2;
                ((SaveableHolder) obj).getClass();
                offersCollapsibleHeaderScaffoldState.getClass();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(offersCollapsibleHeaderScaffoldState.headerHeightInPx$delegate.getFloatValue()), Float.valueOf(offersCollapsibleHeaderScaffoldState.headerYOffsetInPx$delegate.getFloatValue())});
            case 10:
                ((Integer) obj2).getClass();
                OffersCollectionListingKt.OffersCollectionLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.GreenRectangle((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OffersLoadingButton((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ArrayList arrayList = OffersSearchListingKt.SEARCH_LISTING_ITEMS;
                    FilterGroupsSectionViewModel filterGroupsSectionViewModel = new FilterGroupsSectionViewModel(EmptyList.INSTANCE, false);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new OffersStyledTextKt$$ExternalSyntheticLambda0(15);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    Object rememberedValue3 = gapComposer8.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda2(8);
                        gapComposer8.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda2(9);
                        gapComposer8.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function02 = (Function0) rememberedValue4;
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new NfcNotAvailableKt$$ExternalSyntheticLambda6(14);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    OffersSearchListingKt.OffersSearchListing(arrayList, filterGroupsSectionViewModel, true, null, function1, function0, 0, function02, (Function2) rememberedValue5, gapComposer8, 113467776, 72);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                return Unit.INSTANCE;
            case 15:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 48.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors3 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors3.semantic.background.danger, RoundedCornerShapeKt.CircleShape), 12.0f);
                    Icons icons = Icons.Alert32;
                    Colors colors4 = (Colors) gapComposer9.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m298padding3ABfNKs2, colors4.semantic.icon.inverse, gapComposer9, 54, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 48.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors5 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal2);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs2, colors5.semantic.background.subtle, RoundedCornerShapeKt.CircleShape), 12.0f);
                    Icons icons2 = Icons.Add24;
                    String stringResource2 = Room.stringResource(gapComposer10, R.string.account_picker_add_account_title);
                    Colors colors6 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal2);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, stringResource2, m298padding3ABfNKs3, colors6.semantic.icon.standard, gapComposer10, 6, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.account_picker_add_account_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                P2PListRowKt.P2PBlockListRowLoading((Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 19:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.passkeys_education_cross_device_description), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Help24, (String) null, (Modifier) null, 0L, gapComposer13, 54, 12);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.passkeys_education_what_is_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.passkeys_education_what_is_description), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.BiometricsFingerprint24, (String) null, (Modifier) null, 0L, gapComposer16, 54, 12);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.passkeys_education_no_password_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.passkeys_education_no_password_description), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DeviceMobile24, (String) null, (Modifier) null, 0L, gapComposer19, 54, 12);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.passkeys_education_cross_device_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyManagementHeader((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.EmptyContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NfcNotAvailableKt$$ExternalSyntheticLambda6(int i, int i2) {
        this.$r8$classId = i2;
    }
}
