package coil3.svg.internal;

import coil3.decode.Decoder;
import coil3.svg.SvgDecoder;
import coil3.util.DecoderServiceLoaderTarget;

/* loaded from: classes3.dex */
public final class SvgDecoderServiceLoaderTarget implements DecoderServiceLoaderTarget {
    @Override // coil3.util.DecoderServiceLoaderTarget
    public final Decoder.Factory factory() {
        return new SvgDecoder.Factory();
    }
}
