package com.squareup.cash.blockers.presenters;

import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class AtmPickerAmountBlockerPresenterKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtmPickerAmountBlocker.AnimationDirection.values().length];
            try {
                iArr[AtmPickerAmountBlocker.AnimationDirection.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtmPickerAmountBlocker.AnimationDirection.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AnimationDirection toAnimationDirection(AtmPickerAmountBlocker.AnimationDirection animationDirection) {
        int i = animationDirection == null ? -1 : WhenMappings.$EnumSwitchMapping$0[animationDirection.ordinal()];
        if (i == -1 || i == 1) {
            return AnimationDirection.FORWARD;
        }
        if (i == 2) {
            return AnimationDirection.BACKWARD;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
