package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mb0 {
    public final String a;
    public final String b;
    public final String c;
    public final zsm d;
    public final ArrayList e;

    public mb0(String str, String str2, String str3, zsm zsmVar, ArrayList arrayList) {
        eta.r(str, str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zsmVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        if (!Intrinsics.d(this.a, mb0Var.a) || !Intrinsics.d(this.b, mb0Var.b) || !Intrinsics.d(this.c, mb0Var.c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.d(str, str) && this.d.equals(mb0Var.d) && this.e.equals(mb0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", appBuildVersion=");
        sb.append(this.c);
        sb.append(", deviceManufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", currentProcessDetails=");
        sb.append(this.d);
        sb.append(", appProcessDetails=");
        return k5r.o(sb, this.e, ')');
    }
}
