package coil3.gif.internal;

import coil3.decode.Decoder;
import coil3.gif.AnimatedImageDecoder;
import coil3.util.DecoderServiceLoaderTarget;

/* loaded from: classes3.dex */
public final class GifDecoderServiceLoaderTarget implements DecoderServiceLoaderTarget {
    @Override // coil3.util.DecoderServiceLoaderTarget
    public final Decoder.Factory factory() {
        return new AnimatedImageDecoder.Factory();
    }
}
