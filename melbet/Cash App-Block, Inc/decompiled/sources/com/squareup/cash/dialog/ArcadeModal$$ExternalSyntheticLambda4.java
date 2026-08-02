package com.squareup.cash.dialog;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeModal$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeModal f$0;

    public /* synthetic */ ArcadeModal$$ExternalSyntheticLambda4(ArcadeModal arcadeModal, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeModal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ArcadeModal arcadeModal = this.f$0;
        Context context = (Context) obj;
        switch (i) {
            case 0:
                context.getClass();
                break;
            default:
                context.getClass();
                break;
        }
        return arcadeModal.content;
    }
}
