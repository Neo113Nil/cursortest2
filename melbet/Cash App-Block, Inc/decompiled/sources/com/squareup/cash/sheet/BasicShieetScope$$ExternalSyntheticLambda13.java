package com.squareup.cash.sheet;

import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.arcade.components.avatar.AvatarSizeImpl;
import com.squareup.cash.common.moneyformatter.MoneyKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownBlock;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.marketing.components.ArrowOrientation;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.taptopay.views.TapToPayKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class BasicShieetScope$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(long j, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 9;
        this.f$1 = j;
        this.f$2 = modifier;
        this.f$0 = function0;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$0;
        Object obj4 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((BasicShieetScope) obj3).m3745Dimmer3JVO9M(Updater.updateChangedFlags(1 | i2), this.f$1, (Composer) obj, (Modifier) obj4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(3121);
                ((DatePickerDefaults) obj3).m523DatePickerTitleFNtVw6o(this.f$3, updateChangedFlags, this.f$1, (Composer) obj, (Modifier) obj4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.m1300CheckoutCartItemRowFNF3uiM((LocalCartSummaryLineViewModel) obj3, (Modifier) obj4, this.f$1, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 3:
                ((Integer) obj2).intValue();
                CheckoutTipSectionKt.m1308SelectionTotalAmountXOJAsU((String) obj3, (String) obj4, this.f$1, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 4:
                ((Integer) obj2).getClass();
                TextViewKt.m3619MonogramXOJAsU((String) obj3, (AvatarSizeImpl) obj4, this.f$1, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 5:
                MarkdownBlock.OrderedListItem orderedListItem = (MarkdownBlock.OrderedListItem) obj3;
                TextStyle textStyle = (TextStyle) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Room.m1164Text25TpFw(0, 0, 0, this.f$3, 0, 0, 3826, this.f$1, (Composer) gapComposer, (Modifier) null, orderedListItem.annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                CardUpsellKt.m3596PointerBx497Mc((ArrowOrientation) obj3, (Alignment.Horizontal) obj4, this.f$1, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 7:
                ((Integer) obj2).getClass();
                KeypadKt.m3645NavigateUpButton_KipM6I(Updater.updateChangedFlags(1 | i2), this.f$1, (Composer) obj, (NavigationIconType) obj3, (Function0) obj4);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((CoreFlowBasicShieetScope) obj3).m3707Dimmer3JVO9M(Updater.updateChangedFlags(1 | i2), this.f$1, (Composer) obj, (Modifier) obj4);
                break;
            case 9:
                ((Integer) obj2).getClass();
                TapToPayKt.m3760ExitButtonKTwxG1Y(this.f$1, (Modifier) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            default:
                ((Integer) obj2).getClass();
                MoneyKt.m3505FakeBottomSheet3IgeMak((Modifier) obj4, this.f$1, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385), this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(int i, int i2, long j, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
        this.f$3 = i;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(int i, long j, NavigationIconType navigationIconType, Function0 function0) {
        this.$r8$classId = 7;
        this.f$1 = j;
        this.f$0 = navigationIconType;
        this.f$2 = function0;
        this.f$3 = i;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(int i, int i2, long j, Modifier modifier, Object obj) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(DatePickerDefaults datePickerDefaults, int i, Modifier modifier, long j, int i2) {
        this.$r8$classId = 1;
        this.f$0 = datePickerDefaults;
        this.f$3 = i;
        this.f$2 = modifier;
        this.f$1 = j;
    }

    public /* synthetic */ BasicShieetScope$$ExternalSyntheticLambda13(Modifier modifier, long j, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 10;
        this.f$2 = modifier;
        this.f$1 = j;
        this.f$0 = composableLambdaImpl;
        this.f$3 = i2;
    }
}
