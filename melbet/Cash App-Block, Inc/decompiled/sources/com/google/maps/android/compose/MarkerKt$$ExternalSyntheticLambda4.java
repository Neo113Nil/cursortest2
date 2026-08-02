package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.google.android.gms.maps.model.BitmapDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes9.dex */
public final /* synthetic */ class MarkerKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MarkerState f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$12;
    public final /* synthetic */ Function1 f$14;
    public final /* synthetic */ Function1 f$15;
    public final /* synthetic */ Function1 f$16;
    public final /* synthetic */ Function1 f$17;
    public final /* synthetic */ int f$19;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ int f$20;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ BitmapDescriptor f$6;
    public final /* synthetic */ long f$7;

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda4(MarkerState markerState, String str, float f, long j, BitmapDescriptor bitmapDescriptor, long j2, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2) {
        this.f$0 = markerState;
        this.f$1 = str;
        this.f$2 = f;
        this.f$3 = j;
        this.f$6 = bitmapDescriptor;
        this.f$7 = j2;
        this.f$12 = z;
        this.f$14 = function1;
        this.f$15 = function12;
        this.f$16 = function13;
        this.f$17 = function14;
        this.f$19 = i;
        this.f$20 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$19;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                MarkerKt.m2057Markerqld6geY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$6, this.f$7, this.f$12, this.f$14, this.f$15, this.f$16, this.f$17, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$20);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(this.f$20);
                MarkerKt.m2058MarkerImplkhPtz74(this.f$0, this.f$1, this.f$2, this.f$3, this.f$6, this.f$7, this.f$12, this.f$14, this.f$15, this.f$16, this.f$17, (Composer) obj, updateChangedFlags3, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda4(MarkerState markerState, String str, float f, long j, BitmapDescriptor bitmapDescriptor, long j2, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2, int i3) {
        this.f$0 = markerState;
        this.f$1 = str;
        this.f$2 = f;
        this.f$3 = j;
        this.f$6 = bitmapDescriptor;
        this.f$7 = j2;
        this.f$12 = z;
        this.f$14 = function1;
        this.f$15 = function12;
        this.f$16 = function13;
        this.f$17 = function14;
        this.f$19 = i2;
        this.f$20 = i3;
    }
}
