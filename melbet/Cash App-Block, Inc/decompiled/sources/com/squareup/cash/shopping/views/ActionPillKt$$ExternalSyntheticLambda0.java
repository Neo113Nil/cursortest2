package com.squareup.cash.shopping.views;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class ActionPillKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ ActionPillKt$$ExternalSyntheticLambda0(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                pair.getClass();
                String str2 = (String) pair.first;
                PillStage pillStage = (PillStage) pair.second;
                boolean z = pillStage instanceof PillStage.Error;
                Function0 function0 = this.f$0;
                if (z) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(-894871738);
                    SizeKt.ButtonCompact(function0, TestTagKt.testTag(companion, "WebNavigationFooterPill"), null, true, false, null, Expect_jvmKt.rememberComposableLambda(1965305593, new SheetKt$$ExternalSyntheticLambda8(str2, 28), gapComposer), gapComposer, 1575984, 52);
                    gapComposer.end(false);
                } else {
                    int i2 = 29;
                    if (pillStage instanceof PillStage.SUPPillStage.SetUpPlan) {
                        GapComposer gapComposer2 = (GapComposer) composer;
                        gapComposer2.startReplaceGroup(-894430143);
                        SizeKt.ButtonCompact(function0, TestTagKt.testTag(companion, "WebNavigationFooterPill"), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(-1674578590, new SheetKt$$ExternalSyntheticLambda8(str2, i2), gapComposer2), gapComposer2, 1573296, 56);
                        gapComposer2.end(false);
                    } else {
                        GapComposer gapComposer3 = (GapComposer) composer;
                        gapComposer3.startReplaceGroup(-893981883);
                        SizeKt.ButtonCompact(function0, TestTagKt.testTag(companion, "WebNavigationFooterPill"), null, false, false, null, Expect_jvmKt.rememberComposableLambda(1761416322, new ShareSheetViewKt$$ExternalSyntheticLambda1(i2, str2, pillStage), gapComposer3), gapComposer3, 1572912, 60);
                        gapComposer3.end(false);
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                StorageUtil.ButtonIcon(Icons.NavigationScanQr, Room.stringResource(composer2, R.string.scan_qr_code_button_content_description), this.f$0, SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2), false, null, composer2, 3078, 48);
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    SizeKt.ButtonCta(this.f$0, null, null, false, false, null, PoolToastKt.lambda$866817632, gapComposer4, 1572864, 62);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 3:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer4).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    modalButtonScope.PrimaryModalButton(this.f$0, null, false, ChannelListViewKt.f607lambda$2050448896, gapComposer5, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 4:
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer5).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    modalButtonScope2.SecondaryModalButton(this.f$0, null, false, ChannelListViewKt.f605lambda$1733172301, gapComposer6, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Function0 function02 = this.f$0;
                    if (function02 != null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer7, -942090099, R.string.apcac_toggle_info_icon_click_label, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-942009468);
                        gapComposer7.end(false);
                        str = null;
                    }
                    String str3 = str;
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = androidx.compose.foundation.layout.SizeKt.fillMaxSize(modifier, 1.0f);
                    if (function02 != null) {
                        modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, str3, new Role(0), function02, 9);
                    }
                    Modifier then = fillMaxSize.then(modifier);
                    Icons icons = Icons.InformationFill16;
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, str3, then, colors.semantic.icon.extraSubtle, gapComposer7, 6, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 6:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                int intValue5 = ((Number) this.f$0.invoke()).intValue();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(((Constraints) obj3).value, 0, 0, intValue5, intValue5, 3));
                break;
            case 7:
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    DBUtil.TitleBarSub((String) null, NavigationType.CLOSE, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer8, 54, 108);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    DBUtil.TitleBarSub((String) null, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer9, 54, 108);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    DBUtil.TitleBarSub(Room.stringResource(gapComposer10, R.string.work_views_declare_cash_tips), NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, this.f$0, (Modifier) null, (Function3) null, gapComposer10, 48, 108);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 10:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer10).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    TransactorKt.IconAction(titleBarActionScope, Icons.NavigationFilter, Room.stringResource(gapComposer11, R.string.work_views_shift_list_filter_action_label), this.f$0, null, null, null, null, null, null, false, gapComposer11, (intValue9 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 11:
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer11).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    modalButtonScope3.PrimaryModalButtonDestructive((57344 & (intValue10 << 12)) | 3072, 6, gapComposer12, ShiftListViewKt.f784lambda$1930688450, null, this.f$0, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            default:
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer12).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    modalButtonScope4.SecondaryModalButton(this.f$0, null, false, ShiftListViewKt.f787lambda$622504687, gapComposer13, ((intValue11 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
