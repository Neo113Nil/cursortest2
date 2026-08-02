package app.cash.local.backend.real;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import app.cash.local.backend.CartBuilder;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class BuyerIntentSyncManager$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CartBuilder f$0;

    public /* synthetic */ BuyerIntentSyncManager$$ExternalSyntheticLambda2(CartBuilder cartBuilder, int i) {
        this.$r8$classId = i;
        this.f$0 = cartBuilder;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        CartBuilder cartBuilder = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1769615192);
                AbstractPersistentList entries = ((RealCartBuilder) cartBuilder).entries(gapComposer);
                gapComposer.end(false);
                return entries;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(907779630);
                RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                realCartBuilder.getClass();
                gapComposer2.startReplaceGroup(-553443996);
                SnapshotStateList snapshotStateList = realCartBuilder.discountCodes;
                snapshotStateList.getClass();
                AbstractPersistentList abstractPersistentList = SnapshotId_jvmKt.getReadable(snapshotStateList).list;
                gapComposer2.end(false);
                gapComposer2.end(false);
                return abstractPersistentList;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-40748652);
                AbstractPersistentList entries2 = ((RealCartBuilder) cartBuilder).entries(gapComposer3);
                gapComposer3.end(false);
                return entries2;
            default:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(861843434);
                gapComposer4.startReplaceGroup(-553443996);
                SnapshotStateList snapshotStateList2 = ((RealCartBuilder) cartBuilder).discountCodes;
                snapshotStateList2.getClass();
                AbstractPersistentList abstractPersistentList2 = SnapshotId_jvmKt.getReadable(snapshotStateList2).list;
                gapComposer4.end(false);
                gapComposer4.end(false);
                return abstractPersistentList2;
        }
    }
}
