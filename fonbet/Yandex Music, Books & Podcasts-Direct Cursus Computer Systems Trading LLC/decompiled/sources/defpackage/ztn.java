package defpackage;

import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class ztn implements df {
    public final /* synthetic */ int a;
    public final Object b;
    public final tf6 c;

    public ztn(a aVar, tf6 tf6Var, int i) {
        this.a = i;
        aVar.getClass();
        switch (i) {
            case 1:
                this.b = aVar;
                this.c = tf6Var;
                break;
            case 2:
                this.b = aVar;
                this.c = tf6Var;
                break;
            default:
                this.b = aVar;
                this.c = tf6Var;
                break;
        }
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        switch (this.a) {
            case 0:
                ytn ytnVar = (ytn) mdVar;
                ytnVar.getClass();
                x97.y(this.c, (a) this.b, null, new seg(dn9Var, ytnVar, (Continuation) null, 24), 2);
                break;
            case 1:
                ant antVar = (ant) mdVar;
                antVar.getClass();
                x97.y(this.c, (a) this.b, null, new n6p(dn9Var, antVar, null, 17), 2);
                break;
            case 2:
                lnt lntVar = (lnt) mdVar;
                lntVar.getClass();
                x97.y(this.c, (a) this.b, null, new n6p(dn9Var, lntVar, null, 18), 2);
                break;
            default:
                fe7 fe7Var = (fe7) mdVar;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                fe7Var.getClass();
                String str = fe7Var.b;
                Object he7Var = str != null ? new he7(str) : new ge7(fe7Var.a);
                r2f r2fVar = (r2f) linkedHashMap.get(he7Var);
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
                linkedHashMap.put(he7Var, x97.y(this.c, null, null, new bv6(fe7Var, dn9Var, null, 18), 3));
                break;
        }
    }

    public ztn(tf6 tf6Var) {
        this.a = 3;
        this.c = tf6Var;
        this.b = new LinkedHashMap();
    }
}
