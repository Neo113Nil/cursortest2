package defpackage;

import androidx.media3.session.i;

/* loaded from: classes.dex */
public final /* synthetic */ class gth implements kth, fvh {
    public final /* synthetic */ int a;
    public final /* synthetic */ yde b;

    public /* synthetic */ gth(yde ydeVar, int i) {
        this.a = i;
        this.b = ydeVar;
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        switch (this.a) {
            case 0:
                vrhVar.i(this.b, i);
                break;
            default:
                vrhVar.c(this.b, i);
                break;
        }
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        return iVar.m(wrhVar, this.b);
    }
}
