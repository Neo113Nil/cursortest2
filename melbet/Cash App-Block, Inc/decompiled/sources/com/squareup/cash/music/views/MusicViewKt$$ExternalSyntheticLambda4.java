package com.squareup.cash.music.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.calendar.views.CalendarRowKt$$ExternalSyntheticLambda10;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.DisclosureView$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.menu.DropdownItem;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt$$ExternalSyntheticLambda4;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.util.Strings;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ float f$3;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda4(float f, Function1 function1, CardStudioViewModelV2.Content content) {
        this.$r8$classId = 1;
        this.f$3 = f;
        this.f$1 = function1;
        this.f$0 = content;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        float f = 14.0f;
        float f2 = 10.0f;
        float f3 = RecyclerView.DECELERATION_RATE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 2;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function function = this.f$1;
        float f4 = this.f$3;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                MusicViewModel musicViewModel = (MusicViewModel) obj4;
                Function1 function1 = (Function1) function;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    TrackRowKt.MusicSheetContent(musicViewModel, function1, SizeKt.m277height3ABfNKs(SpacerKt.padding(companion, paddingValues), f4), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) function;
                CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) obj4;
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                GapComposer gapComposer2 = (GapComposer) composer2;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, composer2, 48);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer2, m298padding3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(composer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 52.0f), RoundedCornerShapeKt.CircleShape);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                Modifier rotate = RotateKt.rotate(ImageKt.m177backgroundbw27NRU(clip, colors.component.button.standard.background.f163default, rectangleShapeKt$RectangleShape$1), f4);
                Icons icons = Icons.Stickers24;
                String stringResource = Room.stringResource(composer2, R.string.accessibility_add_stamp);
                boolean changed = gapComposer3.changed(function12);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(22, function12);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, rotate, false, null, composer2, 6, 48);
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 175.0f, 52.0f);
                int indexOf = CardStudioViewModelV2.PatternDensity.$ENTRIES.indexOf(content.patternDensity);
                boolean changed2 = gapComposer3.changed(function12);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(18, function12);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                Function1 function13 = (Function1) rememberedValue2;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CalendarRowKt$$ExternalSyntheticLambda10(15);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                ModalKt.SegmentedControl(indexOf, function13, m287sizeVpY3zN4, (Function1) rememberedValue3, composer2, 3456, 0);
                gapComposer3.end(true);
                return Unit.INSTANCE;
            case 2:
                List list = (List) obj4;
                Function0 function0 = (Function0) function;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Iterator it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        DropdownItem dropdownItem = (DropdownItem) next;
                        dropdownItem.getClass();
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m276defaultMinSizeVpY3zN4$default(companion, f4, RecyclerView.DECELERATION_RATE, 2), 10.0f, RecyclerView.DECELERATION_RATE, 2);
                        Strings.getSizes(gapComposer4).getClass();
                        Object obj5 = DefaultSizes.border.entries;
                        Modifier.Companion companion2 = companion;
                        List list2 = list;
                        Iterator it2 = it;
                        AndroidMenu_androidKt.DropdownMenuItem(Expect_jvmKt.rememberComposableLambda(996714960, new SuggestionUiKt$$ExternalSyntheticLambda8(dropdownItem, 10), gapComposer4), new ExpandableContentKt$$ExternalSyntheticLambda4(dropdownItem.onClick, function0, 0), ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), null, null, true, new MenuItemColors(Strings.getColors(gapComposer4).semantic.text.standard, Strings.getColors(gapComposer4).semantic.icon.standard, Strings.getColors(gapComposer4).semantic.icon.standard, Strings.getColors(gapComposer4).semantic.text.disabled, Strings.getColors(gapComposer4).semantic.icon.disabled, Strings.getColors(gapComposer4).semantic.icon.disabled), new PaddingValuesImpl(14.0f, RecyclerView.DECELERATION_RATE, 14.0f, RecyclerView.DECELERATION_RATE), gapComposer4, 12582918, 280);
                        if (i3 != CollectionsKt__CollectionsKt.getLastIndex(list2)) {
                            gapComposer4.startReplaceGroup(-1987347364);
                            ModalKt.HorizontalDivider(0, 0, gapComposer4, ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer4).component.ui.divider.border, rectangleShapeKt$RectangleShape$1));
                            gapComposer4.end(false);
                        } else {
                            gapComposer4.startReplaceGroup(-1987157086);
                            gapComposer4.end(false);
                        }
                        it = it2;
                        i3 = i4;
                        companion = companion2;
                        list = list2;
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton = (OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton) obj4;
                Function1 function14 = (Function1) function;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (!gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    gapComposer5.skipToGroupEnd();
                } else if (offerDetailsButton instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard) {
                    gapComposer5.startReplaceGroup(1424691979);
                    OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton offerStandardButton = ((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard) offerDetailsButton).secondaryButton;
                    if (offerStandardButton == null) {
                        gapComposer5.startReplaceGroup(1424723846);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(1424723847);
                        ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed3 = gapComposer5.changed(function14) | gapComposer5.changedInstance(offerStandardButton);
                        Object rememberedValue4 = gapComposer5.rememberedValue();
                        if (changed3 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new UtilsKt$$ExternalSyntheticLambda0(25, function14, offerStandardButton);
                            gapComposer5.updateRememberedValue(rememberedValue4);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-170974588, new P2PListViewKt$$ExternalSyntheticLambda12(offerStandardButton, 13), gapComposer5), gapComposer5, 1573296, 56);
                        gapComposer5.end(false);
                    }
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed4 = gapComposer5.changed(function14) | gapComposer5.changedInstance(offerDetailsButton);
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(26, function14, offerDetailsButton);
                        gapComposer5.updateRememberedValue(rememberedValue5);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-305902946, new P2PListViewKt$$ExternalSyntheticLambda12(offerDetailsButton, 14), gapComposer5), gapComposer5, 1573296, 56);
                    gapComposer5.end(false);
                } else if (offerDetailsButton instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Loading) {
                    gapComposer5.startReplaceGroup(1431456598);
                    OfferDetailsSheetKt.OffersLoadingButton(gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    if (!(offerDetailsButton instanceof OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 1431429944, false);
                    }
                    gapComposer5.startReplaceGroup(1425534373);
                    OfferDetailsSheetKt.MessageButton(0, gapComposer5, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f4), ((OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText) offerDetailsButton).text);
                    gapComposer5.end(false);
                }
                return Unit.INSTANCE;
            default:
                ListBuilder listBuilder = (ListBuilder) obj4;
                Function0 function02 = (Function0) function;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Iterator it3 = listBuilder.iterator();
                    int i5 = 0;
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        com.squareup.cash.work.views.menu.DropdownItem dropdownItem2 = (com.squareup.cash.work.views.menu.DropdownItem) next2;
                        dropdownItem2.getClass();
                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m276defaultMinSizeVpY3zN4$default(companion, f4, f3, i2), f2, f3, i2);
                        Strings.getSizes(gapComposer6).getClass();
                        Object obj6 = DefaultSizes.border.entries;
                        Modifier clip2 = ClipKt.clip(m300paddingVpY3zN4$default2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f, f3, f, f3);
                        ListBuilder listBuilder2 = listBuilder;
                        Iterator it4 = it3;
                        MenuItemColors menuItemColors = new MenuItemColors(Strings.getColors(gapComposer6).semantic.text.standard, Strings.getColors(gapComposer6).semantic.icon.standard, Strings.getColors(gapComposer6).semantic.icon.standard, Strings.getColors(gapComposer6).semantic.text.disabled, Strings.getColors(gapComposer6).semantic.icon.disabled, Strings.getColors(gapComposer6).semantic.icon.disabled);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(872620294, new FieldBinding$$ExternalSyntheticLambda4(dropdownItem2, 20), gapComposer6);
                        boolean changed5 = gapComposer6.changed(dropdownItem2) | gapComposer6.changed(function02);
                        Object rememberedValue6 = gapComposer6.rememberedValue();
                        if (changed5 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new ListsKt$$ExternalSyntheticLambda0(15, dropdownItem2, function02);
                            gapComposer6.updateRememberedValue(rememberedValue6);
                        }
                        GapComposer gapComposer7 = gapComposer6;
                        AndroidMenu_androidKt.DropdownMenuItem(rememberComposableLambda, (Function0) rememberedValue6, clip2, null, null, true, menuItemColors, paddingValuesImpl, gapComposer7, 12582918, 280);
                        if (i5 != listBuilder2.size() - 1) {
                            gapComposer7.startReplaceGroup(-1622596922);
                            ModalKt.HorizontalDivider(0, 0, gapComposer7, ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer7).component.ui.divider.border, rectangleShapeKt$RectangleShape$1));
                            gapComposer7.end(false);
                        } else {
                            gapComposer7.startReplaceGroup(-1622406644);
                            gapComposer7.end(false);
                        }
                        it3 = it4;
                        gapComposer6 = gapComposer7;
                        listBuilder = listBuilder2;
                        i5 = i6;
                        f = 14.0f;
                        f2 = 10.0f;
                        f3 = RecyclerView.DECELERATION_RATE;
                        i2 = 2;
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda4(MusicViewModel musicViewModel, Function1 function1, float f) {
        this.$r8$classId = 0;
        this.f$0 = musicViewModel;
        this.f$1 = function1;
        this.f$3 = f;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda4(OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton offerDetailsButton, Function1 function1, float f) {
        this.$r8$classId = 3;
        this.f$0 = offerDetailsButton;
        this.f$1 = function1;
        this.f$3 = f;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda4(List list, float f, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
        this.f$3 = f;
        this.f$1 = function0;
    }
}
