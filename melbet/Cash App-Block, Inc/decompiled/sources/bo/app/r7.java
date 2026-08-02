package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class r7 implements m9 {
    public static final p7 j = new p7();
    public final he a;
    public final u4 b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ReentrantLock f;
    public final ReentrantLock g;
    public final ReentrantLock h;
    public boolean i;

    public r7(he heVar, u4 u4Var, boolean z) {
        heVar.getClass();
        u4Var.getClass();
        this.a = heVar;
        this.b = u4Var;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
        this.h = new ReentrantLock();
        this.i = !z;
    }

    public final void a(Class cls) {
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new r7$$ExternalSyntheticLambda0(cls, 0), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new r7$$ExternalSyntheticLambda0(cls, 1), 6, (Object) null);
                Object remove = this.e.remove(cls);
                remove.getClass();
                Iterator it = ((List) remove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(final Object obj, final Class cls) {
        boolean z;
        d9 d9Var;
        cls.getClass();
        final int i = 1;
        final int i2 = 0;
        if ((obj instanceof be) || (obj instanceof fe)) {
            z = true;
        } else {
            if ((obj instanceof o5) && (d9Var = ((o5) obj).d) != null) {
                ((i2) d9Var).e();
            }
            if (obj instanceof ad) {
                ((ad) obj).a.e();
            }
            if (obj instanceof zc) {
                ((zc) obj).a.e();
            }
            if (obj instanceof s5) {
                ((i2) ((s5) obj).a).e();
            }
            z = false;
        }
        if (this.a.a() || this.b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new n$$ExternalSyntheticLambda1(23, this, cls, obj), 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new r7$$ExternalSyntheticLambda0(cls, 2), 3, (Object) null);
            return;
        }
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new Function0() { // from class: bo.app.r7$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    Object obj2 = obj;
                    Class cls2 = cls;
                    switch (i3) {
                        case 0:
                            return r7.a(cls2, obj2);
                        default:
                            return r7.b(cls2, obj2);
                    }
                }
            }, 3, (Object) null);
            a(obj, cls);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new Function0() { // from class: bo.app.r7$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                Object obj2 = obj;
                Class cls2 = cls;
                switch (i3) {
                    case 0:
                        return r7.a(cls2, obj2);
                    default:
                        return r7.b(cls2, obj2);
                }
            }
        }, 3, (Object) null);
        p7 p7Var = j;
        HashSet a = p7.a(this.c, cls, this.f);
        Iterator it = ((HashSet) p7Var.a(cls, a)).iterator();
        while (it.hasNext()) {
            JobKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new q7((IEventSubscriber) it.next(), obj, null), 3);
        }
        p7 p7Var2 = j;
        HashSet a2 = p7.a(this.d, cls, this.g);
        Iterator it2 = ((HashSet) p7Var2.a(cls, a2)).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (a2.isEmpty() && a.isEmpty()) {
            if (cls.equals(NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z, new Function0() { // from class: bo.app.r7$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i2;
                        r7 r7Var = this;
                        Class cls2 = cls;
                        switch (i3) {
                            case 0:
                                return r7.a(cls2, r7Var);
                            default:
                                return r7.b(cls2, r7Var);
                        }
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z, new Function0() { // from class: bo.app.r7$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i3 = i;
                        r7 r7Var = this;
                        Class cls2 = cls;
                        switch (i3) {
                            case 0:
                                return r7.a(cls2, r7Var);
                            default:
                                return r7.b(cls2, r7Var);
                        }
                    }
                }, 2, (Object) null);
                a(obj, cls);
            }
        }
    }

    public final boolean c(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean add = copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
            reentrantLock.unlock();
            return add;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class ".concat(cls.getName());
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.c.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.g;
            reentrantLock2.lock();
            try {
                this.d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(Class cls) {
        return Boxes$$ExternalSyntheticOutline1.m(cls, "Publishing cached event for class: ");
    }

    public final boolean a(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(r7 r7Var, Class cls, Object obj) {
        boolean c = r7Var.b.c();
        boolean a = r7Var.a.a();
        String name = cls.getName();
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("SDK delayed initialization mode: ", " and GDPR disabled mode: ", ". Not publishing event class: ", c, a);
        m.append(name);
        m.append(" and message: ");
        m.append(obj);
        return m.toString();
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, r7 r7Var) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + " " + r7Var;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            boolean containsKey = this.e.containsKey(cls);
            ConcurrentHashMap concurrentHashMap = this.e;
            if (containsKey) {
                List list = (List) concurrentHashMap.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    this.e.put(cls, CollectionsKt__CollectionsKt.mutableListOf(obj));
                }
            } else {
                concurrentHashMap.put(cls, CollectionsKt__CollectionsKt.mutableListOf(obj));
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(15), 7, (Object) null);
        this.i = true;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            for (Class cls : this.e.keySet()) {
                cls.getClass();
                a(cls);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.d.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, r7 r7Var) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + r7Var;
    }

    public static final String b(Class cls) {
        return Boxes$$ExternalSyntheticOutline1.m(cls, "Not publishing cached event for class: ", " because events are not allowed to send yet.");
    }
}
