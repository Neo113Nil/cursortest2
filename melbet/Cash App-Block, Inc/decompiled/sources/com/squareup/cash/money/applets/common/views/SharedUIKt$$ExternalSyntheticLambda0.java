package com.squareup.cash.money.applets.common.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.guava.ListenableFutureKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class SharedUIKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ SharedUIKt$$ExternalSyntheticLambda0(Object obj, long j, float f, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = f;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                SharedUIKt.m3607ZeroBalanceIconaMcp0Q((Icons) this.f$0, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1), this.f$4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ListenableFutureKt.m4197MarkdownDivideraMcp0Q((Modifier) this.f$0, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1), this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                KeypadKt.m3642DivideraMcp0Q((Modifier) this.f$0, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(this.f$3 | 1), this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }
}
