package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.video.Recorder;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.zzg;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class TypefaceCompat {
    public static Paint sCachedPaint;
    public static final LruCache sTypefaceCache;
    public static final zzg sTypefaceCompatImpl;

    static {
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("TypefaceCompat static init"));
        if (Build.VERSION.SDK_INT >= 31) {
            sTypefaceCompatImpl = new TypefaceCompatApi31Impl();
        } else {
            sTypefaceCompatImpl = new zzg();
        }
        sTypefaceCache = new LruCache(16);
        sCachedPaint = null;
        Trace.endSection();
    }

    public static Typeface createFromFontInfo(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("TypefaceCompat.createFromFontInfo"));
        try {
            zzg zzgVar = sTypefaceCompatImpl;
            zzgVar.getClass();
            Typeface typeface = null;
            try {
                FontFamily fontFamily = zzgVar.getFontFamily(fontInfoArr, context.getContentResolver());
                if (fontFamily != null) {
                    typeface = new Typeface.CustomFallbackBuilder(fontFamily).setStyle(zzg.findBaseFont(fontFamily, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface createFromResourcesFamilyXml(Context context, FontResourcesParserCompat$FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry, Resources resources, int i, String str, int i2, int i3, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z) {
        Typeface typeface;
        FontFamily build;
        Typeface systemFontFamily;
        boolean z2 = fontResourcesParserCompat$FamilyResourceEntry instanceof FontResourcesParserCompat$ProviderResourceEntry;
        LruCache lruCache = sTypefaceCache;
        Typeface typeface2 = null;
        if (z2) {
            FontResourcesParserCompat$ProviderResourceEntry fontResourcesParserCompat$ProviderResourceEntry = (FontResourcesParserCompat$ProviderResourceEntry) fontResourcesParserCompat$FamilyResourceEntry;
            String systemFontFamilyName = fontResourcesParserCompat$ProviderResourceEntry.getSystemFontFamilyName();
            if (TextUtils.isEmpty(systemFontFamilyName) || (systemFontFamily = getSystemFontFamily(systemFontFamilyName)) == null) {
                ArrayList arrayList = (ArrayList) fontResourcesParserCompat$ProviderResourceEntry.getRequests();
                if (arrayList.size() == 1) {
                    typeface2 = getSystemFontFamily(((FontRequest) arrayList.get(0)).mSystemFont);
                } else if (Build.VERSION.SDK_INT >= 31) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList.size()) {
                                    break;
                                }
                                FontRequest fontRequest = (FontRequest) arrayList.get(i5);
                                if (i5 == arrayList.size() - 1 && TextUtils.isEmpty(fontRequest.mVariationSettings)) {
                                    customFallbackBuilder.setSystemFallback(fontRequest.mSystemFont);
                                    break;
                                }
                                String str2 = fontRequest.mSystemFont;
                                String str3 = fontRequest.mVariationSettings;
                                Font guessPrimaryFont = guessPrimaryFont(getSystemFontFamily(str2));
                                if (guessPrimaryFont == null) {
                                    Log.w("TypefaceCompat", "Unable identify the primary font for " + fontRequest.mSystemFont + ". Falling back to provider font.");
                                    break;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    build = new FontFamily.Builder(guessPrimaryFont).build();
                                } else {
                                    try {
                                        Fragment$5$$ExternalSyntheticOutline0.m();
                                        build = new FontFamily.Builder(TypefaceCompat$$ExternalSyntheticApiModelOutline0.m(guessPrimaryFont).setFontVariationSettings(str3).build()).build();
                                    } catch (IOException unused) {
                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                    }
                                }
                                if (customFallbackBuilder == null) {
                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
                                } else {
                                    customFallbackBuilder.addCustomFallback(build);
                                }
                                i5++;
                            }
                            typeface2 = customFallbackBuilder.build();
                        } else {
                            if (getSystemFontFamily(((FontRequest) arrayList.get(i4)).mSystemFont) == null) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            } else {
                typeface2 = systemFontFamily;
            }
            if (typeface2 != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(typeface2, handler);
                }
                lruCache.put(createResourceUid(resources, i, str, i2, i3), typeface2);
                return typeface2;
            }
            typeface = FontsContractCompat.requestFont(context, fontResourcesParserCompat$ProviderResourceEntry.getRequests(), i3, !z ? fontCallback != null : fontResourcesParserCompat$ProviderResourceEntry.getFetchStrategy() != 0, z ? fontResourcesParserCompat$ProviderResourceEntry.getTimeout() : -1, ResourcesCompat.FontCallback.getHandler(handler), new Recorder.AnonymousClass6(fontCallback, 19));
        } else {
            FontResourcesParserCompat$FontFamilyFilesResourceEntry fontResourcesParserCompat$FontFamilyFilesResourceEntry = (FontResourcesParserCompat$FontFamilyFilesResourceEntry) fontResourcesParserCompat$FamilyResourceEntry;
            sTypefaceCompatImpl.getClass();
            try {
                FontFamily.Builder builder = null;
                for (FontResourcesParserCompat$FontFileResourceEntry fontResourcesParserCompat$FontFileResourceEntry : fontResourcesParserCompat$FontFamilyFilesResourceEntry.getEntries()) {
                    try {
                        try {
                            Font build2 = new Font.Builder(resources, fontResourcesParserCompat$FontFileResourceEntry.getResourceId()).setWeight(fontResourcesParserCompat$FontFileResourceEntry.getWeight()).setSlant(fontResourcesParserCompat$FontFileResourceEntry.isItalic() ? 1 : 0).setTtcIndex(fontResourcesParserCompat$FontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontResourcesParserCompat$FontFileResourceEntry.getVariationSettings()).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build2);
                            } else {
                                builder.addFont(build2);
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                        if (fontCallback != null) {
                        }
                        typeface = typeface2;
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
                if (builder != null) {
                    FontFamily build3 = builder.build();
                    try {
                        typeface2 = new Typeface.CustomFallbackBuilder(build3).setStyle(zzg.findBaseFont(build3, i3).getStyle()).build();
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                        if (fontCallback != null) {
                        }
                        typeface = typeface2;
                        if (typeface != null) {
                        }
                        return typeface;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (fontCallback != null) {
                if (typeface2 != null) {
                    fontCallback.callbackSuccessAsync(typeface2, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
            typeface = typeface2;
        }
        if (typeface != null) {
            lruCache.put(createResourceUid(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static Typeface createFromResourcesFontFile(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        sTypefaceCompatImpl.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typeface = null;
        }
        if (typeface != null) {
            sTypefaceCache.put(createResourceUid(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String createResourceUid(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface getSystemFontFamily(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font guessPrimaryFont(Typeface typeface) {
        if (sCachedPaint == null) {
            sCachedPaint = new Paint();
        }
        sCachedPaint.setTextSize(10.0f);
        sCachedPaint.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, sCachedPaint);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}
