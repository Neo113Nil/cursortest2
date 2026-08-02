package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o3x extends BasePendingResult {
    public c5p o;
    public final boolean p;
    public final /* synthetic */ xun q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3x(xun xunVar, boolean z) {
        super(null);
        this.q = xunVar;
        this.p = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ a8o c(Status status) {
        return new i3x(status, 1);
    }

    public abstract void l();

    public final c2x m() {
        if (this.o == null) {
            this.o = new c5p(19, this);
        }
        return this.o;
    }

    public final void n() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((wun) it2.next()).e();
            }
        }
        try {
            synchronized (this.q.a) {
                l();
            }
        } catch (s1x unused) {
            g(new i3x(new Status(2100, null, null, null), 1));
        }
    }
}
