package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class LazySet implements Provider {
    public volatile Set actualSet;
    public volatile Set providers;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // com.google.firebase.inject.Provider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.actualSet == null) {
            synchronized (this) {
                try {
                    if (this.actualSet == null) {
                        this.actualSet = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.providers.iterator();
                            while (it.hasNext()) {
                                this.actualSet.add(((Provider) it.next()).get());
                            }
                            this.providers = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.actualSet);
    }
}
