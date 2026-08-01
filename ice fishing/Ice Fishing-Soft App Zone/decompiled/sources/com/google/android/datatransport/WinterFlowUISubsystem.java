package com.google.android.datatransport;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUISubsystem implements List, WinterFlowLoaderProcess {
    public final int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final List WinterFlowVariableVersionControl;

    public WinterFlowUISubsystem(List list, int i, int i2) {
        this.WinterFlowVariableVersionControl = list;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.WinterFlowVariableVersionControl.add(i + this.WinterFlowTransactionManagerStrategy, obj);
        this.WinterFlowUnitTestResponse++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.WinterFlowVariableVersionControl.addAll(i + this.WinterFlowTransactionManagerStrategy, collection);
        int size = collection.size();
        this.WinterFlowUnitTestResponse += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.WinterFlowUnitTestResponse - 1;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 <= i) {
            while (true) {
                this.WinterFlowVariableVersionControl.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.WinterFlowUnitTestResponse = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = this.WinterFlowTransactionManagerStrategy; i2 < i; i2++) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl.get(i2), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        return this.WinterFlowVariableVersionControl.get(i + this.WinterFlowTransactionManagerStrategy);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.WinterFlowUnitTestResponse;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        for (int i3 = i2; i3 < i; i3++) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowUnitTestResponse == this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new WinterFlowRepositoryPlatform(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.WinterFlowUnitTestResponse - 1;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 > i) {
            return -1;
        }
        while (!WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new WinterFlowRepositoryPlatform(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.WinterFlowUnitTestResponse;
        for (int i2 = this.WinterFlowTransactionManagerStrategy; i2 < i; i2++) {
            List list = this.WinterFlowVariableVersionControl;
            if (WinterFlowManagerRequest.WinterFlowThreadListener(list.get(i2), obj)) {
                list.remove(i2);
                this.WinterFlowUnitTestResponse--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.WinterFlowUnitTestResponse;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.WinterFlowUnitTestResponse;
        int i2 = i - 1;
        int i3 = this.WinterFlowTransactionManagerStrategy;
        if (i3 <= i2) {
            while (true) {
                List list = this.WinterFlowVariableVersionControl;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.WinterFlowUnitTestResponse--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        return this.WinterFlowVariableVersionControl.set(i + this.WinterFlowTransactionManagerStrategy, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.WinterFlowUnitTestResponse - this.WinterFlowTransactionManagerStrategy;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        WinterFlowResponseTool.WinterFlowHookDataSource(this, i, i2);
        return new WinterFlowUISubsystem(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return WinterFlowTestingCloud.WinterFlowUserManagerUserManager(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return WinterFlowTestingCloud.WinterFlowSoftwareEngine(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new WinterFlowRepositoryPlatform(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.WinterFlowUnitTestResponse;
        this.WinterFlowUnitTestResponse = i + 1;
        this.WinterFlowVariableVersionControl.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.WinterFlowVariableVersionControl.addAll(this.WinterFlowUnitTestResponse, collection);
        int size = collection.size();
        this.WinterFlowUnitTestResponse += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        WinterFlowResponseTool.WinterFlowRouterStructure(i, this);
        this.WinterFlowUnitTestResponse--;
        return this.WinterFlowVariableVersionControl.remove(i + this.WinterFlowTransactionManagerStrategy);
    }
}
