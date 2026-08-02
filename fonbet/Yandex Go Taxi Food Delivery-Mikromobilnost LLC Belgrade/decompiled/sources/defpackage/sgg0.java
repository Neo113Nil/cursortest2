package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class sgg0 implements izn {
    public static final HashMap w;
    public final izn a;
    public final ar7 b;
    public final a73 c;

    static {
        HashMap hashMap = new HashMap();
        w = hashMap;
        hashMap.put(1, kgg0.f);
        hashMap.put(8, kgg0.d);
        hashMap.put(6, kgg0.c);
        hashMap.put(5, kgg0.b);
        hashMap.put(4, kgg0.a);
        hashMap.put(0, kgg0.e);
    }

    public sgg0(izn iznVar, ar7 ar7Var, a73 a73Var) {
        this.a = iznVar;
        this.b = ar7Var;
        this.c = a73Var;
    }

    @Override // defpackage.izn
    public final mzn o(int i) {
        if (s(i)) {
            return this.a.o(i);
        }
        return null;
    }

    @Override // defpackage.izn
    public final boolean s(int i) {
        if (!this.a.s(i)) {
            return false;
        }
        kgg0 kgg0Var = (kgg0) w.get(Integer.valueOf(i));
        if (kgg0Var == null) {
            return true;
        }
        Iterator it = this.c.c(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.d(this.b, kgg0Var) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).c())) {
                return false;
            }
        }
        return true;
    }
}
