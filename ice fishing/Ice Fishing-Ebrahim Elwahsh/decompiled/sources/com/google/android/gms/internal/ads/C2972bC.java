package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2972bC extends AbstractC2917aC {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29429w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f29430x;

    public C2972bC(C3026cC c3026cC) {
        this.f29430x = c3026cC;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        switch (this.f29429w) {
            case 0:
                return new WB((C3026cC) this.f29430x);
            default:
                return new C3245gC(this.f29430x);
        }
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f29429w) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((C3944tC) ((C3026cC) this.f29430x).e()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f29430x.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC, com.google.android.gms.internal.ads.QB
    public UB f() {
        switch (this.f29429w) {
            case 1:
                return UB.j(this.f29430x);
            default:
                return super.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        switch (this.f29429w) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public int h(Object[] objArr, int i) {
        switch (this.f29429w) {
            case 1:
                objArr[i] = this.f29430x;
                return i + 1;
            default:
                return super.h(objArr, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f29429w) {
            case 1:
                return this.f29430x.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f29429w) {
            case 0:
                return new WB((C3026cC) this.f29430x);
            default:
                return new C3245gC(this.f29430x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f29429w) {
            case 0:
                return ((C3026cC) this.f29430x).f29650x;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f29429w) {
            case 1:
                String obj = this.f29430x.toString();
                return D.y.o(new StringBuilder(String.valueOf(obj).length() + 2), "[", obj, "]");
            default:
                return super.toString();
        }
    }

    public C2972bC(Object obj) {
        obj.getClass();
        this.f29430x = obj;
    }
}
