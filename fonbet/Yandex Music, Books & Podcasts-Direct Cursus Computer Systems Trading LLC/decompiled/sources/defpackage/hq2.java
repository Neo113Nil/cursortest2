package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class hq2 extends qon {
    public final ArrayList d = new ArrayList(16);
    public aze e;
    public uvg f;

    @Override // defpackage.qon
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.qon
    public final long d(int i) {
        return i;
    }

    @Override // defpackage.qon
    public void j(opn opnVar, int i) {
        View view = opnVar.a;
        view.setOnClickListener(new fq2(0, this, opnVar));
        view.setOnLongClickListener(new gq2(this, opnVar));
    }
}
