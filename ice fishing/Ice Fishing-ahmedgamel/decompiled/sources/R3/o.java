package R3;

import c4.InterfaceC0542a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o implements InterfaceC0542a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f2746a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f2747b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // c4.InterfaceC0542a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f2747b == null) {
            synchronized (this) {
                try {
                    if (this.f2747b == null) {
                        this.f2747b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f2746a.iterator();
                            while (it.hasNext()) {
                                this.f2747b.add(((InterfaceC0542a) it.next()).get());
                            }
                            this.f2746a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2747b);
    }
}
