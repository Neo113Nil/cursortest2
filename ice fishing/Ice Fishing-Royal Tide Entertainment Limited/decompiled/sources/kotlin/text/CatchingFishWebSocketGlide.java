package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketGlide extends CatchingFishMVPEspresso implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean CatchingFish;
    public View CatchingFishAnimationMockk;
    public final CatchingFishMVVMToastRoom CatchingFishCloudMessaging;
    public int CatchingFishCoroutineFlow;
    public final Context CatchingFishDaggerWebsocket;
    public final int CatchingFishFragmentHandler;
    public boolean CatchingFishJetpackCompose;
    public final int CatchingFishLayout;
    public ViewTreeObserver CatchingFishNavigation;
    public CatchingFishDaggerAdMob CatchingFishRoomDatabase;
    public boolean CatchingFishSpannableWidget;
    public View CatchingFishStateLiveData;
    public PopupWindow.OnDismissListener CatchingFishUnitTesting;
    public final boolean CatchingFishViewModelFAB;
    public final CatchingFishDatabindingKtor CatchingFishViewModelScope;
    public final CatchingFishSharedFlowAdMob CatchingFishWorkManager;
    public final CatchingFishMVPStateFlow CatchingFishEspressoTesting = new CatchingFishMVPStateFlow(3, this);
    public final CatchingFishToastWidget CatchingFishOkHttp = new CatchingFishToastWidget(7, this);
    public int CatchingFishDaggerHiltFAB = 0;

    public CatchingFishWebSocketGlide(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, View view, int i, boolean z) {
        this.CatchingFishDaggerWebsocket = context;
        this.CatchingFishWorkManager = catchingFishSharedFlowAdMob;
        this.CatchingFishViewModelFAB = z;
        this.CatchingFishViewModelScope = new CatchingFishDatabindingKtor(catchingFishSharedFlowAdMob, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.CatchingFishFragmentHandler = i;
        Resources resources = context.getResources();
        this.CatchingFishLayout = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.CatchingFishAnimationMockk = view;
        this.CatchingFishCloudMessaging = new CatchingFishMVVMToastRoom(context, null, i, 0);
        catchingFishSharedFlowAdMob.CatchingFishSnackbar(this, context);
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFish(boolean z) {
        this.CatchingFishSpannableWidget = z;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishAnimationMockk(boolean z) {
        this.CatchingFishViewModelScope.CatchingFishCoroutine = z;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCoroutine(CatchingFishGradleLifecycle catchingFishGradleLifecycle) {
        boolean z;
        if (catchingFishGradleLifecycle.hasVisibleItems()) {
            CatchingFishToastParcelable catchingFishToastParcelable = new CatchingFishToastParcelable(this.CatchingFishDaggerWebsocket, catchingFishGradleLifecycle, this.CatchingFishStateLiveData, this.CatchingFishViewModelFAB, this.CatchingFishFragmentHandler, 0);
            CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishRoomDatabase;
            catchingFishToastParcelable.CatchingFishViewModelFAB = catchingFishDaggerAdMob;
            CatchingFishMVPEspresso catchingFishMVPEspresso = catchingFishToastParcelable.CatchingFishLayout;
            if (catchingFishMVPEspresso != null) {
                catchingFishMVPEspresso.CatchingFishFragmentHandler(catchingFishDaggerAdMob);
            }
            int size = catchingFishGradleLifecycle.CatchingFishWorkManager.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = catchingFishGradleLifecycle.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            catchingFishToastParcelable.CatchingFishViewModelScope = z;
            CatchingFishMVPEspresso catchingFishMVPEspresso2 = catchingFishToastParcelable.CatchingFishLayout;
            if (catchingFishMVPEspresso2 != null) {
                catchingFishMVPEspresso2.CatchingFishAnimationMockk(z);
            }
            catchingFishToastParcelable.CatchingFishFragmentHandler = this.CatchingFishUnitTesting;
            this.CatchingFishUnitTesting = null;
            this.CatchingFishWorkManager.CatchingFishCoroutine(false);
            CatchingFishMVVMToastRoom catchingFishMVVMToastRoom = this.CatchingFishCloudMessaging;
            int i2 = catchingFishMVVMToastRoom.CatchingFishLayout;
            int CatchingFishUnitTesting = catchingFishMVVMToastRoom.CatchingFishUnitTesting();
            if ((Gravity.getAbsoluteGravity(this.CatchingFishDaggerHiltFAB, this.CatchingFishAnimationMockk.getLayoutDirection()) & 7) == 5) {
                i2 += this.CatchingFishAnimationMockk.getWidth();
            }
            if (!catchingFishToastParcelable.CatchingFishSnackbar()) {
                if (catchingFishToastParcelable.CatchingFishDaggerWebsocket != null) {
                    catchingFishToastParcelable.CatchingFishReduxKtor(i2, CatchingFishUnitTesting, true, true);
                }
            }
            CatchingFishDaggerAdMob catchingFishDaggerAdMob2 = this.CatchingFishRoomDatabase;
            if (catchingFishDaggerAdMob2 != null) {
                catchingFishDaggerAdMob2.CatchingFishViewModelScope(catchingFishGradleLifecycle);
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishFragmentHandler(CatchingFishDaggerAdMob catchingFishDaggerAdMob) {
        this.CatchingFishRoomDatabase = catchingFishDaggerAdMob;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishJetpackCompose(int i) {
        this.CatchingFishCloudMessaging.CatchingFishFragmentHandler(i);
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishLayout() {
        return false;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishNavigation(PopupWindow.OnDismissListener onDismissListener) {
        this.CatchingFishUnitTesting = onDismissListener;
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final boolean CatchingFishParcelableFAB() {
        return !this.CatchingFish && this.CatchingFishCloudMessaging.CatchingFishMVPRobolectric.isShowing();
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void CatchingFishReduxKtor() {
        View view;
        if (CatchingFishParcelableFAB()) {
            return;
        }
        if (this.CatchingFish || (view = this.CatchingFishAnimationMockk) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.CatchingFishStateLiveData = view;
        CatchingFishMVVMToastRoom catchingFishMVVMToastRoom = this.CatchingFishCloudMessaging;
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setOnDismissListener(this);
        catchingFishMVVMToastRoom.CatchingFish = this;
        catchingFishMVVMToastRoom.CatchingFishCardViewView = true;
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setFocusable(true);
        View view2 = this.CatchingFishStateLiveData;
        boolean z = this.CatchingFishNavigation == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.CatchingFishNavigation = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.CatchingFishEspressoTesting);
        }
        view2.addOnAttachStateChangeListener(this.CatchingFishOkHttp);
        catchingFishMVVMToastRoom.CatchingFishNavigation = view2;
        catchingFishMVVMToastRoom.CatchingFishAnimationMockk = this.CatchingFishDaggerHiltFAB;
        boolean z2 = this.CatchingFishJetpackCompose;
        Context context = this.CatchingFishDaggerWebsocket;
        CatchingFishDatabindingKtor catchingFishDatabindingKtor = this.CatchingFishViewModelScope;
        if (!z2) {
            this.CatchingFishCoroutineFlow = CatchingFishMVPEspresso.CatchingFishOkHttp(catchingFishDatabindingKtor, context, this.CatchingFishLayout);
            this.CatchingFishJetpackCompose = true;
        }
        catchingFishMVVMToastRoom.CatchingFishNavigation(this.CatchingFishCoroutineFlow);
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setInputMethodMode(2);
        Rect rect = this.CatchingFishReduxKtor;
        catchingFishMVVMToastRoom.CatchingFishPayPal = rect != null ? new Rect(rect) : null;
        catchingFishMVVMToastRoom.CatchingFishReduxKtor();
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = catchingFishMVVMToastRoom.CatchingFishWorkManager;
        catchingFishCameraXOkHttp.setOnKeyListener(this);
        if (this.CatchingFishSpannableWidget) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishWorkManager;
            if (catchingFishSharedFlowAdMob.CatchingFishOkHttp != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) catchingFishCameraXOkHttp, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(catchingFishSharedFlowAdMob.CatchingFishOkHttp);
                }
                frameLayout.setEnabled(false);
                catchingFishCameraXOkHttp.addHeaderView(frameLayout, null, false);
            }
        }
        catchingFishMVVMToastRoom.CatchingFishStateLiveData(catchingFishDatabindingKtor);
        catchingFishMVVMToastRoom.CatchingFishReduxKtor();
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishRoomDatabase(int i) {
        this.CatchingFishCloudMessaging.CatchingFishLayout = i;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        if (catchingFishSharedFlowAdMob != this.CatchingFishWorkManager) {
            return;
        }
        dismiss();
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishRoomDatabase;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishSnackbar(catchingFishSharedFlowAdMob, z);
        }
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishStateLiveData(int i) {
        this.CatchingFishDaggerHiltFAB = i;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishUnitTesting(View view) {
        this.CatchingFishAnimationMockk = view;
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final CatchingFishCameraXOkHttp CatchingFishViewModelScope() {
        return this.CatchingFishCloudMessaging.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishWorkManager() {
        this.CatchingFishJetpackCompose = false;
        CatchingFishDatabindingKtor catchingFishDatabindingKtor = this.CatchingFishViewModelScope;
        if (catchingFishDatabindingKtor != null) {
            catchingFishDatabindingKtor.notifyDataSetChanged();
        }
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void dismiss() {
        if (CatchingFishParcelableFAB()) {
            this.CatchingFishCloudMessaging.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.CatchingFish = true;
        this.CatchingFishWorkManager.CatchingFishCoroutine(true);
        ViewTreeObserver viewTreeObserver = this.CatchingFishNavigation;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.CatchingFishNavigation = this.CatchingFishStateLiveData.getViewTreeObserver();
            }
            this.CatchingFishNavigation.removeGlobalOnLayoutListener(this.CatchingFishEspressoTesting);
            this.CatchingFishNavigation = null;
        }
        this.CatchingFishStateLiveData.removeOnAttachStateChangeListener(this.CatchingFishOkHttp);
        PopupWindow.OnDismissListener onDismissListener = this.CatchingFishUnitTesting;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishEspressoTesting(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
    }
}
