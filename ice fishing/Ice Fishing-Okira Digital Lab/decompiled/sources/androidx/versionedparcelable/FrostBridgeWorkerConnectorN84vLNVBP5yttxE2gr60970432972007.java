package androidx.versionedparcelable;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 {
    public long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final SparseLongArray AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new SparseLongArray();
    public final SparseBooleanArray ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new SparseBooleanArray();
    public final ArrayList RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new ArrayList();
    public final MysticCacheHandlerTranspilerEG3Fnb1JXy4ALn8Zfb12171932584638 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = new MysticCacheHandlerTranspilerEG3Fnb1JXy4ALn8Zfb12171932584638();
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = -1;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = -1;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(MotionEvent motionEvent, HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) {
        boolean z;
        boolean z2;
        long j;
        float f;
        long j2;
        long UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541;
        float rawX;
        float rawY;
        long NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252;
        int toolType;
        int i;
        int historySize;
        int i2;
        char c;
        long j3;
        int i3;
        FrostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 = this;
        HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921 heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        SparseBooleanArray sparseBooleanArray = frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i4 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(motionEvent);
        ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(motionEvent);
        boolean z3 = true;
        boolean z4 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z5 = actionMasked == 8;
        if (z4) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            boolean z6 = (z4 || i5 == actionIndex || (z5 && motionEvent.getButtonState() == 0)) ? false : z3;
            int pointerId = motionEvent.getPointerId(i5);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (indexOfKey >= 0) {
                j = sparseLongArray.valueAt(indexOfKey);
                z = z4;
                z2 = z5;
            } else {
                z = z4;
                long j4 = frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                z2 = z5;
                frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j4 + 1;
                sparseLongArray.put(pointerId, j4);
                j = j4;
            }
            float pressure = motionEvent.getPressure(i5);
            char c2 = ' ';
            long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i5)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i5)) << 32);
            long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(floatToRawIntBits, 0.0f, i4);
            if (i5 == 0) {
                f = 0.0f;
                UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541);
            } else {
                f = 0.0f;
                if (Build.VERSION.SDK_INT >= 29) {
                    rawX = motionEvent.getRawX(i5);
                    rawY = motionEvent.getRawY(i5);
                    UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                    NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212.NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252(UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541);
                } else {
                    j2 = floatToRawIntBits;
                    UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212.UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541(floatToRawIntBits);
                    toolType = motionEvent.getToolType(i5);
                    if (toolType != 0) {
                        if (toolType == 1) {
                            i = 1;
                        } else if (toolType == 2) {
                            i = i4;
                        } else if (toolType == i4) {
                            i = 2;
                        } else if (toolType == 4) {
                            i = 4;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i2 = 0;
                        while (i2 < historySize) {
                            float historicalX = motionEvent.getHistoricalX(i5, i2);
                            float historicalY = motionEvent.getHistoricalY(i5, i2);
                            char c3 = c2;
                            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                i3 = actionIndex;
                            } else {
                                i3 = actionIndex;
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(historicalX) << c3) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                                arrayList2.add(new JadeCircuitContextResolverA0hcyiaqtaQ2cFRmqO33905895439569(motionEvent.getHistoricalEventTime(i2), floatToRawIntBits2, floatToRawIntBits2));
                            }
                            i2++;
                            c2 = c3;
                            actionIndex = i3;
                        }
                        int i6 = actionIndex;
                        char c4 = c2;
                        if (motionEvent.getActionMasked() == 8) {
                            c = '\n';
                            j3 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c4);
                        } else {
                            c = '\n';
                            j3 = 0;
                        }
                        arrayList.add(new EmeraldStackDebuggerResolverLKqfoVdeQthY1l68gf71833324300530(j, motionEvent.getEventTime(), UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541, j2, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList2, j3, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
                        i5++;
                        i4 = 3;
                        z3 = true;
                        heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921;
                        z4 = z;
                        z5 = z2;
                        actionIndex = i6;
                        frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 = this;
                    }
                    i = 0;
                    ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i2 = 0;
                    while (i2 < historySize) {
                    }
                    int i62 = actionIndex;
                    char c42 = c2;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new EmeraldStackDebuggerResolverLKqfoVdeQthY1l68gf71833324300530(j, motionEvent.getEventTime(), UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541, j2, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList22, j3, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
                    i5++;
                    i4 = 3;
                    z3 = true;
                    heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921;
                    z4 = z;
                    z5 = z2;
                    actionIndex = i62;
                    frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 = this;
                }
            }
            j2 = NovaLayerDispatcherOperatorPkAY8ekEx8EllmnWxj37608534497252;
            toolType = motionEvent.getToolType(i5);
            if (toolType != 0) {
            }
            i = 0;
            ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i2 = 0;
            while (i2 < historySize) {
            }
            int i622 = actionIndex;
            char c422 = c2;
            if (motionEvent.getActionMasked() == 8) {
            }
            arrayList.add(new EmeraldStackDebuggerResolverLKqfoVdeQthY1l68gf71833324300530(j, motionEvent.getEventTime(), UltraBufferFunctionRuntimeRG2tUFUKPrWlc8CAHo98803165999541, j2, z6, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList222, j3, ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800));
            i5++;
            i4 = 3;
            z3 = true;
            heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj362360820949212 = heliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921;
            z4 = z;
            z5 = z2;
            actionIndex = i622;
            frostBridgeWorkerConnectorN84vLNVBP5yttxE2gr60970432972007 = this;
        }
        RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(motionEvent);
        motionEvent.getEventTime();
        return new YellowLoopResourceWildcardKo7bCI6FbmFR8NbZLA16849417760412(27, arrayList, motionEvent);
    }

    public final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 && source == this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) {
            return;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = toolType;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = source;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.clear();
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.clear();
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.put(pointerId2, true);
            }
        }
    }

    public final void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        SparseLongArray sparseLongArray = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
