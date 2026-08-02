package com.squareup.cash.advertising.views;

import app.cash.broadway.ui.Ui;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0 implements Ui.EventReceiver, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 function;

    public FullscreenAdViewKt$sam$app_cash_broadway_ui_Ui_EventReceiver$0(int i, Function1 function1) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                function1.getClass();
                this.function = function1;
                break;
            default:
                function1.getClass();
                this.function = function1;
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof Ui.EventReceiver) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Ui.EventReceiver) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.$r8$classId) {
        }
        return this.function;
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final /* synthetic */ void sendEvent(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.function.invoke(obj);
                break;
            default:
                this.function.invoke(obj);
                break;
        }
    }
}
