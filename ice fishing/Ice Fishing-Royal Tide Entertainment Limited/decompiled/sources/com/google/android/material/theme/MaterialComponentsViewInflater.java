package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import kotlin.text.CatchingFishDaggerBiometric;
import kotlin.text.CatchingFishDataStoreBundle;
import kotlin.text.CatchingFishGlideView;
import kotlin.text.CatchingFishGsonCardView;
import kotlin.text.CatchingFishHiltHandler;
import kotlin.text.CatchingFishHiltHilt;
import kotlin.text.CatchingFishLayoutPicasso;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVIMVPOkHttp;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishRoomFlux;
import kotlin.text.CatchingFishRoomLifecycle;
import kotlin.text.CatchingFishSnackbarPicasso;
import kotlin.text.CatchingFishStateFlowRedux;
import kotlin.text.CatchingFishViewDatabinding;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends CatchingFishHiltHilt {
    @Override // kotlin.text.CatchingFishHiltHilt
    public final CatchingFishViewDatabinding CatchingFishCoroutine(Context context, AttributeSet attributeSet) {
        return new CatchingFishStateFlowRedux(context, attributeSet);
    }

    @Override // kotlin.text.CatchingFishHiltHilt
    public final CatchingFishDataStoreBundle CatchingFishDaggerWebsocket(Context context, AttributeSet attributeSet) {
        CatchingFishRoomLifecycle catchingFishRoomLifecycle = new CatchingFishRoomLifecycle(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = catchingFishRoomLifecycle.getContext();
        if (CatchingFishOkHttpFAB.CatchingFishMotionLayout(context2, com.catchingfish.fishcatcherpro.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = CatchingFishSnackbarPicasso.CatchingFishCoroutineFlow;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int CatchingFishViewModelScope = CatchingFishRoomLifecycle.CatchingFishViewModelScope(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (CatchingFishViewModelScope == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, CatchingFishSnackbarPicasso.CatchingFishJetpackCompose);
                    int CatchingFishViewModelScope2 = CatchingFishRoomLifecycle.CatchingFishViewModelScope(catchingFishRoomLifecycle.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (CatchingFishViewModelScope2 >= 0) {
                        catchingFishRoomLifecycle.setLineHeight(CatchingFishViewModelScope2);
                    }
                }
            }
        }
        return catchingFishRoomLifecycle;
    }

    @Override // kotlin.text.CatchingFishHiltHilt
    public final CatchingFishRoomFlux CatchingFishParcelableFAB(Context context, AttributeSet attributeSet) {
        return new CatchingFishMVIMVPOkHttp(context, attributeSet);
    }

    @Override // kotlin.text.CatchingFishHiltHilt
    public final CatchingFishGlideView CatchingFishReduxKtor(Context context, AttributeSet attributeSet) {
        CatchingFishLayoutPicasso catchingFishLayoutPicasso = new CatchingFishLayoutPicasso(CatchingFishGsonCardView.CatchingFishHandler(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.radioButtonStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = catchingFishLayoutPicasso.getContext();
        TypedArray CatchingFishCameraXIntent = CatchingFishLayoutRoomFAB.CatchingFishCameraXIntent(context2, attributeSet, CatchingFishSnackbarPicasso.CatchingFishRoomDatabase, com.catchingfish.fishcatcherpro.R.attr.radioButtonStyle, com.catchingfish.fishcatcherpro.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (CatchingFishCameraXIntent.hasValue(0)) {
            catchingFishLayoutPicasso.setButtonTintList(CatchingFishDaggerBiometric.CatchingFishNavigation(context2, CatchingFishCameraXIntent, 0));
        }
        catchingFishLayoutPicasso.CatchingFishLayout = CatchingFishCameraXIntent.getBoolean(1, false);
        CatchingFishCameraXIntent.recycle();
        return catchingFishLayoutPicasso;
    }

    @Override // kotlin.text.CatchingFishHiltHilt
    public final CatchingFishHiltHandler CatchingFishSnackbar(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
