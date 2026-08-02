package com.squareup.cash.formview.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.LocalImageType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda15 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalImageType.ArcadeIcon f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda15(LocalImageType.ArcadeIcon arcadeIcon, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeIcon;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        LocalImageType.ArcadeIcon arcadeIcon = this.f$0;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1972820484, new FormElementViewBuilder$$ExternalSyntheticLambda15(arcadeIcon, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    arcadeIcon.icon.IconContent(gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
