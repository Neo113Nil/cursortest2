package defpackage;

import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;

/* loaded from: classes10.dex */
public final class rng implements iog, fog {
    public volatile p430 A;
    public File B;
    public final List a;
    public final uxg b;
    public final hog c;
    public int w = -1;
    public khx x;
    public List y;
    public int z;

    public rng(List list, uxg uxgVar, hog hogVar) {
        this.a = list;
        this.b = uxgVar;
        this.c = hogVar;
    }

    @Override // defpackage.iog
    public final boolean a() {
        while (true) {
            List list = this.y;
            boolean z = false;
            if (list != null && this.z < list.size()) {
                this.A = null;
                while (!z && this.z < this.y.size()) {
                    List list2 = this.y;
                    int i = this.z;
                    this.z = i + 1;
                    q430 q430Var = (q430) list2.get(i);
                    File file = this.B;
                    uxg uxgVar = this.b;
                    this.A = q430Var.a(file, uxgVar.e, uxgVar.f, uxgVar.i);
                    if (this.A != null && this.b.c(this.A.c.a()) != null) {
                        this.A.c.b(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.w + 1;
            this.w = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            khx khxVar = (khx) this.a.get(this.w);
            uxg uxgVar2 = this.b;
            File c = uxgVar2.h.a().c(new sng(khxVar, uxgVar2.n));
            this.B = c;
            if (c != null) {
                this.x = khxVar;
                this.y = this.b.c.getRegistry().f(c);
                this.z = 0;
            }
        }
    }

    @Override // defpackage.iog
    public final void cancel() {
        p430 p430Var = this.A;
        if (p430Var != null) {
            p430Var.c.cancel();
        }
    }

    @Override // defpackage.fog
    public final void d(Object obj) {
        this.c.b(this.x, obj, this.A.c, DataSource.DATA_DISK_CACHE, this.x);
    }

    @Override // defpackage.fog
    public final void e(Exception exc) {
        this.c.c(this.x, exc, this.A.c, DataSource.DATA_DISK_CACHE);
    }
}
