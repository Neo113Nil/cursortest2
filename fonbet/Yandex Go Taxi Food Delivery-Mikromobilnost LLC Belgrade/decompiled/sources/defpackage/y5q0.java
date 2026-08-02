package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class y5q0 extends z5q0 {
    public final g4q0 a;
    public final b5t0 b;
    public final b5t0 c;

    public /* synthetic */ y5q0(g4q0 g4q0Var, b5t0 b5t0Var, b5t0 b5t0Var2, int i) {
        this(g4q0Var, (i & 2) != 0 ? new b5t0(0) : b5t0Var, (i & 4) != 0 ? new b5t0(0) : b5t0Var2);
    }

    public final g4q0 a() {
        return this.a;
    }

    public final b5t0 b() {
        return this.c;
    }

    public final b5t0 c() {
        return this.b;
    }

    public final String toString() {
        return "UpdateSnippetsCommand(sectionTarget=" + this.a + ", snippetsToShow=" + this.b + ", snippetsToHide=" + this.c + Extension.C_BRAKE;
    }

    public y5q0(g4q0 g4q0Var, b5t0 b5t0Var, b5t0 b5t0Var2) {
        this.a = g4q0Var;
        this.b = b5t0Var;
        this.c = b5t0Var2;
    }
}
