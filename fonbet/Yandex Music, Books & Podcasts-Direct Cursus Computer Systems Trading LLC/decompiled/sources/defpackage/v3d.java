package defpackage;

import com.yandex.music.shared.generative.GenerativeException;
import java.io.IOException;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class v3d {
    public final b5d a;
    public final q4d b;

    public v3d(b5d b5dVar, q4d q4dVar) {
        this.a = b5dVar;
        this.b = q4dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(StationId stationId, cg6 cg6Var) {
        u3d u3dVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof u3d) {
            u3dVar = (u3d) cg6Var;
            int i2 = u3dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u3dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = u3dVar.k;
                nm6 nm6Var = nm6.a;
                i = u3dVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(4, null, "Loading stream for station=" + stationId, null);
                    d5d N = ox6.N(stationId);
                    n5n a = this.b.a();
                    u3dVar.j = stationId;
                    u3dVar.m = 1;
                    obj = this.a.b(N, a, u3dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stationId = u3dVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new s3d((e5d) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof nj6) {
                    return new r3d(new GenerativeException(new NullPointerException("missing stream in api")));
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                pj6 pj6Var = (pj6) rj6Var;
                ssg.a(6, null, "Failed to load stream for station=" + stationId, pj6Var.a());
                IOException a2 = pj6Var.a();
                a2.getClass();
                return new r3d(new GenerativeException(a2));
            }
        }
        u3dVar = new u3d(this, cg6Var);
        Object obj2 = u3dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = u3dVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
