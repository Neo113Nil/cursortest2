package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class szk implements kd {
    public final /* synthetic */ int a;
    public final /* synthetic */ yzk b;

    public /* synthetic */ szk(yzk yzkVar, int i) {
        this.a = i;
        this.b = yzkVar;
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public final void mo33b(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                yzk yzkVar = this.b;
                x97.y(yzkVar.a, null, null, new wzk(yzkVar, th, null, 0), 3);
                break;
            default:
                yzk yzkVar2 = this.b;
                x97.y(yzkVar2.a, null, null, new wzk(yzkVar2, th, null, 1), 3);
                break;
        }
    }
}
