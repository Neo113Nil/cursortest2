package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class z2l {
    public final w53 a = new w53();

    public final List a(zmk zmkVar, String str) {
        g3l g3lVar = (g3l) this.a.get(zmkVar);
        if (g3lVar == null) {
            return null;
        }
        return (List) g3lVar.a.get(str);
    }
}
