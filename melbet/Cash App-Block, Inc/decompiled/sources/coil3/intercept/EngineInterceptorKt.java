package coil3.intercept;

import android.graphics.Bitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.BitmapImage;
import coil3.EventListener;
import coil3.ExtrasKt;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.intercept.EngineInterceptor;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Size;
import coil3.transform.Transformation;
import coil3.util.DrawableUtils;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class EngineInterceptorKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewInternationalPaymentStart.deepLinkSpecs;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (kotlin.collections.ArraysKt___ArraysKt.contains(coil3.util.Utils_androidKt.VALID_TRANSFORMATION_CONFIGS, coil3.util.BitmapsKt.getSafeConfig(r8)) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00eb -> B:10:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object transform(EngineInterceptor.ExecuteResult executeResult, ImageRequest imageRequest, Options options, EventListener eventListener, ContinuationImpl continuationImpl) {
        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$1;
        int i;
        int i2;
        Bitmap convertToBitmap;
        int size;
        Bitmap bitmap;
        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$12;
        List list;
        EventListener eventListener2;
        EngineInterceptor.ExecuteResult executeResult2 = executeResult;
        ImageRequest imageRequest2 = imageRequest;
        Options options2 = options;
        if (continuationImpl instanceof EngineInterceptorKt$transform$1) {
            engineInterceptorKt$transform$1 = (EngineInterceptorKt$transform$1) continuationImpl;
            int i3 = engineInterceptorKt$transform$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                engineInterceptorKt$transform$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = engineInterceptorKt$transform$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptorKt$transform$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = (List) ExtrasKt.getExtra(imageRequest2, ImageRequestsKt.transformationsKey);
                    if (list2.isEmpty()) {
                        return executeResult2;
                    }
                    Image image = executeResult2.image;
                    boolean z = image instanceof BitmapImage;
                    if (!z && !((Boolean) ExtrasKt.getExtra(imageRequest2, ImageRequestsKt.allowConversionToBitmapKey)).booleanValue()) {
                        return executeResult2;
                    }
                    i2 = 0;
                    if (z) {
                        convertToBitmap = ((BitmapImage) image).bitmap;
                    }
                    convertToBitmap = DrawableUtils.convertToBitmap(Image_androidKt.asDrawable(image, options2.context.getResources()), (Bitmap.Config) ExtrasKt.getExtra(options2, ImageRequests_androidKt.bitmapConfigKey), options2.size, options2.scale, (Size) ExtrasKt.getExtra(options2, ImageRequestsKt.maxBitmapSizeKey), options2.precision == Precision.INEXACT);
                    eventListener.getClass();
                    size = list2.size();
                    bitmap = convertToBitmap;
                    engineInterceptorKt$transform$12 = engineInterceptorKt$transform$1;
                    list = list2;
                    eventListener2 = eventListener;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = engineInterceptorKt$transform$1.I$1;
                    int i5 = engineInterceptorKt$transform$1.I$0;
                    List list3 = engineInterceptorKt$transform$1.L$4;
                    EventListener eventListener3 = engineInterceptorKt$transform$1.L$3;
                    Options options3 = engineInterceptorKt$transform$1.L$2;
                    ImageRequest imageRequest3 = engineInterceptorKt$transform$1.L$1;
                    EngineInterceptor.ExecuteResult executeResult3 = engineInterceptorKt$transform$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    int i6 = i4;
                    executeResult2 = executeResult3;
                    EngineInterceptorKt$transform$1 engineInterceptorKt$transform$13 = engineInterceptorKt$transform$1;
                    list = list3;
                    options2 = options3;
                    JobKt.ensureActive(engineInterceptorKt$transform$13.getContext());
                    ImageRequest imageRequest4 = imageRequest3;
                    i2 = i5 + 1;
                    imageRequest2 = imageRequest4;
                    EngineInterceptorKt$transform$1 engineInterceptorKt$transform$14 = engineInterceptorKt$transform$13;
                    bitmap = (Bitmap) obj;
                    eventListener2 = eventListener3;
                    size = i6;
                    engineInterceptorKt$transform$12 = engineInterceptorKt$transform$14;
                    if (i2 < size) {
                        Transformation transformation = (Transformation) list.get(i2);
                        Size size2 = options2.size;
                        engineInterceptorKt$transform$12.L$0 = executeResult2;
                        engineInterceptorKt$transform$12.L$1 = imageRequest2;
                        engineInterceptorKt$transform$12.L$2 = options2;
                        engineInterceptorKt$transform$12.L$3 = eventListener2;
                        engineInterceptorKt$transform$12.L$4 = list;
                        engineInterceptorKt$transform$12.I$0 = i2;
                        engineInterceptorKt$transform$12.I$1 = size;
                        engineInterceptorKt$transform$12.label = 1;
                        Bitmap transform = transformation.transform(bitmap, size2);
                        if (transform == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        int i7 = i2;
                        imageRequest3 = imageRequest2;
                        i5 = i7;
                        int i8 = size;
                        eventListener3 = eventListener2;
                        obj = transform;
                        engineInterceptorKt$transform$13 = engineInterceptorKt$transform$12;
                        i6 = i8;
                        JobKt.ensureActive(engineInterceptorKt$transform$13.getContext());
                        ImageRequest imageRequest42 = imageRequest3;
                        i2 = i5 + 1;
                        imageRequest2 = imageRequest42;
                        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$142 = engineInterceptorKt$transform$13;
                        bitmap = (Bitmap) obj;
                        eventListener2 = eventListener3;
                        size = i6;
                        engineInterceptorKt$transform$12 = engineInterceptorKt$transform$142;
                        if (i2 < size) {
                            eventListener2.getClass();
                            return new EngineInterceptor.ExecuteResult(new BitmapImage(bitmap), executeResult2.isSampled, executeResult2.dataSource, executeResult2.diskCacheKey);
                        }
                    }
                }
            }
        }
        engineInterceptorKt$transform$1 = new EngineInterceptorKt$transform$1(continuationImpl);
        Object obj2 = engineInterceptorKt$transform$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptorKt$transform$1.label;
        if (i != 0) {
        }
    }
}
