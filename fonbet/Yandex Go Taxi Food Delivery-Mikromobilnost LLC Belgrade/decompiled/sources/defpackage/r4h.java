package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class r4h implements ruy, el7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int w;

    public /* synthetic */ r4h(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.b = obj;
        this.w = i;
        this.c = z;
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.w;
        boolean z = this.c;
        h42 h42Var = (h42) this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onDeviceVolumeChanged(h42Var, i2, z);
                break;
            case 1:
                j42Var.onPlayerStateChanged(h42Var, z, i2);
                break;
            default:
                j42Var.onPlayWhenReadyChanged(h42Var, z, i2);
                break;
        }
    }

    @Override // defpackage.el7
    public Object j(b bVar) {
        ryz0 ryz0Var = (ryz0) this.b;
        ryz0Var.e.execute(new z50(ryz0Var, bVar, this.w, 13));
        return "enableTorch: " + this.c;
    }

    public /* synthetic */ r4h(h42 h42Var, int i, int i2, boolean z) {
        this.a = i2;
        this.b = h42Var;
        this.c = z;
        this.w = i;
    }
}
