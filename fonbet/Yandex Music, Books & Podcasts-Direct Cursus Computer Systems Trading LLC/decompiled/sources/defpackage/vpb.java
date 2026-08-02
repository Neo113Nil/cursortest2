package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class vpb {
    public static final vpb b = new vpb(new g8t((y3c) null, (ysq) null, (bc4) null, (ocg) null, (LinkedHashMap) null, 63));
    public static final vpb c = new vpb(new g8t((y3c) null, (ysq) null, (bc4) null, (ocg) null, (LinkedHashMap) null, 47));
    public final g8t a;

    public vpb(g8t g8tVar) {
        this.a = g8tVar;
    }

    public final vpb a(vpb vpbVar) {
        g8t g8tVar = vpbVar.a;
        y3c y3cVar = g8tVar.a;
        g8t g8tVar2 = this.a;
        if (y3cVar == null) {
            y3cVar = g8tVar2.a;
        }
        ysq ysqVar = g8tVar.b;
        if (ysqVar == null) {
            ysqVar = g8tVar2.b;
        }
        bc4 bc4Var = g8tVar.c;
        if (bc4Var == null) {
            bc4Var = g8tVar2.c;
        }
        return new vpb(new g8t(y3cVar, ysqVar, bc4Var, (ocg) null, g8tVar.d || g8tVar2.d, uah.i(g8tVar2.e, g8tVar.e)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vpb) && ((vpb) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        g8t g8tVar = this.a;
        y3c y3cVar = g8tVar.a;
        sb.append(y3cVar != null ? y3cVar.toString() : null);
        sb.append(",\nSlide - ");
        ysq ysqVar = g8tVar.b;
        sb.append(ysqVar != null ? ysqVar.toString() : null);
        sb.append(",\nShrink - ");
        bc4 bc4Var = g8tVar.c;
        sb.append(bc4Var != null ? bc4Var.toString() : null);
        sb.append(",\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(g8tVar.d);
        return sb.toString();
    }
}
