package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishJUnitMoshi implements CatchingFishManifestJUnit {
    public final CatchingFishReduxAndroidX CatchingFishParcelableFAB;
    public final boolean CatchingFishSnackbar;

    public CatchingFishJUnitMoshi(CatchingFishReduxAndroidX catchingFishReduxAndroidX, boolean z) {
        this.CatchingFishParcelableFAB = catchingFishReduxAndroidX;
        this.CatchingFishSnackbar = z;
    }

    @Override // kotlin.text.CatchingFishManifestJUnit
    public final CatchingFishSharedFlowMVP CatchingFishParcelableFAB(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout, List list, long j) {
        long j2;
        long CatchingFishParcelableFAB;
        CatchingFishPicassoMVI CatchingFishSnackbar;
        int i;
        int i2;
        if (list.isEmpty()) {
            return catchingFishWidgetXMLLayout.CatchingFishFirebase(CatchingFishGradleGraphQL.CatchingFishLayout(j), CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j), CatchingFishMVI.CatchingFishAnimationMockk);
        }
        if (this.CatchingFishSnackbar) {
            j2 = j;
            CatchingFishParcelableFAB = j2;
        } else {
            j2 = j;
            CatchingFishParcelableFAB = CatchingFishGradleGraphQL.CatchingFishParcelableFAB(0, 0, j2);
        }
        if (list.size() == 1) {
            CatchingFishWidgetDagger catchingFishWidgetDagger = (CatchingFishWidgetDagger) list.get(0);
            Object CatchingFishCloudMessaging = catchingFishWidgetDagger.CatchingFishCloudMessaging();
            CatchingFishMockkContext catchingFishMockkContext = CatchingFishCloudMessaging instanceof CatchingFishMockkContext ? (CatchingFishMockkContext) CatchingFishCloudMessaging : null;
            if (catchingFishMockkContext != null ? catchingFishMockkContext.CatchingFish : false) {
                int CatchingFishLayout = CatchingFishGradleGraphQL.CatchingFishLayout(j2);
                int CatchingFishViewModelFAB = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j2);
                int CatchingFishLayout2 = CatchingFishGradleGraphQL.CatchingFishLayout(j2);
                int CatchingFishViewModelFAB2 = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j2);
                if (!((CatchingFishViewModelFAB2 >= 0) & (CatchingFishLayout2 >= 0))) {
                    CatchingFishDaggerService.CatchingFishParcelableFAB("width and height must be >= 0");
                }
                CatchingFishSnackbar = catchingFishWidgetDagger.CatchingFishSnackbar(CatchingFishAsyncTaskGradle.CatchingFishWorkManager(CatchingFishLayout2, CatchingFishLayout2, CatchingFishViewModelFAB2, CatchingFishViewModelFAB2));
                i = CatchingFishLayout;
                i2 = CatchingFishViewModelFAB;
            } else {
                CatchingFishPicassoMVI CatchingFishSnackbar2 = catchingFishWidgetDagger.CatchingFishSnackbar(CatchingFishParcelableFAB);
                int max = Math.max(CatchingFishGradleGraphQL.CatchingFishLayout(j2), CatchingFishSnackbar2.CatchingFishReduxKtor);
                i2 = Math.max(CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j2), CatchingFishSnackbar2.CatchingFishDaggerWebsocket);
                i = max;
                CatchingFishSnackbar = CatchingFishSnackbar2;
            }
            return catchingFishWidgetXMLLayout.CatchingFishFirebase(i, i2, new CatchingFishSpannableKtor(CatchingFishSnackbar, catchingFishWidgetDagger, catchingFishWidgetXMLLayout, i, i2, this));
        }
        CatchingFishPicassoMVI[] catchingFishPicassoMVIArr = new CatchingFishPicassoMVI[list.size()];
        CatchingFishAdMobRoom catchingFishAdMobRoom = new CatchingFishAdMobRoom();
        catchingFishAdMobRoom.CatchingFishReduxKtor = CatchingFishGradleGraphQL.CatchingFishLayout(j);
        CatchingFishAdMobRoom catchingFishAdMobRoom2 = new CatchingFishAdMobRoom();
        catchingFishAdMobRoom2.CatchingFishReduxKtor = CatchingFishGradleGraphQL.CatchingFishViewModelFAB(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            CatchingFishWidgetDagger catchingFishWidgetDagger2 = (CatchingFishWidgetDagger) list.get(i3);
            Object CatchingFishCloudMessaging2 = catchingFishWidgetDagger2.CatchingFishCloudMessaging();
            CatchingFishMockkContext catchingFishMockkContext2 = CatchingFishCloudMessaging2 instanceof CatchingFishMockkContext ? (CatchingFishMockkContext) CatchingFishCloudMessaging2 : null;
            if (catchingFishMockkContext2 != null ? catchingFishMockkContext2.CatchingFish : false) {
                z = true;
            } else {
                CatchingFishPicassoMVI CatchingFishSnackbar3 = catchingFishWidgetDagger2.CatchingFishSnackbar(CatchingFishParcelableFAB);
                catchingFishPicassoMVIArr[i3] = CatchingFishSnackbar3;
                catchingFishAdMobRoom.CatchingFishReduxKtor = Math.max(catchingFishAdMobRoom.CatchingFishReduxKtor, CatchingFishSnackbar3.CatchingFishReduxKtor);
                catchingFishAdMobRoom2.CatchingFishReduxKtor = Math.max(catchingFishAdMobRoom2.CatchingFishReduxKtor, CatchingFishSnackbar3.CatchingFishDaggerWebsocket);
            }
        }
        if (z) {
            int i4 = catchingFishAdMobRoom.CatchingFishReduxKtor;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = catchingFishAdMobRoom2.CatchingFishReduxKtor;
            long CatchingFishParcelableFAB2 = CatchingFishAsyncTaskGradle.CatchingFishParcelableFAB(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                CatchingFishWidgetDagger catchingFishWidgetDagger3 = (CatchingFishWidgetDagger) list.get(i7);
                Object CatchingFishCloudMessaging3 = catchingFishWidgetDagger3.CatchingFishCloudMessaging();
                CatchingFishMockkContext catchingFishMockkContext3 = CatchingFishCloudMessaging3 instanceof CatchingFishMockkContext ? (CatchingFishMockkContext) CatchingFishCloudMessaging3 : null;
                if (catchingFishMockkContext3 != null ? catchingFishMockkContext3.CatchingFish : false) {
                    catchingFishPicassoMVIArr[i7] = catchingFishWidgetDagger3.CatchingFishSnackbar(CatchingFishParcelableFAB2);
                }
            }
        }
        return catchingFishWidgetXMLLayout.CatchingFishFirebase(catchingFishAdMobRoom.CatchingFishReduxKtor, catchingFishAdMobRoom2.CatchingFishReduxKtor, new CatchingFishViewViewModel(catchingFishPicassoMVIArr, list, catchingFishWidgetXMLLayout, catchingFishAdMobRoom, catchingFishAdMobRoom2, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishJUnitMoshi)) {
            return false;
        }
        CatchingFishJUnitMoshi catchingFishJUnitMoshi = (CatchingFishJUnitMoshi) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishJUnitMoshi.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishJUnitMoshi.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.CatchingFishSnackbar) + (this.CatchingFishParcelableFAB.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.CatchingFishParcelableFAB + ", propagateMinConstraints=" + this.CatchingFishSnackbar + ')';
    }
}
