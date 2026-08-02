package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class tww extends exw {
    public final WeakReference a;

    public tww(uww uwwVar) {
        this.a = new WeakReference(uwwVar);
    }

    @Override // defpackage.exw
    public final void a() {
        uww uwwVar = (uww) this.a.get();
        if (uwwVar == null) {
            return;
        }
        uww.j(uwwVar);
    }
}
