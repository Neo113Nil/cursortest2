package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iw0 {
    public final String a;
    public final mb0 b;

    public iw0(String str, mb0 mb0Var) {
        dfi.s(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = mb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        if (!Intrinsics.d(this.a, iw0Var.a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.d(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return Intrinsics.d(str2, str2) && this.b.equals(iw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((vqg.LOG_ENVIRONMENT_PROD.hashCode() + k5r.c((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 47595001) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=2.1.2, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + vqg.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
