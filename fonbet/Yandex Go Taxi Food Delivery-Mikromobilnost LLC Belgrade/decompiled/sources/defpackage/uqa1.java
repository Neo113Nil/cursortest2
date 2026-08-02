package defpackage;

import com.google.android.gms.measurement.internal.j;

/* loaded from: classes11.dex */
public final class uqa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wia1 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ j x;

    public /* synthetic */ uqa1(j jVar, wia1 wia1Var, long j, boolean z, int i) {
        this.a = i;
        this.b = wia1Var;
        this.c = j;
        this.w = z;
        this.x = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.w;
        wia1 wia1Var = this.b;
        j jVar = this.x;
        switch (i) {
            case 0:
                jVar.Kg(wia1Var);
                jVar.Wg(wia1Var, j, z);
                break;
            default:
                jVar.Kg(wia1Var);
                jVar.Wg(wia1Var, j, z);
                break;
        }
    }
}
