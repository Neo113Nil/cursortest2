package defpackage;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class vlr implements bwh {
    public boolean a;
    public final /* synthetic */ wlr b;

    public vlr(wlr wlrVar) {
        this.b = wlrVar;
    }

    @Override // defpackage.bwh
    public final void A(int i, uvh uvhVar, cfg cfgVar, boh bohVar, int i2) {
        Uri uri = cfgVar.b;
        apo apoVar = this.b.b;
        int i3 = bohVar.a;
        if (i3 == 4) {
            if (this.a) {
                return;
            }
            this.a = true;
            String uri2 = uri.toString();
            apoVar.n(uri2 != null ? uri2 : "");
            return;
        }
        if (i3 != 1 || this.a) {
            return;
        }
        String uri3 = uri.toString();
        apoVar.n(uri3 != null ? uri3 : "");
    }
}
