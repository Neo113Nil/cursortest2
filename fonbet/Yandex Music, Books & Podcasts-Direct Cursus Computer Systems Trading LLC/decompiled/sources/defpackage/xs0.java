package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xs0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final pt0 h;

    public xs0(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, pt0 pt0Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = pt0Var;
    }

    public static xs0 a(Context context, uae uaeVar, String str, String str2, ArrayList arrayList, pt0 pt0Var) {
        String packageName = context.getPackageName();
        String d = uaeVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String l = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new xs0(str, str2, arrayList, d, packageName, l, str3, pt0Var);
    }
}
