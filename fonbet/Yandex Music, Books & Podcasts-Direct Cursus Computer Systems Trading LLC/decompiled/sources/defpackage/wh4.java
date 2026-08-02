package defpackage;

import android.os.SystemClock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class wh4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi4 b;

    public /* synthetic */ wh4(fi4 fi4Var, int i) {
        this.a = i;
        this.b = fi4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                fi4 fi4Var = this.b;
                fi4Var.h.sendEvent("wm_chat_data_loaded", tah.b(new Pair("intent_page", yh4.b)));
                fi4Var.E = true;
                fi4Var.k();
                t1f t1fVar = fi4Var.q;
                b2k b2kVar = (b2k) t1fVar.d;
                if (b2kVar != null) {
                    b2kVar.f = Long.valueOf(SystemClock.elapsedRealtime());
                }
                fi4Var.j(bi4.s);
                a2k a2kVar = (a2k) t1fVar.c;
                if (a2kVar != null) {
                    a2kVar.b = Long.valueOf(SystemClock.elapsedRealtime());
                }
                if (str != null) {
                    fi4Var.a(str);
                }
                return Unit.a;
            case 1:
                fi4 fi4Var2 = this.b;
                fi4Var2.h.sendEvent("wm_chat_list_data_loaded", tah.b(new Pair("intent_page", yh4.a)));
                fi4Var2.F = true;
                fi4Var2.k();
                fi4Var2.j(bi4.s);
                return Unit.a;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                fi4 fi4Var3 = this.b;
                jtc jtcVar = fi4Var3.B;
                if (jtcVar == null) {
                    Intrinsics.j("jsExecutor");
                    throw null;
                }
                nnd nndVar = fi4Var3.e().a;
                nndVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "setVisibility");
                jSONObject.put("data", new JSONObject().put("visible", booleanValue));
                jtc.v(jtcVar, t3f.b(nnd.J(nndVar, b0i.Request, jSONObject, null)));
                fi4Var3.G = booleanValue;
                fi4Var3.h.sendEvent("wm_visibility_updated", uah.e(new Pair("isVisible", bool), new Pair("tag", "music")));
                fi4Var3.k();
                return Unit.a;
        }
    }
}
