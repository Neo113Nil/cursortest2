package kotlin.text;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.adjust.sdk.network.ErrorCodes;

/* loaded from: classes.dex */
public final class CatchingFishEspressoGraphQL implements CatchingFishDaggerHiltGson, AdapterView.OnItemClickListener {
    public LayoutInflater CatchingFishDaggerWebsocket;
    public CatchingFishRoomIntent CatchingFishLayout;
    public Context CatchingFishReduxKtor;
    public CatchingFishDaggerAdMob CatchingFishViewModelFAB;
    public ExpandedMenuView CatchingFishViewModelScope;
    public CatchingFishSharedFlowAdMob CatchingFishWorkManager;

    public CatchingFishEspressoGraphQL(ContextWrapper contextWrapper) {
        this.CatchingFishReduxKtor = contextWrapper;
        this.CatchingFishDaggerWebsocket = LayoutInflater.from(contextWrapper);
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCloudMessaging(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCoroutine(CatchingFishGradleLifecycle catchingFishGradleLifecycle) {
        boolean hasVisibleItems = catchingFishGradleLifecycle.hasVisibleItems();
        Context context = catchingFishGradleLifecycle.CatchingFishParcelableFAB;
        if (!hasVisibleItems) {
            return false;
        }
        CatchingFishGraphQLGson catchingFishGraphQLGson = new CatchingFishGraphQLGson();
        catchingFishGraphQLGson.CatchingFishReduxKtor = catchingFishGradleLifecycle;
        CatchingFishRoomManifest catchingFishRoomManifest = new CatchingFishRoomManifest(context);
        CatchingFishCardView catchingFishCardView = (CatchingFishCardView) catchingFishRoomManifest.CatchingFishDaggerWebsocket;
        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = new CatchingFishEspressoGraphQL(catchingFishCardView.CatchingFishParcelableFAB);
        catchingFishGraphQLGson.CatchingFishWorkManager = catchingFishEspressoGraphQL;
        catchingFishEspressoGraphQL.CatchingFishViewModelFAB = catchingFishGraphQLGson;
        catchingFishGradleLifecycle.CatchingFishSnackbar(catchingFishEspressoGraphQL, context);
        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL2 = catchingFishGraphQLGson.CatchingFishWorkManager;
        if (catchingFishEspressoGraphQL2.CatchingFishLayout == null) {
            catchingFishEspressoGraphQL2.CatchingFishLayout = new CatchingFishRoomIntent(catchingFishEspressoGraphQL2);
        }
        catchingFishCardView.CatchingFishViewModelScope = catchingFishEspressoGraphQL2.CatchingFishLayout;
        catchingFishCardView.CatchingFishViewModelFAB = catchingFishGraphQLGson;
        View view = catchingFishGradleLifecycle.CatchingFishAnimationMockk;
        if (view != null) {
            catchingFishCardView.CatchingFishDaggerWebsocket = view;
        } else {
            catchingFishCardView.CatchingFishCoroutine = catchingFishGradleLifecycle.CatchingFishUnitTesting;
            catchingFishCardView.CatchingFishReduxKtor = catchingFishGradleLifecycle.CatchingFishOkHttp;
        }
        catchingFishCardView.CatchingFishWorkManager = catchingFishGraphQLGson;
        CatchingFishRoomStripeAPI CatchingFishReduxKtor = catchingFishRoomManifest.CatchingFishReduxKtor();
        catchingFishGraphQLGson.CatchingFishDaggerWebsocket = CatchingFishReduxKtor;
        CatchingFishReduxKtor.setOnDismissListener(catchingFishGraphQLGson);
        WindowManager.LayoutParams attributes = catchingFishGraphQLGson.CatchingFishDaggerWebsocket.getWindow().getAttributes();
        attributes.type = ErrorCodes.MALFORMED_URL_EXCEPTION;
        attributes.flags |= 131072;
        catchingFishGraphQLGson.CatchingFishDaggerWebsocket.show();
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishViewModelFAB;
        if (catchingFishDaggerAdMob == null) {
            return true;
        }
        catchingFishDaggerAdMob.CatchingFishViewModelScope(catchingFishGradleLifecycle);
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishDaggerWebsocket(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        if (this.CatchingFishReduxKtor != null) {
            this.CatchingFishReduxKtor = context;
            if (this.CatchingFishDaggerWebsocket == null) {
                this.CatchingFishDaggerWebsocket = LayoutInflater.from(context);
            }
        }
        this.CatchingFishWorkManager = catchingFishSharedFlowAdMob;
        CatchingFishRoomIntent catchingFishRoomIntent = this.CatchingFishLayout;
        if (catchingFishRoomIntent != null) {
            catchingFishRoomIntent.notifyDataSetChanged();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishFragmentHandler(CatchingFishDaggerAdMob catchingFishDaggerAdMob) {
        throw null;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishLayout() {
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishViewModelFAB;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishSnackbar(catchingFishSharedFlowAdMob, z);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishViewModelFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishWorkManager() {
        CatchingFishRoomIntent catchingFishRoomIntent = this.CatchingFishLayout;
        if (catchingFishRoomIntent != null) {
            catchingFishRoomIntent.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.CatchingFishWorkManager.CatchingFishRoomDatabase(this.CatchingFishLayout.getItem(i), this, 0);
    }
}
