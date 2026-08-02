package com.squareup.cash.checks;

import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 function;

    public /* synthetic */ CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.function = function1;
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        int i = this.$r8$classId;
        Function1 function1 = this.function;
        switch (i) {
            case 0:
            case 1:
            case 2:
                return function1;
            default:
                return (MenuKt$$ExternalSyntheticLambda0) function1;
        }
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.function;
        switch (i) {
            case 0:
                function1.invoke(obj);
                break;
            case 1:
                function1.invoke(obj);
                break;
            case 2:
                function1.invoke(obj);
                break;
            default:
                ((MenuKt$$ExternalSyntheticLambda0) function1).invoke(obj);
                break;
        }
    }
}
