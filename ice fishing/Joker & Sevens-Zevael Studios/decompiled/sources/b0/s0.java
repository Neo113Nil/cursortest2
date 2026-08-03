package b0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f888a;

    /* renamed from: b, reason: collision with root package name */
    public int f889b;

    /* renamed from: c, reason: collision with root package name */
    public Object f890c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f891d;

    /* renamed from: e, reason: collision with root package name */
    public Object f892e;

    public static String c(i7.g gVar) {
        gVar.a();
        i7.i iVar = gVar.f3233c;
        String str = iVar.f3249e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f3246b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j3) {
        int i10 = this.f888a + 1;
        long[] jArr = (long[]) this.f890c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r22 = new int[i11];
            bc.l.Q(jArr, jArr2, 0, 0, jArr.length);
            bc.l.S(0, 0, 14, (int[]) this.f891d, r22);
            this.f890c = jArr2;
            this.f891d = r22;
        }
        int i12 = this.f888a;
        this.f888a = i12 + 1;
        int length2 = ((int[]) this.f892e).length;
        if (this.f889b >= length2) {
            int i13 = length2 * 2;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr[i14] = i15;
                i14 = i15;
            }
            bc.l.S(0, 0, 14, (int[]) this.f892e, iArr);
            this.f892e = iArr;
        }
        int i16 = this.f889b;
        int[] iArr2 = (int[]) this.f892e;
        this.f889b = iArr2[i16];
        long[] jArr3 = (long[]) this.f890c;
        jArr3[i12] = j3;
        ((int[]) this.f891d)[i12] = i16;
        iArr2[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (pc.j.g(jArr3[i17], j3) <= 0) {
                break;
            }
            h(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public synchronized String b() {
        try {
            if (((String) this.f891d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f891d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f890c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i10;
        synchronized (this) {
            i10 = this.f889b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.f890c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f889b = 2;
                    } else {
                        this.f889b = 2;
                    }
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public synchronized void f() {
        PackageInfo d10 = d(((Context) this.f890c).getPackageName());
        if (d10 != null) {
            this.f891d = Integer.toString(d10.versionCode);
            this.f892e = d10.versionName;
        }
    }

    public void g(int i10) {
        int i11 = this.f889b;
        boolean z10 = false;
        if (i10 >= 0 && i10 < i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        m2.a.a("lineIndex(" + i10 + ") is out of bounds [0, " + i11 + ')');
    }

    public void h(int i10, int i11) {
        long[] jArr = (long[]) this.f890c;
        int[] iArr = (int[]) this.f891d;
        int[] iArr2 = (int[]) this.f892e;
        long j3 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j3;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
