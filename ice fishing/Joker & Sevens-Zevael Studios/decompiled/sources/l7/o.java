package l7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements w7.a {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set f4245a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set f4246b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // w7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f4246b == null) {
            synchronized (this) {
                try {
                    if (this.f4246b == null) {
                        this.f4246b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.f4245a.iterator();
                            while (it.hasNext()) {
                                this.f4246b.add(((w7.a) it.next()).get());
                            }
                            this.f4245a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f4246b);
    }
}
