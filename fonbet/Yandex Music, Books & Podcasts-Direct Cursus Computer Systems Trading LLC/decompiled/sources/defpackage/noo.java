package defpackage;

import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class noo {
    public final LinkedHashMap a = new LinkedHashMap();
    public final tao b;

    public noo() {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.b = new tao(e5bVar);
    }

    public final Object a(String str) {
        Object value;
        tao taoVar = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) taoVar.a;
        try {
            bqi bqiVar = (bqi) ((LinkedHashMap) taoVar.d).get(str);
            if (bqiVar != null && (value = ((xdr) bqiVar).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) taoVar.c).remove(str);
            return null;
        }
    }

    public final void b(String str, Parcelable parcelable) {
        if (parcelable != null) {
            List list = poo.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(parcelable)) {
                    }
                }
            }
            tiu.g(parcelable.getClass(), " into saved state", "Can't put value with type ");
            return;
        }
        List list2 = poo.a;
        Object obj = this.a.get(str);
        voi voiVar = obj instanceof voi ? (voi) obj : null;
        if (voiVar != null) {
            voiVar.l(parcelable);
        }
        this.b.l(parcelable, str);
    }

    public noo(f9h f9hVar) {
        this.b = new tao(f9hVar);
    }
}
