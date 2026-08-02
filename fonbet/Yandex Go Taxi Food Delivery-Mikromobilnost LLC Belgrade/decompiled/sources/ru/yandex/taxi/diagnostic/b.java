package ru.yandex.taxi.diagnostic;

import android.view.ViewGroup;
import defpackage.lz60;
import defpackage.qcj;
import defpackage.tje;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class b implements lz60 {
    public final qcj a;
    public final ViewGroup b;

    public b(qcj qcjVar, ViewGroup viewGroup) {
        this.a = qcjVar;
        this.b = viewGroup;
    }

    @Override // defpackage.lz60
    public final void g() {
        qcj qcjVar = this.a;
        String Hg = ((h) qcjVar.b).Hg();
        if (Hg != null && qcjVar.d.c.b().f("FIELD_DIAGNOSTIC_MODE_ENABLED")) {
            tje.N(qcjVar.a, null, null, new DiagnosticRouter$initDiagnosticIfRequired$1(qcjVar, this.b, Hg, null), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "diagnostic";
    }
}
