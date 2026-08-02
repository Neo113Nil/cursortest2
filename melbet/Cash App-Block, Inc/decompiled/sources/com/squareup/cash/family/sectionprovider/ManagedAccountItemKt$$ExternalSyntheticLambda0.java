package com.squareup.cash.family.sectionprovider;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzck;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ManagedAccountItemKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ CellDefaultAccessory f$2;
    public final /* synthetic */ Icons f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ ManagedAccountItemKt$$ExternalSyntheticLambda0(Icons icons, String str, String str2, Function0 function0, CellDefaultAccessory cellDefaultAccessory, int i) {
        this.f$3 = icons;
        this.f$0 = str;
        this.f$4 = str2;
        this.f$1 = function0;
        this.f$2 = cellDefaultAccessory;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl rememberComposableLambda;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = this.f$0;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-1561921773);
                        gapComposer.end(false);
                        rememberComposableLambda = null;
                    } else {
                        gapComposer.startReplaceGroup(-1561921772);
                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(313371343, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 9), gapComposer);
                        gapComposer.end(false);
                    }
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-589700443, new InfoSectionKt$$ExternalSyntheticLambda6(this.f$3, 17), gapComposer), Expect_jvmKt.rememberComposableLambda(362131396, new FamilyMemberRowKt$$ExternalSyntheticLambda5(this.f$4, 10), gapComposer), null, this.f$1, false, false, rememberComposableLambda, null, this.f$2, 0L, gapComposer, 54, 3444);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zzck.ManagedAccountItemUI(this.f$3, this.f$0, this.f$4, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ManagedAccountItemKt$$ExternalSyntheticLambda0(String str, Function0 function0, CellDefaultAccessory cellDefaultAccessory, Icons icons, String str2) {
        this.f$0 = str;
        this.f$1 = function0;
        this.f$2 = cellDefaultAccessory;
        this.f$3 = icons;
        this.f$4 = str2;
    }
}
