package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YB extends XB {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29435w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f29436x;

    public YB(ZB zb) {
        this.f29436x = zb;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4278zC a() {
        switch (this.f29435w) {
            case 0:
                return new TB((ZB) this.f29436x);
            default:
                return new C3094dC(this.f29436x);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f29435w) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((C3793qC) ((ZB) this.f29436x).e()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f29436x.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.XB, com.google.android.gms.internal.ads.NB
    public RB f() {
        switch (this.f29435w) {
            case 1:
                return RB.j(this.f29436x);
            default:
                return super.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        switch (this.f29435w) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public int h(Object[] objArr, int i) {
        switch (this.f29435w) {
            case 1:
                objArr[i] = this.f29436x;
                return i + 1;
            default:
                return super.h(objArr, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.XB, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f29435w) {
            case 1:
                return this.f29436x.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f29435w) {
            case 0:
                return new TB((ZB) this.f29436x);
            default:
                return new C3094dC(this.f29436x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f29435w) {
            case 0:
                return ((ZB) this.f29436x).f29629x;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f29435w) {
            case 1:
                String obj = this.f29436x.toString();
                return D.x.p(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
            default:
                return super.toString();
        }
    }

    public YB(Object obj) {
        obj.getClass();
        this.f29436x = obj;
    }
}
