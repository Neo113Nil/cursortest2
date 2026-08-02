package com.bumptech.glide.util;

/* loaded from: classes4.dex */
public final class MultiClassKey {
    public Class first;
    public Class second;
    public Class third;

    public MultiClassKey(Class cls, Class cls2, Class cls3) {
        this.first = cls;
        this.second = cls2;
        this.third = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MultiClassKey.class != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.first.equals(multiClassKey.first) && this.second.equals(multiClassKey.second) && Util.bothNullOrEqual(this.third, multiClassKey.third);
    }

    public final int hashCode() {
        int hashCode = (this.second.hashCode() + (this.first.hashCode() * 31)) * 31;
        Class cls = this.third;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.first + ", second=" + this.second + '}';
    }
}
