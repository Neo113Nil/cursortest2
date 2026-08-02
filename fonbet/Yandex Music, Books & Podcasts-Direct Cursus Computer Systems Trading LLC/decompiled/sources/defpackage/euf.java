package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class euf {
    public final Function1 a;
    public final xdh b = new xdh(28);
    public sfm c;

    public euf(Function1 function1) {
        this.a = function1;
    }

    public final duf a(int i, long j) {
        sfm sfmVar = this.c;
        if (sfmVar == null) {
            return jsa.a;
        }
        rmm rmmVar = new rmm(sfmVar, i, j, this.b);
        ((smm) sfmVar.c).c(rmmVar);
        return rmmVar;
    }
}
