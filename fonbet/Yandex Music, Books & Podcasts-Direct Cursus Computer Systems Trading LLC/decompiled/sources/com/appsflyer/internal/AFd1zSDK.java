package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1cSDK;
import defpackage.c5b;
import defpackage.cbc;
import defpackage.uop;
import defpackage.v75;
import defpackage.xz0;
import defpackage.zac;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1zSDK implements AFc1aSDK {

    @NotNull
    private final AFc1hSDK AFAdRevenueData;

    public AFd1zSDK(@NotNull AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.AFAdRevenueData = aFc1hSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0065, B:25:0x006b, B:30:0x0043, B:32:0x006e, B:34:0x0074, B:11:0x001a, B:13:0x0020, B:15:0x0029, B:17:0x003a), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFc1cSDK> getCurrencyIso4217Code() {
        List<AFc1cSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                list = null;
                if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                                file2.getClass();
                                AFc1cSDK monetizationNetwork = AFc1cSDK.Companion.getMonetizationNetwork(zac.d(file2));
                                if (monetizationNetwork != null) {
                                    arrayList.add(monetizationNetwork);
                                }
                            }
                            if (arrayList == null) {
                                arrayList2.add(arrayList);
                            }
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                    }
                    list = v75.p(arrayList2);
                }
                if (list == null) {
                    list = c5b.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final void getMediationNetwork(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            try {
                File revenue = getRevenue();
                if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        name.getClass();
                        int currencyIso4217Code = AFj1cSDK.getCurrencyIso4217Code(name);
                        if (i > currencyIso4217Code || currencyIso4217Code > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    for (File file2 : arrayList) {
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(cbc.j(file2)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getMonetizationNetwork() {
        return getRevenue(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final boolean getRevenue(@NotNull String... strArr) {
        boolean z;
        strArr.getClass();
        synchronized (this) {
            try {
                File revenue = getRevenue();
                z = true;
                if (revenue != null) {
                    if (strArr.length == 0) {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z = cbc.j(revenue);
                    } else {
                        AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(xz0.J(strArr, ", ", null, 62)), false, 4, null);
                        File[] listFiles = revenue.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!xz0.u(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(cbc.j(file2)));
                            }
                            Set A0 = CollectionsKt.A0(arrayList2);
                            if (A0.isEmpty()) {
                                A0 = uop.b(Boolean.TRUE);
                            }
                            Set set = A0;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.P(set)).booleanValue()) {
                                z = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getCurrencyIso4217Code().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1cSDK) it.next()).AFAdRevenueData;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    public final String getCurrencyIso4217Code(@NotNull Throwable th, @NotNull String str) {
        String str2;
        File file;
        th.getClass();
        str.getClass();
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.16.2");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1cSDK currencyIso4217Code = AFd1ySDK.getCurrencyIso4217Code(th, str);
                    String str3 = currencyIso4217Code.getMediationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1cSDK.Companion companion = AFc1cSDK.INSTANCE;
                        AFc1cSDK monetizationNetwork = AFc1cSDK.Companion.getMonetizationNetwork(zac.d(file2));
                        if (monetizationNetwork != null) {
                            monetizationNetwork.AFAdRevenueData++;
                            currencyIso4217Code = monetizationNetwork;
                        }
                    }
                    zac.f(file2, currencyIso4217Code.AFAdRevenueData());
                    str2 = str3;
                } catch (Exception e) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
