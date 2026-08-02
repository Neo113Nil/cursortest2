package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class RecipientListViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Map f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ Function1 f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Function2 f$7;

    public /* synthetic */ RecipientListViewKt$$ExternalSyntheticLambda0(List list, Map map, Function1 function1, Function1 function12, Function1 function13, boolean z, Function2 function2) {
        this.f$1 = list;
        this.f$2 = map;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function13;
        this.f$6 = z;
        this.f$7 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    QuickPayViewKt.RecipientListInternal(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                QuickPayViewKt.RecipientListInternal(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RecipientListViewKt$$ExternalSyntheticLambda0(List list, Map map, Function1 function1, Function1 function12, Function1 function13, boolean z, Function2 function2, int i) {
        this.f$1 = list;
        this.f$2 = map;
        this.f$3 = function1;
        this.f$4 = function12;
        this.f$5 = function13;
        this.f$6 = z;
        this.f$7 = function2;
    }
}
