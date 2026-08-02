package defpackage;

import com.google.common.cache.b;
import java.io.IOException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class yhg extends cig implements myc {
    private static final long serialVersionUID = 1;
    public transient aig D;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        ap3 P = P();
        P.a();
        qzc qzcVar = this.B;
        qzcVar.getClass();
        this.D = new aig(new b(P, qzcVar));
    }

    private Object readResolve() {
        return this.D;
    }

    @Override // defpackage.myc
    public final Object apply(Object obj) {
        return this.D.apply(obj);
    }
}
