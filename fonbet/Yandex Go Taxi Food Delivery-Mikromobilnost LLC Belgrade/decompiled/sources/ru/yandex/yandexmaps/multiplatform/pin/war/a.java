package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.jl40;
import defpackage.pzt0;
import defpackage.qtb1;
import defpackage.r1c0;
import defpackage.s1c0;
import defpackage.tje;
import defpackage.vvb1;
import defpackage.w511;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes7.dex */
public final class a {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public final void a(boolean z) {
        c cVar = (c) this.a;
        if (z) {
            s1c0 s1c0Var = cVar.o;
            if (jl40.l(s1c0Var, qtb1.K)) {
                pzt0 pzt0Var = cVar.y;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                cVar.y = null;
                cVar.i(new PinWar$onCameraPositionChanged$1(cVar, true, null));
                return;
            }
            if (!(s1c0Var instanceof r1c0)) {
                if (jl40.l(s1c0Var, vvb1.K)) {
                    return;
                }
                w511.b();
            } else {
                pzt0 pzt0Var2 = cVar.y;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                pzt0 N = tje.N(cVar.b, null, CoroutineStart.LAZY, new PinWarGo$onCameraPositionChanged$job$1(s1c0Var, cVar, null), 1);
                cVar.y = N;
                N.start();
            }
        }
    }
}
