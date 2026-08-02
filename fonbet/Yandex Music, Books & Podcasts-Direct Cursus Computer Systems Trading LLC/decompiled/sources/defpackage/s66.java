package defpackage;

/* loaded from: classes.dex */
public final class s66 extends e0h {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s66(t66 t66Var) {
        super(25);
        this.b = t66Var;
    }

    @Override // defpackage.e0h
    public Object create(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((t66) this.b).a.D0(str);
            default:
                return super.create(obj);
        }
    }

    @Override // defpackage.e0h
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                cko ckoVar = (cko) obj2;
                ckoVar.getClass();
                ckoVar.close();
                break;
            default:
                ykn yknVar = (ykn) obj2;
                ((j4x) ((nnd) this.b).b).C((xwh) obj, yknVar.a, yknVar.b, yknVar.c);
                break;
        }
    }

    @Override // defpackage.e0h
    public int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return ((ykn) obj2).c;
            default:
                return super.sizeOf(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s66(int i, nnd nndVar) {
        super(i);
        this.b = nndVar;
    }
}
