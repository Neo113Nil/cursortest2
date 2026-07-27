package kotlin.text;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishRoomManifest implements CatchingFishFluxBiometric {
    public Object CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishRoomManifest(int i, Object obj) {
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishReduxKtor = i;
    }

    public boolean CatchingFishCoroutine(long j) {
        int i = this.CatchingFishReduxKtor;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.CatchingFishDaggerWebsocket)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void CatchingFishDaggerWebsocket(long j) {
        int i = this.CatchingFishReduxKtor;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.CatchingFishDaggerWebsocket)[i2]) {
                int i3 = this.CatchingFishReduxKtor - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.CatchingFishDaggerWebsocket;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.CatchingFishReduxKtor--;
                return;
            }
            i2++;
        }
    }

    public void CatchingFishParcelableFAB(long j) {
        if (CatchingFishCoroutine(j)) {
            return;
        }
        int i = this.CatchingFishReduxKtor;
        long[] jArr = (long[]) this.CatchingFishDaggerWebsocket;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(jArr, "copyOf(...)");
            this.CatchingFishDaggerWebsocket = jArr;
        }
        jArr[i] = j;
        if (i >= this.CatchingFishReduxKtor) {
            this.CatchingFishReduxKtor = i + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public CatchingFishRoomStripeAPI CatchingFishReduxKtor() {
        CatchingFishCardView catchingFishCardView = (CatchingFishCardView) this.CatchingFishDaggerWebsocket;
        CatchingFishRoomStripeAPI catchingFishRoomStripeAPI = new CatchingFishRoomStripeAPI(catchingFishCardView.CatchingFishParcelableFAB, this.CatchingFishReduxKtor);
        View view = catchingFishCardView.CatchingFishDaggerWebsocket;
        CatchingFishMVPWebsocket catchingFishMVPWebsocket = catchingFishRoomStripeAPI.CatchingFishFragmentHandler;
        if (view != null) {
            catchingFishMVPWebsocket.CatchingFishUnitTesting = view;
        } else {
            CharSequence charSequence = catchingFishCardView.CatchingFishReduxKtor;
            if (charSequence != null) {
                catchingFishMVPWebsocket.CatchingFishReduxKtor = charSequence;
                TextView textView = catchingFishMVPWebsocket.CatchingFishEspressoTesting;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = catchingFishCardView.CatchingFishCoroutine;
            if (drawable != null) {
                catchingFishMVPWebsocket.CatchingFishFragmentHandler = drawable;
                ImageView imageView = catchingFishMVPWebsocket.CatchingFishCloudMessaging;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    catchingFishMVPWebsocket.CatchingFishCloudMessaging.setImageDrawable(drawable);
                }
            }
        }
        if (catchingFishCardView.CatchingFishViewModelScope != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) catchingFishCardView.CatchingFishSnackbar.inflate(catchingFishMVPWebsocket.CatchingFishNavigation, (ViewGroup) null);
            int i = catchingFishCardView.CatchingFishLayout ? catchingFishMVPWebsocket.CatchingFish : catchingFishMVPWebsocket.CatchingFishJetpackCompose;
            Object obj = catchingFishCardView.CatchingFishViewModelScope;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new CatchingFishWebSocketRealm(catchingFishCardView.CatchingFishParcelableFAB, i, R.id.text1, null);
            }
            catchingFishMVPWebsocket.CatchingFishAnimationMockk = r7;
            catchingFishMVPWebsocket.CatchingFishStateLiveData = catchingFishCardView.CatchingFishFragmentHandler;
            if (catchingFishCardView.CatchingFishViewModelFAB != null) {
                alertController$RecycleListView.setOnItemClickListener(new CatchingFishMVPOkHttp(catchingFishCardView, catchingFishMVPWebsocket));
            }
            if (catchingFishCardView.CatchingFishLayout) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            catchingFishMVPWebsocket.CatchingFishDaggerWebsocket = alertController$RecycleListView;
        }
        catchingFishRoomStripeAPI.setCancelable(true);
        catchingFishRoomStripeAPI.setCanceledOnTouchOutside(true);
        catchingFishRoomStripeAPI.setOnCancelListener(null);
        catchingFishRoomStripeAPI.setOnDismissListener(null);
        CatchingFishGraphQLGson catchingFishGraphQLGson = catchingFishCardView.CatchingFishWorkManager;
        if (catchingFishGraphQLGson != null) {
            catchingFishRoomStripeAPI.setOnKeyListener(catchingFishGraphQLGson);
        }
        return catchingFishRoomStripeAPI;
    }

    @Override // kotlin.text.CatchingFishFluxBiometric
    public boolean CatchingFishSnackbar(View view) {
        ((BottomSheetBehavior) this.CatchingFishDaggerWebsocket).CatchingFishCardViewView(this.CatchingFishReduxKtor);
        return true;
    }

    public /* synthetic */ CatchingFishRoomManifest(ArrayList arrayList) {
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = arrayList;
    }

    public CatchingFishRoomManifest(ConnectionResult connectionResult, int i) {
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(connectionResult);
        this.CatchingFishDaggerWebsocket = connectionResult;
        this.CatchingFishReduxKtor = i;
    }

    public CatchingFishRoomManifest(Context context) {
        int CatchingFishViewModelFAB = CatchingFishRoomStripeAPI.CatchingFishViewModelFAB(context, 0);
        this.CatchingFishDaggerWebsocket = new CatchingFishCardView(new ContextThemeWrapper(context, CatchingFishRoomStripeAPI.CatchingFishViewModelFAB(context, CatchingFishViewModelFAB)));
        this.CatchingFishReduxKtor = CatchingFishViewModelFAB;
    }
}
