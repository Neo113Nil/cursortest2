package w2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2786Ro;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.EnumC2769Qo;
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
import r2.C4906k;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41678a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f41679b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f41680c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f41681d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41682e = false;

    /* renamed from: f, reason: collision with root package name */
    public String f41683f = "";

    /* renamed from: g, reason: collision with root package name */
    public C2786Ro f41684g;

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", C4906k.f40186C.f40191c.E(context, str2));
        p a9 = new r(context).a(0, str, hashMap, null);
        try {
            return (String) a9.f32256n.get(((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32943W5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e9) {
            String valueOf = String.valueOf(str);
            int i = z.f41712b;
            x2.i.d("Interrupted while retrieving a response from: ".concat(valueOf), e9);
            a9.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            String valueOf2 = String.valueOf(str);
            int i4 = z.f41712b;
            x2.i.d("Timeout while retrieving a response from: ".concat(valueOf2), e10);
            a9.cancel(true);
            return null;
        } catch (Exception e11) {
            String valueOf3 = String.valueOf(str);
            int i6 = z.f41712b;
            x2.i.d("Error retrieving a response from: ".concat(valueOf3), e11);
            return null;
        }
    }

    public final void a(Context context) {
        C2786Ro c2786Ro;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue() || (c2786Ro = this.f41684g) == null) {
            return;
        }
        c2786Ro.e(new BinderC5148h(this, context), EnumC2769Qo.f27857w);
    }

    public final boolean b(Context context, String str, String str2) {
        C3324ha c3324ha = AbstractC3592ma.f32926U5;
        s2.r rVar = s2.r.f40506e;
        String j6 = j(context, k(context, (String) rVar.f40509c.a(c3324ha), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j6)) {
            int i = z.f41712b;
            x2.i.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j6.trim()).optString("debug_mode"));
            f(equals);
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                C5140B g9 = C4906k.f40186C.f40196h.g();
                if (true != equals) {
                    str = "";
                }
                g9.f(str);
            }
            return equals;
        } catch (JSONException e9) {
            int i4 = z.f41712b;
            x2.i.g("Fail to get debug mode response json.", e9);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        D d9 = C4906k.f40186C.f40191c;
        D.t(context, k(context, (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32908S5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i = z.f41712b;
        x2.i.a("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32935V5), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        D d9 = C4906k.f40186C.f40191c;
        new u(context, str, buildUpon.build().toString(), null).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z6) {
        synchronized (this.f41678a) {
            try {
                this.f41682e = z6;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.za)).booleanValue()) {
                    C4906k.f40186C.f40196h.g().e(z6);
                    C2786Ro c2786Ro = this.f41684g;
                    if (c2786Ro != null) {
                        if (!c2786Ro.f28043u) {
                            if (z6) {
                                c2786Ro.j();
                                if (!c2786Ro.f28041s) {
                                    c2786Ro.k();
                                }
                            }
                            if (!c2786Ro.f()) {
                                c2786Ro.l();
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
        boolean z6;
        synchronized (this.f41678a) {
            z6 = this.f41682e;
        }
        return z6;
    }

    public final boolean h() {
        boolean z6;
        synchronized (this.f41678a) {
            z6 = this.f41681d;
        }
        return z6;
    }

    public final void i(Context context, String str, boolean z6, boolean z9) {
        if (context instanceof Activity) {
            D.f41627l.post(new RunnableC5149i(this, context, str, z6, z9));
        } else {
            int i = z.f41712b;
            x2.i.e("Can not create dialog without Activity Context");
        }
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f41678a) {
            if (TextUtils.isEmpty(this.f41679b)) {
                D d9 = C4906k.f40186C.f40191c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    V2.b.d(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = z.f41712b;
                    x2.i.a("Error reading from internal storage.");
                    str5 = "";
                }
                this.f41679b = str5;
                if (TextUtils.isEmpty(str5)) {
                    D d10 = C4906k.f40186C.f40191c;
                    String uuid = UUID.randomUUID().toString();
                    this.f41679b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e9) {
                        int i4 = z.f41712b;
                        x2.i.d("Error writing to file in internal storage.", e9);
                    }
                }
            }
            str4 = this.f41679b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
