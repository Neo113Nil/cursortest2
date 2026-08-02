package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.LocalCashBalanceViewEvent;
import app.cash.local.viewmodels.LocalEditorialViewEvent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewEvent;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt$$ExternalSyntheticLambda0;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.activity.viewmodels.ReceiptViewEvent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.activity.views.receipts.ComposableSingletons$ReceiptUiKt;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletActivityListEmbeddedViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletInfoSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletPurchasesEmbeddedViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletRetroOrderSelectionViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletUpsellSheetViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheet;
import com.squareup.cash.afterpayapplet.views.browser.SelectAfterpayPromptSheetKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeToDismissKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SwipeToDismissKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        DismissDirection dismissDirection = null;
        dismissDirection = null;
        dismissDirection = null;
        int i2 = 3;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                DismissValue dismissValue = (DismissValue) obj;
                DismissValue dismissValue2 = (DismissValue) obj2;
                if (dismissValue != dismissValue2 || dismissValue != DismissValue.Default) {
                    if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToEnd) {
                        dismissDirection = DismissDirection.StartToEnd;
                    } else if (dismissValue == dismissValue2 && dismissValue == DismissValue.DismissedToStart) {
                        dismissDirection = DismissDirection.EndToStart;
                    } else {
                        DismissValue dismissValue3 = DismissValue.Default;
                        if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToEnd) {
                            dismissDirection = DismissDirection.StartToEnd;
                        } else if (dismissValue == dismissValue3 && dismissValue2 == DismissValue.DismissedToStart) {
                            dismissDirection = DismissDirection.EndToStart;
                        } else if (dismissValue == DismissValue.DismissedToEnd && dismissValue2 == dismissValue3) {
                            dismissDirection = DismissDirection.StartToEnd;
                        } else if (dismissValue == DismissValue.DismissedToStart && dismissValue2 == dismissValue3) {
                            dismissDirection = DismissDirection.EndToStart;
                        }
                    }
                }
                dismissDirection.getClass();
                return (FixedThreshold) function1.invoke(dismissDirection);
            case 1:
                ((Integer) obj2).intValue();
                return (GridItemSpan) function1.invoke((LazyGridSpanLayoutProvider.LazyGridItemSpanScopeImpl) obj);
            case 2:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                function1.invoke(str);
                return Unit.INSTANCE;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                function1.invoke(str2);
                return Unit.INSTANCE;
            case 4:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 32.0f), RoundedCornerShapeKt.CircleShape);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 27);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m183clickableoSLSa3U$default, colors.semantic.background.standard, rectangleShapeKt$RectangleShape$1), 8.0f);
                    Painter painter = Icons.CommPhoneFill16.painter(gapComposer);
                    com.squareup.cash.arcade.Colors colors2 = (com.squareup.cash.arcade.Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors2.semantic.icon.standard;
                    ImageKt.Image(painter, null, m298padding3ABfNKs, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24624, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier clip2 = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 32.0f), RoundedCornerShapeKt.CircleShape);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 26);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(clip2, false, null, null, (Function0) rememberedValue2, 15);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    com.squareup.cash.arcade.Colors colors3 = (com.squareup.cash.arcade.Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m183clickableoSLSa3U$default2, colors3.semantic.background.standard, rectangleShapeKt$RectangleShape$1), 8.0f);
                    Painter painter2 = Icons.CommPhoneFill16.painter(gapComposer2);
                    com.squareup.cash.arcade.Colors colors4 = (com.squareup.cash.arcade.Colors) gapComposer2.consume(staticProvidableCompositionLocal2);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j2 = colors4.semantic.icon.standard;
                    ImageKt.Image(painter2, null, m298padding3ABfNKs2, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 24624, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                ((String) obj2).getClass();
                function1.invoke(new LocalCashBalanceViewEvent.UrlClicked(str3));
                return Unit.INSTANCE;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                ((String) obj2).getClass();
                function1.invoke(new LocalEditorialViewEvent.UrlClicked(str4));
                return Unit.INSTANCE;
            case 8:
                String str5 = (String) obj;
                str5.getClass();
                ((String) obj2).getClass();
                function1.invoke(new LocalPosBrandOnboardingViewEvent.UrlClicked(str5));
                return Unit.INSTANCE;
            case 9:
                String str6 = (String) obj;
                str6.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AccountDocumentsViewEvent.FooterClick(str6));
                return Unit.INSTANCE;
            case 10:
                String str7 = (String) obj;
                str7.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AccountViewEvent.DisclosureUrlClick(str7));
                return Unit.INSTANCE;
            case 11:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier m298padding3ABfNKs3 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f), MooncakeTheme.getColors(gapComposer3).background, rectangleShapeKt$RectangleShape$1), 32.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m298padding3ABfNKs3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    BadgeTitleKt.IconHeaderView(null, Room.stringResource(gapComposer3, R.string.accounts_loading_failed_title), Room.stringResource(gapComposer3, R.string.accounts_loading_failed_description), MooncakeLargeIcon.Icon.Alert, gapComposer3, 3072);
                    SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                    String stringResource = Room.stringResource(gapComposer3, R.string.close);
                    MooncakePillButton.Style style = MooncakePillButton.Style.SECONDARY;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AccountToDoKt$$ExternalSyntheticLambda0(25, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    KeypadKt.m3640ButtonGFipHI0(stringResource, (Function0) rememberedValue3, fillMaxWidth, null, null, style, null, false, 0, null, null, gapComposer3, 196992, 0, 4056);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer4, 48);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, companion2);
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
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.balance_feed_available_balance), (Map) null, (Function1) null, false);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer4);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue4;
                    com.squareup.cash.arcade.theme.RippleNodeFactory m3400rippleYJYuY3k = com.squareup.cash.arcade.theme.RippleKt.m3400rippleYJYuY3k(Strings.getColors(gapComposer4).component.cell.background.pressed, false, RecyclerView.DECELERATION_RATE, null, gapComposer4, 48, 12);
                    String stringResource2 = Room.stringResource(gapComposer4, R.string.balance_feed_sheet_trigger_description);
                    Role role = new Role(0);
                    boolean changed4 = gapComposer4.changed(function1);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new BalanceFeedKt$$ExternalSyntheticLambda4(23, function1);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    Trace.m1191Iconww6aTOc(Icons.InformationFill16, (String) null, ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, stringResource2, role, (Function0) rememberedValue5, 4), Strings.getColors(gapComposer4).semantic.icon.subtle, gapComposer4, 54, 0);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                String str8 = (String) obj;
                str8.getClass();
                ((String) obj2).getClass();
                function1.invoke(new ReceiptViewEvent.OpenUrl(str8));
                return Unit.INSTANCE;
            case 14:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m298padding3ABfNKs(companion, 16.0f), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, fillMaxWidth2);
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
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed5 = gapComposer5.changed(function1);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed5 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new ReceiptUiKt$$ExternalSyntheticLambda3(i2, function1);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, fillMaxWidth3, null, false, false, null, ComposableSingletons$ReceiptUiKt.f130lambda$1673243513, gapComposer5, 1572912, 60);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                String str9 = (String) obj;
                str9.getClass();
                function1.invoke(new AfterpayAppletActivityListEmbeddedViewEvent.FooterLinkTapped(str9));
                return Unit.INSTANCE;
            case 16:
                List list = (List) obj;
                String str10 = (String) obj2;
                if (list != null) {
                    List list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        function1.invoke(new ItemViewed(list2, str10));
                    }
                }
                return Unit.INSTANCE;
            case 17:
                String str11 = (String) obj;
                str11.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletInfoSheetViewEvent.UrlTapped(str11));
                return Unit.INSTANCE;
            case 18:
                String str12 = (String) obj;
                str12.getClass();
                function1.invoke(new AfterpayAppletPurchasesEmbeddedViewEvent.FooterLinkTapped(str12));
                return Unit.INSTANCE;
            case 19:
                String str13 = (String) obj;
                str13.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletUpsellSheetViewEvent.UrlTapped(str13));
                return Unit.INSTANCE;
            case 20:
                String str14 = (String) obj;
                str14.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletUpsellSheetViewEvent.UrlTapped(str14));
                return Unit.INSTANCE;
            case 21:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i3 = SelectAfterpayPromptSheet.$r8$clinit;
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    SelectAfterpayPromptSheetKt.SelectAfterpayPrompt(function1, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                String str15 = (String) obj;
                str15.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent.LegalSectionUrlTapped(str15));
                return Unit.INSTANCE;
            case 23:
                String str16 = (String) obj;
                str16.getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped(str16, (List) obj2));
                return Unit.INSTANCE;
            case 24:
                String str17 = (String) obj;
                str17.getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped(str17, (List) obj2));
                return Unit.INSTANCE;
            case 25:
                String str18 = (String) obj;
                str18.getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped(str18, (List) obj2));
                return Unit.INSTANCE;
            case 26:
                String str19 = (String) obj;
                str19.getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped(str19, (List) obj2));
                return Unit.INSTANCE;
            case 27:
                String str20 = (String) obj;
                str20.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletHomeViewEvent.LegalSectionUrlTapped(str20));
                return Unit.INSTANCE;
            case 28:
                String str21 = (String) obj;
                str21.getClass();
                ((String) obj2).getClass();
                Tap.Url url = new Tap.Url(str21, null);
                function1.invoke(new AfterpayAppletHomeViewEvent.TapActionEvent(url, url.getAnalyticsTapEventsSpec()));
                return Unit.INSTANCE;
            default:
                String str22 = (String) obj;
                str22.getClass();
                ((String) obj2).getClass();
                function1.invoke(new AfterpayAppletRetroOrderSelectionViewEvent.UrlTapped(str22));
                return Unit.INSTANCE;
        }
    }
}
