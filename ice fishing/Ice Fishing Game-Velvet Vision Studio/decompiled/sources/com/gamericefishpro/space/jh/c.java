package com.gamericefishpro.space.jh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final com.gamericefishpro.space.mh.b _fallbackPushSub;
    private final List<com.gamericefishpro.space.mh.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends com.gamericefishpro.space.mh.e> collection, com.gamericefishpro.space.mh.b _fallbackPushSub) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(_fallbackPushSub, "_fallbackPushSub");
        this.collection = collection;
        this._fallbackPushSub = _fallbackPushSub;
    }

    public final com.gamericefishpro.space.mh.a getByEmail(String email) {
        Object next;
        Intrinsics.checkNotNullParameter(email, "email");
        Iterator<T> it = getEmails().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((com.gamericefishpro.space.mh.a) next).getEmail(), email)) {
                return (com.gamericefishpro.space.mh.a) next;
            }
        }
        next = null;
        return (com.gamericefishpro.space.mh.a) next;
    }

    public final com.gamericefishpro.space.mh.d getBySMS(String sms) {
        Object next;
        Intrinsics.checkNotNullParameter(sms, "sms");
        Iterator<T> it = getSmss().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((com.gamericefishpro.space.mh.d) next).getNumber(), sms)) {
                return (com.gamericefishpro.space.mh.d) next;
            }
        }
        next = null;
        return (com.gamericefishpro.space.mh.d) next;
    }

    public final List<com.gamericefishpro.space.mh.e> getCollection() {
        return this.collection;
    }

    public final List<com.gamericefishpro.space.mh.a> getEmails() {
        List<com.gamericefishpro.space.mh.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.gamericefishpro.space.mh.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final com.gamericefishpro.space.mh.b getPush() {
        List<com.gamericefishpro.space.mh.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.gamericefishpro.space.mh.b) {
                arrayList.add(obj);
            }
        }
        com.gamericefishpro.space.mh.b bVar = (com.gamericefishpro.space.mh.b) CollectionsKt.firstOrNull(arrayList);
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<com.gamericefishpro.space.mh.d> getSmss() {
        List<com.gamericefishpro.space.mh.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.gamericefishpro.space.mh.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
