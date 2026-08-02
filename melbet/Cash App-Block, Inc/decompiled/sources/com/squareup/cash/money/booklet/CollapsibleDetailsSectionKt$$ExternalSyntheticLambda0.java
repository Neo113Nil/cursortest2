package com.squareup.cash.money.booklet;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ SnapshotStateSet f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CollapsibleDetailsSectionKt$$ExternalSyntheticLambda0(boolean z, SnapshotStateSet snapshotStateSet, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = snapshotStateSet;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        SnapshotStateSet snapshotStateSet = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                if (z) {
                    snapshotStateSet.remove(Integer.valueOf(i2));
                } else {
                    snapshotStateSet.add(Integer.valueOf(i2));
                }
                break;
            default:
                if (z) {
                    snapshotStateSet.remove(Integer.valueOf(i2));
                } else {
                    snapshotStateSet.add(Integer.valueOf(i2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
