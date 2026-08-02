package defpackage;

/* loaded from: classes4.dex */
public final class vmn extends bfu {
    public final iwe k;
    public final xdr l;
    public final fkn m;
    public rar n;

    public vmn(iwe iweVar) {
        this.k = iweVar;
        xdr a = ydr.a(omn.a);
        this.l = a;
        this.m = new fkn(a);
    }

    public final void G() {
        ssg.a(3, "RecognitionViewModel", "stopping recognition", null);
        rar rarVar = this.n;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.n = null;
        iwe iweVar = this.k;
        iweVar.getClass();
        ssg.a(3, "RecognizeAudioCenter", "stopping recognition", null);
        lni lniVar = (lni) ((jyr) iweVar.b).getValue();
        lniVar.getClass();
        ssg.a(3, "MusicMatchRecognitionService", "stop", null);
        lniVar.b();
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        super.onCleared();
        G();
    }
}
