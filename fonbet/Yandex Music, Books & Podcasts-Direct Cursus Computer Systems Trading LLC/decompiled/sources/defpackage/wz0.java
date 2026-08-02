package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class wz0 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public wz0(Function2 function2) {
        this.a = 4;
        this.b = (h7o) function2;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [h7o, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return zc4.H((Object[]) this.b);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return new ora(this);
            case 3:
                return new l7g(this);
            case 4:
                return dhp.a((h7o) this.b);
            case 5:
                return (Iterator) this.b;
            case 6:
                return new fhp((Pair) this.b);
            case 7:
                return new k7g((CharSequence) this.b);
            default:
                return new c7(8, (ViewGroup) this.b);
        }
    }

    public /* synthetic */ wz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
