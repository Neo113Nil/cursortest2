package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.a;

/* loaded from: classes10.dex */
public final class u5e implements oll0, g050 {
    public final oll0 a;
    public final g050 b;
    public fse c;
    public Throwable w;
    public final t5e x;

    public u5e(oll0 oll0Var) {
        a a = gtq0.a();
        this.a = oll0Var;
        this.b = a;
        this.x = new t5e(this);
    }

    @Override // defpackage.oll0
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.oll0
    public final ull0 T0(String str) {
        t5e t5eVar = this.x;
        return t5eVar != null ? new s5e((ull0) t5eVar.c(str)) : this.a.T0(str);
    }

    @Override // defpackage.g050
    public final Object a(Continuation continuation) {
        return this.b.a(continuation);
    }

    @Override // defpackage.g050
    public final boolean c() {
        return this.b.c();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        t5e t5eVar = this.x;
        if (t5eVar != null) {
            t5eVar.h(-1);
        }
        this.a.close();
    }

    @Override // defpackage.g050
    public final void d(Object obj) {
        this.b.d(null);
    }

    public final void e(StringBuilder sb) {
        int i;
        t5e t5eVar = this.x;
        if (this.c == null && this.w == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            fse fseVar = this.c;
            if (fseVar != null) {
                sb.append("\t\tCoroutine: " + fseVar);
                sb.append('\n');
            }
            Throwable th = this.w;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = kotlin.collections.a.J(evu0.M(ljo.b(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (t5eVar != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (t5eVar.c) {
                i = t5eVar.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
