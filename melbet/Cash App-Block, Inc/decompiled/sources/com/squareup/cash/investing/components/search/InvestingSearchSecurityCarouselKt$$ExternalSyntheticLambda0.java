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
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.viewmodels.search.SecurityCarousel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.face.iad.capture.internal.m4;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SecurityCarousel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ RealImageLoader f$2;

    public /* synthetic */ InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0(SecurityCarousel securityCarousel, Function1 function1, RealImageLoader realImageLoader) {
        this.f$0 = securityCarousel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RealImageLoader realImageLoader = this.f$2;
        Function1 function1 = this.f$1;
        SecurityCarousel securityCarousel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape), 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 40.0f, 7);
                    PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    boolean changedInstance = gapComposer.changedInstance(securityCarousel) | gapComposer.changed(function1) | gapComposer.changedInstance(realImageLoader);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(23, securityCarousel, function1, realImageLoader);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    LazyDslKt.LazyRow(m302paddingqDBjuR0$default, null, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24960, 490);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                m4.InvestingSearchSecurityCarousel(securityCarousel, function1, realImageLoader, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSearchSecurityCarouselKt$$ExternalSyntheticLambda0(SecurityCarousel securityCarousel, Function1 function1, RealImageLoader realImageLoader, int i) {
        this.f$0 = securityCarousel;
        this.f$1 = function1;
        this.f$2 = realImageLoader;
    }
}
