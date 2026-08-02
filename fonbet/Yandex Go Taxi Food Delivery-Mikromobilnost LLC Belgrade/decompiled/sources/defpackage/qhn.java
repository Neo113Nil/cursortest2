package defpackage;

import android.graphics.PointF;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;

/* loaded from: classes12.dex */
public final class qhn {
    public final String a;
    public final Float b;
    public final List c;
    public final PointF d;
    public final ImageProvider e;
    public final PointF f;
    public final ImageProvider g;

    public qhn(String str, Float f, List list, PointF pointF, ImageProvider imageProvider, PointF pointF2, ImageProvider imageProvider2) {
        this.a = str;
        this.b = f;
        this.c = list;
        this.d = pointF;
        this.e = imageProvider;
        this.f = pointF2;
        this.g = imageProvider2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qhn.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qhn qhnVar = (qhn) obj;
        if (!jl40.l(this.a, qhnVar.a) || !jl40.l(this.d, qhnVar.d) || !jl40.l(this.e.getId(), qhnVar.e.getId()) || !jl40.l(this.f, qhnVar.f)) {
            return false;
        }
        ImageProvider imageProvider = this.g;
        String id = imageProvider != null ? imageProvider.getId() : null;
        ImageProvider imageProvider2 = qhnVar.g;
        return jl40.l(id, imageProvider2 != null ? imageProvider2.getId() : null) && jl40.l(this.c, qhnVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.getId().hashCode() + ((this.d.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        ImageProvider imageProvider = this.g;
        String id = imageProvider != null ? imageProvider.getId() : null;
        int hashCode2 = (hashCode + (id != null ? id.hashCode() : 0)) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }
}
