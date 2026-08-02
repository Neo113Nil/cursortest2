package app.cash.local.views.wallet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import coil3.Extras;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.wire.GrpcMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda9(float f, RoundedCornerShape roundedCornerShape, LayoutDirection layoutDirection, Density density, long j) {
        this.f$0 = f;
        this.f$1 = roundedCornerShape;
        this.f$3 = layoutDirection;
        this.f$4 = density;
        this.f$2 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.$r8$classId;
        final long j2 = this.f$2;
        Object obj2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$1;
        final float f = this.f$0;
        switch (i) {
            case 0:
                List list = (List) obj4;
                List list2 = (List) obj3;
                Function1 function1 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                int i2 = 2;
                if (Dp.m1036compareTo0680j_4(f, RecyclerView.DECELERATION_RATE) > 0) {
                    LazyListScope.stickyHeader$default(lazyListScope, "sheet_top_padding", new ComposableLambdaImpl(new Function4() { // from class: app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            ((Integer) obj6).getClass();
                            Composer composer = (Composer) obj7;
                            int intValue = ((Integer) obj8).intValue();
                            ((LazyItemScopeImpl) obj5).getClass();
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), f), j2, ColorKt.RectangleShape), gapComposer, 0);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 57020617), 2);
                }
                lazyListScope.items(list.size(), new Latch$await$2$2(15, new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(list2, i2), list), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 8), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, list2, function1, 4), true, 2039820996));
                return Unit.INSTANCE;
            default:
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) obj4;
                LayoutDirection layoutDirection = (LayoutDirection) obj3;
                Density density = (Density) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float intBitsToFloat = (1.0f - f) * Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                GrpcMethod drawContext = drawScope.getDrawContext();
                long m3999getSizeNHjbRc = drawContext.m3999getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    try {
                        ((Extras.Key) drawContext.path).m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intBitsToFloat2, intBitsToFloat, 0);
                        ColorKt.m685drawOutlinewDX37Ww$default(drawScope, roundedCornerShape.mo175createOutlinePq9zytI(drawScope.mo753getSizeNHjbRc(), layoutDirection, density), j2);
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, m3999getSizeNHjbRc);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        j = m3999getSizeNHjbRc;
                        Recorder$$ExternalSyntheticOutline2.m(drawContext, j);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j = m3999getSizeNHjbRc;
                }
        }
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda9(float f, List list, long j, List list2, Function1 function1) {
        this.f$0 = f;
        this.f$1 = list;
        this.f$2 = j;
        this.f$3 = list2;
        this.f$4 = function1;
    }
}
