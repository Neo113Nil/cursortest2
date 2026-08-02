package defpackage;

import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;

/* loaded from: classes6.dex */
public final class soj0 {
    public final upj0 a;
    public final boolean b;
    public final jmw0 c;
    public final TariffInfoGroupDefinition d;
    public final tej0 e;

    public soj0(upj0 upj0Var, jmw0 jmw0Var, TariffInfoGroupDefinition tariffInfoGroupDefinition, tej0 tej0Var, int i) {
        upj0Var = (i & 1) != 0 ? null : upj0Var;
        boolean z = (i & 2) == 0;
        jmw0Var = (i & 4) != 0 ? null : jmw0Var;
        tariffInfoGroupDefinition = (i & 8) != 0 ? null : tariffInfoGroupDefinition;
        tej0Var = (i & 16) != 0 ? null : tej0Var;
        this.a = upj0Var;
        this.b = z;
        this.c = jmw0Var;
        this.d = tariffInfoGroupDefinition;
        this.e = tej0Var;
    }

    public soj0() {
        this(null, null, null, null, 31);
    }
}
