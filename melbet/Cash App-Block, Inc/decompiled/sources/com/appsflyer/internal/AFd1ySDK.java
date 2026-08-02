package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1aSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.getMonetizationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        th.getClass();
        str.getClass();
        synchronized (this) {
            File AFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (AFAdRevenueData != null) {
                file = new File(AFAdRevenueData, "6.17.5");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFc1aSDK revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.getCurrencyIso4217Code;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
                        AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(FilesKt__FileReadWriteKt.readText(file2, Charsets.UTF_8));
                        if (mediationNetwork != null) {
                            mediationNetwork.AFAdRevenueData++;
                            revenue = mediationNetwork;
                        }
                    }
                    FilesKt__FileReadWriteKt.writeText$default(file2, revenue.getMonetizationNetwork());
                    str2 = str3;
                } catch (Exception e) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        name.getClass();
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i > mediationNetwork || mediationNetwork > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    for (File file2 : arrayList) {
                        file2.getClass();
                        arrayList2.add(Boolean.valueOf(FilesKt__UtilsKt.deleteRecursively(file2)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFc1aSDK) it.next()).AFAdRevenueData;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean z;
        strArr.getClass();
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                z = true;
                if (AFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z = FilesKt__UtilsKt.deleteRecursively(AFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: ".concat(ArraysKt___ArraysKt.joinToString$default(strArr, ", ", null, null, null, 62)), false, 4, null);
                        File[] listFiles = AFAdRevenueData.listFiles();
                        if (listFiles != null) {
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!ArraysKt___ArraysKt.contains(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                file2.getClass();
                                arrayList2.add(Boolean.valueOf(FilesKt__UtilsKt.deleteRecursively(file2)));
                            }
                            Set set = CollectionsKt.toSet(arrayList2);
                            if (set.isEmpty()) {
                                set = SetsKt__SetsJVMKt.setOf(Boolean.TRUE);
                            }
                            Set set2 = set;
                            if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x006b, TryCatch #1 {all -> 0x006b, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0067, B:25:0x006d, B:30:0x0045, B:32:0x0070, B:34:0x0076, B:11:0x001a, B:13:0x0020, B:15:0x0029, B:17:0x003c), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFc1cSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFc1aSDK> getRevenue() {
        List<AFc1aSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File AFAdRevenueData = AFAdRevenueData();
                list = null;
                if (AFAdRevenueData != null && (listFiles = AFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFc1aSDK.Companion companion = AFc1aSDK.INSTANCE;
                                file2.getClass();
                                AFc1aSDK mediationNetwork = AFc1aSDK.Companion.getMediationNetwork(FilesKt__FileReadWriteKt.readText(file2, Charsets.UTF_8));
                                if (mediationNetwork != null) {
                                    arrayList.add(mediationNetwork);
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
                    list = CollectionsKt__IterablesKt.flatten(arrayList2);
                }
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
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
}
