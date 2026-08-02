package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cs4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ cs4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #8 {all -> 0x003d, blocks: (B:6:0x0011, B:9:0x0023, B:11:0x0029, B:17:0x0039, B:18:0x003f, B:20:0x005a, B:32:0x0057, B:37:0x001f, B:25:0x004a, B:28:0x0050, B:29:0x0055, B:14:0x0034, B:34:0x001b), top: B:5:0x0011, inners: #4, #5, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #10 {all -> 0x009f, blocks: (B:46:0x007c, B:48:0x0099, B:49:0x00a2, B:53:0x00b7, B:55:0x00bc, B:57:0x00c4, B:58:0x00cf, B:61:0x00da, B:63:0x00dd, B:65:0x00f3, B:66:0x00fa, B:71:0x014b, B:74:0x0155, B:77:0x016a, B:79:0x0170, B:81:0x0192, B:88:0x01a1, B:96:0x017b, B:97:0x017f, B:100:0x018f, B:105:0x018a, B:110:0x0166, B:116:0x0144, B:119:0x00cc, B:84:0x019d, B:113:0x0140, B:107:0x0162, B:102:0x0186, B:93:0x0177), top: B:45:0x007c, inners: #0, #2, #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017f A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #10 {all -> 0x009f, blocks: (B:46:0x007c, B:48:0x0099, B:49:0x00a2, B:53:0x00b7, B:55:0x00bc, B:57:0x00c4, B:58:0x00cf, B:61:0x00da, B:63:0x00dd, B:65:0x00f3, B:66:0x00fa, B:71:0x014b, B:74:0x0155, B:77:0x016a, B:79:0x0170, B:81:0x0192, B:88:0x01a1, B:96:0x017b, B:97:0x017f, B:100:0x018f, B:105:0x018a, B:110:0x0166, B:116:0x0144, B:119:0x00cc, B:84:0x019d, B:113:0x0140, B:107:0x0162, B:102:0x0186, B:93:0x0177), top: B:45:0x007c, inners: #0, #2, #3, #6, #7 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Locale locale;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        seu seuVar = null;
        seuVar = null;
        r1 = null;
        SharedPreferences sharedPreferences = null;
        switch (this.a) {
            case 0:
                String str = CommonUrlParts.Values.FALSE_INTEGER;
                Set set = bp6.a;
                if (!set.contains(this)) {
                    try {
                        String str2 = ood.j;
                        boolean z = true;
                        ood S = h1b.S(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{this.b}, 1)), null, null);
                        Bundle bundle = S.d;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        av1 C = etn.C(j3c.b());
                        JSONArray jSONArray = new JSONArray();
                        String str3 = Build.MODEL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONArray.put(str3);
                        if ((C != null ? C.a() : null) != null) {
                            jSONArray.put(C.a());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put(CommonUrlParts.Values.FALSE_INTEGER);
                        if (ot0.J()) {
                            str = "1";
                        }
                        jSONArray.put(str);
                        try {
                            Resources resources = j3c.b().getResources();
                            resources.getClass();
                            locale = resources.getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
                        String jSONArray2 = jSONArray.toString();
                        jSONArray2.getClass();
                        bundle.putString("device_session_id", ds4.a());
                        bundle.putString("extinfo", jSONArray2);
                        S.d = bundle;
                        JSONObject jSONObject = S.c().c;
                        if (!bp6.a.contains(ds4.class)) {
                            try {
                                atomicBoolean = ds4.f;
                            } catch (Throwable th) {
                                bp6.a(ds4.class, th);
                            }
                            if (jSONObject != null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                                z = false;
                            }
                            atomicBoolean.set(z);
                            if (!bp6.a.contains(ds4.class)) {
                                try {
                                    atomicBoolean2 = ds4.f;
                                } catch (Throwable th2) {
                                    bp6.a(ds4.class, th2);
                                }
                                if (atomicBoolean2.get()) {
                                    if (!set.contains(ds4.class)) {
                                        try {
                                            seuVar = ds4.c;
                                        } catch (Throwable th3) {
                                            bp6.a(ds4.class, th3);
                                        }
                                    }
                                    if (seuVar != null) {
                                        seuVar.c();
                                    }
                                    teu teuVar = ds4.a;
                                    if (bp6.a.contains(ds4.class)) {
                                    }
                                } else {
                                    if (!set.contains(ds4.class)) {
                                        try {
                                            ds4.d = null;
                                        } catch (Throwable th4) {
                                            bp6.a(ds4.class, th4);
                                        }
                                    }
                                    teu teuVar2 = ds4.a;
                                    if (bp6.a.contains(ds4.class)) {
                                        try {
                                            ds4.g = false;
                                            break;
                                        } catch (Throwable th5) {
                                            bp6.a(ds4.class, th5);
                                            return;
                                        }
                                    }
                                }
                            }
                            atomicBoolean2 = null;
                            if (atomicBoolean2.get()) {
                            }
                        }
                        atomicBoolean = null;
                        if (jSONObject != null) {
                        }
                        z = false;
                        atomicBoolean.set(z);
                        if (!bp6.a.contains(ds4.class)) {
                        }
                        atomicBoolean2 = null;
                        if (atomicBoolean2.get()) {
                        }
                    } catch (Throwable th6) {
                        bp6.a(this, th6);
                        return;
                    }
                }
                break;
            default:
                Set set2 = bp6.a;
                if (!set2.contains(this)) {
                    try {
                        SharedPreferences sharedPreferences2 = ast.a;
                        if (!set2.contains(ast.class)) {
                            try {
                                atomicBoolean3 = ast.b;
                            } catch (Throwable th7) {
                                bp6.a(ast.class, th7);
                            }
                            if (!atomicBoolean3.get()) {
                                ast astVar = ast.e;
                                if (!bp6.a.contains(ast.class)) {
                                    try {
                                        astVar.b();
                                    } catch (Throwable th8) {
                                        bp6.a(ast.class, th8);
                                    }
                                }
                            }
                            SharedPreferences sharedPreferences3 = ast.a;
                            if (!bp6.a.contains(ast.class)) {
                                try {
                                    SharedPreferences sharedPreferences4 = ast.a;
                                    if (sharedPreferences4 == null) {
                                        Intrinsics.j("sharedPreferences");
                                        throw null;
                                    }
                                    sharedPreferences = sharedPreferences4;
                                } catch (Throwable th9) {
                                    bp6.a(ast.class, th9);
                                }
                            }
                            sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", this.b).apply();
                            break;
                        }
                        atomicBoolean3 = null;
                        if (!atomicBoolean3.get()) {
                        }
                        SharedPreferences sharedPreferences32 = ast.a;
                        if (!bp6.a.contains(ast.class)) {
                        }
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", this.b).apply();
                    } catch (Throwable th10) {
                        bp6.a(this, th10);
                    }
                }
                break;
        }
    }
}
