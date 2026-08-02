package com.google.common.base;

/* loaded from: classes.dex */
public final class Absent extends Optional {
    public static final Absent INSTANCE = new Absent();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // com.google.common.base.Optional
    public final Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public final boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public final Object orNull() {
        return null;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
