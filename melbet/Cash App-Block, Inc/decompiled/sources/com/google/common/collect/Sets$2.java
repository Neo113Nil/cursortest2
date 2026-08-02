package com.google.common.collect;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Predicate;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Sets$2 extends AbstractSet {
    public final /* synthetic */ Set val$set1;
    public final /* synthetic */ Set val$set2;

    public Sets$2(Set set, Set set2) {
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.val$set1.contains(obj) && this.val$set2.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.val$set1.containsAll(collection) && this.val$set2.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z = set instanceof Sets$2;
                int maxSize = z ? ((Sets$2) set).maxSize() : set.size();
                if (maxSize >= 0) {
                    int size = z ? 0 : set.size();
                    if (maxSize() >= size) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.val$set1, this.val$set2);
                        int i = 0;
                        while (true) {
                            if (anonymousClass1.hasNext()) {
                                try {
                                    if (!set.contains(anonymousClass1.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != maxSize) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i2 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i2++;
                                        if (i2 > i) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.val$set2, this.val$set1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AnonymousClass1 iterator() {
        return new AnonymousClass1(this.val$set1, this.val$set2);
    }

    public final int maxSize() {
        Set set = this.val$set1;
        int maxSize = set instanceof Sets$2 ? ((Sets$2) set).maxSize() : set.size();
        Set set2 = this.val$set2;
        return Math.min(maxSize, set2 instanceof Sets$2 ? ((Sets$2) set2).maxSize() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.val$set1.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.val$set2.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new AnonymousClass1(this.val$set1, this.val$set2);
    }

    /* renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends UnmodifiableIterator {
        public final /* synthetic */ int $r8$classId;
        public final Iterator itr;
        public Object next;
        public int state;
        public final /* synthetic */ Object val$set2;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set set, Set set2) {
            this();
            this.$r8$classId = 0;
            this.val$set2 = set2;
            this.itr = set.iterator();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.util.Iterator
        public final boolean hasNext() {
            Object next;
            Trace.checkState(this.state != 4);
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.state);
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.state = 4;
                int i = this.$r8$classId;
                Object obj = null;
                Object obj2 = this.val$set2;
                Iterator it = this.itr;
                switch (i) {
                    case 0:
                        while (it.hasNext()) {
                            next = it.next();
                            if (((Set) obj2).contains(next)) {
                                obj = next;
                                break;
                            }
                        }
                        this.state = 3;
                        break;
                    default:
                        while (it.hasNext()) {
                            next = it.next();
                            if (((Predicate) obj2).apply(next)) {
                                obj = next;
                                break;
                            }
                        }
                        this.state = 3;
                        break;
                }
                this.next = obj;
                if (this.state != 3) {
                    this.state = 1;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.state = 2;
            Object obj = this.next;
            this.next = null;
            return obj;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Iterator it, Predicate predicate) {
            this();
            this.$r8$classId = 1;
            this.itr = it;
            this.val$set2 = predicate;
        }

        public AnonymousClass1() {
            super(0);
            this.state = 2;
        }
    }
}
