package com.squareup.cash.p2pblocking.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListRowKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ P2PListRowModel f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ P2PListRowKt$$ExternalSyntheticLambda0(P2PListRowModel p2PListRowModel, Function0 function0, Function0 function02, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = p2PListRowModel;
        this.f$1 = function0;
        this.f$2 = function02;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                P2PListRowKt.P2PListRow(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                P2PListRowKt.P2PBlockListRowContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
