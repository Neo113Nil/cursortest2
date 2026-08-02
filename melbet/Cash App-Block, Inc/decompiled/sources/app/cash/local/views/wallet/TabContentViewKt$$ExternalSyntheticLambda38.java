package app.cash.local.views.wallet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.core.util.TypedValueCompat;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditStateType;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.charting.components.BarChart$Configuration;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.shopping.viewmodels.BulletModel;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda38 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda38(FamilyAppletTile familyAppletTile, Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = familyAppletTile;
        this.f$2 = obj;
        this.f$1 = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = true;
        float f = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.m1334ActiveOrderWidgetuFdPcIQ((LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder) obj4, f, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                FamilyAppletTile familyAppletTile = (FamilyAppletTile) obj4;
                AfterpayAppletTileViewModel.Installed.CreditState creditState = (AfterpayAppletTileViewModel.Installed.CreditState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    familyAppletTile.m3528CreditStateSharedVisualziNgDLE(creditState.creditState, f, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                FamilyAppletTile familyAppletTile2 = (FamilyAppletTile) obj4;
                AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow allocationRow = (AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    familyAppletTile2.m3526AllocationSegmentedCircleuFdPcIQ(allocationRow, this.f$1, true, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                FamilyAppletTile familyAppletTile3 = (FamilyAppletTile) obj4;
                AfterpayAppletTileViewModel.Installed.CreditDetails creditDetails = (AfterpayAppletTileViewModel.Installed.CreditDetails) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ArrayList arrayList = creditDetails.details;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = ((AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail) it.next()).arcadeIcon;
                            familyAppletTile3.getClass();
                            zzd zzdVar = Icons.Companion;
                            if (!Intrinsics.areEqual(str, "tRJa1k") && !Intrinsics.areEqual(str, "ODO3AU")) {
                            }
                            familyAppletTile3.m3527CreditDetailsSharedVisualziNgDLE(z, f, gapComposer3, 0);
                        }
                    }
                    z = false;
                    familyAppletTile3.m3527CreditDetailsSharedVisualziNgDLE(z, f, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).m3528CreditStateSharedVisualziNgDLE((CreditStateType) obj3, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj4).m3763AllocationChartziNgDLE((ArrayList) obj3, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                BarChartKt.BasicBarChart((Modifier) obj4, f, (BarChart$Configuration) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                TypedValueCompat.m1101SavingsVisualCircleuFdPcIQ((Modifier) obj4, f, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            default:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj4).m3601BulletziNgDLE((BulletModel) obj3, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda38(Object obj, float f, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = f;
        this.f$2 = obj2;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda38(Object obj, Object obj2, float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = f;
    }
}
