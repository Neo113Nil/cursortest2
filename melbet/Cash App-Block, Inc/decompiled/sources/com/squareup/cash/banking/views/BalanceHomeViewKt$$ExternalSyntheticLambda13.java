package com.squareup.cash.banking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda13(int i, int i2, String str, Function1 function1, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                BalanceHomeViewKt.Disclosure(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                num.getClass();
                WorkWebViewKt.WorkWebViewError(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
