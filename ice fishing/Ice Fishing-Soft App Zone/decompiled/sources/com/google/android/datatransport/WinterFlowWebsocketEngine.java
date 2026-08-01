package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWebsocketEngine extends WinterFlowConcurrencyQueue {
    public final Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl = 0;

    public WinterFlowWebsocketEngine(List list) {
        list.getClass();
        this.WinterFlowTransactionManagerStrategy = list;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((WinterFlowStackProvider) obj).WinterFlowVariableVersionControl).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String group = ((Matcher) ((WinterFlowStackProvider) obj).WinterFlowVariableVersionControl).group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= WinterFlowUnitTestLibrary.WinterFlowSerializerStructure(this)) {
                    return list.get(WinterFlowUnitTestLibrary.WinterFlowSerializerStructure(this) - i);
                }
                StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Element index ", i, " must be in range [");
                WinterFlowThreadListener.append(new WinterFlowCacheManagerListener(0, WinterFlowUnitTestLibrary.WinterFlowSerializerStructure(this), 1));
                WinterFlowThreadListener.append("].");
                throw new IndexOutOfBoundsException(WinterFlowThreadListener.toString());
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return new WinterFlowClassController(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public ListIterator listIterator() {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return new WinterFlowClassController(this, 0);
            default:
                return super.listIterator();
        }
    }

    public WinterFlowWebsocketEngine(WinterFlowStackProvider winterFlowStackProvider) {
        this.WinterFlowTransactionManagerStrategy = winterFlowStackProvider;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.WinterFlowVariableVersionControl) {
            case 1:
                return new WinterFlowClassController(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
