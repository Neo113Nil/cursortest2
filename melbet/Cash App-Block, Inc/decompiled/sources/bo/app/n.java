package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.models.BannerPendingDismissal;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class n {
    public final com.braze.storage.a a;
    public final ue b;
    public final ReentrantLock c;

    public n(com.braze.storage.a aVar, ue ueVar) {
        aVar.getClass();
        ueVar.getClass();
        this.a = aVar;
        this.b = ueVar;
        this.c = new ReentrantLock();
    }

    public static final String b(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it.next();
            StringBuilder m = re$$ExternalSyntheticOutline0.m("(id=", bannerPendingDismissal.getBannerId(), ", timeMs=", bannerPendingDismissal.getDismissalTimeMs());
            m.append(")");
            arrayList.add(m.toString());
        }
        return "Writing remaining pending dismissals: " + arrayList;
    }

    public final void a(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            arrayList.add(new Pair(dVar.a, Long.valueOf(dVar.b)));
        }
        Set set = CollectionsKt.toSet(arrayList);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            List b = this.a.b();
            int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(0, set, b), 6, (Object) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : b) {
                BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj;
                if (!set.contains(new Pair(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() == b.size()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda1(i, list, b, set), 6, (Object) null);
            } else {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(0, arrayList2), 6, (Object) null);
                this.a.a(arrayList2);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda3(b, arrayList2, 0), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(List list, List list2, Set set) {
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add("(id=" + pair.first + ", timeMs=" + pair.second + ")");
        }
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(size, size2, "Banner dismiss sync: server acknowledged ", " dismissal(s) but none matched the pending cache. pendingCount=", " acknowledged=");
        m107m.append(arrayList);
        return m107m.toString();
    }

    public static final String a(List list, List list2) {
        return Recorder$$ExternalSyntheticOutline2.m(list.size() - list2.size(), list2.size(), "Removed ", " acknowledged dismissals from pending cache. ", " pending dismissals remain.");
    }

    public static final String a(Set set, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add("(id=" + pair.first + ", timeMs=" + pair.second + ")");
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it2.next();
            StringBuilder m = re$$ExternalSyntheticOutline0.m("(id=", bannerPendingDismissal.getBannerId(), ", timeMs=", bannerPendingDismissal.getDismissalTimeMs());
            m.append(")");
            arrayList2.add(m.toString());
        }
        return "Processing acknowledged dismissals. acknowledged=" + arrayList + ", pending=" + arrayList2;
    }
}
