package com.zennvvarroo.pealkkk;

import androidx.compose.material3.SnackbarHostState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ZenvaroPeakApp.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$4 extends FunctionReferenceImpl implements Function1<String, Unit> {
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$4(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState) {
        super(1, Intrinsics.Kotlin.class, "toast", "ZenvaroPeakApp$toast(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;)V", 0);
        this.$scope = coroutineScope;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ZenvaroPeakAppKt.ZenvaroPeakApp$toast(this.$scope, this.$snackbarHostState, p0);
    }
}
