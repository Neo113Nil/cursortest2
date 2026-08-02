package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.video.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class txc0 {
    public static final jnh o = new jnh(0);
    public final Context a;
    public final w8z0 b = new w8z0();
    public final sxc0 c;
    public final SparseArray d;
    public final List e;
    public final mnh f;
    public final y3c g;
    public final CopyOnWriteArraySet h;
    public a3x0 i;
    public Pair j;
    public int k;
    public long l;
    public long m;
    public int n;

    public txc0(teh tehVar) {
        this.a = (Context) tehVar.b;
        sxc0 sxc0Var = (sxc0) tehVar.x;
        d6z.z(sxc0Var);
        this.c = sxc0Var;
        this.d = new SparseArray();
        this.e = (List) tehVar.y;
        y3c y3cVar = (y3c) tehVar.A;
        this.g = y3cVar;
        this.f = new mnh((b) tehVar.c, y3cVar);
        this.h = new CopyOnWriteArraySet();
        new f7s().a();
        this.l = -9223372036854775807L;
        this.n = -1;
        this.k = 0;
    }
}
