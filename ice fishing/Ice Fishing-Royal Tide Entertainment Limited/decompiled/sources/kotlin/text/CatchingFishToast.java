package kotlin.text;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishToast implements CatchingFishDaggerHiltGson {
    public int CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public CatchingFishOkHttpPicasso CatchingFishCloudMessaging;
    public CatchingFishRecyclerView CatchingFishDaggerHiltFAB;
    public Context CatchingFishDaggerWebsocket;
    public CatchingFishFragment CatchingFishEspressoTesting;
    public CatchingFishServiceKtor CatchingFishGsonAppCompat;
    public boolean CatchingFishJetpackCompose;
    public int CatchingFishNavigation;
    public Drawable CatchingFishOkHttp;
    public CatchingFishService CatchingFishParcelableFlux;
    public final Context CatchingFishReduxKtor;
    public int CatchingFishRoomDatabase;
    public CatchingFishRecyclerView CatchingFishSpannableWidget;
    public boolean CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public CatchingFishDaggerAdMob CatchingFishViewModelFAB;
    public final LayoutInflater CatchingFishViewModelScope;
    public CatchingFishSharedFlowAdMob CatchingFishWorkManager;
    public final int CatchingFishLayout = R.layout.abc_action_menu_layout;
    public final int CatchingFishFragmentHandler = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray CatchingFishCoroutineFlow = new SparseBooleanArray();
    public final CatchingFishServiceHilt CatchingFishCardViewRealm = new CatchingFishServiceHilt(5, this);

    public CatchingFishToast(Context context) {
        this.CatchingFishReduxKtor = context;
        this.CatchingFishViewModelScope = LayoutInflater.from(context);
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCloudMessaging(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCoroutine(CatchingFishGradleLifecycle catchingFishGradleLifecycle) {
        boolean z;
        if (catchingFishGradleLifecycle.hasVisibleItems()) {
            CatchingFishGradleLifecycle catchingFishGradleLifecycle2 = catchingFishGradleLifecycle;
            while (true) {
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishGradleLifecycle2.CatchingFishCardViewRealm;
                if (catchingFishSharedFlowAdMob == this.CatchingFishWorkManager) {
                    break;
                }
                catchingFishGradleLifecycle2 = (CatchingFishGradleLifecycle) catchingFishSharedFlowAdMob;
            }
            CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishGradleLifecycle2.CatchingFishPayPal;
            ViewGroup viewGroup = (ViewGroup) this.CatchingFishCloudMessaging;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof CatchingFishWidgetStateFlow) && ((CatchingFishWidgetStateFlow) childAt).getItemData() == catchingFishKtorAdMob) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                catchingFishGradleLifecycle.CatchingFishPayPal.getClass();
                int size = catchingFishGradleLifecycle.CatchingFishWorkManager.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = catchingFishGradleLifecycle.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                CatchingFishRecyclerView catchingFishRecyclerView = new CatchingFishRecyclerView(this, this.CatchingFishDaggerWebsocket, catchingFishGradleLifecycle, view);
                this.CatchingFishSpannableWidget = catchingFishRecyclerView;
                catchingFishRecyclerView.CatchingFishViewModelScope = z;
                CatchingFishMVPEspresso catchingFishMVPEspresso = catchingFishRecyclerView.CatchingFishLayout;
                if (catchingFishMVPEspresso != null) {
                    catchingFishMVPEspresso.CatchingFishAnimationMockk(z);
                }
                CatchingFishRecyclerView catchingFishRecyclerView2 = this.CatchingFishSpannableWidget;
                if (!catchingFishRecyclerView2.CatchingFishSnackbar()) {
                    if (catchingFishRecyclerView2.CatchingFishDaggerWebsocket == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    catchingFishRecyclerView2.CatchingFishReduxKtor(0, 0, false, false);
                }
                CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishViewModelFAB;
                if (catchingFishDaggerAdMob != null) {
                    catchingFishDaggerAdMob.CatchingFishViewModelScope(catchingFishGradleLifecycle);
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishDaggerWebsocket(Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        this.CatchingFishDaggerWebsocket = context;
        LayoutInflater.from(context);
        this.CatchingFishWorkManager = catchingFishSharedFlowAdMob;
        Resources resources = context.getResources();
        if (!this.CatchingFishStateLiveData) {
            this.CatchingFishAnimationMockk = true;
        }
        int i = 2;
        this.CatchingFishRoomDatabase = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.CatchingFish = i;
        int i4 = this.CatchingFishRoomDatabase;
        if (this.CatchingFishAnimationMockk) {
            if (this.CatchingFishEspressoTesting == null) {
                CatchingFishFragment catchingFishFragment = new CatchingFishFragment(this, this.CatchingFishReduxKtor);
                this.CatchingFishEspressoTesting = catchingFishFragment;
                if (this.CatchingFishUnitTesting) {
                    catchingFishFragment.setImageDrawable(this.CatchingFishOkHttp);
                    this.CatchingFishOkHttp = null;
                    this.CatchingFishUnitTesting = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.CatchingFishEspressoTesting.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.CatchingFishEspressoTesting.getMeasuredWidth();
        } else {
            this.CatchingFishEspressoTesting = null;
        }
        this.CatchingFishNavigation = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean CatchingFishEspressoTesting() {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob;
        if (!this.CatchingFishAnimationMockk || CatchingFishViewModelScope() || (catchingFishSharedFlowAdMob = this.CatchingFishWorkManager) == null || this.CatchingFishCloudMessaging == null || this.CatchingFishParcelableFlux != null) {
            return false;
        }
        catchingFishSharedFlowAdMob.CatchingFishLayout();
        if (catchingFishSharedFlowAdMob.CatchingFishFragmentHandler.isEmpty()) {
            return false;
        }
        CatchingFishService catchingFishService = new CatchingFishService(0, this, new CatchingFishRecyclerView(this, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishEspressoTesting));
        this.CatchingFishParcelableFlux = catchingFishService;
        ((View) this.CatchingFishCloudMessaging).post(catchingFishService);
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishFragmentHandler(CatchingFishDaggerAdMob catchingFishDaggerAdMob) {
        throw null;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishLayout() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        CatchingFishToast catchingFishToast = this;
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishToast.CatchingFishWorkManager;
        if (catchingFishSharedFlowAdMob != null) {
            arrayList = catchingFishSharedFlowAdMob.CatchingFishEspressoTesting();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = catchingFishToast.CatchingFish;
        int i4 = catchingFishToast.CatchingFishNavigation;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) catchingFishToast.CatchingFishCloudMessaging;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) arrayList.get(i5);
            int i8 = catchingFishKtorAdMob.CatchingFishGsonAppCompat;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (catchingFishToast.CatchingFishJetpackCompose && catchingFishKtorAdMob.CatchingFishMVPRobolectric) {
                i3 = 0;
            }
            i5++;
        }
        if (catchingFishToast.CatchingFishAnimationMockk && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = catchingFishToast.CatchingFishCoroutineFlow;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            CatchingFishKtorAdMob catchingFishKtorAdMob2 = (CatchingFishKtorAdMob) arrayList.get(i10);
            int i12 = catchingFishKtorAdMob2.CatchingFishGsonAppCompat;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = catchingFishKtorAdMob2.CatchingFishSnackbar;
            if (z3) {
                View CatchingFishParcelableFAB = catchingFishToast.CatchingFishParcelableFAB(catchingFishKtorAdMob2, null, viewGroup);
                CatchingFishParcelableFAB.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = CatchingFishParcelableFAB.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                catchingFishKtorAdMob2.CatchingFishWorkManager(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View CatchingFishParcelableFAB2 = catchingFishToast.CatchingFishParcelableFAB(catchingFishKtorAdMob2, null, viewGroup);
                    CatchingFishParcelableFAB2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = CatchingFishParcelableFAB2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        CatchingFishKtorAdMob catchingFishKtorAdMob3 = (CatchingFishKtorAdMob) arrayList.get(i14);
                        if (catchingFishKtorAdMob3.CatchingFishSnackbar == i13) {
                            if ((catchingFishKtorAdMob3.CatchingFishParcelableFlux & 32) == 32) {
                                i9++;
                            }
                            catchingFishKtorAdMob3.CatchingFishWorkManager(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                catchingFishKtorAdMob2.CatchingFishWorkManager(z5);
            } else {
                catchingFishKtorAdMob2.CatchingFishWorkManager(false);
                i10++;
                i2 = 2;
                catchingFishToast = this;
                z = true;
            }
            i10++;
            i2 = 2;
            catchingFishToast = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.text.CatchingFishWidgetStateFlow] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View CatchingFishParcelableFAB(CatchingFishKtorAdMob catchingFishKtorAdMob, View view, ViewGroup viewGroup) {
        View actionView = catchingFishKtorAdMob.getActionView();
        if (actionView == null || catchingFishKtorAdMob.CatchingFishDaggerWebsocket()) {
            ActionMenuItemView actionMenuItemView = view instanceof CatchingFishWidgetStateFlow ? (CatchingFishWidgetStateFlow) view : (CatchingFishWidgetStateFlow) this.CatchingFishViewModelScope.inflate(this.CatchingFishFragmentHandler, viewGroup, false);
            actionMenuItemView.CatchingFishParcelableFAB(catchingFishKtorAdMob);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.CatchingFishCloudMessaging);
            if (this.CatchingFishGsonAppCompat == null) {
                this.CatchingFishGsonAppCompat = new CatchingFishServiceKtor(this);
            }
            actionMenuItemView2.setPopupCallback(this.CatchingFishGsonAppCompat);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(catchingFishKtorAdMob.CatchingFishMVPRobolectric ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof CatchingFishPayPalFlux)) {
            actionView.setLayoutParams(ActionMenuView.CatchingFishCloudMessaging(layoutParams));
        }
        return actionView;
    }

    public final boolean CatchingFishReduxKtor() {
        Object obj;
        CatchingFishService catchingFishService = this.CatchingFishParcelableFlux;
        if (catchingFishService != null && (obj = this.CatchingFishCloudMessaging) != null) {
            ((View) obj).removeCallbacks(catchingFishService);
            this.CatchingFishParcelableFlux = null;
            return true;
        }
        CatchingFishRecyclerView catchingFishRecyclerView = this.CatchingFishDaggerHiltFAB;
        if (catchingFishRecyclerView == null) {
            return false;
        }
        if (catchingFishRecyclerView.CatchingFishSnackbar()) {
            catchingFishRecyclerView.CatchingFishLayout.dismiss();
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        CatchingFishReduxKtor();
        CatchingFishRecyclerView catchingFishRecyclerView = this.CatchingFishSpannableWidget;
        if (catchingFishRecyclerView != null && catchingFishRecyclerView.CatchingFishSnackbar()) {
            catchingFishRecyclerView.CatchingFishLayout.dismiss();
        }
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishViewModelFAB;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishSnackbar(catchingFishSharedFlowAdMob, z);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishViewModelFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        return false;
    }

    public final boolean CatchingFishViewModelScope() {
        CatchingFishRecyclerView catchingFishRecyclerView = this.CatchingFishDaggerHiltFAB;
        return catchingFishRecyclerView != null && catchingFishRecyclerView.CatchingFishSnackbar();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishWorkManager() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.CatchingFishCloudMessaging;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = this.CatchingFishWorkManager;
            if (catchingFishSharedFlowAdMob != null) {
                catchingFishSharedFlowAdMob.CatchingFishLayout();
                ArrayList CatchingFishEspressoTesting = this.CatchingFishWorkManager.CatchingFishEspressoTesting();
                int size = CatchingFishEspressoTesting.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    CatchingFishKtorAdMob catchingFishKtorAdMob = (CatchingFishKtorAdMob) CatchingFishEspressoTesting.get(i2);
                    if ((catchingFishKtorAdMob.CatchingFishParcelableFlux & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        CatchingFishKtorAdMob itemData = childAt instanceof CatchingFishWidgetStateFlow ? ((CatchingFishWidgetStateFlow) childAt).getItemData() : null;
                        View CatchingFishParcelableFAB = CatchingFishParcelableFAB(catchingFishKtorAdMob, childAt, viewGroup);
                        if (catchingFishKtorAdMob != itemData) {
                            CatchingFishParcelableFAB.setPressed(false);
                            CatchingFishParcelableFAB.jumpDrawablesToCurrentState();
                        }
                        if (CatchingFishParcelableFAB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) CatchingFishParcelableFAB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(CatchingFishParcelableFAB);
                            }
                            ((ViewGroup) this.CatchingFishCloudMessaging).addView(CatchingFishParcelableFAB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.CatchingFishEspressoTesting) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.CatchingFishCloudMessaging).requestLayout();
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = this.CatchingFishWorkManager;
        if (catchingFishSharedFlowAdMob2 != null) {
            catchingFishSharedFlowAdMob2.CatchingFishLayout();
            ArrayList arrayList2 = catchingFishSharedFlowAdMob2.CatchingFishLayout;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                CatchingFishJUnitAdMobKtor catchingFishJUnitAdMobKtor = ((CatchingFishKtorAdMob) arrayList2.get(i3)).CatchingFishPayPal;
            }
        }
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob3 = this.CatchingFishWorkManager;
        if (catchingFishSharedFlowAdMob3 != null) {
            catchingFishSharedFlowAdMob3.CatchingFishLayout();
            arrayList = catchingFishSharedFlowAdMob3.CatchingFishFragmentHandler;
        }
        if (this.CatchingFishAnimationMockk && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((CatchingFishKtorAdMob) arrayList.get(0)).CatchingFishMVPRobolectric;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.CatchingFishEspressoTesting == null) {
                this.CatchingFishEspressoTesting = new CatchingFishFragment(this, this.CatchingFishReduxKtor);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.CatchingFishEspressoTesting.getParent();
            if (viewGroup3 != this.CatchingFishCloudMessaging) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.CatchingFishEspressoTesting);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.CatchingFishCloudMessaging;
                CatchingFishFragment catchingFishFragment = this.CatchingFishEspressoTesting;
                actionMenuView.getClass();
                CatchingFishPayPalFlux CatchingFishFragmentHandler = ActionMenuView.CatchingFishFragmentHandler();
                CatchingFishFragmentHandler.CatchingFishParcelableFAB = true;
                actionMenuView.addView(catchingFishFragment, CatchingFishFragmentHandler);
            }
        } else {
            CatchingFishFragment catchingFishFragment2 = this.CatchingFishEspressoTesting;
            if (catchingFishFragment2 != null) {
                Object parent = catchingFishFragment2.getParent();
                Object obj = this.CatchingFishCloudMessaging;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.CatchingFishEspressoTesting);
                }
            }
        }
        ((ActionMenuView) this.CatchingFishCloudMessaging).setOverflowReserved(this.CatchingFishAnimationMockk);
    }
}
