package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class qg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0w b;
    public final /* synthetic */ kyg c;

    public /* synthetic */ qg3(h0w h0wVar, kyg kygVar, int i) {
        this.a = i;
        this.b = h0wVar;
        this.c = kygVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h0w h0wVar = this.b;
                kyg kygVar = this.c;
                xg3 xg3Var = (xg3) h0wVar.c;
                int i = tw21.a;
                xg3Var.onAudioEnabled(kygVar);
                break;
            default:
                h0w h0wVar2 = this.b;
                kyg kygVar2 = this.c;
                synchronized (kygVar2) {
                }
                xg3 xg3Var2 = (xg3) h0wVar2.c;
                int i2 = tw21.a;
                xg3Var2.onAudioDisabled(kygVar2);
                break;
        }
    }
}
