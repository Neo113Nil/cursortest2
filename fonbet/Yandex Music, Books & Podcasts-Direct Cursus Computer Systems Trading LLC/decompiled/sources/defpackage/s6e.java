package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class s6e implements kci {
    public static final cvj b = cvj.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final n7b a;

    public s6e(n7b n7bVar) {
        this.a = n7bVar;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        old oldVar = (old) obj;
        n7b n7bVar = this.a;
        if (n7bVar != null) {
            hci hciVar = (hci) n7bVar.a;
            ici a = ici.a(oldVar);
            Object a2 = hciVar.a(a);
            ArrayDeque arrayDeque = ici.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a);
            }
            old oldVar2 = (old) a2;
            if (oldVar2 == null) {
                hciVar.d(ici.a(oldVar), oldVar);
            } else {
                oldVar = oldVar2;
            }
        }
        return new jci(oldVar, new w7e(oldVar, ((Integer) pwjVar.c(b)).intValue()));
    }

    @Override // defpackage.kci
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
