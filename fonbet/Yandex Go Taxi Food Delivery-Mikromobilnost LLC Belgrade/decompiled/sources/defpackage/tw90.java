package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class tw90 implements b70 {
    public static final List a = scc.g("badgeText", "subtitleText");

    public static rw90 c(xdx xdxVar, c cVar) {
        Object b;
        Object b2;
        pw90 pw90Var = null;
        qw90 qw90Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                sw90 sw90Var = sw90.a;
                foe foeVar = l80.a;
                ep60 ep60Var = new ep60(sw90Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = ep60Var.b(xdxVar, cVar);
                }
                pw90Var = (pw90) b2;
            } else {
                if (h2 != 1) {
                    return new rw90(pw90Var, qw90Var);
                }
                uw90 uw90Var = uw90.a;
                foe foeVar2 = l80.a;
                ep60 ep60Var2 = new ep60(uw90Var, true);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = ep60Var2.b(xdxVar, cVar);
                }
                qw90Var = (qw90) b;
            }
        }
    }
}
