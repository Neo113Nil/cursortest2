package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishViewCameraX extends CheckedTextView {
    public final CatchingFishPicassoJUnit CatchingFishDaggerWebsocket;
    public final CatchingFishServiceGraphQL CatchingFishReduxKtor;
    public CatchingFishToastAnimation CatchingFishViewModelScope;
    public final CatchingFishGradleJUnit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishViewCameraX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishWorkManager = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, R.attr.checkedTextViewStyle);
        catchingFishGradleJUnit.CatchingFishSnackbar();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, R.attr.checkedTextViewStyle);
        this.CatchingFishReduxKtor = new CatchingFishServiceGraphQL(this);
        Context context2 = getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishEspressoTesting;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(this, getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(CatchingFishRecyclerView.CatchingFishFragmentFactory(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(CatchingFishRealmPicasso.CatchingFishSnackbar(typedArray.getInt(3, -1), null));
                }
                CatchingFishRecyclerView.CatchingFishAnimation();
                getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            CatchingFishRecyclerView.CatchingFishAnimation();
            getEmojiTextViewHelper().CatchingFishParcelableFAB(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            CatchingFishRecyclerView.CatchingFishAnimation();
            throw th;
        }
    }

    private CatchingFishToastAnimation getEmojiTextViewHelper() {
        if (this.CatchingFishViewModelScope == null) {
            this.CatchingFishViewModelScope = new CatchingFishToastAnimation(this);
        }
        return this.CatchingFishViewModelScope;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            catchingFishServiceGraphQL.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return CatchingFishHiltMVPToast.CatchingFishRecyclerView(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            return (ColorStateList) catchingFishServiceGraphQL.CatchingFishParcelableFAB;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            return (PorterDuff.Mode) catchingFishServiceGraphQL.CatchingFishSnackbar;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.CatchingFishWorkManager.CatchingFishReduxKtor();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.CatchingFishWorkManager.CatchingFishDaggerWebsocket();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        CatchingFishFirebaseDagger.CatchingFishHandler(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().CatchingFishSnackbar(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            if (catchingFishServiceGraphQL.CatchingFishDaggerWebsocket) {
                catchingFishServiceGraphQL.CatchingFishDaggerWebsocket = false;
            } else {
                catchingFishServiceGraphQL.CatchingFishDaggerWebsocket = true;
                catchingFishServiceGraphQL.CatchingFishSnackbar();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(CatchingFishHiltMVPToast.CatchingFishDataStoreIntent(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().CatchingFishCoroutine(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            catchingFishServiceGraphQL.CatchingFishParcelableFAB = colorStateList;
            catchingFishServiceGraphQL.CatchingFishCoroutine = true;
            catchingFishServiceGraphQL.CatchingFishSnackbar();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        CatchingFishServiceGraphQL catchingFishServiceGraphQL = this.CatchingFishReduxKtor;
        if (catchingFishServiceGraphQL != null) {
            catchingFishServiceGraphQL.CatchingFishSnackbar = mode;
            catchingFishServiceGraphQL.CatchingFishReduxKtor = true;
            catchingFishServiceGraphQL.CatchingFishSnackbar();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        catchingFishGradleJUnit.CatchingFishCloudMessaging(colorStateList);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        catchingFishGradleJUnit.CatchingFishEspressoTesting(mode);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishWorkManager;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelScope(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }
}
