package com.google.android.datatransport;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowExceptionComponent extends WinterFlowParserThread {
    public static final WinterFlowExceptionComponent WinterFlowTransactionManagerStrategy = new WinterFlowExceptionComponent(new Object[0]);
    public final Object[] WinterFlowVariableVersionControl;

    public WinterFlowExceptionComponent(Object[] objArr) {
        this.WinterFlowVariableVersionControl = objArr;
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowArrayNetwork(Object obj) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new WinterFlowExceptionComponent(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new WinterFlowJSONParser(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowCacheManagerAgent(int i, Object obj) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, objArr.length);
        if (i == objArr.length) {
            return WinterFlowArrayNetwork(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, objArr2, 0, i, 6);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new WinterFlowExceptionComponent(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new WinterFlowJSONParser(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowRouterRouter(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, objArr.length);
        if (objArr.length == 1) {
            return WinterFlowTransactionManagerStrategy;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, copyOf, i, i + 1, objArr.length);
        return new WinterFlowExceptionComponent(copyOf);
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl.length;
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowSyntax(int i, Object obj) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new WinterFlowExceptionComponent(copyOf);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowDataSourceController WinterFlowTransactionManagerStrategy() {
        return new WinterFlowDataSourceController(this, null, this.WinterFlowVariableVersionControl, 0);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowUnitTestResponse(WinterFlowManagerCache winterFlowManagerCache) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) winterFlowManagerCache.WinterFlowUnitTestResponse(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? WinterFlowTransactionManagerStrategy : new WinterFlowExceptionComponent(WinterFlowProtocolPipeline.WinterFlowCacheTool(objArr2, 0, length));
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowVariableVersionControl(Collection collection) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        if (collection.size() + objArr.length > 32) {
            WinterFlowDataSourceController WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy();
            WinterFlowTransactionManagerStrategy2.addAll(collection);
            return WinterFlowTransactionManagerStrategy2.WinterFlowArrayNetwork();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new WinterFlowExceptionComponent(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, objArr.length);
        return objArr[i];
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final int indexOf(Object obj) {
        return WinterFlowProtocolPipeline.WinterFlowFrameworkTransaction(this.WinterFlowVariableVersionControl, obj);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, objArr.length);
        return new WinterFlowClassFramework(objArr, i, objArr.length);
    }
}
