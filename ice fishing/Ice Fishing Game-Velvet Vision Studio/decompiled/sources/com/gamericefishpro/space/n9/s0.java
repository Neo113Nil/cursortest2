package com.gamericefishpro.space.n9;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ int d = 0;
    public final int e;
    public final String i;
    public final Object v;
    public final Object w;
    public final Object y;
    public final Object z;

    public s0(v0 v0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.i = str;
        this.v = obj;
        this.w = obj2;
        this.y = obj3;
        this.z = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                v0 v0Var = (v0) this.z;
                f1 f1Var = ((r1) v0Var.d).w;
                r1.j(f1Var);
                if (!f1Var.e) {
                    Log.println(6, v0Var.B(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (v0Var.i == 0) {
                    g gVar = ((r1) v0Var.d).v;
                    if (gVar.w == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.w == null) {
                                    r1 r1Var = (r1) gVar.d;
                                    ApplicationInfo applicationInfo = r1Var.d.getApplicationInfo();
                                    String strA = com.gamericefishpro.space.z8.b.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        gVar.w = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (gVar.w == null) {
                                        gVar.w = Boolean.TRUE;
                                        v0 v0Var2 = r1Var.y;
                                        r1.l(v0Var2);
                                        v0Var2.y.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (gVar.w.booleanValue()) {
                        v0Var.i = 'C';
                    } else {
                        v0Var.i = 'c';
                    }
                    break;
                }
                if (v0Var.v < 0) {
                    ((r1) v0Var.d).v.w();
                    v0Var.v = 133005L;
                }
                int i = this.e;
                char c = v0Var.i;
                long j = v0Var.v;
                String str2 = this.i;
                Object obj = this.v;
                Object obj2 = this.w;
                Object obj3 = this.y;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strC = v0.C(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strC.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strC);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                e1 e1Var = f1Var.w;
                if (e1Var != null) {
                    String str3 = (String) e1Var.d;
                    f1 f1Var2 = (f1) e1Var.e;
                    f1Var2.r();
                    if (((f1) e1Var.e).v().getLong((String) e1Var.b, 0L) == 0) {
                        e1Var.b();
                    }
                    if (string == null) {
                        string = "";
                    }
                    SharedPreferences sharedPreferencesV = f1Var2.v();
                    String str4 = (String) e1Var.c;
                    long j2 = sharedPreferencesV.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = f1Var2.v().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    r4 r4Var = ((r1) f1Var2.d).B;
                    r1.j(r4Var);
                    long jNextLong = r4Var.o0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = f1Var2.v().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((x0) this.v).b(this.i, this.e, (Throwable) this.w, (byte[]) this.y, (Map) this.z);
                return;
        }
    }

    public /* synthetic */ s0(String str, x0 x0Var, int i, IOException iOException, byte[] bArr, Map map) {
        com.gamericefishpro.space.v8.c0.g(x0Var);
        this.v = x0Var;
        this.e = i;
        this.w = iOException;
        this.y = bArr;
        this.i = str;
        this.z = map;
    }
}
