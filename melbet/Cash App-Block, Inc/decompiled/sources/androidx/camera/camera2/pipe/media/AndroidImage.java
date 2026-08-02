package androidx.camera.camera2.pipe.media;

import android.hardware.HardwareBuffer;
import android.media.Image;
import androidx.camera.camera2.pipe.StreamFormat;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class AndroidImage implements ImageWrapper {

    /* renamed from: format, reason: collision with root package name */
    public final int f843format;
    public final int height;
    public final Image image;
    public final long timestamp;
    public final int width;

    public AndroidImage(Image image) {
        this.image = image;
        this.f843format = image.getFormat();
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.timestamp = image.getTimestamp();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.image.close();
    }

    public final String toString() {
        return "Image-" + StreamFormat.m55getNameimpl(this.f843format) + "-w" + this.width + 'h' + this.height + "-t" + this.timestamp;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(Image.class));
        Image image = this.image;
        if (equals) {
            return image;
        }
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(HardwareBuffer.class))) {
            return image.getHardwareBuffer();
        }
        return null;
    }
}
