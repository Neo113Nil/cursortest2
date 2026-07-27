package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* loaded from: classes.dex */
public final class CatchingFishPicassoOkHttp {
    public final ColorStateList CatchingFishCloudMessaging;
    public final String CatchingFishCoroutine;
    public final int CatchingFishDaggerWebsocket;
    public float CatchingFishEspressoTesting;
    public final float CatchingFishFragmentHandler;
    public final boolean CatchingFishLayout;
    public final int CatchingFishOkHttp;
    public final ColorStateList CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;
    public Typeface CatchingFishStateLiveData;
    public final float CatchingFishViewModelFAB;
    public final float CatchingFishViewModelScope;
    public final float CatchingFishWorkManager;
    public boolean CatchingFishUnitTesting = false;
    public boolean CatchingFishAnimationMockk = false;

    public CatchingFishPicassoOkHttp(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, CatchingFishWidgetGlide.CatchingFishDaggerHiltFAB);
        this.CatchingFishEspressoTesting = obtainStyledAttributes.getDimension(0, 0.0f);
        this.CatchingFishCloudMessaging = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 3);
        CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 4);
        CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 5);
        this.CatchingFishReduxKtor = obtainStyledAttributes.getInt(2, 0);
        this.CatchingFishDaggerWebsocket = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.CatchingFishOkHttp = obtainStyledAttributes.getResourceId(i2, 0);
        this.CatchingFishSnackbar = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.CatchingFishParcelableFAB = CatchingFishDaggerBiometric.CatchingFishNavigation(context, obtainStyledAttributes, 6);
        this.CatchingFishWorkManager = obtainStyledAttributes.getFloat(7, 0.0f);
        this.CatchingFishViewModelScope = obtainStyledAttributes.getFloat(8, 0.0f);
        this.CatchingFishViewModelFAB = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, CatchingFishSnackbarPicasso.CatchingFishJetpackCompose);
        this.CatchingFishLayout = obtainStyledAttributes2.hasValue(0);
        this.CatchingFishFragmentHandler = obtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.CatchingFishCoroutine = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        obtainStyledAttributes2.recycle();
    }

    public final boolean CatchingFishCoroutine(Context context) {
        Context context2;
        Typeface CatchingFishParcelableFAB;
        String str;
        Typeface create;
        if (this.CatchingFishUnitTesting) {
            return true;
        }
        int i = this.CatchingFishOkHttp;
        if (i != 0) {
            ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
            Typeface typeface = null;
            if (context.isRestricted()) {
                context2 = context;
                CatchingFishParcelableFAB = null;
            } else {
                context2 = context;
                CatchingFishParcelableFAB = CatchingFishFABAsyncTask.CatchingFishParcelableFAB(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (CatchingFishParcelableFAB != null) {
                this.CatchingFishStateLiveData = CatchingFishParcelableFAB;
                this.CatchingFishUnitTesting = true;
                return true;
            }
            if (!this.CatchingFishAnimationMockk) {
                this.CatchingFishAnimationMockk = true;
                Resources resources = context2.getResources();
                int i2 = this.CatchingFishOkHttp;
                if (i2 != 0 && resources.getResourceTypeName(i2).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i2);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), CatchingFishToolbarKtor.CatchingFishSnackbar);
                                str = obtainAttributes.getString(7);
                                obtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                }
                str = null;
                if (str != null && (create = Typeface.create(str, 0)) != Typeface.DEFAULT) {
                    typeface = Typeface.create(create, this.CatchingFishReduxKtor);
                }
            }
            if (typeface != null) {
                this.CatchingFishStateLiveData = typeface;
                this.CatchingFishUnitTesting = true;
                return true;
            }
        }
        return false;
    }

    public final void CatchingFishDaggerWebsocket(Context context, TextPaint textPaint, CatchingFishDaggerBiometric catchingFishDaggerBiometric) {
        Typeface typeface;
        if (CatchingFishCoroutine(context) && this.CatchingFishUnitTesting && (typeface = this.CatchingFishStateLiveData) != null) {
            CatchingFishWorkManager(context, textPaint, typeface);
            return;
        }
        CatchingFishParcelableFAB();
        CatchingFishWorkManager(context, textPaint, this.CatchingFishStateLiveData);
        CatchingFishSnackbar(context, new CatchingFishMVPContext(this, context, textPaint, catchingFishDaggerBiometric));
    }

    public final void CatchingFishParcelableFAB() {
        String str;
        Typeface typeface = this.CatchingFishStateLiveData;
        int i = this.CatchingFishReduxKtor;
        if (typeface == null && (str = this.CatchingFishSnackbar) != null) {
            this.CatchingFishStateLiveData = Typeface.create(str, i);
        }
        if (this.CatchingFishStateLiveData == null) {
            int i2 = this.CatchingFishDaggerWebsocket;
            if (i2 == 1) {
                this.CatchingFishStateLiveData = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.CatchingFishStateLiveData = Typeface.SERIF;
            } else if (i2 != 3) {
                this.CatchingFishStateLiveData = Typeface.DEFAULT;
            } else {
                this.CatchingFishStateLiveData = Typeface.MONOSPACE;
            }
            this.CatchingFishStateLiveData = Typeface.create(this.CatchingFishStateLiveData, i);
        }
    }

    public final void CatchingFishReduxKtor(Context context, TextPaint textPaint, CatchingFishDaggerBiometric catchingFishDaggerBiometric) {
        CatchingFishDaggerWebsocket(context, textPaint, catchingFishDaggerBiometric);
        ColorStateList colorStateList = this.CatchingFishCloudMessaging;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.CatchingFishParcelableFAB;
        textPaint.setShadowLayer(this.CatchingFishViewModelFAB, this.CatchingFishWorkManager, this.CatchingFishViewModelScope, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void CatchingFishSnackbar(Context context, CatchingFishDaggerBiometric catchingFishDaggerBiometric) {
        if (!CatchingFishCoroutine(context)) {
            CatchingFishParcelableFAB();
        }
        int i = this.CatchingFishOkHttp;
        if (i == 0) {
            this.CatchingFishUnitTesting = true;
        }
        if (this.CatchingFishUnitTesting) {
            catchingFishDaggerBiometric.CatchingFishMutableLiveData(this.CatchingFishStateLiveData, true);
            return;
        }
        try {
            CatchingFishKtorSpannable catchingFishKtorSpannable = new CatchingFishKtorSpannable(this, catchingFishDaggerBiometric);
            ThreadLocal threadLocal = CatchingFishFABAsyncTask.CatchingFishParcelableFAB;
            if (context.isRestricted()) {
                catchingFishKtorSpannable.CatchingFishDaggerWebsocket(-4);
            } else {
                CatchingFishFABAsyncTask.CatchingFishParcelableFAB(context, i, new TypedValue(), 0, catchingFishKtorSpannable, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.CatchingFishUnitTesting = true;
            catchingFishDaggerBiometric.CatchingFishFragmentFactory(1);
        } catch (Exception unused2) {
            this.CatchingFishUnitTesting = true;
            catchingFishDaggerBiometric.CatchingFishFragmentFactory(-3);
        }
    }

    public final void CatchingFishWorkManager(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface CatchingFishCardViewRealm = CatchingFishToastHiltBundle.CatchingFishCardViewRealm(context.getResources().getConfiguration(), typeface);
        if (CatchingFishCardViewRealm != null) {
            typeface = CatchingFishCardViewRealm;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.CatchingFishReduxKtor;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.CatchingFishEspressoTesting);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.CatchingFishCoroutine);
        }
        if (this.CatchingFishLayout) {
            textPaint.setLetterSpacing(this.CatchingFishFragmentHandler);
        }
    }
}
