package coil3.compose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Image;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1 {
    public static final AsyncImagePreviewHandler$Companion$Default$1 INSTANCE = new AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handle(RealImageLoader realImageLoader, ImageRequest imageRequest, ContinuationImpl continuationImpl) {
        AsyncImagePreviewHandler$Companion$Default$1$handle$1 asyncImagePreviewHandler$Companion$Default$1$handle$1;
        int i;
        ImageResult imageResult;
        if (continuationImpl instanceof AsyncImagePreviewHandler$Companion$Default$1$handle$1) {
            asyncImagePreviewHandler$Companion$Default$1$handle$1 = (AsyncImagePreviewHandler$Companion$Default$1$handle$1) continuationImpl;
            int i2 = asyncImagePreviewHandler$Companion$Default$1$handle$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                asyncImagePreviewHandler$Companion$Default$1$handle$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = asyncImagePreviewHandler$Companion$Default$1$handle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = asyncImagePreviewHandler$Companion$Default$1$handle$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    asyncImagePreviewHandler$Companion$Default$1$handle$1.L$0 = imageRequest;
                    asyncImagePreviewHandler$Companion$Default$1$handle$1.label = 1;
                    obj = realImageLoader.execute(imageRequest, asyncImagePreviewHandler$Companion$Default$1$handle$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imageRequest = asyncImagePreviewHandler$Companion$Default$1$handle$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                imageResult = (ImageResult) obj;
                if (!(imageResult instanceof SuccessResult)) {
                    SuccessResult successResult = (SuccessResult) imageResult;
                    return new AsyncImagePainter.State.Success(AsyncImageKt.m1445asPainter55t9rM(successResult.image, imageRequest.context, 1), successResult);
                }
                if (!(imageResult instanceof ErrorResult)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ErrorResult errorResult = (ErrorResult) imageResult;
                Image image = errorResult.image;
                return new AsyncImagePainter.State.Error(image != null ? AsyncImageKt.m1445asPainter55t9rM(image, imageRequest.context, 1) : null, errorResult);
            }
        }
        asyncImagePreviewHandler$Companion$Default$1$handle$1 = new AsyncImagePreviewHandler$Companion$Default$1$handle$1(this, continuationImpl);
        Object obj3 = asyncImagePreviewHandler$Companion$Default$1$handle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncImagePreviewHandler$Companion$Default$1$handle$1.label;
        if (i != 0) {
        }
        imageResult = (ImageResult) obj3;
        if (!(imageResult instanceof SuccessResult)) {
        }
    }
}
