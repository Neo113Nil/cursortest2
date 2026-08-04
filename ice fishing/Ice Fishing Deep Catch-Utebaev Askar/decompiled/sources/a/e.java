package a;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f22b;

    public /* synthetic */ e(a aVar, int i2) {
        this.f21a = i2;
        this.f22b = aVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a aVar = this.f22b;
                int i2 = aVar.f3d.f10c;
                Iterator it = collection.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    b bVar = aVar.f3d;
                    if (!zHasNext) {
                        return i2 != bVar.f10c;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    bVar.put(entry.getKey(), entry.getValue());
                }
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i2 = this.f21a;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aVar.f3d.clear();
                break;
            default:
                aVar.f3d.clear();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i2 = this.f21a;
        boolean z = true;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iK = aVar.f3d.k(entry.getKey());
                if (iK < 0) {
                    return false;
                }
                Object objA = aVar.a(iK, 1);
                Object value = entry.getValue();
                if (objA != value && (objA == null || !objA.equals(value))) {
                    z = false;
                }
                return z;
            default:
                return aVar.f3d.k(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                b bVar = this.f22b.f3d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!bVar.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                break;
        }
        return a.c(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i2 = this.f21a;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int iHashCode = 0;
                for (int i3 = aVar.f3d.f10c - 1; i3 >= 0; i3--) {
                    Object objA = aVar.a(i3, 0);
                    Object objA2 = aVar.a(i3, 1);
                    iHashCode += (objA == null ? 0 : objA.hashCode()) ^ (objA2 == null ? 0 : objA2.hashCode());
                }
                return iHashCode;
            default:
                int iHashCode2 = 0;
                for (int i4 = aVar.f3d.f10c - 1; i4 >= 0; i4--) {
                    Object objA3 = aVar.a(i4, 0);
                    iHashCode2 += objA3 == null ? 0 : objA3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i2 = this.f21a;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return aVar.f3d.f10c == 0;
            default:
                return aVar.f3d.f10c == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i2 = this.f21a;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new f(aVar);
            default:
                return new d(aVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                a aVar = this.f22b;
                int iK = aVar.f3d.k(obj);
                if (iK < 0) {
                    return false;
                }
                aVar.b(iK);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                b bVar = this.f22b.f3d;
                int i2 = bVar.f10c;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bVar.remove(it.next());
                }
                return i2 != bVar.f10c;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                b bVar = this.f22b.f3d;
                int i2 = bVar.f10c;
                Iterator it = ((e) bVar.keySet()).iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return i2 != bVar.f10c;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i2 = this.f21a;
        a aVar = this.f22b;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                break;
        }
        return aVar.f3d.f10c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                a aVar = this.f22b;
                int i2 = aVar.f3d.f10c;
                Object[] objArr = new Object[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = aVar.a(i3, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f21a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f22b.d(objArr, 0);
        }
    }
}
