package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class jle implements kle {
    public static final jle b = new jle(0);
    public final /* synthetic */ int a;

    public /* synthetic */ jle(int i) {
        this.a = i;
    }

    @Override // defpackage.kle
    public final lke a(List list) {
        Object obj;
        int i = this.a;
        list.getClass();
        switch (i) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((lke) obj) instanceof fyq) {
                        }
                    } else {
                        obj = null;
                    }
                }
                lke lkeVar = (lke) obj;
                if (lkeVar == null || !((Boolean) lkeVar.getVisibility().getValue()).booleanValue()) {
                    return null;
                }
                return lkeVar;
        }
    }
}
