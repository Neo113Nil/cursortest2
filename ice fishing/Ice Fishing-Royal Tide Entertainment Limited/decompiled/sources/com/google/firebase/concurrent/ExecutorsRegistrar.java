package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishCardViewPicasso;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishLayoutLayout;
import kotlin.text.CatchingFishLayoutRoom;
import kotlin.text.CatchingFishMVPAsyncTask;
import kotlin.text.CatchingFishManifestCameraX;
import kotlin.text.CatchingFishPayPalMoshi;
import kotlin.text.CatchingFishSpannableMoshi;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishWebsocketOkHttp;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final CatchingFishWebsocketOkHttp CatchingFishParcelableFAB = new CatchingFishWebsocketOkHttp(new CatchingFishCardViewPicasso(1));
    public static final CatchingFishWebsocketOkHttp CatchingFishSnackbar = new CatchingFishWebsocketOkHttp(new CatchingFishCardViewPicasso(2));
    public static final CatchingFishWebsocketOkHttp CatchingFishCoroutine = new CatchingFishWebsocketOkHttp(new CatchingFishCardViewPicasso(3));
    public static final CatchingFishWebsocketOkHttp CatchingFishReduxKtor = new CatchingFishWebsocketOkHttp(new CatchingFishCardViewPicasso(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        CatchingFishFABDagger catchingFishFABDagger = new CatchingFishFABDagger(CatchingFishManifestCameraX.class, ScheduledExecutorService.class);
        CatchingFishFABDagger[] catchingFishFABDaggerArr = {new CatchingFishFABDagger(CatchingFishManifestCameraX.class, ExecutorService.class), new CatchingFishFABDagger(CatchingFishManifestCameraX.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(catchingFishFABDagger);
        for (CatchingFishFABDagger catchingFishFABDagger2 : catchingFishFABDaggerArr) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(catchingFishFABDagger2, "Null interface");
        }
        Collections.addAll(hashSet, catchingFishFABDaggerArr);
        CatchingFishToastKtor catchingFishToastKtor = new CatchingFishToastKtor(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new CatchingFishLayoutLayout(14), hashSet3);
        CatchingFishFABDagger catchingFishFABDagger3 = new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, ScheduledExecutorService.class);
        CatchingFishFABDagger[] catchingFishFABDaggerArr2 = {new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, ExecutorService.class), new CatchingFishFABDagger(CatchingFishMVPAsyncTask.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(catchingFishFABDagger3);
        for (CatchingFishFABDagger catchingFishFABDagger4 : catchingFishFABDaggerArr2) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(catchingFishFABDagger4, "Null interface");
        }
        Collections.addAll(hashSet4, catchingFishFABDaggerArr2);
        CatchingFishToastKtor catchingFishToastKtor2 = new CatchingFishToastKtor(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new CatchingFishLayoutLayout(15), hashSet6);
        CatchingFishFABDagger catchingFishFABDagger5 = new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, ScheduledExecutorService.class);
        CatchingFishFABDagger[] catchingFishFABDaggerArr3 = {new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, ExecutorService.class), new CatchingFishFABDagger(CatchingFishPayPalMoshi.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(catchingFishFABDagger5);
        for (CatchingFishFABDagger catchingFishFABDagger6 : catchingFishFABDaggerArr3) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(catchingFishFABDagger6, "Null interface");
        }
        Collections.addAll(hashSet7, catchingFishFABDaggerArr3);
        CatchingFishToastKtor catchingFishToastKtor3 = new CatchingFishToastKtor(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new CatchingFishLayoutLayout(16), hashSet9);
        CatchingFishCardViewKtor CatchingFishSnackbar2 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishSpannableMoshi.class, Executor.class));
        CatchingFishSnackbar2.CatchingFishWorkManager = new CatchingFishLayoutLayout(17);
        return Arrays.asList(catchingFishToastKtor, catchingFishToastKtor2, catchingFishToastKtor3, CatchingFishSnackbar2.CatchingFishSnackbar());
    }
}
