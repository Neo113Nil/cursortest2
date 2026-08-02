package bo.app;

import android.net.Uri;
import androidx.datastore.preferences.core.Preferences;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class yf {
    public final void a(File file, ConcurrentHashMap concurrentHashMap, LinkedHashMap linkedHashMap) {
        file.getClass();
        concurrentHashMap.getClass();
        linkedHashMap.getClass();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda2(listFiles, 0), 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (!concurrentHashMap.containsValue(file2.getPath())) {
                    arrayList.add(file2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!linkedHashMap.containsValue(((File) obj).getPath())) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                File file3 = (File) obj2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) zf.e, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda3(file3, 0), 7, (Object) null);
                file3.getClass();
                BrazeFileUtils.deleteFileOrDirectory(file3);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(22), 4, (Object) null);
        }
    }

    public final String b(String str) {
        int lastIndexOf$default;
        str.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (lastIndexOf$default = StringsKt.lastIndexOf$default('.', 0, 6, (CharSequence) lastPathSegment)) > -1) {
            ref$ObjectRef.element = lastPathSegment.substring(lastIndexOf$default);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda9(ref$ObjectRef, str), 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = ref$ObjectRef.element;
        StringBuilder sb = new StringBuilder();
        sb.append(requestCode);
        sb.append(obj);
        return sb.toString();
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    public static final String b(File file) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Deleting obsolete asset '", file.getPath(), "' from filesystem.");
    }

    public static final String a(Object obj, Preferences.Key key) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + key.name + "'";
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: ".concat(ArraysKt___ArraysKt.joinToString$default(fileArr, " , ", null, null, new yf$$ExternalSyntheticLambda10(0), 30));
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        name.getClass();
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(com.braze.storage.s sVar) {
        sVar.getClass();
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<Preferences.Key, Object> entry : sVar.readAllData().entrySet()) {
                Preferences.Key key = entry.getKey();
                Object value = entry.getValue();
                if (!StringsKt.isBlank(key.name) && (value instanceof String) && !StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(5, (String) value, key), 7, (Object) null);
                    concurrentHashMap.put(key.name, value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new z$$ExternalSyntheticLambda0(21), 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public final LinkedHashSet a(ConcurrentHashMap concurrentHashMap, Set set, LinkedHashMap linkedHashMap) {
        concurrentHashMap.getClass();
        set.getClass();
        linkedHashMap.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (linkedHashMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 12), 7, (Object) null);
            } else if (!set.contains(str)) {
                String str2 = (String) concurrentHashMap.remove(str);
                str.getClass();
                linkedHashSet.add(str);
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str2, str, 15), 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Not removing local path for remote path ", str, " from cache because it is being preserved until the end of the app run.");
    }

    public static final String a(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Removing obsolete local path ", str, " for obsolete remote path ", str2, " from cache.");
    }

    public final Pair a(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y9 y9Var = (y9) it.next();
            if (!((rg) y9Var).c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 8), 7, (Object) null);
            } else {
                ArrayList a = y9Var.a();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    Object obj = a.get(i);
                    i++;
                    wc wcVar = (wc) obj;
                    String str = wcVar.b;
                    if (!StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(6, y9Var, str), 7, (Object) null);
                        linkedHashSet.add(wcVar);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Pre-fetch off for triggered action ", ((rg) y9Var).a, ". Not pre-fetching assets.");
    }

    public static final String a(y9 y9Var, String str) {
        return Boxes$$ExternalSyntheticOutline1.m("Received new remote path for triggered action ", ((rg) y9Var).a, " at ", str, ".");
    }

    public static final String a(Ref$ObjectRef ref$ObjectRef, String str) {
        return "Using file extension " + ref$ObjectRef.element + " for remote asset url: " + str;
    }
}
