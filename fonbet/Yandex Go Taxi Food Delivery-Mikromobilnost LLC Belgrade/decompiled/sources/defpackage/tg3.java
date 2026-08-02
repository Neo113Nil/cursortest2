package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class tg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0w b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ tg3(h0w h0wVar, Exception exc, int i) {
        this.a = i;
        this.b = h0wVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Exception exc = this.c;
        h0w h0wVar = this.b;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) h0wVar.c;
                int i2 = tw21.a;
                xg3Var.onAudioCodecError(exc);
                break;
            default:
                xg3 xg3Var2 = (xg3) h0wVar.c;
                int i3 = tw21.a;
                xg3Var2.onAudioSinkError(exc);
                break;
        }
    }
}
