package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class qy0 extends zz4 {
    public final /* synthetic */ int c;
    public final f9g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(t9f t9fVar, int i) {
        super(t9fVar);
        this.c = i;
        t9fVar.getClass();
        switch (i) {
            case 1:
                super(t9fVar);
                mhp descriptor = t9fVar.getDescriptor();
                descriptor.getClass();
                this.d = new ux0(descriptor, 2);
                break;
            case 2:
                super(t9fVar);
                mhp descriptor2 = t9fVar.getDescriptor();
                descriptor2.getClass();
                this.d = new ux0(descriptor2, 3);
                break;
            default:
                this.d = new ux0(t9fVar.getDescriptor());
                break;
        }
    }

    @Override // defpackage.x5
    public final Object a() {
        switch (this.c) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.x5
    public final int b(Object obj) {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.x5
    public final void c(int i, Object obj) {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.ensureCapacity(i);
                break;
            case 1:
                ((HashSet) obj).getClass();
                break;
            default:
                ((LinkedHashSet) obj).getClass();
                break;
        }
    }

    @Override // defpackage.x5
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.c) {
        }
        return (ux0) this.d;
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.x5
    public final Object k(Object obj) {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.zz4
    public final void l(int i, Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
