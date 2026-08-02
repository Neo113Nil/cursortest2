package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes10.dex */
public final class x4r0 extends aas {
    public final int A;
    public final Object w;
    public final dav x;
    public Rect y;
    public final int z;

    public x4r0(jdv jdvVar, Size size, dav davVar) {
        super(jdvVar);
        this.w = new Object();
        if (size == null) {
            this.z = this.b.getWidth();
            this.A = this.b.getHeight();
        } else {
            this.z = size.getWidth();
            this.A = size.getHeight();
        }
        this.x = davVar;
    }

    @Override // defpackage.aas, defpackage.jdv
    public final dav G0() {
        return this.x;
    }

    public final void c(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.z, this.A)) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.w) {
            this.y = rect;
        }
    }

    @Override // defpackage.aas, defpackage.jdv
    public final Rect getCropRect() {
        synchronized (this.w) {
            try {
                if (this.y == null) {
                    return new Rect(0, 0, this.z, this.A);
                }
                return new Rect(this.y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.aas, defpackage.jdv
    public final int getHeight() {
        return this.A;
    }

    @Override // defpackage.aas, defpackage.jdv
    public final int getWidth() {
        return this.z;
    }
}
