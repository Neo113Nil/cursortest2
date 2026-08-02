package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class es8 extends nq2 {
    public final /* synthetic */ int b;
    public final ovn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es8(ovn ovnVar, int i) {
        super(ovnVar);
        this.b = i;
        this.c = ovnVar;
    }

    @Override // defpackage.nq2
    public boolean i(Uri uri, JSONObject jSONObject) {
        switch (this.b) {
            case 1:
                zs8 zs8Var = (zs8) this.c;
                if (!Intrinsics.d(uri != null ? uri.getScheme() : null, "paywall-option")) {
                    return false;
                }
                String authority = uri.getAuthority();
                if (authority != null) {
                    int hashCode = authority.hashCode();
                    if (hashCode != -187360406) {
                        if (hashCode != -86089389) {
                            if (hashCode == 94756344 && authority.equals("close")) {
                                zs8Var.getClass();
                                ((rvj) zs8Var.p).a();
                                return true;
                            }
                        } else if (authority.equals("start_payment_onetap")) {
                            ((rvj) zs8Var.p).b(true);
                            return true;
                        }
                    } else if (authority.equals("start_payment_ui")) {
                        ((rvj) zs8Var.p).b(false);
                        return true;
                    }
                }
                su4.s(2, null, k5r.k(uri, "unknown div action "), null);
                return false;
            default:
                return super.i(uri, jSONObject);
        }
    }

    @Override // defpackage.nq2
    public boolean j(String str) {
        switch (this.b) {
            case 0:
                zs8 zs8Var = (zs8) this.c;
                if (str.equals("start_payment_ui")) {
                    zs8Var.S(false);
                    return true;
                }
                if (!str.equals("start_payment_onetap")) {
                    return false;
                }
                zs8Var.S(true);
                return true;
            default:
                return super.j(str);
        }
    }
}
