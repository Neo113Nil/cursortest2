package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class yeg implements b70 {
    public static final List a = Collections.singletonList("backgroundColors");

    public static peg c(xdx xdxVar, c cVar) {
        Object b;
        meg megVar = null;
        while (xdxVar.h2(a) == 0) {
            ueg uegVar = ueg.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(uegVar, true);
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b = null;
            } else {
                b = ep60Var.b(xdxVar, cVar);
            }
            megVar = (meg) b;
        }
        return new peg(megVar);
    }
}
