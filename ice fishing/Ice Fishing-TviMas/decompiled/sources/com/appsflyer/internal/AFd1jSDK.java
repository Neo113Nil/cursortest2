package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
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
                    String str3 = monetizationNetwork.getMonetizationNetwork;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                        AFd1fSDK mediationNetwork = AFd1fSDK.Companion.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.getRevenue++;
                            monetizationNetwork = mediationNetwork;
                        }
                    }
                    FilesKt.writeText$default(file2, monetizationNetwork.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: all -> 0x008d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001a, B:24:0x0077, B:26:0x007a, B:31:0x0050, B:33:0x007d, B:35:0x0087, B:11:0x001c, B:13:0x0022, B:15:0x0032, B:17:0x0046, B:19:0x0049, B:22:0x004c), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1hSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1fSDK> getMonetizationNetwork() {
        List<AFd1fSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            File revenue = getRevenue();
            list = null;
            if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : listFiles) {
                    try {
                        listFiles2 = file.listFiles();
                    } catch (Throwable th) {
                        AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                    }
                    if (listFiles2 != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                        ArrayList arrayList3 = new ArrayList();
                        for (File file2 : listFiles2) {
                            AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            AFd1fSDK mediationNetwork = AFd1fSDK.Companion.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                            if (mediationNetwork != null) {
                                arrayList3.add(mediationNetwork);
                            }
                        }
                        arrayList = arrayList3;
                        if (arrayList == null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                }
                list = CollectionsKt.flatten(arrayList2);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getMonetizationNetwork().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFd1fSDK) it.next()).getRevenue;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean AFAdRevenueData() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final boolean getCurrencyIso4217Code(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File revenue = getRevenue();
            z = true;
            if (revenue != null) {
                if (strArr.length == 0) {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    z = FilesKt.deleteRecursively(revenue);
                } else {
                    AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                    File[] listFiles = revenue.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFd1hSDK
    public final void getMonetizationNetwork(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            File revenue = getRevenue();
            if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int monetizationNetwork = AFc1vSDK.getMonetizationNetwork(name);
                    if (i > monetizationNetwork || monetizationNetwork > i2) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (File file2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                }
                ArrayList arrayList4 = arrayList3;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
