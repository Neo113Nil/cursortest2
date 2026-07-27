package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.catchingfish.fishcatcherpro.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CatchingFishMVPWebsocket {
    public final int CatchingFish;
    public ListAdapter CatchingFishAnimationMockk;
    public ImageView CatchingFishCloudMessaging;
    public final Window CatchingFishCoroutine;
    public final boolean CatchingFishCoroutineFlow;
    public final CatchingFishLiveDataBundle CatchingFishDaggerHiltFAB;
    public AlertController$RecycleListView CatchingFishDaggerWebsocket;
    public TextView CatchingFishEspressoTesting;
    public Drawable CatchingFishFragmentHandler;
    public final int CatchingFishJetpackCompose;
    public NestedScrollView CatchingFishLayout;
    public final int CatchingFishNavigation;
    public TextView CatchingFishOkHttp;
    public final Context CatchingFishParcelableFAB;
    public CharSequence CatchingFishReduxKtor;
    public final int CatchingFishRoomDatabase;
    public final CatchingFishRoomStripeAPI CatchingFishSnackbar;
    public View CatchingFishUnitTesting;
    public Button CatchingFishViewModelFAB;
    public Button CatchingFishViewModelScope;
    public Button CatchingFishWorkManager;
    public int CatchingFishStateLiveData = -1;
    public final CatchingFishToolbarCameraX CatchingFishSpannableWidget = new CatchingFishToolbarCameraX(1, this);

    public CatchingFishMVPWebsocket(Context context, CatchingFishRoomStripeAPI catchingFishRoomStripeAPI, Window window) {
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishSnackbar = catchingFishRoomStripeAPI;
        this.CatchingFishCoroutine = window;
        CatchingFishLiveDataBundle catchingFishLiveDataBundle = new CatchingFishLiveDataBundle();
        catchingFishLiveDataBundle.CatchingFishParcelableFAB = new WeakReference(catchingFishRoomStripeAPI);
        this.CatchingFishDaggerHiltFAB = catchingFishLiveDataBundle;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, CatchingFishWidgetGlide.CatchingFishDaggerWebsocket, R.attr.alertDialogStyle, 0);
        this.CatchingFishRoomDatabase = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.CatchingFishNavigation = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.CatchingFish = obtainStyledAttributes.getResourceId(7, 0);
        this.CatchingFishJetpackCompose = obtainStyledAttributes.getResourceId(3, 0);
        this.CatchingFishCoroutineFlow = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        catchingFishRoomStripeAPI.CatchingFishWorkManager().CatchingFishDaggerWebsocket(1);
    }

    public static ViewGroup CatchingFishParcelableFAB(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
