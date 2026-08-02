package com.squareup.cash.borrow.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class BulletinInfoOverlayKt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Image f$0;

    public /* synthetic */ BulletinInfoOverlayKt$$ExternalSyntheticLambda7(Image image, int i) {
        this.$r8$classId = i;
        this.f$0 = image;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Image image = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, ThemablesKt.urlForTheme(image, gapComposer)), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 30.0f, 32.0f, 30.0f, RecyclerView.DECELERATION_RATE, 8), null, ContentScale.Companion.FillWidth, RecyclerView.DECELERATION_RATE, null, gapComposer, 24624, 104);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 24.0f);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(7);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, ComposeUtilsKt.getThemedUrl(image, gapComposer2)), null, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 120);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
