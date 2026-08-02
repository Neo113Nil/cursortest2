package defpackage;

import android.app.AlertDialog;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class pa implements lod {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public pa(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.b = atomicBoolean;
        this.c = hashSet;
        this.d = hashSet2;
        this.e = hashSet3;
    }

    @Override // defpackage.lod
    public final void a(rod rodVar) {
        JSONArray optJSONArray;
        switch (this.a) {
            case 0:
                rodVar.getClass();
                JSONObject jSONObject = rodVar.a;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    ((AtomicBoolean) this.b).set(true);
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("permission");
                            String optString2 = optJSONObject.optString("status");
                            if (!gvt.D(optString) && !gvt.D(optString2)) {
                                optString2.getClass();
                                Locale locale = Locale.US;
                                String s = ouj.s(locale, optString2, locale);
                                int hashCode = s.hashCode();
                                if (hashCode == -1309235419) {
                                    if (s.equals("expired")) {
                                        ((HashSet) this.e).add(optString);
                                    }
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(s));
                                } else if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && s.equals("declined")) {
                                        ((HashSet) this.d).add(optString);
                                    }
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(s));
                                } else {
                                    if (s.equals("granted")) {
                                        ((HashSet) this.c).add(optString);
                                    }
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(s));
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                if (!((b08) this.e).k.get()) {
                    g3c g3cVar = rodVar.d;
                    if (g3cVar != null) {
                        ((b08) this.e).D(g3cVar.b);
                        break;
                    } else {
                        try {
                            JSONObject jSONObject2 = rodVar.c;
                            String string = jSONObject2.getString(ConnectableDevice.KEY_ID);
                            gqt x = gvt.x(jSONObject2);
                            String string2 = jSONObject2.getString("name");
                            h18.a(((b08) this.e).n.b);
                            if (q8c.b(j3c.c()).c.contains(yzq.RequireConfirm)) {
                                b08 b08Var = (b08) this.e;
                                if (!b08Var.p) {
                                    b08Var.p = true;
                                    String str = (String) this.b;
                                    Date date = (Date) this.c;
                                    Date date2 = (Date) this.d;
                                    String string3 = b08Var.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                                    String string4 = b08Var.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                                    String string5 = b08Var.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                                    String format = String.format(string4, string2);
                                    AlertDialog.Builder builder = new AlertDialog.Builder(b08Var.getContext());
                                    builder.setMessage(string3).setCancelable(true).setNegativeButton(format, new zz7(b08Var, string, x, str, date, date2)).setPositiveButton(string5, new yz7(b08Var));
                                    builder.create().show();
                                    break;
                                }
                            }
                            b08.z((b08) this.e, string, x, (String) this.b, (Date) this.c, (Date) this.d);
                            break;
                        } catch (JSONException e) {
                            ((b08) this.e).D(new c3c(e));
                        }
                    }
                }
                break;
        }
    }

    public pa(b08 b08Var, String str, Date date, Date date2) {
        this.e = b08Var;
        this.b = str;
        this.c = date;
        this.d = date2;
    }
}
