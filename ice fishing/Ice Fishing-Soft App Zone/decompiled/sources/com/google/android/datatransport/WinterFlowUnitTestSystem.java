package com.google.android.datatransport;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestSystem extends WinterFlowParserRequest implements Map {
    public WinterFlowBandwidthNetwork WinterFlowResponseEngine;
    public WinterFlowParserCloud WinterFlowRouterRouter;
    public WinterFlowCloudDeployment WinterFlowSyntax;

    public final boolean WinterFlowResponseEngine(Collection collection) {
        int i = this.WinterFlowUnitTestResponse;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.WinterFlowUnitTestResponse;
    }

    public final boolean WinterFlowSyntax(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        WinterFlowParserCloud winterFlowParserCloud = this.WinterFlowRouterRouter;
        if (winterFlowParserCloud != null) {
            return winterFlowParserCloud;
        }
        WinterFlowParserCloud winterFlowParserCloud2 = new WinterFlowParserCloud(this, 0);
        this.WinterFlowRouterRouter = winterFlowParserCloud2;
        return winterFlowParserCloud2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        WinterFlowCloudDeployment winterFlowCloudDeployment = this.WinterFlowSyntax;
        if (winterFlowCloudDeployment != null) {
            return winterFlowCloudDeployment;
        }
        WinterFlowCloudDeployment winterFlowCloudDeployment2 = new WinterFlowCloudDeployment(this);
        this.WinterFlowSyntax = winterFlowCloudDeployment2;
        return winterFlowCloudDeployment2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.WinterFlowUnitTestResponse;
        int i = this.WinterFlowUnitTestResponse;
        int[] iArr = this.WinterFlowVariableVersionControl;
        if (iArr.length < size) {
            this.WinterFlowVariableVersionControl = Arrays.copyOf(iArr, size);
            this.WinterFlowTransactionManagerStrategy = Arrays.copyOf(this.WinterFlowTransactionManagerStrategy, size * 2);
        }
        if (this.WinterFlowUnitTestResponse != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        WinterFlowBandwidthNetwork winterFlowBandwidthNetwork = this.WinterFlowResponseEngine;
        if (winterFlowBandwidthNetwork != null) {
            return winterFlowBandwidthNetwork;
        }
        WinterFlowBandwidthNetwork winterFlowBandwidthNetwork2 = new WinterFlowBandwidthNetwork(this);
        this.WinterFlowResponseEngine = winterFlowBandwidthNetwork2;
        return winterFlowBandwidthNetwork2;
    }
}
