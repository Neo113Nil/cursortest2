package defpackage;

/* loaded from: classes5.dex */
public final class lc3 extends b6 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc3(String str, Object obj, int i) {
        super(obj, str);
        this.d = i;
    }

    @Override // defpackage.b6
    public final Object E(q1f q1fVar) {
        switch (this.d) {
            case 0:
                q1fVar.getClass();
                if (q1fVar.a == r1f.d) {
                    return Boolean.valueOf(((mc3) q1fVar).b);
                }
                return null;
            default:
                q1fVar.getClass();
                if (q1fVar.a == r1f.c) {
                    return ((jkr) q1fVar).b;
                }
                return null;
        }
    }

    @Override // defpackage.b6
    public final q1f J(Object obj) {
        switch (this.d) {
            case 0:
                return new mc3(((Boolean) obj).booleanValue());
            default:
                return new jkr((String) obj);
        }
    }
}
