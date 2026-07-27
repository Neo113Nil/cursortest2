package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishSpannableMockk extends CatchingFishMVPEspresso implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int CatchingFish;
    public CatchingFishDaggerAdMob CatchingFishCardViewRealm;
    public PopupWindow.OnDismissListener CatchingFishCardViewView;
    public boolean CatchingFishCoroutineFlow;
    public int CatchingFishDaggerHiltFAB;
    public final Context CatchingFishDaggerWebsocket;
    public final CatchingFishMVPStateFlow CatchingFishEspressoTesting;
    public boolean CatchingFishGsonAppCompat;
    public boolean CatchingFishJetpackCompose;
    public final Handler CatchingFishLayout;
    public boolean CatchingFishMVPRobolectric;
    public View CatchingFishNavigation;
    public final CatchingFishToastWidget CatchingFishOkHttp;
    public ViewTreeObserver CatchingFishPayPal;
    public View CatchingFishRoomDatabase;
    public int CatchingFishSpannableWidget;
    public final boolean CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;
    public final ArrayList CatchingFishFragmentHandler = new ArrayList();
    public final ArrayList CatchingFishCloudMessaging = new ArrayList();
    public final CatchingFishServiceHilt CatchingFishUnitTesting = new CatchingFishServiceHilt(21, this);
    public int CatchingFishAnimationMockk = 0;
    public int CatchingFishStateLiveData = 0;
    public boolean CatchingFishParcelableFlux = false;

    public CatchingFishSpannableMockk(Context context, View view, int i, boolean z) {
        int i2 = 2;
        this.CatchingFishEspressoTesting = new CatchingFishMVPStateFlow(i2, this);
        this.CatchingFishOkHttp = new CatchingFishToastWidget(i2, this);
        this.CatchingFishDaggerWebsocket = context;
        this.CatchingFishRoomDatabase = view;
        this.CatchingFishViewModelScope = i;
        this.CatchingFishViewModelFAB = z;
        this.CatchingFish = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.CatchingFishWorkManager = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.CatchingFishLayout = new Handler();
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFish(boolean z) {
        this.CatchingFishGsonAppCompat = z;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishAnimationMockk(boolean z) {
        this.CatchingFishParcelableFlux = z;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishCoroutine(CatchingFishGradleLifecycle catchingFishGradleLifecycle) {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishMockkRetrofit catchingFishMockkRetrofit = (CatchingFishMockkRetrofit) obj;
            if (catchingFishGradleLifecycle == catchingFishMockkRetrofit.CatchingFishSnackbar) {
                catchingFishMockkRetrofit.CatchingFishParcelableFAB.CatchingFishWorkManager.requestFocus();
                return true;
            }
        }
        if (!catchingFishGradleLifecycle.hasVisibleItems()) {
            return false;
        }
        CatchingFishEspressoTesting(catchingFishGradleLifecycle);
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishCardViewRealm;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishViewModelScope(catchingFishGradleLifecycle);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x015b, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015e, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0163, code lost:
    
        if ((r11[0] - r5) < 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutineFlow(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        boolean z;
        int i;
        CatchingFishMockkRetrofit catchingFishMockkRetrofit;
        View view;
        int i2;
        int i3;
        int i4;
        int width;
        MenuItem menuItem;
        CatchingFishDatabindingKtor catchingFishDatabindingKtor;
        int i5;
        int firstVisiblePosition;
        Context context = this.CatchingFishDaggerWebsocket;
        LayoutInflater from = LayoutInflater.from(context);
        CatchingFishDatabindingKtor catchingFishDatabindingKtor2 = new CatchingFishDatabindingKtor(catchingFishSharedFlowAdMob, from, this.CatchingFishViewModelFAB, R.layout.abc_cascading_menu_item_layout);
        if (!CatchingFishParcelableFAB() && this.CatchingFishParcelableFlux) {
            catchingFishDatabindingKtor2.CatchingFishCoroutine = true;
        } else if (CatchingFishParcelableFAB()) {
            int size = catchingFishSharedFlowAdMob.CatchingFishWorkManager.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = catchingFishSharedFlowAdMob.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            catchingFishDatabindingKtor2.CatchingFishCoroutine = z;
        }
        int CatchingFishOkHttp = CatchingFishMVPEspresso.CatchingFishOkHttp(catchingFishDatabindingKtor2, context, this.CatchingFishWorkManager);
        CatchingFishMVVMToastRoom catchingFishMVVMToastRoom = new CatchingFishMVVMToastRoom(context, null, this.CatchingFishViewModelScope, 0);
        catchingFishMVVMToastRoom.CatchingFishMutableLiveData = this.CatchingFishUnitTesting;
        catchingFishMVVMToastRoom.CatchingFish = this;
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setOnDismissListener(this);
        catchingFishMVVMToastRoom.CatchingFishNavigation = this.CatchingFishRoomDatabase;
        catchingFishMVVMToastRoom.CatchingFishAnimationMockk = this.CatchingFishStateLiveData;
        catchingFishMVVMToastRoom.CatchingFishCardViewView = true;
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setFocusable(true);
        catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setInputMethodMode(2);
        catchingFishMVVMToastRoom.CatchingFishStateLiveData(catchingFishDatabindingKtor2);
        catchingFishMVVMToastRoom.CatchingFishNavigation(CatchingFishOkHttp);
        catchingFishMVVMToastRoom.CatchingFishAnimationMockk = this.CatchingFishStateLiveData;
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        if (arrayList.size() > 0) {
            catchingFishMockkRetrofit = (CatchingFishMockkRetrofit) arrayList.get(arrayList.size() - 1);
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = catchingFishMockkRetrofit.CatchingFishSnackbar;
            int size2 = catchingFishSharedFlowAdMob2.CatchingFishWorkManager.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = catchingFishSharedFlowAdMob2.getItem(i7);
                if (menuItem.hasSubMenu() && catchingFishSharedFlowAdMob == menuItem.getSubMenu()) {
                    break;
                } else {
                    i7++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = catchingFishMockkRetrofit.CatchingFishParcelableFAB.CatchingFishWorkManager;
                ListAdapter adapter = catchingFishCameraXOkHttp.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    catchingFishDatabindingKtor = (CatchingFishDatabindingKtor) headerViewListAdapter.getWrappedAdapter();
                } else {
                    catchingFishDatabindingKtor = (CatchingFishDatabindingKtor) adapter;
                    i5 = 0;
                }
                int count = catchingFishDatabindingKtor.getCount();
                i = 1;
                int i8 = 0;
                while (true) {
                    if (i8 >= count) {
                        i8 = -1;
                        break;
                    } else if (menuItem == catchingFishDatabindingKtor.getItem(i8)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 != -1 && (firstVisiblePosition = (i8 + i5) - catchingFishCameraXOkHttp.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < catchingFishCameraXOkHttp.getChildCount()) {
                    view = catchingFishCameraXOkHttp.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i9 = Build.VERSION.SDK_INT;
                CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = catchingFishMVVMToastRoom.CatchingFishMVPRobolectric;
                if (i9 <= 28) {
                    Method method = CatchingFishMVVMToastRoom.CatchingFishJobScheduler;
                    if (method != null) {
                        try {
                            method.invoke(catchingFishHiltGoogleMaps, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    CatchingFishViewCoroutine.CatchingFishParcelableFAB(catchingFishHiltGoogleMaps, false);
                }
                CatchingFishCameraXPicasso.CatchingFishParcelableFAB(catchingFishMVVMToastRoom.CatchingFishMVPRobolectric, null);
                CatchingFishCameraXOkHttp catchingFishCameraXOkHttp2 = ((CatchingFishMockkRetrofit) arrayList.get(arrayList.size() - 1)).CatchingFishParcelableFAB.CatchingFishWorkManager;
                int[] iArr = new int[2];
                catchingFishCameraXOkHttp2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.CatchingFishNavigation.getWindowVisibleDisplayFrame(rect);
                if (this.CatchingFish == i) {
                }
                boolean z2 = i2 == 1;
                this.CatchingFish = i2;
                if (Build.VERSION.SDK_INT >= 26) {
                    catchingFishMVVMToastRoom.CatchingFishNavigation = view;
                    i4 = 0;
                    i3 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.CatchingFishRoomDatabase.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.CatchingFishStateLiveData & 7) == 5) {
                        iArr2[0] = this.CatchingFishRoomDatabase.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i3 = iArr3[0] - iArr2[0];
                    i4 = iArr3[1] - iArr2[1];
                }
                if ((this.CatchingFishStateLiveData & 5) != 5) {
                    if (z2) {
                        width = i3 + view.getWidth();
                        catchingFishMVVMToastRoom.CatchingFishLayout = width;
                        catchingFishMVVMToastRoom.CatchingFishUnitTesting = true;
                        catchingFishMVVMToastRoom.CatchingFishOkHttp = true;
                        catchingFishMVVMToastRoom.CatchingFishFragmentHandler(i4);
                    }
                    width = i3 - CatchingFishOkHttp;
                    catchingFishMVVMToastRoom.CatchingFishLayout = width;
                    catchingFishMVVMToastRoom.CatchingFishUnitTesting = true;
                    catchingFishMVVMToastRoom.CatchingFishOkHttp = true;
                    catchingFishMVVMToastRoom.CatchingFishFragmentHandler(i4);
                } else if (z2) {
                    width = i3 + CatchingFishOkHttp;
                    catchingFishMVVMToastRoom.CatchingFishLayout = width;
                    catchingFishMVVMToastRoom.CatchingFishUnitTesting = true;
                    catchingFishMVVMToastRoom.CatchingFishOkHttp = true;
                    catchingFishMVVMToastRoom.CatchingFishFragmentHandler(i4);
                } else {
                    CatchingFishOkHttp = view.getWidth();
                    width = i3 - CatchingFishOkHttp;
                    catchingFishMVVMToastRoom.CatchingFishLayout = width;
                    catchingFishMVVMToastRoom.CatchingFishUnitTesting = true;
                    catchingFishMVVMToastRoom.CatchingFishOkHttp = true;
                    catchingFishMVVMToastRoom.CatchingFishFragmentHandler(i4);
                }
            } else {
                if (this.CatchingFishJetpackCompose) {
                    catchingFishMVVMToastRoom.CatchingFishLayout = this.CatchingFishDaggerHiltFAB;
                }
                if (this.CatchingFishCoroutineFlow) {
                    catchingFishMVVMToastRoom.CatchingFishFragmentHandler(this.CatchingFishSpannableWidget);
                }
                Rect rect2 = this.CatchingFishReduxKtor;
                catchingFishMVVMToastRoom.CatchingFishPayPal = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new CatchingFishMockkRetrofit(catchingFishMVVMToastRoom, catchingFishSharedFlowAdMob, this.CatchingFish));
            catchingFishMVVMToastRoom.CatchingFishReduxKtor();
            CatchingFishCameraXOkHttp catchingFishCameraXOkHttp3 = catchingFishMVVMToastRoom.CatchingFishWorkManager;
            catchingFishCameraXOkHttp3.setOnKeyListener(this);
            if (catchingFishMockkRetrofit == null || !this.CatchingFishGsonAppCompat || catchingFishSharedFlowAdMob.CatchingFishOkHttp == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) catchingFishCameraXOkHttp3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(catchingFishSharedFlowAdMob.CatchingFishOkHttp);
            catchingFishCameraXOkHttp3.addHeaderView(frameLayout, null, false);
            catchingFishMVVMToastRoom.CatchingFishReduxKtor();
            return;
        }
        i = 1;
        catchingFishMockkRetrofit = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new CatchingFishMockkRetrofit(catchingFishMVVMToastRoom, catchingFishSharedFlowAdMob, this.CatchingFish));
        catchingFishMVVMToastRoom.CatchingFishReduxKtor();
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp32 = catchingFishMVVMToastRoom.CatchingFishWorkManager;
        catchingFishCameraXOkHttp32.setOnKeyListener(this);
        if (catchingFishMockkRetrofit == null) {
        }
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishEspressoTesting(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        catchingFishSharedFlowAdMob.CatchingFishSnackbar(this, this.CatchingFishDaggerWebsocket);
        if (CatchingFishParcelableFAB()) {
            CatchingFishCoroutineFlow(catchingFishSharedFlowAdMob);
        } else {
            this.CatchingFishFragmentHandler.add(catchingFishSharedFlowAdMob);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishFragmentHandler(CatchingFishDaggerAdMob catchingFishDaggerAdMob) {
        this.CatchingFishCardViewRealm = catchingFishDaggerAdMob;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishJetpackCompose(int i) {
        this.CatchingFishCoroutineFlow = true;
        this.CatchingFishSpannableWidget = i;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final boolean CatchingFishLayout() {
        return false;
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishNavigation(PopupWindow.OnDismissListener onDismissListener) {
        this.CatchingFishCardViewView = onDismissListener;
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final boolean CatchingFishParcelableFAB() {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        return arrayList.size() > 0 && ((CatchingFishMockkRetrofit) arrayList.get(0)).CatchingFishParcelableFAB.CatchingFishMVPRobolectric.isShowing();
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void CatchingFishReduxKtor() {
        if (CatchingFishParcelableFAB()) {
            return;
        }
        ArrayList arrayList = this.CatchingFishFragmentHandler;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishCoroutineFlow((CatchingFishSharedFlowAdMob) obj);
        }
        arrayList.clear();
        View view = this.CatchingFishRoomDatabase;
        this.CatchingFishNavigation = view;
        if (view != null) {
            boolean z = this.CatchingFishPayPal == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.CatchingFishPayPal = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.CatchingFishEspressoTesting);
            }
            this.CatchingFishNavigation.addOnAttachStateChangeListener(this.CatchingFishOkHttp);
        }
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishRoomDatabase(int i) {
        this.CatchingFishJetpackCompose = true;
        this.CatchingFishDaggerHiltFAB = i;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishSnackbar(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, boolean z) {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (catchingFishSharedFlowAdMob == ((CatchingFishMockkRetrofit) arrayList.get(i)).CatchingFishSnackbar) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((CatchingFishMockkRetrofit) arrayList.get(i2)).CatchingFishSnackbar.CatchingFishCoroutine(false);
        }
        CatchingFishMockkRetrofit catchingFishMockkRetrofit = (CatchingFishMockkRetrofit) arrayList.remove(i);
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = catchingFishMockkRetrofit.CatchingFishSnackbar;
        CatchingFishMVVMToastRoom catchingFishMVVMToastRoom = catchingFishMockkRetrofit.CatchingFishParcelableFAB;
        catchingFishSharedFlowAdMob2.CatchingFishNavigation(this);
        if (this.CatchingFishMVPRobolectric) {
            CatchingFishCameraXPicasso.CatchingFishSnackbar(catchingFishMVVMToastRoom.CatchingFishMVPRobolectric, null);
            catchingFishMVVMToastRoom.CatchingFishMVPRobolectric.setAnimationStyle(0);
        }
        catchingFishMVVMToastRoom.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.CatchingFish = ((CatchingFishMockkRetrofit) arrayList.get(size2 - 1)).CatchingFishCoroutine;
        } else {
            this.CatchingFish = this.CatchingFishRoomDatabase.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((CatchingFishMockkRetrofit) arrayList.get(0)).CatchingFishSnackbar.CatchingFishCoroutine(false);
                return;
            }
            return;
        }
        dismiss();
        CatchingFishDaggerAdMob catchingFishDaggerAdMob = this.CatchingFishCardViewRealm;
        if (catchingFishDaggerAdMob != null) {
            catchingFishDaggerAdMob.CatchingFishSnackbar(catchingFishSharedFlowAdMob, true);
        }
        ViewTreeObserver viewTreeObserver = this.CatchingFishPayPal;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.CatchingFishPayPal.removeGlobalOnLayoutListener(this.CatchingFishEspressoTesting);
            }
            this.CatchingFishPayPal = null;
        }
        this.CatchingFishNavigation.removeOnAttachStateChangeListener(this.CatchingFishOkHttp);
        this.CatchingFishCardViewView.onDismiss();
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishStateLiveData(int i) {
        if (this.CatchingFishAnimationMockk != i) {
            this.CatchingFishAnimationMockk = i;
            this.CatchingFishStateLiveData = Gravity.getAbsoluteGravity(i, this.CatchingFishRoomDatabase.getLayoutDirection());
        }
    }

    @Override // kotlin.text.CatchingFishMVPEspresso
    public final void CatchingFishUnitTesting(View view) {
        if (this.CatchingFishRoomDatabase != view) {
            this.CatchingFishRoomDatabase = view;
            this.CatchingFishStateLiveData = Gravity.getAbsoluteGravity(this.CatchingFishAnimationMockk, view.getLayoutDirection());
        }
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final CatchingFishCameraXOkHttp CatchingFishViewModelScope() {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((CatchingFishMockkRetrofit) arrayList.get(arrayList.size() - 1)).CatchingFishParcelableFAB.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishDaggerHiltGson
    public final void CatchingFishWorkManager() {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((CatchingFishMockkRetrofit) obj).CatchingFishParcelableFAB.CatchingFishWorkManager.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((CatchingFishDatabindingKtor) adapter).notifyDataSetChanged();
        }
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void dismiss() {
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        if (size > 0) {
            CatchingFishMockkRetrofit[] catchingFishMockkRetrofitArr = (CatchingFishMockkRetrofit[]) arrayList.toArray(new CatchingFishMockkRetrofit[size]);
            for (int i = size - 1; i >= 0; i--) {
                CatchingFishMockkRetrofit catchingFishMockkRetrofit = catchingFishMockkRetrofitArr[i];
                if (catchingFishMockkRetrofit.CatchingFishParcelableFAB.CatchingFishMVPRobolectric.isShowing()) {
                    catchingFishMockkRetrofit.CatchingFishParcelableFAB.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        CatchingFishMockkRetrofit catchingFishMockkRetrofit;
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                catchingFishMockkRetrofit = null;
                break;
            }
            catchingFishMockkRetrofit = (CatchingFishMockkRetrofit) arrayList.get(i);
            if (!catchingFishMockkRetrofit.CatchingFishParcelableFAB.CatchingFishMVPRobolectric.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (catchingFishMockkRetrofit != null) {
            catchingFishMockkRetrofit.CatchingFishSnackbar.CatchingFishCoroutine(false);
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
}
