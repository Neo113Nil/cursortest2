package com.squareup.cash.appupdate.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewModel;
import com.squareup.cash.arcade.components.ModalKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public abstract class AppUpdateDialogKt {

    /* renamed from: lambda$-680233379, reason: not valid java name */
    public static final ComposableLambdaImpl f144lambda$680233379 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(9), false, -680233379);

    public static final void AppUpdateDialog(AppUpdateDialogViewModel appUpdateDialogViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        appUpdateDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(144082489);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(appUpdateDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i5 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, Expect_jvmKt.rememberComposableLambda(1405940554, new LocalHomeViewKt$$ExternalSyntheticLambda1(appUpdateDialogViewModel.title, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-1550263319, new LocalHomeViewKt$$ExternalSyntheticLambda1(appUpdateDialogViewModel.message, 17), gapComposer), Expect_jvmKt.rememberComposableLambda(1838332565, new TabContentViewKt$$ExternalSyntheticLambda11(function1, appUpdateDialogViewModel.updateButtonTitle, 3), gapComposer), Expect_jvmKt.rememberComposableLambda(-1117871308, new TabContentViewKt$$ExternalSyntheticLambda11(function1, appUpdateDialogViewModel.cancelButtonTitle, i3), gapComposer), (Function3) null, gapComposer, 28080, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SectionHeaderScope$$ExternalSyntheticLambda1(appUpdateDialogViewModel, function1, i, i5);
        }
    }
}
