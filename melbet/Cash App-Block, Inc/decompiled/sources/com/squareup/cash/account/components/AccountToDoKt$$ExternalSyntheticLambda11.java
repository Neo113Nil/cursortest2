package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.app.PendingIntentCompat;
import com.squareup.cash.arcade.Icons;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountToDoKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Icons f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ long f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ AccountToDoKt$$ExternalSyntheticLambda11(Modifier modifier, Icons icons, String str, String str2, long j, long j2, Function0 function0, int i, int i2) {
        this.f$4 = modifier;
        this.f$0 = icons;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$5 = j;
        this.f$6 = j2;
        this.f$3 = function0;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AccountToDoKt.m2970ToDoWMdw5o4(Updater.updateChangedFlags(i2 | 1), this.f$8, this.f$5, this.f$6, (Composer) obj, this.f$4, this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                PendingIntentCompat.m1088PromotionItemnBX6wN0(Updater.updateChangedFlags(i2 | 1), this.f$8, this.f$5, this.f$6, (Composer) obj, this.f$4, this.f$0, this.f$1, this.f$2, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountToDoKt$$ExternalSyntheticLambda11(Icons icons, String str, String str2, Function0 function0, Modifier modifier, long j, long j2, int i, int i2) {
        this.f$0 = icons;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = function0;
        this.f$4 = modifier;
        this.f$5 = j;
        this.f$6 = j2;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
