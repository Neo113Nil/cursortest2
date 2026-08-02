package com.squareup.cash.composeUi.foundation.text;

import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.ui.unit.Density;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    public final /* synthetic */ Density $$delegate_0;
    public boolean isCanceled;
    public boolean isReleased;
    public final MutexImpl mutex;

    public PressGestureScopeImpl(Density density) {
        density.getClass();
        this.$$delegate_0 = density;
        this.mutex = new MutexImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitRelease(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$awaitRelease$1 pressGestureScopeImpl$awaitRelease$1;
        Object obj;
        int i;
        if (continuationImpl instanceof PressGestureScopeImpl$awaitRelease$1) {
            pressGestureScopeImpl$awaitRelease$1 = (PressGestureScopeImpl$awaitRelease$1) continuationImpl;
            int i2 = pressGestureScopeImpl$awaitRelease$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pressGestureScopeImpl$awaitRelease$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = pressGestureScopeImpl$awaitRelease$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pressGestureScopeImpl$awaitRelease$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    pressGestureScopeImpl$awaitRelease$1.label = 1;
                    obj = tryAwaitRelease(pressGestureScopeImpl$awaitRelease$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new GestureCancellationException("The press gesture was canceled.");
                }
                return Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$awaitRelease$1 = new PressGestureScopeImpl$awaitRelease$1(this, continuationImpl);
        obj = pressGestureScopeImpl$awaitRelease$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pressGestureScopeImpl$awaitRelease$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reset(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        int i;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i2 = pressGestureScopeImpl$reset$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pressGestureScopeImpl$reset$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pressGestureScopeImpl$reset$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pressGestureScopeImpl$reset$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    pressGestureScopeImpl$reset$1.label = 1;
                    if (this.mutex.lock(pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                this.isReleased = false;
                this.isCanceled = false;
                return Unit.INSTANCE;
            }
        }
        pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
        Object obj2 = pressGestureScopeImpl$reset$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pressGestureScopeImpl$reset$1.label;
        if (i != 0) {
        }
        this.isReleased = false;
        this.isCanceled = false;
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo229roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo229roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo230roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo230roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public final float mo231toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo231toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo232toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo232toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo234toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo234toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo235toPxR2X_6o(long j) {
        return this.$$delegate_0.mo235toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo236toPx0680j_4(float f) {
        return this.$$delegate_0.mo236toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo237toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo237toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public final long mo238toSp0xMU5do(float f) {
        return this.$$delegate_0.mo238toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo239toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo239toSpkPz2Gy4(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryAwaitRelease(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        int i;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i2 = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pressGestureScopeImpl$tryAwaitRelease$1.label;
                MutexImpl mutexImpl = this.mutex;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.isReleased && !this.isCanceled) {
                        pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                        if (mutexImpl.lock(pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(this.isReleased);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutexImpl.unlock(null);
                return Boolean.valueOf(this.isReleased);
            }
        }
        pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
        Object obj2 = pressGestureScopeImpl$tryAwaitRelease$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pressGestureScopeImpl$tryAwaitRelease$1.label;
        MutexImpl mutexImpl2 = this.mutex;
        if (i != 0) {
        }
        mutexImpl2.unlock(null);
        return Boolean.valueOf(this.isReleased);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo233toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo233toDpu2uoSUM(i);
    }
}
