package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* loaded from: classes3.dex */
public final /* synthetic */ class h6c implements ag6, qlh, rth {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6c(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // defpackage.rth
    public void a(wrh wrhVar) {
        sth sthVar = (sth) this.b;
        xop s = sthVar.h.s(wrhVar, yde.y((onh) this.c), -1, -9223372036854775807L);
        s.a(new pv7(s, new r0o(sthVar, wrhVar, this.a), false, 9), e48.a);
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        c9eVar.V(((ulh) this.b).c, i, ((dv1) this.c).c(), this.a);
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        return (fxf.F() && ((Integer) task.h()).intValue() == 402) ? nnk.c((Context) this.b, (Intent) this.c, this.a).e(new gx0(1), new xla(28)) : task;
    }
}
