package com.google.android.datatransport.cct;

import kotlin.text.CatchingFishAdMobCoroutine;
import kotlin.text.CatchingFishGraphQLContext;
import kotlin.text.CatchingFishGsonPicasso;
import kotlin.text.CatchingFishLifecycleBundle;

/* loaded from: classes.dex */
public class CctBackendFactory {
    public CatchingFishAdMobCoroutine create(CatchingFishGraphQLContext catchingFishGraphQLContext) {
        CatchingFishLifecycleBundle catchingFishLifecycleBundle = (CatchingFishLifecycleBundle) catchingFishGraphQLContext;
        return new CatchingFishGsonPicasso(catchingFishLifecycleBundle.CatchingFishParcelableFAB, catchingFishLifecycleBundle.CatchingFishSnackbar, catchingFishLifecycleBundle.CatchingFishCoroutine);
    }
}
