package com.squareup.cash.pools.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import androidx.room.TransactorKt;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes7.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda18 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Function0 f$3;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda18(boolean z, Function0 function0, boolean z2, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = z2;
        this.f$3 = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        boolean z2 = this.f$2;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    if (z) {
                        gapComposer.startReplaceGroup(1144376309);
                        TransactorKt.IconAction(titleBarActionScope, Icons.ShareAndroid24, Room.stringResource(gapComposer, R.string.pools_share_description), this.f$1, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1144550250);
                        gapComposer.end(false);
                    }
                    if (z2) {
                        gapComposer.startReplaceGroup(1144599602);
                        TransactorKt.IconAction(titleBarActionScope, Icons.NavigationMore, Room.stringResource(gapComposer, R.string.pools_more_options_content_description), this.f$3, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1144784362);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean z3 = !z;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SizeKt.ButtonCta(this.f$1, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), buttonProminence, false, z3, null, DisclaimerTextKt.f765lambda$704102759, gapComposer2, 1573296, 40);
                    if (z2) {
                        gapComposer2.startReplaceGroup(634219821);
                        SizeKt.ButtonCta(this.f$3, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, z3, null, DisclaimerTextKt.f770lambda$960332642, gapComposer2, 1573296, 40);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(634495876);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean z4 = this.f$2;
                    SellerCardKt.DisabledClickableButtonCta(z && !z4, R.string.work_views_clock_in_button, this.f$1, null, null, z4, this.f$3, null, gapComposer3, 0, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    boolean z5 = this.f$0;
                    SellerCardKt.DisabledClickableButtonCta(!z5 && z2, R.string.work_views_end_break_button, this.f$1, null, null, z5, this.f$3, null, gapComposer4, 0, EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda18(boolean z, boolean z2, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$2 = z2;
        this.f$1 = function0;
        this.f$3 = function02;
    }
}
