package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.PLAQUE_ACTION_PERFORM_STATUS;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class voc0 implements b70 {
    public static final voc0 a = new voc0();
    public static final List b = Collections.singletonList("plaquePerformAction");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("plaquePerformAction");
        g97 g97Var = g97.m;
        foe foeVar = l80.a;
        PLAQUE_ACTION_PERFORM_STATUS plaque_action_perform_status = ((toc0) obj).a;
        if (plaque_action_perform_status == null) {
            bfxVar.k2();
        } else {
            g97Var.a(bfxVar, cVar, plaque_action_perform_status);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        PLAQUE_ACTION_PERFORM_STATUS plaque_action_perform_status = null;
        while (xdxVar.h2(b) == 0) {
            g97 g97Var = g97.m;
            foe foeVar = l80.a;
            if (xdxVar.peek() == JsonReader$Token.NULL) {
                xdxVar.skipValue();
                b2 = null;
            } else {
                b2 = g97Var.b(xdxVar, cVar);
            }
            plaque_action_perform_status = (PLAQUE_ACTION_PERFORM_STATUS) b2;
        }
        return new toc0(plaque_action_perform_status);
    }
}
