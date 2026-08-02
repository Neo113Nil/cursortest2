package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.ArraySet;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y6b implements SharedPreferences {
    public final /* synthetic */ int a;
    public final Object b;
    public final Serializable c;
    public Object d;
    public Object e;

    public y6b(String str) {
        this.a = 1;
        str.getClass();
        this.b = str;
        this.c = l18.b.b(hag.I(frt.class), true);
    }

    public static y6b a(String str, Context context, w6b w6bVar, x6b x6bVar) {
        cib u;
        cib u2;
        int i = mz7.a;
        msn.f(new ho(ip.class, new fo[]{new fo(6, lz7.class)}, 5), true);
        msn.g(new oz7());
        vn.a();
        rdk rdkVar = new rdk();
        rdkVar.f = w6bVar.a;
        rdkVar.Y(context, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
        String str2 = "android-keystore://" + str;
        if (!str2.startsWith("android-keystore://")) {
            xq0.x("key URI must start with android-keystore://");
            return null;
        }
        rdkVar.b = str2;
        ix6 s = rdkVar.s();
        synchronized (s) {
            u = ((pv9) s.b).u();
        }
        rdk rdkVar2 = new rdk();
        rdkVar2.f = x6bVar.a;
        rdkVar2.Y(context, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
        String str3 = "android-keystore://" + str;
        if (!str3.startsWith("android-keystore://")) {
            xq0.x("key URI must start with android-keystore://");
            return null;
        }
        rdkVar2.b = str3;
        ix6 s2 = rdkVar2.s();
        synchronized (s2) {
            u2 = ((pv9) s2.b).u();
        }
        return new y6b(context.getSharedPreferences("quarantine_master_token_shared_pref", 0), (un) u2.q(un.class), (lz7) u.q(lz7.class));
    }

    public static boolean e(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(dp2.b(((lz7) this.e).a(str.getBytes(StandardCharsets.UTF_8), "quarantine_master_token_shared_pref".getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            xla.i("Could not encrypt key. ", e2.getMessage(), e2);
            return null;
        }
    }

    public Object c(String str) {
        if (e(str)) {
            throw new SecurityException(ouj.n(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String b = b(str);
            String string = ((SharedPreferences) this.b).getString(b, null);
            if (string != null) {
                byte[] a = dp2.a(string);
                un unVar = (un) this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(unVar.b(a, b.getBytes(charset)));
                wrap.position(0);
                int i = wrap.getInt();
                int D = ouj.D(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 6 : 5 : 4 : 3 : 2 : 1);
                if (D == 0) {
                    int i2 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i2);
                    String charBuffer = charset.decode(slice).toString();
                    if (!charBuffer.equals("__NULL__")) {
                        return charBuffer;
                    }
                } else if (D == 1) {
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i3);
                        wrap.position(wrap.position() + i3);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                        return arraySet;
                    }
                } else {
                    if (D == 2) {
                        return Integer.valueOf(wrap.getInt());
                    }
                    if (D == 3) {
                        return Long.valueOf(wrap.getLong());
                    }
                    if (D == 4) {
                        return Float.valueOf(wrap.getFloat());
                    }
                    if (D == 5) {
                        return Boolean.valueOf(wrap.get() != 0);
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            xla.i("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        switch (this.a) {
            case 0:
                if (e(str)) {
                    throw new SecurityException(ouj.n(str, " is a reserved key for the encryption keyset."));
                }
                return ((SharedPreferences) this.b).contains(b(str));
            default:
                str.getClass();
                return d().contains(str);
        }
    }

    public pst d() {
        xxq c = ((frt) ((jyr) this.c).getValue()).c();
        String str = c.a;
        pst pstVar = (pst) this.e;
        if (pstVar != null) {
            if (!Intrinsics.d(str, (String) this.d)) {
                pstVar = null;
            }
            if (pstVar != null) {
                return pstVar;
            }
        }
        this.d = str;
        l18 l18Var = l18.b;
        bdt I = hag.I(Context.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Context context = (Context) qdcVar.C(I);
        String str2 = (String) this.b;
        str2.getClass();
        pst pstVar2 = new pst(context, c.a, str2);
        this.e = pstVar2;
        return pstVar2;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        switch (this.a) {
            case 0:
                return new v6b(this, ((SharedPreferences) this.b).edit());
            default:
                return d().edit();
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : ((SharedPreferences) this.b).getAll().entrySet()) {
                    if (!e(entry.getKey())) {
                        try {
                            String str = new String(((lz7) this.e).b(dp2.a(entry.getKey()), "quarantine_master_token_shared_pref".getBytes()), StandardCharsets.UTF_8);
                            if (str.equals("__NULL__")) {
                                str = null;
                            }
                            hashMap.put(str, c(str));
                        } catch (GeneralSecurityException e) {
                            xla.i("Could not decrypt key. ", e.getMessage(), e);
                            return null;
                        }
                    }
                }
                return hashMap;
            default:
                return d().getAll();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                return (c == null || !(c instanceof Boolean)) ? z : ((Boolean) c).booleanValue();
            default:
                str.getClass();
                return d().getBoolean(str, z);
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                return (c == null || !(c instanceof Float)) ? f : ((Float) c).floatValue();
            default:
                str.getClass();
                return d().getFloat(str, f);
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                return (c == null || !(c instanceof Integer)) ? i : ((Integer) c).intValue();
            default:
                str.getClass();
                return d().getInt(str, i);
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                return (c == null || !(c instanceof Long)) ? j : ((Long) c).longValue();
            default:
                str.getClass();
                return d().getLong(str, j);
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                return (c == null || !(c instanceof String)) ? str2 : (String) c;
            default:
                str.getClass();
                return d().getString(str, str2);
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        switch (this.a) {
            case 0:
                Object c = c(str);
                Set arraySet = c instanceof Set ? (Set) c : new ArraySet();
                return arraySet.size() > 0 ? arraySet : set;
            default:
                str.getClass();
                return d().getStringSet(str, set);
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        switch (this.a) {
            case 0:
                ((ArrayList) this.c).add(onSharedPreferenceChangeListener);
                break;
            default:
                onSharedPreferenceChangeListener.getClass();
                d().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                break;
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        switch (this.a) {
            case 0:
                ((ArrayList) this.c).remove(onSharedPreferenceChangeListener);
                break;
            default:
                onSharedPreferenceChangeListener.getClass();
                d().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                break;
        }
    }

    public y6b(SharedPreferences sharedPreferences, un unVar, lz7 lz7Var) {
        this.a = 0;
        this.b = sharedPreferences;
        this.d = unVar;
        this.e = lz7Var;
        this.c = new ArrayList();
    }
}
