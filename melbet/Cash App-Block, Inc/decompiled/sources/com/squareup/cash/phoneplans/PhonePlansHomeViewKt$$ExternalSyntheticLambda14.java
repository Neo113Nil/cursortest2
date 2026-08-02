package com.squareup.cash.phoneplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansHomeViewKt$$ExternalSyntheticLambda14 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PhonePlansHomeViewKt$$ExternalSyntheticLambda14(ArrayList arrayList, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arrayList;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Function1 function1 = this.f$1;
        ArrayList arrayList = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                PhonePlansHomeViewKt.Links(arrayList, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                EarningsHomeKt.ActionButtonsSection(arrayList, function1, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
