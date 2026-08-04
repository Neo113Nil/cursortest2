package com.gamericefishpro.space.i9;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 {
    public static final Object g = new Object();
    public static volatile b4 h;
    public static final AtomicInteger i;
    public final com.gamericefishpro.space.b4.f a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public /* synthetic */ k4(com.gamericefishpro.space.b4.f fVar, String str, Object obj, int i2) {
        this.f = i2;
        if (((Uri) fVar.e) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = fVar;
        this.b = str;
        this.c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String string = obj.toString();
                String str = this.b;
                StringBuilder sb = new StringBuilder(str.length() + 25 + string.length());
                sb.append("Invalid long value for ");
                sb.append(str);
                sb.append(": ");
                sb.append(string);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            case 1:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (x3.b.matcher(str2).matches()) {
                        return Boolean.TRUE;
                    }
                    if (x3.c.matcher(str2).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String string2 = obj.toString();
                String str3 = this.b;
                StringBuilder sb2 = new StringBuilder(str3.length() + 28 + string2.length());
                sb2.append("Invalid boolean value for ");
                sb2.append(str3);
                sb2.append(": ");
                sb2.append(string2);
                Log.e("PhenotypeFlag", sb2.toString());
                return null;
            case 2:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String string3 = obj.toString();
                String str4 = this.b;
                StringBuilder sb3 = new StringBuilder(str4.length() + 27 + string3.length());
                sb3.append("Invalid double value for ");
                sb3.append(str4);
                sb3.append(": ");
                sb3.append(string3);
                Log.e("PhenotypeFlag", sb3.toString());
                return null;
            default:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 com.gamericefishpro.space.ta.b) = (r2v0 com.gamericefishpro.space.ta.b), (r2v5 com.gamericefishpro.space.ta.b), (r2v5 com.gamericefishpro.space.ta.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    public final Object b() {
        String str;
        Object objA;
        String strE;
        com.gamericefishpro.space.t.r0 r0Var;
        int i2 = i.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        b4 b4Var = h;
                        com.gamericefishpro.space.ta.b bVar = com.gamericefishpro.space.ta.a.d;
                        Object objA2 = null;
                        if (b4Var != null) {
                            bVar = (com.gamericefishpro.space.ta.b) b4Var.b.get();
                            if (bVar.b()) {
                                e4 e4Var = (e4) bVar.a();
                                Uri uri = (Uri) this.a.e;
                                String str2 = this.b;
                                if (uri != null) {
                                    r0Var = (com.gamericefishpro.space.t.r0) e4Var.a.get(uri.toString());
                                } else {
                                    e4Var.getClass();
                                    r0Var = null;
                                }
                                if (r0Var == null) {
                                    str = null;
                                } else {
                                    str = (String) r0Var.get("".concat(str2));
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (!(b4Var != null)) {
                            throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                        }
                        com.gamericefishpro.space.b4.f fVar = this.a;
                        Uri uri2 = (Uri) fVar.e;
                        if (uri2 == null) {
                            Context context = b4Var.a;
                            throw null;
                        }
                        d4 d4VarA = i4.a(b4Var.a, uri2) ? d4.a(b4Var.a.getContentResolver(), uri2, l4.d) : null;
                        if (d4VarA != null) {
                            String str3 = (String) d4VarA.b().get(this.b);
                            if (str3 != null) {
                                objA = a(str3);
                            } else {
                                objA = null;
                            }
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!fVar.d && (strE = g4.c(b4Var.a).e(this.b)) != null) {
                                objA2 = a(strE);
                            }
                            objA = objA2 == null ? this.c : objA2;
                        }
                        if (bVar.b()) {
                            objA = str == null ? this.c : a(str);
                        }
                        this.e = objA;
                        this.d = i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }
}
