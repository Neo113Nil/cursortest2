package com.squareup.cash.dialog;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.room.util.DBUtil;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.views.transcript.message.TransactionBodyView$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ComposeDialogKt$Modal$3$1$1$dialog$1 extends AbstractComposeView {
    public final Object $content;
    public final Object $modelState;
    public final Object $onBack;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeDialogKt$Modal$3$1$1$dialog$1(Context context, AndroidStringManager androidStringManager, RealImageLoader realImageLoader) {
        super(context, null, 6, 0);
        this.$r8$classId = 2;
        context.getClass();
        androidStringManager.getClass();
        realImageLoader.getClass();
        this.$content = androidStringManager;
        this.$modelState = realImageLoader;
        this.$onBack = Updater.mutableStateOf$default(BodyViewModel$TransactionBodyViewModel.Loading.INSTANCE);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.$onBack;
        Object obj2 = this.$content;
        Object obj3 = this.$modelState;
        byte b = 0;
        switch (i2) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(2008336835);
                ((ComposableLambdaImpl) obj2).invoke(((MutableState) obj3).getValue(), (Object) gapComposer, (Object) 0);
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    gapComposer.startReplaceGroup(1468306309);
                    DBUtil.BackHandler(false, function0, gapComposer, 0, 1);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1468362047);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                break;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-399237716);
                ((ComposableLambdaImpl) obj2).invoke(((MutableState) obj3).getValue(), (Object) gapComposer2, (Object) 0);
                Function0 function02 = (Function0) obj;
                if (function02 != null) {
                    gapComposer2.startReplaceGroup(-926266628);
                    DBUtil.BackHandler(false, function02, gapComposer2, 0, 1);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-926210890);
                    gapComposer2.end(false);
                }
                gapComposer2.end(false);
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-288089303);
                int i3 = (gapComposer3.changedInstance(this) ? 4 : 2) | i;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) obj3), Expect_jvmKt.rememberComposableLambda(-169205783, new TransactionBodyView$$ExternalSyntheticLambda0(this, b, b), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer3.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new TransactionBodyView$$ExternalSyntheticLambda0(this, i);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeDialogKt$Modal$3$1$1$dialog$1(Context context, ComposableLambdaImpl composableLambdaImpl, MutableState mutableState, Function0 function0, int i) {
        super(context, null, 6, 0);
        this.$r8$classId = i;
        this.$content = composableLambdaImpl;
        this.$modelState = mutableState;
        this.$onBack = function0;
    }
}
