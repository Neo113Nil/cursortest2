package bo.app;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import androidx.compose.runtime.Updater;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import coil3.BitmapImage;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.decode.DecodeResult;
import coil3.decode.DecodeUtils;
import coil3.decode.Decoder;
import coil3.decode.ExifData;
import coil3.decode.ExifInterfaceInputStream;
import coil3.decode.ExifOrientationStrategy$$ExternalSyntheticLambda0;
import coil3.decode.ExifUtils;
import coil3.decode.ImageSource;
import coil3.decode.StaticImageDecoder;
import coil3.disk.RealDiskCache;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.request.Options;
import coil3.size.Dimension;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.svg.Svg$ViewBox;
import coil3.svg.SvgDecoder;
import coil3.svg.SvgImage;
import coil3.svg.internal.AndroidSvg;
import coil3.svg.internal.ParseSvg_androidKt;
import coil3.util.BitmapsKt;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParser;
import com.google.maps.android.compose.MapApplier;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.stampview.Stamp;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.presenters.settings.BusinessInfoSetting;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivityData;
import com.squareup.cash.activity.backend.loader.FormattedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.FormattingFailedPaymentHistoryActivityData;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.activity.backend.offline.OfflineFormattedActivityItem;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler;
import com.squareup.cash.activity.presenters.PaymentHistoryActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption;
import com.squareup.cash.amountslider.CappedKeypadListener;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.opentelemetry.api.trace.SpanContext;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import okhttp3.Cache;
import okio.BufferedSource;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;
import okio.Utf8;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes3.dex */
public final /* synthetic */ class yf$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ yf$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ExifData exifData;
        int i;
        boolean z;
        boolean z2;
        int i2;
        Bitmap createBitmap;
        int i3;
        int i4;
        int min;
        double max;
        int i5;
        Throwable th;
        AndroidSvg androidSvg;
        RectF rectF;
        long j;
        float f;
        float f2;
        float max2;
        String gender$lambda$0;
        String appendBridgeJavascript$lambda$0;
        String actionViewIntent$lambda$0;
        String contentCardsUpdate$lambda$0;
        String closeInAppMessageView$lambda$1;
        int i6 = this.$r8$classId;
        LinkedHashMap linkedHashMap = null;
        Object obj = this.f$0;
        switch (i6) {
            case 0:
                return yf.a((File[]) obj);
            case 1:
                StaticImageDecoder staticImageDecoder = (StaticImageDecoder) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                Options options2 = staticImageDecoder.options;
                Cache.CacheResponseBody.AnonymousClass1 anonymousClass1 = new Cache.CacheResponseBody.AnonymousClass1(((ImageSource) staticImageDecoder.source).source());
                RealBufferedSource realBufferedSource = new RealBufferedSource(anonymousClass1);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new RealBufferedSource$inputStream$1(realBufferedSource.peek()), null, options);
                Exception exc = (Exception) anonymousClass1.this$0;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = ExifUtils.paint;
                String str = options.outMimeType;
                ((ExifOrientationStrategy$$ExternalSyntheticLambda0) staticImageDecoder.closeable).getClass();
                if (str != null && (str.equals("image/jpeg") || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif"))) {
                    ExifInterface exifInterface = new ExifInterface(new ExifInterfaceInputStream(new RealBufferedSource$inputStream$1(realBufferedSource.peek())));
                    int attributeInt = exifInterface.getAttributeInt(1, "Orientation");
                    boolean z3 = attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
                    switch (exifInterface.getAttributeInt(1, "Orientation")) {
                        case 3:
                        case 4:
                            i5 = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
                            break;
                        case 5:
                        case 8:
                            i5 = 270;
                            break;
                        case 6:
                        case 7:
                            i5 = 90;
                            break;
                        default:
                            i5 = 0;
                            break;
                    }
                    exifData = new ExifData(z3, i5);
                } else {
                    exifData = ExifData.NONE;
                }
                int i7 = exifData.rotationDegrees;
                boolean z4 = exifData.isFlipped;
                Exception exc2 = (Exception) anonymousClass1.this$0;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace colorSpace = ImageRequests_androidKt.getColorSpace(options2);
                Context context = options2.context;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = (ColorSpace) ExtrasKt.getExtra(options2, ImageRequests_androidKt.colorSpaceKey);
                }
                options.inPremultiplied = ((Boolean) ExtrasKt.getExtra(options2, ImageRequests_androidKt.premultipliedAlphaKey)).booleanValue();
                Bitmap.Config config = (Bitmap.Config) ExtrasKt.getExtra(options2, ImageRequests_androidKt.bitmapConfigKey);
                if ((z4 || i7 > 0) && (config == null || BitmapsKt.isHardware(config))) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (((Boolean) ExtrasKt.getExtra(options2, ImageRequests_androidKt.allowRgb565Key)).booleanValue() && config == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                int i8 = options.outWidth;
                if (i8 <= 0 || (i3 = options.outHeight) <= 0) {
                    i = i7;
                    z = z4;
                    options.inSampleSize = 1;
                    z2 = false;
                    options.inScaled = false;
                } else {
                    int i9 = (i7 == 90 || i7 == 270) ? i3 : i8;
                    if (i7 != 90 && i7 != 270) {
                        i8 = i3;
                    }
                    Size size = options2.size;
                    Scale scale = options2.scale;
                    Extras.Key key = ImageRequestsKt.maxBitmapSizeKey;
                    long m1455computeDstSizesEdh43o = DecodeUtils.m1455computeDstSizesEdh43o(i9, i8, size, scale, (Size) ExtrasKt.getExtra(options2, key));
                    int i10 = (int) (m1455computeDstSizesEdh43o >> 32);
                    i = i7;
                    int i11 = (int) (m1455computeDstSizesEdh43o & BodyPartID.bodyIdMax);
                    int highestOneBit = Integer.highestOneBit(i9 / i10);
                    int highestOneBit2 = Integer.highestOneBit(i8 / i11);
                    int ordinal = scale.ordinal();
                    if (ordinal != 0) {
                        i4 = 1;
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        min = Math.max(highestOneBit, highestOneBit2);
                    } else {
                        i4 = 1;
                        min = Math.min(highestOneBit, highestOneBit2);
                    }
                    if (min < i4) {
                        min = 1;
                    }
                    options.inSampleSize = min;
                    double d = i9;
                    z = z4;
                    double d2 = min;
                    double d3 = d / d2;
                    double d4 = i8 / d2;
                    Size size2 = (Size) ExtrasKt.getExtra(options2, key);
                    double d5 = i10 / d3;
                    double d6 = i11 / d4;
                    int ordinal2 = scale.ordinal();
                    if (ordinal2 == 0) {
                        max = Math.max(d5, d6);
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        max = Math.min(d5, d6);
                    }
                    if (size2.width instanceof Dimension.Pixels) {
                        double d7 = ((Dimension.Pixels) r7).px / d3;
                        if (max > d7) {
                            max = d7;
                        }
                    }
                    if (size2.height instanceof Dimension.Pixels) {
                        double d8 = ((Dimension.Pixels) r0).px / d4;
                        if (max > d8) {
                            max = d8;
                        }
                    }
                    if (options2.precision == Precision.INEXACT && max > 1.0d) {
                        max = 1.0d;
                    }
                    boolean z5 = max == 1.0d;
                    options.inScaled = !z5;
                    if (!z5) {
                        if (max > 1.0d) {
                            options.inDensity = MathKt__MathJVMKt.roundToInt(2.147483647E9d / max);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = MathKt__MathJVMKt.roundToInt(2.147483647E9d * max);
                        }
                    }
                    z2 = false;
                }
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new RealBufferedSource$inputStream$1(realBufferedSource), null, options);
                    realBufferedSource.close();
                    Exception exc3 = (Exception) anonymousClass1.this$0;
                    if (exc3 != null) {
                        throw exc3;
                    }
                    if (decodeStream == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    decodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                    if (z || i > 0) {
                        Matrix matrix = new Matrix();
                        float width = decodeStream.getWidth() / 2.0f;
                        float height = decodeStream.getHeight() / 2.0f;
                        if (z) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i > 0) {
                            i2 = i;
                            matrix.postRotate(i2, width, height);
                        } else {
                            i2 = i;
                        }
                        RectF rectF2 = new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, decodeStream.getWidth(), decodeStream.getHeight());
                        matrix.mapRect(rectF2);
                        float f3 = rectF2.left;
                        if (f3 != RecyclerView.DECELERATION_RATE || rectF2.top != RecyclerView.DECELERATION_RATE) {
                            matrix.postTranslate(-f3, -rectF2.top);
                        }
                        if (i2 == 90 || i2 == 270) {
                            int height2 = decodeStream.getHeight();
                            int width2 = decodeStream.getWidth();
                            Bitmap.Config config4 = decodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int width3 = decodeStream.getWidth();
                            int height3 = decodeStream.getHeight();
                            Bitmap.Config config5 = decodeStream.getConfig();
                            if (config5 == null) {
                                config5 = Bitmap.Config.ARGB_8888;
                            }
                            createBitmap = Bitmap.createBitmap(width3, height3, config5);
                        }
                        new Canvas(createBitmap).drawBitmap(decodeStream, matrix, ExifUtils.paint);
                        decodeStream.recycle();
                        decodeStream = createBitmap;
                    }
                    return new DecodeResult(Image_androidKt.asImage(new BitmapDrawable(context.getResources(), decodeStream)), (options.inSampleSize > 1 || options.inScaled) ? true : z2);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Utf8.closeFinally(realBufferedSource, th2);
                        throw th3;
                    }
                }
            case 2:
                return (RealDiskCache) ((RealImageLoader) obj).options.diskCacheLazy.getValue();
            case 3:
                SvgDecoder svgDecoder = (SvgDecoder) obj;
                ImageSource imageSource = svgDecoder.source;
                boolean z6 = svgDecoder.renderToBitmap;
                Options options3 = svgDecoder.options;
                BufferedSource source = imageSource.source();
                try {
                    svgDecoder.parser.getClass();
                    androidSvg = ParseSvg_androidKt.parseSvg(source);
                    try {
                        source.close();
                        th = null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        source.close();
                    } catch (Throwable th6) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th5, th6);
                    }
                    th = th5;
                    androidSvg = null;
                }
                if (th != null) {
                    throw th;
                }
                SVG svg = (SVG) androidSvg.svg;
                SVG svg2 = (SVG) androidSvg.svg;
                SVG.Svg svg3 = (SVG.Svg) svg.rootElement;
                if (svg3 != null) {
                    SVG.Box box = svg3.viewBox;
                    if (box == null) {
                        rectF = null;
                        j = BodyPartID.bodyIdMax;
                    } else {
                        float f4 = box.minX;
                        j = BodyPartID.bodyIdMax;
                        rectF = new RectF(f4, box.minY, box.maxX(), box.maxY());
                    }
                    Svg$ViewBox svg$ViewBox = rectF != null ? new Svg$ViewBox(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (svgDecoder.useViewBoundsAsIntrinsicSize && svg$ViewBox != null) {
                        f = svg$ViewBox.right - svg$ViewBox.left;
                        f2 = svg$ViewBox.bottom - svg$ViewBox.top;
                    } else if (((SVG.Svg) svg2.rootElement) != null) {
                        f = svg2.getDocumentDimensions().width;
                        if (((SVG.Svg) svg2.rootElement) != null) {
                            f2 = svg2.getDocumentDimensions().height;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                        }
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    }
                    Size size3 = options3.size;
                    Scale scale2 = options3.scale;
                    if (Intrinsics.areEqual(size3, Size.ORIGINAL)) {
                        float floatValue = ((Number) svgDecoder.density.invoke(options3.context)).floatValue();
                        if (f > RecyclerView.DECELERATION_RATE) {
                            f *= floatValue;
                        }
                        if (f2 > RecyclerView.DECELERATION_RATE) {
                            f2 *= floatValue;
                        }
                    }
                    int roundToInt = f > RecyclerView.DECELERATION_RATE ? MathKt__MathJVMKt.roundToInt(f) : 512;
                    int roundToInt2 = f2 > RecyclerView.DECELERATION_RATE ? MathKt__MathJVMKt.roundToInt(f2) : 512;
                    Size size4 = options3.size;
                    Extras.Key key2 = ImageRequestsKt.maxBitmapSizeKey;
                    long m1455computeDstSizesEdh43o2 = DecodeUtils.m1455computeDstSizesEdh43o(roundToInt, roundToInt2, size4, scale2, (Size) ExtrasKt.getExtra(options3, key2));
                    int i12 = (int) (m1455computeDstSizesEdh43o2 >> 32);
                    int i13 = (int) (m1455computeDstSizesEdh43o2 & j);
                    if (f > RecyclerView.DECELERATION_RATE && f2 > RecyclerView.DECELERATION_RATE) {
                        Size size5 = (Size) ExtrasKt.getExtra(options3, key2);
                        float f5 = i12 / f;
                        float f6 = i13 / f2;
                        int ordinal3 = scale2.ordinal();
                        if (ordinal3 == 0) {
                            max2 = Math.max(f5, f6);
                        } else if (ordinal3 == 1) {
                            max2 = Math.min(f5, f6);
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                        if (size5.width instanceof Dimension.Pixels) {
                            float f7 = ((Dimension.Pixels) r5).px / f;
                            if (max2 > f7) {
                                max2 = f7;
                            }
                        }
                        if (size5.height instanceof Dimension.Pixels) {
                            float f8 = ((Dimension.Pixels) r2).px / f2;
                            if (max2 > f8) {
                                max2 = f8;
                            }
                        }
                        i12 = (int) (max2 * f);
                        i13 = (int) (max2 * f2);
                        if (svg$ViewBox == null) {
                            float f9 = f - RecyclerView.DECELERATION_RATE;
                            float f10 = f2 - RecyclerView.DECELERATION_RATE;
                            SVG.Svg svg4 = (SVG.Svg) svg2.rootElement;
                            if (svg4 != null) {
                                svg4.viewBox = new SVG.Box(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f9, f10);
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                            }
                        }
                    }
                    SVG.Svg svg5 = (SVG.Svg) svg2.rootElement;
                    if (svg5 != null) {
                        svg5.width = SVGParser.parseLength("100%");
                        SVG.Svg svg6 = (SVG.Svg) svg2.rootElement;
                        if (svg6 != null) {
                            svg6.height = SVGParser.parseLength("100%");
                            String str2 = (String) ExtrasKt.getExtra(options3, coil3.svg.ImageRequests_androidKt.cssKey);
                            if (str2 != null) {
                                AndroidSvg androidSvg2 = new AndroidSvg(24);
                                CSSParser cSSParser = new CSSParser(2);
                                CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(str2);
                                cSSTextScanner.skipWhitespace();
                                androidSvg2.svg = cSSParser.parseRuleset(cSSTextScanner);
                                androidSvg.renderOptions = androidSvg2;
                            }
                            Image svgImage = new SvgImage(svg2, (AndroidSvg) androidSvg.renderOptions, i12, i13);
                            if (z6) {
                                svgImage = new BitmapImage(Image_androidKt.toBitmap(svgImage, svgImage.getWidth(), svgImage.getHeight()));
                            }
                            return new DecodeResult(svgImage, z6);
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                    }
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3("SVG document is empty");
                }
                return null;
            case 4:
                return CollectionsKt__CollectionsJVMKt.listOf((Decoder.Factory) obj);
            case 5:
                gender$lambda$0 = BrazeUser.setGender$lambda$0((Gender) obj);
                return gender$lambda$0;
            case 6:
                return com.braze.support.c.a((Date) obj);
            case 7:
                appendBridgeJavascript$lambda$0 = BrazeWebViewClient.appendBridgeJavascript$lambda$0((BrazeWebViewClient) obj);
                return appendBridgeJavascript$lambda$0;
            case 8:
                actionViewIntent$lambda$0 = UriAction.getActionViewIntent$lambda$0((ResolveInfo) obj);
                return actionViewIntent$lambda$0;
            case 9:
                contentCardsUpdate$lambda$0 = ContentCardsFragment.contentCardsUpdate$lambda$0((ContentCardsUpdatedEvent) obj);
                return contentCardsUpdate$lambda$0;
            case 10:
                closeInAppMessageView$lambda$1 = DefaultInAppMessageViewWrapper.closeInAppMessageView$lambda$1((DefaultInAppMessageViewWrapper) obj);
                return closeInAppMessageView$lambda$1;
            case 11:
                SpanContext spanContext = (SpanContext) obj;
                return String.format(Locale.US, "Failed to convert span context with trace id = {%1s} and span id = {%2s}", spanContext.getSpanId(), spanContext.getTraceId());
            case 12:
                ((MapApplier) obj).attachClickListeners$maps_compose_release();
                return Unit.INSTANCE;
            case 13:
                RectF rectF3 = new RectF();
                Path path = ((Stamp) obj).path;
                if (path != null) {
                    path.computeBounds(rectF3, true);
                    return rectF3;
                }
                Intrinsics.throwUninitializedPropertyAccessException("path");
                throw null;
            case 14:
                return ((RealAccountRatePlanManager) obj).p2pSettingsManager.select();
            case 15:
                return ((BusinessInfoSetting) obj).p2pSettingsManager.select();
            case 16:
                List list = ((Activities) obj).recentActivities;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ActivityData) {
                            arrayList.add(obj2);
                        }
                    }
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    if (mapCapacity < 16) {
                        mapCapacity = 16;
                    }
                    linkedHashMap = new LinkedHashMap(mapCapacity);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap.put(((ActivityData) next).getToken(), next);
                    }
                }
                return linkedHashMap;
            case 17:
                Long l = ((FormattedPaymentHistoryActivityData) obj).uiPayment.display_date;
                l.getClass();
                return Instant.ofEpochMilli(l.longValue());
            case 18:
                Long l2 = ((FormattingFailedPaymentHistoryActivityData) obj).uiPayment.display_date;
                l2.getClass();
                return Instant.ofEpochMilli(l2.longValue());
            case 19:
                Paycheck.SettlementDate settlementDate = ((PaycheckActivityData) obj).paycheck.settlement_date;
                settlementDate.getClass();
                Long l3 = settlementDate.date;
                l3.getClass();
                return Instant.ofEpochMilli(l3.longValue());
            case 20:
                Long l4 = ((PaymentHistoryActivityData) obj).payment.display_date;
                l4.getClass();
                return Instant.ofEpochMilli(l4.longValue());
            case 21:
                Long l5 = ((OfflineFormattedActivityItem) obj).uiPayment.display_date;
                l5.getClass();
                return Instant.ofEpochMilli(l5.longValue());
            case 22:
                return new ActivityFeedEntry.InlineAppMessageV2((InlineAppMessageV2ViewModel.Ready) obj);
            case 23:
                return new ActivityFeedEntry.InlineAppMessage((InlineAppMessageViewModel.Ready) obj);
            case 24:
                return new ActivityFeedEntry.CardAppMessage((CardAppMessageViewModel.Ready) obj);
            case 25:
                Function1 function1 = ((DefaultActivityItemEventHandler) obj).feedCallback;
                if (function1 != null) {
                    function1.invoke(ActivityFeedCallbackEvent$RefreshFeed.INSTANCE);
                }
                return Unit.INSTANCE;
            case 26:
                return Updater.mutableStateOf$default(Boolean.valueOf(((PaymentHistoryActivityItemPresenter) obj).activityItem.isBadged()));
            case 27:
                String str3 = ((AfterpayAppletScreen$AfterpaySearchScreen) ((LocalHomePresenter) obj).neighborhoodsTabContentEnabled$delegate).searchText;
                if (str3 == null) {
                    str3 = "";
                }
                return Updater.mutableStateOf$default(new InputFieldText.Simple(str3));
            case 28:
                return ((AmountSelectorOption) obj).getLabel();
            default:
                ((CappedKeypadListener) obj).onLongBackspace();
                return Unit.INSTANCE;
        }
    }
}
