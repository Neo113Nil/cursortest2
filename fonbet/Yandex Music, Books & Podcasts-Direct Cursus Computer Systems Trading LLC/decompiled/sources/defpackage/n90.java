package defpackage;

/* loaded from: classes3.dex */
public final class n90 implements rwo {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rwo
    public final float a(float f) {
        switch (this.a) {
            case 0:
                p90 p90Var = (p90) this.b;
                float e = p90Var.H.e(f);
                float e2 = e - p90Var.H.j.e();
                ((ca0) this.c).a(e, 0.0f);
                return e2;
            default:
                iyo iyoVar = (iyo) this.b;
                if (Math.abs(f) != 0.0f && ((f > 0.0f && !iyoVar.a.d()) || ((f < 0.0f && !iyoVar.a.c()) || !((Boolean) iyoVar.g.invoke()).booleanValue()))) {
                    throw new oic("The fling animation was cancelled", 0);
                }
                return iyoVar.c(iyoVar.f(((hyo) this.c).a(2, iyoVar.d(iyoVar.g(f)))));
        }
    }
}
