package com.squareup.cash.investing.components.search;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import coil3.RealImageLoader;
import com.mikepenz.markdown.model.MarkdownAnimationsKt;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CategoryTile$CategoryCarousel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealImageLoader f$2;

    public /* synthetic */ InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0(CategoryTile$CategoryCarousel categoryTile$CategoryCarousel, Function1 function1, RealImageLoader realImageLoader) {
        this.f$0 = categoryTile$CategoryCarousel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RealImageLoader realImageLoader = this.f$2;
        Function1 function1 = this.f$1;
        CategoryTile$CategoryCarousel categoryTile$CategoryCarousel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape), 1.0f);
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    boolean changedInstance = gapComposer.changedInstance(categoryTile$CategoryCarousel) | gapComposer.changed(function1) | gapComposer.changedInstance(realImageLoader);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(22, categoryTile$CategoryCarousel, function1, realImageLoader);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyRow(fillMaxWidth, null, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24960, 490);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                MarkdownAnimationsKt.InvestingSearchCategoryCarousel(categoryTile$CategoryCarousel, function1, realImageLoader, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0(CategoryTile$CategoryCarousel categoryTile$CategoryCarousel, Function1 function1, RealImageLoader realImageLoader, int i) {
        this.f$0 = categoryTile$CategoryCarousel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }
}
