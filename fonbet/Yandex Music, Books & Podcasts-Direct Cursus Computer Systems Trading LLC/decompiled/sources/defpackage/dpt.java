package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class dpt {
    public final ReentrantLock a = new ReentrantLock();
    public LinkedHashMap b = new LinkedHashMap(20);

    public final boolean a(Uri uri, Uri uri2) {
        uri.getClass();
        uri2.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            b();
            Set set = (Set) this.b.get(uri);
            if (set == null) {
                set = new LinkedHashSet();
                this.b.put(uri, set);
            }
            boolean add = set.add(uri2);
            reentrantLock.unlock();
            return add;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        if (this.b.size() < 20) {
            return;
        }
        Set entrySet = this.b.entrySet();
        entrySet.getClass();
        List<Map.Entry> r0 = CollectionsKt.r0(CollectionsKt.w0(entrySet), this.b.size() / 2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(20);
        for (Map.Entry entry : r0) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.b = linkedHashMap;
    }

    public final Uri c(List list, Uri uri, Uri uri2) {
        boolean contains;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Uri uri3 = (Uri) it.next();
            if (uri2 != null && !z) {
                ssg.a(3, null, "try ban old URI " + uri2 + " isBanned=" + a(uri, uri2), null);
                z = true;
            }
            uri.getClass();
            uri3.getClass();
            ReentrantLock reentrantLock = this.a;
            reentrantLock.lock();
            try {
                Set set = (Set) this.b.get(uri);
                if (set == null) {
                    reentrantLock.unlock();
                    contains = false;
                } else {
                    contains = set.contains(uri3);
                }
                if (!contains) {
                    return uri3;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return null;
    }
}
