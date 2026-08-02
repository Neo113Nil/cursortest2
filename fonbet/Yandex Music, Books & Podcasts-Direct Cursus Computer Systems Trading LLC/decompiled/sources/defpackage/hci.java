package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class hci extends ck7 {
    @Override // defpackage.ck7
    public final void c(Object obj, Object obj2) {
        ici iciVar = (ici) obj;
        iciVar.getClass();
        ArrayDeque arrayDeque = ici.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(iciVar);
        }
    }
}
