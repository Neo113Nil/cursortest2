package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public interface ImageOutput {
    public static final AnonymousClass1 NO_OP = new AnonymousClass1();

    /* renamed from: androidx.media3.exoplayer.image.ImageOutput$1, reason: invalid class name */
    public final class AnonymousClass1 implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onDisabled() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
