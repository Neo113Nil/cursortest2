package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.c;

/* loaded from: classes10.dex */
public final class w92 implements jdv {
    public final Image a;
    public final v92[] b;
    public final c c;

    public w92(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new v92[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new v92(planes[i]);
            }
        } else {
            this.b = new v92[0];
        }
        this.c = new c(q6x0.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.jdv
    public final dav G0() {
        return this.c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.jdv
    public final Image f() {
        return this.a;
    }

    @Override // defpackage.jdv
    public final Rect getCropRect() {
        return this.a.getCropRect();
    }

    @Override // defpackage.jdv
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // defpackage.jdv
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.jdv
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // defpackage.jdv
    public final idv[] i0() {
        return this.b;
    }
}
