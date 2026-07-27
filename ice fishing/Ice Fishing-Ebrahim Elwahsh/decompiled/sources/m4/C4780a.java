package m4;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import n4.EnumC4812a;
import o4.InterfaceC4837a;
import r7.AbstractC4978i;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4780a implements InterfaceC4837a {
    public static final C0255a Companion = new C0255a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* renamed from: m4.a$a, reason: collision with other inner class name */
    public static final class C0255a {
        public /* synthetic */ C0255a(e eVar) {
            this();
        }

        private C0255a() {
        }
    }

    public C4780a(String key) {
        h.e(key, "key");
        this.key = key;
    }

    @Override // o4.InterfaceC4837a
    public String getId() {
        return ID;
    }

    @Override // o4.InterfaceC4837a
    public C4781b getRywData(Map<String, ? extends Map<o4.b, C4781b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<o4.b, C4781b> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = AbstractC4978i.N(new C4781b[]{map.get(EnumC4812a.USER), map.get(EnumC4812a.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((C4781b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((C4781b) next).getRywToken();
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
        return (C4781b) obj;
    }

    @Override // o4.InterfaceC4837a
    public boolean isMet(Map<String, ? extends Map<o4.b, C4781b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<o4.b, C4781b> map = indexedTokens.get(this.key);
        return (map == null || map.get(EnumC4812a.USER) == null) ? false : true;
    }
}
