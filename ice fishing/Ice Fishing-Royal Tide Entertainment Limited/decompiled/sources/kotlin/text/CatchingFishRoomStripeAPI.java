package kotlin.text;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.catchingfish.fishcatcherpro.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishRoomStripeAPI extends CatchingFishMVPFABView implements DialogInterface, CatchingFishLayoutView {
    public final CatchingFishMVPWebsocket CatchingFishFragmentHandler;
    public final CatchingFishAdMobSpannable CatchingFishLayout;
    public CatchingFishMockkWidgetKtor CatchingFishViewModelFAB;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.text.CatchingFishAdMobSpannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishRoomStripeAPI(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int CatchingFishViewModelFAB = CatchingFishViewModelFAB(contextThemeWrapper, i);
        if (CatchingFishViewModelFAB == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = CatchingFishViewModelFAB;
        }
        this.CatchingFishLayout = new CatchingFishFABGraphQL() { // from class: kotlin.text.CatchingFishAdMobSpannable
            @Override // kotlin.text.CatchingFishFABGraphQL
            public final boolean CatchingFishSnackbar(KeyEvent keyEvent) {
                return CatchingFishRoomStripeAPI.this.CatchingFishFragmentHandler(keyEvent);
            }
        };
        CatchingFishBundleDagger CatchingFishWorkManager = CatchingFishWorkManager();
        if (CatchingFishViewModelFAB == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            CatchingFishViewModelFAB = typedValue2.resourceId;
        }
        ((CatchingFishMockkWidgetKtor) CatchingFishWorkManager).CatchingFishAnimation = CatchingFishViewModelFAB;
        CatchingFishWorkManager.CatchingFishSnackbar();
        this.CatchingFishFragmentHandler = new CatchingFishMVPWebsocket(getContext(), this, getWindow());
    }

    public static int CatchingFishViewModelFAB(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final boolean CatchingFishFragmentHandler(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void CatchingFishLayout(CharSequence charSequence) {
        super.setTitle(charSequence);
        CatchingFishWorkManager().CatchingFishCloudMessaging(charSequence);
    }

    public final void CatchingFishViewModelScope(Bundle bundle) {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishWorkManager();
        LayoutInflater from = LayoutInflater.from(catchingFishMockkWidgetKtor.CatchingFishUnitTesting);
        if (from.getFactory() == null) {
            from.setFactory2(catchingFishMockkWidgetKtor);
        } else {
            from.getFactory2();
        }
        super.onCreate(bundle);
        CatchingFishWorkManager().CatchingFishSnackbar();
    }

    public final CatchingFishBundleDagger CatchingFishWorkManager() {
        if (this.CatchingFishViewModelFAB == null) {
            CatchingFishCardViewMVI catchingFishCardViewMVI = CatchingFishBundleDagger.CatchingFishReduxKtor;
            this.CatchingFishViewModelFAB = new CatchingFishMockkWidgetKtor(getContext(), getWindow(), this, this);
        }
        return this.CatchingFishViewModelFAB;
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishReduxKtor();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishWorkManager();
        catchingFishMockkWidgetKtor.CatchingFishCoroutineFlow();
        ((ViewGroup) catchingFishMockkWidgetKtor.CatchingFishFragmentFactory.findViewById(android.R.id.content)).addView(view, layoutParams);
        catchingFishMockkWidgetKtor.CatchingFishStateLiveData.CatchingFishParcelableFAB(catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        CatchingFishWorkManager().CatchingFishCoroutine();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return CatchingFishBiometricBundle.CatchingFishEspressoTesting(this.CatchingFishLayout, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishWorkManager();
        catchingFishMockkWidgetKtor.CatchingFishCoroutineFlow();
        return catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishWorkManager();
        if (catchingFishMockkWidgetKtor.CatchingFishNavigation != null) {
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            catchingFishMockkWidgetKtor.CatchingFishNavigation.getClass();
            catchingFishMockkWidgetKtor.CatchingFishCardViewRealm(0);
        }
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        CatchingFishViewModelScope(bundle);
        CatchingFishMVPWebsocket catchingFishMVPWebsocket = this.CatchingFishFragmentHandler;
        catchingFishMVPWebsocket.CatchingFishSnackbar.setContentView(catchingFishMVPWebsocket.CatchingFishRoomDatabase);
        Context context = catchingFishMVPWebsocket.CatchingFishParcelableFAB;
        Window window = catchingFishMVPWebsocket.CatchingFishCoroutine;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup CatchingFishParcelableFAB = CatchingFishMVPWebsocket.CatchingFishParcelableFAB(findViewById6, findViewById3);
        ViewGroup CatchingFishParcelableFAB2 = CatchingFishMVPWebsocket.CatchingFishParcelableFAB(findViewById7, findViewById4);
        ViewGroup CatchingFishParcelableFAB3 = CatchingFishMVPWebsocket.CatchingFishParcelableFAB(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        catchingFishMVPWebsocket.CatchingFishLayout = nestedScrollView;
        nestedScrollView.setFocusable(false);
        catchingFishMVPWebsocket.CatchingFishLayout.setNestedScrollingEnabled(false);
        TextView textView = (TextView) CatchingFishParcelableFAB2.findViewById(android.R.id.message);
        catchingFishMVPWebsocket.CatchingFishOkHttp = textView;
        if (textView != null) {
            textView.setVisibility(8);
            catchingFishMVPWebsocket.CatchingFishLayout.removeView(catchingFishMVPWebsocket.CatchingFishOkHttp);
            if (catchingFishMVPWebsocket.CatchingFishDaggerWebsocket != null) {
                ViewGroup viewGroup2 = (ViewGroup) catchingFishMVPWebsocket.CatchingFishLayout.getParent();
                int indexOfChild = viewGroup2.indexOfChild(catchingFishMVPWebsocket.CatchingFishLayout);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(catchingFishMVPWebsocket.CatchingFishDaggerWebsocket, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                CatchingFishParcelableFAB2.setVisibility(8);
            }
        }
        Button button = (Button) CatchingFishParcelableFAB3.findViewById(android.R.id.button1);
        catchingFishMVPWebsocket.CatchingFishWorkManager = button;
        CatchingFishToolbarCameraX catchingFishToolbarCameraX = catchingFishMVPWebsocket.CatchingFishSpannableWidget;
        button.setOnClickListener(catchingFishToolbarCameraX);
        if (TextUtils.isEmpty(null)) {
            catchingFishMVPWebsocket.CatchingFishWorkManager.setVisibility(8);
            i = 0;
        } else {
            catchingFishMVPWebsocket.CatchingFishWorkManager.setText((CharSequence) null);
            catchingFishMVPWebsocket.CatchingFishWorkManager.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) CatchingFishParcelableFAB3.findViewById(android.R.id.button2);
        catchingFishMVPWebsocket.CatchingFishViewModelScope = button2;
        button2.setOnClickListener(catchingFishToolbarCameraX);
        if (TextUtils.isEmpty(null)) {
            catchingFishMVPWebsocket.CatchingFishViewModelScope.setVisibility(8);
        } else {
            catchingFishMVPWebsocket.CatchingFishViewModelScope.setText((CharSequence) null);
            catchingFishMVPWebsocket.CatchingFishViewModelScope.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) CatchingFishParcelableFAB3.findViewById(android.R.id.button3);
        catchingFishMVPWebsocket.CatchingFishViewModelFAB = button3;
        button3.setOnClickListener(catchingFishToolbarCameraX);
        if (TextUtils.isEmpty(null)) {
            catchingFishMVPWebsocket.CatchingFishViewModelFAB.setVisibility(8);
        } else {
            catchingFishMVPWebsocket.CatchingFishViewModelFAB.setText((CharSequence) null);
            catchingFishMVPWebsocket.CatchingFishViewModelFAB.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = catchingFishMVPWebsocket.CatchingFishWorkManager;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = catchingFishMVPWebsocket.CatchingFishViewModelScope;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = catchingFishMVPWebsocket.CatchingFishViewModelFAB;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            CatchingFishParcelableFAB3.setVisibility(8);
        }
        if (catchingFishMVPWebsocket.CatchingFishUnitTesting != null) {
            CatchingFishParcelableFAB.addView(catchingFishMVPWebsocket.CatchingFishUnitTesting, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            catchingFishMVPWebsocket.CatchingFishCloudMessaging = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(catchingFishMVPWebsocket.CatchingFishReduxKtor) || !catchingFishMVPWebsocket.CatchingFishCoroutineFlow) {
                window.findViewById(R.id.title_template).setVisibility(8);
                catchingFishMVPWebsocket.CatchingFishCloudMessaging.setVisibility(8);
                CatchingFishParcelableFAB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                catchingFishMVPWebsocket.CatchingFishEspressoTesting = textView2;
                textView2.setText(catchingFishMVPWebsocket.CatchingFishReduxKtor);
                Drawable drawable = catchingFishMVPWebsocket.CatchingFishFragmentHandler;
                if (drawable != null) {
                    catchingFishMVPWebsocket.CatchingFishCloudMessaging.setImageDrawable(drawable);
                } else {
                    catchingFishMVPWebsocket.CatchingFishEspressoTesting.setPadding(catchingFishMVPWebsocket.CatchingFishCloudMessaging.getPaddingLeft(), catchingFishMVPWebsocket.CatchingFishCloudMessaging.getPaddingTop(), catchingFishMVPWebsocket.CatchingFishCloudMessaging.getPaddingRight(), catchingFishMVPWebsocket.CatchingFishCloudMessaging.getPaddingBottom());
                    catchingFishMVPWebsocket.CatchingFishCloudMessaging.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (CatchingFishParcelableFAB == null || CatchingFishParcelableFAB.getVisibility() == 8) ? 0 : 1;
        boolean z2 = CatchingFishParcelableFAB3.getVisibility() != 8;
        if (!z2 && (findViewById = CatchingFishParcelableFAB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = catchingFishMVPWebsocket.CatchingFishLayout;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = catchingFishMVPWebsocket.CatchingFishDaggerWebsocket != null ? CatchingFishParcelableFAB.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = CatchingFishParcelableFAB2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = catchingFishMVPWebsocket.CatchingFishDaggerWebsocket;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.CatchingFishReduxKtor, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.CatchingFishDaggerWebsocket);
        }
        if (!z) {
            View view = catchingFishMVPWebsocket.CatchingFishDaggerWebsocket;
            if (view == null) {
                view = catchingFishMVPWebsocket.CatchingFishLayout;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    CatchingFishParcelableFAB2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    CatchingFishParcelableFAB2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = catchingFishMVPWebsocket.CatchingFishDaggerWebsocket;
        if (alertController$RecycleListView2 == null || (listAdapter = catchingFishMVPWebsocket.CatchingFishAnimationMockk) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = catchingFishMVPWebsocket.CatchingFishStateLiveData;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.CatchingFishFragmentHandler.CatchingFishLayout;
        if (nestedScrollView == null || !nestedScrollView.CatchingFishLayout(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.CatchingFishFragmentHandler.CatchingFishLayout;
        if (nestedScrollView == null || !nestedScrollView.CatchingFishLayout(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void onStop() {
        super.onStop();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishWorkManager();
        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
        if (catchingFishGraphQLFragment != null) {
            catchingFishGraphQLFragment.CatchingFishGradleManifest = false;
            CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit = catchingFishGraphQLFragment.CatchingFishPayPalLiveData;
            if (catchingFishGsonMVIRetrofit != null) {
                catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB();
            }
        }
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void setContentView(int i) {
        CatchingFishReduxKtor();
        CatchingFishWorkManager().CatchingFishViewModelScope(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        CatchingFishWorkManager().CatchingFishCloudMessaging(getContext().getString(i));
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void setContentView(View view) {
        CatchingFishReduxKtor();
        CatchingFishWorkManager().CatchingFishLayout(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        CatchingFishLayout(charSequence);
        CatchingFishMVPWebsocket catchingFishMVPWebsocket = this.CatchingFishFragmentHandler;
        catchingFishMVPWebsocket.CatchingFishReduxKtor = charSequence;
        TextView textView = catchingFishMVPWebsocket.CatchingFishEspressoTesting;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // kotlin.text.CatchingFishMVPFABView, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishReduxKtor();
        CatchingFishWorkManager().CatchingFishFragmentHandler(view, layoutParams);
    }
}
