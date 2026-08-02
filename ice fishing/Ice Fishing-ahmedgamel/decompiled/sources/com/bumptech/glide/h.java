package com.bumptech.glide;

import D.x;
import J0.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.Sx;
import com.google.android.gms.internal.ads.Tx;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.YP;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4900e;
import r2.C4906k;
import t0.AbstractC4987C;
import t0.C4997M;
import u7.C5081g;
import v7.t;
import w2.z;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24177a;

    public /* synthetic */ h(int i) {
        this.f24177a = i;
    }

    public static int a(C4997M c4997m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4987C abstractC4987C, boolean z6) {
        if (abstractC4987C.v() == 0 || c4997m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(AbstractC4987C.H(view) - AbstractC4987C.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int b(C4997M c4997m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4987C abstractC4987C, boolean z6, boolean z9) {
        if (abstractC4987C.v() == 0 || c4997m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z9 ? Math.max(0, (c4997m.b() - Math.max(AbstractC4987C.H(view), AbstractC4987C.H(view2))) - 1) : Math.max(0, Math.min(AbstractC4987C.H(view), AbstractC4987C.H(view2)));
        if (z6) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC4987C.H(view) - AbstractC4987C.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int c(C4997M c4997m, androidx.emoji2.text.g gVar, View view, View view2, AbstractC4987C abstractC4987C, boolean z6) {
        if (abstractC4987C.v() == 0 || c4997m.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return c4997m.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC4987C.H(view) - AbstractC4987C.H(view2)) + 1)) * c4997m.b());
    }

    public static ColorStateList d(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !YP.o(drawable)) {
            return null;
        }
        colorStateList = YP.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static float e(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static E6.b f(String rootDir, long j6) {
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        File file = new File(rootDir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30L);
        timeUnit.toMillis(33L);
        TimeUnit.HOURS.toMillis(18L);
        byte b9 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
        int i = R7.a.f2887w;
        R7.c unit = R7.c.f2895y;
        kotlin.jvm.internal.h.e(unit, "unit");
        long l9 = unit.compareTo(R7.c.f2893w) <= 0 ? S0.f.l(X2.a.d(72, unit, R7.c.f2891u)) : S0.f.w(72, unit);
        long f2 = ((((int) l9) & 1) != 1 || R7.a.d(l9)) ? R7.a.f(l9, R7.c.f2892v) : l9 >> 1;
        byte b10 = (byte) (b9 | 4);
        if (b10 == 31) {
            E6.a aVar = new E6.a(com.anythink.basead.exoplayer.i.a.f8669f, j6, f2);
            if (j6 <= com.anythink.basead.exoplayer.i.a.f8669f) {
                throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("destinationDir must be a directory");
            }
            if (file.exists() || file.mkdirs()) {
                return new E6.b(new A6.a(new A6.d(new A6.b(file, aVar)), new C4900e(6)));
            }
            throw new IllegalStateException("Could not create dir: " + file);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" maxFileAgeForWriteMillis");
        }
        if ((b10 & 2) == 0) {
            sb.append(" minFileAgeForReadMillis");
        }
        if ((b10 & 4) == 0) {
            sb.append(" maxFileAgeForReadMillis");
        }
        if ((b10 & 8) == 0) {
            sb.append(" maxFileSize");
        }
        if ((b10 & 16) == 0) {
            sb.append(" maxFolderSize");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public static SharedPreferences g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static String h(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return x.k(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static Typeface i(Configuration configuration, Typeface typeface) {
        int i;
        int i4;
        int weight;
        int i6;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i6 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, S0.f.d(i6 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void j(Context context) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.h.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.h.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            r.d().a(K0.n.f1636a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.h.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(K0.a.f1595a.a(context), "androidx.work.workdb");
            String[] strArr = K0.n.f1637b;
            int t6 = t.t(strArr.length);
            if (t6 < 16) {
                t6 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t6);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            C5081g c5081g = new C5081g(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = t.u(c5081g);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        r.d().g(K0.n.f1636a, "Over-writing contents of " + file3);
                    }
                    r.d().a(K0.n.f1636a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static float k(EdgeEffect edgeEffect, float f2, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return U.e.c(edgeEffect, f2, f9);
        }
        U.d.a(edgeEffect, f2, f9);
        return f2;
    }

    public static void l(Context context) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            Sx f2 = Sx.f(context);
            Tx f9 = Tx.f(context);
            Ux f10 = Ux.f(context);
            f2.getClass();
            synchronized (Sx.class) {
                f2.c(false);
            }
            synchronized (Sx.class) {
                f2.c(true);
            }
            f9.g();
            f10.r();
        } catch (IOException e9) {
            C4906k.f40186C.f40196h.d("clearStorageOnIdlessMode", e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle m(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e9) {
                int i = z.f41712b;
                x2.i.b("JSON parsing error", e9);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i6 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i6 != 0) {
                    List q8 = com.bumptech.glide.manager.o.d(new PA('/')).q(optString2);
                    if (q8.size() > 2 || q8.isEmpty()) {
                        obj = null;
                    } else {
                        if (q8.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) q8.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) q8.get(0), 0);
                            str2 = (String) q8.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i9 = i6 - 1;
                        if (i9 != 0) {
                            if (i9 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public int hashCode() {
        switch (this.f24177a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f24177a) {
            case 7:
                String b9 = s.a(getClass()).b();
                kotlin.jvm.internal.h.b(b9);
                return b9;
            default:
                return super.toString();
        }
    }
}
