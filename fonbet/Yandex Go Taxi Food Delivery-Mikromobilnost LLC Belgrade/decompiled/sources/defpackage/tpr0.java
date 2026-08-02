package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class tpr0 {
    public static final /* synthetic */ kgx[] a;
    public static final rle0 b;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("sharedPreferencesDataStore", 1, "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", tpr0.class);
        qoi0.a.getClass();
        a = new kgx[]{propertyReference1Impl};
        b = jl40.I("FlutterSharedPreferences", null, null, null, 14);
    }

    public static final tpg a(Context context) {
        return (tpg) b.getValue(context, a[0]);
    }

    public static final boolean b(String str, Object obj, Set set) {
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object c(Object obj, dry dryVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!cvu0.x(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            return cvu0.x(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false) ? Double.valueOf(Double.parseDouble(str.substring(40))) : obj;
        }
        if (cvu0.x(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return obj;
        }
        List list = (List) new ptu0(new ByteArrayInputStream(Base64.decode(str.substring(40), 0))).readObject();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
