package com.squareup.cash.activity.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.compact.CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.activity.views.compact.CompactActivityScopesKt;
import com.squareup.cash.activity.views.compact.CompactCellActivityKt;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryButtonScope;
import com.squareup.cash.activity.views.compact.RealCompactActivityAccessoryScope;
import com.squareup.cash.activity.views.compact.RealCompactActivityAvatarScope;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryButtonScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.menu.OpenSessionByIdDialogKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityItemViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityItemViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ActivityItemViewKt$$ExternalSyntheticLambda5(ActivityItemViewModel activityItemViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = activityItemViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        final int i2 = 3;
        Object obj4 = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        ActivityItemViewModel activityItemViewModel = this.f$0;
        final int i3 = 2;
        boolean z = false;
        boolean z2 = false;
        final int i4 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RealCellActivityAvatarScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    StackedAvatarViewModel stackedAvatarViewModel = activityItemViewModel.avatar;
                    AvatarBadgeViewModel avatarBadgeViewModel = activityItemViewModel.avatarBadge;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AvatarsKt.ActivityAvatar(null, stackedAvatarViewModel, avatarBadgeViewModel, null, (Function0) rememberedValue, gapComposer, 0, 9);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = realCellActivityAccessoryScope.type$delegate;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    final ItemAccessory itemAccessory = activityItemViewModel.accessory;
                    if (itemAccessory instanceof ItemAccessory.Amount) {
                        gapComposer2.startReplaceGroup(1550023249);
                        int i5 = ActivityItemViewKt.WhenMappings.$EnumSwitchMapping$1[((ItemAccessory.Amount) itemAccessory).treatment.ordinal()];
                        if (i5 == 1) {
                            gapComposer2.startReplaceGroup(-919828698);
                            final boolean z3 = z2 ? 1 : 0;
                            realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(1882529564, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    int i6 = z3;
                                    ItemAccessory itemAccessory2 = itemAccessory;
                                    switch (i6) {
                                        case 0:
                                            Composer composer3 = (Composer) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer4 = (Composer) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                            if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-1762997739);
                                                    gapComposer4.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj5;
                                            int intValue5 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj5;
                                            int intValue6 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj5;
                                            int intValue7 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj5;
                                            int intValue8 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj5;
                                            int intValue9 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj5;
                                            int intValue10 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj5;
                                            int intValue11 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj5;
                                            int intValue12 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2));
                            gapComposer2.end(false);
                        } else if (i5 == 2) {
                            gapComposer2.startReplaceGroup(-919825704);
                            realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(1163214085, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    int i6 = i4;
                                    ItemAccessory itemAccessory2 = itemAccessory;
                                    switch (i6) {
                                        case 0:
                                            Composer composer3 = (Composer) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer4 = (Composer) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                            if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-1762997739);
                                                    gapComposer4.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj5;
                                            int intValue5 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj5;
                                            int intValue6 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj5;
                                            int intValue7 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj5;
                                            int intValue8 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj5;
                                            int intValue9 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj5;
                                            int intValue10 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj5;
                                            int intValue11 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj5;
                                            int intValue12 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2));
                            gapComposer2.end(false);
                        } else if (i5 == 3) {
                            gapComposer2.startReplaceGroup(-919821843);
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(333764707, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    int i6 = i3;
                                    ItemAccessory itemAccessory2 = itemAccessory;
                                    switch (i6) {
                                        case 0:
                                            Composer composer3 = (Composer) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer4 = (Composer) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                            if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-1762997739);
                                                    gapComposer4.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj5;
                                            int intValue5 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj5;
                                            int intValue6 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj5;
                                            int intValue7 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj5;
                                            int intValue8 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj5;
                                            int intValue9 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj5;
                                            int intValue10 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj5;
                                            int intValue11 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj5;
                                            int intValue12 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2);
                            parcelableSnapshotMutableState.setValue(RealCellActivityAccessoryScope.Type.AMOUNT);
                            realCellActivityAccessoryScope.setAccessoryContent(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(rememberComposableLambda, 26), true, -2056629619));
                            gapComposer2.end(false);
                        } else {
                            if (i5 != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -919830575, false);
                            }
                            gapComposer2.startReplaceGroup(-919819057);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(803147213, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    int i6 = i2;
                                    ItemAccessory itemAccessory2 = itemAccessory;
                                    switch (i6) {
                                        case 0:
                                            Composer composer3 = (Composer) obj5;
                                            int intValue3 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer4 = (Composer) obj5;
                                            int intValue4 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                            if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-1762997739);
                                                    gapComposer4.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj5;
                                            int intValue5 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj5;
                                            int intValue6 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj5;
                                            int intValue7 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj5;
                                            int intValue8 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory2).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj5;
                                            int intValue9 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj5;
                                            int intValue10 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj5;
                                            int intValue11 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj5;
                                            int intValue12 = ((Integer) obj6).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2);
                            parcelableSnapshotMutableState.setValue(RealCellActivityAccessoryScope.Type.AMOUNT);
                            realCellActivityAccessoryScope.setAccessoryContent(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(rememberComposableLambda2, 28), true, -312423080));
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(false);
                    } else if (itemAccessory instanceof ItemAccessory.DualAmounts) {
                        gapComposer2.startReplaceGroup(-919815925);
                        realCellActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(703669389, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i6 = r2;
                                ItemAccessory itemAccessory2 = itemAccessory;
                                switch (i6) {
                                    case 0:
                                        Composer composer3 = (Composer) obj5;
                                        int intValue3 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer4 = (Composer) obj5;
                                        int intValue4 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                            String str = ((ItemAccessory.Amount) itemAccessory2).text;
                                            Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                            } else {
                                                gapComposer4.startReplaceGroup(-1762997739);
                                                gapComposer4.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        Composer composer7 = (Composer) obj5;
                                        int intValue7 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                            ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer7, 0);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        Composer composer8 = (Composer) obj5;
                                        int intValue8 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer8 = (GapComposer) composer8;
                                        if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                            String str2 = ((ItemAccessory.Amount) itemAccessory2).text;
                                            Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1762997739);
                                                gapComposer8.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        Composer composer9 = (Composer) obj5;
                                        int intValue9 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer9 = (GapComposer) composer9;
                                        if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        Composer composer10 = (Composer) obj5;
                                        int intValue10 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                    case 8:
                                        Composer composer11 = (Composer) obj5;
                                        int intValue11 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                            ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory2, gapComposer11, 0);
                                        } else {
                                            gapComposer11.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer12 = (Composer) obj5;
                                        int intValue12 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory2).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer2));
                        gapComposer2.end(false);
                    } else if (itemAccessory instanceof ItemAccessory.Button) {
                        gapComposer2.startReplaceGroup(1550555488);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        Object obj5 = rememberedValue2;
                        if (changed2 || rememberedValue2 == obj4) {
                            Object balanceFeedKt$$ExternalSyntheticLambda4 = new BalanceFeedKt$$ExternalSyntheticLambda4(10, function1);
                            gapComposer2.updateRememberedValue(balanceFeedKt$$ExternalSyntheticLambda4);
                            obj5 = balanceFeedKt$$ExternalSyntheticLambda4;
                        }
                        BalanceFeedKt$$ExternalSyntheticLambda4 balanceFeedKt$$ExternalSyntheticLambda42 = (Function0) obj5;
                        boolean changedInstance = gapComposer2.changedInstance(itemAccessory);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj6 = rememberedValue3;
                        if (changedInstance || rememberedValue3 == obj4) {
                            final boolean z4 = z ? 1 : 0;
                            Object obj7 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj8) {
                                    final ButtonProminence buttonProminence;
                                    final ButtonProminence buttonProminence2;
                                    int i6 = z4;
                                    ItemAccessory itemAccessory2 = itemAccessory;
                                    final int i7 = 1;
                                    switch (i6) {
                                        case 0:
                                            ((RealCellActivityAccessoryButtonScope) obj8).getClass();
                                            final ItemAccessory.Button button = (ItemAccessory.Button) itemAccessory2;
                                            switch (ActivityItemViewKt.WhenMappings.$EnumSwitchMapping$2[button.prominence.ordinal()]) {
                                                case 1:
                                                case 2:
                                                    buttonProminence = ButtonProminence.STANDARD;
                                                    break;
                                                case 3:
                                                case 4:
                                                    buttonProminence = ButtonProminence.PROMINENT;
                                                    break;
                                                case 5:
                                                case 6:
                                                    buttonProminence = ButtonProminence.SUBTLE;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            final int i8 = 0;
                                            return new CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda25
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                    int i9 = i8;
                                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                    final ItemAccessory.Button button2 = button;
                                                    char c = 1;
                                                    char c2 = 1;
                                                    final int i10 = 0;
                                                    switch (i9) {
                                                        case 0:
                                                            Function0 function0 = (Function0) obj9;
                                                            Composer composer3 = (Composer) obj10;
                                                            int intValue3 = ((Integer) obj11).intValue();
                                                            function0.getClass();
                                                            if ((intValue3 & 6) == 0) {
                                                                intValue3 |= ((GapComposer) composer3).changedInstance(function0) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                                boolean changedInstance2 = gapComposer3.changedInstance(button2);
                                                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                                                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                                                                    rememberedValue4 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i11 = i10;
                                                                            ItemAccessory.Button button3 = button2;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                                                }
                                                                SizeKt.ButtonCompact(function0, TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4), "actionButton_" + button2.text), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1801903075, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i11 = i10;
                                                                        ItemAccessory.Button button3 = button2;
                                                                        switch (i11) {
                                                                            case 0:
                                                                                Composer composer4 = (Composer) obj13;
                                                                                int intValue4 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                                                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer4.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer4.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer4, 48, 12);
                                                                                    }
                                                                                    gapComposer4.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer4.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer3), gapComposer3, (intValue3 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer3.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Function0 function02 = (Function0) obj9;
                                                            Composer composer4 = (Composer) obj10;
                                                            int intValue4 = ((Integer) obj11).intValue();
                                                            function02.getClass();
                                                            if ((intValue4 & 6) == 0) {
                                                                intValue4 |= ((GapComposer) composer4).changedInstance(function02) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                                            if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                                boolean changedInstance3 = gapComposer4.changedInstance(button2);
                                                                Object rememberedValue5 = gapComposer4.rememberedValue();
                                                                if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                                                                    final char c3 = c == true ? 1 : 0;
                                                                    rememberedValue5 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i11 = c3;
                                                                            ItemAccessory.Button button3 = button2;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer4.updateRememberedValue(rememberedValue5);
                                                                }
                                                                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue5), "actionButton_" + button2.text);
                                                                final char c4 = c2 == true ? 1 : 0;
                                                                SizeKt.ButtonCompact(function02, testTag, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(226828779, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i11 = c4;
                                                                        ItemAccessory.Button button3 = button2;
                                                                        switch (i11) {
                                                                            case 0:
                                                                                Composer composer42 = (Composer) obj13;
                                                                                int intValue42 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer42 = (GapComposer) composer42;
                                                                                if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer42.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer42.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer42, 48, 12);
                                                                                    }
                                                                                    gapComposer42.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer42.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer4), gapComposer4, (intValue4 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer4.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, 1389043493));
                                        default:
                                            ((RealCompactActivityAccessoryButtonScope) obj8).getClass();
                                            final ItemAccessory.Button button2 = (ItemAccessory.Button) itemAccessory2;
                                            switch (CompactCellActivityKt.WhenMappings.$EnumSwitchMapping$1[button2.prominence.ordinal()]) {
                                                case 1:
                                                case 2:
                                                    buttonProminence2 = ButtonProminence.STANDARD;
                                                    break;
                                                case 3:
                                                case 4:
                                                    buttonProminence2 = ButtonProminence.PROMINENT;
                                                    break;
                                                case 5:
                                                case 6:
                                                    buttonProminence2 = ButtonProminence.SUBTLE;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            return new CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda25
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                    int i9 = i7;
                                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                    final ItemAccessory.Button button22 = button2;
                                                    char c = 1;
                                                    char c2 = 1;
                                                    final int i10 = 0;
                                                    switch (i9) {
                                                        case 0:
                                                            Function0 function0 = (Function0) obj9;
                                                            Composer composer3 = (Composer) obj10;
                                                            int intValue3 = ((Integer) obj11).intValue();
                                                            function0.getClass();
                                                            if ((intValue3 & 6) == 0) {
                                                                intValue3 |= ((GapComposer) composer3).changedInstance(function0) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer3 = (GapComposer) composer3;
                                                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                                boolean changedInstance2 = gapComposer3.changedInstance(button22);
                                                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                                                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                                                                    rememberedValue4 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i11 = i10;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                                                }
                                                                SizeKt.ButtonCompact(function0, TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4), "actionButton_" + button22.text), buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-1801903075, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i11 = i10;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i11) {
                                                                            case 0:
                                                                                Composer composer42 = (Composer) obj13;
                                                                                int intValue42 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer42 = (GapComposer) composer42;
                                                                                if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer42.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer42.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer42, 48, 12);
                                                                                    }
                                                                                    gapComposer42.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer42.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer3), gapComposer3, (intValue3 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer3.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Function0 function02 = (Function0) obj9;
                                                            Composer composer4 = (Composer) obj10;
                                                            int intValue4 = ((Integer) obj11).intValue();
                                                            function02.getClass();
                                                            if ((intValue4 & 6) == 0) {
                                                                intValue4 |= ((GapComposer) composer4).changedInstance(function02) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer4 = (GapComposer) composer4;
                                                            if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                                                                boolean changedInstance3 = gapComposer4.changedInstance(button22);
                                                                Object rememberedValue5 = gapComposer4.rememberedValue();
                                                                if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                                                                    final int c3 = c == true ? 1 : 0;
                                                                    rememberedValue5 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i11 = c3;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer4.updateRememberedValue(rememberedValue5);
                                                                }
                                                                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue5), "actionButton_" + button22.text);
                                                                final int c4 = c2 == true ? 1 : 0;
                                                                SizeKt.ButtonCompact(function02, testTag, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(226828779, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i11 = c4;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i11) {
                                                                            case 0:
                                                                                Composer composer42 = (Composer) obj13;
                                                                                int intValue42 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer42 = (GapComposer) composer42;
                                                                                if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer42.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer42.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer42, 48, 12);
                                                                                    }
                                                                                    gapComposer42.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer42.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer4), gapComposer4, (intValue4 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer4.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, -1587187229));
                                    }
                                }
                            };
                            gapComposer2.updateRememberedValue(obj7);
                            obj6 = obj7;
                        }
                        realCellActivityAccessoryScope.button(balanceFeedKt$$ExternalSyntheticLambda42, (Function1) obj6);
                        gapComposer2.end(false);
                    } else if (itemAccessory instanceof ItemAccessory.Progress) {
                        gapComposer2.startReplaceGroup(1550748587);
                        gapComposer2.end(false);
                        realCellActivityAccessoryScope.custom(ComposableSingletons$ActivityItemViewKt.f125lambda$1683885020);
                    } else if (itemAccessory instanceof ItemAccessory.PortraitImage) {
                        gapComposer2.startReplaceGroup(1550907369);
                        ItemAccessory.PortraitImage portraitImage = (ItemAccessory.PortraitImage) itemAccessory;
                        boolean changed3 = gapComposer2.changed(function1);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        Object obj8 = rememberedValue4;
                        if (changed3 || rememberedValue4 == obj4) {
                            Object balanceFeedKt$$ExternalSyntheticLambda43 = new BalanceFeedKt$$ExternalSyntheticLambda4(11, function1);
                            gapComposer2.updateRememberedValue(balanceFeedKt$$ExternalSyntheticLambda43);
                            obj8 = balanceFeedKt$$ExternalSyntheticLambda43;
                        }
                        ActivityItemViewKt.ImageButtonAccessory(realCellActivityAccessoryScope, portraitImage, (Function0) obj8, null, gapComposer2, intValue2 & 14);
                        gapComposer2.end(false);
                    } else {
                        if (itemAccessory != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -919832649, false);
                        }
                        gapComposer2.startReplaceGroup(1551099352);
                        gapComposer2.end(false);
                        realCellActivityAccessoryScope.custom(ComposableSingletons$ActivityItemViewKt.lambda$904952674);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                RealCompactActivityAvatarScope realCompactActivityAvatarScope = (RealCompactActivityAvatarScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                realCompactActivityAvatarScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(realCompactActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    StackedAvatarViewModel stackedAvatarViewModel2 = activityItemViewModel.avatar;
                    if (stackedAvatarViewModel2 instanceof StackedAvatarViewModel.Single) {
                        gapComposer3.startReplaceGroup(923998226);
                        AvatarBadgeViewModel avatarBadgeViewModel2 = activityItemViewModel.avatarBadge;
                        if (avatarBadgeViewModel2 == null) {
                            StackedAvatarViewModel.Avatar avatar = ((StackedAvatarViewModel.Single) stackedAvatarViewModel2).avatar;
                            avatarBadgeViewModel2 = avatar.isSponsorAllowlisted ? new AvatarBadgeViewModel.IconToken(Icons.SecurityCheckFill24) : avatar.isFavorite ? new AvatarBadgeViewModel.IconToken(Icons.FavoriteFill24) : null;
                        }
                        AvatarEntry m3382copyDuSw1wk$default = AvatarEntry.m3382copyDuSw1wk$default(com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(((StackedAvatarViewModel.Single) stackedAvatarViewModel2).avatar, null, null, gapComposer3, 8, 3), 0L, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                        boolean changed4 = gapComposer3.changed(function1);
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue5 == obj4) {
                            rememberedValue5 = new ReceiptUiKt$$ExternalSyntheticLambda3(1, function1);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        }
                        realCompactActivityAvatarScope.Avatar(m3382copyDuSw1wk$default, avatarBadgeViewModel2, (Function0) rememberedValue5, gapComposer3, (intValue3 << 9) & 7168);
                        gapComposer3.end(false);
                    } else if (stackedAvatarViewModel2 instanceof StackedAvatarViewModel.Duo) {
                        gapComposer3.startReplaceGroup(924321897);
                        StackedAvatarViewModel.Duo duo = (StackedAvatarViewModel.Duo) stackedAvatarViewModel2;
                        AvatarEntry avatarEntry = com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(duo.backAvatar, null, null, gapComposer3, 8, 3);
                        AvatarEntry avatarEntry2 = com.squareup.cash.arcade.util.AvatarsKt.toAvatarEntry(duo.frontAvatar, null, null, gapComposer3, 8, 3);
                        boolean changed5 = gapComposer3.changed(function1);
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (changed5 || rememberedValue6 == obj4) {
                            rememberedValue6 = new ReceiptUiKt$$ExternalSyntheticLambda3(2, function1);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        realCompactActivityAvatarScope.DiagonalStackedAvatars(avatarEntry, avatarEntry2, (Function0) rememberedValue6, gapComposer3, (intValue3 << 9) & 7168);
                        gapComposer3.end(false);
                    } else {
                        if (!(stackedAvatarViewModel2 instanceof StackedAvatarViewModel.Trio)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1830919505, false);
                        }
                        gapComposer3.startReplaceGroup(924617637);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                RealCompactActivityAccessoryScope realCompactActivityAccessoryScope = (RealCompactActivityAccessoryScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                realCompactActivityAccessoryScope.getClass();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = realCompactActivityAccessoryScope.accessoryContent$delegate;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = realCompactActivityAccessoryScope.type$delegate;
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(realCompactActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    final ItemAccessory itemAccessory2 = activityItemViewModel.accessory;
                    if (itemAccessory2 instanceof ItemAccessory.Amount) {
                        gapComposer4.startReplaceGroup(-1080570080);
                        int i6 = CompactCellActivityKt.WhenMappings.$EnumSwitchMapping$0[((ItemAccessory.Amount) itemAccessory2).treatment.ordinal()];
                        if (i6 == 1) {
                            gapComposer4.startReplaceGroup(1489165379);
                            final int i7 = 9;
                            realCompactActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(244853561, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj52, Object obj62) {
                                    int i62 = i7;
                                    ItemAccessory itemAccessory22 = itemAccessory2;
                                    switch (i62) {
                                        case 0:
                                            Composer composer32 = (Composer) obj52;
                                            int intValue32 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer32.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer42 = (Composer) obj52;
                                            int intValue42 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                            if (gapComposer42.shouldExecute(1 & intValue42, (intValue42 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors = (Colors) gapComposer42.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer42, -1762997026, gapComposer42, false);
                                                } else {
                                                    gapComposer42.startReplaceGroup(-1762997739);
                                                    gapComposer42.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer42.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj52;
                                            int intValue5 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj52;
                                            int intValue6 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj52;
                                            int intValue7 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj52;
                                            int intValue8 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj52;
                                            int intValue9 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj52;
                                            int intValue10 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj52;
                                            int intValue11 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj52;
                                            int intValue12 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4));
                            gapComposer4.end(false);
                        } else if (i6 == 2) {
                            gapComposer4.startReplaceGroup(1489168245);
                            final int i8 = 5;
                            realCompactActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(-994603294, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj52, Object obj62) {
                                    int i62 = i8;
                                    ItemAccessory itemAccessory22 = itemAccessory2;
                                    switch (i62) {
                                        case 0:
                                            Composer composer32 = (Composer) obj52;
                                            int intValue32 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer32.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer42 = (Composer) obj52;
                                            int intValue42 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                            if (gapComposer42.shouldExecute(1 & intValue42, (intValue42 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors = (Colors) gapComposer42.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer42, -1762997026, gapComposer42, false);
                                                } else {
                                                    gapComposer42.startReplaceGroup(-1762997739);
                                                    gapComposer42.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer42.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj52;
                                            int intValue5 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj52;
                                            int intValue6 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj52;
                                            int intValue7 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj52;
                                            int intValue8 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj52;
                                            int intValue9 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj52;
                                            int intValue10 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj52;
                                            int intValue11 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj52;
                                            int intValue12 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4));
                            gapComposer4.end(false);
                        } else if (i6 == 3) {
                            gapComposer4.startReplaceGroup(1489172042);
                            final int i9 = 6;
                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(792122048, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj52, Object obj62) {
                                    int i62 = i9;
                                    ItemAccessory itemAccessory22 = itemAccessory2;
                                    switch (i62) {
                                        case 0:
                                            Composer composer32 = (Composer) obj52;
                                            int intValue32 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer32.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer42 = (Composer) obj52;
                                            int intValue42 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                            if (gapComposer42.shouldExecute(1 & intValue42, (intValue42 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors = (Colors) gapComposer42.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer42, -1762997026, gapComposer42, false);
                                                } else {
                                                    gapComposer42.startReplaceGroup(-1762997739);
                                                    gapComposer42.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer42.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj52;
                                            int intValue5 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj52;
                                            int intValue6 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj52;
                                            int intValue7 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj52;
                                            int intValue8 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj52;
                                            int intValue9 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj52;
                                            int intValue10 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj52;
                                            int intValue11 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj52;
                                            int intValue12 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4);
                            parcelableSnapshotMutableState3.setValue(RealCompactActivityAccessoryScope.Type.AMOUNT);
                            parcelableSnapshotMutableState2.setValue(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(rememberComposableLambda3, 12), true, -1016808050));
                            gapComposer4.end(false);
                        } else {
                            if (i6 != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1489163554, false);
                            }
                            gapComposer4.startReplaceGroup(1489174764);
                            final int i10 = 7;
                            ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(1109601706, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj52, Object obj62) {
                                    int i62 = i10;
                                    ItemAccessory itemAccessory22 = itemAccessory2;
                                    switch (i62) {
                                        case 0:
                                            Composer composer32 = (Composer) obj52;
                                            int intValue32 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer32.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            Composer composer42 = (Composer) obj52;
                                            int intValue42 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                            if (gapComposer42.shouldExecute(1 & intValue42, (intValue42 & 3) != 2)) {
                                                String str = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors = (Colors) gapComposer42.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer42, -1762997026, gapComposer42, false);
                                                } else {
                                                    gapComposer42.startReplaceGroup(-1762997739);
                                                    gapComposer42.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer42.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            Composer composer5 = (Composer) obj52;
                                            int intValue5 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer5;
                                            if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            Composer composer6 = (Composer) obj52;
                                            int intValue6 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer6 = (GapComposer) composer6;
                                            if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            Composer composer7 = (Composer) obj52;
                                            int intValue7 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer7 = (GapComposer) composer7;
                                            if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer7, 0);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            Composer composer8 = (Composer) obj52;
                                            int intValue8 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer8 = (GapComposer) composer8;
                                            if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                                String str2 = ((ItemAccessory.Amount) itemAccessory22).text;
                                                Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1762997739);
                                                    gapComposer8.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            Composer composer9 = (Composer) obj52;
                                            int intValue9 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer9 = (GapComposer) composer9;
                                            if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            Composer composer10 = (Composer) obj52;
                                            int intValue10 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer10 = (GapComposer) composer10;
                                            if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                        case 8:
                                            Composer composer11 = (Composer) obj52;
                                            int intValue11 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer11 = (GapComposer) composer11;
                                            if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                                ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer11, 0);
                                            } else {
                                                gapComposer11.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            Composer composer12 = (Composer) obj52;
                                            int intValue12 = ((Integer) obj62).intValue();
                                            GapComposer gapComposer12 = (GapComposer) composer12;
                                            if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                            } else {
                                                gapComposer12.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer4);
                            parcelableSnapshotMutableState3.setValue(RealCompactActivityAccessoryScope.Type.AMOUNT);
                            parcelableSnapshotMutableState2.setValue(new ComposableLambdaImpl(new AppBarKt$$ExternalSyntheticLambda4(rememberComposableLambda4, 11), true, 2103074777));
                            gapComposer4.end(false);
                        }
                        gapComposer4.end(false);
                    } else if (itemAccessory2 instanceof ItemAccessory.DualAmounts) {
                        gapComposer4.startReplaceGroup(1489177768);
                        final int i11 = 8;
                        realCompactActivityAccessoryScope.amount(Expect_jvmKt.rememberComposableLambda(-88107926, new Function2() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj52, Object obj62) {
                                int i62 = i11;
                                ItemAccessory itemAccessory22 = itemAccessory2;
                                switch (i62) {
                                    case 0:
                                        Composer composer32 = (Composer) obj52;
                                        int intValue32 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer32 = (GapComposer) composer32;
                                        if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer32.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer42 = (Composer) obj52;
                                        int intValue42 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer42 = (GapComposer) composer42;
                                        if (gapComposer42.shouldExecute(1 & intValue42, (intValue42 & 3) != 2)) {
                                            String str = ((ItemAccessory.Amount) itemAccessory22).text;
                                            Colors colors = (Colors) gapComposer42.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer42, -1762997026, gapComposer42, false);
                                            } else {
                                                gapComposer42.startReplaceGroup(-1762997739);
                                                gapComposer42.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.success, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer42.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        Composer composer5 = (Composer) obj52;
                                        int intValue5 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        Composer composer6 = (Composer) obj52;
                                        int intValue6 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        Composer composer7 = (Composer) obj52;
                                        int intValue7 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer7 = (GapComposer) composer7;
                                        if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                                            ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer7, 0);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        Composer composer8 = (Composer) obj52;
                                        int intValue8 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer8 = (GapComposer) composer8;
                                        if (gapComposer8.shouldExecute(1 & intValue8, (intValue8 & 3) != 2)) {
                                            String str2 = ((ItemAccessory.Amount) itemAccessory22).text;
                                            Colors colors2 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1762997739);
                                                gapComposer8.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.success, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        Composer composer9 = (Composer) obj52;
                                        int intValue9 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer9 = (GapComposer) composer9;
                                        if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        Composer composer10 = (Composer) obj52;
                                        int intValue10 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                    case 8:
                                        Composer composer11 = (Composer) obj52;
                                        int intValue11 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer11 = (GapComposer) composer11;
                                        if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                                            ActivityItemViewKt.StackedAmounts((ItemAccessory.DualAmounts) itemAccessory22, gapComposer11, 0);
                                        } else {
                                            gapComposer11.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer12 = (Composer) obj52;
                                        int intValue12 = ((Integer) obj62).intValue();
                                        GapComposer gapComposer12 = (GapComposer) composer12;
                                        if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((ItemAccessory.Amount) itemAccessory22).text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer12.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4));
                        gapComposer4.end(false);
                    } else if (itemAccessory2 instanceof ItemAccessory.Button) {
                        gapComposer4.startReplaceGroup(-1080053589);
                        boolean changed6 = gapComposer4.changed(function1);
                        Object rememberedValue7 = gapComposer4.rememberedValue();
                        Object obj9 = rememberedValue7;
                        if (changed6 || rememberedValue7 == obj4) {
                            Object balanceFeedKt$$ExternalSyntheticLambda44 = new BalanceFeedKt$$ExternalSyntheticLambda4(27, function1);
                            gapComposer4.updateRememberedValue(balanceFeedKt$$ExternalSyntheticLambda44);
                            obj9 = balanceFeedKt$$ExternalSyntheticLambda44;
                        }
                        Function0 function0 = (Function0) obj9;
                        boolean changedInstance2 = gapComposer4.changedInstance(itemAccessory2);
                        Object rememberedValue8 = gapComposer4.rememberedValue();
                        Object obj10 = rememberedValue8;
                        if (changedInstance2 || rememberedValue8 == obj4) {
                            Object obj11 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj82) {
                                    final ButtonProminence buttonProminence;
                                    final ButtonProminence buttonProminence2;
                                    int i62 = i4;
                                    ItemAccessory itemAccessory22 = itemAccessory2;
                                    final int i72 = 1;
                                    switch (i62) {
                                        case 0:
                                            ((RealCellActivityAccessoryButtonScope) obj82).getClass();
                                            final ItemAccessory.Button button = (ItemAccessory.Button) itemAccessory22;
                                            switch (ActivityItemViewKt.WhenMappings.$EnumSwitchMapping$2[button.prominence.ordinal()]) {
                                                case 1:
                                                case 2:
                                                    buttonProminence = ButtonProminence.STANDARD;
                                                    break;
                                                case 3:
                                                case 4:
                                                    buttonProminence = ButtonProminence.PROMINENT;
                                                    break;
                                                case 5:
                                                case 6:
                                                    buttonProminence = ButtonProminence.SUBTLE;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            final int i82 = 0;
                                            return new CellActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda25
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj92, Object obj102, Object obj112) {
                                                    int i92 = i82;
                                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                    final ItemAccessory.Button button22 = button;
                                                    char c = 1;
                                                    char c2 = 1;
                                                    final int i102 = 0;
                                                    switch (i92) {
                                                        case 0:
                                                            Function0 function02 = (Function0) obj92;
                                                            Composer composer32 = (Composer) obj102;
                                                            int intValue32 = ((Integer) obj112).intValue();
                                                            function02.getClass();
                                                            if ((intValue32 & 6) == 0) {
                                                                intValue32 |= ((GapComposer) composer32).changedInstance(function02) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 19) != 18)) {
                                                                boolean changedInstance22 = gapComposer32.changedInstance(button22);
                                                                Object rememberedValue42 = gapComposer32.rememberedValue();
                                                                if (changedInstance22 || rememberedValue42 == neverEqualPolicy) {
                                                                    rememberedValue42 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i112 = i102;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i112) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer32.updateRememberedValue(rememberedValue42);
                                                                }
                                                                SizeKt.ButtonCompact(function02, TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue42), "actionButton_" + button22.text), buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1801903075, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i112 = i102;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i112) {
                                                                            case 0:
                                                                                Composer composer42 = (Composer) obj13;
                                                                                int intValue42 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer42 = (GapComposer) composer42;
                                                                                if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer42.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer42.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer42, 48, 12);
                                                                                    }
                                                                                    gapComposer42.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer42.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer32), gapComposer32, (intValue32 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer32.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Function0 function022 = (Function0) obj92;
                                                            Composer composer42 = (Composer) obj102;
                                                            int intValue42 = ((Integer) obj112).intValue();
                                                            function022.getClass();
                                                            if ((intValue42 & 6) == 0) {
                                                                intValue42 |= ((GapComposer) composer42).changedInstance(function022) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                                            if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 19) != 18)) {
                                                                boolean changedInstance3 = gapComposer42.changedInstance(button22);
                                                                Object rememberedValue52 = gapComposer42.rememberedValue();
                                                                if (changedInstance3 || rememberedValue52 == neverEqualPolicy) {
                                                                    final int c3 = c == true ? 1 : 0;
                                                                    rememberedValue52 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i112 = c3;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i112) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer42.updateRememberedValue(rememberedValue52);
                                                                }
                                                                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue52), "actionButton_" + button22.text);
                                                                final int c4 = c2 == true ? 1 : 0;
                                                                SizeKt.ButtonCompact(function022, testTag, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(226828779, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i112 = c4;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i112) {
                                                                            case 0:
                                                                                Composer composer422 = (Composer) obj13;
                                                                                int intValue422 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer422 = (GapComposer) composer422;
                                                                                if (gapComposer422.shouldExecute(intValue422 & 1, (intValue422 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer422.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer422.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer422, 48, 12);
                                                                                    }
                                                                                    gapComposer422.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer422, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer422.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer42), gapComposer42, (intValue42 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer42.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, 1389043493));
                                        default:
                                            ((RealCompactActivityAccessoryButtonScope) obj82).getClass();
                                            final ItemAccessory.Button button2 = (ItemAccessory.Button) itemAccessory22;
                                            switch (CompactCellActivityKt.WhenMappings.$EnumSwitchMapping$1[button2.prominence.ordinal()]) {
                                                case 1:
                                                case 2:
                                                    buttonProminence2 = ButtonProminence.STANDARD;
                                                    break;
                                                case 3:
                                                case 4:
                                                    buttonProminence2 = ButtonProminence.PROMINENT;
                                                    break;
                                                case 5:
                                                case 6:
                                                    buttonProminence2 = ButtonProminence.SUBTLE;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            return new CompactActivityAccessoryScope$AccessoryButtonScope$AccessoryButton(new ComposableLambdaImpl(new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda25
                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj92, Object obj102, Object obj112) {
                                                    int i92 = i72;
                                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                                    final ItemAccessory.Button button22 = button2;
                                                    char c = 1;
                                                    char c2 = 1;
                                                    final int i102 = 0;
                                                    switch (i92) {
                                                        case 0:
                                                            Function0 function02 = (Function0) obj92;
                                                            Composer composer32 = (Composer) obj102;
                                                            int intValue32 = ((Integer) obj112).intValue();
                                                            function02.getClass();
                                                            if ((intValue32 & 6) == 0) {
                                                                intValue32 |= ((GapComposer) composer32).changedInstance(function02) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer32 = (GapComposer) composer32;
                                                            if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 19) != 18)) {
                                                                boolean changedInstance22 = gapComposer32.changedInstance(button22);
                                                                Object rememberedValue42 = gapComposer32.rememberedValue();
                                                                if (changedInstance22 || rememberedValue42 == neverEqualPolicy) {
                                                                    rememberedValue42 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i112 = i102;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i112) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer32.updateRememberedValue(rememberedValue42);
                                                                }
                                                                SizeKt.ButtonCompact(function02, TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue42), "actionButton_" + button22.text), buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-1801903075, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i112 = i102;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i112) {
                                                                            case 0:
                                                                                Composer composer422 = (Composer) obj13;
                                                                                int intValue422 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer422 = (GapComposer) composer422;
                                                                                if (gapComposer422.shouldExecute(intValue422 & 1, (intValue422 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer422.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer422.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer422, 48, 12);
                                                                                    }
                                                                                    gapComposer422.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer422, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer422.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer32), gapComposer32, (intValue32 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer32.skipToGroupEnd();
                                                            }
                                                            break;
                                                        default:
                                                            Function0 function022 = (Function0) obj92;
                                                            Composer composer42 = (Composer) obj102;
                                                            int intValue42 = ((Integer) obj112).intValue();
                                                            function022.getClass();
                                                            if ((intValue42 & 6) == 0) {
                                                                intValue42 |= ((GapComposer) composer42).changedInstance(function022) ? 4 : 2;
                                                            }
                                                            GapComposer gapComposer42 = (GapComposer) composer42;
                                                            if (gapComposer42.shouldExecute(intValue42 & 1, (intValue42 & 19) != 18)) {
                                                                boolean changedInstance3 = gapComposer42.changedInstance(button22);
                                                                Object rememberedValue52 = gapComposer42.rememberedValue();
                                                                if (changedInstance3 || rememberedValue52 == neverEqualPolicy) {
                                                                    final int c3 = c == true ? 1 : 0;
                                                                    rememberedValue52 = new Function1() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda26
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj12) {
                                                                            int i112 = c3;
                                                                            ItemAccessory.Button button3 = button22;
                                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj12;
                                                                            switch (i112) {
                                                                                case 0:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str = button3.accessibilityText;
                                                                                    if (str != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    semanticsPropertyReceiver.getClass();
                                                                                    String str2 = button3.accessibilityText;
                                                                                    if (str2 != null) {
                                                                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            return Unit.INSTANCE;
                                                                        }
                                                                    };
                                                                    gapComposer42.updateRememberedValue(rememberedValue52);
                                                                }
                                                                Modifier testTag = TestTagKt.testTag(SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue52), "actionButton_" + button22.text);
                                                                final int c4 = c2 == true ? 1 : 0;
                                                                SizeKt.ButtonCompact(function022, testTag, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(226828779, new Function3() { // from class: com.squareup.cash.activity.views.ActivityItemViewKt$$ExternalSyntheticLambda27
                                                                    @Override // kotlin.jvm.functions.Function3
                                                                    public final Object invoke(Object obj12, Object obj13, Object obj14) {
                                                                        int i112 = c4;
                                                                        ItemAccessory.Button button3 = button22;
                                                                        switch (i112) {
                                                                            case 0:
                                                                                Composer composer422 = (Composer) obj13;
                                                                                int intValue422 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer422 = (GapComposer) composer422;
                                                                                if (gapComposer422.shouldExecute(intValue422 & 1, (intValue422 & 17) != 16)) {
                                                                                    Icons icons = button3.icon;
                                                                                    if (icons == null) {
                                                                                        gapComposer422.startReplaceGroup(-1993216558);
                                                                                    } else {
                                                                                        gapComposer422.startReplaceGroup(-1993216557);
                                                                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer422, 48, 12);
                                                                                    }
                                                                                    gapComposer422.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer422, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer422.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                            default:
                                                                                Composer composer5 = (Composer) obj13;
                                                                                int intValue5 = ((Integer) obj14).intValue();
                                                                                ((RowScope) obj12).getClass();
                                                                                GapComposer gapComposer5 = (GapComposer) composer5;
                                                                                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                    Icons icons2 = button3.icon;
                                                                                    if (icons2 == null) {
                                                                                        gapComposer5.startReplaceGroup(1472623940);
                                                                                    } else {
                                                                                        gapComposer5.startReplaceGroup(1472623941);
                                                                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                                                                    }
                                                                                    gapComposer5.end(false);
                                                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button3.text, (Map) null, (Function1) null, false);
                                                                                } else {
                                                                                    gapComposer5.skipToGroupEnd();
                                                                                }
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, gapComposer42), gapComposer42, (intValue42 & 14) | 1572864, 56);
                                                            } else {
                                                                gapComposer42.skipToGroupEnd();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, -1587187229));
                                    }
                                }
                            };
                            gapComposer4.updateRememberedValue(obj11);
                            obj10 = obj11;
                        }
                        Function1 function12 = (Function1) obj10;
                        function0.getClass();
                        function12.getClass();
                        parcelableSnapshotMutableState3.setValue(RealCompactActivityAccessoryScope.Type.BUTTON);
                        parcelableSnapshotMutableState2.setValue(new ComposableLambdaImpl(new OpenSessionByIdDialogKt$$ExternalSyntheticLambda1(function12, function0, 1, (byte) 0), true, -497601775));
                        gapComposer4.end(false);
                    } else if (itemAccessory2 instanceof ItemAccessory.Progress) {
                        gapComposer4.startReplaceGroup(-1079870286);
                        gapComposer4.end(false);
                        parcelableSnapshotMutableState3.setValue(RealCompactActivityAccessoryScope.Type.CUSTOM);
                        parcelableSnapshotMutableState2.setValue(CompactActivityScopesKt.f128lambda$313147839);
                    } else if (itemAccessory2 instanceof ItemAccessory.PortraitImage) {
                        gapComposer4.startReplaceGroup(-1079717580);
                        ItemAccessory.PortraitImage portraitImage2 = (ItemAccessory.PortraitImage) itemAccessory2;
                        boolean changed7 = gapComposer4.changed(function1);
                        Object rememberedValue9 = gapComposer4.rememberedValue();
                        Object obj12 = rememberedValue9;
                        if (changed7 || rememberedValue9 == obj4) {
                            Object balanceFeedKt$$ExternalSyntheticLambda45 = new BalanceFeedKt$$ExternalSyntheticLambda4(28, function1);
                            gapComposer4.updateRememberedValue(balanceFeedKt$$ExternalSyntheticLambda45);
                            obj12 = balanceFeedKt$$ExternalSyntheticLambda45;
                        }
                        CompactCellActivityKt.PortraitImageAccessory(realCompactActivityAccessoryScope, portraitImage2, (Function0) obj12, gapComposer4, intValue4 & 14);
                        gapComposer4.end(false);
                    } else {
                        if (itemAccessory2 != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1489161568, false);
                        }
                        gapComposer4.startReplaceGroup(-1079535393);
                        gapComposer4.end(false);
                        parcelableSnapshotMutableState3.setValue(RealCompactActivityAccessoryScope.Type.CUSTOM);
                        parcelableSnapshotMutableState2.setValue(CompactActivityScopesKt.f126lambda$1446971905);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
