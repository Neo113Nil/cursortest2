package defpackage;

/* loaded from: classes.dex */
public final class bmx extends tjx {
    public final /* synthetic */ omx h;

    public bmx(omx omxVar) {
        this.h = omxVar;
    }

    @Override // defpackage.tjx
    public final String c() {
        nkx nkxVar = (nkx) this.h.a.get();
        return nkxVar == null ? "Completer object has been garbage collected, future will fail soon" : hrg.q("tag=[", String.valueOf(nkxVar.a), "]");
    }
}
