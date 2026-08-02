package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class vz0 implements Iterable, j9f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new c7((Object[]) this.b);
            case 1:
                int[] iArr = (int[]) this.b;
                iArr.getClass();
                return new ky0(iArr);
            case 2:
                return new ora((Iterator) ((Function0) this.b).invoke());
            case 3:
                return new j1f((w55) this.b);
            case 4:
                return ((Sequence) this.b).iterator();
            case 5:
                return new c7((pdb) this.b);
            default:
                return new c7(3, (q4r) this.b);
        }
    }
}
