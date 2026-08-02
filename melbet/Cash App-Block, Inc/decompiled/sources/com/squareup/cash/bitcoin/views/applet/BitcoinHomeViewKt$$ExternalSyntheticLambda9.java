package com.squareup.cash.bitcoin.views.applet;

import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.arcade.components.LazyScaffoldContentScope;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.welcome.BitcoinWelcomeViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinHomeViewKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ BitcoinHomeViewKt$$ExternalSyntheticLambda9(BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel, LazyScaffoldContentScope lazyScaffoldContentScope, zzc zzcVar, Function1 function1, int i, BitcoinHomeViewModel bitcoinHomeViewModel) {
        this.f$0 = bitcoinHomeWidgetViewModel;
        this.f$1 = lazyScaffoldContentScope;
        this.f$2 = zzcVar;
        this.f$3 = function1;
        this.f$4 = i;
        this.f$5 = bitcoinHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj4 = this.f$5;
        Function function = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel = (BitcoinHomeWidgetViewModel) obj7;
                LazyScaffoldContentScope lazyScaffoldContentScope = (LazyScaffoldContentScope) obj6;
                zzc zzcVar = (zzc) obj5;
                Function1 function1 = (Function1) function;
                BitcoinHomeViewModel bitcoinHomeViewModel = (BitcoinHomeViewModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    boolean z = bitcoinHomeWidgetViewModel instanceof BitcoinBalanceWidgetViewModel;
                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                    if (z || (bitcoinHomeWidgetViewModel instanceof BitcoinWelcomeViewModel)) {
                        gapComposer.startReplaceGroup(420108146);
                        modifier = ScreenScaffoldKt.markAsScaffoldTitle(modifier, lazyScaffoldContentScope, gapComposer, 6);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(420188312);
                        gapComposer.end(false);
                    }
                    zzcVar.Create(bitcoinHomeWidgetViewModel, function1, modifier, i2 == CollectionsKt__CollectionsKt.getLastIndex(((BitcoinHomeViewModel.Ready) bitcoinHomeViewModel).getWidgets()), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function;
                Modifier modifier2 = (Modifier) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (obj7 == null) {
                        gapComposer2.startReplaceGroup(443637036);
                    } else {
                        gapComposer2.startReplaceGroup(443637037);
                        composableLambdaImpl.invoke(obj7, modifier2, gapComposer2, Integer.valueOf(i2 & 8));
                    }
                    gapComposer2.end(false);
                    if (obj6 == null) {
                        gapComposer2.startReplaceGroup(443698540);
                    } else {
                        gapComposer2.startReplaceGroup(443698541);
                        composableLambdaImpl.invoke(obj6, modifier2, gapComposer2, Integer.valueOf(i2 & 8));
                    }
                    gapComposer2.end(false);
                    if (obj5 == null) {
                        gapComposer2.startReplaceGroup(443759052);
                    } else {
                        gapComposer2.startReplaceGroup(443759053);
                        composableLambdaImpl.invoke(obj5, modifier2, gapComposer2, Integer.valueOf(i2 & 8));
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BitcoinHomeViewKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, int i) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = composableLambdaImpl;
        this.f$5 = modifier;
        this.f$4 = i;
    }
}
