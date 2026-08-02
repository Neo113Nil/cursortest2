package bo.app;

import android.content.Context;
import android.net.Uri;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class zf {
    public static final yf e = new yf();
    public final com.braze.storage.s a;
    public final ConcurrentHashMap b;
    public final LinkedHashMap c;
    public final File d;

    public zf(Context context, String str) {
        context.getClass();
        str.getClass();
        com.braze.storage.s sVar = new com.braze.storage.s(context, str);
        this.a = sVar;
        this.b = e.a(sVar);
        this.c = new LinkedHashMap();
        this.d = new File(Recorder$$ExternalSyntheticOutline2.m$1(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    public static final String b(y9 y9Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", ((rg) y9Var).a);
    }

    public static final String c(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Adding new local path '", str, "' for remote path '", str2, "' to cache.");
    }

    public static final String d(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Added to DataStore: ", str, " -> ", str2);
    }

    public static final String e(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to add new local path for remote path ", str);
    }

    public static final String f(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Removed from DataStore: ", str);
    }

    public final String a(wc wcVar) {
        Long a;
        wcVar.getClass();
        String str = wcVar.b;
        int ordinal = wcVar.a.ordinal();
        if (ordinal == 0) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.d, str);
            if (localHtmlUrlFromRemoteUrl == null || StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 15), 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(localHtmlUrlFromRemoteUrl, str, 16), 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String b = e.b(str);
        try {
            String file = this.d.toString();
            file.getClass();
            Pair downloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(file, str, b, null, 8, null);
            File file2 = (File) downloadFileToPath$default.first;
            Map map = (Map) downloadFileToPath$default.second;
            String str2 = (String) map.get("expires");
            if (str2 != null && (a = com.braze.support.h.a(str2)) != null && a.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(8, str, map), 7, (Object) null);
                return null;
            }
            Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zf$$ExternalSyntheticLambda10(fromFile, str, 0), 6, (Object) null);
                return fromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 13), 7, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 14), 4, (Object) null);
            return null;
        }
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not find local asset for remote path ", str);
    }

    public static final String b(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Found local asset at path ", str, " for remote asset at path: ", str2);
    }

    public static final String c(y9 y9Var) {
        return Recorder$$ExternalSyntheticOutline2.m("No local assets found for action id: ", ((rg) y9Var).a);
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not download ", str);
    }

    public static final String c(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to store asset for remote path ", str, ". Not storing local asset");
    }

    public final void a(List list) {
        list.getClass();
        yf yfVar = e;
        Pair a = yfVar.a(list);
        Set set = (Set) a.first;
        LinkedHashSet a2 = yfVar.a(this.b, (Set) a.second, this.c);
        yfVar.a(this.d, this.b, this.c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.b.containsKey(((wc) obj).b)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            wc wcVar = (wc) arrayList.get(i);
            String str = wcVar.b;
            try {
                String a3 = a(wcVar);
                if (a3 != null && !StringsKt.isBlank(a3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(a3, str, 18), 7, (Object) null);
                    this.b.put(str, a3);
                    linkedHashMap.put(str, a3);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 17), 4, (Object) null);
            }
            i = i2;
        }
        a(linkedHashMap, a2);
    }

    public final Map a(y9 y9Var) {
        y9Var.getClass();
        if (!((rg) y9Var).c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 9), 7, (Object) null);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList a = y9Var.a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = ((wc) a.get(i)).b;
            String str2 = (String) this.b.get(str);
            if (str2 != null && new File(str2).exists()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(str2, str, 17), 7, (Object) null);
                this.c.put(str, str2);
                linkedHashMap.put(str, str2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 16), 6, (Object) null);
            }
            i = i2;
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 10), 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Storing local triggered action html zip asset at local path ", str, " for remote path ", str2);
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to store html zip asset for remote path ", str, ". Not storing local asset");
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Storing local triggered action asset at local path ", uri.getPath(), " for remote path ", str);
    }

    public final void a(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
        linkedHashMap.getClass();
        linkedHashSet.getClass();
        if (linkedHashMap.isEmpty() && linkedHashSet.isEmpty()) {
            return;
        }
        try {
            this.a.batchUpdate(linkedHashMap, linkedHashSet);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7((String) entry.getKey(), (String) entry.getValue(), 19), 7, (Object) null);
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2((String) it.next(), 18), 7, (Object) null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new z$$ExternalSyntheticLambda0(29), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to update DataStore";
    }
}
