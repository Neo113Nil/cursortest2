package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class yk0 implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yk0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    @Override // defpackage.na8
    public final void a() {
        switch (this.a) {
            case 0:
                s2r s2rVar = (s2r) this.c;
                Object obj = this.b;
                s2rVar.remove(obj);
                ((hl0) this.d).d.k(obj);
                break;
            default:
                ioo iooVar = (ioo) this.c;
                tpi tpiVar = iooVar.b;
                Object obj2 = this.b;
                Object k = tpiVar.k(obj2);
                koo kooVar = (koo) this.d;
                if (k == kooVar) {
                    Map map = iooVar.a;
                    Map d = kooVar.d();
                    if (!d.isEmpty()) {
                        map.put(obj2, d);
                        break;
                    } else {
                        map.remove(obj2);
                        break;
                    }
                }
                break;
        }
    }
}
