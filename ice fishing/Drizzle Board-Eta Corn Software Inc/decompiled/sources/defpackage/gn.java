package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class gn extends nl implements zk {
    public final /* synthetic */ int jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.jb9XjC4I = i3;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        int i = this.jb9XjC4I;
        xe0 xe0Var = xe0.qoPGr6Ce;
        Object obj2 = this.MdtA4re8;
        switch (i) {
            case 0:
                ((Set) obj).getClass();
                hn hnVar = (hn) obj2;
                ReentrantLock reentrantLock = hnVar.wxUZMvaN;
                reentrantLock.lock();
                try {
                    List B1cjorwa = x5.B1cjorwa(hnVar.MdtA4re8.values());
                    reentrantLock.unlock();
                    Iterator it = B1cjorwa.iterator();
                    if (!it.hasNext()) {
                        return xe0Var;
                    }
                    ((qw) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((sn) obj2).ygLcUYwZ((Throwable) obj);
                return xe0Var;
        }
    }
}
