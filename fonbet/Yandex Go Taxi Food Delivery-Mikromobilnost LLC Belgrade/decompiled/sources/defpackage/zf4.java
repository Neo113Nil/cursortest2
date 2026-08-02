package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class zf4 implements uzd {
    public final h3y a;
    public final wjm b;
    public final e100 c;
    public final jdj w;
    public vf4 x;

    public zf4(h3y h3yVar, wjm wjmVar, wff0 wff0Var, e100 e100Var, jdj jdjVar) {
        this.a = h3yVar;
        this.b = wjmVar;
        this.c = e100Var;
        this.w = jdjVar;
        wff0Var.a(new yf4(this));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(BackendConfig backendConfig, boolean z) {
        l020 C;
        HashSet hashSet = new HashSet(backendConfig.hiddenNamespaces);
        wjm wjmVar = this.b;
        z83.g(null, (Looper) wjmVar.b, Looper.myLooper());
        at2 at2Var = (at2) wjmVar.w;
        Set N0 = a.N0(at2Var.X().b());
        int i = 27;
        boolean z2 = false;
        int i2 = 1;
        if (!N0.equals(hashSet)) {
            C = ((k020) wjmVar.c).C();
            try {
                at2Var.X().d(hashSet);
                ogu oguVar = (ogu) wjmVar.x;
                z83.g(null, oguVar.a, Looper.myLooper());
                oguVar.b.getClass();
                List list = (List) androidx.room.util.a.b(at2Var.Y().a, true, false, new rfa(i));
                Set M0 = a.M0(N0);
                ycc.r(hashSet, M0);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (M0.contains(Integer.valueOf(ChatId.Companion.b(((n2b) obj).b)))) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Long.valueOf(((n2b) it.next()).a));
                }
                ph9 ph9Var = C.z;
                ph9Var.getClass();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ph9Var.a(((Number) it2.next()).longValue());
                }
                C.s();
                C.close();
            } catch (Throwable th) {
            }
        }
        HashSet hashSet2 = new HashSet(backendConfig.noPhoneNamespaces);
        e100 e100Var = this.c;
        z83.g(null, (Looper) e100Var.b, Looper.myLooper());
        at2 at2Var2 = (at2) e100Var.w;
        Set N02 = a.N0(at2Var2.G().c());
        if ((N02.isEmpty() || !z) && !N02.equals(hashSet2)) {
            C = ((k020) e100Var.c).C();
            try {
                at2Var2.G().e(hashSet2);
                Set M02 = a.M0(N02);
                ycc.r(hashSet2, M02);
                List list2 = (List) androidx.room.util.a.b(at2Var2.Y().a, true, false, new rfa(i));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (M02.contains(Integer.valueOf(ChatId.Companion.b(((n2b) obj2).b)))) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(Long.valueOf(((n2b) it3.next()).a));
                }
                ph9 ph9Var2 = C.z;
                ph9Var2.getClass();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    ph9Var2.a(((Number) it4.next()).longValue());
                }
                C.s();
                C.close();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        jdj jdjVar = this.w;
        if (!((lqo) jdjVar.b).a(tz10.O)) {
            return;
        }
        Map<String, FoldersConfig.Filter> filters = backendConfig.getFolders().getFilters();
        g4r g4rVar = (g4r) ((i3y) jdjVar.w).getValue();
        List list3 = (List) androidx.room.util.a.b(g4rVar.a, true, false, new s1r(i2, g4rVar));
        ArrayList arrayList5 = new ArrayList(filters.size());
        for (Map.Entry<String, FoldersConfig.Filter> entry : filters.entrySet()) {
            String key = entry.getKey();
            FoldersConfig.Filter value = entry.getValue();
            arrayList5.add(new k4r(key, a.N0(value.getChatTypeIds()), a.N0(value.getNamespaces())));
        }
        if (!list3.isEmpty() || !z) {
            if (list3.isEmpty() || !z) {
                if (list3.size() == arrayList5.size()) {
                    List list4 = list3;
                    int d = gw00.d(tcc.n(list4, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                    for (Object obj3 : list4) {
                        linkedHashMap.put(((k4r) obj3).a, obj3);
                    }
                    int d2 = gw00.d(tcc.n(arrayList5, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        linkedHashMap2.put(((k4r) next).a, next);
                    }
                    z2 = !linkedHashMap.equals(linkedHashMap2);
                }
            }
            if (z2) {
                return;
            }
            ((k020) jdjVar.c).d(new sxo(17, jdjVar, arrayList5));
            return;
        }
        z2 = true;
        if (z2) {
        }
    }

    @Override // defpackage.uzd
    public final void b(BackendConfig backendConfig) {
        a(backendConfig, false);
    }

    @Override // defpackage.uzd
    public final void d(BackendConfig backendConfig) {
        a(backendConfig, true);
    }
}
