package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.R$styleable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.DisplayCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.LottieUtilsKt;

/* loaded from: classes4.dex */
public final class TextAppearance {
    public Typeface font;
    public final String fontFamily;
    public final int fontFamilyResourceId;
    public String fontVariationSettings;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final ColorStateList textColor;
    public float textSize;
    public final int textStyle;
    public final int typeface;
    public boolean fontResolved = false;
    public boolean systemFontLoadAttempted = false;

    public TextAppearance(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        this.textSize = obtainStyledAttributes.getDimension(0, RecyclerView.DECELERATION_RATE);
        this.textColor = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 3);
        ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 4);
        ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 5);
        this.textStyle = obtainStyledAttributes.getInt(2, 0);
        this.typeface = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.fontFamilyResourceId = obtainStyledAttributes.getResourceId(i2, 0);
        this.fontFamily = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.shadowColor = ContextUtilsKt.getColorStateList(context, obtainStyledAttributes, 6);
        this.shadowDx = obtainStyledAttributes.getFloat(7, RecyclerView.DECELERATION_RATE);
        this.shadowDy = obtainStyledAttributes.getFloat(8, RecyclerView.DECELERATION_RATE);
        this.shadowRadius = obtainStyledAttributes.getFloat(9, RecyclerView.DECELERATION_RATE);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, com.google.android.material.R$styleable.MaterialTextAppearance);
        this.hasLetterSpacing = obtainStyledAttributes2.hasValue(0);
        this.letterSpacing = obtainStyledAttributes2.getFloat(0, RecyclerView.DECELERATION_RATE);
        this.fontVariationSettings = obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
        obtainStyledAttributes2.recycle();
    }

    public final void createFallbackFont() {
        String str;
        Typeface typeface = this.font;
        int i = this.textStyle;
        if (typeface == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, i);
        }
        if (this.font == null) {
            int i2 = this.typeface;
            if (i2 == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.font = Typeface.SERIF;
            } else if (i2 != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, i);
        }
    }

    public final void getFontAsync(Context context, final LottieUtilsKt lottieUtilsKt) {
        if (!maybeLoadFontSynchronously(context)) {
            createFallbackFont();
        }
        int i = this.fontFamilyResourceId;
        if (i == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            lottieUtilsKt.onFontRetrieved(this.font, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i, new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void onFontRetrievalFailed(int i2) {
                    TextAppearance.this.fontResolved = true;
                    lottieUtilsKt.onFontRetrievalFailed(i2);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public final void onFontRetrieved(Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    Typeface create = Typeface.create(typeface, textAppearance.textStyle);
                    textAppearance.font = create;
                    textAppearance.fontResolved = true;
                    lottieUtilsKt.onFontRetrieved(create, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            lottieUtilsKt.onFontRetrievalFailed(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, e);
            this.fontResolved = true;
            lottieUtilsKt.onFontRetrievalFailed(-3);
        }
    }

    public final boolean maybeLoadFontSynchronously(Context context) {
        String str;
        Typeface create;
        if (this.fontResolved) {
            return true;
        }
        int i = this.fontFamilyResourceId;
        if (i != 0) {
            Typeface cachedFont = ResourcesCompat.getCachedFont(context, i);
            if (cachedFont != null) {
                this.font = cachedFont;
                this.fontResolved = true;
                return true;
            }
            Typeface typeface = null;
            if (!this.systemFontLoadAttempted) {
                this.systemFontLoadAttempted = true;
                Resources resources = context.getResources();
                if (i != 0 && resources.getResourceTypeName(i).equals("font")) {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), androidx.core.R$styleable.FontFamily);
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
                    typeface = Typeface.create(create, this.textStyle);
                }
            }
            if (typeface != null) {
                this.font = typeface;
                this.fontResolved = true;
                return true;
            }
        }
        return false;
    }

    public final void updateDrawState(Context context, TextPaint textPaint, LottieUtilsKt lottieUtilsKt) {
        updateMeasureState(context, textPaint, lottieUtilsKt);
        ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void updateMeasureState(final Context context, final TextPaint textPaint, final LottieUtilsKt lottieUtilsKt) {
        Typeface typeface;
        if (maybeLoadFontSynchronously(context) && this.fontResolved && (typeface = this.font) != null) {
            updateTextPaintMeasureState(context, textPaint, typeface);
            return;
        }
        createFallbackFont();
        updateTextPaintMeasureState(context, textPaint, this.font);
        getFontAsync(context, new LottieUtilsKt() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.withpersona.sdk2.inquiry.shared.LottieUtilsKt
            public final void onFontRetrievalFailed(int i) {
                lottieUtilsKt.onFontRetrievalFailed(i);
            }

            @Override // com.withpersona.sdk2.inquiry.shared.LottieUtilsKt
            public final void onFontRetrieved(Typeface typeface2, boolean z) {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface2);
                lottieUtilsKt.onFontRetrieved(typeface2, z);
            }
        });
    }

    public final void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface maybeCopyWithFontWeightAdjustment = DisplayCompat.maybeCopyWithFontWeightAdjustment(context.getResources().getConfiguration(), typeface);
        if (maybeCopyWithFontWeightAdjustment != null) {
            typeface = maybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.textStyle;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : RecyclerView.DECELERATION_RATE);
        textPaint.setTextSize(this.textSize);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.fontVariationSettings);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }
}
