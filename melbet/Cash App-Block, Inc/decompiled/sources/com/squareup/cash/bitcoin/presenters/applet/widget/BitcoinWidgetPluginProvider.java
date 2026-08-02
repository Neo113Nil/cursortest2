package com.squareup.cash.bitcoin.presenters.applet.widget;

import androidx.compose.ui.text.android.CanvasCompatQ;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeState;
import com.squareup.cash.bitcoin.viewmodels.applet.widget.BitcoinWidget;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinWidgetPluginProvider extends CanvasCompatQ {
    public final Map plugins;
    public BitcoinHomeState state;
    public final LinkedHashMap widgets;

    public BitcoinWidgetPluginProvider(Map map) {
        this.plugins = map;
        Set<Map.Entry> entrySet = map.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((BitcoinWidgetPlugin) entry.getValue(), (BitcoinWidget) entry.getKey());
        }
        this.widgets = linkedHashMap;
    }

    @Override // androidx.compose.ui.text.android.CanvasCompatQ
    public final List getCapabilities() {
        BitcoinHomeState bitcoinHomeState = this.state;
        if (bitcoinHomeState == null) {
            a$$ExternalSyntheticBUOutline0.m$1("state needs to be set before calling availableCapabilities()");
            return null;
        }
        List<BitcoinWidget> placements = bitcoinHomeState.getPlacements();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(placements, 10));
        for (BitcoinWidget bitcoinWidget : placements) {
            Object obj = this.plugins.get(bitcoinWidget);
            if (obj == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(bitcoinWidget, "no plugin found for ");
                return null;
            }
            arrayList.add((BitcoinWidgetPlugin) obj);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable getWidgetToPluginMap(ContinuationImpl continuationImpl) {
        BitcoinWidgetPluginProvider$getWidgetToPluginMap$1 bitcoinWidgetPluginProvider$getWidgetToPluginMap$1;
        int i;
        int mapCapacity;
        if (continuationImpl instanceof BitcoinWidgetPluginProvider$getWidgetToPluginMap$1) {
            bitcoinWidgetPluginProvider$getWidgetToPluginMap$1 = (BitcoinWidgetPluginProvider$getWidgetToPluginMap$1) continuationImpl;
            int i2 = bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.label = 1;
                    obj = availableCapabilities(bitcoinWidgetPluginProvider$getWidgetToPluginMap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj2 : iterable) {
                    Object obj3 = this.widgets.get((BitcoinWidgetPlugin) obj2);
                    obj3.getClass();
                    linkedHashMap.put((BitcoinWidget) obj3, obj2);
                }
                return linkedHashMap;
            }
        }
        bitcoinWidgetPluginProvider$getWidgetToPluginMap$1 = new BitcoinWidgetPluginProvider$getWidgetToPluginMap$1(this, continuationImpl);
        Object obj4 = bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinWidgetPluginProvider$getWidgetToPluginMap$1.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj4;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        if (mapCapacity < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
        while (r5.hasNext()) {
        }
        return linkedHashMap2;
    }
}
