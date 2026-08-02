package com.squareup.cash.formview.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.booklet.ui.BookletGridKt;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ FormElementViewBuilder f$0;
    public final /* synthetic */ FormBlocker.EditorialContentElement f$1;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda9(FormElementViewBuilder formElementViewBuilder, FormBlocker.EditorialContentElement editorialContentElement) {
        this.f$0 = formElementViewBuilder;
        this.f$1 = editorialContentElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        boolean changedInstance;
        Object rememberedValue;
        int i = this.$r8$classId;
        FormElementViewBuilder formElementViewBuilder = this.f$0;
        FormBlocker.EditorialContentElement editorialContentElement = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(formElementViewBuilder.imageLoader), Expect_jvmKt.rememberComposableLambda(-1444384240, new FormElementViewBuilder$$ExternalSyntheticLambda9(editorialContentElement, formElementViewBuilder), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    String str = editorialContentElement.title_text;
                    str.getClass();
                    String str2 = editorialContentElement.detail_text;
                    str2.getClass();
                    Image image = editorialContentElement.hero_image;
                    image.getClass();
                    Float f2 = editorialContentElement.image_height;
                    if (f2 != null) {
                        if (f2.floatValue() <= RecyclerView.DECELERATION_RATE) {
                            f2 = null;
                        }
                        if (f2 != null) {
                            f = f2.floatValue();
                            float f3 = f;
                            changedInstance = gapComposer2.changedInstance(formElementViewBuilder);
                            rememberedValue = gapComposer2.rememberedValue();
                            if (!changedInstance || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new ArcadeModal$$ExternalSyntheticLambda5(formElementViewBuilder, 17);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            BookletGridKt.m3424BookletTileeHTjO5g(null, str, str2, image, f3, null, (Function2) rememberedValue, gapComposer2, 24576, 65);
                        }
                    }
                    f = 160.0f;
                    float f32 = f;
                    changedInstance = gapComposer2.changedInstance(formElementViewBuilder);
                    rememberedValue = gapComposer2.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new ArcadeModal$$ExternalSyntheticLambda5(formElementViewBuilder, 17);
                    gapComposer2.updateRememberedValue(rememberedValue);
                    BookletGridKt.m3424BookletTileeHTjO5g(null, str, str2, image, f32, null, (Function2) rememberedValue, gapComposer2, 24576, 65);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda9(FormBlocker.EditorialContentElement editorialContentElement, FormElementViewBuilder formElementViewBuilder) {
        this.f$1 = editorialContentElement;
        this.f$0 = formElementViewBuilder;
    }
}
