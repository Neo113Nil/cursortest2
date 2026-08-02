package defpackage;

import com.yandex.plus.core.network.header.NetworkHeader$Name$Loggable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class xu50 {
    public final LinkedHashMap a;

    public xu50(int i) {
        this.a = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0019 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = this.a;
        List<tu50> w0 = a.w0(linkedHashMap.keySet());
        ArrayList arrayList2 = new ArrayList();
        for (tu50 tu50Var : w0) {
            Set set = (Set) linkedHashMap.get(tu50Var);
            ArrayList arrayList3 = null;
            if (set != null) {
                if (set.isEmpty()) {
                    set = null;
                }
                if (set != null) {
                    Set set2 = set;
                    arrayList = new ArrayList(tcc.n(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((uu50) it.next()).b);
                    }
                    if (arrayList != null) {
                        List<String> w02 = a.w0(arrayList);
                        arrayList3 = new ArrayList(tcc.n(w02, 10));
                        for (String str : w02) {
                            if (tu50Var.b == NetworkHeader$Name$Loggable.NOT_LOGGABLE) {
                                str = "(hidden)";
                            }
                            arrayList3.add(tu50Var + Extension.COLON_SPACE + str);
                        }
                    }
                    if (arrayList3 == null) {
                        arrayList2.add(arrayList3);
                    }
                }
            }
            arrayList = null;
            if (arrayList != null) {
            }
            if (arrayList3 == null) {
            }
        }
        return a.X(tcc.o(arrayList2), "\n", null, null, null, 62);
    }

    public xu50() {
        this(0);
    }
}
