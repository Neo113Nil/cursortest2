package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class d8g implements Map.Entry {
    public d8g a;
    public d8g b;
    public d8g c;
    public d8g d;
    public d8g e;
    public final Object f;
    public final int g;
    public Object h;
    public int i;

    public d8g(d8g d8gVar, Object obj, int i, d8g d8gVar2, d8g d8gVar3) {
        this.a = d8gVar;
        this.f = obj;
        this.g = i;
        this.i = 1;
        this.d = d8gVar2;
        this.e = d8gVar3;
        d8gVar3.d = this;
        d8gVar2.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.h;
    }

    public d8g() {
        this.f = null;
        this.g = -1;
        this.e = this;
        this.d = this;
    }
}
