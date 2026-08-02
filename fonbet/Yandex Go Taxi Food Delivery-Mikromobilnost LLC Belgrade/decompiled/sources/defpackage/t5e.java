package defpackage;

import coil.memory.MemoryCache$Key;

/* loaded from: classes10.dex */
public final class t5e extends mzz {
    public final /* synthetic */ int g = 2;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5e(u5e u5eVar) {
        super(25);
        this.h = u5eVar;
    }

    @Override // defpackage.mzz
    public Object a(Object obj) {
        switch (this.g) {
            case 0:
                return ((u5e) this.h).a.T0((String) obj);
            case 1:
                return null;
            default:
                return super.a(obj);
        }
    }

    @Override // defpackage.mzz
    public final void b(boolean z, Object obj, Object obj2, Object obj3) {
        int i = this.g;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((ull0) obj2).close();
                break;
            case 1:
                i1p i1pVar = (i1p) obj3;
                i1p i1pVar2 = (i1p) obj2;
                h1p h1pVar = (h1p) obj;
                j1p j1pVar = (j1p) obj4;
                hst hstVar = jst.e;
                if (!z) {
                    if (!z && i1pVar != null) {
                        j1pVar.a(i1pVar2, "Destroy " + i1pVar2 + ". Key " + h1pVar + ". Reason: rewrite");
                        break;
                    }
                } else {
                    j1pVar.a(i1pVar2, "Destroy " + i1pVar2 + ". Key " + h1pVar + ". Reason: evicted");
                    break;
                }
                break;
            default:
                ldi0 ldi0Var = (ldi0) obj2;
                ((w941) ((yxf0) obj4).a).c((MemoryCache$Key) obj, ldi0Var.a, ldi0Var.b, ldi0Var.c);
                break;
        }
    }

    @Override // defpackage.mzz
    public int g(Object obj, Object obj2) {
        switch (this.g) {
            case 1:
                return 1;
            case 2:
                return ((ldi0) obj2).c;
            default:
                return super.g(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5e(j1p j1pVar) {
        super(5);
        this.h = j1pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5e(int i, yxf0 yxf0Var) {
        super(i);
        this.h = yxf0Var;
    }
}
