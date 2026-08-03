package i8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import pc.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements k8.a {
    public static final C0073a Companion = new C0073a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: i8.a$a, reason: collision with other inner class name */
    public static final class C0073a {
        public /* synthetic */ C0073a(f fVar) {
            this();
        }

        private C0073a() {
        }
    }

    public a(String str) {
        j.e(str, "key");
        this.key = str;
    }

    @Override // k8.a
    public String getId() {
        return ID;
    }

    @Override // k8.a
    public b getRywData(Map<String, ? extends Map<k8.b, b>> map) {
        j.e(map, "indexedTokens");
        Map<k8.b, b> map2 = map.get(this.key);
        Object obj = null;
        if (map2 == null) {
            return null;
        }
        b[] bVarArr = {map2.get(j8.a.USER), map2.get(j8.a.SUBSCRIPTION)};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            b bVar = bVarArr[i10];
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((b) next).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        obj = next;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (b) obj;
    }

    @Override // k8.a
    public boolean isMet(Map<String, ? extends Map<k8.b, b>> map) {
        j.e(map, "indexedTokens");
        Map<k8.b, b> map2 = map.get(this.key);
        return (map2 == null || map2.get(j8.a.USER) == null) ? false : true;
    }
}
