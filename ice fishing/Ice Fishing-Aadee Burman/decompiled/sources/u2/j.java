package u2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C2749Qo;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.EnumC2732Po;
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
import p2.C4835j;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41285a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f41286b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f41287c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f41288d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41289e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f41290f = "";

    /* renamed from: g, reason: collision with root package name */
    public C2749Qo f41291g;

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C4835j.f39730C.f39735c.E(context, str2));
        p a9 = new r(context).a(0, str, hashMap, null);
        try {
            return (String) a9.f31479n.get(((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32164W5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            String valueOf = String.valueOf(str);
            int i = z.f41319b;
            v2.i.d("Interrupted while retrieving a response from: ".concat(valueOf), e9);
            a9.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            String valueOf2 = String.valueOf(str);
            int i6 = z.f41319b;
            v2.i.d("Timeout while retrieving a response from: ".concat(valueOf2), e10);
            a9.cancel(true);
            return null;
        } catch (Exception e11) {
            String valueOf3 = String.valueOf(str);
            int i9 = z.f41319b;
            v2.i.d("Error retrieving a response from: ".concat(valueOf3), e11);
            return null;
        }
    }

    public final void a(Context context) {
        C2749Qo c2749Qo;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.za)).booleanValue() || (c2749Qo = this.f41291g) == null) {
            return;
        }
        c2749Qo.e(new BinderC5077h(this, context), EnumC2732Po.f26864w);
    }

    public final boolean b(Context context, String str, String str2) {
        C3301ha c3301ha = AbstractC3569ma.f32146U5;
        q2.r rVar = q2.r.f40204e;
        String j6 = j(context, k(context, (String) rVar.f40207c.a(c3301ha), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j6)) {
            int i = z.f41319b;
            v2.i.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j6.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
                C5069B g4 = C4835j.f39730C.f39740h.g();
                if (true != equals) {
                    str = "";
                }
                g4.f(str);
            }
            return equals;
        } catch (JSONException e9) {
            int i6 = z.f41319b;
            v2.i.g("Fail to get debug mode response json.", e9);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        D d2 = C4835j.f39730C.f39735c;
        D.t(context, k(context, (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32129S5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i = z.f41319b;
        v2.i.a("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32155V5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        D d2 = C4835j.f39730C.f39735c;
        new u(context, str, buildUpon.build().toString(), null).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z3) {
        synchronized (this.f41285a) {
            try {
                this.f41289e = z3;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.za)).booleanValue()) {
                    C4835j.f39730C.f39740h.g().e(z3);
                    C2749Qo c2749Qo = this.f41291g;
                    if (c2749Qo != null) {
                        if (!c2749Qo.f27099u) {
                            if (z3) {
                                c2749Qo.j();
                                if (!c2749Qo.f27097s) {
                                    c2749Qo.k();
                                }
                            }
                            if (!c2749Qo.f()) {
                                c2749Qo.l();
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
        boolean z3;
        synchronized (this.f41285a) {
            z3 = this.f41289e;
        }
        return z3;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f41285a) {
            z3 = this.f41288d;
        }
        return z3;
    }

    public final void i(Context context, String str, boolean z3, boolean z6) {
        if (context instanceof Activity) {
            D.f41234l.post(new RunnableC5078i(this, context, str, z3, z6));
        } else {
            int i = z.f41319b;
            v2.i.e("Can not create dialog without Activity Context");
        }
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f41285a) {
            if (TextUtils.isEmpty(this.f41286b)) {
                D d2 = C4835j.f39730C.f39735c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    T2.b.d(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = z.f41319b;
                    v2.i.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f41286b = str5;
                if (TextUtils.isEmpty(str5)) {
                    D d9 = C4835j.f39730C.f39735c;
                    String uuid = UUID.randomUUID().toString();
                    this.f41286b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e9) {
                        int i6 = z.f41319b;
                        v2.i.d("Error writing to file in internal storage.", e9);
                    }
                }
            }
            str4 = this.f41286b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
