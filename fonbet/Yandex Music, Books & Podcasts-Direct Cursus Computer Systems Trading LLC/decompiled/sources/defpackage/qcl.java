package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class qcl implements Handler.Callback {
    public final zi7 a;
    public final znk b;
    public d97 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = dvt.p(this);
    public final au0 c = new au0(1);

    public qcl(d97 d97Var, znk znkVar, zi7 zi7Var) {
        this.f = d97Var;
        this.b = znkVar;
        this.a = zi7Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.i) {
            if (message.what != 1) {
                return false;
            }
            ocl oclVar = (ocl) message.obj;
            long j = oclVar.a;
            long j2 = oclVar.b;
            Long valueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(valueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
