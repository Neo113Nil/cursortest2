package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class nkx {
    public Serializable a;
    public omx b;
    public unx c;
    public boolean d;

    public final void finalize() {
        unx unxVar;
        omx omxVar = this.b;
        if (omxVar != null) {
            bmx bmxVar = omxVar.b;
            if (!bmxVar.isDone()) {
                if (tjx.f.R(bmxVar, null, new odx(new h6("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 7)))) {
                    tjx.d(bmxVar);
                }
            }
        }
        if (this.d || (unxVar = this.c) == null) {
            return;
        }
        unxVar.i(null);
    }
}
