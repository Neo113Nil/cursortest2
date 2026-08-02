package defpackage;

import ru.yandex.video.m3.player.provider.model.SurfaceSize;

/* loaded from: classes6.dex */
public final class str {
    public static final /* synthetic */ s9f[] i;
    public boolean c;
    public boolean d;
    public boolean f;
    public hjp g;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public final int e = Integer.MAX_VALUE;
    public final r2e h = new r2e(a(), this);

    static {
        opi opiVar = new opi(str.class, "cappingSize", "getCappingSize()Lru/yandex/video/m3/player/provider/model/SurfaceSize;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public final SurfaceSize a() {
        return new SurfaceSize(this.a, this.f ? this.b : this.e);
    }

    public final void b(Integer num) {
        c();
    }

    public final void c() {
        SurfaceSize a = a();
        this.h.setValue(this, i[0], a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof str)) {
            return false;
        }
        str strVar = (str) obj;
        return this.a == strVar.a && this.b == strVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceSizeHolderInternal(surfaceWidth=");
        sb.append(this.a);
        sb.append(", surfaceHeight=");
        return f1d.i(sb, this.b, ", experimentalShouldConsiderUserQuality=false)");
    }
}
