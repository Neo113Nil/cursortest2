package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.t;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ctg implements Parcelable {
    public static final Parcelable.Creator<ctg> CREATOR = new pnf(5);
    public ytg[] a;
    public int b;
    public ftg c;
    public g8c d;
    public qzc e;
    public boolean f;
    public atg g;
    public HashMap h;
    public HashMap i;
    public gtg j;
    public int k;
    public int l;

    public static String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final void a(String str, String str2, boolean z) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        if (this.h.containsKey(str) && z) {
            str2 = vz1.s(new StringBuilder(), (String) this.h.get(str), StringUtils.COMMA, str2);
        }
        this.h.put(str, str2);
    }

    public final boolean d() {
        if (this.f) {
            return true;
        }
        if (this.c.l().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.f = true;
            return true;
        }
        t l = this.c.l();
        e(btg.b(this.g, l.getString(R.string.com_facebook_internet_permission_error_title), l.getString(R.string.com_facebook_internet_permission_error_message), null));
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(btg btgVar) {
        ctg ctgVar;
        ytg g = g();
        if (g != null) {
            ctgVar = this;
            ctgVar.j(g.j(), hrg.d(btgVar.a), btgVar.d, btgVar.e, g.a);
        } else {
            ctgVar = this;
        }
        HashMap hashMap = ctgVar.h;
        if (hashMap != null) {
            btgVar.g = hashMap;
        }
        HashMap hashMap2 = ctgVar.i;
        if (hashMap2 != null) {
            btgVar.h = hashMap2;
        }
        ctgVar.a = null;
        ctgVar.b = -1;
        ctgVar.g = null;
        ctgVar.h = null;
        ctgVar.k = 0;
        ctgVar.l = 0;
        g8c g8cVar = ctgVar.d;
        if (g8cVar != null) {
            ftg ftgVar = (ftg) g8cVar.a;
            ftgVar.i = null;
            int i = btgVar.a == 2 ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", btgVar);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            if (ftgVar.isAdded()) {
                ftgVar.l().setResult(i, intent);
                ftgVar.l().finish();
            }
        }
    }

    public final void f(btg btgVar) {
        btg btgVar2;
        if (btgVar.b != null) {
            Date date = ja.l;
            if (n7w.P()) {
                ja jaVar = btgVar.b;
                if (jaVar == null) {
                    throw new c3c("Can't validate without a token");
                }
                ja N = n7w.N();
                if (N != null) {
                    try {
                        if (N.i.equals(jaVar.i)) {
                            btgVar2 = new btg(this.g, 1, jaVar, btgVar.c, null, null);
                            e(btgVar2);
                            return;
                        }
                    } catch (Exception e) {
                        e(btg.b(this.g, "Caught exception", e.getMessage(), null));
                        return;
                    }
                }
                btgVar2 = btg.b(this.g, "User logged in as different Facebook user.", null, null);
                e(btgVar2);
                return;
            }
        }
        e(btgVar);
    }

    public final ytg g() {
        int i = this.b;
        if (i >= 0) {
            return this.a[i];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2.equals(r3.g.d) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gtg i() {
        gtg gtgVar = this.j;
        if (gtgVar != null) {
            String str = null;
            if (!bp6.a.contains(gtgVar)) {
                try {
                    str = gtgVar.b;
                } catch (Throwable th) {
                    bp6.a(gtgVar, th);
                }
            }
        }
        this.j = new gtg(this.c.l(), this.g.d);
        return this.j;
    }

    public final void j(String str, String str2, String str3, String str4, Map map) {
        if (this.g == null) {
            i().a("fb_mobile_login_method_complete", str);
            return;
        }
        gtg i = i();
        atg atgVar = this.g;
        String str5 = atgVar.e;
        String str6 = atgVar.m ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete";
        i.getClass();
        if (bp6.a.contains(i)) {
            return;
        }
        try {
            Bundle b = gtg.b(str5);
            b.putString("2_result", str2);
            if (str3 != null) {
                b.putString("5_error_message", str3);
            }
            if (str4 != null) {
                b.putString("4_error_code", str4);
            }
            if (map != null && !map.isEmpty()) {
                b.putString("6_extras", new JSONObject(map).toString());
            }
            b.putString("3_method", str);
            i.a.l(b, str6);
        } catch (Throwable th) {
            bp6.a(i, th);
        }
    }

    public final void k() {
        ctg ctgVar;
        int i;
        if (this.b >= 0) {
            ctgVar = this;
            ctgVar.j(g().j(), "skipped", null, null, g().a);
        } else {
            ctgVar = this;
        }
        while (true) {
            ytg[] ytgVarArr = ctgVar.a;
            if (ytgVarArr == null || (i = ctgVar.b) >= ytgVarArr.length - 1) {
                break;
            }
            ctgVar.b = i + 1;
            ytg g = g();
            g.getClass();
            if (!(g instanceof pev) || d()) {
                int n = g.n(ctgVar.g);
                ctgVar.k = 0;
                if (n > 0) {
                    gtg i2 = i();
                    String str = ctgVar.g.e;
                    String j = g.j();
                    String str2 = ctgVar.g.m ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                    i2.getClass();
                    if (!bp6.a.contains(i2)) {
                        try {
                            Bundle b = gtg.b(str);
                            b.putString("3_method", j);
                            i2.a.l(b, str2);
                        } catch (Throwable th) {
                            bp6.a(i2, th);
                        }
                    }
                    ctgVar.l = n;
                } else {
                    gtg i3 = i();
                    String str3 = ctgVar.g.e;
                    String j2 = g.j();
                    String str4 = ctgVar.g.m ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                    i3.getClass();
                    if (!bp6.a.contains(i3)) {
                        try {
                            Bundle b2 = gtg.b(str3);
                            b2.putString("3_method", j2);
                            i3.a.l(b2, str4);
                        } catch (Throwable th2) {
                            bp6.a(i3, th2);
                        }
                    }
                    a("not_tried", g.j(), true);
                }
                if (n > 0) {
                    return;
                }
            } else {
                a("no_internet_permission", "1", false);
            }
        }
        atg atgVar = ctgVar.g;
        if (atgVar != null) {
            e(btg.b(atgVar, "Login attempt failed.", null, null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.g, i);
        gvt.Z(parcel, this.h);
        gvt.Z(parcel, this.i);
    }
}
