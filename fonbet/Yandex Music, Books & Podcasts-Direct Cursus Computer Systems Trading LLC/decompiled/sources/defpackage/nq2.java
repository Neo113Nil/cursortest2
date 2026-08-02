package defpackage;

import android.net.Uri;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class nq2 extends eg8 {
    public final ovn a;

    public nq2(ovn ovnVar) {
        this.a = ovnVar;
    }

    public static boolean f(nq2 nq2Var, bd8 bd8Var, w0a w0aVar, xzb xzbVar) {
        return super.a(bd8Var, w0aVar, xzbVar);
    }

    public static boolean g(nq2 nq2Var, wj9 wj9Var, w0a w0aVar, xzb xzbVar) {
        return super.b(wj9Var, w0aVar, xzbVar);
    }

    @Override // defpackage.eg8
    public final boolean a(bd8 bd8Var, w0a w0aVar, xzb xzbVar) {
        bd8Var.getClass();
        w0aVar.getClass();
        xzbVar.getClass();
        szb szbVar = bd8Var.k;
        return h(szbVar != null ? (Uri) szbVar.a(xzb.a) : null, bd8Var.f, new ye(this, bd8Var, w0aVar, xzbVar, 7));
    }

    @Override // defpackage.eg8
    public final boolean b(wj9 wj9Var, w0a w0aVar, xzb xzbVar) {
        w0aVar.getClass();
        xzbVar.getClass();
        szb url = wj9Var.getUrl();
        return h(url != null ? (Uri) url.a(xzb.a) : null, wj9Var.c(), new ye(this, wj9Var, w0aVar, xzbVar, 6));
    }

    @Override // defpackage.eg8
    public final void d(uk8 uk8Var, w0a w0aVar, t1f t1fVar) {
        Object obj;
        String obj2;
        String obj3;
        String str;
        uk8Var.getClass();
        w0aVar.getClass();
        if ((uk8Var instanceof ek8) && t1fVar != null) {
            Serializable Y = t1fVar.Y((JSONObject) t1fVar.b, zct.a);
            Throwable a = z7o.a(Y);
            if (a != null) {
                Exception exc = a instanceof Exception ? (Exception) a : null;
                if (exc != null) {
                    ((y7k) t1fVar.d).a(exc);
                }
            }
            if (Y instanceof t7o) {
                Y = null;
            }
            Map map = (Map) Y;
            if (map == null || (obj = map.get("action_type")) == null || (obj2 = obj.toString()) == null || !obj2.equals("show_erid")) {
                return;
            }
            Object obj4 = map.get("text");
            if (obj4 == null || (obj3 = obj4.toString()) == null || (str = (String) avf.Q(obj3)) == null) {
                dfi.r("show erid div action was called but adv text is empty", "BaseDivActionHandler");
            } else {
                this.a.P(str);
            }
        }
    }

    public final boolean h(Uri uri, JSONObject jSONObject, Function0 function0) {
        String str;
        String C;
        String str2;
        String str3;
        if (Intrinsics.d(uri != null ? uri.getScheme() : null, "div-log")) {
            String authority = uri.getAuthority();
            if (authority != null && (str3 = (String) avf.Q(authority)) != null) {
                cy2 cy2Var = ovn.n;
                if (cy2Var != null) {
                    ot0.L((y60) cy2Var.a.getValue(), str3, jSONObject != null ? jSONObject.toString() : null);
                    return true;
                }
                return true;
            }
            return false;
        }
        boolean d = Intrinsics.d(uri != null ? uri.getScheme() : null, "ym-div-action");
        ovn ovnVar = this.a;
        if (!d) {
            if (!i(uri, jSONObject) && !((Boolean) function0.invoke()).booleanValue()) {
                if (uri != null && (str = (String) avf.Q(uri.toString())) != null) {
                    C = jSONObject != null ? wct.C("action_id", jSONObject) : null;
                    ovnVar.O(str, C != null ? C : "");
                    return true;
                }
                return false;
            }
            return true;
        }
        String authority2 = uri.getAuthority();
        if (authority2 != null && (str2 = (String) avf.Q(authority2)) != null) {
            if (str2.equals("close")) {
                C = jSONObject != null ? wct.C("action_id", jSONObject) : null;
                ovnVar.N(C != null ? C : "");
                return true;
            }
            if (!j(str2)) {
                dfi.r(k5r.k(uri, "unknown div action. actionUri = "), "BaseDivActionHandler");
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean i(Uri uri, JSONObject jSONObject) {
        return false;
    }

    public boolean j(String str) {
        return false;
    }
}
