package coil3.decode;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.gif.AnimatedImageDecoder;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.BitmapsKt;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1 implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ Ref$BooleanRef $isSampled$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Decoder this$0;

    public /* synthetic */ StaticImageDecoder$decode$lambda$0$0$$inlined$decodeBitmap$1(Decoder decoder, Ref$BooleanRef ref$BooleanRef, int i) {
        this.$r8$classId = i;
        this.this$0 = decoder;
        this.$isSampled$inlined = ref$BooleanRef;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int i = this.$r8$classId;
        Ref$BooleanRef ref$BooleanRef = this.$isSampled$inlined;
        Decoder decoder = this.this$0;
        switch (i) {
            case 0:
                Size size = imageInfo.getSize();
                int width = size.getWidth();
                int height = size.getHeight();
                Options options = ((StaticImageDecoder) decoder).options;
                coil3.size.Size size2 = options.size;
                Scale scale = options.scale;
                Extras.Key key = ImageRequestsKt.maxBitmapSizeKey;
                long m1455computeDstSizesEdh43o = DecodeUtils.m1455computeDstSizesEdh43o(width, height, size2, scale, (coil3.size.Size) ExtrasKt.getExtra(options, key));
                int i2 = (int) (m1455computeDstSizesEdh43o >> 32);
                int i3 = (int) (m1455computeDstSizesEdh43o & BodyPartID.bodyIdMax);
                if (width > 0 && height > 0 && (width != i2 || height != i3)) {
                    double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, i2, i3, options.scale, (coil3.size.Size) ExtrasKt.getExtra(options, key));
                    boolean z = computeSizeMultiplier < 1.0d;
                    ref$BooleanRef.element = z;
                    if (z || options.precision == Precision.EXACT) {
                        imageDecoder.setTargetSize(MathKt__MathJVMKt.roundToInt(width * computeSizeMultiplier), MathKt__MathJVMKt.roundToInt(computeSizeMultiplier * height));
                    }
                }
                imageDecoder.setOnPartialImageListener(new StaticImageDecoder$$ExternalSyntheticLambda0());
                imageDecoder.setAllocator(BitmapsKt.isHardware(ImageRequests_androidKt.getBitmapConfig(options)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) ExtrasKt.getExtra(options, ImageRequests_androidKt.allowRgb565Key)).booleanValue() ? 1 : 0);
                Extras.Key key2 = ImageRequests_androidKt.colorSpaceKey;
                if (((ColorSpace) ExtrasKt.getExtra(options, key2)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) ExtrasKt.getExtra(options, key2));
                }
                imageDecoder.setUnpremultipliedRequired(!((Boolean) ExtrasKt.getExtra(options, ImageRequests_androidKt.premultipliedAlphaKey)).booleanValue());
                break;
            default:
                Size size3 = imageInfo.getSize();
                int width2 = size3.getWidth();
                int height2 = size3.getHeight();
                Options options2 = ((AnimatedImageDecoder) decoder).options;
                coil3.size.Size size4 = options2.size;
                Scale scale2 = options2.scale;
                Extras.Key key3 = ImageRequestsKt.maxBitmapSizeKey;
                long m1455computeDstSizesEdh43o2 = DecodeUtils.m1455computeDstSizesEdh43o(width2, height2, size4, scale2, (coil3.size.Size) ExtrasKt.getExtra(options2, key3));
                int i4 = (int) (m1455computeDstSizesEdh43o2 >> 32);
                int i5 = (int) (m1455computeDstSizesEdh43o2 & BodyPartID.bodyIdMax);
                if (width2 > 0 && height2 > 0 && (width2 != i4 || height2 != i5)) {
                    double computeSizeMultiplier2 = DecodeUtils.computeSizeMultiplier(width2, height2, i4, i5, options2.scale, (coil3.size.Size) ExtrasKt.getExtra(options2, key3));
                    boolean z2 = computeSizeMultiplier2 < 1.0d;
                    ref$BooleanRef.element = z2;
                    if (z2 || options2.precision == Precision.EXACT) {
                        imageDecoder.setTargetSize(MathKt__MathJVMKt.roundToInt(width2 * computeSizeMultiplier2), MathKt__MathJVMKt.roundToInt(computeSizeMultiplier2 * height2));
                    }
                }
                imageDecoder.setAllocator(BitmapsKt.isHardware(ImageRequests_androidKt.getBitmapConfig(options2)) ? 3 : 1);
                imageDecoder.setMemorySizePolicy(!((Boolean) ExtrasKt.getExtra(options2, ImageRequests_androidKt.allowRgb565Key)).booleanValue() ? 1 : 0);
                Extras.Key key4 = ImageRequests_androidKt.colorSpaceKey;
                if (((ColorSpace) ExtrasKt.getExtra(options2, key4)) != null) {
                    imageDecoder.setTargetColorSpace((ColorSpace) ExtrasKt.getExtra(options2, key4));
                }
                if (ExtrasKt.getExtra(options2, coil3.gif.ImageRequestsKt.animatedTransformationKey) != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    break;
                } else {
                    imageDecoder.setPostProcessor(null);
                    break;
                }
                break;
        }
    }
}
