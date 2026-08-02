package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class wnd implements lci, i48 {
    public static wnd c;
    public final /* synthetic */ int a;
    public final Context b;

    public wnd(Context context, int i) {
        this.a = i;
        switch (i) {
            case 4:
                context.getClass();
                this.b = context;
                break;
            case 5:
            case 7:
            default:
                this.b = context.getApplicationContext();
                break;
            case 6:
                context.getClass();
                this.b = context;
                break;
            case 8:
                context.getClass();
                this.b = context;
                break;
        }
    }

    public static wnd b(Context context) {
        y1g.G(context);
        synchronized (wnd.class) {
            if (c == null) {
                k9x k9xVar = fhx.a;
                synchronized (fhx.class) {
                    if (fhx.c == null) {
                        fhx.c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new wnd(context, 0);
            }
        }
        return c;
    }

    public static final nex c(PackageInfo packageInfo, nex... nexVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            ffx ffxVar = new ffx(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nexVarArr.length; i++) {
                if (nexVarArr[i].equals(ffxVar)) {
                    return nexVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (z) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? c(packageInfo2, pgx.a) : c(packageInfo2, pgx.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z ? c(packageInfo2, pgx.a) : c(packageInfo2, pgx.a[0])) == null) {
            }
        }
        return false;
    }

    @Override // defpackage.i48
    public Class a() {
        return Drawable.class;
    }

    @Override // defpackage.i48
    public /* bridge */ /* synthetic */ void l(Object obj) {
    }

    @Override // defpackage.i48
    public Object m(int i, Resources.Theme theme, Resources resources) {
        Context context = this.b;
        return sj2.v(context, context, i, theme);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        switch (this.a) {
            case 3:
                return new fr1(this.b, this);
            default:
                return new fr1(this.b, kkpVar.n(Integer.class, AssetFileDescriptor.class));
        }
    }

    public /* synthetic */ wnd(Context context, int i, boolean z) {
        this.a = i;
        this.b = context;
    }

    public wnd(Context context, iw2 iw2Var) {
        this.a = 2;
        this.b = context;
    }
}
