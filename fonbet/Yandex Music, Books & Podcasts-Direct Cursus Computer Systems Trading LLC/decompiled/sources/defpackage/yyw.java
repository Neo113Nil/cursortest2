package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class yyw extends pww {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyw(int i, i8s i8sVar) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 1);
        this.h = i;
        switch (i) {
            case 1:
                this.i = i8sVar;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
                break;
            case 2:
                this.i = i8sVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 1);
                break;
            case 3:
                this.i = i8sVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback", 1);
                break;
            default:
                this.i = i8sVar;
                break;
        }
    }

    @Override // defpackage.pww
    public final boolean M0(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String d;
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) ezw.a(parcel, Status.CREATOR);
                doo dooVar = (doo) ezw.a(parcel, doo.CREATOR);
                ezw.b(parcel);
                uwf.B(status, dooVar, (i8s) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) ezw.a(parcel, Status.CREATOR);
                wy2 wy2Var = (wy2) ezw.a(parcel, wy2.CREATOR);
                ezw.b(parcel);
                uwf.B(status2, wy2Var, (i8s) obj);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Status status3 = (Status) ezw.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) ezw.a(parcel, PendingIntent.CREATOR);
                ezw.b(parcel);
                uwf.B(status3, pendingIntent, (i8s) obj);
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                Status status4 = (Status) ezw.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) ezw.a(parcel, PendingIntent.CREATOR);
                ezw.b(parcel);
                uwf.B(status4, pendingIntent2, (i8s) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    S0();
                    ozw.F(revocationBoundService).G();
                    return true;
                }
                S0();
                ihr a = ihr.a(revocationBoundService);
                GoogleSignInAccount b = a.b();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.k;
                if (b != null) {
                    String d2 = a.d("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(d2) && (d = a.d(ihr.g("googleSignInOptions", d2))) != null) {
                        try {
                            googleSignInOptions = GoogleSignInOptions.a(d);
                        } catch (JSONException unused) {
                        }
                    }
                    googleSignInOptions = null;
                }
                GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
                y1g.G(googleSignInOptions2);
                w8c w8cVar = new w8c((RevocationBoundService) obj, null, mz1.a, googleSignInOptions2, new nmd(new rwd(13), Looper.getMainLooper()));
                int i3 = 9;
                Context context = w8cVar.a;
                dxw dxwVar = w8cVar.h;
                if (b == null) {
                    boolean z = w8cVar.d() == 3;
                    nzw.a.a("Signing out", new Object[0]);
                    nzw.b(context);
                    if (z) {
                        BasePendingResult vgrVar = new vgr(dxwVar, 0);
                        vgrVar.g(Status.e);
                        basePendingResult = vgrVar;
                    } else {
                        lzw lzwVar = new lzw(dxwVar, 0);
                        dxwVar.b(lzwVar);
                        basePendingResult = lzwVar;
                    }
                    basePendingResult.a(new eww(basePendingResult, new i8s(), new t7l(i3)));
                    return true;
                }
                boolean z2 = w8cVar.d() == 3;
                nzw.a.a("Revoking access", new Object[0]);
                String d3 = ihr.a(context).d("refreshToken");
                nzw.b(context);
                if (!z2) {
                    lzw lzwVar2 = new lzw(dxwVar, 1);
                    dxwVar.b(lzwVar2);
                    basePendingResult2 = lzwVar2;
                } else if (d3 == null) {
                    t7e t7eVar = czw.c;
                    Status status5 = new Status(4, null, null, null);
                    y1g.y("Status code must not be SUCCESS", !status5.d());
                    BasePendingResult gywVar = new gyw(status5);
                    gywVar.g(status5);
                    basePendingResult2 = gywVar;
                } else {
                    czw czwVar = new czw(d3);
                    new Thread(czwVar).start();
                    basePendingResult2 = czwVar.b;
                }
                basePendingResult2.a(new eww(basePendingResult2, new i8s(), new t7l(i3)));
                return true;
        }
    }

    public void S0() {
        AppOpsManager appOpsManager;
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.i;
        int callingUid = Binder.getCallingUid();
        me1 a = b6w.a(revocationBoundService);
        a.getClass();
        try {
            appOpsManager = (AppOpsManager) a.b.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            wnd b = wnd.b(revocationBoundService);
            b.getClass();
            if (packageInfo != null) {
                if (wnd.d(packageInfo, false)) {
                    return;
                }
                if (wnd.d(packageInfo, true)) {
                    Context context = b.b;
                    try {
                        if (!rnd.c) {
                            try {
                                PackageInfo packageInfo2 = b6w.a(context).b.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                wnd.b(context);
                                if (packageInfo2 == null || wnd.d(packageInfo2, false) || !wnd.d(packageInfo2, true)) {
                                    rnd.b = false;
                                } else {
                                    rnd.b = true;
                                }
                                rnd.c = true;
                            } catch (PackageManager.NameNotFoundException e) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                rnd.c = true;
                            }
                        }
                        if (rnd.b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th) {
                        rnd.c = true;
                        throw th;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        throw new SecurityException(dfi.c(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyw(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.h = 4;
        this.i = revocationBoundService;
    }
}
