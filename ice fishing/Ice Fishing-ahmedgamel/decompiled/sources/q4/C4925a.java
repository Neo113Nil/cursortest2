package q4;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import r4.EnumC4958a;
import s4.InterfaceC4975a;
import v7.AbstractC5128i;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4925a implements InterfaceC4975a {
    public static final C0256a Companion = new C0256a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* renamed from: q4.a$a, reason: collision with other inner class name */
    public static final class C0256a {
        public /* synthetic */ C0256a(e eVar) {
            this();
        }

        private C0256a() {
        }
    }

    public C4925a(String key) {
        h.e(key, "key");
        this.key = key;
    }

    @Override // s4.InterfaceC4975a
    public String getId() {
        return ID;
    }

    @Override // s4.InterfaceC4975a
    public C4926b getRywData(Map<String, ? extends Map<s4.b, C4926b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<s4.b, C4926b> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = AbstractC5128i.w(new C4926b[]{map.get(EnumC4958a.USER), map.get(EnumC4958a.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((C4926b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((C4926b) next).getRywToken();
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
        return (C4926b) obj;
    }

    @Override // s4.InterfaceC4975a
    public boolean isMet(Map<String, ? extends Map<s4.b, C4926b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<s4.b, C4926b> map = indexedTokens.get(this.key);
        return (map == null || map.get(EnumC4958a.USER) == null) ? false : true;
    }
}
