package com.squareup.cash.android;

import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class AndroidModule$Companion$ProvideDebugMetroFactory implements Factory {
    public static final AndroidModule$Companion$ProvideDebugMetroFactory INSTANCE = new AndroidModule$Companion$ProvideDebugMetroFactory(0);
    public static final AndroidModule$Companion$ProvideDebugMetroFactory INSTANCE$1 = new AndroidModule$Companion$ProvideDebugMetroFactory(1);
    public static final AndroidModule$Companion$ProvideDebugMetroFactory INSTANCE$2 = new AndroidModule$Companion$ProvideDebugMetroFactory(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AndroidModule$Companion$ProvideDebugMetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return "production";
            default:
                return "5.58.0";
        }
    }
}
