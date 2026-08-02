package com.squareup.cash.afterpayapplet.views.homesection.v3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpayCardSectionKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AfterpayCardSectionKt$$ExternalSyntheticLambda17(AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AfterpayCardKt.V3OptimizedStandardHeader(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
            default:
                AfterpayCardKt.StandardHeader(this.f$0, this.f$1, composer, Updater.updateChangedFlags(this.f$2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
