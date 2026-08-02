package com.squareup.cash.buynowpaylater.views;

import com.squareup.cash.buynowpaylater.viewmodels.Alignment;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CommonViewFactoriesKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[SemanticColor.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            WorkCookieJar workCookieJar = SemanticColor.Companion;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            WorkCookieJar workCookieJar2 = SemanticColor.Companion;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            WorkCookieJar workCookieJar3 = SemanticColor.Companion;
            iArr[3] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            WorkCookieJar workCookieJar4 = SemanticColor.Companion;
            iArr[4] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[Alignment.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            Alignment alignment = Alignment.LEADING;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            Alignment alignment2 = Alignment.LEADING;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
