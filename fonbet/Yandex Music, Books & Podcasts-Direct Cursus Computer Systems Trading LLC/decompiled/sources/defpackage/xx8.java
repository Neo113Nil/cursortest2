package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xx8 extends x97 {
    public final gs4 n;
    public final ArrayList o = new ArrayList();

    public xx8(gs4 gs4Var) {
        this.n = gs4Var;
    }

    @Override // defpackage.x97
    public final Object L(fb8 fb8Var, xzb xzbVar) {
        List list;
        Object obj;
        JSONObject jSONObject;
        fb8Var.getClass();
        xzbVar.getClass();
        i19 i19Var = fb8Var.c;
        if (((Boolean) i19Var.E.a(xzb.a)).booleanValue() && (list = i19Var.r) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((rx8) obj).a, "lottie")) {
                    break;
                }
            }
            rx8 rx8Var = (rx8) obj;
            if (rx8Var != null && (jSONObject = rx8Var.b) != null) {
                Object opt = jSONObject.opt("lottie_url");
                String str = opt instanceof String ? (String) opt : null;
                if (str != null) {
                    gs4 gs4Var = this.n;
                    this.o.add(((w89) ((jyr) gs4Var.e).getValue()).a((rdk) gs4Var.a, str));
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object s(jc8 jc8Var, xzb xzbVar) {
        jc8Var.getClass();
        xzbVar.getClass();
        return Unit.a;
    }
}
