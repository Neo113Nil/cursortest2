package kotlin.text;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import kotlin.text.CatchingFishAppCompatMockk;
import kotlin.text.CatchingFishFABStripeAPIFAB;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatMockk implements View.OnDragListener, CatchingFishBiometricRedux {
    public final AndroidDragAndDropManager$modifier$1 CatchingFishCoroutine;
    public final CatchingFishMVPAdMobGraphQL CatchingFishParcelableFAB;
    public final CatchingFishRoomStateFlow CatchingFishSnackbar;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public CatchingFishAppCompatMockk() {
        CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL = new CatchingFishMVPAdMobGraphQL();
        catchingFishMVPAdMobGraphQL.CatchingFishJetpackCompose = 0L;
        this.CatchingFishParcelableFAB = catchingFishMVPAdMobGraphQL;
        this.CatchingFishSnackbar = new CatchingFishRoomStateFlow(0);
        this.CatchingFishCoroutine = new CatchingFishAppCompatMVVM() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            @Override // kotlin.text.CatchingFishAppCompatMVVM
            public final /* bridge */ /* synthetic */ void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
            }

            @Override // kotlin.text.CatchingFishAppCompatMVVM
            public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
                return CatchingFishAppCompatMockk.this.CatchingFishParcelableFAB;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return CatchingFishAppCompatMockk.this.CatchingFishParcelableFAB.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(5, dragEvent);
        int action = dragEvent.getAction();
        CatchingFishContextFluxGson catchingFishContextFluxGson = CatchingFishContextFluxGson.CatchingFishReduxKtor;
        CatchingFishRoomStateFlow catchingFishRoomStateFlow = this.CatchingFishSnackbar;
        CatchingFishMVPAdMobGraphQL catchingFishMVPAdMobGraphQL = this.CatchingFishParcelableFAB;
        switch (action) {
            case 1:
                CatchingFishFragmentWidget catchingFishFragmentWidget = new CatchingFishFragmentWidget();
                CatchingFishMVVM catchingFishMVVM = new CatchingFishMVVM(catchingFishViewPagerMockk, catchingFishMVPAdMobGraphQL, catchingFishFragmentWidget);
                if (catchingFishMVVM.CatchingFishFragmentHandler(catchingFishMVPAdMobGraphQL) == catchingFishContextFluxGson) {
                    CatchingFishToastHiltBundle.CatchingFishFragmentFactory(catchingFishMVPAdMobGraphQL, catchingFishMVVM);
                }
                boolean z = catchingFishFragmentWidget.CatchingFishReduxKtor;
                catchingFishRoomStateFlow.getClass();
                CatchingFishHiltToast catchingFishHiltToast = new CatchingFishHiltToast(catchingFishRoomStateFlow);
                while (catchingFishHiltToast.hasNext()) {
                    ((CatchingFishMVPAdMobGraphQL) catchingFishHiltToast.next()).CatchingFishFragmentFactory(catchingFishViewPagerMockk);
                }
                break;
            case 2:
                catchingFishMVPAdMobGraphQL.CatchingFishCustomView(catchingFishViewPagerMockk);
                break;
            case 4:
                CatchingFishMVVM catchingFishMVVM2 = new CatchingFishMVVM(9, catchingFishViewPagerMockk);
                if (catchingFishMVVM2.CatchingFishFragmentHandler(catchingFishMVPAdMobGraphQL) == catchingFishContextFluxGson) {
                    CatchingFishToastHiltBundle.CatchingFishFragmentFactory(catchingFishMVPAdMobGraphQL, catchingFishMVVM2);
                }
                catchingFishRoomStateFlow.clear();
                break;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                catchingFishMVPAdMobGraphQL.CatchingFishCardViewView(catchingFishViewPagerMockk);
                break;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                catchingFishMVPAdMobGraphQL.CatchingFishMVPRobolectric(catchingFishViewPagerMockk);
                break;
        }
        return false;
    }
}
