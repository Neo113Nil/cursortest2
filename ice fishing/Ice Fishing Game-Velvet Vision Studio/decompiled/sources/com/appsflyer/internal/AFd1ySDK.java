package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.q0;
import com.gamericefishpro.space.ph.v;
import com.gamericefishpro.space.ph.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private final File AFAdRevenueData() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1aSDK) it.next()).getMediationNetwork;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean zD;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                zD = true;
                if (fileAFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zD = com.gamericefishpro.space.ai.l.d(fileAFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + v.v(62, strArr), false, 4, null);
                        File[] fileArrListFiles = fileAFAdRevenueData.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!v.n(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(y.j(arrayList, 10));
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                File file2 = (File) obj;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(com.gamericefishpro.space.ai.l.d(file2)));
                            }
                            Set setO = CollectionsKt.O(arrayList2);
                            if (setO.isEmpty()) {
                                setO = q0.b(Boolean.TRUE);
                            }
                            Set set = setO;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.v(set)).booleanValue()) {
                                zD = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<com.appsflyer.internal.AFc1aSDK>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.gamericefishpro.space.ph.g0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // com.appsflyer.internal.AFc1cSDK
    public final List<AFc1aSDK> getRevenue() {
        ?? arrayList;
        File[] fileArrListFiles;
        ArrayList arrayList2;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                arrayList = 0;
                arrayList = 0;
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i = 0;
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList2 = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    AFc1aSDK.AFa1zSDK aFa1zSDK = AFc1aSDK.AFa1zSDK;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    AFc1aSDK mediationNetwork = AFc1aSDK.AFa1zSDK.getMediationNetwork(com.gamericefishpro.space.ai.j.a(file2));
                                    if (mediationNetwork != null) {
                                        arrayList2.add(mediationNetwork);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (arrayList2 != null) {
                            arrayList3.add(arrayList2);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                    arrayList = new ArrayList();
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj = arrayList3.get(i);
                        i++;
                        c0.l(arrayList, (Iterable) obj);
                    }
                }
                if (arrayList == 0) {
                    arrayList = g0.d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i > mediationNetwork || mediationNetwork > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(y.j(arrayList, 10));
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        File file2 = (File) obj;
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(com.gamericefishpro.space.ai.l.d(file2)));
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (fileAFAdRevenueData != null) {
                file = new File(fileAFAdRevenueData, "6.17.5");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1aSDK revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.AFAdRevenueData;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1aSDK.AFa1zSDK aFa1zSDK = AFc1aSDK.AFa1zSDK;
                        AFc1aSDK mediationNetwork = AFc1aSDK.AFa1zSDK.getMediationNetwork(com.gamericefishpro.space.ai.j.a(file2));
                        if (mediationNetwork != null) {
                            mediationNetwork.getMediationNetwork++;
                            revenue = mediationNetwork;
                        }
                    }
                    com.gamericefishpro.space.ai.j.b(file2, revenue.getMonetizationNetwork());
                    str2 = str3;
                } catch (Exception e) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }
}
