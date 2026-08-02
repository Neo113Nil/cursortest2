package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastActionScope$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ToastActionScope f$0;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ToastActionScope$$ExternalSyntheticLambda1(ToastActionScope toastActionScope, String str, Function0 function0, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 1:
                break;
            default:
                zzd zzdVar = Icons.Companion;
                break;
        }
        this.f$0 = toastActionScope;
        this.f$2 = str;
        this.f$3 = function0;
        this.f$4 = modifier;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        switch (i) {
            case 0:
                zzd zzdVar = Icons.Companion;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                this.f$0.IconAction(updateChangedFlags, (Composer) obj, this.f$4, this.f$2, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                this.f$0.TextAction(updateChangedFlags2, (Composer) obj, this.f$4, this.f$2, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }
}
