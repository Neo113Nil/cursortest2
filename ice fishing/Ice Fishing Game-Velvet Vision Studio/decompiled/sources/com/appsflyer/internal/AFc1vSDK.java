package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.w;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.t0.y0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class AFc1vSDK implements AFc1tSDK {
    private final AFc1hSDK AFAdRevenueData;
    private final AFc1qSDK getMediationNetwork;
    private final Map<String, Integer> getMonetizationNetwork;
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(AFc1hSDK aFc1hSDK, AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(x.f(new AFc1sSDK("ConversionsCache", w.c(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", w.c(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", x.f(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
        this.getMonetizationNetwork = m0.f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1uSDK;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    y3.s(inputStreamReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getMonetizationNetwork;
                String str2 = aFc1sSDK.AFAdRevenueData;
                File[] fileArrListFiles = file.listFiles();
                map.put(str2, Integer.valueOf(fileArrListFiles != null ? fileArrListFiles.length : 0));
            } else {
                file.mkdirs();
                this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final List<AFc1uSDK> getCurrencyIso4217Code() {
        int i;
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] elements = file.listFiles();
                if (elements == null) {
                    elements = new File[0];
                }
                Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                arrayList2.addAll(com.gamericefishpro.space.ph.u.b(elements));
            }
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                File file2 = (File) obj;
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1uSDK aFc1uSDKAFAdRevenueData = AFAdRevenueData(file2);
                if (aFc1uSDKAFAdRevenueData != null) {
                    arrayList.add(aFc1uSDKAFAdRevenueData);
                }
            }
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, y0.f(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context4);
                    com.gamericefishpro.space.ai.l.d(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.b(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.b(context3);
                File[] fileArrListFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (fileArrListFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    for (File file : fileArrListFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context4);
            com.gamericefishpro.space.ai.l.d(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork == null || (str = mediationNetwork.AFAdRevenueData) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final boolean getMediationNetwork(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, y0.g("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.b(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, y0.g("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMediationNetwork(file);
            }
        }
        return true;
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object next;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((AFc1sSDK) next).getMediationNetwork.contains(aFe1pSDK)) {
                return (AFc1sSDK) next;
            }
        }
        next = null;
        return (AFc1sSDK) next;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0225  */
    @Override // com.appsflyer.internal.AFc1tSDK
    public final String getMediationNetwork(AFc1uSDK aFc1uSDK) {
        String str;
        Exception exc;
        File file;
        String str2;
        List<File> listJ;
        Intrinsics.checkNotNullParameter(aFc1uSDK, "");
        try {
            AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1pSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.b(context);
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK));
            if (!file2.exists()) {
                try {
                    file2.mkdirs();
                } catch (Exception e) {
                    exc = e;
                    file = null;
                    str = null;
                    if (file != null) {
                        file.delete();
                    }
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Caching request with URL: " + aFc1uSDK.getRevenue, false, 4, null);
            String strValueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, strValueOf);
            try {
                try {
                    file.createNewFile();
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                    try {
                        outputStreamWriter.write("version=");
                        outputStreamWriter.write(aFc1uSDK.getCurrencyIso4217Code);
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("url=");
                        outputStreamWriter.write(aFc1uSDK.getRevenue);
                        outputStreamWriter.write(10);
                        outputStreamWriter.write("data=");
                        outputStreamWriter.write(Base64.encodeToString(aFc1uSDK.getMediationNetwork(), 2));
                        outputStreamWriter.write(10);
                        AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
                        str = null;
                        try {
                            outputStreamWriter.write("type=");
                            outputStreamWriter.write(aFe1pSDK2.name());
                            outputStreamWriter.write(10);
                            Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
                            if (map != null && !map.isEmpty()) {
                                outputStreamWriter.write("headers=");
                                Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
                                Intrinsics.c(map2, "");
                                String string = new JSONObject(map2).toString();
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                byte[] bytes = string.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "");
                                outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                                outputStreamWriter.write(10);
                            }
                            outputStreamWriter.flush();
                            Unit unit = Unit.a;
                            outputStreamWriter.close();
                            AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache request: done, cacheKey: " + strValueOf, false, 4, null);
                            AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(aFe1pSDK3, "");
                            AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
                            Integer numValueOf = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
                            if (numValueOf == null) {
                                return strValueOf;
                            }
                            int iIntValue = numValueOf.intValue();
                            Map<String, Integer> map3 = this.getMonetizationNetwork;
                            AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
                            if (mediationNetwork2 != null && (str2 = mediationNetwork2.AFAdRevenueData) != null) {
                                Integer num = map3.get(str2);
                                int iIntValue2 = num != null ? num.intValue() : 0;
                                if (iIntValue2 >= iIntValue) {
                                    int i = (iIntValue2 + 1) - iIntValue;
                                    AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Cache overflown for type " + aFe1pSDK3 + ", removing " + i + " item(s)", false, 4, null);
                                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                                    Intrinsics.b(context2);
                                    File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK3));
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                    Object[] objArrListFiles = file3.listFiles();
                                    if (objArrListFiles != null) {
                                        Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // java.util.Comparator
                                            public final int compare(T t, T t2) {
                                                return com.gamericefishpro.space.rh.a.a(((File) t).getName(), ((File) t2).getName());
                                            }
                                        };
                                        Intrinsics.checkNotNullParameter(objArrListFiles, "<this>");
                                        Intrinsics.checkNotNullParameter(comparator, "comparator");
                                        Intrinsics.checkNotNullParameter(objArrListFiles, "<this>");
                                        Intrinsics.checkNotNullParameter(comparator, "comparator");
                                        if (objArrListFiles.length != 0) {
                                            objArrListFiles = Arrays.copyOf(objArrListFiles, objArrListFiles.length);
                                            Intrinsics.checkNotNullExpressionValue(objArrListFiles, "copyOf(...)");
                                            com.gamericefishpro.space.ph.u.l(objArrListFiles, comparator);
                                        }
                                        List listB = com.gamericefishpro.space.ph.u.b(objArrListFiles);
                                        if (listB != null && (listJ = CollectionsKt.J(i, listB)) != null) {
                                            for (File file4 : listJ) {
                                                file4.delete();
                                                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                                            }
                                        }
                                    }
                                }
                                getMonetizationNetwork();
                                return strValueOf;
                            }
                            throw new UnsupportedOperationException("Cache do not support this type of events");
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                y3.s(outputStreamWriter, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                    exc = e;
                    if (file != null) {
                        file.delete();
                    }
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            } catch (Exception e3) {
                e = e3;
                exc = e;
                if (file != null) {
                    file.delete();
                }
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return str;
            }
        } catch (Exception e4) {
            str = null;
            exc = e4;
            file = null;
        }
    }
}
