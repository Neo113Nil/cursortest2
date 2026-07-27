package kotlin.text;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class CatchingFishJUnitBundle extends CatchingFishDaggerFlux {
    public long CatchingFishAnimationMockk;
    public final CatchingFishPayPal CatchingFishCloudMessaging;
    public final int CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public final CatchingFishWidgetRealm CatchingFishFragmentHandler;
    public final CatchingFishWebSocketRedux CatchingFishLayout;
    public ValueAnimator CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public ValueAnimator CatchingFishRoomDatabase;
    public AccessibilityManager CatchingFishStateLiveData;
    public boolean CatchingFishUnitTesting;
    public AutoCompleteTextView CatchingFishViewModelFAB;
    public final TimeInterpolator CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishJUnitBundle(CatchingFishFragmentCameraX catchingFishFragmentCameraX) {
        super(catchingFishFragmentCameraX);
        int i = 1;
        this.CatchingFishLayout = new CatchingFishWebSocketRedux(i, this);
        this.CatchingFishFragmentHandler = new CatchingFishWidgetRealm(this, 1);
        this.CatchingFishCloudMessaging = new CatchingFishPayPal(i, this);
        this.CatchingFishAnimationMockk = Long.MAX_VALUE;
        this.CatchingFishWorkManager = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(catchingFishFragmentCameraX.getContext(), R.attr.motionDurationShort3, 67);
        this.CatchingFishDaggerWebsocket = CatchingFishHiltMVPToast.CatchingFishMVPRobolectric(catchingFishFragmentCameraX.getContext(), R.attr.motionDurationShort3, 50);
        this.CatchingFishViewModelScope = CatchingFishHiltMVPToast.CatchingFishCustomView(catchingFishFragmentCameraX.getContext(), R.attr.motionEasingLinearInterpolator, CatchingFishRobolectricRoom.CatchingFishParcelableFAB);
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFish() {
        AutoCompleteTextView autoCompleteTextView = this.CatchingFishViewModelFAB;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.CatchingFishViewModelFAB.setOnDismissListener(null);
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishAnimationMockk(AccessibilityEvent accessibilityEvent) {
        if (!this.CatchingFishStateLiveData.isEnabled() || CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(this.CatchingFishViewModelFAB)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.CatchingFishUnitTesting && !this.CatchingFishViewModelFAB.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            CatchingFishCoroutineFlow();
            this.CatchingFishOkHttp = true;
            this.CatchingFishAnimationMockk = SystemClock.uptimeMillis();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishCoroutine() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final void CatchingFishCoroutineFlow() {
        if (this.CatchingFishViewModelFAB == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.CatchingFishAnimationMockk;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.CatchingFishOkHttp = false;
        }
        if (this.CatchingFishOkHttp) {
            this.CatchingFishOkHttp = false;
            return;
        }
        CatchingFishJetpackCompose(!this.CatchingFishUnitTesting);
        if (!this.CatchingFishUnitTesting) {
            this.CatchingFishViewModelFAB.dismissDropDown();
        } else {
            this.CatchingFishViewModelFAB.requestFocus();
            this.CatchingFishViewModelFAB.showDropDown();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnFocusChangeListener CatchingFishDaggerWebsocket() {
        return this.CatchingFishFragmentHandler;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final boolean CatchingFishEspressoTesting() {
        return this.CatchingFishUnitTesting;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final boolean CatchingFishFragmentHandler() {
        return this.CatchingFishEspressoTesting;
    }

    public final void CatchingFishJetpackCompose(boolean z) {
        if (this.CatchingFishUnitTesting != z) {
            this.CatchingFishUnitTesting = z;
            this.CatchingFishNavigation.cancel();
            this.CatchingFishRoomDatabase.start();
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final boolean CatchingFishLayout(int i) {
        return i != 0;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishNavigation() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.CatchingFishViewModelScope;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.CatchingFishWorkManager);
        ofFloat.addUpdateListener(new CatchingFishJUnitHilt(this));
        this.CatchingFishNavigation = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.CatchingFishDaggerWebsocket);
        ofFloat2.addUpdateListener(new CatchingFishJUnitHilt(this));
        this.CatchingFishRoomDatabase = ofFloat2;
        ofFloat2.addListener(new CatchingFishStateLiveData(2, this));
        this.CatchingFishStateLiveData = (AccessibilityManager) this.CatchingFishCoroutine.getSystemService("accessibility");
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishOkHttp(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.CatchingFishViewModelFAB = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: kotlin.text.CatchingFishDaggerMockkMVI
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    CatchingFishJUnitBundle catchingFishJUnitBundle = CatchingFishJUnitBundle.this;
                    long j = uptimeMillis - catchingFishJUnitBundle.CatchingFishAnimationMockk;
                    if (j < 0 || j > 300) {
                        catchingFishJUnitBundle.CatchingFishOkHttp = false;
                    }
                    catchingFishJUnitBundle.CatchingFishCoroutineFlow();
                    catchingFishJUnitBundle.CatchingFishOkHttp = true;
                    catchingFishJUnitBundle.CatchingFishAnimationMockk = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.CatchingFishViewModelFAB.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kotlin.text.CatchingFishGraphQLGradle
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                CatchingFishJUnitBundle catchingFishJUnitBundle = CatchingFishJUnitBundle.this;
                catchingFishJUnitBundle.CatchingFishOkHttp = true;
                catchingFishJUnitBundle.CatchingFishAnimationMockk = SystemClock.uptimeMillis();
                catchingFishJUnitBundle.CatchingFishJetpackCompose(false);
            }
        });
        this.CatchingFishViewModelFAB.setThreshold(0);
        TextInputLayout textInputLayout = this.CatchingFishParcelableFAB;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(editText) && this.CatchingFishStateLiveData.isTouchExplorationEnabled()) {
            this.CatchingFishReduxKtor.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishStateLiveData.isTouchExplorationEnabled() && CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(this.CatchingFishViewModelFAB) && !this.CatchingFishReduxKtor.hasFocus()) {
            this.CatchingFishViewModelFAB.dismissDropDown();
        }
        this.CatchingFishViewModelFAB.post(new CatchingFishMVPLayout(10, this));
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final int CatchingFishReduxKtor() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final void CatchingFishUnitTesting(CatchingFishViewJUnitJUnit catchingFishViewJUnitJUnit) {
        AccessibilityNodeInfo accessibilityNodeInfo = catchingFishViewJUnitJUnit.CatchingFishParcelableFAB;
        if (!CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(this.CatchingFishViewModelFAB)) {
            catchingFishViewJUnitJUnit.CatchingFishLayout(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : catchingFishViewJUnitJUnit.CatchingFishDaggerWebsocket(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final AccessibilityManager.TouchExplorationStateChangeListener CatchingFishViewModelFAB() {
        return this.CatchingFishCloudMessaging;
    }

    @Override // kotlin.text.CatchingFishDaggerFlux
    public final View.OnClickListener CatchingFishWorkManager() {
        return this.CatchingFishLayout;
    }
}
