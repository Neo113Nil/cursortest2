package kotlin.text;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public class CatchingFishAdMobGlide extends EditText implements CatchingFishServiceMVPRedux {
    public final CatchingFishGradleJUnit CatchingFishDaggerWebsocket;
    public CatchingFishAnimationRedux CatchingFishLayout;
    public final CatchingFishPicassoJUnit CatchingFishReduxKtor;
    public final CatchingFishBundleGlide CatchingFishViewModelFAB;
    public final CatchingFishFABAndroidXKtor CatchingFishViewModelScope;
    public final CatchingFishBundleGlide CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishAdMobGlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        CatchingFishKtorKtorView.CatchingFishParcelableFAB(context);
        CatchingFishKtorWorkManager.CatchingFishParcelableFAB(this, getContext());
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = new CatchingFishPicassoJUnit(this);
        this.CatchingFishReduxKtor = catchingFishPicassoJUnit;
        catchingFishPicassoJUnit.CatchingFishReduxKtor(attributeSet, R.attr.editTextStyle);
        CatchingFishGradleJUnit catchingFishGradleJUnit = new CatchingFishGradleJUnit(this);
        this.CatchingFishDaggerWebsocket = catchingFishGradleJUnit;
        catchingFishGradleJUnit.CatchingFishWorkManager(attributeSet, R.attr.editTextStyle);
        catchingFishGradleJUnit.CatchingFishSnackbar();
        CatchingFishBundleGlide catchingFishBundleGlide = new CatchingFishBundleGlide(9, false);
        catchingFishBundleGlide.CatchingFishDaggerWebsocket = this;
        this.CatchingFishWorkManager = catchingFishBundleGlide;
        this.CatchingFishViewModelScope = new CatchingFishFABAndroidXKtor();
        CatchingFishBundleGlide catchingFishBundleGlide2 = new CatchingFishBundleGlide(this, 8);
        this.CatchingFishViewModelFAB = catchingFishBundleGlide2;
        catchingFishBundleGlide2.CatchingFishParcelableFlux(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener CatchingFishCoroutineFlow = catchingFishBundleGlide2.CatchingFishCoroutineFlow(keyListener);
        if (CatchingFishCoroutineFlow == keyListener) {
            return;
        }
        super.setKeyListener(CatchingFishCoroutineFlow);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private CatchingFishAnimationRedux getSuperCaller() {
        if (this.CatchingFishLayout == null) {
            this.CatchingFishLayout = new CatchingFishAnimationRedux(this);
        }
        return this.CatchingFishLayout;
    }

    @Override // kotlin.text.CatchingFishServiceMVPRedux
    public final CatchingFishMVIOkHttp CatchingFishParcelableFAB(CatchingFishMVIOkHttp catchingFishMVIOkHttp) {
        this.CatchingFishViewModelScope.getClass();
        return CatchingFishFABAndroidXKtor.CatchingFishParcelableFAB(this, catchingFishMVIOkHttp);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishParcelableFAB();
        }
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return CatchingFishHiltMVPToast.CatchingFishRecyclerView(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishSnackbar();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            return catchingFishPicassoJUnit.CatchingFishCoroutine();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.CatchingFishDaggerWebsocket.CatchingFishReduxKtor();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        CatchingFishBundleGlide catchingFishBundleGlide;
        if (Build.VERSION.SDK_INT >= 28 || (catchingFishBundleGlide = this.CatchingFishWorkManager) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) catchingFishBundleGlide.CatchingFishWorkManager;
        return textClassifier == null ? CatchingFishReduxStripeAPI.CatchingFishParcelableFAB((TextView) catchingFishBundleGlide.CatchingFishDaggerWebsocket) : textClassifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
    
        if (r3 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r3 != null) goto L69;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] CatchingFishViewModelScope;
        String[] stringArray;
        InputConnection catchingFishOkHttpAndroidX;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.CatchingFishDaggerWebsocket.getClass();
        int i = Build.VERSION.SDK_INT;
        int i2 = 2;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                CatchingFishJUnitIntent.CatchingFishLayout(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    CatchingFishJUnitIntent.CatchingFishLayout(editorInfo, text);
                } else {
                    int i3 = editorInfo.initialSelStart;
                    int i4 = editorInfo.initialSelEnd;
                    int i5 = i3 > i4 ? i4 : i3;
                    if (i3 <= i4) {
                        i3 = i4;
                    }
                    int length = text.length();
                    if (i5 < 0 || i3 > length) {
                        CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, null, 0, 0);
                    } else {
                        int i6 = editorInfo.inputType & 4095;
                        if (i6 == 129 || i6 == 225 || i6 == 18) {
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, text, i5, i3);
                        } else {
                            int i7 = i3 - i5;
                            int i8 = i7 > 1024 ? 0 : i7;
                            int i9 = 2048 - i8;
                            int min = Math.min(text.length() - i3, i9 - Math.min(i5, (int) (i9 * 0.8d)));
                            int min2 = Math.min(i5, i9 - min);
                            int i10 = i5 - min2;
                            if (Character.isLowSurrogate(text.charAt(i10))) {
                                i10++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i3 + min) - 1))) {
                                min--;
                            }
                            int i11 = min2 + i8;
                            CatchingFishRobolectricHilt.CatchingFishParcelable(editorInfo, i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i3, min + i3)) : text.subSequence(i10, i10 + i11 + min), min2, i11);
                        }
                    }
                }
            }
        }
        CatchingFishFirebaseDagger.CatchingFishHandler(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (CatchingFishViewModelScope = CatchingFishFABCameraX.CatchingFishViewModelScope(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = CatchingFishViewModelScope;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", CatchingFishViewModelScope);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", CatchingFishViewModelScope);
            }
            CatchingFishLayoutCoroutine catchingFishLayoutCoroutine = new CatchingFishLayoutCoroutine(i2, this);
            if (i >= 25) {
                catchingFishOkHttpAndroidX = new CatchingFishHiltFragment(onCreateInputConnection, catchingFishLayoutCoroutine);
            } else {
                String[] strArr = CatchingFishRobolectricHilt.CatchingFishFragmentHandler;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                    }
                    if (strArr.length != 0) {
                        catchingFishOkHttpAndroidX = new CatchingFishOkHttpAndroidX(onCreateInputConnection, catchingFishLayoutCoroutine);
                    }
                }
            }
            onCreateInputConnection = catchingFishOkHttpAndroidX;
        }
        return this.CatchingFishViewModelFAB.CatchingFishGsonAppCompat(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && CatchingFishFABCameraX.CatchingFishViewModelScope(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = CatchingFishToastMVIRoom.CatchingFishParcelableFAB(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        CatchingFishGsonBundleMoshi catchingFishGsonBundleMoshi;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || CatchingFishFABCameraX.CatchingFishViewModelScope(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                catchingFishGsonBundleMoshi = new CatchingFishServiceHilt(primaryClip, 1);
            } else {
                CatchingFishStripeAPIKtor catchingFishStripeAPIKtor = new CatchingFishStripeAPIKtor();
                catchingFishStripeAPIKtor.CatchingFishDaggerWebsocket = primaryClip;
                catchingFishStripeAPIKtor.CatchingFishWorkManager = 1;
                catchingFishGsonBundleMoshi = catchingFishStripeAPIKtor;
            }
            catchingFishGsonBundleMoshi.CatchingFishRoomDatabase(i == 16908322 ? 0 : 1);
            CatchingFishFABCameraX.CatchingFishLayout(this, catchingFishGsonBundleMoshi.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishDaggerWebsocket();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishWorkManager(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishSnackbar();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(CatchingFishHiltMVPToast.CatchingFishDataStoreIntent(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.CatchingFishViewModelFAB.CatchingFishMutableLiveData(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.CatchingFishViewModelFAB.CatchingFishCoroutineFlow(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishViewModelFAB(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = this.CatchingFishReduxKtor;
        if (catchingFishPicassoJUnit != null) {
            catchingFishPicassoJUnit.CatchingFishLayout(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishCloudMessaging(colorStateList);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        catchingFishGradleJUnit.CatchingFishEspressoTesting(mode);
        catchingFishGradleJUnit.CatchingFishSnackbar();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        CatchingFishGradleJUnit catchingFishGradleJUnit = this.CatchingFishDaggerWebsocket;
        if (catchingFishGradleJUnit != null) {
            catchingFishGradleJUnit.CatchingFishViewModelScope(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        CatchingFishBundleGlide catchingFishBundleGlide;
        if (Build.VERSION.SDK_INT >= 28 || (catchingFishBundleGlide = this.CatchingFishWorkManager) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            catchingFishBundleGlide.CatchingFishWorkManager = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
