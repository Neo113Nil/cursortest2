package com.squareup.cash.fidesmo.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScanningShapePulseKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Shape f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ List f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ Modifier f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda9(Shape shape, float f, long j, List list, float f2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = shape;
        this.f$1 = f;
        this.f$2 = j;
        this.f$3 = list;
        this.f$4 = f2;
        this.f$5 = modifier;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3541HeartFrameWithFillPulseEOp_iR4(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3550StarFrameWithFillPulseEOp_iR4(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ScanningShapePulseKt.m3543MiniCardFrameWithFillPulseEOp_iR4(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
