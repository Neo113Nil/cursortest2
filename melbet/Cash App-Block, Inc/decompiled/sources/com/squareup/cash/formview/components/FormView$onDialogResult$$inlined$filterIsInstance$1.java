package com.squareup.cash.formview.components;

import com.squareup.cash.ui.DialogResultListener;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class FormView$onDialogResult$$inlined$filterIsInstance$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final FormView$onDialogResult$$inlined$filterIsInstance$1 INSTANCE$1 = new FormView$onDialogResult$$inlined$filterIsInstance$1(1);
    public static final FormView$onDialogResult$$inlined$filterIsInstance$1 INSTANCE$2 = new FormView$onDialogResult$$inlined$filterIsInstance$1(2);
    public static final FormView$onDialogResult$$inlined$filterIsInstance$1 INSTANCE = new FormView$onDialogResult$$inlined$filterIsInstance$1(0);

    public /* synthetic */ FormView$onDialogResult$$inlined$filterIsInstance$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(obj instanceof DialogResultListener);
            case 1:
                return Boolean.valueOf(obj instanceof FormEventful);
            default:
                return Boolean.valueOf(obj instanceof FormRequirementProvider);
        }
    }
}
