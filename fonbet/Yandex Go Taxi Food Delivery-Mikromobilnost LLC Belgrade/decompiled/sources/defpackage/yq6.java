package defpackage;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class yq6 implements ilu {
    public final ConcurrentLinkedDeque a = new ConcurrentLinkedDeque();
    public ilu b;

    @Override // defpackage.ilu
    public final void a(int i, String str) {
        ilu iluVar = this.b;
        if (iluVar != null) {
            iluVar.a(i, str);
        } else {
            this.a.add(new vq6(str, i));
        }
    }

    @Override // defpackage.ilu
    public final void b(String str, boolean z) {
        ilu iluVar = this.b;
        if (iluVar != null) {
            iluVar.b(str, z);
        } else {
            this.a.add(new sq6(str, z));
        }
    }

    @Override // defpackage.ilu
    public final void c(int i, int i2, String str) {
        ilu iluVar = this.b;
        if (iluVar != null) {
            iluVar.c(i, i2, str);
        } else {
            this.a.add(new uq6(str, i, i2));
        }
    }

    @Override // defpackage.ilu
    public final void d(int i, String str) {
        ilu iluVar = this.b;
        if (iluVar != null) {
            iluVar.d(i, str);
        } else {
            this.a.add(new tq6(str, i));
        }
    }

    @Override // defpackage.ilu
    public final void e(String str, long j, TimeUnit timeUnit) {
        ilu iluVar = this.b;
        if (iluVar != null) {
            iluVar.e(str, j, timeUnit);
        } else {
            this.a.add(new wq6(str, j, timeUnit));
        }
    }
}
