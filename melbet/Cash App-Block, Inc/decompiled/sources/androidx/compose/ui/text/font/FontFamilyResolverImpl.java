package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import com.google.android.play.integrity.internal.ax;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class FontFamilyResolverImpl {
    public final CashApp$$ExternalSyntheticLambda2 createDefaultTypeface;
    public final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    public final MemoryCacheService platformFamilyTypefaceAdapter;
    public final ax platformFontLoader;
    public final AndroidFontResolveInterceptor platformResolveInterceptor;
    public final WorkLauncherImpl typefaceRequestCache;

    public FontFamilyResolverImpl(ax axVar, AndroidFontResolveInterceptor androidFontResolveInterceptor) {
        WorkLauncherImpl workLauncherImpl = FontFamilyResolverKt.GlobalTypefaceRequestCache;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.GlobalAsyncTypefaceCache);
        MemoryCacheService memoryCacheService = new MemoryCacheService(13);
        this.platformFontLoader = axVar;
        this.platformResolveInterceptor = androidFontResolveInterceptor;
        this.typefaceRequestCache = workLauncherImpl;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = memoryCacheService;
        this.createDefaultTypeface = new CashApp$$ExternalSyntheticLambda2(this, 16);
    }

    public final TypefaceResult resolve(TypefaceRequest typefaceRequest) {
        WorkLauncherImpl workLauncherImpl = this.typefaceRequestCache;
        Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4 = new Recomposer$$ExternalSyntheticLambda4(11, this, typefaceRequest);
        synchronized (((Trifle) workLauncherImpl.processor)) {
            TypefaceResult typefaceResult = (TypefaceResult) ((LruCache) workLauncherImpl.workTaskExecutor).get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) recomposer$$ExternalSyntheticLambda4.invoke(new Recomposer$$ExternalSyntheticLambda4(12, workLauncherImpl, typefaceRequest));
                synchronized (((Trifle) workLauncherImpl.processor)) {
                    if (((LruCache) workLauncherImpl.workTaskExecutor).get(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                        ((LruCache) workLauncherImpl.workTaskExecutor).put(typefaceRequest, typefaceResult2);
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                a$$ExternalSyntheticBUOutline0.m("Could not load font", e);
                return null;
            }
        }
    }

    /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
    public final TypefaceResult m997resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        AndroidFontResolveInterceptor androidFontResolveInterceptor = this.platformResolveInterceptor;
        androidFontResolveInterceptor.getClass();
        int i3 = androidFontResolveInterceptor.fontWeightAdjustment;
        FontWeight fontWeight2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(RangesKt___RangesKt.coerceIn(fontWeight.weight + i3, 1, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO));
        this.platformFontLoader.getClass();
        return resolve(new TypefaceRequest(fontFamily, fontWeight2, i, i2, null));
    }
}
