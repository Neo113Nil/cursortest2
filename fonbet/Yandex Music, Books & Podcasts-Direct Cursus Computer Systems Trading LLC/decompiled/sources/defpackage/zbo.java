package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes4.dex */
public final class zbo extends nco {
    public final Iterator a;

    public zbo(Sequence sequence) {
        sequence.getClass();
        this.a = sequence.iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        ybo yboVar;
        int i;
        if (cg6Var instanceof ybo) {
            yboVar = (ybo) cg6Var;
            int i2 = yboVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yboVar.l = i2 - Integer.MIN_VALUE;
                Object obj = yboVar.j;
                nm6 nm6Var = nm6.a;
                i = yboVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        return Boolean.FALSE;
                    }
                    Iterator it = this.a;
                    if (!it.hasNext()) {
                        return Boolean.FALSE;
                    }
                    long longValue = ((Number) it.next()).longValue();
                    yboVar.l = 1;
                    if (y2x.o(longValue, yboVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.TRUE;
            }
        }
        yboVar = new ybo(this, cg6Var);
        Object obj2 = yboVar.j;
        nm6 nm6Var2 = nm6.a;
        i = yboVar.l;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
