package com.squareup.cash.paychecks.backend.api.mapper;

import io.noties.markwon.LinkResolverDef;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.face.iad.capture.Plane;
import net.idrnd.face.iad.capture.internal.y0;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.paychecks.Paycheck;
import squareup.cash.paychecks.RealizedAllocationAmount;
import squareup.cash.paychecks.UiState;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class UiStateMappersKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[BenefitsStatusSection.State.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            y0 y0Var = BenefitsStatusSection.State.Companion;
            iArr[3] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            y0 y0Var2 = BenefitsStatusSection.State.Companion;
            iArr[4] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            y0 y0Var3 = BenefitsStatusSection.State.Companion;
            iArr[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[UiState.AppletState.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LinkResolverDef linkResolverDef = UiState.AppletState.Companion;
            iArr2[2] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LinkResolverDef linkResolverDef2 = UiState.AppletState.Companion;
            iArr2[3] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[Paycheck.SettlementDate.Type.values().length];
        try {
            iArr3[1] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            KClasses$$Lambda$1 kClasses$$Lambda$1 = Paycheck.SettlementDate.Type.Companion;
            iArr3[2] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr4 = new int[RealizedAllocationAmount.State.values().length];
        try {
            iArr4[0] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            Plane plane = RealizedAllocationAmount.State.Companion;
            iArr4[1] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            Plane plane2 = RealizedAllocationAmount.State.Companion;
            iArr4[2] = 3;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
