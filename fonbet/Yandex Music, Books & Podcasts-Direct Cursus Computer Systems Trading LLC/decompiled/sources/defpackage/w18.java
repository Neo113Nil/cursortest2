package defpackage;

import android.view.View;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public final class w18 extends ltc {
    public final /* synthetic */ ltc a;
    public final /* synthetic */ i b;

    public w18(i iVar, ltc ltcVar) {
        this.b = iVar;
        this.a = ltcVar;
    }

    @Override // defpackage.ltc
    public final View b(int i) {
        ltc ltcVar = this.a;
        return ltcVar.c() ? ltcVar.b(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.ltc
    public final boolean c() {
        return this.a.c() || this.b.onHasView();
    }
}
