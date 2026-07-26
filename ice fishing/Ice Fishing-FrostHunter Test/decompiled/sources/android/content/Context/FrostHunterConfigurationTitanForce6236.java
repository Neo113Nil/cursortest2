package android.content.Context;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConfigurationTitanForce6236 {
    public long FrostHunterAlphaAnimationNeoCosmos5761;
    public final SparseLongArray FrostHunterConstraintSetCloneMasterUltraRogue2633 = new SparseLongArray();
    public final SparseBooleanArray FrostHunterBundlePulseFusionHero2475 = new SparseBooleanArray();
    public final ArrayList FrostHunterServiceEliteCelestialThunder1757 = new ArrayList();
    public int FrostHunterLifecycleBlazeGammaElite2889 = -1;
    public int FrostHunterLevelListDrawableFusionDragonHero2232 = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterAlphaAnimationNeoCosmos5761(MotionEvent motionEvent, FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long FrostHunterMotionSceneAuroraMega2271;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long FrostHunterBillingClientFusionVortex9008;
        int toolType;
        int i3;
        int historySize;
        int i4;
        char c;
        long j4;
        char c2;
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        SparseBooleanArray sparseBooleanArray = this.FrostHunterBundlePulseFusionHero2475;
        int i6 = 3;
        if (actionMasked != 3) {
            int i7 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.FrostHunterLifecycleBlazeGammaElite2889 || source != this.FrostHunterLevelListDrawableFusionDragonHero2232) {
                        this.FrostHunterLifecycleBlazeGammaElite2889 = toolType2;
                        this.FrostHunterLevelListDrawableFusionDragonHero2232 = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j5 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                        this.FrostHunterAlphaAnimationNeoCosmos5761 = j5 + 1;
                        sparseLongArray.put(pointerId, j5);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j6 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                            j = 1;
                            this.FrostHunterAlphaAnimationNeoCosmos5761 = j6 + 1;
                            sparseLongArray.put(pointerId2, j6);
                        }
                    }
                    j = 1;
                }
                boolean z3 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z4 = actionMasked == 8;
                if (z3) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.FrostHunterServiceEliteCelestialThunder1757;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i8 = 0;
                while (i8 < pointerCount) {
                    boolean z5 = (z3 || i8 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i8);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z2 = z3;
                        z = z4;
                        j2 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z = z4;
                        long j7 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                        z2 = z3;
                        this.FrostHunterAlphaAnimationNeoCosmos5761 = j7 + j;
                        sparseLongArray.put(pointerId3, j7);
                        j2 = j7;
                    }
                    float pressure = motionEvent.getPressure(i8);
                    char c3 = ' ';
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i8)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i8)) << 32);
                    long FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterFirebaseVortexDeltaBlaze8413.FrostHunterAlphaAnimationNeoCosmos5761(i6, floatToRawIntBits2);
                    if (i8 == 0) {
                        floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        FrostHunterBillingClientFusionVortex9008 = frostHunterFilterSpectraTitan5298.FrostHunterBillingClientFusionVortex9008(floatToRawIntBits);
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        rawX = motionEvent.getRawX(i8);
                        rawY = motionEvent.getRawY(i8);
                        floatToRawIntBits = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                        FrostHunterBillingClientFusionVortex9008 = frostHunterFilterSpectraTitan5298.FrostHunterBillingClientFusionVortex9008(floatToRawIntBits);
                    } else {
                        j3 = floatToRawIntBits2;
                        FrostHunterMotionSceneAuroraMega2271 = frostHunterFilterSpectraTitan5298.FrostHunterMotionSceneAuroraMega2271(floatToRawIntBits2);
                        toolType = motionEvent.getToolType(i8);
                        if (toolType != 0) {
                            if (toolType == 1) {
                                i3 = 1;
                            } else if (toolType == 2) {
                                i3 = i6;
                            } else if (toolType == i6) {
                                i3 = 2;
                            } else if (toolType == i7) {
                                i3 = i7;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i4 = 0;
                            while (i4 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i8, i4);
                                float historicalY = motionEvent.getHistoricalY(i8, i4);
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    c2 = c3;
                                    i5 = pointerCount;
                                } else {
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(historicalX);
                                    int floatToRawIntBits4 = Float.floatToRawIntBits(historicalY);
                                    c2 = c3;
                                    i5 = pointerCount;
                                    long j8 = (floatToRawIntBits3 << c2) | (floatToRawIntBits4 & 4294967295L);
                                    arrayList2.add(new FrostHunterAdMobTitanSpectraLegend8998(motionEvent.getHistoricalEventTime(i4), j8, j8));
                                }
                                i4++;
                                c3 = c2;
                                pointerCount = i5;
                            }
                            char c4 = c3;
                            int i9 = pointerCount;
                            if (motionEvent.getActionMasked() == 8) {
                                c = '\t';
                                j4 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c4);
                            } else {
                                c = '\t';
                                j4 = 0;
                            }
                            arrayList.add(new FrostHunterLightSensorRogueRogue1683(j2, motionEvent.getEventTime(), FrostHunterMotionSceneAuroraMega2271, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList2, j4, FrostHunterAlphaAnimationNeoCosmos5761));
                            i8++;
                            z4 = z;
                            z3 = z2;
                            pointerCount = i9;
                            i6 = 3;
                            i7 = 4;
                        }
                        i3 = 0;
                        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i4 = 0;
                        while (i4 < historySize) {
                        }
                        char c42 = c3;
                        int i92 = pointerCount;
                        if (motionEvent.getActionMasked() == 8) {
                        }
                        arrayList.add(new FrostHunterLightSensorRogueRogue1683(j2, motionEvent.getEventTime(), FrostHunterMotionSceneAuroraMega2271, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList22, j4, FrostHunterAlphaAnimationNeoCosmos5761));
                        i8++;
                        z4 = z;
                        z3 = z2;
                        pointerCount = i92;
                        i6 = 3;
                        i7 = 4;
                    }
                    FrostHunterMotionSceneAuroraMega2271 = floatToRawIntBits;
                    j3 = FrostHunterBillingClientFusionVortex9008;
                    toolType = motionEvent.getToolType(i8);
                    if (toolType != 0) {
                    }
                    i3 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                    }
                    char c422 = c3;
                    int i922 = pointerCount;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new FrostHunterLightSensorRogueRogue1683(j2, motionEvent.getEventTime(), FrostHunterMotionSceneAuroraMega2271, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList222, j4, FrostHunterAlphaAnimationNeoCosmos5761));
                    i8++;
                    z4 = z;
                    z3 = z2;
                    pointerCount = i922;
                    i6 = 3;
                    i7 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i2 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i2 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i10) == keyAt) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new FrostHunterKotlinQuantumRogue5892(16, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
