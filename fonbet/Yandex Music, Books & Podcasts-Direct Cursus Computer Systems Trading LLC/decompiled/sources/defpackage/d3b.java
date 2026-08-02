package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d3b extends n3b {
    public ukd c;
    public int d;
    public RemoteViews e;

    public d3b() {
        super(0, 3);
        this.c = skd.a;
        this.d = -1;
    }

    @Override // defpackage.c3b
    public final void a(ukd ukdVar) {
        this.c = ukdVar;
    }

    @Override // defpackage.c3b
    public final ukd b() {
        return this.c;
    }

    @Override // defpackage.c3b
    public final c3b copy() {
        d3b d3bVar = new d3b();
        d3bVar.c = this.c;
        RemoteViews remoteViews = this.e;
        if (remoteViews != null) {
            if (remoteViews == null) {
                Intrinsics.j("remoteViews");
                throw null;
            }
            d3bVar.e = remoteViews;
        }
        d3bVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c3b) it.next()).copy());
        }
        d3bVar.b.addAll(arrayList2);
        return d3bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidRemoteViews(modifier=");
        sb.append(this.c);
        sb.append(", containerViewId=");
        sb.append(this.d);
        sb.append(", remoteViews=");
        RemoteViews remoteViews = this.e;
        if (remoteViews == null) {
            remoteViews = null;
        } else if (remoteViews == null) {
            Intrinsics.j("remoteViews");
            throw null;
        }
        sb.append(remoteViews);
        sb.append(", children=[\n");
        sb.append(c());
        sb.append("\n])");
        return sb.toString();
    }
}
