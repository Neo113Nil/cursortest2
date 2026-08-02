package androidx.camera.camera2.pipe.media;

import android.media.ImageWriter;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* loaded from: classes3.dex */
public final class AndroidImageWriter implements ImageWriter.OnImageReleasedListener, UnsafeWrapper, AutoCloseable {
    public final ImageWriter imageWriter;
    public final int inputStreamId;
    public final AtomicRef onImageReleasedListener = AtomicFU.atomic((Object) null);

    public AndroidImageWriter(ImageWriter imageWriter, int i) {
        this.imageWriter = imageWriter;
        this.inputStreamId = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.imageWriter.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.onImageReleasedListener.value == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
    }

    public final String toString() {
        return "ImageWriter-" + StreamFormat.m55getNameimpl(this.imageWriter.getFormat()) + '-' + ((Object) ("Input-" + this.inputStreamId));
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        if (kClass.equals(Reflection.factory.getOrCreateKotlinClass(ImageWriter.class))) {
            return this.imageWriter;
        }
        return null;
    }
}
