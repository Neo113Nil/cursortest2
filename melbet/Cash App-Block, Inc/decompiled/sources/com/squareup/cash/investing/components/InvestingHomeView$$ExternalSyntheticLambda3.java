package com.squareup.cash.investing.components;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingHomeView$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingHomeView f$0;

    public /* synthetic */ InvestingHomeView$$ExternalSyntheticLambda3(InvestingHomeView investingHomeView, int i) {
        this.$r8$classId = i;
        this.f$0 = investingHomeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingHomeView investingHomeView = this.f$0;
        int i2 = 2;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                Ui.EventReceiver eventReceiver = investingHomeView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new InvestingHomeViewEvent.MyFirstStockClicked(booleanValue, str));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-799366890, new InvestingHomeView$$ExternalSyntheticLambda3(investingHomeView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer2, R.string.investing_components_search_search_hint);
                    TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer2, 6, 2);
                    SearchBarKeyboardState searchBarKeyboardState = new SearchBarKeyboardState(false);
                    boolean changedInstance = gapComposer2.changedInstance(investingHomeView);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InvestingHomeView$$ExternalSyntheticLambda2(investingHomeView, 2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, stringResource, searchBarKeyboardState, null, null, null, null, (Function0) rememberedValue, null, null, false, null, gapComposer2, 0, 0, 8056);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
