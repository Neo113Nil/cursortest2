package com.squareup.cash.graphics.backend.gl;

import androidx.compose.runtime.ProduceStateScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GLSceneScope f$0;
    public final /* synthetic */ ProduceStateScope f$1;

    public /* synthetic */ GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1(GLSceneScope gLSceneScope, ProduceStateScope produceStateScope, int i) {
        this.$r8$classId = i;
        this.f$0 = gLSceneScope;
        this.f$1 = produceStateScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.f$1;
        GLSceneScope gLSceneScope = this.f$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = gLSceneScope.glScope;
                if (coroutineScope != null) {
                    JobKt.launch$default(coroutineScope, null, null, new GLSceneScope$rememberMaterial$1$1$4$1(produceStateScope, null, 0), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
            default:
                CoroutineScope coroutineScope2 = gLSceneScope.glScope;
                if (coroutineScope2 != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new GLSceneScope$rememberMaterial$1$1$4$1(produceStateScope, null, 1), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
        }
    }
}
