package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.RemoteException;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public abstract class Bugsnag {
    public static Client client;
    public static Method getCurrentCallbackSetCounts;
    public static Method getCurrentNativeApiCallUsage;
    public static Method initCallbackCounts;
    public static final Object lock = new Object();
    public static Plugin ndkPlugin;
    public static Method notifyAddCallback;
    public static Method setInternalMetricsEnabled;
    public static Method setStaticData;

    public static long findTimestampInFilename(File file) {
        String name = file.getName();
        if (StringsKt__StringsJVMKt.endsWith(file.getName(), "_v3.json", false)) {
            String name2 = file.getName();
            name = StringsKt.substringAfter('_', name2, name2);
        }
        String name3 = file.getName();
        if (StringsKt__StringsJVMKt.endsWith(file.getName(), "_v3.json", false)) {
            String name4 = file.getName();
            name3 = StringsKt.substringAfter('_', name4, name4);
        }
        if (name3.length() < 36) {
            name3 = null;
        }
        Long longOrNull = StringsKt.toLongOrNull(10, StringsKt.substringBefore$default(StringsKt___StringsKt.drop((name3 != null ? StringsKt___StringsKt.take(36, name3) : "").length(), name), '_'));
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return -1L;
    }

    public static final ActivityManager getActivityManagerFrom(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static Client getClient() {
        if (client == null) {
            synchronized (lock) {
                try {
                    if (client == null) {
                        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                    }
                } finally {
                }
            }
        }
        return client;
    }

    public static String getIntegrityToken(Deliverable deliverable) {
        try {
            Result.Companion companion = Result.Companion;
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            StringBuilder sb = new StringBuilder("sha1 ");
            DigestOutputStream digestOutputStream = new DigestOutputStream(new NullOutputStream(), messageDigest);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(digestOutputStream, PKIFailureInfo.certRevoked);
                try {
                    bufferedOutputStream.write(deliverable.toByteArray());
                    bufferedOutputStream.close();
                    for (byte b : messageDigest.digest()) {
                        sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                    }
                    digestOutputStream.close();
                    return sb.toString();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            if (Result.m4120exceptionOrNullimpl(new Result.Failure(th)) != null) {
                return null;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return null;
        }
    }

    public static Method getMethod(String str, Class... clsArr) {
        Plugin plugin = ndkPlugin;
        if (plugin == null) {
            return null;
        }
        return plugin.getClass().getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public static ConcurrentHashMap mergeMaps$bugsnag_android_core_release(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((Map) it.next()).keySet(), arrayList);
        }
        Set<String> set = CollectionsKt.toSet(arrayList);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            for (String str : set) {
                Object obj = concurrentHashMap.get(str);
                Object obj2 = map.get(str);
                if (obj2 != null) {
                    if ((obj instanceof Map) && (obj2 instanceof Map)) {
                        concurrentHashMap.put(str, mergeMaps$bugsnag_android_core_release(CollectionsKt__CollectionsKt.listOf((Object[]) new Map[]{(Map) obj, (Map) obj2})));
                    } else {
                        concurrentHashMap.put(str, obj2);
                    }
                } else if (obj != null) {
                    concurrentHashMap.put(str, obj);
                }
            }
        }
        return concurrentHashMap;
    }

    public static final Intent registerReceiverSafe(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Logger logger) {
        try {
            return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (RemoteException e) {
            if (logger == null) {
                return null;
            }
            logger.w("Failed to register receiver", e);
            return null;
        } catch (IllegalArgumentException e2) {
            if (logger == null) {
                return null;
            }
            logger.w("Failed to register receiver", e2);
            return null;
        } catch (SecurityException e3) {
            if (logger == null) {
                return null;
            }
            logger.w("Failed to register receiver", e3);
            return null;
        }
    }

    public static final String serializeErrorTypeHeader(Set set) {
        if (set.isEmpty()) {
            return "";
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ErrorType) it.next()).getDesc());
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
            return null;
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = ((String) next) + ',' + ((String) it2.next());
        }
        return (String) next;
    }
}
