package com.squareup.cash.arcade.components.list;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ListOrderedKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ ComposableLambdaImpl f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda11(int i, int i2, int i3, ComposableLambdaImpl composableLambdaImpl, Modifier modifier) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        ComposableLambdaImpl composableLambdaImpl = this.f$1;
        Modifier modifier = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ListOrderedKt.ListOrderedContainer(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$1(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                DefaultTextContextMenuDropdownProvider_androidKt.ProvideDefaultTextContextMenuDropdown(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                SimpleLayoutKt.SelectionContainer(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(49), i2);
                break;
            default:
                AfterpayCardKt.AfterpayCard(modifier, composableLambdaImpl, composer, Updater.updateChangedFlags(49), i2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda11(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i;
    }
}
