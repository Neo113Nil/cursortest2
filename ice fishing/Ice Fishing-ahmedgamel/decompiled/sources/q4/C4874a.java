package q4;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import r4.EnumC4908a;
import s4.InterfaceC4974a;
import v7.AbstractC5118i;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4874a implements InterfaceC4974a {
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

    public C4874a(String key) {
        h.e(key, "key");
        this.key = key;
    }

    @Override // s4.InterfaceC4974a
    public String getId() {
        return ID;
    }

    @Override // s4.InterfaceC4974a
    public C4875b getRywData(Map<String, ? extends Map<s4.b, C4875b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<s4.b, C4875b> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = AbstractC5118i.z(new C4875b[]{map.get(EnumC4908a.USER), map.get(EnumC4908a.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((C4875b) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((C4875b) next).getRywToken();
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
        return (C4875b) obj;
    }

    @Override // s4.InterfaceC4974a
    public boolean isMet(Map<String, ? extends Map<s4.b, C4875b>> indexedTokens) {
        h.e(indexedTokens, "indexedTokens");
        Map<s4.b, C4875b> map = indexedTokens.get(this.key);
        return (map == null || map.get(EnumC4908a.USER) == null) ? false : true;
    }
}
