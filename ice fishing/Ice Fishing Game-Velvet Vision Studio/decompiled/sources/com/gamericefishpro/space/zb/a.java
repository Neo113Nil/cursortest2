package com.gamericefishpro.space.zb;

import com.gamericefishpro.space.ph.v;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.cc.a {
    public static final C0077a Companion = new C0077a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* JADX INFO: renamed from: com.gamericefishpro.space.zb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0077a {
        public /* synthetic */ C0077a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0077a() {
        }
    }

    public a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
    }

    @Override // com.gamericefishpro.space.cc.a
    public String getId() {
        return ID;
    }

    @Override // com.gamericefishpro.space.cc.a
    public b getRywData(Map<String, ? extends Map<com.gamericefishpro.space.cc.b, b>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<com.gamericefishpro.space.cc.b, b> map = indexedTokens.get(this.key);
        Object next = null;
        if (map == null) {
            return null;
        }
        b[] elements = {map.get(com.gamericefishpro.space.ac.a.USER), map.get(com.gamericefishpro.space.ac.a.SUBSCRIPTION)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = v.o(elements).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String rywToken = ((b) next).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next2 = it.next();
                    String rywToken2 = ((b) next2).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        next = next2;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (b) next;
    }

    @Override // com.gamericefishpro.space.cc.a
    public boolean isMet(Map<String, ? extends Map<com.gamericefishpro.space.cc.b, b>> indexedTokens) {
        Intrinsics.checkNotNullParameter(indexedTokens, "indexedTokens");
        Map<com.gamericefishpro.space.cc.b, b> map = indexedTokens.get(this.key);
        return (map == null || map.get(com.gamericefishpro.space.ac.a.USER) == null) ? false : true;
    }
}
