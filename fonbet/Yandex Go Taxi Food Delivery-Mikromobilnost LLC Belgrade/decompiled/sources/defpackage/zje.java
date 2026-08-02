package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* loaded from: classes10.dex */
public final class zje {
    public final gms a;
    public final SnapshotStateList b = new SnapshotStateList();

    public zje(gms gmsVar) {
        this.a = gmsVar;
    }

    public static void b(zje zjeVar, wls wlsVar, a aVar, sls slsVar, int i) {
        if ((i & 8) != 0) {
            aVar = null;
        }
        zjeVar.b.add(new a(-1789283891, new r5y(wlsVar, zjeVar, aVar, slsVar), true));
    }

    public final void a(yje yjeVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-798501095);
        int i2 = (btsVar.k(yjeVar) ? 4 : 2) | i | (btsVar.k(this) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            SnapshotStateList snapshotStateList = this.b;
            int size = snapshotStateList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((zls) snapshotStateList.get(i3)).invoke(yjeVar, btsVar, Integer.valueOf(i2 & 14));
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(this, yjeVar, i, 29);
        }
    }
}
