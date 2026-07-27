package kotlin.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMVPView extends ViewGroup.MarginLayoutParams {
    public final Rect CatchingFishAnimationMockk;
    public View CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public View CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public CatchingFishJUnitToastKtor CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public boolean CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public final int CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishMVPView() {
        super(-2, -2);
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishAnimationMockk = new Rect();
    }

    public final boolean CatchingFishParcelableFAB(int i) {
        if (i == 0) {
            return this.CatchingFishOkHttp;
        }
        if (i != 1) {
            return false;
        }
        return this.CatchingFishUnitTesting;
    }

    public CatchingFishMVPView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor;
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishAnimationMockk = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishRecyclerViewMVP.CatchingFishSnackbar);
        this.CatchingFishCoroutine = obtainStyledAttributes.getInteger(0, 0);
        this.CatchingFishWorkManager = obtainStyledAttributes.getResourceId(1, -1);
        this.CatchingFishReduxKtor = obtainStyledAttributes.getInteger(2, 0);
        this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getInteger(6, -1);
        this.CatchingFishViewModelScope = obtainStyledAttributes.getInt(5, 0);
        this.CatchingFishViewModelFAB = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.CatchingFishSnackbar = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.CatchingFishSpannableWidget;
            if (TextUtils.isEmpty(string)) {
                catchingFishJUnitToastKtor = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.CatchingFishSpannableWidget;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.CatchingFishGsonAppCompat;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.CatchingFishParcelableFlux);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    catchingFishJUnitToastKtor = (CatchingFishJUnitToastKtor) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.CatchingFishParcelableFAB = catchingFishJUnitToastKtor;
        }
        obtainStyledAttributes.recycle();
        CatchingFishJUnitToastKtor catchingFishJUnitToastKtor2 = this.CatchingFishParcelableFAB;
        if (catchingFishJUnitToastKtor2 != null) {
            catchingFishJUnitToastKtor2.CatchingFishCoroutine(this);
        }
    }

    public CatchingFishMVPView(CatchingFishMVPView catchingFishMVPView) {
        super((ViewGroup.MarginLayoutParams) catchingFishMVPView);
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishAnimationMockk = new Rect();
    }

    public CatchingFishMVPView(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishAnimationMockk = new Rect();
    }

    public CatchingFishMVPView(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = -1;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishAnimationMockk = new Rect();
    }
}
