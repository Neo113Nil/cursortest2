package androidx.compose.ui.tooling;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class PreviewActivity$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object[] f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda2(String str, String str2, Object[] objArr) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = PreviewActivity.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                    Object[] objArr = this.f$0;
                    MenuKt.m537ScaffoldTvnljyQ(null, null, null, null, Expect_jvmKt.rememberComposableLambda(-531963740, new TextKt$$ExternalSyntheticLambda0(24, objArr, parcelableSnapshotMutableIntState), gapComposer), 0, 0L, 0L, null, Expect_jvmKt.rememberComposableLambda(993072492, new ComposeDialogKt$$ExternalSyntheticLambda12(this.f$1, this.f$2, objArr, parcelableSnapshotMutableIntState, 3), gapComposer), gapComposer, 805330944);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object[] objArr2 = this.f$0;
                    ComposableInvoker.invokeComposable(this.f$1, this.f$2, gapComposer2, Arrays.copyOf(objArr2, objArr2.length));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PreviewActivity$$ExternalSyntheticLambda2(Object[] objArr, String str, String str2) {
        this.f$0 = objArr;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
