package android.content.Context;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAccelerometerNeoAurora1913 extends FrostHunterContentResolverMasterTitan6007 {
    public static final Object[] FrostHunterKeyframeGammaGamma1197 = new Object[0];
    public int FrostHunterAlertDialogAuroraDelta3200;
    public int FrostHunterCameraXPixelTurboCosmos9814;
    public Object[] FrostHunterFlowMaxDragonHero5809 = FrostHunterKeyframeGammaGamma1197;

    public final void FrostHunterAlertDialogAuroraDelta3200() {
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.Context.FrostHunterContentResolverMasterTitan6007
    public final int FrostHunterAlphaAnimationNeoCosmos5761() {
        return this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // android.content.Context.FrostHunterContentResolverMasterTitan6007
    public final Object FrostHunterBundlePulseFusionHero2475(int i) {
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0 || i >= i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == FrostHunterAlphaAnimationNeoCosmos5761() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        FrostHunterAlertDialogAuroraDelta3200();
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = objArr[FrostHunterFlowMaxDragonHero5809];
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200 >> 1;
        int i4 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i < i3) {
            if (FrostHunterFlowMaxDragonHero5809 >= i4) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i4 + 1, i4, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(1, 0, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
                Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.FrostHunterCameraXPixelTurboCosmos9814;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
            int i6 = this.FrostHunterCameraXPixelTurboCosmos9814;
            objArr3[i6] = null;
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterLevelListDrawableFusionDragonHero2232(i6);
        } else {
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809((FrostHunterAlphaAnimationNeoCosmos5761() - 1) + i4);
            Object[] objArr4 = this.FrostHunterFlowMaxDragonHero5809;
            if (FrostHunterFlowMaxDragonHero5809 <= FrostHunterFlowMaxDragonHero58092) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero5809 + 1, FrostHunterFlowMaxDragonHero58092 + 1, objArr4, objArr4);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero5809 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.FrostHunterFlowMaxDragonHero5809;
                objArr5[objArr5.length - 1] = objArr5[0];
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 1, FrostHunterFlowMaxDragonHero58092 + 1, objArr5, objArr5);
            }
            this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero58092] = null;
        }
        this.FrostHunterAlertDialogAuroraDelta3200--;
        return obj;
    }

    public final void FrostHunterCameraXPixelTurboCosmos9814(int i, int i2) {
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (i < i2) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(this.FrostHunterFlowMaxDragonHero5809, 0, i2);
        }
    }

    public final int FrostHunterFlowMaxDragonHero5809(int i) {
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final int FrostHunterLevelListDrawableFusionDragonHero2232(int i) {
        this.FrostHunterFlowMaxDragonHero5809.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void FrostHunterLifecycleBlazeGammaElite2889(int i) {
        if (i < 0) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Deque is too big.");
            return;
        }
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == FrostHunterKeyframeGammaGamma1197) {
            if (i < 10) {
                i = 10;
            }
            this.FrostHunterFlowMaxDragonHero5809 = new Object[i];
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
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, this.FrostHunterCameraXPixelTurboCosmos9814, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
        int length2 = objArr3.length;
        int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(length2 - i3, 0, i3, objArr3, objArr2);
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        this.FrostHunterFlowMaxDragonHero5809 = objArr2;
    }

    public final int FrostHunterRemoteConfigSpeedSpeed8566(int i) {
        return i < 0 ? i + this.FrostHunterFlowMaxDragonHero5809.length : i;
    }

    public final void FrostHunterServiceEliteCelestialThunder1757(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.FrostHunterFlowMaxDragonHero5809.length;
        while (i < length && it.hasNext()) {
            this.FrostHunterFlowMaxDragonHero5809[i] = it.next();
            i++;
        }
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.FrostHunterFlowMaxDragonHero5809[i3] = it.next();
        }
        this.FrostHunterAlertDialogAuroraDelta3200 = collection.size() + this.FrostHunterAlertDialogAuroraDelta3200;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0 || i > i3) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i3, "index: ", ", size: "));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlertDialogAuroraDelta3200 + 1);
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i);
        int i4 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < ((i4 + 1) >> 1)) {
            if (FrostHunterFlowMaxDragonHero5809 == 0) {
                Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = FrostHunterFlowMaxDragonHero5809 - 1;
            }
            int i5 = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i5 == 0) {
                Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.FrostHunterCameraXPixelTurboCosmos9814;
            Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i7, i7 + 1, i2 + 1, objArr3, objArr3);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i7 - 1, i7, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.FrostHunterFlowMaxDragonHero5809;
                objArr4[objArr4.length - 1] = objArr4[0];
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, 1, i2 + 1, objArr4, objArr4);
            }
            this.FrostHunterFlowMaxDragonHero5809[i2] = obj;
            this.FrostHunterCameraXPixelTurboCosmos9814 = i6;
        } else {
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(i4 + this.FrostHunterCameraXPixelTurboCosmos9814);
            Object[] objArr5 = this.FrostHunterFlowMaxDragonHero5809;
            if (FrostHunterFlowMaxDragonHero5809 < FrostHunterFlowMaxDragonHero58092) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFlowMaxDragonHero5809 + 1, FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero58092, objArr5, objArr5);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(1, 0, FrostHunterFlowMaxDragonHero58092, objArr5, objArr5);
                Object[] objArr6 = this.FrostHunterFlowMaxDragonHero5809;
                objArr6[0] = objArr6[objArr6.length - 1];
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFlowMaxDragonHero5809 + 1, FrostHunterFlowMaxDragonHero5809, objArr6.length - 1, objArr6, objArr6);
            }
            this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809] = obj;
        }
        this.FrostHunterAlertDialogAuroraDelta3200++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i < 0 || i > i2) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.FrostHunterAlertDialogAuroraDelta3200) {
            return addAll(collection);
        }
        FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterLifecycleBlazeGammaElite2889(collection.size() + this.FrostHunterAlertDialogAuroraDelta3200);
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
        int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i);
        int size = collection.size();
        if (i >= ((this.FrostHunterAlertDialogAuroraDelta3200 + 1) >> 1)) {
            int i3 = FrostHunterFlowMaxDragonHero58092 + size;
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            if (FrostHunterFlowMaxDragonHero58092 < FrostHunterFlowMaxDragonHero5809) {
                int i4 = size + FrostHunterFlowMaxDragonHero5809;
                if (i4 <= objArr.length) {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3, FrostHunterFlowMaxDragonHero58092, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3 - objArr.length, FrostHunterFlowMaxDragonHero58092, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
                } else {
                    int length = FrostHunterFlowMaxDragonHero5809 - (i4 - objArr.length);
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, length, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
                    Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3, FrostHunterFlowMaxDragonHero58092, length, objArr2, objArr2);
                }
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(size, 0, FrostHunterFlowMaxDragonHero5809, objArr, objArr);
                Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
                if (i3 >= objArr3.length) {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3 - objArr3.length, FrostHunterFlowMaxDragonHero58092, objArr3.length, objArr3, objArr3);
                } else {
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.FrostHunterFlowMaxDragonHero5809;
                    FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i3, FrostHunterFlowMaxDragonHero58092, objArr4.length - size, objArr4, objArr4);
                }
            }
            FrostHunterServiceEliteCelestialThunder1757(FrostHunterFlowMaxDragonHero58092, collection);
            return true;
        }
        int i5 = this.FrostHunterCameraXPixelTurboCosmos9814;
        int i6 = i5 - size;
        Object[] objArr5 = this.FrostHunterFlowMaxDragonHero5809;
        if (FrostHunterFlowMaxDragonHero58092 < i5) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i6, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.FrostHunterFlowMaxDragonHero5809;
            if (size >= FrostHunterFlowMaxDragonHero58092) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(objArr6.length - size, 0, FrostHunterFlowMaxDragonHero58092, objArr6, objArr6);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, size, FrostHunterFlowMaxDragonHero58092, objArr7, objArr7);
            }
        } else if (i6 >= 0) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i6, i5, FrostHunterFlowMaxDragonHero58092, objArr5, objArr5);
        } else {
            i6 += objArr5.length;
            int i7 = FrostHunterFlowMaxDragonHero58092 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i6, i5, FrostHunterFlowMaxDragonHero58092, objArr5, objArr5);
            } else {
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i6, i5, i5 + length2, objArr5, objArr5);
                Object[] objArr8 = this.FrostHunterFlowMaxDragonHero5809;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, this.FrostHunterCameraXPixelTurboCosmos9814 + length2, FrostHunterFlowMaxDragonHero58092, objArr8, objArr8);
            }
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = i6;
        FrostHunterServiceEliteCelestialThunder1757(FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero58092 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterLifecycleBlazeGammaElite2889(this.FrostHunterAlertDialogAuroraDelta3200 + 1);
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i == 0) {
            Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.FrostHunterCameraXPixelTurboCosmos9814 = i2;
        this.FrostHunterFlowMaxDragonHero5809[i2] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200++;
    }

    public final void addLast(Object obj) {
        FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterLifecycleBlazeGammaElite2889(FrostHunterAlphaAnimationNeoCosmos5761() + 1);
        this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809(FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterCameraXPixelTurboCosmos9814)] = obj;
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlphaAnimationNeoCosmos5761() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            FrostHunterAlertDialogAuroraDelta3200();
            FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterFlowMaxDragonHero5809(FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterCameraXPixelTurboCosmos9814));
        }
        this.FrostHunterCameraXPixelTurboCosmos9814 = 0;
        this.FrostHunterAlertDialogAuroraDelta3200 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        if (i >= 0 && i < FrostHunterAlphaAnimationNeoCosmos5761) {
            return this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i)];
        }
        FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, FrostHunterAlphaAnimationNeoCosmos5761, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterCameraXPixelTurboCosmos9814);
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 < FrostHunterFlowMaxDragonHero5809) {
            while (i2 < FrostHunterFlowMaxDragonHero5809) {
                if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[i2])) {
                    i = this.FrostHunterCameraXPixelTurboCosmos9814;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.FrostHunterCameraXPixelTurboCosmos9814) < FrostHunterFlowMaxDragonHero5809) {
            return -1;
        }
        int length = this.FrostHunterFlowMaxDragonHero5809.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < FrostHunterFlowMaxDragonHero5809; i3++) {
                    if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[i3])) {
                        i2 = i3 + this.FrostHunterFlowMaxDragonHero5809.length;
                        i = this.FrostHunterCameraXPixelTurboCosmos9814;
                    }
                }
                return -1;
            }
            if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[i2])) {
                i = this.FrostHunterCameraXPixelTurboCosmos9814;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return FrostHunterAlphaAnimationNeoCosmos5761() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809((size() - 1) + this.FrostHunterCameraXPixelTurboCosmos9814)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 < FrostHunterFlowMaxDragonHero5809) {
            length = FrostHunterFlowMaxDragonHero5809 - 1;
            if (i2 <= length) {
                while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.FrostHunterCameraXPixelTurboCosmos9814;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.FrostHunterCameraXPixelTurboCosmos9814 >= FrostHunterFlowMaxDragonHero5809) {
            while (true) {
                FrostHunterFlowMaxDragonHero5809--;
                Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
                if (-1 >= FrostHunterFlowMaxDragonHero5809) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.FrostHunterCameraXPixelTurboCosmos9814;
                    if (i3 <= length) {
                        while (!FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, this.FrostHunterFlowMaxDragonHero5809[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.FrostHunterCameraXPixelTurboCosmos9814;
                    }
                } else if (FrostHunterDrawerLayoutUltraStrike3303.FrostHunterLightSensorForceFusion4241(obj, objArr[FrostHunterFlowMaxDragonHero5809])) {
                    length = FrostHunterFlowMaxDragonHero5809 + this.FrostHunterFlowMaxDragonHero5809.length;
                    i = this.FrostHunterCameraXPixelTurboCosmos9814;
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
        FrostHunterBundlePulseFusionHero2475(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int FrostHunterFlowMaxDragonHero5809;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.FrostHunterFlowMaxDragonHero5809.length != 0) {
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
            int i = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i < FrostHunterFlowMaxDragonHero58092) {
                FrostHunterFlowMaxDragonHero5809 = i;
                while (true) {
                    objArr = this.FrostHunterFlowMaxDragonHero5809;
                    if (i >= FrostHunterFlowMaxDragonHero58092) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809] = obj;
                        FrostHunterFlowMaxDragonHero5809++;
                    }
                    i++;
                }
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(objArr, FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero58092);
            } else {
                int length = this.FrostHunterFlowMaxDragonHero5809.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.FrostHunterFlowMaxDragonHero5809[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(i2);
                for (int i3 = 0; i3 < FrostHunterFlowMaxDragonHero58092; i3++) {
                    Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809] = obj3;
                        FrostHunterFlowMaxDragonHero5809 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFlowMaxDragonHero5809);
                    }
                }
                z = z2;
            }
            if (z) {
                FrostHunterAlertDialogAuroraDelta3200();
                this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero5809 - this.FrostHunterCameraXPixelTurboCosmos9814);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        FrostHunterAlertDialogAuroraDelta3200();
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = objArr[i];
        objArr[i] = null;
        this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterLevelListDrawableFusionDragonHero2232(i);
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlphaAnimationNeoCosmos5761() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        FrostHunterAlertDialogAuroraDelta3200();
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809((size() - 1) + this.FrostHunterCameraXPixelTurboCosmos9814);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj = objArr[FrostHunterFlowMaxDragonHero5809];
        objArr[FrostHunterFlowMaxDragonHero5809] = null;
        this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterAlphaAnimationNeoCosmos5761() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        FrostHunterCanvasInfernoVortex4700.FrostHunterCardViewSpectraCyber7714(i, i2, this.FrostHunterAlertDialogAuroraDelta3200);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.FrostHunterAlertDialogAuroraDelta3200) {
            clear();
            return;
        }
        if (i3 == 1) {
            FrostHunterBundlePulseFusionHero2475(i);
            return;
        }
        FrostHunterAlertDialogAuroraDelta3200();
        int i4 = this.FrostHunterAlertDialogAuroraDelta3200 - i2;
        int i5 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i < i4) {
            int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809((i - 1) + i5);
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + (i2 - 1));
            while (i > 0) {
                int i6 = FrostHunterFlowMaxDragonHero5809 + 1;
                int min = Math.min(i, Math.min(i6, FrostHunterFlowMaxDragonHero58092 + 1));
                Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
                int i7 = FrostHunterFlowMaxDragonHero58092 - min;
                int i8 = FrostHunterFlowMaxDragonHero5809 - min;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(i7 + 1, i8 + 1, i6, objArr, objArr);
                FrostHunterFlowMaxDragonHero5809 = FrostHunterRemoteConfigSpeedSpeed8566(i8);
                FrostHunterFlowMaxDragonHero58092 = FrostHunterRemoteConfigSpeedSpeed8566(i7);
                i -= min;
            }
            int FrostHunterFlowMaxDragonHero58093 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i3);
            FrostHunterCameraXPixelTurboCosmos9814(this.FrostHunterCameraXPixelTurboCosmos9814, FrostHunterFlowMaxDragonHero58093);
            this.FrostHunterCameraXPixelTurboCosmos9814 = FrostHunterFlowMaxDragonHero58093;
        } else {
            int FrostHunterFlowMaxDragonHero58094 = FrostHunterFlowMaxDragonHero5809(i5 + i2);
            int FrostHunterFlowMaxDragonHero58095 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i);
            int i9 = this.FrostHunterAlertDialogAuroraDelta3200;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                i2 = Math.min(i9, Math.min(objArr2.length - FrostHunterFlowMaxDragonHero58094, objArr2.length - FrostHunterFlowMaxDragonHero58095));
                Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
                int i10 = FrostHunterFlowMaxDragonHero58094 + i2;
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(FrostHunterFlowMaxDragonHero58095, FrostHunterFlowMaxDragonHero58094, i10, objArr3, objArr3);
                FrostHunterFlowMaxDragonHero58094 = FrostHunterFlowMaxDragonHero5809(i10);
                FrostHunterFlowMaxDragonHero58095 = FrostHunterFlowMaxDragonHero5809(FrostHunterFlowMaxDragonHero58095 + i2);
            }
            int FrostHunterFlowMaxDragonHero58096 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
            FrostHunterCameraXPixelTurboCosmos9814(FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero58096 - i3), FrostHunterFlowMaxDragonHero58096);
        }
        this.FrostHunterAlertDialogAuroraDelta3200 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int FrostHunterFlowMaxDragonHero5809;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.FrostHunterFlowMaxDragonHero5809.length != 0) {
            int FrostHunterFlowMaxDragonHero58092 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
            int i = this.FrostHunterCameraXPixelTurboCosmos9814;
            if (i < FrostHunterFlowMaxDragonHero58092) {
                FrostHunterFlowMaxDragonHero5809 = i;
                while (true) {
                    objArr = this.FrostHunterFlowMaxDragonHero5809;
                    if (i >= FrostHunterFlowMaxDragonHero58092) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809] = obj;
                        FrostHunterFlowMaxDragonHero5809++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                FrostHunterContextSolarMegaPhantom7469.FrostHunterNavigationViewMasterVortexBeta1295(objArr, FrostHunterFlowMaxDragonHero5809, FrostHunterFlowMaxDragonHero58092);
            } else {
                int length = this.FrostHunterFlowMaxDragonHero5809.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.FrostHunterFlowMaxDragonHero5809[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(i2);
                for (int i3 = 0; i3 < FrostHunterFlowMaxDragonHero58092; i3++) {
                    Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.FrostHunterFlowMaxDragonHero5809[FrostHunterFlowMaxDragonHero5809] = obj3;
                        FrostHunterFlowMaxDragonHero5809 = FrostHunterLevelListDrawableFusionDragonHero2232(FrostHunterFlowMaxDragonHero5809);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                FrostHunterAlertDialogAuroraDelta3200();
                this.FrostHunterAlertDialogAuroraDelta3200 = FrostHunterRemoteConfigSpeedSpeed8566(FrostHunterFlowMaxDragonHero5809 - this.FrostHunterCameraXPixelTurboCosmos9814);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761();
        if (i < 0 || i >= FrostHunterAlphaAnimationNeoCosmos5761) {
            FrostHunterInputMethodManagerOmegaNovaX6073.FrostHunterLifecycleBlazeGammaElite2889(FrostHunterKeyEventNovaXAlpha1220.FrostHunterRemoteConfigSpeedSpeed8566(i, FrostHunterAlphaAnimationNeoCosmos5761, "index: ", ", size: "));
            return null;
        }
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterCameraXPixelTurboCosmos9814 + i);
        Object[] objArr = this.FrostHunterFlowMaxDragonHero5809;
        Object obj2 = objArr[FrostHunterFlowMaxDragonHero5809];
        objArr[FrostHunterFlowMaxDragonHero5809] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.FrostHunterAlertDialogAuroraDelta3200;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int FrostHunterFlowMaxDragonHero5809 = FrostHunterFlowMaxDragonHero5809(this.FrostHunterAlertDialogAuroraDelta3200 + this.FrostHunterCameraXPixelTurboCosmos9814);
        int i2 = this.FrostHunterCameraXPixelTurboCosmos9814;
        if (i2 < FrostHunterFlowMaxDragonHero5809) {
            FrostHunterContextSolarMegaPhantom7469.FrostHunterViewPager2StrikePulse8790(i2, FrostHunterFlowMaxDragonHero5809, 2, this.FrostHunterFlowMaxDragonHero5809, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.FrostHunterFlowMaxDragonHero5809;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(0, this.FrostHunterCameraXPixelTurboCosmos9814, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.FrostHunterFlowMaxDragonHero5809;
            FrostHunterContextSolarMegaPhantom7469.FrostHunterNestedScrollViewPixelPhantom8605(objArr3.length - this.FrostHunterCameraXPixelTurboCosmos9814, 0, FrostHunterFlowMaxDragonHero5809, objArr3, objArr);
        }
        int i3 = this.FrostHunterAlertDialogAuroraDelta3200;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[FrostHunterAlphaAnimationNeoCosmos5761()]);
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
        FrostHunterAlertDialogAuroraDelta3200();
        FrostHunterLifecycleBlazeGammaElite2889(collection.size() + FrostHunterAlphaAnimationNeoCosmos5761());
        FrostHunterServiceEliteCelestialThunder1757(FrostHunterFlowMaxDragonHero5809(FrostHunterAlphaAnimationNeoCosmos5761() + this.FrostHunterCameraXPixelTurboCosmos9814), collection);
        return true;
    }
}
