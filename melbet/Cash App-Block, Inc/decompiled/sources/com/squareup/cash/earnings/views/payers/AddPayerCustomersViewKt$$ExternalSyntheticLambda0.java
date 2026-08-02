package com.squareup.cash.earnings.views.payers;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.ToggleableNode$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.views.payers.PresentationStyle;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.SheetTopCornerBehavior;
import com.squareup.cash.sheet.UserDismissMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class AddPayerCustomersViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AddPayerCustomersViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AddPayerCustomersViewKt$$ExternalSyntheticLambda0(AddPayerCustomersViewModel addPayerCustomersViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = addPayerCustomersViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.Companion.Empty) goto L32;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        boolean z = true;
        z = true;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(399232581, new AddPayerCustomersViewKt$$ExternalSyntheticLambda0(this.f$0, this.f$1, z ? 1 : 0), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AddPayerCustomersViewModel addPayerCustomersViewModel = this.f$0;
                    PresentationStyle presentationStyle = addPayerCustomersViewModel.getShowInOverlay() ? PresentationStyle.Overlay.INSTANCE : PresentationStyle.FullScreen.INSTANCE;
                    boolean showInOverlay = addPayerCustomersViewModel.getShowInOverlay();
                    Function1 function1 = this.f$1;
                    if (showInOverlay) {
                        gapComposer2.startReplaceGroup(773559826);
                        RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer2, 0, 1);
                        if (!(addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Saving) && (!(addPayerCustomersViewModel instanceof AddPayerCustomersViewModel.Loaded) || !((AddPayerCustomersViewModel.Loaded) addPayerCustomersViewModel).isToggleSaving)) {
                            z = false;
                        }
                        UserDismissMode userDismissMode = z ? UserDismissMode.None : UserDismissMode.All;
                        rememberSheetState.getClass();
                        rememberSheetState.userDismissMode$delegate.setValue(userDismissMode);
                        boolean changed = gapComposer2.changed(z) | gapComposer2.changed(function1);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (!changed) {
                            obj3 = rememberedValue;
                            break;
                        }
                        ToggleableNode$$ExternalSyntheticLambda1 toggleableNode$$ExternalSyntheticLambda1 = new ToggleableNode$$ExternalSyntheticLambda1(z, function1, 3);
                        gapComposer2.updateRememberedValue(toggleableNode$$ExternalSyntheticLambda1);
                        obj3 = toggleableNode$$ExternalSyntheticLambda1;
                        SheetKt.Sheet((Function0) obj3, null, rememberSheetState, null, null, false, SheetTopCornerBehavior.AlwaysRounded, Expect_jvmKt.rememberComposableLambda(-1673227295, new SectionKt$$ExternalSyntheticLambda2(24, addPayerCustomersViewModel, function1, presentationStyle), gapComposer2), gapComposer2, 113246208, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(774163148);
                        AddPayerCustomersViewKt.AddPayerCustomersScreen(addPayerCustomersViewModel, function1, presentationStyle, SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3), gapComposer2, 3072);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
