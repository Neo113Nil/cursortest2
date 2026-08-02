package com.google.common.base;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Suppliers$SupplierOfInstance implements Supplier, Serializable {
    public final Object instance;

    public Suppliers$SupplierOfInstance(Object obj) {
        this.instance = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return this.instance.equals(((Suppliers$SupplierOfInstance) obj).instance);
        }
        return false;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return this.instance;
    }

    public final int hashCode() {
        return Objects.hash(this.instance);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("Suppliers.ofInstance("), this.instance, ")");
    }
}
