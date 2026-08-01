package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YB extends XB {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28658w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f28659x;

    public YB(ZB zb) {
        this.f28659x = zb;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4255zC a() {
        switch (this.f28658w) {
            case 0:
                return new TB((ZB) this.f28659x);
            default:
                return new C3071dC(this.f28659x);
        }
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f28658w) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((C3770qC) ((ZB) this.f28659x).e()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f28659x.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.XB, com.google.android.gms.internal.ads.NB
    public RB f() {
        switch (this.f28658w) {
            case 1:
                return RB.j(this.f28659x);
            default:
                return super.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        switch (this.f28658w) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public int h(Object[] objArr, int i) {
        switch (this.f28658w) {
            case 1:
                objArr[i] = this.f28659x;
                return i + 1;
            default:
                return super.h(objArr, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.XB, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f28658w) {
            case 1:
                return this.f28659x.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f28658w) {
            case 0:
                return new TB((ZB) this.f28659x);
            default:
                return new C3071dC(this.f28659x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f28658w) {
            case 0:
                return ((ZB) this.f28659x).f28849x;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f28658w) {
            case 1:
                String obj = this.f28659x.toString();
                return D.y.s(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
            default:
                return super.toString();
        }
    }

    public YB(Object obj) {
        obj.getClass();
        this.f28659x = obj;
    }
}
