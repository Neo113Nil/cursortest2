package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishServiceGraphQL {
    public boolean CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public Object CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishServiceGraphQL(TextView textView) {
        this.CatchingFishParcelableFAB = null;
        this.CatchingFishSnackbar = null;
        this.CatchingFishCoroutine = false;
        this.CatchingFishReduxKtor = false;
        this.CatchingFishWorkManager = textView;
    }

    public Object CatchingFishCoroutine() {
        if (this.CatchingFishCoroutine) {
            return null;
        }
        Object obj = this.CatchingFishSnackbar;
        if (obj != null) {
            return obj;
        }
        CatchingFishUnitTestingFlux.CatchingFishReduxKtor("Unexpected form of a provided value");
        throw new CatchingFishBiometricView();
    }

    public void CatchingFishParcelableFAB() {
        CompoundButton compoundButton = (CompoundButton) this.CatchingFishWorkManager;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.CatchingFishCoroutine || this.CatchingFishReduxKtor) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.CatchingFishCoroutine) {
                    mutate.setTintList((ColorStateList) this.CatchingFishParcelableFAB);
                }
                if (this.CatchingFishReduxKtor) {
                    mutate.setTintMode((PorterDuff.Mode) this.CatchingFishSnackbar);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:8:0x002f, B:9:0x0055, B:11:0x005c, B:12:0x0063, B:14:0x006a, B:21:0x003e, B:23:0x0044, B:25:0x004a), top: B:2:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void CatchingFishReduxKtor(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.CatchingFishWorkManager;
        Context context = compoundButton.getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishOkHttp;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(CatchingFishRecyclerView.CatchingFishFragmentFactory(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(CatchingFishRealmPicasso.CatchingFishSnackbar(typedArray.getInt(3, -1), null));
                }
                CatchingFishRecyclerView.CatchingFishAnimation();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            CatchingFishRecyclerView.CatchingFishAnimation();
        } catch (Throwable th) {
            CatchingFishRecyclerView.CatchingFishAnimation();
            throw th;
        }
    }

    public void CatchingFishSnackbar() {
        CatchingFishViewCameraX catchingFishViewCameraX = (CatchingFishViewCameraX) this.CatchingFishWorkManager;
        Drawable checkMarkDrawable = catchingFishViewCameraX.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.CatchingFishCoroutine || this.CatchingFishReduxKtor) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.CatchingFishCoroutine) {
                    mutate.setTintList((ColorStateList) this.CatchingFishParcelableFAB);
                }
                if (this.CatchingFishReduxKtor) {
                    mutate.setTintMode((PorterDuff.Mode) this.CatchingFishSnackbar);
                }
                if (mutate.isStateful()) {
                    mutate.setState(catchingFishViewCameraX.getDrawableState());
                }
                catchingFishViewCameraX.setCheckMarkDrawable(mutate);
            }
        }
    }

    public CatchingFishServiceGraphQL(CatchingFishStripeAPILayout catchingFishStripeAPILayout, Object obj, boolean z, CatchingFishWidgetViewPager catchingFishWidgetViewPager, boolean z2) {
        this.CatchingFishWorkManager = catchingFishStripeAPILayout;
        this.CatchingFishCoroutine = z;
        this.CatchingFishParcelableFAB = catchingFishWidgetViewPager;
        this.CatchingFishReduxKtor = z2;
        this.CatchingFishSnackbar = obj;
        this.CatchingFishDaggerWebsocket = true;
    }
}
