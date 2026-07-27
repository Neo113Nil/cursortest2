package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.adjust.sdk.network.ErrorCodes;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class CatchingFishAndroidXService implements CatchingFishContextCameraX {
    public static final Method CatchingFishCustomView;
    public static final Method CatchingFishFragmentFactory;
    public AdapterView.OnItemClickListener CatchingFish;
    public boolean CatchingFishCardViewView;
    public ListAdapter CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public final Handler CatchingFishGsonAppCompat;
    public AdapterView.OnItemSelectedListener CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public final CatchingFishHiltGoogleMaps CatchingFishMVPRobolectric;
    public View CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public Rect CatchingFishPayPal;
    public final Context CatchingFishReduxKtor;
    public CatchingFishFluxRobolectric CatchingFishRoomDatabase;
    public boolean CatchingFishUnitTesting;
    public CatchingFishCameraXOkHttp CatchingFishWorkManager;
    public final int CatchingFishViewModelScope = -2;
    public int CatchingFishViewModelFAB = -2;
    public final int CatchingFishCloudMessaging = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
    public int CatchingFishAnimationMockk = 0;
    public final int CatchingFishStateLiveData = Integer.MAX_VALUE;
    public final CatchingFishMVIPayPal CatchingFishCoroutineFlow = new CatchingFishMVIPayPal(this, 1);
    public final CatchingFishPicassoPicasso CatchingFishDaggerHiltFAB = new CatchingFishPicassoPicasso(0, this);
    public final CatchingFishWebsocketBundle CatchingFishSpannableWidget = new CatchingFishWebsocketBundle(this);
    public final CatchingFishMVIPayPal CatchingFishParcelableFlux = new CatchingFishMVIPayPal(this, 0);
    public final Rect CatchingFishCardViewRealm = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                CatchingFishCustomView = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                CatchingFishFragmentFactory = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public CatchingFishAndroidXService(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.CatchingFishReduxKtor = context;
        this.CatchingFishGsonAppCompat = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishAnimationMockk, i, 0);
        this.CatchingFishLayout = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.CatchingFishFragmentHandler = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.CatchingFishEspressoTesting = true;
        }
        obtainStyledAttributes.recycle();
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = new CatchingFishHiltGoogleMaps(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFish, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            catchingFishHiltGoogleMaps.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        catchingFishHiltGoogleMaps.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.CatchingFishMVPRobolectric = catchingFishHiltGoogleMaps;
        catchingFishHiltGoogleMaps.setInputMethodMode(1);
    }

    public final Drawable CatchingFishDaggerWebsocket() {
        return this.CatchingFishMVPRobolectric.getBackground();
    }

    public final void CatchingFishEspressoTesting(int i) {
        this.CatchingFishLayout = i;
    }

    public final void CatchingFishFragmentHandler(int i) {
        this.CatchingFishFragmentHandler = i;
        this.CatchingFishEspressoTesting = true;
    }

    public final void CatchingFishNavigation(int i) {
        Drawable background = this.CatchingFishMVPRobolectric.getBackground();
        if (background == null) {
            this.CatchingFishViewModelFAB = i;
            return;
        }
        Rect rect = this.CatchingFishCardViewRealm;
        background.getPadding(rect);
        this.CatchingFishViewModelFAB = rect.left + rect.right + i;
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final boolean CatchingFishParcelableFAB() {
        return this.CatchingFishMVPRobolectric.isShowing();
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void CatchingFishReduxKtor() {
        int i;
        int paddingBottom;
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp;
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp2 = this.CatchingFishWorkManager;
        Context context = this.CatchingFishReduxKtor;
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = this.CatchingFishMVPRobolectric;
        if (catchingFishCameraXOkHttp2 == null) {
            CatchingFishCameraXOkHttp CatchingFishRoomDatabase = CatchingFishRoomDatabase(context, !this.CatchingFishCardViewView);
            this.CatchingFishWorkManager = CatchingFishRoomDatabase;
            CatchingFishRoomDatabase.setAdapter(this.CatchingFishDaggerWebsocket);
            this.CatchingFishWorkManager.setOnItemClickListener(this.CatchingFish);
            this.CatchingFishWorkManager.setFocusable(true);
            this.CatchingFishWorkManager.setFocusableInTouchMode(true);
            this.CatchingFishWorkManager.setOnItemSelectedListener(new CatchingFishCardViewToolbar(this));
            this.CatchingFishWorkManager.setOnScrollListener(this.CatchingFishSpannableWidget);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.CatchingFishJetpackCompose;
            if (onItemSelectedListener != null) {
                this.CatchingFishWorkManager.setOnItemSelectedListener(onItemSelectedListener);
            }
            catchingFishHiltGoogleMaps.setContentView(this.CatchingFishWorkManager);
        }
        Drawable background = catchingFishHiltGoogleMaps.getBackground();
        Rect rect = this.CatchingFishCardViewRealm;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.CatchingFishEspressoTesting) {
                this.CatchingFishFragmentHandler = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int CatchingFishParcelableFAB = CatchingFishToastOkHttp.CatchingFishParcelableFAB(catchingFishHiltGoogleMaps, this.CatchingFishNavigation, this.CatchingFishFragmentHandler, catchingFishHiltGoogleMaps.getInputMethodMode() == 2);
        int i3 = this.CatchingFishViewModelScope;
        if (i3 == -1) {
            paddingBottom = CatchingFishParcelableFAB + i;
        } else {
            int i4 = this.CatchingFishViewModelFAB;
            int CatchingFishParcelableFAB2 = this.CatchingFishWorkManager.CatchingFishParcelableFAB(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), CatchingFishParcelableFAB);
            paddingBottom = CatchingFishParcelableFAB2 + (CatchingFishParcelableFAB2 > 0 ? this.CatchingFishWorkManager.getPaddingBottom() + this.CatchingFishWorkManager.getPaddingTop() + i : 0);
        }
        boolean z = this.CatchingFishMVPRobolectric.getInputMethodMode() == 2;
        catchingFishHiltGoogleMaps.setWindowLayoutType(this.CatchingFishCloudMessaging);
        if (catchingFishHiltGoogleMaps.isShowing()) {
            if (this.CatchingFishNavigation.isAttachedToWindow()) {
                int i5 = this.CatchingFishViewModelFAB;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = this.CatchingFishNavigation.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        catchingFishHiltGoogleMaps.setWidth(this.CatchingFishViewModelFAB == -1 ? -1 : 0);
                        catchingFishHiltGoogleMaps.setHeight(0);
                    } else {
                        catchingFishHiltGoogleMaps.setWidth(this.CatchingFishViewModelFAB == -1 ? -1 : 0);
                        catchingFishHiltGoogleMaps.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                catchingFishHiltGoogleMaps.setOutsideTouchable(true);
                int i6 = i5;
                View view = this.CatchingFishNavigation;
                int i7 = this.CatchingFishLayout;
                int i8 = this.CatchingFishFragmentHandler;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                catchingFishHiltGoogleMaps.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int i10 = this.CatchingFishViewModelFAB;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.CatchingFishNavigation.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        catchingFishHiltGoogleMaps.setWidth(i10);
        catchingFishHiltGoogleMaps.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = CatchingFishCustomView;
            if (method != null) {
                try {
                    method.invoke(catchingFishHiltGoogleMaps, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            CatchingFishAndroidXLayout.CatchingFishSnackbar(catchingFishHiltGoogleMaps, true);
        }
        catchingFishHiltGoogleMaps.setOutsideTouchable(true);
        catchingFishHiltGoogleMaps.setTouchInterceptor(this.CatchingFishDaggerHiltFAB);
        if (this.CatchingFishUnitTesting) {
            catchingFishHiltGoogleMaps.setOverlapAnchor(this.CatchingFishOkHttp);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = CatchingFishFragmentFactory;
            if (method2 != null) {
                try {
                    method2.invoke(catchingFishHiltGoogleMaps, this.CatchingFishPayPal);
                } catch (Exception unused2) {
                }
            }
        } else {
            CatchingFishAndroidXLayout.CatchingFishParcelableFAB(catchingFishHiltGoogleMaps, this.CatchingFishPayPal);
        }
        catchingFishHiltGoogleMaps.showAsDropDown(this.CatchingFishNavigation, this.CatchingFishLayout, this.CatchingFishFragmentHandler, this.CatchingFishAnimationMockk);
        this.CatchingFishWorkManager.setSelection(-1);
        if ((!this.CatchingFishCardViewView || this.CatchingFishWorkManager.isInTouchMode()) && (catchingFishCameraXOkHttp = this.CatchingFishWorkManager) != null) {
            catchingFishCameraXOkHttp.setListSelectionHidden(true);
            catchingFishCameraXOkHttp.requestLayout();
        }
        if (this.CatchingFishCardViewView) {
            return;
        }
        this.CatchingFishGsonAppCompat.post(this.CatchingFishParcelableFlux);
    }

    public CatchingFishCameraXOkHttp CatchingFishRoomDatabase(Context context, boolean z) {
        return new CatchingFishCameraXOkHttp(context, z);
    }

    public final int CatchingFishSnackbar() {
        return this.CatchingFishLayout;
    }

    public void CatchingFishStateLiveData(ListAdapter listAdapter) {
        CatchingFishFluxRobolectric catchingFishFluxRobolectric = this.CatchingFishRoomDatabase;
        if (catchingFishFluxRobolectric == null) {
            this.CatchingFishRoomDatabase = new CatchingFishFluxRobolectric(this);
        } else {
            ListAdapter listAdapter2 = this.CatchingFishDaggerWebsocket;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(catchingFishFluxRobolectric);
            }
        }
        this.CatchingFishDaggerWebsocket = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.CatchingFishRoomDatabase);
        }
        CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = this.CatchingFishWorkManager;
        if (catchingFishCameraXOkHttp != null) {
            catchingFishCameraXOkHttp.setAdapter(this.CatchingFishDaggerWebsocket);
        }
    }

    public final int CatchingFishUnitTesting() {
        if (this.CatchingFishEspressoTesting) {
            return this.CatchingFishFragmentHandler;
        }
        return 0;
    }

    public final void CatchingFishViewModelFAB(Drawable drawable) {
        this.CatchingFishMVPRobolectric.setBackgroundDrawable(drawable);
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final CatchingFishCameraXOkHttp CatchingFishViewModelScope() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishContextCameraX
    public final void dismiss() {
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps = this.CatchingFishMVPRobolectric;
        catchingFishHiltGoogleMaps.dismiss();
        catchingFishHiltGoogleMaps.setContentView(null);
        this.CatchingFishWorkManager = null;
        this.CatchingFishGsonAppCompat.removeCallbacks(this.CatchingFishCoroutineFlow);
    }
}
