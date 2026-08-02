package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class PinkThemeSparklesKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ PinkThemeSparklesKt$$ExternalSyntheticLambda1(StocksAppletTileModel.Installed.LoadedPriceMovement loadedPriceMovement, float f, boolean z, int i) {
        this.$r8$classId = 2;
        this.f$0 = loadedPriceMovement;
        this.f$2 = f;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        float f = this.f$2;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AccountToDoKt.PinkThemeSparkles((Modifier) obj3, z, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj3).m3527CreditDetailsSharedVisualziNgDLE(z, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                BarcodeScanning.m2064StocksVisualrAjV9yQ((StocksAppletTileModel.Installed.LoadedPriceMovement) obj3, f, z, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PinkThemeSparklesKt$$ExternalSyntheticLambda1(Object obj, boolean z, float f, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = f;
    }
}
