package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.core.graphics.TypefaceCompat;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class ResourcesCompat {
    public static final ThreadLocal sTempTypedValue = new ThreadLocal();
    public static final WeakHashMap sColorStateCaches = new WeakHashMap(0);
    public static final Object sColorStateCacheLock = new Object();

    /* loaded from: classes3.dex */
    public final class ColorStateListCacheEntry {
        public final Configuration mConfiguration;
        public final int mThemeHash;
        public final ColorStateList mValue;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.mValue = colorStateList;
            this.mConfiguration = configuration;
            this.mThemeHash = theme == null ? 0 : theme.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public final class ColorStateListCacheKey {
        public final Resources mResources;
        public final Resources.Theme mTheme;

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.mResources = resources;
            this.mTheme = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ColorStateListCacheKey.class == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.mResources.equals(colorStateListCacheKey.mResources) && Objects.equals(this.mTheme, colorStateListCacheKey.mTheme)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.mResources, this.mTheme);
        }
    }

    public abstract class FontCallback {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i, Handler handler) {
            getHandler(handler).post(new Recorder$$ExternalSyntheticLambda14(this, i, 6));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new MainActivity$$ExternalSyntheticLambda8(4, this, typeface));
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    public static Typeface getCachedFont(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x003f, code lost:
    
        if (r4.mThemeHash == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateListCacheEntry colorStateListCacheEntry;
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        synchronized (sColorStateCacheLock) {
            try {
                SparseArray sparseArray = (SparseArray) sColorStateCaches.get(colorStateListCacheKey);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (colorStateListCacheEntry = (ColorStateListCacheEntry) sparseArray.get(i)) != null) {
                    if (colorStateListCacheEntry.mConfiguration.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (colorStateListCacheEntry.mThemeHash != 0) {
                            }
                            colorStateList2 = colorStateListCacheEntry.mValue;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = sTempTypedValue;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = ColorStateListInflaterCompat.createFromXml(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (sColorStateCacheLock) {
            try {
                WeakHashMap weakHashMap = sColorStateCaches;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(colorStateListCacheKey);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(colorStateListCacheKey, sparseArray2);
                }
                sparseArray2.append(i, new ColorStateListCacheEntry(colorStateList, colorStateListCacheKey.mResources.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static float getFloat(Resources resources, int i) {
        return CamUtils.getFloat(resources, i);
    }

    public static void getFont(Context context, int i, FontCallback fontCallback, Handler handler) {
        fontCallback.getClass();
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            Typeface typeface2 = (Typeface) TypefaceCompat.sTypefaceCache.get(TypefaceCompat.createResourceUid(resources, i, charSequence2, typedValue.assetCookie, i2));
            if (typeface2 != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(typeface2, handler);
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat$FamilyResourceEntry parse = CamUtils.parse(resources.getXml(i), resources);
                        if (parse == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (fontCallback != null) {
                                fontCallback.callbackFailAsync(-3, handler);
                            }
                        } else {
                            typeface = TypefaceCompat.createFromResourcesFamilyXml(context, parse, resources, i, charSequence2, typedValue.assetCookie, i2, fontCallback, handler, z);
                        }
                    } else {
                        Typeface createFromResourcesFontFile = TypefaceCompat.createFromResourcesFontFile(resources, i, charSequence2, typedValue.assetCookie, i2);
                        if (fontCallback != null) {
                            if (createFromResourcesFontFile != null) {
                                fontCallback.callbackSuccessAsync(createFromResourcesFontFile, handler);
                            } else {
                                fontCallback.callbackFailAsync(-3, handler);
                            }
                        }
                        typeface = createFromResourcesFontFile;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (fontCallback != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (fontCallback != null) {
            fontCallback.callbackFailAsync(-3, handler);
        }
        if (typeface == null || fontCallback != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    public static Typeface getFont(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true, false);
    }
}
