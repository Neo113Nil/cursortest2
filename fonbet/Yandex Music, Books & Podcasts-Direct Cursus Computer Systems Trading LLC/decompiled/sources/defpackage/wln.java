package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class wln {
    public final vmn a;
    public final fkn b;

    public wln(vmn vmnVar) {
        vmnVar.getClass();
        this.a = vmnVar;
        this.b = vmnVar.m;
    }

    public final void a() {
        vmn vmnVar = this.a;
        vmnVar.getClass();
        Continuation continuation = null;
        ssg.a(3, "RecognitionViewModel", "starting recognition", null);
        rar rarVar = vmnVar.n;
        if (rarVar == null || !rarVar.b()) {
            vmnVar.n = x97.y(ot0.F(vmnVar), dm6.b, null, new g2l(vmnVar, continuation, 25), 2);
        } else {
            ssg.a(3, "RecognitionViewModel", "already in progress", null);
        }
    }
}
