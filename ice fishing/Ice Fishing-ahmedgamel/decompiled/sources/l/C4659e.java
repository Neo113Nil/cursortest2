package l;

import E2.I;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3302h5;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.CA;
import com.google.android.gms.internal.ads.InterfaceC3248g5;
import h.C4543G;
import h.C4544H;
import i8.C4603a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import m.C0;
import m.InterfaceC4714n;
import m.V0;
import org.json.JSONArray;
import org.json.JSONException;
import r0.InterfaceC4894c;
import t0.AbstractC4987C;
import t0.C4988D;
import t0.Y;
import v7.C5117h;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4659e implements C0, k, m8.w, InterfaceC4894c, Y, InterfaceC3248g5, x2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38687n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38688u;

    public /* synthetic */ C4659e(int i, Object obj) {
        this.f38687n = i;
        this.f38688u = obj;
    }

    public static String B(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean y(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public void A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f38688u;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void C(CA ca) {
        com.google.android.gms.internal.ads.Y y7 = (com.google.android.gms.internal.ads.Y) this.f38688u;
        y7.getClass();
        String str = ca.f24823b;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Vc)).booleanValue()) {
                y7.f29399b = str;
            }
        }
        int i = ca.f24822a;
        switch (i) {
            case 8152:
                y7.d(new HashMap(), "onLMDOverlayOpened");
                break;
            case 8153:
                y7.d(new HashMap(), "onLMDOverlayClicked");
                break;
            case 8155:
                y7.d(new HashMap(), "onLMDOverlayClose");
                break;
            case 8157:
                y7.f29399b = null;
                y7.f29400c = null;
                y7.f29398a = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(i));
                y7.d(hashMap, "onLMDOverlayFailedToOpen");
                break;
        }
    }

    @Override // r0.InterfaceC4894c
    public void a(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f38688u).setResultCode(i);
    }

    @Override // t0.Y
    public int b(View view) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        ((AbstractC4987C) this.f38688u).getClass();
        return (view.getTop() - ((C4988D) view.getLayoutParams()).f40605b.top) - ((ViewGroup.MarginLayoutParams) c4988d).topMargin;
    }

    @Override // m.C0
    public void c(m mVar, o oVar) {
        ((ViewOnKeyListenerC4661g) this.f38688u).f38714y.removeCallbacksAndMessages(mVar);
    }

    @Override // m8.w
    public boolean d(i8.n url) {
        kotlin.jvm.internal.h.e(url, "url");
        return ((m8.s) this.f38688u).d(url);
    }

    @Override // t0.Y
    public int e() {
        return ((AbstractC4987C) this.f38688u).G();
    }

    @Override // m8.w
    public C4603a f() {
        return ((m8.s) this.f38688u).f39575B;
    }

    @Override // r0.InterfaceC4894c
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.k
    public void h(m mVar) {
        k kVar = ((ActionMenuView) this.f38688u).f4532O;
        if (kVar != null) {
            kVar.h(mVar);
        }
    }

    @Override // m8.w
    public boolean i() {
        return ((m8.s) this.f38688u).f39577D.k();
    }

    @Override // x2.e
    public void j(JsonWriter jsonWriter) {
        Object obj = x2.f.f41859b;
        jsonWriter.name("params").beginObject();
        byte[] bArr = (byte[]) this.f38688u;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name("body").value(encodeToString);
        } else {
            String d9 = x2.d.d(encodeToString, "MD5");
            if (d9 != null) {
                jsonWriter.name("bodydigest").value(d9);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // m8.w
    public boolean k(m8.q qVar) {
        return ((m8.s) this.f38688u).k(qVar);
    }

    @Override // t0.Y
    public int l() {
        AbstractC4987C abstractC4987C = (AbstractC4987C) this.f38688u;
        return abstractC4987C.f40603o - abstractC4987C.D();
    }

    @Override // l.k
    public boolean m(m mVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC4714n interfaceC4714n = ((ActionMenuView) this.f38688u).f4537T;
        if (interfaceC4714n != null) {
            Toolbar toolbar = (Toolbar) ((C4543G) interfaceC4714n).f37843n;
            if (toolbar.f4577k0.a()) {
                onMenuItemSelected = true;
            } else {
                V0 v02 = toolbar.m0;
                onMenuItemSelected = v02 != null ? ((C4544H) ((C4543G) v02).f37843n).f37845b.f37943n.onMenuItemSelected(0, menuItem) : false;
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3248g5
    public void n(C3302h5 c3302h5) {
        ((C3490kg) this.f38688u).c(c3302h5);
    }

    @Override // m8.w
    public C5117h o() {
        return ((m8.s) this.f38688u).f39581H;
    }

    @Override // m.C0
    public void p(m mVar, o oVar) {
        ViewOnKeyListenerC4661g viewOnKeyListenerC4661g = (ViewOnKeyListenerC4661g) this.f38688u;
        viewOnKeyListenerC4661g.f38714y.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC4661g.f38692A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C4660f) arrayList.get(i)).f38690b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i4 = i + 1;
        viewOnKeyListenerC4661g.f38714y.postAtTime(new I(this, i4 < arrayList.size() ? (C4660f) arrayList.get(i4) : null, oVar, mVar, 8, false), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // m8.w
    public m8.v q() {
        return ((m8.s) this.f38688u).a();
    }

    @Override // t0.Y
    public View r(int i) {
        return ((AbstractC4987C) this.f38688u).u(i);
    }

    @Override // t0.Y
    public int s(View view) {
        C4988D c4988d = (C4988D) view.getLayoutParams();
        ((AbstractC4987C) this.f38688u).getClass();
        return view.getBottom() + ((C4988D) view.getLayoutParams()).f40605b.bottom + ((ViewGroup.MarginLayoutParams) c4988d).bottomMargin;
    }

    public boolean t(String str) {
        String x9 = x(str);
        return "1".equals(x9) || Boolean.parseBoolean(x9);
    }

    public String toString() {
        switch (this.f38687n) {
            case 4:
                return "ServiceLoaderComponentLoader{classLoader=" + ((ClassLoader) this.f38688u) + "}";
            default:
                return super.toString();
        }
    }

    public Integer u(String str) {
        String x9 = x(str);
        if (TextUtils.isEmpty(x9)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(x9));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + B(str) + "(" + x9 + ") into an int");
            return null;
        }
    }

    public JSONArray v(String str) {
        String x9 = x(str);
        if (TextUtils.isEmpty(x9)) {
            return null;
        }
        try {
            return new JSONArray(x9);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + B(str) + ": " + x9 + ", falling back to default");
            return null;
        }
    }

    public String w(Resources resources, String str, String str2) {
        String[] strArr;
        String x9 = x(str2);
        if (!TextUtils.isEmpty(x9)) {
            return x9;
        }
        String x10 = x(str2.concat("_loc_key"));
        if (!TextUtils.isEmpty(x10)) {
            int identifier = resources.getIdentifier(x10, com.anythink.expressad.foundation.h.k.f20423g, str);
            if (identifier == 0) {
                Log.w("NotificationParams", B(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
                return null;
            }
            JSONArray v9 = v(str2.concat("_loc_args"));
            if (v9 == null) {
                strArr = null;
            } else {
                int length = v9.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = v9.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e9) {
                Log.w("NotificationParams", "Missing format argument for " + B(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e9);
            }
        }
        return null;
    }

    public String x(String str) {
        Bundle bundle = (Bundle) this.f38688u;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle z() {
        Bundle bundle = (Bundle) this.f38688u;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public C4659e(com.google.android.gms.internal.ads.Y y7) {
        this.f38687n = 8;
        Objects.requireNonNull(y7);
        this.f38688u = y7;
    }

    public C4659e(Bundle bundle) {
        this.f38687n = 1;
        this.f38688u = new Bundle(bundle);
    }

    public C4659e() {
        this.f38687n = 11;
        this.f38688u = null;
    }
}
