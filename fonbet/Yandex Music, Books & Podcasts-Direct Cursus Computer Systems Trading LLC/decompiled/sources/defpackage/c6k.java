package defpackage;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class c6k extends p1g {
    public final /* synthetic */ int a;
    public final String b;
    public final pj3 c;
    public final boolean d;

    public c6k(String str, boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                pj3 pj3Var = pj3.b;
                Objects.requireNonNull(str, "name == null");
                this.b = str;
                this.c = pj3Var;
                this.d = z;
                break;
            default:
                pj3 pj3Var2 = pj3.b;
                Objects.requireNonNull(str, "name == null");
                this.b = str;
                this.c = pj3Var2;
                this.d = z;
                break;
        }
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        switch (this.a) {
            case 0:
                if (obj != null) {
                    this.c.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        j0oVar.a(this.b, obj2, this.d);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.c.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        j0oVar.d(this.b, obj3, this.d);
                        break;
                    }
                }
                break;
        }
    }
}
