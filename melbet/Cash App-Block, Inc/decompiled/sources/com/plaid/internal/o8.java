package com.plaid.internal;

import android.os.Bundle;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class o8 extends Lambda implements Function0<r8> {
    public final /* synthetic */ p8<u8> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(p8<u8> p8Var) {
        super(0);
        this.a = p8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        r8 r8Var;
        Bundle arguments = this.a.getArguments();
        if (arguments != null && (r8Var = (r8) arguments.getParcelable("workflow_pane_id")) != null) {
            return r8Var;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1("Needs pane id");
        return null;
    }
}
