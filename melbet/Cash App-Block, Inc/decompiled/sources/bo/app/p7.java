package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class p7 {
    public static final HashSet a(ConcurrentHashMap concurrentHashMap, Class cls, ReentrantLock reentrantLock) {
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet(copyOnWriteArraySet);
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next();
            }
            copyOnWriteArraySet.removeAll(CollectionsKt.toSet(arrayList));
            concurrentHashMap.put(cls, copyOnWriteArraySet);
            return hashSet;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(Class cls, Set set) {
        return Recorder$$ExternalSyntheticOutline1.m("Triggering ", set.size(), cls.getName(), " on ", " subscribers.");
    }

    public final Set a(Class cls, HashSet hashSet) {
        hashSet.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (Function0) new n$$ExternalSyntheticLambda0(cls, hashSet, 25), 3, (Object) null);
        return hashSet;
    }
}
