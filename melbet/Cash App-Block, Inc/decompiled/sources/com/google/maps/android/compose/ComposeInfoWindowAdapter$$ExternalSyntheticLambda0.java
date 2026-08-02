package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.google.android.gms.maps.model.Marker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class ComposeInfoWindowAdapter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function3 f$0;
    public final /* synthetic */ Marker f$1;

    public /* synthetic */ ComposeInfoWindowAdapter$$ExternalSyntheticLambda0(Function3 function3, Marker marker, int i) {
        this.$r8$classId = i;
        this.f$0 = function3;
        this.f$1 = marker;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Marker marker = this.f$1;
        Function3 function3 = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    function3.invoke(marker, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    function3.invoke(marker, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
