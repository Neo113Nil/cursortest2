package defpackage;

import android.content.Context;
import androidx.datastore.core.b;
import androidx.datastore.core.h;
import com.google.firebase.sessions.settings.c;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class qcr implements wvf0 {
    public final /* synthetic */ int a = 0;
    public final yvf0 b;
    public final wvf0 c;
    public final yvf0 d;

    public qcr(m3w m3wVar, wvf0 wvf0Var, wvf0 wvf0Var2) {
        this.b = m3wVar;
        this.d = wvf0Var;
        this.c = wvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wvf0 wvf0Var = this.c;
        yvf0 yvf0Var = this.d;
        yvf0 yvf0Var2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((m3w) yvf0Var).b;
                fse fseVar = (fse) yvf0Var2.get();
                xyq0 xyq0Var = (xyq0) wvf0Var.get();
                dxf0 dxf0Var = new dxf0(new d8(24, xyq0Var));
                ike a = bvf0.a(fseVar);
                ku2 ku2Var = new ku2(context, 10);
                EmptyList emptyList = EmptyList.a;
                try {
                    System.loadLibrary("datastore_shared_counter");
                    return h.b(xyq0Var, dxf0Var, emptyList, a, ku2Var);
                } catch (SecurityException | UnsatisfiedLinkError unused) {
                    return b.a(new n1r(xyq0Var, ku2Var), dxf0Var, emptyList, a);
                }
            default:
                return new c((fse) yvf0Var2.get(), (e7z0) yvf0Var.get(), (tpg) wvf0Var.get());
        }
    }

    public qcr(m3w m3wVar, m3w m3wVar2, wvf0 wvf0Var) {
        this.d = m3wVar;
        this.b = m3wVar2;
        this.c = wvf0Var;
    }
}
