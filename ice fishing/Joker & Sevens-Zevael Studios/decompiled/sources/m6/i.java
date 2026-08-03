package m6;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.q;
import s.g0;
import s.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements f6.a, q, fc.h {

    /* renamed from: h, reason: collision with root package name */
    public static i f4919h;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4920g;

    public /* synthetic */ i(int i10) {
        this.f4920g = i10;
    }

    public static final float d(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float abs = Math.abs(f10);
        float signum = Math.signum(f10);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i11 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i11];
            float f19 = fArr[i10];
            f11 = fArr2[i11];
            f12 = f18;
            f13 = fArr2[i10];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (abs - f12) / (f14 - f12)))) + f11) * signum;
    }

    public static Typeface e(String str, k2.l lVar, int i10) {
        if (i10 == 0 && pc.j.a(lVar, k2.l.f3612i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int F = v6.a.F(lVar, i10);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(F) : Typeface.create(str, F);
    }

    public static final m g(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < mVarArr.length; i10++) {
                if (mVarArr[i10].equals(nVar)) {
                    return mVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean h(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z10;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? g(packageInfo2, o.f4928a) : g(packageInfo2, o.f4928a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z10 = true;
        if (packageInfo != null) {
            if ((!z10 ? g(packageInfo2, o.f4928a) : g(packageInfo2, o.f4928a[0])) == null) {
            }
        }
        return false;
    }

    @Override // f6.a
    public long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // k2.q
    public Typeface b(k2.l lVar, int i10) {
        return e(null, lVar, i10);
    }

    @Override // k2.q
    public Typeface c(k2.n nVar, k2.l lVar, int i10) {
        String str;
        nVar.getClass();
        int i11 = lVar.f3615g / 100;
        if (i11 >= 0 && i11 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i11 || i11 >= 4) {
            if (i11 != 4) {
                if (i11 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i11 || i11 >= 8) && 8 <= i11 && i11 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface e10 = e(str, lVar, i10);
            if (!pc.j.a(e10, Typeface.create(Typeface.DEFAULT, v6.a.F(lVar, i10))) && !pc.j.a(e10, e(null, lVar, i10))) {
                typeface = e10;
            }
        }
        return typeface == null ? e("sans-serif", lVar, i10) : typeface;
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (l7.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f4213a;
            if (str != null) {
                bVar = new l7.b(str, bVar.f4214b, bVar.f4215c, bVar.f4216d, bVar.f4217e, new c6.j(6, str, bVar), bVar.f4219g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f4920g) {
            case 17:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public i(s3.j jVar) {
        this.f4920g = 15;
        new CopyOnWriteArrayList();
    }

    public i() {
        this.f4920g = 9;
        new s.q(16);
        long[] jArr = o0.f6312a;
        new g0();
    }
}
