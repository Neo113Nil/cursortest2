package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishContextMVVM;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishFABJUnit;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGlideDataStore;
import kotlin.text.CatchingFishGlideGsonWidget;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishHiltSharedFlow;
import kotlin.text.CatchingFishLayoutJUnit;
import kotlin.text.CatchingFishRoomMockk;
import kotlin.text.CatchingFishStripeAPIMVPMVI;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishToolbarPayPal;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(CatchingFishFABDagger catchingFishFABDagger, CatchingFishFABJUnit catchingFishFABJUnit) {
        com.google.firebase.CatchingFishPagingLibrary catchingFishPagingLibrary = (com.google.firebase.CatchingFishPagingLibrary) catchingFishFABJUnit.CatchingFishParcelableFAB(com.google.firebase.CatchingFishPagingLibrary.class);
        if (catchingFishFABJUnit.CatchingFishParcelableFAB(CatchingFishRoomMockk.class) == null) {
            return new FirebaseMessaging(catchingFishPagingLibrary, catchingFishFABJUnit.CatchingFishReduxKtor(CatchingFishStripeAPIMVPMVI.class), catchingFishFABJUnit.CatchingFishReduxKtor(CatchingFishGlideGsonWidget.class), (CatchingFishToolbarPayPal) catchingFishFABJUnit.CatchingFishParcelableFAB(CatchingFishToolbarPayPal.class), catchingFishFABJUnit.CatchingFishViewModelFAB(catchingFishFABDagger), (CatchingFishGlideDataStore) catchingFishFABJUnit.CatchingFishParcelableFAB(CatchingFishGlideDataStore.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        CatchingFishFABDagger catchingFishFABDagger = new CatchingFishFABDagger(CatchingFishLayoutJUnit.class, CatchingFishContextMVVM.class);
        CatchingFishCardViewKtor CatchingFishParcelableFAB = CatchingFishToastKtor.CatchingFishParcelableFAB(FirebaseMessaging.class);
        CatchingFishParcelableFAB.CatchingFishParcelableFAB = LIBRARY_NAME;
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(com.google.firebase.CatchingFishPagingLibrary.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 0, CatchingFishRoomMockk.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 1, CatchingFishStripeAPIMVPMVI.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(0, 1, CatchingFishGlideGsonWidget.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(CatchingFishToolbarPayPal.class));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(catchingFishFABDagger, 0, 1));
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(CatchingFishGlideDataStore.class));
        CatchingFishParcelableFAB.CatchingFishWorkManager = new CatchingFishHiltSharedFlow(catchingFishFABDagger, 1);
        if (!(CatchingFishParcelableFAB.CatchingFishReduxKtor == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        CatchingFishParcelableFAB.CatchingFishReduxKtor = 1;
        return Arrays.asList(CatchingFishParcelableFAB.CatchingFishSnackbar(), CatchingFishGsonCardView.CatchingFishOkHttp(LIBRARY_NAME, "25.0.1"));
    }
}
