package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.CatchingFishPagingLibrary;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishExoPlayerMVI;
import kotlin.text.CatchingFishFABJUnit;
import kotlin.text.CatchingFishFirebaseGson;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGlideGsonWidget;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishLayoutLayout;
import kotlin.text.CatchingFishOkHttpSnackbar;
import kotlin.text.CatchingFishStripeAPIMVPMVI;
import kotlin.text.CatchingFishToastAsyncTask;
import kotlin.text.CatchingFishToastKtor;

/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static CatchingFishToastAsyncTask lambda$getComponents$0(CatchingFishFABJUnit catchingFishFABJUnit) {
        CatchingFishPagingLibrary catchingFishPagingLibrary = (CatchingFishPagingLibrary) catchingFishFABJUnit.CatchingFishParcelableFAB(CatchingFishPagingLibrary.class);
        catchingFishFABJUnit.CatchingFishViewModelScope(CatchingFishFirebaseGson.class);
        catchingFishFABJUnit.CatchingFishViewModelScope(CatchingFishExoPlayerMVI.class);
        catchingFishFABJUnit.CatchingFishReduxKtor(CatchingFishStripeAPIMVPMVI.class);
        catchingFishFABJUnit.CatchingFishReduxKtor(CatchingFishGlideGsonWidget.class);
        CatchingFishToastAsyncTask catchingFishToastAsyncTask = new CatchingFishToastAsyncTask();
        new HashMap();
        catchingFishPagingLibrary.CatchingFishParcelableFAB();
        catchingFishPagingLibrary.CatchingFishFragmentHandler.add(catchingFishToastAsyncTask);
        return catchingFishToastAsyncTask;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        CatchingFishCardViewKtor CatchingFishParcelableFAB = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishToastAsyncTask.class);
        CatchingFishParcelableFAB.CatchingFishParcelableFAB = LIBRARY_NAME;
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(CatchingFishPagingLibrary.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 1, CatchingFishGlideGsonWidget.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 1, CatchingFishStripeAPIMVPMVI.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 2, CatchingFishFirebaseGson.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 2, CatchingFishExoPlayerMVI.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 0, CatchingFishOkHttpSnackbar.class));
        CatchingFishParcelableFAB.CatchingFishWorkManager = new CatchingFishLayoutLayout(26);
        return Arrays.asList(CatchingFishParcelableFAB.CatchingFishSnackbar(), CatchingFishGsonCardView.CatchingFishOkHttp(LIBRARY_NAME, "26.1.1"));
    }
}
