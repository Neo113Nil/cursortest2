package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGradleMVVM;
import kotlin.text.CatchingFishMVPAsyncTask;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishManifestCameraX;
import kotlin.text.CatchingFishMoshiFluxMoshi;
import kotlin.text.CatchingFishPayPalMoshi;
import kotlin.text.CatchingFishSpannableMoshi;
import kotlin.text.CatchingFishToastCustomView;
import kotlin.text.CatchingFishToastGradle;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishWidgetContext;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        CatchingFishCardViewKtor CatchingFishSnackbar = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishManifestCameraX.class, CatchingFishToastGradle.class));
        CatchingFishSnackbar.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishManifestCameraX.class, Executor.class), 1, 0));
        CatchingFishSnackbar.CatchingFishWorkManager = CatchingFishGradleMVVM.CatchingFishStateLiveData;
        CatchingFishToastKtor CatchingFishSnackbar2 = CatchingFishSnackbar.CatchingFishSnackbar();
        CatchingFishCardViewKtor CatchingFishSnackbar3 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, CatchingFishToastGradle.class));
        CatchingFishSnackbar3.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, Executor.class), 1, 0));
        CatchingFishSnackbar3.CatchingFishWorkManager = CatchingFishMoshiFluxMoshi.CatchingFishLayout;
        CatchingFishToastKtor CatchingFishSnackbar4 = CatchingFishSnackbar3.CatchingFishSnackbar();
        CatchingFishCardViewKtor CatchingFishSnackbar5 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, CatchingFishToastGradle.class));
        CatchingFishSnackbar5.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, Executor.class), 1, 0));
        CatchingFishSnackbar5.CatchingFishWorkManager = CatchingFishMVPExoPlayer.CatchingFishViewModelFAB;
        CatchingFishToastKtor CatchingFishSnackbar6 = CatchingFishSnackbar5.CatchingFishSnackbar();
        CatchingFishCardViewKtor CatchingFishSnackbar7 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishSpannableMoshi.class, CatchingFishToastGradle.class));
        CatchingFishSnackbar7.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishSpannableMoshi.class, Executor.class), 1, 0));
        CatchingFishSnackbar7.CatchingFishWorkManager = CatchingFishWidgetContext.CatchingFishViewModelFAB;
        return CatchingFishToastCustomView.CatchingFishLayoutInflater(CatchingFishSnackbar2, CatchingFishSnackbar4, CatchingFishSnackbar6, CatchingFishSnackbar7.CatchingFishSnackbar());
    }
}
