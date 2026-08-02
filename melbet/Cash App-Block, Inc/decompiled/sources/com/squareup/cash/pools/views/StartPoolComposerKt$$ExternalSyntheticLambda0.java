package com.squareup.cash.pools.views;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.util.DBUtil;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class StartPoolComposerKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ StartPoolViewModel f$1;

    public /* synthetic */ StartPoolComposerKt$$ExternalSyntheticLambda0(Function1 function1, StartPoolViewModel startPoolViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = startPoolViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        StartPoolViewModel startPoolViewModel = this.f$1;
        Function1 function1 = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda3(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1502176347, new StartPoolComposerKt$$ExternalSyntheticLambda0(function1, startPoolViewModel, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    View view = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
                    RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer2, 0, 1);
                    boolean changedInstance = gapComposer2.changedInstance(view) | gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        rememberedValue2 = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function1, 3);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, null, rememberSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-674741582, new SheetKt$$ExternalSyntheticLambda5(startPoolViewModel, function1, rememberSheetState), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
