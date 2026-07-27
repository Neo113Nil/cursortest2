package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.text.CatchingFishCardViewKtor;
import kotlin.text.CatchingFishFABDagger;
import kotlin.text.CatchingFishGlideDaggerHilt;
import kotlin.text.CatchingFishGlideGsonWidget;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishHiltSharedFlow;
import kotlin.text.CatchingFishKtorRetrofit;
import kotlin.text.CatchingFishLayoutLayout;
import kotlin.text.CatchingFishMVPExoPlayer;
import kotlin.text.CatchingFishManifestCameraX;
import kotlin.text.CatchingFishSpannableWidget;
import kotlin.text.CatchingFishStateFlowGlide;
import kotlin.text.CatchingFishStripeAPIMVPMVI;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishXMLLayoutAdMob;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String CatchingFishParcelableFAB(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        CatchingFishCardViewKtor CatchingFishParcelableFAB = CatchingFishToastKtor.CatchingFishParcelableFAB(CatchingFishStripeAPIMVPMVI.class);
        CatchingFishParcelableFAB.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(2, 0, CatchingFishSpannableWidget.class));
        CatchingFishParcelableFAB.CatchingFishWorkManager = new CatchingFishLayoutLayout(9);
        arrayList.add(CatchingFishParcelableFAB.CatchingFishSnackbar());
        CatchingFishFABDagger catchingFishFABDagger = new CatchingFishFABDagger(CatchingFishManifestCameraX.class, Executor.class);
        CatchingFishCardViewKtor catchingFishCardViewKtor = new CatchingFishCardViewKtor(CatchingFishXMLLayoutAdMob.class, new Class[]{CatchingFishStateFlowGlide.class, CatchingFishGlideGsonWidget.class});
        catchingFishCardViewKtor.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(Context.class));
        catchingFishCardViewKtor.CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt.CatchingFishParcelableFAB(CatchingFishPagingLibrary.class));
        catchingFishCardViewKtor.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(2, 0, CatchingFishMVPExoPlayer.class));
        catchingFishCardViewKtor.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(1, 1, CatchingFishStripeAPIMVPMVI.class));
        catchingFishCardViewKtor.CatchingFishParcelableFAB(new CatchingFishGlideDaggerHilt(catchingFishFABDagger, 1, 0));
        catchingFishCardViewKtor.CatchingFishWorkManager = new CatchingFishHiltSharedFlow(catchingFishFABDagger, 0);
        arrayList.add(catchingFishCardViewKtor.CatchingFishSnackbar());
        arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("fire-core", "22.0.1"));
        arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("device-name", CatchingFishParcelableFAB(Build.PRODUCT)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("device-model", CatchingFishParcelableFAB(Build.DEVICE)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("device-brand", CatchingFishParcelableFAB(Build.BRAND)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishCoroutineFlow("android-target-sdk", new CatchingFishLayoutLayout(20)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishCoroutineFlow("android-min-sdk", new CatchingFishLayoutLayout(21)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishCoroutineFlow("android-platform", new CatchingFishLayoutLayout(22)));
        arrayList.add(CatchingFishGsonCardView.CatchingFishCoroutineFlow("android-installer", new CatchingFishLayoutLayout(23)));
        try {
            CatchingFishKtorRetrofit.CatchingFishDaggerWebsocket.getClass();
            str = "2.1.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(CatchingFishGsonCardView.CatchingFishOkHttp("kotlin", str));
        }
        return arrayList;
    }
}
