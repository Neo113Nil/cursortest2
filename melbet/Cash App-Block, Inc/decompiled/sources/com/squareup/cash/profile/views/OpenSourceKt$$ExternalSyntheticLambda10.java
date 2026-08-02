package com.squareup.cash.profile.views;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.profile.views.KonfettiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import nl.dionsegijn.konfetti.core.Party;

/* loaded from: classes7.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda10 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda10(Ref$ObjectRef ref$ObjectRef, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = ref$ObjectRef;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Ref$ObjectRef ref$ObjectRef = this.f$0;
        switch (i) {
            case 0:
                mutableState.setValue(new KonfettiState.Started((Party) ref$ObjectRef.element));
                return Unit.INSTANCE;
            default:
                mutableState.setValue(new KonfettiState.Started((Party) ref$ObjectRef.element));
                return Boolean.TRUE;
        }
    }
}
