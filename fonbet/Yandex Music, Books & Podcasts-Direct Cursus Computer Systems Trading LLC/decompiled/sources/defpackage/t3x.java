package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final /* synthetic */ class t3x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4x b;

    public /* synthetic */ t3x(b4x b4xVar, int i) {
        this.a = i;
        this.b = b4xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                msg msgVar = b4x.i;
                b4x b4xVar = this.b;
                Log.i(msgVar.a, msgVar.d("transfer with type = %d has timed out", Integer.valueOf(b4xVar.e)));
                b4xVar.b(101);
                break;
            default:
                b4x b4xVar2 = this.b;
                kpm kpmVar = new kpm(26, b4xVar2);
                jmp jmpVar = b4xVar2.f;
                y1g.G(jmpVar);
                jmpVar.a(kpmVar);
                break;
        }
    }
}
