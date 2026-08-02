package defpackage;

import androidx.media3.exoplayer.f;

/* loaded from: classes10.dex */
public final /* synthetic */ class wno implements ruy, suy, foo {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ wno(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.suy
    public void e(Object obj, hfr hfrVar) {
        ((xxc0) obj).onEvents(this.b.f, new wxc0(hfrVar));
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        f fVar = this.b;
        xxc0 xxc0Var = (xxc0) obj;
        switch (i) {
            case 0:
                xxc0Var.onPlaylistMetadataChanged(fVar.S);
                break;
            default:
                xxc0Var.onAvailableCommandsChanged(fVar.Q);
                break;
        }
    }
}
