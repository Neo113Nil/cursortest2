package t2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2748Qo;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.EnumC2731Po;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5077k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f40911a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f40912b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f40913c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f40914d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40915e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f40916f = "";

    /* renamed from: g, reason: collision with root package name */
    public C2748Qo f40917g;

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", p2.j.f39798C.f39803c.E(context, str2));
        q a9 = new s(context).a(0, str, hashMap, null);
        try {
            return (String) a9.f31242n.get(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31584W5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            String valueOf = String.valueOf(str);
            int i = C.f40822b;
            u2.i.d("Interrupted while retrieving a response from: ".concat(valueOf), e6);
            a9.cancel(true);
            return null;
        } catch (TimeoutException e9) {
            String valueOf2 = String.valueOf(str);
            int i4 = C.f40822b;
            u2.i.d("Timeout while retrieving a response from: ".concat(valueOf2), e9);
            a9.cancel(true);
            return null;
        } catch (Exception e10) {
            String valueOf3 = String.valueOf(str);
            int i9 = C.f40822b;
            u2.i.d("Error retrieving a response from: ".concat(valueOf3), e10);
            return null;
        }
    }

    public final void a(Context context) {
        C2748Qo c2748Qo;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue() || (c2748Qo = this.f40917g) == null) {
            return;
        }
        c2748Qo.e(new BinderC5075i(this, context), EnumC2731Po.f27053w);
    }

    public final boolean b(Context context, String str, String str2) {
        C3151ea c3151ea = AbstractC3368ia.f31567U5;
        q2.r rVar = q2.r.f40116e;
        String j9 = j(context, k(context, (String) rVar.f40119c.a(c3151ea), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j9)) {
            int i = C.f40822b;
            u2.i.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j9.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                E g9 = p2.j.f39798C.f39808h.g();
                if (true != equals) {
                    str = "";
                }
                g9.f(str);
            }
            return equals;
        } catch (JSONException e6) {
            int i4 = C.f40822b;
            u2.i.g("Fail to get debug mode response json.", e6);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        G g9 = p2.j.f39798C.f39803c;
        G.t(context, k(context, (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31549S5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i = C.f40822b;
        u2.i.a("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31575V5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        G g9 = p2.j.f39798C.f39803c;
        new v(context, str, buildUpon.build().toString(), null).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z8) {
        synchronized (this.f40911a) {
            try {
                this.f40915e = z8;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                    p2.j.f39798C.f39808h.g().e(z8);
                    C2748Qo c2748Qo = this.f40917g;
                    if (c2748Qo != null) {
                        if (!c2748Qo.f27236u) {
                            if (z8) {
                                c2748Qo.j();
                                if (!c2748Qo.f27234s) {
                                    c2748Qo.k();
                                }
                            }
                            if (!c2748Qo.f()) {
                                c2748Qo.l();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        boolean z8;
        synchronized (this.f40911a) {
            z8 = this.f40915e;
        }
        return z8;
    }

    public final boolean h() {
        boolean z8;
        synchronized (this.f40911a) {
            z8 = this.f40914d;
        }
        return z8;
    }

    public final void i(Context context, String str, boolean z8, boolean z9) {
        if (context instanceof Activity) {
            G.f40858l.post(new RunnableC5076j(this, context, str, z8, z9));
        } else {
            int i = C.f40822b;
            u2.i.e("Can not create dialog without Activity Context");
        }
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f40911a) {
            if (TextUtils.isEmpty(this.f40912b)) {
                G g9 = p2.j.f39798C.f39803c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    S2.b.d(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = C.f40822b;
                    u2.i.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f40912b = str5;
                if (TextUtils.isEmpty(str5)) {
                    G g10 = p2.j.f39798C.f39803c;
                    String uuid = UUID.randomUUID().toString();
                    this.f40912b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e6) {
                        int i4 = C.f40822b;
                        u2.i.d("Error writing to file in internal storage.", e6);
                    }
                }
            }
            str4 = this.f40912b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
