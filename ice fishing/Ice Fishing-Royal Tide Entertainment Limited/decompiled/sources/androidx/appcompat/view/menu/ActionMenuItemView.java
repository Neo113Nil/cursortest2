package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import kotlin.text.CatchingFishBundleJUnitRoom;
import kotlin.text.CatchingFishDataStoreBundle;
import kotlin.text.CatchingFishKtorAdMob;
import kotlin.text.CatchingFishLiveDataPayPal;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewModelScope;
import kotlin.text.CatchingFishWidgetGlide;
import kotlin.text.CatchingFishWidgetManifest;
import kotlin.text.CatchingFishWidgetStateFlow;

/* loaded from: classes.dex */
public class ActionMenuItemView extends CatchingFishDataStoreBundle implements CatchingFishWidgetStateFlow, View.OnClickListener, CatchingFishWidgetManifest {
    public final int CatchingFish;
    public CatchingFishBundleJUnitRoom CatchingFishAnimationMockk;
    public CatchingFishKtorAdMob CatchingFishCloudMessaging;
    public final int CatchingFishCoroutineFlow;
    public CharSequence CatchingFishEspressoTesting;
    public int CatchingFishJetpackCompose;
    public boolean CatchingFishNavigation;
    public Drawable CatchingFishOkHttp;
    public boolean CatchingFishRoomDatabase;
    public CatchingFishViewModelScope CatchingFishStateLiveData;
    public CatchingFishLiveDataPayPal CatchingFishUnitTesting;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.CatchingFishRoomDatabase = CatchingFishViewModelScope();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishCoroutine, 0, 0);
        this.CatchingFish = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.CatchingFishCoroutineFlow = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.CatchingFishJetpackCompose = -1;
        setSaveEnabled(false);
    }

    @Override // kotlin.text.CatchingFishWidgetManifest
    public final boolean CatchingFishCoroutine() {
        return !TextUtils.isEmpty(getText()) && this.CatchingFishCloudMessaging.getIcon() == null;
    }

    @Override // kotlin.text.CatchingFishWidgetStateFlow
    public final void CatchingFishParcelableFAB(CatchingFishKtorAdMob catchingFishKtorAdMob) {
        this.CatchingFishCloudMessaging = catchingFishKtorAdMob;
        setIcon(catchingFishKtorAdMob.getIcon());
        setTitle(catchingFishKtorAdMob.getTitleCondensed());
        setId(catchingFishKtorAdMob.CatchingFishParcelableFAB);
        setVisibility(catchingFishKtorAdMob.isVisible() ? 0 : 8);
        setEnabled(catchingFishKtorAdMob.isEnabled());
        if (catchingFishKtorAdMob.hasSubMenu() && this.CatchingFishAnimationMockk == null) {
            this.CatchingFishAnimationMockk = new CatchingFishBundleJUnitRoom(this);
        }
    }

    @Override // kotlin.text.CatchingFishWidgetManifest
    public final boolean CatchingFishSnackbar() {
        return !TextUtils.isEmpty(getText());
    }

    public final void CatchingFishViewModelFAB() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.CatchingFishEspressoTesting);
        if (this.CatchingFishOkHttp != null && ((this.CatchingFishCloudMessaging.CatchingFishGsonAppCompat & 4) != 4 || (!this.CatchingFishRoomDatabase && !this.CatchingFishNavigation))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.CatchingFishEspressoTesting : null);
        CharSequence charSequence = this.CatchingFishCloudMessaging.CatchingFishRoomDatabase;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.CatchingFishCloudMessaging.CatchingFishDaggerWebsocket);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.CatchingFishCloudMessaging.CatchingFishNavigation;
        if (TextUtils.isEmpty(charSequence2)) {
            CatchingFishViewMVIMVVM.CatchingFishCoroutineFlow(this, z3 ? null : this.CatchingFishCloudMessaging.CatchingFishDaggerWebsocket);
        } else {
            CatchingFishViewMVIMVVM.CatchingFishCoroutineFlow(this, charSequence2);
        }
    }

    public final boolean CatchingFishViewModelScope() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // kotlin.text.CatchingFishWidgetStateFlow
    public CatchingFishKtorAdMob getItemData() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CatchingFishLiveDataPayPal catchingFishLiveDataPayPal = this.CatchingFishUnitTesting;
        if (catchingFishLiveDataPayPal != null) {
            catchingFishLiveDataPayPal.CatchingFishCoroutine(this.CatchingFishCloudMessaging);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.CatchingFishRoomDatabase = CatchingFishViewModelScope();
        CatchingFishViewModelFAB();
    }

    @Override // kotlin.text.CatchingFishDataStoreBundle, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.CatchingFishJetpackCompose) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.CatchingFish;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.CatchingFishOkHttp == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.CatchingFishOkHttp.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CatchingFishBundleJUnitRoom catchingFishBundleJUnitRoom;
        if (this.CatchingFishCloudMessaging.hasSubMenu() && (catchingFishBundleJUnitRoom = this.CatchingFishAnimationMockk) != null && catchingFishBundleJUnitRoom.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.CatchingFishNavigation != z) {
            this.CatchingFishNavigation = z;
            CatchingFishKtorAdMob catchingFishKtorAdMob = this.CatchingFishCloudMessaging;
            if (catchingFishKtorAdMob != null) {
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishKtorAdMob.CatchingFishUnitTesting;
                catchingFishSharedFlowAdMob.CatchingFishCloudMessaging = true;
                catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.CatchingFishOkHttp = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.CatchingFishCoroutineFlow;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        CatchingFishViewModelFAB();
    }

    public void setItemInvoker(CatchingFishLiveDataPayPal catchingFishLiveDataPayPal) {
        this.CatchingFishUnitTesting = catchingFishLiveDataPayPal;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.CatchingFishJetpackCompose = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(CatchingFishViewModelScope catchingFishViewModelScope) {
        this.CatchingFishStateLiveData = catchingFishViewModelScope;
    }

    public void setTitle(CharSequence charSequence) {
        this.CatchingFishEspressoTesting = charSequence;
        CatchingFishViewModelFAB();
    }
}
