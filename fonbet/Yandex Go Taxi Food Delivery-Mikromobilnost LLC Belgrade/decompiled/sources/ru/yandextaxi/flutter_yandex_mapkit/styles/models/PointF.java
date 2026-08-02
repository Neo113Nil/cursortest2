package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import defpackage.x4e;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PointF;", "", "", RemoteBioParameters.X, RemoteBioParameters.Y, "<init>", "(FF)V", "F", "getX", "()F", "getY", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PointF {

    @ysq0("dx")
    private final float x;

    @ysq0("dy")
    private final float y;

    public PointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public final android.graphics.PointF a() {
        return new android.graphics.PointF(this.x, this.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointF)) {
            return false;
        }
        PointF pointF = (PointF) obj;
        return Float.compare(this.x, pointF.x) == 0 && Float.compare(this.y, pointF.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    public final String toString() {
        return x4e.e("PointF(x=", this.x, ", y=", this.y, Extension.C_BRAKE);
    }
}
