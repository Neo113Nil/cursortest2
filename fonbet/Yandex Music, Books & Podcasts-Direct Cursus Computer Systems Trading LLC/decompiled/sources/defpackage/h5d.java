package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class h5d implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ h5d(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new g5d(this);
            case 1:
                Collection v = z75.v((Iterable) this.b);
                boolean isEmpty = v.isEmpty();
                wz0 wz0Var = (wz0) this.c;
                return isEmpty ? ((Iterable) wz0Var.b).iterator() : new kcc(new lcc(wz0Var, false, new mjm(23, v)));
            default:
                return new g5d(this, (byte) 0);
        }
    }
}
