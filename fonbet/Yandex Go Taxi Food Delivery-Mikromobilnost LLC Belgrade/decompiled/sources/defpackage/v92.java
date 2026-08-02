package defpackage;

import android.media.Image;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class v92 implements idv {
    public final Image.Plane a;

    public v92(Image.Plane plane) {
        this.a = plane;
    }

    @Override // defpackage.idv
    public final int a() {
        return this.a.getRowStride();
    }

    @Override // defpackage.idv
    public final int b() {
        return this.a.getPixelStride();
    }

    @Override // defpackage.idv
    public final ByteBuffer h() {
        return this.a.getBuffer();
    }
}
