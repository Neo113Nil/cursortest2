package defpackage;

import android.text.TextUtils;
import android.util.Log;
import kotlin.coroutines.Continuation;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class x8a {
    public long a;
    public final Object b;
    public final Object c;

    public x8a(String str) {
        this.b = btf.b(new w8a(str, 0));
        this.c = l18.b.b(hag.I(zzp.class), true);
    }

    public static String c(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static x8a d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new x8a(0L, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new x8a(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public void a(long j, long j2) {
        ((b0u) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((b0u) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public long b(long j) {
        if (yzt.b(j) <= 0.0f || yzt.c(j) <= 0.0f) {
            sme.b("maximumVelocity should be a positive value. You specified=" + ((Object) yzt.g(j)));
        }
        return bzf.s(((b0u) this.b).b(yzt.b(j)), ((b0u) this.c).b(yzt.c(j)));
    }

    public boolean e(String str) {
        str.getClass();
        long a = ((zzp) ((jyr) this.c).getValue()).a();
        if (a - this.a >= 250) {
            this.a = a;
            return true;
        }
        ssg.a(5, (String) ((jyr) this.b).getValue(), "click on " + ((Object) str) + " was debounced", null);
        return false;
    }

    public void f() {
        b0u b0uVar = (b0u) this.b;
        uz0.l(0, r1.length, null, b0uVar.d);
        b0uVar.e = 0;
        b0u b0uVar2 = (b0u) this.c;
        uz0.l(0, r3.length, null, b0uVar2.d);
        b0uVar2.e = 0;
        this.a = 0L;
    }

    public x8a(mm6 mm6Var, long j, ceb cebVar) {
        this.a = j;
        this.b = cebVar;
        xdr a = ydr.a(Boolean.FALSE);
        this.c = a;
        zsd.r0(mm6Var, zsd.M0(a, new cle((Continuation) null, this, 1)));
    }

    public x8a() {
        a0u a0uVar = a0u.a;
        this.b = new b0u();
        this.c = new b0u();
    }

    public x8a(long j, String str, String str2) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
