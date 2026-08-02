package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class s2r implements e1k, kab {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;
    public Object w;
    public final /* synthetic */ Object x;

    public s2r(zbz0 zbz0Var, ybz0 ybz0Var, LocalMessageRef localMessageRef) {
        r3z b;
        this.x = zbz0Var;
        this.c = ybz0Var;
        this.b = localMessageRef;
        oab oabVar = zbz0Var.b;
        bbb bbbVar = null;
        z83.g(null, oabVar.c, Looper.myLooper());
        lbb lbbVar = oabVar.G;
        if (lbbVar.b.b(localMessageRef) == null) {
            cbb cbbVar = lbbVar.a;
            long timestamp = localMessageRef.getTimestamp();
            bbbVar = cbbVar.a(new ry10(timestamp, timestamp, MessagesRange$LoadingType.FromNewest));
        }
        if (bbbVar == null && (b = oabVar.x.b(localMessageRef)) != null) {
            v(b);
        }
        this.w = new lab(oabVar, bbbVar, new f89(6, oabVar, localMessageRef, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                v1b v1bVar = (v1b) this.c;
                if (v1bVar != null) {
                    v1bVar.close();
                }
                this.c = null;
                e1k e1kVar = (e1k) this.b;
                if (e1kVar != null) {
                    e1kVar.close();
                }
                this.b = null;
                ((t2r) this.w).a((g2r) obj);
                break;
            default:
                z83.g(null, ((zbz0) obj).a.get(), Looper.myLooper());
                lab labVar = (lab) this.w;
                if (labVar != null) {
                    labVar.close();
                    this.w = null;
                }
                this.c = null;
                break;
        }
    }

    @Override // defpackage.kab
    public void v(r3z r3zVar) {
        zbz0 zbz0Var = (zbz0) this.x;
        z83.g(null, zbz0Var.a.get(), Looper.myLooper());
        if (((ybz0) this.c) != null) {
            ServerMessageRef g = zbz0Var.c.g((LocalMessageRef) this.b);
            du10 du10Var = zbz0Var.d;
            k020 k020Var = du10Var.d;
            j3b k = k020Var.k(du10Var.a.a.a);
            ((ybz0) this.c).c(du10Var.b(g != null ? ServerMessageRef.copy$default(g, 0L, k.b, 1, null) : null, r3zVar, k, k020Var.A()));
        }
    }

    public s2r(t2r t2rVar, g2r g2rVar, ArrayList arrayList, Iterator it, p2r p2rVar) {
        this.w = t2rVar;
        this.x = g2rVar;
        this.c = t2rVar.b(g2rVar, new r2r(this, arrayList, t2rVar, it, p2rVar));
    }
}
