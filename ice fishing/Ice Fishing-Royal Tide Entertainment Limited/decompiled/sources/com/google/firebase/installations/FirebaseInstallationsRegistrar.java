package com.google.firebase.installations;

import com.google.firebase.CatchingFishPagingLibrary;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishFABJUnit;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishLayoutCoroutine;
import kotlin.text.CatchingFishLayoutLayout;
import kotlin.text.CatchingFishLayoutService;
import kotlin.text.CatchingFishLifecycleGradle;
import kotlin.text.CatchingFishMVPAsyncTask;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishManifestCameraX;
import kotlin.text.CatchingFishStateFlowGlide;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishToolbarPayPal;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static CatchingFishToolbarPayPal lambda$getComponents$0(CatchingFishFABJUnit catchingFishFABJUnit) {
        return new CatchingFishLayoutService((CatchingFishPagingLibrary) catchingFishFABJUnit.CatchingFishParcelableFAB(CatchingFishPagingLibrary.class), catchingFishFABJUnit.CatchingFishReduxKtor(CatchingFishStateFlowGlide.class), (ExecutorService) catchingFishFABJUnit.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishManifestCameraX.class, ExecutorService.class)), new CatchingFishLifecycleGradle((Executor) catchingFishFABJUnit.CatchingFishWorkManager(new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        CatchingFishCardViewKtor CatchingFishParcelableFAB = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishToolbarPayPal.class);
        CatchingFishParcelableFAB.CatchingFishParcelableFAB = LIBRARY_NAME;
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(CatchingFishPagingLibrary.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 1, CatchingFishStateFlowGlide.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishManifestCameraX.class, ExecutorService.class), 1, 0));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, Executor.class), 1, 0));
        CatchingFishParcelableFAB.CatchingFishWorkManager = new CatchingFishLayoutLayout(24);
        CatchingFishToastKtor CatchingFishSnackbar = CatchingFishParcelableFAB.CatchingFishSnackbar();
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = new CatchingFishMVPExoPlayer(0);
        CatchingFishCardViewKtor CatchingFishParcelableFAB2 = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishMVPExoPlayer.class);
        CatchingFishParcelableFAB2.CatchingFishDaggerWebsocket = 1;
        CatchingFishParcelableFAB2.CatchingFishWorkManager = new CatchingFishLayoutCoroutine(1, catchingFishMVPExoPlayer);
        return Arrays.asList(CatchingFishSnackbar, CatchingFishParcelableFAB2.CatchingFishSnackbar(), CatchingFishGsonCardView.CatchingFishOkHttp(LIBRARY_NAME, "18.0.0"));
    }
}
