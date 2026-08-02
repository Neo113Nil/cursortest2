package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.tracing.Trace;
import com.squareup.cash.arcade.Icons;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class IconKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ IconKt$$ExternalSyntheticLambda0(Object obj, String str, Modifier modifier, long j, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = j;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                Trace.m1191Iconww6aTOc((Icons) this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
            default:
                ((Integer) obj2).getClass();
                Trace.m1190Iconww6aTOc((Painter) this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(this.f$4 | 1), this.f$5);
                break;
        }
        return Unit.INSTANCE;
    }
}
