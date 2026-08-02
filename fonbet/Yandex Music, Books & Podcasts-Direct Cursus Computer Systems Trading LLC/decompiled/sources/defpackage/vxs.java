package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.tracks.TrackVariant;

/* loaded from: classes6.dex */
public final class vxs implements rgl {
    public final /* synthetic */ mmo a;

    public vxs(mmo mmoVar) {
        this.a = mmoVar;
    }

    @Override // defpackage.rgl
    public final void E() {
        mmo mmoVar = this.a;
        ((yjj) mmoVar.g).b();
        ((paw) mmoVar.b).F((vxs) mmoVar.d);
    }

    @Override // defpackage.rgl
    public final void o(nqs nqsVar, nqs nqsVar2, nqs nqsVar3) {
        nqsVar.getClass();
        nqsVar2.getClass();
        nqsVar3.getClass();
        mmo mmoVar = this.a;
        Handler handler = (Handler) mmoVar.c;
        jsb jsbVar = (jsb) nqsVar;
        jsb jsbVar2 = (jsb) nqsVar2;
        jsb jsbVar3 = (jsb) nqsVar3;
        List h = u75.h(mmo.g(mmoVar, jsbVar.a(), 0), mmo.g(mmoVar, jsbVar2.a(), 2), mmo.g(mmoVar, jsbVar3.a(), 1));
        LinkedHashMap linkedHashMap = (LinkedHashMap) mmoVar.f;
        Iterator it = h.iterator();
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            List list = (List) it.next();
            g2t g2tVar = (g2t) CollectionsKt.firstOrNull(list);
            Integer valueOf = g2tVar != null ? Integer.valueOf(g2tVar.d) : null;
            List list2 = (List) linkedHashMap.get(valueOf);
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((g2t) it2.next()).b);
                }
            }
            List list4 = list;
            ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((g2t) it3.next()).b);
            }
            if (valueOf != null && !Intrinsics.d(arrayList, arrayList2)) {
                linkedHashMap.put(valueOf, list);
                dvt.c0(handler, new xlr(mmoVar, valueOf, list));
            }
        }
        TrackVariant c = jsbVar.c();
        g2t V0 = c != null ? mmoVar.V0(c, 0) : null;
        TrackVariant c2 = jsbVar2.c();
        g2t V02 = c2 != null ? mmoVar.V0(c2, 2) : null;
        TrackVariant c3 = jsbVar3.c();
        List h2 = u75.h(V0, V02, c3 != null ? mmoVar.V0(c3, 1) : null);
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) mmoVar.e;
        Iterator it4 = CollectionsKt.O(h2).iterator();
        while (it4.hasNext()) {
            g2t g2tVar2 = (g2t) it4.next();
            if (!Intrinsics.d(linkedHashMap2.get(Integer.valueOf(g2tVar2.d)), g2tVar2)) {
                linkedHashMap2.put(Integer.valueOf(g2tVar2.d), g2tVar2);
                dvt.c0(handler, new bhp(mmoVar, g2tVar2));
            }
        }
    }
}
