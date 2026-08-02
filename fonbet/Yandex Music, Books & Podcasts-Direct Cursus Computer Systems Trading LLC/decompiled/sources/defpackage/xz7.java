package defpackage;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xz7 implements lod {
    public final /* synthetic */ int a;
    public final /* synthetic */ b08 b;

    public /* synthetic */ xz7(b08 b08Var, int i) {
        this.a = i;
        this.b = b08Var;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        switch (this.a) {
            case 0:
                b08 b08Var = this.b;
                if (!b08Var.o) {
                    g3c g3cVar = rodVar.d;
                    if (g3cVar != null) {
                        b08Var.D(g3cVar.b);
                        break;
                    } else {
                        JSONObject jSONObject = rodVar.c;
                        a08 a08Var = new a08();
                        try {
                            String string = jSONObject.getString("user_code");
                            a08Var.b = string;
                            a08Var.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", string);
                            a08Var.c = jSONObject.getString("code");
                            a08Var.d = jSONObject.getLong("interval");
                            b08Var.G(a08Var);
                            break;
                        } catch (JSONException e) {
                            b08Var.D(new c3c(e));
                            return;
                        }
                    }
                }
                break;
            default:
                if (!this.b.k.get()) {
                    g3c g3cVar2 = rodVar.d;
                    if (g3cVar2 != null) {
                        int i = g3cVar2.e;
                        if (i == 1349152) {
                            if (this.b.n != null) {
                                h18.a(this.b.n.b);
                            }
                            b08 b08Var2 = this.b;
                            atg atgVar = b08Var2.q;
                            if (atgVar == null) {
                                b08Var2.B();
                                break;
                            } else {
                                b08Var2.H(atgVar);
                                break;
                            }
                        } else {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    this.b.F();
                                    break;
                                case 1349173:
                                    this.b.B();
                                    break;
                                default:
                                    this.b.D(g3cVar2.b);
                                    break;
                            }
                        }
                    } else {
                        try {
                            JSONObject jSONObject2 = rodVar.c;
                            b08.y(this.b, jSONObject2.getString("access_token"), Long.valueOf(jSONObject2.getLong("expires_in")), Long.valueOf(jSONObject2.optLong("data_access_expiration_time")));
                            break;
                        } catch (JSONException e2) {
                            this.b.D(new c3c(e2));
                        }
                    }
                }
                break;
        }
    }
}
