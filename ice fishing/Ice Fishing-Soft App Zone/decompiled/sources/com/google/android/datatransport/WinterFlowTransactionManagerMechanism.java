package com.google.android.datatransport;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerMechanism implements List, WinterFlowLoaderProcess {
    public int WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public final WinterFlowPackageResolver WinterFlowVariableVersionControl;

    public WinterFlowTransactionManagerMechanism(WinterFlowPackageResolver winterFlowPackageResolver, int i, int i2) {
        this.WinterFlowVariableVersionControl = winterFlowPackageResolver;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        this.WinterFlowRouterRouter = i2 - i;
    }

    public final void WinterFlowRouterStructure() {
        if (WinterFlowServerManager.WinterFlowSerializerStructure(this.WinterFlowVariableVersionControl) != this.WinterFlowUnitTestResponse) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        WinterFlowRouterStructure();
        int i = this.WinterFlowTransactionManagerStrategy + this.WinterFlowRouterRouter;
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        winterFlowPackageResolver.add(i, obj);
        this.WinterFlowRouterRouter++;
        this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        WinterFlowRouterStructure();
        int i2 = i + this.WinterFlowTransactionManagerStrategy;
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        boolean addAll = winterFlowPackageResolver.addAll(i2, collection);
        if (addAll) {
            this.WinterFlowRouterRouter = collection.size() + this.WinterFlowRouterRouter;
            this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.WinterFlowRouterRouter > 0) {
            WinterFlowRouterStructure();
            int i = this.WinterFlowRouterRouter;
            int i2 = this.WinterFlowTransactionManagerStrategy;
            WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
            winterFlowPackageResolver.WinterFlowVariableVersionControl(i2, i + i2);
            this.WinterFlowRouterRouter = 0;
            this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowRouterStructure();
        WinterFlowServerManager.WinterFlowSyntaxSubsystem(i, this.WinterFlowRouterRouter);
        return this.WinterFlowVariableVersionControl.get(this.WinterFlowTransactionManagerStrategy + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        WinterFlowRouterStructure();
        int i = this.WinterFlowRouterRouter;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        Iterator it = WinterFlowDecoratorUI.WinterFlowArrayHelper(i2, i + i2).iterator();
        while (((WinterFlowObjectBandwidth) it).WinterFlowUnitTestResponse) {
            int nextInt = ((WinterFlowWidgetAlgorithm) it).nextInt();
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowVariableVersionControl.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WinterFlowRouterRouter == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        WinterFlowRouterStructure();
        int i = this.WinterFlowRouterRouter;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowVariableVersionControl.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        WinterFlowRouterStructure();
        WinterFlowTransactionInterface winterFlowTransactionInterface = new WinterFlowTransactionInterface();
        winterFlowTransactionInterface.WinterFlowVariableVersionControl = i - 1;
        return new WinterFlowClassController(winterFlowTransactionInterface, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        WinterFlowRouterStructure();
        int i2 = this.WinterFlowTransactionManagerStrategy + i;
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        Object remove = winterFlowPackageResolver.remove(i2);
        this.WinterFlowRouterRouter--;
        this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        WinterFlowParserThread winterFlowParserThread;
        WinterFlowJSONModule WinterFlowRouterRouter;
        boolean WinterFlowRouterRouter2;
        WinterFlowRouterStructure();
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowTransactionManagerStrategy;
        int i3 = this.WinterFlowRouterRouter + i2;
        int size = winterFlowPackageResolver.size();
        do {
            synchronized (WinterFlowServerManager.WinterFlowServerProtocol) {
                WinterFlowSyntaxJava winterFlowSyntaxJava = winterFlowPackageResolver.WinterFlowVariableVersionControl;
                winterFlowSyntaxJava.getClass();
                WinterFlowSyntaxJava winterFlowSyntaxJava2 = (WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowTransactionManagerStrategy(winterFlowSyntaxJava);
                i = winterFlowSyntaxJava2.WinterFlowArrayNetwork;
                winterFlowParserThread = winterFlowSyntaxJava2.WinterFlowCacheManagerAgent;
            }
            winterFlowParserThread.getClass();
            WinterFlowDataSourceController WinterFlowTransactionManagerStrategy = winterFlowParserThread.WinterFlowTransactionManagerStrategy();
            WinterFlowTransactionManagerStrategy.subList(i2, i3).retainAll(collection);
            WinterFlowParserThread WinterFlowArrayNetwork = WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork();
            if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowArrayNetwork, winterFlowParserThread)) {
                break;
            }
            WinterFlowSyntaxJava winterFlowSyntaxJava3 = winterFlowPackageResolver.WinterFlowVariableVersionControl;
            winterFlowSyntaxJava3.getClass();
            synchronized (WinterFlowVersionProtocol.WinterFlowCacheManagerAgent) {
                WinterFlowRouterRouter = WinterFlowVersionProtocol.WinterFlowRouterRouter();
                WinterFlowRouterRouter2 = WinterFlowServerManager.WinterFlowRouterRouter((WinterFlowSyntaxJava) WinterFlowVersionProtocol.WinterFlowMapperProtocol(winterFlowSyntaxJava3, winterFlowPackageResolver, WinterFlowRouterRouter), i, WinterFlowArrayNetwork, true);
            }
            WinterFlowVersionProtocol.WinterFlowServerProtocol(WinterFlowRouterRouter, winterFlowPackageResolver);
        } while (!WinterFlowRouterRouter2);
        int size2 = size - winterFlowPackageResolver.size();
        if (size2 > 0) {
            this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(this.WinterFlowVariableVersionControl);
            this.WinterFlowRouterRouter -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowServerManager.WinterFlowSyntaxSubsystem(i, this.WinterFlowRouterRouter);
        WinterFlowRouterStructure();
        int i2 = i + this.WinterFlowTransactionManagerStrategy;
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        Object obj2 = winterFlowPackageResolver.set(i2, obj);
        this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.WinterFlowRouterRouter;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.WinterFlowRouterRouter) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("fromIndex or toIndex are out of bounds");
        }
        WinterFlowRouterStructure();
        int i3 = this.WinterFlowTransactionManagerStrategy;
        return new WinterFlowTransactionManagerMechanism(this.WinterFlowVariableVersionControl, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        WinterFlowRouterStructure();
        int i2 = this.WinterFlowTransactionManagerStrategy + i;
        WinterFlowPackageResolver winterFlowPackageResolver = this.WinterFlowVariableVersionControl;
        winterFlowPackageResolver.add(i2, obj);
        this.WinterFlowRouterRouter++;
        this.WinterFlowUnitTestResponse = WinterFlowServerManager.WinterFlowSerializerStructure(winterFlowPackageResolver);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.WinterFlowRouterRouter, collection);
    }
}
