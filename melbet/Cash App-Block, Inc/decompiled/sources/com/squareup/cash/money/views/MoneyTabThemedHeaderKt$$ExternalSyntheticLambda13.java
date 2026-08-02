package com.squareup.cash.money.views;

import androidx.collection.internal.Lock;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.appmessages.Action;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.LocalMoneybotPluginRegistryKt;
import com.squareup.cash.moneybot.fixtures.MoneybotChatViewTestDataKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.presenters.plugins.SavedSelectedInlineContentValue;
import com.squareup.cash.moneybot.presenters.plugins.SelectedInlineContentValue;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowIcon;
import com.squareup.cash.moneybot.viewmodels.SuggestionRowModel;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.chat.SuggestionRowStyle;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.home.PreviewActionCardPlugin;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderType;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.cash.Countries;
import com.squareup.util.pseudolocalization.MaybePseudoLocalizeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MoneyTabThemedHeaderKt$$ExternalSyntheticLambda13(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuggestionViewModel.SuggestionsRowViewModel createSuggestionRowViewModel;
        SuggestionViewModel.SuggestionsRowViewModel createSuggestionRowViewModel2;
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                MoneyTabThemedHeaderKt.DarkModeDimmer((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CardAppMessageViewModel.Ready ready = new CardAppMessageViewModel.Ready("token", new AppMessageImage.Static.Fixed(new Image("fake:///BlueBottle.png", (String) null, 6), false, 104, 104), "Invite friends, get $15 when they get started", (String) null, 0, new Actions$One(new Action("Invite friends", null, new AppMessageViewEvent.AppMessageViewed("token"))), 88);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda0(17);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda0(9);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(null, ready, function1, null, null, (Function1) rememberedValue2, gapComposer, 196992, 25);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    CardAppMessageViewModel.Ready ready2 = new CardAppMessageViewModel.Ready("token", new AppMessageImage.Static.Fixed(new Image("fake:///BlueBottle.png", (String) null, 6), false, 104, 104), "Invite friends, get $15 when they get started", (String) null, 0, new Actions$One(new Action("Invite friends", null, new AppMessageViewEvent.AppMessageViewed("token"))), 88);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda0(16);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(null, ready2, (Function1) rememberedValue3, null, null, null, gapComposer2, MLKEMEngine.KyberPolyBytes, 57);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors.semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.Check32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer4, null);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.LoadingContent((Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    TextStyle textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).helpText;
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, "+2 more", (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    SharedUIKt.PromotedAppletTile(new PromotedAppletTileViewModel.Loaded("Bitcoin", "Buy and sell Bitcoin easily", null, new Image("fake:///shrek.png", "fake:///shrek.png", 4)), null, null, gapComposer6, 48);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                GapComposer gapComposer7 = (GapComposer) ((Composer) obj);
                gapComposer7.startReplaceGroup(2107358359);
                TextStyle textStyle2 = ((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer7.end(false);
                return textStyle2;
            case 9:
                ((Integer) obj2).getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj);
                gapComposer8.startReplaceGroup(-1187539060);
                TextStyle textStyle3 = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                gapComposer8.end(false);
                return textStyle3;
            case 10:
                ((Boolean) obj2).booleanValue();
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                Map map = (Map) obj2;
                ((SaveableHolder) obj).getClass();
                map.getClass();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new SavedSelectedInlineContentValue((String) entry.getKey(), (SelectedInlineContentValue) entry.getValue()));
                }
                return new ArrayList(arrayList);
            case 12:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer7;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NavigationNewConversation, Room.stringResource(gapComposer9, R.string.moneybot_chat_header_item_new_chat), (Modifier) null, 0L, gapComposer9, 6, 12);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer8;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NavigationChatHistory, Room.stringResource(gapComposer10, R.string.moneybot_chat_header_item_overflow), (Modifier) null, 0L, gapComposer10, 6, 12);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer9;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, 40.0f), 40.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, 11);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer11, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 20.0f);
                    Painter painterResource = Countries.painterResource(R.drawable.send_icon, 0, gapComposer11);
                    Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(-1762997739);
                        gapComposer11.end(false);
                    }
                    Trace.m1190Iconww6aTOc(painterResource, (String) null, m285size3ABfNKs, colors3.component.button.standard.icon.f164default, gapComposer11, Painter.$stable | 432, 0);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer10;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    createSuggestionRowViewModel = MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Title 1", "Subtitle 1", new SuggestionRowIcon.Avatar(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639)));
                    SuggestionUiKt.SuggestionRow(null, (SuggestionRowModel) MaybePseudoLocalizeKt.maybePseudoLocalize$default(createSuggestionRowViewModel), null, false, false, null, null, null, gapComposer12, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer11;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    SuggestionUiKt.SuggestionRow(null, (SuggestionRowModel) MaybePseudoLocalizeKt.maybePseudoLocalize$default(MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Title 2", "Subtitle 2", new SuggestionRowIcon.Image(new Image("fake:///nvda.png", (String) null, 6)))), null, false, false, null, null, null, gapComposer13, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Colors colors4 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer14, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    createSuggestionRowViewModel2 = MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Title 1", "Subtitle 1", new SuggestionRowIcon.Avatar(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639)));
                    zzd zzdVar = Icons.Companion;
                    List list = (List) MaybePseudoLocalizeKt.maybePseudoLocalize$default(CollectionsKt__CollectionsKt.listOf((Object[]) new SuggestionViewModel.SuggestionsRowViewModel[]{createSuggestionRowViewModel2, MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Title 2", "Subtitle 2", new SuggestionRowIcon.Avatar(new UiAvatar(null, null, new Icon("K9cqyL"), null, null, null, null, 32763))), MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Title 3", "Subtitle 3", null)}));
                    FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer14.consume(CompositionLocalsKt.LocalFocusManager);
                    Object rememberedValue4 = gapComposer14.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new InsightChartKt$$ExternalSyntheticLambda19(3);
                        gapComposer14.updateRememberedValue(rememberedValue4);
                    }
                    SuggestionUiKt.SuggestionsVerticalStack(focusOwnerImpl, list, null, false, null, null, (Function1) rememberedValue4, gapComposer14, 1575936, 52);
                    gapComposer14.end(true);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Colors colors5 = (Colors) gapComposer15.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer15, -1762997026, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1762997739);
                        gapComposer15.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(companion, colors5.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer15.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer15, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer15.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer15.startReusableNode();
                    if (gapComposer15.inserting) {
                        gapComposer15.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer15.useNode();
                    }
                    Updater.m576setimpl(gapComposer15, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer15, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer15, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer15, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    zzd zzdVar2 = Icons.Companion;
                    List list2 = (List) MaybePseudoLocalizeKt.maybePseudoLocalize$default(CollectionsKt__CollectionsKt.listOf((Object[]) new SuggestionViewModel.SuggestionsRowViewModel[]{MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Spending's up", "You've spent 15% more this week, want to see where?", new SuggestionRowIcon.Avatar(new UiAvatar(null, null, new Icon("Yt8kA8"), null, null, null, null, 32763))), MoneybotChatViewTestDataKt.createSuggestionRowViewModel("Dinner with friends", "I found a Chipotle bill for $120, want to split it?", new SuggestionRowIcon.Avatar(new UiAvatar(null, null, new Icon("K9cqyL"), null, null, null, null, 32763)))}));
                    SuggestionRowStyle suggestionRowStyle = SuggestionRowStyle.CARD;
                    FocusOwnerImpl focusOwnerImpl2 = (FocusOwnerImpl) gapComposer15.consume(CompositionLocalsKt.LocalFocusManager);
                    Object rememberedValue5 = gapComposer15.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new InsightChartKt$$ExternalSyntheticLambda19(i2);
                        gapComposer15.updateRememberedValue(rememberedValue5);
                    }
                    SuggestionUiKt.SuggestionsVerticalStack(focusOwnerImpl2, list2, suggestionRowStyle, false, null, null, (Function1) rememberedValue5, gapComposer15, 1576320, 48);
                    gapComposer15.end(true);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                int intValue14 = ((Integer) obj).intValue();
                MessageViewModel messageViewModel = (MessageViewModel) obj2;
                messageViewModel.getClass();
                return RuntimeHelpersKt.stableKey(messageViewModel, intValue14);
            case 20:
                Composer composer14 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Color color = new Color(Color.Transparent);
                    MoneybotColors moneybotColors = (MoneybotColors) gapComposer16.consume(MoneybotThemeKt.LocalMoneybotColors);
                    if (moneybotColors == null) {
                        gapComposer16.startReplaceGroup(-973090538);
                        Colors colors6 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                        } else {
                            gapComposer16.startReplaceGroup(-1762997739);
                            gapComposer16.end(false);
                        }
                        moneybotColors = MoneybotColorsKt.fromArcade(colors6);
                    } else {
                        gapComposer16.startReplaceGroup(-973091964);
                    }
                    gapComposer16.end(false);
                    BoxKt.Box(ImageKt.background$default(fillMaxSize, Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{color, new Color(moneybotColors.canvas.background)})), null, 6), gapComposer16, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer15 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    MoneybotHomeViewModel.WidgetCard widgetCard = new MoneybotHomeViewModel.WidgetCard("widget-1", "widget-1", ClientRenderType.CLIENT_RENDER_TYPE_ACTION_CARD, new UiCallbackModel(new MoneyTabUIKt$$ExternalSyntheticLambda13(17), new ActionCardViewModel(new ActionCardViewModel.Icon.EmojiIcon("gift", "Gift"), null, "Title", "Description", null, null, null)), null, new MoneybotHomeViewModel.WidgetCard.Action(new MoneybotHomeViewEvent.DeleteWidget("widget-1")), new MoneybotHomeViewEvent.WidgetViewed("widget-1"));
                    Object rememberedValue6 = gapComposer17.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new InsightChartKt$$ExternalSyntheticLambda19(15);
                        gapComposer17.updateRememberedValue(rememberedValue6);
                    }
                    MoneybotHomeViewKt.WidgetCard(null, widgetCard, (Function1) rememberedValue6, true, gapComposer17, 3456, 1);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer16 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ProvidedValue defaultProvidedValue$runtime = LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry.defaultProvidedValue$runtime(new ClientRenderablePluginRegistry(MapsKt__MapsKt.mapOf(new Pair(ClientRenderType.CLIENT_RENDER_TYPE_ACTION_CARD, new PreviewActionCardPlugin(r9 ? 1 : 0)), new Pair(ClientRenderType.CLIENT_RENDER_TYPE_SUGGESTION_LIST, new PreviewActionCardPlugin(i3)))));
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalImageLoaderKt.LocalImageLoader;
                    Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, staticProvidableCompositionLocal.defaultProvidedValue$runtime(gapComposer18.consume(staticProvidableCompositionLocal)), LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled.defaultProvidedValue$runtime(Boolean.FALSE)}, MoneybotHomeViewKt.f483lambda$428757732, gapComposer18, 56);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                GapComposer gapComposer19 = (GapComposer) ((Composer) obj);
                gapComposer19.startReplaceGroup(565685402);
                Object rememberedValue7 = gapComposer19.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new ExtendedSpans(new RoundedCornerSpanPainter(new RoundedCornerSpanPainter.TextPaddingValues(Room.getSp(0), Room.getSp(2))));
                    gapComposer19.updateRememberedValue(rememberedValue7);
                }
                ExtendedSpans extendedSpans = (ExtendedSpans) rememberedValue7;
                gapComposer19.end(false);
                return extendedSpans;
            case 24:
                ((Integer) obj2).getClass();
                MoneybotMarkdownKt.HorizontalRule((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                Composer composer17 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer17;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer20, R.string.moneybot_overflow_menu_recents_empty);
                    TextStyle textStyle4 = ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors7 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors7.semantic.text.disabled, (Composer) gapComposer20, (Modifier) null, textStyle4, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer18 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer18;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer21, SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer19 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer19;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Icons icons = Icons.SendArrow24;
                    Colors colors8 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs2, colors8.semantic.icon.inverse, gapComposer22, 438, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer20 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer20;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 16.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                    Colors colors9 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors9.semantic.icon.inverse, rectangleShapeKt$RectangleShape$1), gapComposer23, 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer21 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer21;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer24, null);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
