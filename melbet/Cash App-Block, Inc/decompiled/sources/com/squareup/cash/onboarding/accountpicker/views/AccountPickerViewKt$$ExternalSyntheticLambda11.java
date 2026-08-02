package com.squareup.cash.onboarding.accountpicker.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class AccountPickerViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountPickerViewModel.AccountList f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AccountPickerViewKt$$ExternalSyntheticLambda11(AccountPickerViewModel.AccountList accountList, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = accountList;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        long j;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        AccountPickerViewModel.AccountList accountList = this.f$0;
        int i2 = 1;
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
                    TransactorKt.CustomAction(titleBarActionScope, null, null, Expect_jvmKt.rememberComposableLambda(-2145764700, new AccountPickerViewKt$$ExternalSyntheticLambda11(accountList, function1, i2), gapComposer), gapComposer, (intValue & 14) | 3072, 3);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z = accountList.isInEditMode;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(1817461136);
                        gapComposer2.end(false);
                        companion = companion2;
                    } else {
                        gapComposer2.startReplaceGroup(1817175068);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
                        boolean changed = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(12, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        ?? m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, PlatformKt.withHaptics((Function0) rememberedValue2, null, gapComposer2, 0, 1), 28);
                        gapComposer2.end(false);
                        companion = m182clickableO2vRcR0$default;
                    }
                    Icons icons = Icons.NavigationMore;
                    String stringResource = Room.stringResource(gapComposer2, R.string.account_picker_options);
                    if (accountList.isInEditMode) {
                        gapComposer2.startReplaceGroup(1817699123);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors.semantic.icon.disabled;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1817779475);
                        Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        j = colors2.semantic.icon.standard;
                        gapComposer2.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, stringResource, companion, j, gapComposer2, 6, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
