package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kotlin.text.CatchingFishAsyncTaskWidget;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishContextMVVM;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishFABJUnit;
import kotlin.text.CatchingFishFluxXMLLayout;
import kotlin.text.CatchingFishGlideDagger;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishLayoutJUnit;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishWidgetMVVM;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CatchingFishContextMVVM lambda$getComponents$0(CatchingFishFABJUnit catchingFishFABJUnit) {
        CatchingFishGlideDagger.CatchingFishSnackbar((Context) catchingFishFABJUnit.CatchingFishParcelableFAB(Context.class));
        return CatchingFishGlideDagger.CatchingFishParcelableFAB().CatchingFishCoroutine(CatchingFishWidgetMVVM.CatchingFishWorkManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CatchingFishContextMVVM lambda$getComponents$1(CatchingFishFABJUnit catchingFishFABJUnit) {
        CatchingFishGlideDagger.CatchingFishSnackbar((Context) catchingFishFABJUnit.CatchingFishParcelableFAB(Context.class));
        return CatchingFishGlideDagger.CatchingFishParcelableFAB().CatchingFishCoroutine(CatchingFishWidgetMVVM.CatchingFishWorkManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CatchingFishContextMVVM lambda$getComponents$2(CatchingFishFABJUnit catchingFishFABJUnit) {
        CatchingFishGlideDagger.CatchingFishSnackbar((Context) catchingFishFABJUnit.CatchingFishParcelableFAB(Context.class));
        return CatchingFishGlideDagger.CatchingFishParcelableFAB().CatchingFishCoroutine(CatchingFishWidgetMVVM.CatchingFishDaggerWebsocket);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        CatchingFishCardViewKtor CatchingFishParcelableFAB = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishContextMVVM.class);
        CatchingFishParcelableFAB.CatchingFishParcelableFAB = LIBRARY_NAME;
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        CatchingFishParcelableFAB.CatchingFishWorkManager = new CatchingFishAsyncTaskWidget(10);
        CatchingFishToastKtor CatchingFishSnackbar = CatchingFishParcelableFAB.CatchingFishSnackbar();
        CatchingFishCardViewKtor CatchingFishSnackbar2 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishFluxXMLLayout.class, CatchingFishContextMVVM.class));
        CatchingFishSnackbar2.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        CatchingFishSnackbar2.CatchingFishWorkManager = new CatchingFishAsyncTaskWidget(11);
        CatchingFishToastKtor CatchingFishSnackbar3 = CatchingFishSnackbar2.CatchingFishSnackbar();
        CatchingFishCardViewKtor CatchingFishSnackbar4 = CatchingFishToastKtor.CatchingFishSnackbar(new CatchingFishFABDagger(CatchingFishLayoutJUnit.class, CatchingFishContextMVVM.class));
        CatchingFishSnackbar4.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        CatchingFishSnackbar4.CatchingFishWorkManager = new CatchingFishAsyncTaskWidget(12);
        return Arrays.asList(CatchingFishSnackbar, CatchingFishSnackbar3, CatchingFishSnackbar4.CatchingFishSnackbar(), CatchingFishGsonCardView.CatchingFishOkHttp(LIBRARY_NAME, "18.2.0"));
    }
}
