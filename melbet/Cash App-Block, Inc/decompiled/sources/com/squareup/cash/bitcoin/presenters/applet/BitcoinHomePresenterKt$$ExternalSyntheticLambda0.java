package com.squareup.cash.bitcoin.presenters.applet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import com.google.zxing.BinaryBitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class BitcoinHomePresenterKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BinaryBitmap f$0;

    public /* synthetic */ BitcoinHomePresenterKt$$ExternalSyntheticLambda0(BinaryBitmap binaryBitmap, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = binaryBitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        BinaryBitmap binaryBitmap = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                DragAndDrop_androidKt.HandleDefaultDisplayPreference(binaryBitmap, composer, Updater.updateChangedFlags(1));
                break;
            default:
                binaryBitmap.HandleDefaultDisplayPreference(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
