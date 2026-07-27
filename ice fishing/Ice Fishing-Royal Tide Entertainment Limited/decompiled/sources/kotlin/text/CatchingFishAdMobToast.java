package kotlin.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishAdMobToast {
    public Object CatchingFishCoroutine;
    public Serializable CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public Serializable CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public static String CatchingFishCoroutine(com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary) {
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        CatchingFishOkHttpSnackbar catchingFishOkHttpSnackbar = catchingFishPagingLibrary.CatchingFishCoroutine;
        String str = catchingFishOkHttpSnackbar.CatchingFishDaggerWebsocket;
        if (str != null) {
            return str;
        }
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        String str2 = catchingFishOkHttpSnackbar.CatchingFishSnackbar;
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

    public synchronized void CatchingFishDaggerWebsocket() {
        PackageInfo packageInfo;
        try {
            packageInfo = ((Context) this.CatchingFishCoroutine).getPackageManager().getPackageInfo(((Context) this.CatchingFishCoroutine).getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.CatchingFishReduxKtor = Integer.toString(packageInfo.versionCode);
            this.CatchingFishDaggerWebsocket = packageInfo.versionName;
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int CatchingFishParcelableFAB(long j) {
        int i = this.CatchingFishParcelableFAB + 1;
        long[] jArr = (long[]) this.CatchingFishCoroutine;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            ?? r2 = new int[i2];
            CatchingFishMVVMHilt.CatchingFishRecyclerView(jArr, jArr2, 0, 0, jArr.length);
            CatchingFishMVVMHilt.CatchingFishDataStoreIntent(0, 0, 14, (int[]) this.CatchingFishReduxKtor, r2);
            this.CatchingFishCoroutine = jArr2;
            this.CatchingFishReduxKtor = r2;
        }
        int i3 = this.CatchingFishParcelableFAB;
        this.CatchingFishParcelableFAB = i3 + 1;
        int length2 = ((int[]) this.CatchingFishDaggerWebsocket).length;
        if (this.CatchingFishSnackbar >= length2) {
            int i4 = length2 * 2;
            ?? r22 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r22[i5] = i6;
                i5 = i6;
            }
            CatchingFishMVVMHilt.CatchingFishDataStoreIntent(0, 0, 14, (int[]) this.CatchingFishDaggerWebsocket, r22);
            this.CatchingFishDaggerWebsocket = r22;
        }
        int i7 = this.CatchingFishSnackbar;
        int[] iArr = (int[]) this.CatchingFishDaggerWebsocket;
        this.CatchingFishSnackbar = iArr[i7];
        long[] jArr3 = (long[]) this.CatchingFishCoroutine;
        jArr3[i3] = j;
        ((int[]) this.CatchingFishReduxKtor)[i3] = i7;
        iArr[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (CatchingFishFirebaseDagger.CatchingFishCoroutineFlow(jArr3[i8], j) <= 0) {
                break;
            }
            CatchingFishWorkManager(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public boolean CatchingFishReduxKtor() {
        int i;
        synchronized (this) {
            i = this.CatchingFishSnackbar;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.CatchingFishCoroutine).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    if (!CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.CatchingFishSnackbar = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        if (CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                            this.CatchingFishSnackbar = 2;
                        } else {
                            this.CatchingFishSnackbar = 1;
                        }
                        i = this.CatchingFishSnackbar;
                    } else {
                        this.CatchingFishSnackbar = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public synchronized String CatchingFishSnackbar() {
        try {
            if (((String) this.CatchingFishReduxKtor) == null) {
                CatchingFishDaggerWebsocket();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.CatchingFishReduxKtor;
    }

    public void CatchingFishWorkManager(int i, int i2) {
        long[] jArr = (long[]) this.CatchingFishCoroutine;
        int[] iArr = (int[]) this.CatchingFishReduxKtor;
        int[] iArr2 = (int[]) this.CatchingFishDaggerWebsocket;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
