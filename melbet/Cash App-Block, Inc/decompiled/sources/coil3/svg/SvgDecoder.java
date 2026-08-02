package coil3.svg;

import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.RealImageLoader;
import coil3.decode.Decoder;
import coil3.decode.ImageSource;
import coil3.decode.SourceImageSource;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterruptibleKt;

/* loaded from: classes.dex */
public final class SvgDecoder implements Decoder {
    public static final SvgDecoder$$ExternalSyntheticLambda0 NO_DENSITY = new SvgDecoder$$ExternalSyntheticLambda0(0);
    public final Function1 density;
    public final Options options;
    public final Svg$Parser$Companion$DEFAULT$1 parser;
    public final boolean renderToBitmap;
    public final ImageSource source;
    public final boolean useViewBoundsAsIntrinsicSize;

    public final class Factory implements Decoder.Factory {
        public final Svg$Parser$Companion$DEFAULT$1 parser = Svg$Parser$Companion$DEFAULT$1.INSTANCE;
        public final Function1 density = SvgDecoder.NO_DENSITY;
        public final boolean useViewBoundsAsIntrinsicSize = true;
        public final boolean renderToBitmap = true;

        @Override // coil3.decode.Decoder.Factory
        public final Decoder create(SourceFetchResult sourceFetchResult, Options options, RealImageLoader realImageLoader) {
            if (!Intrinsics.areEqual(sourceFetchResult.getMimeType(), "image/svg+xml") && !DecodeUtilsKt.isSvg(sourceFetchResult.getSource().source())) {
                return null;
            }
            return new SvgDecoder(sourceFetchResult.getSource(), options, this.parser, this.density, this.useViewBoundsAsIntrinsicSize, this.renderToBitmap);
        }
    }

    public SvgDecoder(ImageSource imageSource, Options options, Svg$Parser$Companion$DEFAULT$1 svg$Parser$Companion$DEFAULT$1, Function1 function1, boolean z, boolean z2) {
        this.source = imageSource;
        this.options = options;
        this.parser = svg$Parser$Companion$DEFAULT$1;
        this.density = function1;
        this.useViewBoundsAsIntrinsicSize = z;
        this.renderToBitmap = z2;
    }

    @Override // coil3.decode.Decoder
    public final Object decode(Continuation continuation) {
        return InterruptibleKt.runInterruptible(EmptyCoroutineContext.INSTANCE, new yf$$ExternalSyntheticLambda2(this, 3), (ContinuationImpl) continuation);
    }

    public SvgDecoder(SourceImageSource sourceImageSource, Options options) {
        this(sourceImageSource, options, Svg$Parser$Companion$DEFAULT$1.INSTANCE, NO_DENSITY, true, true);
    }
}
