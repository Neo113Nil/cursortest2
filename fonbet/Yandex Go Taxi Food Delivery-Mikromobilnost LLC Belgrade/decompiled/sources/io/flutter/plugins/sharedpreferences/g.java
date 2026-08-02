package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Log;
import defpackage.acu;
import defpackage.amp0;
import defpackage.cvu0;
import defpackage.dry;
import defpackage.e1j;
import defpackage.iay;
import defpackage.kme0;
import defpackage.mpr0;
import defpackage.npr0;
import defpackage.ny61;
import defpackage.qtu0;
import defpackage.spr0;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tpr0;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final class g implements tsr, npr0 {
    public Context a;
    public amp0 b;
    public final dry c = new dry();

    public static final Object a(g gVar, String str, String str2, SuspendLambda suspendLambda) {
        gVar.getClass();
        kme0 kme0Var = new kme0(str);
        Context context = gVar.a;
        if (context == null) {
            context = null;
        }
        Object a = androidx.datastore.preferences.core.b.a(tpr0.a(context), new SharedPreferencesPlugin$dataStoreSetString$2(kme0Var, str2, null), suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00e2 -> B:11:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(g gVar, List list, ContinuationImpl continuationImpl) {
        SharedPreferencesPlugin$getPrefs$1 sharedPreferencesPlugin$getPrefs$1;
        int i;
        Set N0;
        Map linkedHashMap;
        Set set;
        Map map;
        Iterator it;
        Set set2;
        int i2;
        Object c;
        gVar.getClass();
        if (continuationImpl instanceof SharedPreferencesPlugin$getPrefs$1) {
            sharedPreferencesPlugin$getPrefs$1 = (SharedPreferencesPlugin$getPrefs$1) continuationImpl;
            int i3 = sharedPreferencesPlugin$getPrefs$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sharedPreferencesPlugin$getPrefs$1.label = i3 - Integer.MIN_VALUE;
                Object obj = sharedPreferencesPlugin$getPrefs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPreferencesPlugin$getPrefs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    N0 = list != null ? kotlin.collections.a.N0(list) : null;
                    linkedHashMap = new LinkedHashMap();
                    sharedPreferencesPlugin$getPrefs$1.L$0 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$1 = N0;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = linkedHashMap;
                    sharedPreferencesPlugin$getPrefs$1.label = 1;
                    Context context = gVar.a;
                    if (context == null) {
                        context = null;
                    }
                    obj = kotlinx.coroutines.flow.e.A(new acu(tpr0.a(context).getData(), 24), sharedPreferencesPlugin$getPrefs$1);
                } else if (i == 1) {
                    linkedHashMap = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    N0 = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = sharedPreferencesPlugin$getPrefs$1.I$0;
                    kme0 kme0Var = (kme0) sharedPreferencesPlugin$getPrefs$1.L$7;
                    it = (Iterator) sharedPreferencesPlugin$getPrefs$1.L$5;
                    map = (Map) sharedPreferencesPlugin$getPrefs$1.L$2;
                    set2 = (Set) sharedPreferencesPlugin$getPrefs$1.L$1;
                    kotlin.b.b(obj);
                    if (tpr0.b(kme0Var.a, obj, set2) && (c = tpr0.c(obj, gVar.c)) != null) {
                        map.put(kme0Var.a, c);
                    }
                    if (it.hasNext()) {
                        return map;
                    }
                    kme0Var = (kme0) it.next();
                    sharedPreferencesPlugin$getPrefs$1.L$0 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$1 = set2;
                    sharedPreferencesPlugin$getPrefs$1.L$2 = map;
                    sharedPreferencesPlugin$getPrefs$1.L$3 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$4 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$5 = it;
                    sharedPreferencesPlugin$getPrefs$1.L$6 = null;
                    sharedPreferencesPlugin$getPrefs$1.L$7 = kme0Var;
                    sharedPreferencesPlugin$getPrefs$1.I$0 = i2;
                    sharedPreferencesPlugin$getPrefs$1.I$1 = 0;
                    sharedPreferencesPlugin$getPrefs$1.label = 2;
                    Context context2 = gVar.a;
                    if (context2 == null) {
                        context2 = null;
                    }
                    obj = kotlinx.coroutines.flow.e.A(new e1j(tpr0.a(context2).getData(), kme0Var, 7), sharedPreferencesPlugin$getPrefs$1);
                }
                set = (Set) obj;
                if (set != null) {
                    return linkedHashMap;
                }
                map = linkedHashMap;
                it = set.iterator();
                set2 = N0;
                i2 = 0;
                if (it.hasNext()) {
                }
            }
        }
        sharedPreferencesPlugin$getPrefs$1 = new SharedPreferencesPlugin$getPrefs$1(gVar, continuationImpl);
        Object obj2 = sharedPreferencesPlugin$getPrefs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPreferencesPlugin$getPrefs$1.label;
        if (i != 0) {
        }
        set = (Set) obj2;
        if (set != null) {
        }
    }

    @Override // defpackage.npr0
    public final void E(String str, double d, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setDouble$1(str, this, d, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.npr0
    public final Boolean d(String str, spr0 spr0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        tje.X(new SharedPreferencesPlugin$getBool$1(str, this, ref$ObjectRef, null));
        return (Boolean) ref$ObjectRef.element;
    }

    @Override // defpackage.npr0
    public final List e(List list, spr0 spr0Var) {
        return kotlin.collections.a.J0(((Map) tje.Y(EmptyCoroutineContext.a, new SharedPreferencesPlugin$getKeys$prefs$1(this, list, null))).keySet());
    }

    @Override // defpackage.npr0
    public final void f(String str, boolean z, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setBool$1(str, this, z, null));
    }

    @Override // defpackage.npr0
    public final ArrayList g(String str, spr0 spr0Var) {
        List list;
        String p = p(str, spr0Var);
        if (p == null || cvu0.x(p, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) || !cvu0.x(p, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) || (list = (List) tpr0.c(p, this.c)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.npr0
    public final void i(String str, long j, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setInt$1(str, this, j, null));
    }

    @Override // defpackage.npr0
    public final Map m(List list, spr0 spr0Var) {
        return (Map) tje.Y(EmptyCoroutineContext.a, new SharedPreferencesPlugin$getAll$1(this, list, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.npr0
    public final Double n(String str, spr0 spr0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        tje.X(new SharedPreferencesPlugin$getDouble$1(str, this, ref$ObjectRef, null));
        return (Double) ref$ObjectRef.element;
    }

    @Override // defpackage.npr0
    public final void o(String str, List list, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setDeprecatedStringList$1(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.c.a(list)), null));
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        Context context = ssrVar.a;
        this.a = context;
        try {
            npr0.b4.getClass();
            mpr0.b(tt5Var, this, "data_store");
            dry dryVar = this.c;
            amp0 amp0Var = new amp0();
            amp0Var.a = tt5Var;
            amp0Var.b = context;
            amp0Var.c = dryVar;
            try {
                mpr0.b(tt5Var, amp0Var, "shared_preferences");
            } catch (Exception e) {
                Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e);
            }
            this.b = amp0Var;
        } catch (Exception e2) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new iay().onAttachedToEngine(ssrVar);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        npr0.b4.getClass();
        mpr0.b(tt5Var, null, "data_store");
        amp0 amp0Var = this.b;
        if (amp0Var != null) {
            mpr0.b((tt5) amp0Var.a, null, "shared_preferences");
        }
        this.b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.npr0
    public final String p(String str, spr0 spr0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        tje.X(new SharedPreferencesPlugin$getString$1(str, this, ref$ObjectRef, null));
        return (String) ref$ObjectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.npr0
    public final Long r(String str, spr0 spr0Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        tje.X(new SharedPreferencesPlugin$getInt$1(str, this, ref$ObjectRef, null));
        return (Long) ref$ObjectRef.element;
    }

    @Override // defpackage.npr0
    public final qtu0 u(String str, spr0 spr0Var) {
        String p = p(str, spr0Var);
        if (p != null) {
            return cvu0.x(p, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) ? new qtu0(p, StringListLookupResultType.JSON_ENCODED) : cvu0.x(p, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new qtu0(null, StringListLookupResultType.PLATFORM_ENCODED) : new qtu0(null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // defpackage.npr0
    public final void v(List list, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$clear$1(this, list, null));
    }

    @Override // defpackage.npr0
    public final void w(String str, String str2, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setEncodedStringList$1(this, str, str2, null));
    }

    @Override // defpackage.npr0
    public final void y(String str, String str2, spr0 spr0Var) {
        tje.X(new SharedPreferencesPlugin$setString$1(this, str, str2, null));
    }
}
