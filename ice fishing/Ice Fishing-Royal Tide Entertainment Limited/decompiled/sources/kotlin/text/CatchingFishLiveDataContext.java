package kotlin.text;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CatchingFishLiveDataContext<S> extends CatchingFishPayPalMVP {
    public CharSequence CatchingFishCameraX;
    public boolean CatchingFishDaggerAppCompat;
    public int CatchingFishDynamicFeature;
    public int CatchingFishFABLayout;
    public CharSequence CatchingFishGlideMVP;
    public CatchingFishRetrofitRealm CatchingFishGlideWidgetKtor;
    public final LinkedHashSet CatchingFishGradleLiveData;
    public CharSequence CatchingFishGraphQLGlide;
    public CheckableImageButton CatchingFishKtor;
    public int CatchingFishKtorService;
    public TextView CatchingFishLifecycle;
    public CharSequence CatchingFishLiveDataRoom;
    public CatchingFishContextGraphQL CatchingFishMVPHandler;
    public int CatchingFishMVPReduxContext;
    public CharSequence CatchingFishPayPalHandler;
    public CharSequence CatchingFishRealmKtorRealm;
    public int CatchingFishRetrofit;
    public final LinkedHashSet CatchingFishRetrofitMVI;
    public CatchingFishCardViewOkHttp CatchingFishServiceMVIJUnit;
    public int CatchingFishSharedFlow;
    public boolean CatchingFishStateFlowIntent;
    public CatchingFishRoomSnackbar CatchingFishView;
    public CharSequence CatchingFishWebSocketMockk;
    public int CatchingFishWidget;

    public CatchingFishLiveDataContext() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.CatchingFishRetrofitMVI = new LinkedHashSet();
        this.CatchingFishGradleLiveData = new LinkedHashSet();
    }

    public static int CatchingFishPayPalService(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar CatchingFishSnackbar = CatchingFishDaggerHiltMVP.CatchingFishSnackbar();
        CatchingFishSnackbar.set(5, 1);
        Calendar CatchingFishParcelableFAB = CatchingFishDaggerHiltMVP.CatchingFishParcelableFAB(CatchingFishSnackbar);
        CatchingFishParcelableFAB.get(2);
        CatchingFishParcelableFAB.get(1);
        int maximum = CatchingFishParcelableFAB.getMaximum(7);
        CatchingFishParcelableFAB.getActualMaximum(5);
        CatchingFishParcelableFAB.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean CatchingFishSensorManager(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(CatchingFishOkHttpFAB.CatchingFishLayoutInflater(R.attr.materialCalendarStyle, context, CatchingFishRetrofitRealm.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // kotlin.text.CatchingFishGoogleMapsMoshi
    public final View CatchingFish(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.CatchingFishStateFlowIntent ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.CatchingFishStateFlowIntent) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(CatchingFishPayPalService(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(CatchingFishPayPalService(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.CatchingFishKtor = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.CatchingFishLifecycle = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.CatchingFishKtor.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.CatchingFishKtor;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.CatchingFishKtor.setChecked(this.CatchingFishWidget != 0);
        CatchingFishFABCameraX.CatchingFishOkHttp(this.CatchingFishKtor, null);
        CheckableImageButton checkableImageButton2 = this.CatchingFishKtor;
        this.CatchingFishKtor.setContentDescription(this.CatchingFishWidget == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.CatchingFishKtor.setOnClickListener(new CatchingFishWebSocketRedux(2, this));
        CatchingFishJobScheduler();
        throw null;
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishGsonAppCompat() {
        this.CatchingFishView.CatchingFishJUnitRealm.clear();
        super.CatchingFishGsonAppCompat();
    }

    public final void CatchingFishJobScheduler() {
        if (this.CatchingFishLayout.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // kotlin.text.CatchingFishPayPalMVP
    public final Dialog CatchingFishMutableLiveData() {
        Context CatchingFishCardViewView = CatchingFishCardViewView();
        CatchingFishCardViewView();
        int i = this.CatchingFishRetrofit;
        if (i == 0) {
            CatchingFishJobScheduler();
            throw null;
        }
        Dialog dialog = new Dialog(CatchingFishCardViewView, i);
        Context context = dialog.getContext();
        this.CatchingFishStateFlowIntent = CatchingFishSensorManager(context, android.R.attr.windowFullscreen);
        this.CatchingFishMVPHandler = new CatchingFishContextGraphQL(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, CatchingFishSnackbarPicasso.CatchingFishOkHttp, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.CatchingFishMVPHandler.CatchingFishCloudMessaging(context);
        this.CatchingFishMVPHandler.CatchingFishUnitTesting(ColorStateList.valueOf(color));
        this.CatchingFishMVPHandler.CatchingFishOkHttp(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishNavigation(Bundle bundle) {
        super.CatchingFishNavigation(bundle);
        if (bundle == null) {
            bundle = this.CatchingFishLayout;
        }
        this.CatchingFishRetrofit = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.CatchingFishServiceMVIJUnit = (CatchingFishCardViewOkHttp) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.CatchingFishFABLayout = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.CatchingFishGraphQLGlide = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.CatchingFishWidget = bundle.getInt("INPUT_MODE_KEY");
        this.CatchingFishKtorService = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.CatchingFishWebSocketMockk = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.CatchingFishMVPReduxContext = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.CatchingFishRealmKtorRealm = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.CatchingFishDynamicFeature = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.CatchingFishPayPalHandler = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.CatchingFishSharedFlow = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.CatchingFishCameraX = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.CatchingFishGraphQLGlide;
        if (charSequence == null) {
            charSequence = CatchingFishCardViewView().getResources().getText(this.CatchingFishFABLayout);
        }
        this.CatchingFishLiveDataRoom = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.CatchingFishGlideMVP = charSequence;
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishParcelableFlux() {
        super.CatchingFishParcelableFlux();
        Dialog dialog = this.CatchingFishDaggerMVVM;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.CatchingFishStateFlowIntent) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.CatchingFishMVPHandler);
            if (!this.CatchingFishDaggerAppCompat) {
                View findViewById = CatchingFishMVPRobolectric().findViewById(R.id.fullscreen_header);
                ColorStateList CatchingFishCardViewView = CatchingFishLayoutRoomFAB.CatchingFishCardViewView(findViewById.getBackground());
                Integer valueOf = CatchingFishCardViewView != null ? Integer.valueOf(CatchingFishCardViewView.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int CatchingFishViewModelScope = CatchingFishViewMVIMVVM.CatchingFishViewModelScope(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(CatchingFishViewModelScope);
                }
                CatchingFishToastHiltBundle.CatchingFishCardViewView(window, false);
                window.getContext();
                int CatchingFishReduxKtor = Build.VERSION.SDK_INT < 27 ? CatchingFishLiveDataAdMob.CatchingFishReduxKtor(CatchingFishViewMVIMVVM.CatchingFishViewModelScope(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(CatchingFishReduxKtor);
                boolean z3 = CatchingFishViewMVIMVVM.CatchingFishUnitTesting(0) || CatchingFishViewMVIMVVM.CatchingFishUnitTesting(valueOf.intValue());
                CatchingFishGradleMVVM catchingFishGradleMVVM = new CatchingFishGradleMVVM(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM) : i >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM) : i >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM)).CatchingFishJobScheduler(z3);
                boolean CatchingFishUnitTesting = CatchingFishViewMVIMVVM.CatchingFishUnitTesting(CatchingFishViewModelScope);
                if (CatchingFishViewMVIMVVM.CatchingFishUnitTesting(CatchingFishReduxKtor) || (CatchingFishReduxKtor == 0 && CatchingFishUnitTesting)) {
                    z = true;
                }
                CatchingFishGradleMVVM catchingFishGradleMVVM2 = new CatchingFishGradleMVVM(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new CatchingFishPicassoGson(window, catchingFishGradleMVVM2) : i2 >= 30 ? new CatchingFishDaggerHiltMVVM(window, catchingFishGradleMVVM2) : i2 >= 26 ? new CatchingFishGraphQLFluxFlux(window, catchingFishGradleMVVM2) : new CatchingFishMVPRetrofit(window, catchingFishGradleMVVM2)).CatchingFishMutableLiveData(z);
                CatchingFishRealmMVVM catchingFishRealmMVVM = new CatchingFishRealmMVVM(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
                CatchingFishGlideFlux.CatchingFishCoroutine(findViewById, catchingFishRealmMVVM);
                this.CatchingFishDaggerAppCompat = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = CatchingFishCardViewView().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.CatchingFishMVPHandler, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.CatchingFishDaggerMVVM;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new CatchingFishMockkSpannable(dialog2, rect));
        }
        CatchingFishCardViewView();
        int i3 = this.CatchingFishRetrofit;
        if (i3 == 0) {
            CatchingFishJobScheduler();
            throw null;
        }
        CatchingFishJobScheduler();
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = this.CatchingFishServiceMVIJUnit;
        CatchingFishRetrofitRealm catchingFishRetrofitRealm = new CatchingFishRetrofitRealm();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", catchingFishCardViewOkHttp);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", catchingFishCardViewOkHttp.CatchingFishViewModelScope);
        catchingFishRetrofitRealm.CatchingFishFragmentFactory(bundle);
        this.CatchingFishGlideWidgetKtor = catchingFishRetrofitRealm;
        CatchingFishRoomSnackbar catchingFishRoomSnackbar = catchingFishRetrofitRealm;
        if (this.CatchingFishWidget == 1) {
            CatchingFishJobScheduler();
            CatchingFishCardViewOkHttp catchingFishCardViewOkHttp2 = this.CatchingFishServiceMVIJUnit;
            CatchingFishRoomSnackbar catchingFishSpannableRoom = new CatchingFishSpannableRoom();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", catchingFishCardViewOkHttp2);
            catchingFishSpannableRoom.CatchingFishFragmentFactory(bundle2);
            catchingFishRoomSnackbar = catchingFishSpannableRoom;
        }
        this.CatchingFishView = catchingFishRoomSnackbar;
        this.CatchingFishLifecycle.setText((this.CatchingFishWidget == 1 && CatchingFishCardViewView().getResources().getConfiguration().orientation == 2) ? this.CatchingFishGlideMVP : this.CatchingFishLiveDataRoom);
        CatchingFishJobScheduler();
        throw null;
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, kotlin.text.CatchingFishGoogleMapsMoshi
    public final void CatchingFishSpannableWidget(Bundle bundle) {
        super.CatchingFishSpannableWidget(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.CatchingFishRetrofit);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        CatchingFishCardViewOkHttp catchingFishCardViewOkHttp = this.CatchingFishServiceMVIJUnit;
        CatchingFishIntentOkHttp catchingFishIntentOkHttp = new CatchingFishIntentOkHttp();
        int i = CatchingFishIntentOkHttp.CatchingFishSnackbar;
        int i2 = CatchingFishIntentOkHttp.CatchingFishSnackbar;
        long j = catchingFishCardViewOkHttp.CatchingFishReduxKtor.CatchingFishLayout;
        long j2 = catchingFishCardViewOkHttp.CatchingFishDaggerWebsocket.CatchingFishLayout;
        catchingFishIntentOkHttp.CatchingFishParcelableFAB = Long.valueOf(catchingFishCardViewOkHttp.CatchingFishViewModelScope.CatchingFishLayout);
        int i3 = catchingFishCardViewOkHttp.CatchingFishViewModelFAB;
        CatchingFishRealmFragment catchingFishRealmFragment = catchingFishCardViewOkHttp.CatchingFishWorkManager;
        CatchingFishRetrofitRealm catchingFishRetrofitRealm = this.CatchingFishGlideWidgetKtor;
        CatchingFishLiveDataMVI catchingFishLiveDataMVI = catchingFishRetrofitRealm == null ? null : catchingFishRetrofitRealm.CatchingFishStripeAPI;
        if (catchingFishLiveDataMVI != null) {
            catchingFishIntentOkHttp.CatchingFishParcelableFAB = Long.valueOf(catchingFishLiveDataMVI.CatchingFishLayout);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", catchingFishRealmFragment);
        CatchingFishLiveDataMVI CatchingFishSnackbar = CatchingFishLiveDataMVI.CatchingFishSnackbar(j);
        CatchingFishLiveDataMVI CatchingFishSnackbar2 = CatchingFishLiveDataMVI.CatchingFishSnackbar(j2);
        CatchingFishRealmFragment catchingFishRealmFragment2 = (CatchingFishRealmFragment) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = catchingFishIntentOkHttp.CatchingFishParcelableFAB;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CatchingFishCardViewOkHttp(CatchingFishSnackbar, CatchingFishSnackbar2, catchingFishRealmFragment2, l == null ? null : CatchingFishLiveDataMVI.CatchingFishSnackbar(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.CatchingFishFABLayout);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.CatchingFishGraphQLGlide);
        bundle.putInt("INPUT_MODE_KEY", this.CatchingFishWidget);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.CatchingFishKtorService);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.CatchingFishWebSocketMockk);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.CatchingFishMVPReduxContext);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.CatchingFishRealmKtorRealm);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.CatchingFishDynamicFeature);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.CatchingFishPayPalHandler);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.CatchingFishSharedFlow);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.CatchingFishCameraX);
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.CatchingFishRetrofitMVI.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // kotlin.text.CatchingFishPayPalMVP, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.CatchingFishGradleLiveData.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.CatchingFishPayPalService;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
