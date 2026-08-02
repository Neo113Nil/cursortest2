package androidx.compose.runtime.saveable;

import androidx.lifecycle.LifecycleOwner;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.applets.presenters.BitcoinAppletTilePresenter$Factory$Impl;
import com.squareup.cash.bitcoin.applets.presenters.data.BitcoinAppletTileRepository;
import com.squareup.cash.bitcoin.applets.presenters.data.RealBitcoinAppletTileRepository;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes3.dex */
public abstract class ListSaverKt {
    public static Applet bitcoinApplet(BitcoinAppletTileRepository bitcoinAppletTileRepository, BitcoinAppletTilePresenter$Factory$Impl bitcoinAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.BITCOIN, ((RealBitcoinAppletTileRepository) bitcoinAppletTileRepository).availabilityState, new BitcoinUiFactory$$ExternalSyntheticLambda12(4, bitcoinAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static final WorkLauncherImpl listSaver(Function2 function2, Function1 function1) {
        ToastKt$$ExternalSyntheticLambda11 toastKt$$ExternalSyntheticLambda11 = new ToastKt$$ExternalSyntheticLambda11(1, function2);
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
        return new WorkLauncherImpl(8, toastKt$$ExternalSyntheticLambda11, function1);
    }

    public static Applet liteBitcoinApplet(BitcoinAppletTileRepository bitcoinAppletTileRepository, BitcoinAppletTilePresenter$Factory$Impl bitcoinAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.BITCOIN, ((RealBitcoinAppletTileRepository) bitcoinAppletTileRepository).availabilityState, new BitcoinUiFactory$$ExternalSyntheticLambda12(4, bitcoinAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }
}
