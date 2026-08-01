package com.google.android.datatransport;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationValidator extends WinterFlowDeserializationDeployment {
    public static final Object[] WinterFlowRouterRouter = new Object[0];
    public Object[] WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public int WinterFlowVariableVersionControl;

    public WinterFlowOrchestrationValidator(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = WinterFlowRouterRouter;
        } else {
            if (i <= 0) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new Object[i];
        }
        this.WinterFlowTransactionManagerStrategy = objArr;
    }

    public final void WinterFlowArrayNetwork(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.WinterFlowTransactionManagerStrategy.length;
        while (i < length && it.hasNext()) {
            this.WinterFlowTransactionManagerStrategy[i] = it.next();
            i++;
        }
        int i2 = this.WinterFlowVariableVersionControl;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.WinterFlowTransactionManagerStrategy[i3] = it.next();
        }
        this.WinterFlowUnitTestResponse = collection.size() + this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final Object WinterFlowCacheManagerAgent(int i) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == WinterFlowRouterStructure() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        WinterFlowServerProtocol();
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj = objArr[WinterFlowTransactionAgent];
        int i3 = this.WinterFlowUnitTestResponse >> 1;
        int i4 = this.WinterFlowVariableVersionControl;
        if (i < i3) {
            if (WinterFlowTransactionAgent >= i4) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i4 + 1, i4, WinterFlowTransactionAgent);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, 1, 0, WinterFlowTransactionAgent);
                Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.WinterFlowVariableVersionControl;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
            int i6 = this.WinterFlowVariableVersionControl;
            objArr3[i6] = null;
            this.WinterFlowVariableVersionControl = WinterFlowUnitTestResponse(i6);
        } else {
            int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent((WinterFlowRouterStructure() - 1) + i4);
            Object[] objArr4 = this.WinterFlowTransactionManagerStrategy;
            if (WinterFlowTransactionAgent <= WinterFlowTransactionAgent2) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr4, objArr4, WinterFlowTransactionAgent, WinterFlowTransactionAgent + 1, WinterFlowTransactionAgent2 + 1);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr4, objArr4, WinterFlowTransactionAgent, WinterFlowTransactionAgent + 1, objArr4.length);
                Object[] objArr5 = this.WinterFlowTransactionManagerStrategy;
                objArr5[objArr5.length - 1] = objArr5[0];
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr5, objArr5, 0, 1, WinterFlowTransactionAgent2 + 1);
            }
            this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent2] = null;
        }
        this.WinterFlowUnitTestResponse--;
        return obj;
    }

    public final void WinterFlowResponseEngine(int i, int i2) {
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.WinterFlowTransactionManagerStrategy, 0, i2, (Object) null);
        }
    }

    public final Object WinterFlowRouterRouter() {
        if (isEmpty()) {
            return null;
        }
        return this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent((WinterFlowRouterStructure() - 1) + this.WinterFlowVariableVersionControl)];
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    public final void WinterFlowServerProtocol() {
        ((AbstractList) this).modCount++;
    }

    public final int WinterFlowSyntax(int i) {
        return i < 0 ? i + this.WinterFlowTransactionManagerStrategy.length : i;
    }

    public final int WinterFlowTransactionAgent(int i) {
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final Object WinterFlowTransactionManagerStrategy() {
        if (isEmpty()) {
            return null;
        }
        return this.WinterFlowTransactionManagerStrategy[this.WinterFlowVariableVersionControl];
    }

    public final int WinterFlowUnitTestResponse(int i) {
        if (i == this.WinterFlowTransactionManagerStrategy.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void WinterFlowVariableVersionControl(int i) {
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Deque is too big.");
            return;
        }
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == WinterFlowRouterRouter) {
            if (i < 10) {
                i = 10;
            }
            this.WinterFlowTransactionManagerStrategy = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, 0, this.WinterFlowVariableVersionControl, objArr.length);
        Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
        int length2 = objArr3.length;
        int i3 = this.WinterFlowVariableVersionControl;
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr2, length2 - i3, 0, i3);
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowTransactionManagerStrategy = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        WinterFlowServerProtocol();
        WinterFlowVariableVersionControl(this.WinterFlowUnitTestResponse + 1);
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i);
        int i3 = this.WinterFlowUnitTestResponse;
        if (i < ((i3 + 1) >> 1)) {
            int length = WinterFlowTransactionAgent == 0 ? this.WinterFlowTransactionManagerStrategy.length - 1 : WinterFlowTransactionAgent - 1;
            int i4 = this.WinterFlowVariableVersionControl;
            int length2 = i4 == 0 ? this.WinterFlowTransactionManagerStrategy.length - 1 : i4 - 1;
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            if (length >= i4) {
                objArr[length2] = objArr[i4];
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i4, i4 + 1, length + 1);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i4 - 1, i4, objArr.length);
                Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                objArr2[objArr2.length - 1] = objArr2[0];
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, 0, 1, length + 1);
            }
            this.WinterFlowTransactionManagerStrategy[length] = obj;
            this.WinterFlowVariableVersionControl = length2;
        } else {
            int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(i3 + this.WinterFlowVariableVersionControl);
            Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
            if (WinterFlowTransactionAgent < WinterFlowTransactionAgent2) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, WinterFlowTransactionAgent + 1, WinterFlowTransactionAgent, WinterFlowTransactionAgent2);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, 1, 0, WinterFlowTransactionAgent2);
                Object[] objArr4 = this.WinterFlowTransactionManagerStrategy;
                objArr4[0] = objArr4[objArr4.length - 1];
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr4, objArr4, WinterFlowTransactionAgent + 1, WinterFlowTransactionAgent, objArr4.length - 1);
            }
            this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent] = obj;
        }
        this.WinterFlowUnitTestResponse++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.WinterFlowUnitTestResponse) {
            return addAll(collection);
        }
        WinterFlowServerProtocol();
        WinterFlowVariableVersionControl(collection.size() + this.WinterFlowUnitTestResponse);
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
        int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i);
        int size = collection.size();
        if (i >= ((this.WinterFlowUnitTestResponse + 1) >> 1)) {
            int i3 = WinterFlowTransactionAgent2 + size;
            Object[] objArr = this.WinterFlowTransactionManagerStrategy;
            if (WinterFlowTransactionAgent2 < WinterFlowTransactionAgent) {
                int i4 = size + WinterFlowTransactionAgent;
                if (i4 <= objArr.length) {
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i3, WinterFlowTransactionAgent2, WinterFlowTransactionAgent);
                } else if (i3 >= objArr.length) {
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i3 - objArr.length, WinterFlowTransactionAgent2, WinterFlowTransactionAgent);
                } else {
                    int length = WinterFlowTransactionAgent - (i4 - objArr.length);
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, 0, length, WinterFlowTransactionAgent);
                    Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr2, i3, WinterFlowTransactionAgent2, length);
                }
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, size, 0, WinterFlowTransactionAgent);
                Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
                if (i3 >= objArr3.length) {
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, i3 - objArr3.length, WinterFlowTransactionAgent2, objArr3.length);
                } else {
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.WinterFlowTransactionManagerStrategy;
                    WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr4, objArr4, i3, WinterFlowTransactionAgent2, objArr4.length - size);
                }
            }
            WinterFlowArrayNetwork(WinterFlowTransactionAgent2, collection);
            return true;
        }
        int i5 = this.WinterFlowVariableVersionControl;
        int i6 = i5 - size;
        Object[] objArr5 = this.WinterFlowTransactionManagerStrategy;
        if (WinterFlowTransactionAgent2 < i5) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr5, objArr5, i6, i5, objArr5.length);
            Object[] objArr6 = this.WinterFlowTransactionManagerStrategy;
            if (size >= WinterFlowTransactionAgent2) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr6, objArr6, objArr6.length - size, 0, WinterFlowTransactionAgent2);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr7, objArr7, 0, size, WinterFlowTransactionAgent2);
            }
        } else if (i6 >= 0) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr5, objArr5, i6, i5, WinterFlowTransactionAgent2);
        } else {
            i6 += objArr5.length;
            int i7 = WinterFlowTransactionAgent2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr5, objArr5, i6, i5, WinterFlowTransactionAgent2);
            } else {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr5, objArr5, i6, i5, i5 + length2);
                Object[] objArr8 = this.WinterFlowTransactionManagerStrategy;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr8, objArr8, 0, this.WinterFlowVariableVersionControl + length2, WinterFlowTransactionAgent2);
            }
        }
        this.WinterFlowVariableVersionControl = i6;
        WinterFlowArrayNetwork(WinterFlowSyntax(WinterFlowTransactionAgent2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        WinterFlowServerProtocol();
        WinterFlowVariableVersionControl(this.WinterFlowUnitTestResponse + 1);
        int i = this.WinterFlowVariableVersionControl;
        if (i == 0) {
            i = this.WinterFlowTransactionManagerStrategy.length;
        }
        int i2 = i - 1;
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy[i2] = obj;
        this.WinterFlowUnitTestResponse++;
    }

    public final void addLast(Object obj) {
        WinterFlowServerProtocol();
        WinterFlowVariableVersionControl(this.WinterFlowUnitTestResponse + 1);
        this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl)] = obj;
        this.WinterFlowUnitTestResponse++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            WinterFlowServerProtocol();
            WinterFlowResponseEngine(this.WinterFlowVariableVersionControl, WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl));
        }
        this.WinterFlowVariableVersionControl = 0;
        this.WinterFlowUnitTestResponse = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.WinterFlowTransactionManagerStrategy[this.WinterFlowVariableVersionControl];
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i >= 0 && i < i2) {
            return this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i)];
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
        int i2 = this.WinterFlowVariableVersionControl;
        if (i2 < WinterFlowTransactionAgent) {
            while (i2 < WinterFlowTransactionAgent) {
                if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[i2])) {
                    i = this.WinterFlowVariableVersionControl;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.WinterFlowVariableVersionControl) < WinterFlowTransactionAgent) {
            return -1;
        }
        int length = this.WinterFlowTransactionManagerStrategy.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < WinterFlowTransactionAgent; i3++) {
                    if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[i3])) {
                        i2 = i3 + this.WinterFlowTransactionManagerStrategy.length;
                        i = this.WinterFlowVariableVersionControl;
                    }
                }
                return -1;
            }
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[i2])) {
                i = this.WinterFlowVariableVersionControl;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return WinterFlowRouterStructure() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            WinterFlowCompilerMechanism.WinterFlowSyntax("ArrayDeque is empty.");
            return null;
        }
        return this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent((WinterFlowRouterStructure() - 1) + this.WinterFlowVariableVersionControl)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
        int i2 = this.WinterFlowVariableVersionControl;
        if (i2 < WinterFlowTransactionAgent) {
            length = WinterFlowTransactionAgent - 1;
            if (i2 <= length) {
                while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.WinterFlowVariableVersionControl;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.WinterFlowVariableVersionControl >= WinterFlowTransactionAgent) {
            while (true) {
                WinterFlowTransactionAgent--;
                Object[] objArr = this.WinterFlowTransactionManagerStrategy;
                if (-1 >= WinterFlowTransactionAgent) {
                    length = objArr.length - 1;
                    int i3 = this.WinterFlowVariableVersionControl;
                    if (i3 <= length) {
                        while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowTransactionManagerStrategy[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.WinterFlowVariableVersionControl;
                    }
                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, objArr[WinterFlowTransactionAgent])) {
                    length = WinterFlowTransactionAgent + this.WinterFlowTransactionManagerStrategy.length;
                    i = this.WinterFlowVariableVersionControl;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        WinterFlowCacheManagerAgent(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int WinterFlowTransactionAgent;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.WinterFlowTransactionManagerStrategy.length != 0) {
            int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
            int i = this.WinterFlowVariableVersionControl;
            if (i < WinterFlowTransactionAgent2) {
                WinterFlowTransactionAgent = i;
                while (true) {
                    objArr = this.WinterFlowTransactionManagerStrategy;
                    if (i >= WinterFlowTransactionAgent2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent] = obj;
                        WinterFlowTransactionAgent++;
                    }
                    i++;
                }
                Arrays.fill(objArr, WinterFlowTransactionAgent, WinterFlowTransactionAgent2, (Object) null);
            } else {
                int length = this.WinterFlowTransactionManagerStrategy.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.WinterFlowTransactionManagerStrategy[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                WinterFlowTransactionAgent = WinterFlowTransactionAgent(i2);
                for (int i3 = 0; i3 < WinterFlowTransactionAgent2; i3++) {
                    Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent] = obj3;
                        WinterFlowTransactionAgent = WinterFlowUnitTestResponse(WinterFlowTransactionAgent);
                    }
                }
                z = z2;
            }
            if (z) {
                WinterFlowServerProtocol();
                this.WinterFlowUnitTestResponse = WinterFlowSyntax(WinterFlowTransactionAgent - this.WinterFlowVariableVersionControl);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            WinterFlowCompilerMechanism.WinterFlowSyntax("ArrayDeque is empty.");
            return null;
        }
        WinterFlowServerProtocol();
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        int i = this.WinterFlowVariableVersionControl;
        Object obj = objArr[i];
        objArr[i] = null;
        this.WinterFlowVariableVersionControl = WinterFlowUnitTestResponse(i);
        this.WinterFlowUnitTestResponse--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            WinterFlowCompilerMechanism.WinterFlowSyntax("ArrayDeque is empty.");
            return null;
        }
        WinterFlowServerProtocol();
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent((WinterFlowRouterStructure() - 1) + this.WinterFlowVariableVersionControl);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj = objArr[WinterFlowTransactionAgent];
        objArr[WinterFlowTransactionAgent] = null;
        this.WinterFlowUnitTestResponse--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        WinterFlowInvokerComponent.WinterFlowBandwidthObject(i, i2, this.WinterFlowUnitTestResponse);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.WinterFlowUnitTestResponse) {
            clear();
            return;
        }
        if (i3 == 1) {
            WinterFlowCacheManagerAgent(i);
            return;
        }
        WinterFlowServerProtocol();
        int i4 = this.WinterFlowUnitTestResponse - i2;
        int i5 = this.WinterFlowVariableVersionControl;
        int i6 = this.WinterFlowVariableVersionControl;
        if (i < i4) {
            int WinterFlowTransactionAgent = WinterFlowTransactionAgent((i - 1) + i5);
            int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent((i2 - 1) + i6);
            while (i > 0) {
                int i7 = WinterFlowTransactionAgent + 1;
                int min = Math.min(i, Math.min(i7, WinterFlowTransactionAgent2 + 1));
                Object[] objArr = this.WinterFlowTransactionManagerStrategy;
                int i8 = WinterFlowTransactionAgent2 - min;
                int i9 = WinterFlowTransactionAgent - min;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i8 + 1, i9 + 1, i7);
                WinterFlowTransactionAgent = WinterFlowSyntax(i9);
                WinterFlowTransactionAgent2 = WinterFlowSyntax(i8);
                i -= min;
            }
            int WinterFlowTransactionAgent3 = WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i3);
            WinterFlowResponseEngine(this.WinterFlowVariableVersionControl, WinterFlowTransactionAgent3);
            this.WinterFlowVariableVersionControl = WinterFlowTransactionAgent3;
        } else {
            int WinterFlowTransactionAgent4 = WinterFlowTransactionAgent(i5 + i2);
            int WinterFlowTransactionAgent5 = WinterFlowTransactionAgent(i6 + i);
            int i10 = this.WinterFlowUnitTestResponse;
            while (true) {
                i10 -= i2;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                i2 = Math.min(i10, Math.min(objArr2.length - WinterFlowTransactionAgent4, objArr2.length - WinterFlowTransactionAgent5));
                Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
                int i11 = WinterFlowTransactionAgent4 + i2;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr3, WinterFlowTransactionAgent5, WinterFlowTransactionAgent4, i11);
                WinterFlowTransactionAgent4 = WinterFlowTransactionAgent(i11);
                WinterFlowTransactionAgent5 = WinterFlowTransactionAgent(WinterFlowTransactionAgent5 + i2);
            }
            int WinterFlowTransactionAgent6 = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
            WinterFlowResponseEngine(WinterFlowSyntax(WinterFlowTransactionAgent6 - i3), WinterFlowTransactionAgent6);
        }
        this.WinterFlowUnitTestResponse -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int WinterFlowTransactionAgent;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.WinterFlowTransactionManagerStrategy.length != 0) {
            int WinterFlowTransactionAgent2 = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
            int i = this.WinterFlowVariableVersionControl;
            if (i < WinterFlowTransactionAgent2) {
                WinterFlowTransactionAgent = i;
                while (true) {
                    objArr = this.WinterFlowTransactionManagerStrategy;
                    if (i >= WinterFlowTransactionAgent2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent] = obj;
                        WinterFlowTransactionAgent++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, WinterFlowTransactionAgent, WinterFlowTransactionAgent2, (Object) null);
            } else {
                int length = this.WinterFlowTransactionManagerStrategy.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.WinterFlowTransactionManagerStrategy[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                WinterFlowTransactionAgent = WinterFlowTransactionAgent(i2);
                for (int i3 = 0; i3 < WinterFlowTransactionAgent2; i3++) {
                    Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.WinterFlowTransactionManagerStrategy[WinterFlowTransactionAgent] = obj3;
                        WinterFlowTransactionAgent = WinterFlowUnitTestResponse(WinterFlowTransactionAgent);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                WinterFlowServerProtocol();
                this.WinterFlowUnitTestResponse = WinterFlowSyntax(WinterFlowTransactionAgent - this.WinterFlowVariableVersionControl);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse;
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
            return null;
        }
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowVariableVersionControl + i);
        Object[] objArr = this.WinterFlowTransactionManagerStrategy;
        Object obj2 = objArr[WinterFlowTransactionAgent];
        objArr[WinterFlowTransactionAgent] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.WinterFlowUnitTestResponse;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int WinterFlowTransactionAgent = WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl);
        int i2 = this.WinterFlowVariableVersionControl;
        if (i2 < WinterFlowTransactionAgent) {
            WinterFlowProtocolPipeline.WinterFlowQueueService(this.WinterFlowTransactionManagerStrategy, objArr, i2, WinterFlowTransactionAgent, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, objArr, 0, this.WinterFlowVariableVersionControl, objArr2.length);
            Object[] objArr3 = this.WinterFlowTransactionManagerStrategy;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, objArr, objArr3.length - this.WinterFlowVariableVersionControl, 0, WinterFlowTransactionAgent);
        }
        int i3 = this.WinterFlowUnitTestResponse;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public WinterFlowOrchestrationValidator() {
        this.WinterFlowTransactionManagerStrategy = WinterFlowRouterRouter;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[WinterFlowRouterStructure()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        WinterFlowServerProtocol();
        WinterFlowVariableVersionControl(collection.size() + this.WinterFlowUnitTestResponse);
        WinterFlowArrayNetwork(WinterFlowTransactionAgent(this.WinterFlowUnitTestResponse + this.WinterFlowVariableVersionControl), collection);
        return true;
    }
}
