package com.gamericefishpro.space.s8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.v8.z;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static j c;
    public final Object a;
    public volatile Object b;

    public j(Context context) {
        this.a = context.getApplicationContext();
    }

    public static j a(Context context) {
        c0.g(context);
        synchronized (j.class) {
            if (c == null) {
                m mVar = r.a;
                synchronized (r.class) {
                    if (r.e == null) {
                        r.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new j(context);
            }
        }
        return c;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        com.gamericefishpro.space.h9.f fVar;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                com.gamericefishpro.space.h9.f fVar2 = z ? q.c : q.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        com.gamericefishpro.space.h9.b bVar = com.gamericefishpro.space.h9.e.e;
                        Object[] objArr = {byteArray};
                        com.gamericefishpro.space.wa.b.U(1, objArr);
                        fVar = new com.gamericefishpro.space.h9.f(1, objArr);
                    } else {
                        com.gamericefishpro.space.h9.b bVar2 = com.gamericefishpro.space.h9.e.e;
                        fVar = com.gamericefishpro.space.h9.f.w;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        com.gamericefishpro.space.h9.b bVar3 = com.gamericefishpro.space.h9.e.e;
                        fVar = com.gamericefishpro.space.h9.f.w;
                    } else {
                        com.gamericefishpro.space.h9.b bVar4 = com.gamericefishpro.space.h9.e.e;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        fVar = i4 == 0 ? com.gamericefishpro.space.h9.f.w : new com.gamericefishpro.space.h9.f(i4, objArrCopyOf);
                    }
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                com.gamericefishpro.space.h9.e eVarH = fVar.h();
                int size = eVarH.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) eVarH.get(i6);
                    com.gamericefishpro.space.h9.b bVarL = fVar2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!bVarL.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarL.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? d(packageInfo, q.a) : d(packageInfo, q.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static n d(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < nVarArr.length; i++) {
                if (nVarArr[i].equals(oVar)) {
                    return nVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    public boolean b(int i) {
        u uVarB;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            uVarB = u.b("no pkgs");
        } else {
            uVarB = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    c0.g(uVarB);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    uVarB = u.b("null pkg");
                } else if (str.equals((String) this.b)) {
                    uVarB = u.c;
                } else {
                    m mVar = r.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            r.a();
                            boolean zK = ((z) r.c).K();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zK) {
                                boolean zA = h.a((Context) this.a);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    c0.g(r.e);
                                    try {
                                        r.a();
                                        c0.g(r.e);
                                        Context context = (Context) com.gamericefishpro.space.c9.b.G(com.gamericefishpro.space.c9.b.F(new com.gamericefishpro.space.c9.b(r.e)));
                                        try {
                                            z zVar = (z) r.c;
                                            Parcel parcelH = zVar.H();
                                            int i3 = com.gamericefishpro.space.h9.i.a;
                                            parcelH.writeInt(1);
                                            int iV = y3.V(parcelH, 20293);
                                            y3.Q(parcelH, 1, str);
                                            y3.U(parcelH, 2, 4);
                                            parcelH.writeInt(zA ? 1 : 0);
                                            y3.U(parcelH, 3, 4);
                                            parcelH.writeInt(0);
                                            y3.O(parcelH, 4, new com.gamericefishpro.space.c9.b(context));
                                            y3.U(parcelH, 5, 4);
                                            parcelH.writeInt(0);
                                            y3.U(parcelH, 6, 4);
                                            parcelH.writeInt(1);
                                            y3.U(parcelH, 8, 4);
                                            parcelH.writeInt(0);
                                            y3.W(parcelH, iV);
                                            Parcel parcelF = zVar.F(parcelH, 6);
                                            s sVar = (s) com.gamericefishpro.space.h9.i.a(parcelF, s.CREATOR);
                                            parcelF.recycle();
                                            if (sVar.d) {
                                                com.gamericefishpro.space.u6.f.O(sVar.v);
                                                uVarB = new u(true, null, null);
                                            } else {
                                                String str2 = sVar.e;
                                                PackageManager.NameNotFoundException nameNotFoundException = com.gamericefishpro.space.wa.b.T(sVar.i) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                com.gamericefishpro.space.u6.f.O(sVar.v);
                                                com.gamericefishpro.space.wa.b.T(sVar.i);
                                                uVarB = new u(false, str2, nameNotFoundException);
                                            }
                                        } catch (RemoteException e) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                            uVarB = u.c("module call", e);
                                        }
                                    } catch (com.gamericefishpro.space.d9.b e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        uVarB = u.c("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.a).getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                    boolean zA2 = h.a((Context) this.a);
                                    if (packageInfo == null) {
                                        uVarB = u.b("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            uVarB = u.b("single cert required");
                                        } else {
                                            o oVar = new o(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                u uVarB2 = r.b(str3, oVar, zA2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (uVarB2.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        u uVarB3 = r.b(str3, oVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (uVarB3.a) {
                                                            uVarB = u.b("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th2) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th2;
                                                    }
                                                }
                                                uVarB = uVarB2;
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th3;
                                            }
                                        }
                                    }
                                    if (uVarB.a) {
                                        this.b = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e3) {
                                    uVarB = u.c("no pkg ".concat(str), e3);
                                }
                            }
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } catch (RemoteException | com.gamericefishpro.space.d9.b e4) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                    if (uVarB.a) {
                        this.b = str;
                    }
                }
                if (uVarB.a) {
                    break;
                }
                i2++;
            }
        }
        if (!uVarB.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (uVarB.b != null) {
                uVarB.a();
            } else {
                uVarB.a();
            }
        }
        return uVarB.a;
    }

    public j() {
        this.a = new CopyOnWriteArraySet();
    }
}
