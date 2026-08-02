package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class ai5 {
    public final jyr a;

    public ai5() {
        ssg.a(3, "SkeletonCommunicationAnchors", "register anchors", null);
        Parcelable.Creator<zh5> creator = zh5.CREATOR;
        l48.z("music-trends-tab", true, true);
        l48.z("music-book-tab", true, true);
        l48.z("music-podcast-tab", true, true);
        l48.z("music-kids-tab", true, true);
        ssg.a(3, "MainScreenCommunicationTriggerProcessor", "register anchors", null);
        l48.z("music-launch", (r3 & 2) == 0, (r3 & 4) == 0);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((u36) ((byb) qdcVar.C(I)).c(ern.a(u36.class))).h()) {
            l48.z("music-concert-tab", true, true);
        }
        l48.z("music-collection-tab", true, true);
        l48.z("music-take-charge", (r3 & 2) == 0, (r3 & 4) == 0);
        ssg.a(3, "PlayerCommunicationTriggerProcessor", "register anchors", null);
        l48.z("music-fullscreen-player", (r3 & 2) == 0, (r3 & 4) == 0);
        ssg.a(3, "DeeplinkCommunicationTriggerProcessor", "register anchors", null);
        l48.z("music-deeplink", (r3 & 2) == 0, (r3 & 4) == 0);
        this.a = l18Var.b(hag.I(gj5.class), true);
    }

    public final ArrayList a() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((yg5) ((byb) qdcVar.C(I)).c(ern.a(yg5.class))).h()) {
            Parcelable.Creator<zh5> creator = zh5.CREATOR;
            Collection values = zh5.d.values();
            values.getClass();
            Set A0 = CollectionsKt.A0(values);
            ArrayList arrayList = new ArrayList(v75.o(A0, 10));
            Iterator it = A0.iterator();
            while (it.hasNext()) {
                arrayList.add(((zh5) it.next()).a);
            }
            return CollectionsKt.g0(arrayList, CollectionsKt.w0(((gj5) this.a.getValue()).a));
        }
        Parcelable.Creator<zh5> creator2 = zh5.CREATOR;
        Collection values2 = zh5.d.values();
        values2.getClass();
        Set<zh5> A02 = CollectionsKt.A0(values2);
        ArrayList arrayList2 = new ArrayList();
        for (zh5 zh5Var : A02) {
            z75.t(arrayList2, xz0.w(new String[]{zh5Var.a, zh5Var.d()}));
        }
        return CollectionsKt.g0(arrayList2, CollectionsKt.w0(((gj5) this.a.getValue()).a));
    }
}
