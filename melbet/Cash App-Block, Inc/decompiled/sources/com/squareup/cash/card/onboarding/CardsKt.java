package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextPaint;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.ImageDrawable;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.PaymentMethod;
import com.squareup.util.android.drawable.MirrorDrawable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes6.dex */
public abstract class CardsKt {
    public static final Paint ADD_XFER_PAINT;
    public static final int BASE_NORMAL;
    public static final Rect CARD_RECT;
    public static final RectF ICON_TEXTURE_BOUNDS;
    public static final int INK_COLOR_MASK;
    public static final int METAL_MASK_COLOR;
    public static final int PAN_COLOR_MASK;
    public static final int TORTOISE_OVERLAY;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CardTheme.Font.values().length];
            try {
                iArr[CardTheme.Font.SHANTELL_SANS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr2[CardTheme.BackgroundImage.SHANTELL_MARTIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.HOOD_BY_AIR.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.HUNDRED_THIEVES.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.SLIMEGUY.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.TAP_DEVICE_TRIAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.DREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.GLITTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 10;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardTheme.BackgroundImage.BRAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CardTheme.Identifier.values().length];
            try {
                iArr3[CardTheme.Identifier.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CardTheme.Identifier.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CardTheme.Identifier.PINK_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[CardTheme.Identifier.GLOW_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[CardTheme.Identifier.HOLO_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[PaymentMethod.values().length];
            try {
                iArr4[PaymentMethod.DEBIT_FLEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[PaymentMethod.PREPAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    static {
        RectF rectF = new RectF();
        rectF.left = 0.84757984f;
        rectF.top = 0.53140414f;
        rectF.right = 1.0f;
        rectF.bottom = 0.53140414f + 0.11323642f;
        ICON_TEXTURE_BOUNDS = rectF;
        CARD_RECT = new Rect(0, 0, 971, 612);
        BASE_NORMAL = Color.argb(255, 127, 127, 255);
        INK_COLOR_MASK = Color.argb(255, 255, 0, 0);
        METAL_MASK_COLOR = Color.argb(255, 0, 255, 0);
        PAN_COLOR_MASK = Color.argb(255, 255, 0, 0);
        TORTOISE_OVERLAY = Color.argb(76, 0, 0, 0);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        ADD_XFER_PAINT = paint;
    }

    public static Bitmap cardShimmerGradient$default(Context context) {
        context.getClass();
        Rect rect = CARD_RECT;
        rect.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.card_shimmer_gradient);
        canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), rect, (Paint) null);
        float height = 1307 - rect.height();
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, height);
        try {
            canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), rect, (Paint) null);
            return createBitmap;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final Rect chipBounds(Context context, Rect rect) {
        float floatRes = getFloatRes(context, R.dimen.card_chip_width_percent);
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_height_percent);
        float f2 = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_left_offset);
        int width = (int) (f2 * rect.width());
        int i = (int) (ResourcesCompat.getFloat(context.getResources(), R.dimen.card_chip_top_offset) * rect.height());
        return new Rect(width, i, ((int) (floatRes * rect.width())) + width, ((int) (f * rect.height())) + i);
    }

    public static final Bitmap convertToAlpha8(Bitmap bitmap) {
        bitmap.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1.0f, -1.0f, -1.0f, 1.0f, 255.0f}));
        canvas.drawBitmap(bitmap, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, paint);
        return createBitmap;
    }

    public static Bitmap createAlbedo$default(Context context, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, int i, CardModelView.CardBack cardBack, int i2, int i3, int i4) {
        context.getClass();
        Rect rect = CARD_RECT;
        rect.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawCardFront(canvas, context, rect, backgroundImage, identifier, i, i2, true);
        float height = 1307 - rect.height();
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, height);
        try {
            if (cardBack.withRealCard) {
                drawRealCardBack(canvas, context, rect, identifier, backgroundImage, cardBack, i2, i3, i4, i);
            } else {
                drawSlimCardBack(canvas, context, rect, identifier, backgroundImage, cardBack, i2, i3, i4, i);
            }
            canvas.restoreToCount(save);
            return createBitmap;
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public static Bitmap createContouredText$default(Context context, int i, String str) {
        context.getClass();
        str.getClass();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(ResourcesCompat.getFont(context, R.font.cashsansmono_regular));
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(256.0f);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(" ");
        textPaint.getTextBounds(str, 0, str.length(), new Rect());
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int save = canvas.save();
        canvas.scale(256.0f / (measureText + measureText2), 256.0f / r2.height(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        try {
            canvas.drawText(str, (measureText2 / 2.0f) - r2.left, -r2.top, textPaint);
            return createBitmap;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static Bitmap createCopyPan$default(Context context, CardModelView.CardBack cardBack) {
        context.getClass();
        CARD_RECT.getClass();
        cardBack.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_pan_left_offset) * r0.width();
        float f2 = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_pan_top_offset) * r0.height();
        float width = r0.width() - (2.0f * f);
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface(cardBack.font, context));
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, -12303292);
        textPaint.setColor(-1);
        textPaint.setTextSize(76.0f);
        ArrayList chunked = StringsKt___StringsKt.chunked(4, StringsKt__StringsJVMKt.replace$default(cardBack.cardNumber, " ", ""));
        float textSize = textPaint.getTextSize() - textPaint.getFontMetrics().descent;
        int save = canvas.save();
        canvas.translate(f, (1307 - r0.height()) + f2 + textSize);
        try {
            drawJustifiedLine(canvas, chunked, width, textPaint);
            canvas.restoreToCount(save);
            float f3 = f2 + textSize;
            save = canvas.save();
            canvas.translate(f, f3);
            try {
                drawJustifiedLine(canvas, chunked, width, textPaint);
                return createBitmap;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0195 A[Catch: all -> 0x0199, TryCatch #3 {all -> 0x0199, blocks: (B:51:0x0189, B:53:0x018e, B:57:0x0195, B:88:0x019c, B:90:0x01b7, B:95:0x01b3, B:96:0x01b6, B:92:0x01ae), top: B:50:0x0189, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f4 A[Catch: all -> 0x01ed, TryCatch #5 {all -> 0x01ed, blocks: (B:83:0x01e9, B:60:0x01f0, B:62:0x01f4, B:81:0x01f8), top: B:82:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0284 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8 A[Catch: all -> 0x01ed, TRY_LEAVE, TryCatch #5 {all -> 0x01ed, blocks: (B:83:0x01e9, B:60:0x01f0, B:62:0x01f4, B:81:0x01f8), top: B:82:0x01e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap createInkMetal$default(Context context, CardModelView.CardFront cardFront, CardModelView.CardBack cardBack) {
        CashtagDrawable cashtagDrawable;
        Bitmap bitmap;
        int i;
        Drawable mutate;
        int saveLayer;
        CardTheme.BackgroundImage backgroundImage;
        int save;
        MirrorDrawable mirrorDrawable;
        Path path;
        Bitmap bitmap2;
        context.getClass();
        Rect rect = CARD_RECT;
        rect.getClass();
        cardFront.getClass();
        cardBack.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        String str = cardFront.cashtag;
        CardTheme.Identifier identifier = cardFront.id;
        EquatableBitmap equatableBitmap = cardFront.customizationOverride;
        CardTheme.BackgroundImage backgroundImage2 = cardFront.backgroundImage;
        int i2 = INK_COLOR_MASK;
        try {
            if (str != null) {
                if (equatableBitmap != null) {
                    str = null;
                }
                if (str != null) {
                    cashtagDrawable = new CashtagDrawable(context, str, false);
                    cashtagDrawable.setBounds(rect);
                    cashtagDrawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_ATOP));
                    cashtagDrawable.textPaint.setTypeface(typeface(cardFront.font, context));
                    if (equatableBitmap != null || (bitmap2 = equatableBitmap.bitmap) == null || (bitmap = convertToAlpha8(bitmap2)) == null) {
                        CustomizationDetails customizationDetails = cardFront.customizationDetails;
                        bitmap = customizationDetails == null ? CustomizationDetailsExtensionsKt.toBitmap(customizationDetails, rect.width(), rect.height()) : null;
                    }
                    Paint paint = ADD_XFER_PAINT;
                    if (bitmap != null) {
                        Paint paint2 = new Paint();
                        paint2.setColor(i2);
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                        CardTheme.CardCustomizationMargin cardCustomizationMargin = cardFront.customizationMargin;
                        if (cardCustomizationMargin != null) {
                            float width = bitmap.getWidth();
                            Float f = cardCustomizationMargin.size;
                            f.getClass();
                            float floatValue = f.floatValue() * width;
                            CanvasKt.clipCard(bitmap, floatValue, Math.max((ResourcesCompat.getFloat(context.getResources(), R.dimen.card_corner_radius_ratio) * bitmap.getWidth()) - floatValue, ResourcesCompat.getFloat(context.getResources(), R.dimen.card_corner_radius_min)));
                        }
                        if (cashtagDrawable != null && (path = (Path) cashtagDrawable.cashtagPath$delegate.getValue()) != null) {
                            Canvas canvas2 = new Canvas(bitmap);
                            canvas2.clipPath(path);
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                        }
                        saveLayer = canvas.saveLayer(null, paint);
                        try {
                            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint2);
                        } finally {
                        }
                    }
                    i = backgroundImage2 != null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage2.ordinal()];
                    if (i != 1) {
                        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_shantell_antenna, null);
                        drawableCompat.getClass();
                        mutate = drawableCompat.mutate();
                    } else if (i == 3) {
                        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_hundred_thieves_metal, null);
                        drawableCompat2.getClass();
                        mutate = drawableCompat2.mutate();
                    } else if (i != 10) {
                        if ((identifier != null ? WhenMappings.$EnumSwitchMapping$2[identifier.ordinal()] : -1) == 5) {
                            Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context, R.drawable.card_glitter_antenna, null);
                            drawableCompat3.getClass();
                            Drawable mutate2 = drawableCompat3.mutate();
                            mutate2.getClass();
                            mirrorDrawable = new MirrorDrawable(mutate2);
                        } else {
                            mirrorDrawable = null;
                        }
                        mutate = mirrorDrawable;
                    } else {
                        Drawable drawableCompat4 = PlatformKt.getDrawableCompat(context, R.drawable.card_glitter_antenna, null);
                        drawableCompat4.getClass();
                        Drawable mutate3 = drawableCompat4.mutate();
                        mutate3.getClass();
                        mutate = new MirrorDrawable(mutate3);
                    }
                    int i3 = METAL_MASK_COLOR;
                    if (mutate == null) {
                        mutate.setBounds(rect);
                        mutate.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
                    } else {
                        mutate = null;
                    }
                    saveLayer = canvas.saveLayer(null, paint);
                    backgroundImage = CardTheme.BackgroundImage.TORTOISE;
                    if (backgroundImage2 != backgroundImage && identifier != CardTheme.Identifier.HOLO_ID) {
                        if (mutate != null) {
                            mutate.draw(canvas);
                        }
                        canvas.restoreToCount(saveLayer);
                        Drawable drawableCompat5 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_silver, null);
                        drawableCompat5.getClass();
                        Drawable mutate4 = drawableCompat5.mutate();
                        mutate4.getClass();
                        mutate4.setBounds(chipBounds(context, rect));
                        mutate4.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
                        mutate4.draw(canvas);
                        saveLayer = canvas.saveLayer(null, paint);
                        if (cashtagDrawable != null) {
                            try {
                                cashtagDrawable.draw(canvas);
                            } finally {
                            }
                        }
                        if (cardBack.withRealCard) {
                            drawSlimCardDetails(context, rect, cardBack, canvas);
                        } else {
                            drawRealCardDetails(context, rect, cardBack, canvas);
                        }
                        if (backgroundImage2 == backgroundImage) {
                            return createBitmap;
                        }
                        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.card_tortoise_roughness);
                        decodeResource.getClass();
                        Resources resources = context.getResources();
                        resources.getClass();
                        ImageDrawable imageDrawable = new ImageDrawable(new BitmapDrawable(resources, decodeResource), 2);
                        imageDrawable.setBounds(rect);
                        imageDrawable.setColorFilter(new ColorMatrixColorFilter(new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 255.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE}));
                        saveLayer = canvas.saveLayer(null, paint);
                        try {
                            imageDrawable.draw(canvas);
                            float height = 1307 - rect.height();
                            save = canvas.save();
                            canvas.translate(RecyclerView.DECELERATION_RATE, height);
                            try {
                                MirrorDrawable mirrorDrawable2 = new MirrorDrawable(imageDrawable);
                                mirrorDrawable2.setBounds(rect);
                                mirrorDrawable2.draw(canvas);
                                Rect rect2 = new Rect(0, 0, rect.width(), EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
                                Paint paint3 = new Paint();
                                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                canvas.drawRect(rect2, paint3);
                                return createBitmap;
                            } finally {
                            }
                        } finally {
                        }
                    }
                    float height2 = 1307 - rect.height();
                    save = canvas.save();
                    canvas.translate(RecyclerView.DECELERATION_RATE, height2);
                    if (mutate != null) {
                        try {
                            mutate.draw(canvas);
                        } finally {
                        }
                    }
                    canvas.restoreToCount(saveLayer);
                    Drawable drawableCompat52 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_silver, null);
                    drawableCompat52.getClass();
                    Drawable mutate42 = drawableCompat52.mutate();
                    mutate42.getClass();
                    mutate42.setBounds(chipBounds(context, rect));
                    mutate42.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
                    mutate42.draw(canvas);
                    saveLayer = canvas.saveLayer(null, paint);
                    if (cashtagDrawable != null) {
                    }
                    if (cardBack.withRealCard) {
                    }
                    if (backgroundImage2 == backgroundImage) {
                    }
                }
            }
            backgroundImage = CardTheme.BackgroundImage.TORTOISE;
            if (backgroundImage2 != backgroundImage) {
                if (mutate != null) {
                }
                canvas.restoreToCount(saveLayer);
                Drawable drawableCompat522 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_silver, null);
                drawableCompat522.getClass();
                Drawable mutate422 = drawableCompat522.mutate();
                mutate422.getClass();
                mutate422.setBounds(chipBounds(context, rect));
                mutate422.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
                mutate422.draw(canvas);
                saveLayer = canvas.saveLayer(null, paint);
                if (cashtagDrawable != null) {
                }
                if (cardBack.withRealCard) {
                }
                if (backgroundImage2 == backgroundImage) {
                }
            }
            float height22 = 1307 - rect.height();
            save = canvas.save();
            canvas.translate(RecyclerView.DECELERATION_RATE, height22);
            if (mutate != null) {
            }
            canvas.restoreToCount(saveLayer);
            Drawable drawableCompat5222 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_silver, null);
            drawableCompat5222.getClass();
            Drawable mutate4222 = drawableCompat5222.mutate();
            mutate4222.getClass();
            mutate4222.setBounds(chipBounds(context, rect));
            mutate4222.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            mutate4222.draw(canvas);
            saveLayer = canvas.saveLayer(null, paint);
            if (cashtagDrawable != null) {
            }
            if (cardBack.withRealCard) {
            }
            if (backgroundImage2 == backgroundImage) {
            }
        } finally {
        }
        cashtagDrawable = null;
        if (equatableBitmap != null) {
        }
        CustomizationDetails customizationDetails2 = cardFront.customizationDetails;
        if (customizationDetails2 == null) {
        }
        Paint paint4 = ADD_XFER_PAINT;
        if (bitmap != null) {
        }
        if (backgroundImage2 != null) {
        }
        if (i != 1) {
        }
        int i32 = METAL_MASK_COLOR;
        if (mutate == null) {
        }
        saveLayer = canvas.saveLayer(null, paint4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap createNormal$default(Context context, CardTheme.BackgroundImage backgroundImage) {
        Bitmap bitmap;
        context.getClass();
        Rect rect = CARD_RECT;
        rect.getClass();
        int i = 1307;
        Bitmap createBitmap = Bitmap.createBitmap(971, 1307, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = BASE_NORMAL;
        canvas.drawColor(i2);
        int i3 = backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()];
        Drawable drawableCompat = i3 != 1 ? i3 != 7 ? null : PlatformKt.getDrawableCompat(context, R.drawable.tap_device, null) : PlatformKt.getDrawableCompat(context, R.drawable.card_shantell_martin_normal, null);
        if (drawableCompat != null) {
            drawableCompat.setBounds(rect);
        }
        if (drawableCompat != null) {
            drawableCompat.draw(canvas);
        }
        int i4 = 0;
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
            InputStream open = context.getAssets().open("glitter_normal.png");
            open.getClass();
            Bitmap decodeStream = BitmapFactory.decodeStream(open);
            decodeStream.getClass();
            Rect rect2 = new Rect(0, 0, decodeStream.getWidth(), decodeStream.getWidth());
            int i5 = 512;
            IntProgression step = RangesKt___RangesKt.step(512, RangesKt___RangesKt.until(0, 971));
            int i6 = step.first;
            int i7 = step.last;
            int i8 = step.step;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    IntProgression step2 = RangesKt___RangesKt.step(i5, RangesKt___RangesKt.until(i4, i));
                    int i9 = step2.first;
                    int i10 = step2.last;
                    int i11 = step2.step;
                    if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                        while (true) {
                            bitmap = createBitmap;
                            canvas.drawBitmap(decodeStream, rect2, new Rect(i6, i9, i6 + 512, i9 + 512), (Paint) null);
                            if (i9 == i10) {
                                break;
                            }
                            i9 += i11;
                            createBitmap = bitmap;
                        }
                    } else {
                        bitmap = createBitmap;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 += i8;
                    createBitmap = bitmap;
                    i = 1307;
                    i4 = 0;
                    i5 = 512;
                }
                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_normal, null);
                drawableCompat2.getClass();
                drawableCompat2.setBounds(chipBounds(context, rect));
                drawableCompat2.draw(canvas);
                if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
                    Rect rect3 = new Rect(0, rect.height(), 971, 1455 - rect.height());
                    Paint paint = new Paint();
                    paint.setColor(i2);
                    canvas.drawRect(rect3, paint);
                }
                return bitmap;
            }
        }
        bitmap = createBitmap;
        Drawable drawableCompat22 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_normal, null);
        drawableCompat22.getClass();
        drawableCompat22.setBounds(chipBounds(context, rect));
        drawableCompat22.draw(canvas);
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
        }
        return bitmap;
    }

    public static final Path createTextMask(float f, float f2, float f3) {
        Path path = new Path();
        path.addRoundRect(new RectF(f - 16.0f, RecyclerView.DECELERATION_RATE, f + f2 + 16.0f, f3), 64.0f, 64.0f, Path.Direction.CW);
        return path;
    }

    public static final void drawCardFront(Canvas canvas, Context context, Rect rect, CardTheme.BackgroundImage backgroundImage, CardTheme.Identifier identifier, int i, int i2, boolean z) {
        Drawable drawableCompat;
        Drawable drawableCompat2;
        switch (backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()]) {
            case 1:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_shantell_front, null);
                drawableCompat.getClass();
                break;
            case 2:
                drawableCompat = new LayerDrawable(new Drawable[]{PlatformKt.getDrawableCompat(context, R.drawable.card_hood_by_air, null), PlatformKt.getDrawableCompat(context, R.drawable.light_card_gradient, null)});
                break;
            case 3:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_hundred_thieves_metal, null);
                drawableCompat.getClass();
                break;
            case 4:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_metal_black, null);
                drawableCompat.getClass();
                break;
            case 5:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_oil_slick, null);
                drawableCompat.getClass();
                break;
            case 6:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_slimeguy_background, null);
                drawableCompat.getClass();
                break;
            case 7:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.tap_device, null);
                drawableCompat.getClass();
                break;
            case 8:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_dream, null);
                drawableCompat.getClass();
                break;
            case 9:
                GlitterDrawable glitterDrawable = new GlitterDrawable(context, true);
                glitterDrawable.setAlpha(i2);
                Drawable drawableCompat3 = PlatformKt.getDrawableCompat(context, R.drawable.card_glitter_antenna, null);
                drawableCompat3.getClass();
                GlitterDrawable glitterDrawable2 = new GlitterDrawable(context, true);
                glitterDrawable2.setAlpha(30);
                drawableCompat = new LayerDrawable(new Drawable[]{glitterDrawable, drawableCompat3, glitterDrawable2});
                break;
            case 10:
                Drawable drawableCompat4 = PlatformKt.getDrawableCompat(context, R.drawable.card_tortoise, null);
                drawableCompat4.getClass();
                drawableCompat = new LayerDrawable(new Drawable[]{new ImageDrawable(drawableCompat4, 2), new ColorDrawable(TORTOISE_OVERLAY)});
                break;
            case 11:
                drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_brat, null);
                drawableCompat.getClass();
                break;
            default:
                int i3 = identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$2[identifier.ordinal()];
                if (i3 == 1) {
                    drawableCompat = new LayerDrawable(new Drawable[]{new ColorDrawable(i), PlatformKt.getDrawableCompat(context, R.drawable.black_card_gradient, null)});
                    break;
                } else if (i3 != 2 && i3 != 3 && i3 != 4) {
                    drawableCompat = null;
                    break;
                } else {
                    drawableCompat = new LayerDrawable(new Drawable[]{new ColorDrawable(i), PlatformKt.getDrawableCompat(context, R.drawable.light_card_gradient, null)});
                    break;
                }
        }
        if (drawableCompat != null) {
            drawableCompat.setBounds(rect);
        }
        if (drawableCompat != null) {
            drawableCompat.draw(canvas);
        }
        if (z) {
            if ((backgroundImage != null ? WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()] : -1) == 10) {
                drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_gold, null);
                drawableCompat2.getClass();
            } else {
                drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_chip_silver, null);
                drawableCompat2.getClass();
            }
            drawableCompat2.setBounds(chipBounds(context, rect));
            drawableCompat2.draw(canvas);
        }
    }

    public static final void drawJustifiedLine(Canvas canvas, ArrayList arrayList, float f, TextPaint textPaint) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(textPaint.measureText((String) it.next())));
        }
        Iterator it2 = arrayList2.iterator();
        float f2 = 0.0f;
        while (it2.hasNext()) {
            f2 += ((Number) it2.next()).floatValue();
        }
        float size = (f - f2) / (arrayList.size() - 1);
        int size2 = arrayList.size();
        float f3 = 0.0f;
        for (int i = 0; i < size2; i++) {
            canvas.drawText((String) arrayList.get(i), f3, RecyclerView.DECELERATION_RATE, textPaint);
            if (i < arrayList.size() - 1) {
                f3 += textPaint.measureText((String) arrayList.get(i)) + size;
            }
        }
    }

    public static final void drawMagstripe(Canvas canvas, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, Rect rect, Context context, int i) {
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
            Rect rect2 = new Rect(0, 0, rect.width(), EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawRect(rect2, paint);
            return;
        }
        if (backgroundImage != CardTheme.BackgroundImage.TORTOISE && identifier != CardTheme.Identifier.HOLO_ID) {
            Rect rect3 = new Rect(0, 0, rect.width(), EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
            Paint paint2 = new Paint();
            paint2.setColor(i);
            canvas.drawRect(rect3, paint2);
            return;
        }
        Rect rect4 = new Rect(0, 0, rect.width(), EnumC0170g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
        Paint paint3 = new Paint();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawRect(rect4, paint3);
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_glitter_antenna, null);
        drawableCompat.getClass();
        MirrorDrawable mirrorDrawable = new MirrorDrawable(drawableCompat);
        mirrorDrawable.setBounds(rect);
        mirrorDrawable.draw(canvas);
    }

    public static final void drawRealCardBack(Canvas canvas, Context context, Rect rect, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, CardModelView.CardBack cardBack, int i, int i2, int i3, int i4) {
        LayerDrawable layerDrawable;
        PaymentMethod paymentMethod = cardBack.paymentMethod;
        int i5 = paymentMethod == null ? -1 : WhenMappings.$EnumSwitchMapping$3[paymentMethod.ordinal()];
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i5 != 1 ? i5 != 2 ? R.drawable.card_default_back : R.drawable.card_prepaid_back : R.drawable.card_debit_flex_back, Integer.valueOf(i2));
        drawableCompat.getClass();
        int i6 = backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()];
        if (i6 == 1) {
            drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_shantell_back, Integer.valueOf(i2));
            drawableCompat.getClass();
        } else if (i6 != 9) {
            if (i6 != 10) {
                if ((identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$2[identifier.ordinal()]) == 1) {
                    layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i4), drawableCompat, PlatformKt.getDrawableCompat(context, R.drawable.black_card_gradient, null)});
                }
            } else {
                Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_tortoise, null);
                drawableCompat2.getClass();
                layerDrawable = new LayerDrawable(new Drawable[]{new ImageDrawable(new MirrorDrawable(drawableCompat2), 2), new ColorDrawable(TORTOISE_OVERLAY), drawableCompat});
            }
            drawableCompat = layerDrawable;
        } else {
            GlitterDrawable glitterDrawable = new GlitterDrawable(context, false);
            glitterDrawable.setAlpha(i);
            drawableCompat = new LayerDrawable(new Drawable[]{glitterDrawable, drawableCompat});
        }
        drawableCompat.setBounds(rect);
        drawableCompat.draw(canvas);
        drawMagstripe(canvas, identifier, backgroundImage, rect, context, i3);
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
            drawTextMask(canvas, context, cardBack, rect, new GlitterDrawable(context, false));
        } else if (identifier == CardTheme.Identifier.HOLO_ID) {
            drawTextMask(canvas, context, cardBack, rect, new ColorDrawable(-1));
        }
    }

    public static final void drawRealCardDetails(Context context, Rect rect, CardModelView.CardBack cardBack, Canvas canvas) {
        float floatRes = getFloatRes(context, R.dimen.card_detail_left_offset) * rect.width();
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_detail_top_offset) * rect.height();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface(cardBack.font, context));
        textPaint.setTextSize(ResourcesCompat.getFloat(context.getResources(), R.dimen.card_detail_height_percent) * rect.height());
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(INK_COLOR_MASK);
        float height = (1307 - rect.height()) + f + (textPaint.getTextSize() - textPaint.getFontMetrics().descent);
        int save = canvas.save();
        canvas.translate(floatRes, height);
        try {
            float f2 = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_details_line_height) * rect.height();
            canvas.drawText(cardBack.cardHolderName, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, textPaint);
            canvas.drawText(cardBack.cardNumber, RecyclerView.DECELERATION_RATE, f2, textPaint);
            canvas.drawText("CVV " + cardBack.cardCVV + "\t\tEXP " + cardBack.cardExpiration, RecyclerView.DECELERATION_RATE, 2.0f * f2, textPaint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void drawSlimCardBack(Canvas canvas, Context context, Rect rect, CardTheme.Identifier identifier, CardTheme.BackgroundImage backgroundImage, CardModelView.CardBack cardBack, int i, int i2, int i3, int i4) {
        Drawable glitterDrawable;
        Drawable layerDrawable;
        int i5 = backgroundImage == null ? -1 : WhenMappings.$EnumSwitchMapping$1[backgroundImage.ordinal()];
        if (i5 != 9) {
            glitterDrawable = null;
            if (i5 != 10) {
                if ((identifier == null ? -1 : WhenMappings.$EnumSwitchMapping$2[identifier.ordinal()]) == 1) {
                    layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(i4), PlatformKt.getDrawableCompat(context, R.drawable.black_card_gradient, null)});
                }
            } else {
                Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.card_tortoise, null);
                drawableCompat.getClass();
                layerDrawable = new LayerDrawable(new Drawable[]{new ImageDrawable(new MirrorDrawable(drawableCompat), 2), new ColorDrawable(TORTOISE_OVERLAY)});
            }
            glitterDrawable = layerDrawable;
        } else {
            glitterDrawable = new GlitterDrawable(context, false);
            glitterDrawable.setAlpha(i);
        }
        if (glitterDrawable != null) {
            glitterDrawable.setBounds(rect);
        }
        if (glitterDrawable != null) {
            glitterDrawable.draw(canvas);
        }
        int floatRes = (int) (getFloatRes(context, R.dimen.card_slim_visa_left_offset) * rect.width());
        int i6 = (int) (ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_visa_top_offset) * rect.height());
        Drawable drawableCompat2 = PlatformKt.getDrawableCompat(context, R.drawable.card_visa_logo, Integer.valueOf(i2));
        drawableCompat2.getClass();
        drawableCompat2.setBounds(new Rect(floatRes, i6, ((int) (ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_visa_width) * rect.width())) + floatRes, ((int) (ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_visa_height) * rect.height())) + i6));
        drawableCompat2.draw(canvas);
        drawMagstripe(canvas, identifier, backgroundImage, rect, context, i3);
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER) {
            drawSlimTextMask(canvas, context, cardBack, rect, new GlitterDrawable(context, false));
        } else if (identifier == CardTheme.Identifier.HOLO_ID) {
            drawSlimTextMask(canvas, context, cardBack, rect, new ColorDrawable(-1));
        }
    }

    public static final void drawSlimCardDetails(Context context, Rect rect, CardModelView.CardBack cardBack, Canvas canvas) {
        float floatRes = getFloatRes(context, R.dimen.card_slim_pan_left_offset) * rect.width();
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_pan_top_offset) * rect.height();
        float width = rect.width() - (floatRes * 2.0f);
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface(cardBack.font, context));
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        textPaint.setColor(PAN_COLOR_MASK);
        textPaint.setTextSize(76.0f);
        ArrayList chunked = StringsKt___StringsKt.chunked(4, StringsKt__StringsJVMKt.replace$default(cardBack.cardNumber, " ", ""));
        float height = (1307 - rect.height()) + f + (textPaint.getTextSize() - textPaint.getFontMetrics().descent);
        int save = canvas.save();
        canvas.translate(floatRes, height);
        try {
            drawJustifiedLine(canvas, chunked, width, textPaint);
            canvas.restoreToCount(save);
            save = canvas.save();
            canvas.translate(floatRes, 1307.0f - (rect.height() * 0.12962963f));
            try {
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setTypeface(typeface(cardBack.font, context));
                textPaint2.setTextAlign(align);
                textPaint2.setColor(INK_COLOR_MASK);
                textPaint2.setTextSize(ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_details_height_percent) * rect.height());
                canvas.drawText("CVV " + cardBack.cardCVV + "\t\tEXP " + cardBack.cardExpiration, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, textPaint2);
                canvas.drawText(cardBack.cardHolderName, RecyclerView.DECELERATION_RATE, -(textPaint2.getTextSize() * 2.0f), textPaint2);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        throw r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void drawSlimTextMask(Canvas canvas, Context context, CardModelView.CardBack cardBack, Rect rect, Drawable drawable) {
        float floatRes = getFloatRes(context, R.dimen.card_slim_pan_left_offset) * rect.width();
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_pan_top_offset) * rect.height();
        float width = rect.width() - (2.0f * floatRes);
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface(cardBack.font, context));
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        int i = INK_COLOR_MASK;
        textPaint.setColor(i);
        textPaint.setTextSize(76.0f);
        drawable.setBounds(new Rect(0, 0, rect.width(), rect.height()));
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, f - 4.0f);
        try {
            Path createTextMask = createTextMask(floatRes, width, textPaint.getTextSize());
            save = canvas.save();
            canvas.clipPath(createTextMask);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
            canvas.restoreToCount(save);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTypeface(typeface(cardBack.font, context));
            textPaint2.setTextAlign(align);
            textPaint2.setColor(i);
            textPaint2.setTextSize(ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_details_height_percent) * rect.height());
            float height = ((rect.height() - (ResourcesCompat.getFloat(context.getResources(), R.dimen.card_slim_details_bottom) * rect.height())) - textPaint2.getTextSize()) + 6.0f;
            save = canvas.save();
            canvas.translate(RecyclerView.DECELERATION_RATE, height);
            try {
                Path createTextMask2 = createTextMask(floatRes, textPaint2.measureText("CVV " + cardBack.cardCVV), textPaint2.getTextSize());
                save = canvas.save();
                canvas.clipPath(createTextMask2);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        } finally {
        }
    }

    public static final void drawTextMask(Canvas canvas, Context context, CardModelView.CardBack cardBack, Rect rect, Drawable drawable) {
        float floatRes = getFloatRes(context, R.dimen.card_detail_left_offset) * rect.width();
        float f = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_detail_top_offset) * rect.height();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(typeface(cardBack.font, context));
        textPaint.setTextSize(ResourcesCompat.getFloat(context.getResources(), R.dimen.card_detail_height_percent) * rect.height());
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(INK_COLOR_MASK);
        int save = canvas.save();
        canvas.translate(RecyclerView.DECELERATION_RATE, f);
        try {
            float f2 = ResourcesCompat.getFloat(context.getResources(), R.dimen.card_details_line_height) * rect.height();
            float measureText = textPaint.measureText(cardBack.cardNumber);
            float measureText2 = textPaint.measureText("CVV " + cardBack.cardCVV);
            drawable.setBounds(new Rect(0, 0, rect.width(), (int) f2));
            save = canvas.save();
            canvas.translate(RecyclerView.DECELERATION_RATE, f2 - 12.0f);
            Path createTextMask = createTextMask(floatRes, measureText, f2);
            save = canvas.save();
            canvas.clipPath(createTextMask);
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(save);
                save = canvas.save();
                canvas.translate(RecyclerView.DECELERATION_RATE, 4.0f + f2);
                try {
                    Path createTextMask2 = createTextMask(floatRes, measureText2, f2);
                    save = canvas.save();
                    canvas.clipPath(createTextMask2);
                    drawable.draw(canvas);
                    canvas.restoreToCount(save);
                    canvas.restoreToCount(save);
                    canvas.restoreToCount(save);
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        } finally {
        }
    }

    public static final float getFloatRes(Context context, int i) {
        return ResourcesCompat.getFloat(context.getResources(), i);
    }

    public static Bitmap getIcon$default(Context context, int i) {
        context.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int save = canvas.save();
        canvas.scale(0.5f, 0.5f, 64.0f, 64.0f);
        try {
            Drawable drawableCompat = PlatformKt.getDrawableCompat(context, i, -1);
            drawableCompat.getClass();
            drawableCompat.setBounds(new Rect(0, 0, 128, 128));
            drawableCompat.draw(canvas);
            return createBitmap;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final Typeface typeface(CardTheme.Font font, Context context) {
        context.getClass();
        if ((font == null ? -1 : WhenMappings.$EnumSwitchMapping$0[font.ordinal()]) == 1) {
            Typeface font2 = PlatformKt.getFont(context, R.font.shantell_sans_normal_medium);
            font2.getClass();
            return font2;
        }
        Typeface font3 = PlatformKt.getFont(context, R.font.sqmarket_regular);
        font3.getClass();
        return font3;
    }
}
