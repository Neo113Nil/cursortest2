package coil3.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import coil3.RealImageLoader;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealImageLoader f$0;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function1 function1;
        int i = this.$r8$classId;
        PainterRequest painterRequest = (PainterRequest) obj;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        switch (i) {
            case 0:
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(982302768);
                String str = painterRequest.url;
                Function1 function12 = painterRequest.onError;
                if (function12 == null) {
                    gapComposer.startReplaceGroup(-2125321442);
                    gapComposer.end(false);
                    function1 = null;
                } else {
                    gapComposer.startReplaceGroup(-2125321441);
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(0, function12);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function1 = (Function1) rememberedValue;
                    gapComposer.end(false);
                }
                AsyncImagePainter m1447rememberAsyncImagePainter3HmZ8SU = AsyncImageKt.m1447rememberAsyncImagePainter3HmZ8SU(str, this.f$0, null, null, function1, gapComposer, 0, 892);
                gapComposer.end(false);
                return m1447rememberAsyncImagePainter3HmZ8SU;
            case 1:
                painterRequest.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1788746695);
                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, this.f$0, null, gapComposer2, 0, 60);
                gapComposer2.end(false);
                return m1448rememberAsyncImagePainter5jETZwI;
            case 2:
                painterRequest.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1902811611);
                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI2 = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, this.f$0, null, gapComposer3, 0, 60);
                gapComposer3.end(false);
                return m1448rememberAsyncImagePainter5jETZwI2;
            default:
                painterRequest.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-2078738197);
                AsyncImagePainter m1448rememberAsyncImagePainter5jETZwI3 = AsyncImageKt.m1448rememberAsyncImagePainter5jETZwI(painterRequest.url, this.f$0, null, gapComposer4, 0, 60);
                gapComposer4.end(false);
                return m1448rememberAsyncImagePainter5jETZwI3;
        }
    }
}
