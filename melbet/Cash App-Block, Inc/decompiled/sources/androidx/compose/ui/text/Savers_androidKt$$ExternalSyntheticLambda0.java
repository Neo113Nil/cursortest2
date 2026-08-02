package androidx.compose.ui.text;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.broadway.ui.compose.FullScreenKt;
import app.cash.broadway.ui.compose.OrientationKt;
import app.cash.local.backend.real.BuyerIntentSyncManager;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.presenters.brand.checkout.CheckoutGiftCardState;
import app.cash.local.presenters.brand.checkout.CheckoutTipState;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class Savers_androidKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Savers_androidKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = 9;
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj2;
                Boolean valueOf = Boolean.valueOf(platformParagraphStyle.includeFontPadding);
                WorkLauncherImpl workLauncherImpl = SaversKt.AnnotatedStringSaver;
                return CollectionsKt__CollectionsKt.arrayListOf(valueOf, SaversKt.save(new EmojiSupportMatch(platformParagraphStyle.emojiSupportMatch), TextPainterKt.emojiSupportMatchSaver, (SaveableHolder) obj));
            case 1:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            case 2:
                return (SwipeToDismissBoxValue) ((SwipeToDismissBoxState) obj2).anchoredDraggableState.currentValue$delegate.getValue();
            case 3:
                return Integer.valueOf(((EmojiSupportMatch) obj2).value);
            case 4:
                return Integer.valueOf(((LineBreak) obj2).mask);
            case 5:
                TextMotion textMotion = (TextMotion) obj2;
                return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(new TextMotion.Linearity(textMotion.linearity), TextPainterKt.TextMotionLinearitySaver, (SaveableHolder) obj), Boolean.valueOf(textMotion.subpixelTextPositioning));
            case 6:
                return Integer.valueOf(((TextMotion.Linearity) obj2).value);
            case 7:
                return ((NavHostController) obj2).saveState();
            case 8:
                ((Integer) obj2).getClass();
                FullScreenKt.FullScreen((Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 9:
                UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                ((Integer) obj2).getClass();
                OrientationKt.Orientation((Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 10:
                BuyerIntentSyncManager.Combination combination = (BuyerIntentSyncManager.Combination) obj;
                BuyerIntentSyncManager.Combination combination2 = (BuyerIntentSyncManager.Combination) obj2;
                combination.getClass();
                combination2.getClass();
                if (Intrinsics.areEqual(combination.selections, combination2.selections) && Intrinsics.areEqual(combination.discountCodes, combination2.discountCodes) && FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(combination.fulfillmentConfiguration).equals(FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(combination2.fulfillmentConfiguration))) {
                    r7 = true;
                }
                return Boolean.valueOf(r7);
            case 11:
                CalculateLineItemsManager.Combination combination3 = (CalculateLineItemsManager.Combination) obj;
                CalculateLineItemsManager.Combination combination4 = (CalculateLineItemsManager.Combination) obj2;
                combination3.getClass();
                combination4.getClass();
                if (combination3.flagEnablement == combination4.flagEnablement && Intrinsics.areEqual(combination3.selections, combination4.selections) && Intrinsics.areEqual(combination3.discountCodes, combination4.discountCodes) && FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(combination3.fulfillmentConfiguration).equals(FulfillmentConfigurationKt.normalizedForCalculateLineItemsRequest(combination4.fulfillmentConfiguration))) {
                    r7 = true;
                }
                return Boolean.valueOf(r7);
            case 12:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                ((SaveableHolder) obj).getClass();
                snapshotStateList.getClass();
                return SnapshotId_jvmKt.getReadable(snapshotStateList).list;
            case 13:
                CheckoutGiftCardState checkoutGiftCardState = (CheckoutGiftCardState) obj2;
                ((SaveableHolder) obj).getClass();
                checkoutGiftCardState.getClass();
                String code = checkoutGiftCardState.getCode();
                String str = (String) checkoutGiftCardState.error$delegate.getValue();
                return CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{code, str != null ? str : "", String.valueOf(((Boolean) checkoutGiftCardState.isExpanded$delegate.getValue()).booleanValue())});
            case 14:
                CheckoutTipState checkoutTipState = (CheckoutTipState) obj2;
                ((SaveableHolder) obj).getClass();
                checkoutTipState.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = checkoutTipState.currentTipLocalCashEarningsLabel$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = checkoutTipState.overrideTip$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = checkoutTipState.selectedTipIndex$delegate;
                Integer num = (Integer) parcelableSnapshotMutableState3.getValue();
                Integer valueOf2 = Integer.valueOf(num != null ? num.intValue() : 0);
                Boolean valueOf3 = Boolean.valueOf(((Integer) parcelableSnapshotMutableState3.getValue()) != null);
                LocalMoney localMoney = checkoutTipState.tipAmount;
                LocalMoney localMoney2 = localMoney == null ? LocalMoney.Zero : localMoney;
                Boolean valueOf4 = Boolean.valueOf(localMoney != null);
                ArrayList arrayList = new ArrayList(checkoutTipState.suggestions);
                Boolean valueOf5 = Boolean.valueOf(checkoutTipState.useEnteredTipAsOverride);
                String str2 = (String) parcelableSnapshotMutableState2.getValue();
                String str3 = str2 == null ? "" : str2;
                Boolean valueOf6 = Boolean.valueOf(((String) parcelableSnapshotMutableState2.getValue()) != null);
                String str4 = (String) parcelableSnapshotMutableState.getValue();
                return CollectionsKt__CollectionsKt.listOf(valueOf2, valueOf3, localMoney2, valueOf4, arrayList, valueOf5, str3, valueOf6, str4 == null ? "" : str4, Boolean.valueOf(((String) parcelableSnapshotMutableState.getValue()) != null), (String) checkoutTipState.currentTip$delegate.getValue());
            case 15:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.m1309TipDivider8Feqmps((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    String stringResource = Room.stringResource(gapComposer, R.string.local_views_name_title);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).listNumber, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.local_views_phone_title);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.semantic.text.prominent, (Composer) gapComposer2, m302paddingqDBjuR0$default2, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Painter painter = Icons.AlertFill24.painter(gapComposer3);
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j = colors3.semantic.icon.danger;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | 432, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "$", (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                LocalBrandLocationCheckoutViewKt.IdvRequiredRow((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj).intValue();
                LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) obj2;
                menuCategory.getClass();
                return new MenuCategoryToken(menuCategory.token);
            case 22:
                ((Integer) obj2).getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj);
                gapComposer5.startReplaceGroup(-1454894323);
                Painter painter2 = Icons.CategoryRestaurant32.painter(gapComposer5);
                gapComposer5.end(false);
                return painter2;
            case 23:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.local_views_curbside_im_here), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.local_views_curbside_call), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer8, SizeKt.m285size3ABfNKs(companion, 20.0f));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Check24, Room.stringResource(gapComposer9, R.string.local_views_curbside_arrival_confirmed), (Modifier) null, 0L, gapComposer9, 6, 12);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.ClosedTabSuccessHeader((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 28:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                    Colors colors4 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    ProgressCircularKt.ProgressCircular(0, 0, gapComposer10, ImageKt.m177backgroundbw27NRU(m285size3ABfNKs2, colors4.semantic.icon.inverse, ColorKt.RectangleShape));
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj).intValue();
                SchedulingTime schedulingTime = (SchedulingTime) obj2;
                schedulingTime.getClass();
                String str5 = schedulingTime.scheduling_day_time_token;
                str5.getClass();
                return str5;
        }
    }

    public /* synthetic */ Savers_androidKt$$ExternalSyntheticLambda0(byte b, int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ Savers_androidKt$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
    }

    public /* synthetic */ Savers_androidKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
    }
}
