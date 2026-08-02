package com.google.common.base;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class Suppliers$MemoizingSupplier implements Supplier, Serializable {
    public final Supplier delegate;
    public volatile transient boolean initialized;
    public final transient Object lock = new Object();
    public transient Object value;

    public Suppliers$MemoizingSupplier(Supplier supplier) {
        supplier.getClass();
        this.delegate = supplier;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        if (!this.initialized) {
            synchronized (this.lock) {
                try {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.value;
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Suppliers.memoize("), this.initialized ? Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("<supplier that returned "), this.value, ">") : this.delegate, ")");
    }
}
