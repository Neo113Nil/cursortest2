package com.google.firebase.components;

/* loaded from: classes.dex */
public final class Qualified {
    public final Class qualifier;

    /* renamed from: type, reason: collision with root package name */
    public final Class f1006type;

    public @interface Unqualified {
    }

    public Qualified(Class cls, Class cls2) {
        this.qualifier = cls;
        this.f1006type = cls2;
    }

    public static Qualified unqualified(Class cls) {
        return new Qualified(Unqualified.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f1006type.equals(qualified.f1006type)) {
            return this.qualifier.equals(qualified.qualifier);
        }
        return false;
    }

    public final int hashCode() {
        return this.qualifier.hashCode() + (this.f1006type.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f1006type;
        Class cls2 = this.qualifier;
        if (cls2 == Unqualified.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
