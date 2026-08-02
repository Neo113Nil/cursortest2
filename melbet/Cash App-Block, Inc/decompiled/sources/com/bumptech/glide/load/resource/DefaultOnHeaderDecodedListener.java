package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$None;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;

/* loaded from: classes4.dex */
public final class DefaultOnHeaderDecodedListener implements ImageDecoder.OnHeaderDecodedListener {
    public final DecodeFormat decodeFormat;
    public final HardwareConfigState hardwareConfigState = HardwareConfigState.getInstance();
    public final boolean isHardwareConfigAllowed;
    public final PreferredColorSpace preferredColorSpace;
    public final int requestedHeight;
    public final int requestedWidth;
    public final DownsampleStrategy$None strategy;

    /* renamed from: com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener$1, reason: invalid class name */
    public final class AnonymousClass1 implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public DefaultOnHeaderDecodedListener(int i, int i2, Options options) {
        this.requestedWidth = i;
        this.requestedHeight = i2;
        this.decodeFormat = (DecodeFormat) options.get(Downsampler.DECODE_FORMAT);
        this.strategy = (DownsampleStrategy$None) options.get(DownsampleStrategy$None.OPTION);
        Option option = Downsampler.ALLOW_HARDWARE_CONFIG;
        this.isHardwareConfigAllowed = options.get(option) != null && ((Boolean) options.get(option)).booleanValue();
        this.preferredColorSpace = (PreferredColorSpace) options.get(Downsampler.PREFERRED_COLOR_SPACE);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        HardwareConfigState hardwareConfigState = this.hardwareConfigState;
        int i = this.requestedWidth;
        int i2 = this.requestedHeight;
        if (hardwareConfigState.isHardwareConfigAllowed(i, i2, this.isHardwareConfigAllowed, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.decodeFormat == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new AnonymousClass1());
        Size size = imageInfo.getSize();
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float scaleFactor = this.strategy.getScaleFactor(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * scaleFactor);
        int round2 = Math.round(size.getHeight() * scaleFactor);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + scaleFactor);
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.preferredColorSpace;
        if (preferredColorSpace != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
