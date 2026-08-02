package app.cash.local.views.brand.profile;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.painter.Painter;
import com.squareup.cash.arcade.Icons;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuCarouselViewKt$LocalBrandLocationMenuCarouselView$1$1$1$1 implements Function2 {
    public static final LocalBrandLocationMenuCarouselViewKt$LocalBrandLocationMenuCarouselView$1$1$1$1 INSTANCE = new LocalBrandLocationMenuCarouselViewKt$LocalBrandLocationMenuCarouselView$1$1$1$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        GapComposer gapComposer = (GapComposer) ((Composer) obj);
        gapComposer.startReplaceGroup(-701520529);
        Painter painter = Icons.CategoryRestaurant32.painter(gapComposer);
        gapComposer.end(false);
        return painter;
    }
}
