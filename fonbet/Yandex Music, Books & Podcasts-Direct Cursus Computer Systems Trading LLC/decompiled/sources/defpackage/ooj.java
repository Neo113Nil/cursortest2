package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ooj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final jib d;
    public final Function1 e;

    public ooj(coj cojVar, Function1 function1, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        cojVar = (i & 16) != 0 ? null : cojVar;
        function1 = (i & 32) != 0 ? null : function1;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = cojVar;
        this.e = function1;
    }
}
