package defpackage;

import android.media.ImageWriter;

/* loaded from: classes10.dex */
public final /* synthetic */ class rf61 implements ImageWriter.OnImageReleasedListener {
    public final /* synthetic */ jdv a;

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        this.a.close();
    }
}
