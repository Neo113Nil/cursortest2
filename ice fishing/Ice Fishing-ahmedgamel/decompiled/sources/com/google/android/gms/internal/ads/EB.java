package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EB extends AbstractSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24553n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ GB f24554u;

    public /* synthetic */ EB(GB gb, int i) {
        this.f24553n = i;
        this.f24554u = gb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f24553n) {
            case 0:
                this.f24554u.clear();
                break;
            default:
                this.f24554u.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f24553n) {
            case 0:
                GB gb = this.f24554u;
                Map f3 = gb.f();
                if (f3 != null) {
                    return f3.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int j6 = gb.j(entry.getKey());
                    if (j6 != -1 && Objects.equals(gb.d()[j6], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f24554u.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f24553n) {
            case 0:
                GB gb = this.f24554u;
                Map f3 = gb.f();
                return f3 != null ? f3.entrySet().iterator() : new DB(gb, 1);
            default:
                GB gb2 = this.f24554u;
                Map f9 = gb2.f();
                return f9 != null ? f9.keySet().iterator() : new DB(gb2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f24553n) {
            case 0:
                GB gb = this.f24554u;
                Map f3 = gb.f();
                if (f3 != null) {
                    return f3.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!gb.e()) {
                        int h9 = gb.h();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = gb.f24944n;
                        Objects.requireNonNull(obj2);
                        int E8 = AbstractC2968bG.E(key, value, h9, obj2, gb.a(), gb.c(), gb.d());
                        if (E8 != -1) {
                            gb.g(E8, h9);
                            gb.f24949y--;
                            gb.f24948x += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                GB gb2 = this.f24554u;
                Map f9 = gb2.f();
                return f9 != null ? f9.keySet().remove(obj) : gb2.k(obj) != GB.f24941C;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f24553n) {
        }
        return this.f24554u.size();
    }
}
