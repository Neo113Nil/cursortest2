package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1jSDK implements AFd1hSDK {
    private final AFd1nSDK AFAdRevenueData;

    public AFd1jSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.AFAdRevenueData = aFd1nSDK;
    }

    private final File getRevenue() {
        Context context = this.AFAdRevenueData.AFAdRevenueData;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean AFAdRevenueData() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            try {
                File revenue = getRevenue();
                str2 = null;
                if (revenue != null) {
                    file = new File(revenue, "6.15.2");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                } else {
                    file = null;
                }
                if (file != null) {
                    try {
                        AFd1fSDK monetizationNetwork = AFd1dSDK.getMonetizationNetwork(th, str);
                        String str3 = monetizationNetwork.getMediationNetwork;
                        File file2 = new File(file, str3);
                        if (file2.exists()) {
                            AFd1fSDK.AFa1zSDK aFa1zSDK = AFd1fSDK.AFa1zSDK;
                            AFd1fSDK mediationNetwork = AFd1fSDK.AFa1zSDK.getMediationNetwork(k.j.a(file2));
                            if (mediationNetwork != null) {
                                mediationNetwork.getCurrencyIso4217Code++;
                                monetizationNetwork = mediationNetwork;
                            }
                        }
                        k.j.b(file2, monetizationNetwork.getMonetizationNetwork());
                        str2 = str3;
                    } catch (Exception e2) {
                        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e2.getMessage(), false, 4, null);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getMonetizationNetwork().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((AFd1fSDK) it.next()).getCurrencyIso4217Code;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:22:0x006a, B:23:0x006d, B:19:0x0048, B:24:0x0070, B:26:0x0076, B:10:0x001a, B:12:0x0020, B:14:0x002e, B:16:0x0041), top: B:34:0x0001, inners: #0 }] */
    @Override // com.appsflyer.internal.AFd1hSDK
    public final List<AFd1fSDK> getMonetizationNetwork() {
        List<AFd1fSDK> listD;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            File revenue = getRevenue();
            listD = null;
            if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : fileArrListFiles) {
                    try {
                        File[] fileArrListFiles2 = file.listFiles();
                        if (fileArrListFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                AFd1fSDK.AFa1zSDK aFa1zSDK = AFd1fSDK.AFa1zSDK;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFd1fSDK mediationNetwork = AFd1fSDK.AFa1zSDK.getMediationNetwork(k.j.a(file2));
                                if (mediationNetwork != null) {
                                    arrayList.add(mediationNetwork);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                    }
                    if (arrayList != null) {
                        arrayList2.add(arrayList);
                    }
                }
                listD = kotlin.collections.p.d(arrayList2);
                if (listD == null) {
                    listD = x.f177a;
                }
            } else if (listD == null) {
                listD = x.f177a;
            }
            throw th;
        }
        return listD;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean getCurrencyIso4217Code(String... strArr) {
        boolean zC;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File revenue = getRevenue();
            zC = true;
            if (revenue != null) {
                if (strArr.length == 0) {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    zC = k.l.c(revenue);
                } else {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + kotlin.collections.m.b(strArr), false, 4, null);
                    File[] fileArrListFiles = revenue.listFiles();
                    if (fileArrListFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                        ArrayList<File> arrayList = new ArrayList();
                        for (File file : fileArrListFiles) {
                            if (!kotlin.collections.m.a(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.p.c(arrayList));
                        for (File file2 : arrayList) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList2.add(Boolean.valueOf(k.l.c(file2)));
                        }
                        Set setH = CollectionsKt.h(arrayList2);
                        if (setH.isEmpty()) {
                            setH = Collections.singleton(Boolean.TRUE);
                            Intrinsics.checkNotNullExpressionValue(setH, "singleton(element)");
                        }
                        if (setH.size() != 1 || !((Boolean) CollectionsKt.f(setH)).booleanValue()) {
                            zC = false;
                        }
                    }
                }
            }
        }
        return zC;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void getMonetizationNetwork(int i2, int i3) {
        File[] fileArrListFiles;
        synchronized (this) {
            File revenue = getRevenue();
            if (revenue != null && (fileArrListFiles = revenue.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int monetizationNetwork = AFc1vSDK.getMonetizationNetwork(name);
                    if (!(i2 <= monetizationNetwork && monetizationNetwork <= i3)) {
                        arrayList.add(file);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.p.c(arrayList));
                for (File file2 : arrayList) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList2.add(Boolean.valueOf(k.l.c(file2)));
                }
            }
            Unit unit = Unit.f157a;
        }
    }
}
