package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.g$$ExternalSyntheticLambda1;
import bo.app.j0;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.t7$$ExternalSyntheticLambda4;
import bo.app.wg;
import bo.app.x7$$ExternalSyntheticLambda1;
import bo.app.xf$$ExternalSyntheticLambda0;
import bo.app.yf$$ExternalSyntheticLambda3;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010$\u001a\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%\u001a'\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010)\u001a3\u0010+\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a+\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/\u001a#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101\"\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "(Landroid/content/Context;)I", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "(II)I", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "resizeImageViewToBitmapDimensions", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "resizeToBitmapDimensions", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V", "getImageLoaderCacheSize", "()I", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "(Ljava/io/InputStream;)Landroid/graphics/BitmapFactory$Options;", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;II)I", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lbo/app/j0;", "getBitmap", "(Landroid/content/Context;Landroid/net/Uri;Lcom/braze/enums/BrazeViewBounds;)Lbo/app/j0;", "getLocalBitmap", "(Landroid/net/Uri;II)Landroid/graphics/Bitmap;", "getRemoteBitmap", "(Landroid/net/Uri;II)Lbo/app/j0;", "imageMetadata", "decodeSampledBitmapFromStream", "(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;II)Landroid/graphics/Bitmap;", "Lkotlin/Pair;", "getDestinationHeightAndWidthPixels", "(Landroid/content/Context;Lcom/braze/enums/BrazeViewBounds;)Lkotlin/Pair;", "getDisplayHeightAndWidthPixels", "(Landroid/content/Context;)Lkotlin/Pair;", "", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BrazeImageUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4 = i;
        options.getClass();
        if (i2 == 0 || i4 == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(26), 14, (Object) null);
            return 1;
        }
        long j = options.outHeight;
        long j2 = options.outWidth;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x7$$ExternalSyntheticLambda1(options, i4, i2, 2), 14, (Object) null);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        long j3 = i2;
        if (j > j3 || j2 > i4) {
            long j4 = j / 2;
            long j5 = j2 / 2;
            while (true) {
                int i5 = ref$IntRef.element;
                long j6 = i5;
                if (j4 / j6 < j3 && j5 / j6 < i4) {
                    i3 = i5;
                    if ((j2 * j) / (i5 * i5) <= 4194304) {
                        break;
                    }
                } else {
                    i3 = i5;
                }
                ref$IntRef.element = i3 * 2;
                i4 = i;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeImageUtils$$ExternalSyntheticLambda22(ref$IntRef, j2, j, 0), 14, (Object) null);
        return ref$IntRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$0() {
        return "Not sampling on 0 destination width or height";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$1(BitmapFactory.Options options, int i, int i2) {
        return Recorder$$ExternalSyntheticOutline1.m(i, i2, " height ", ")", Recorder$$ExternalSyntheticOutline2.m107m(options.outWidth, options.outHeight, "Calculating sample size for source image bounds: (width ", " height ", ") and destination image bounds: (width "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String calculateInSampleSize$lambda$2(Ref$IntRef ref$IntRef, long j, long j2) {
        int i = ref$IntRef.element;
        long j3 = i;
        return "Using image sample size of " + i + ". Image will be scaled to width: " + (j / j3) + " and height: " + (j2 / j3);
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final j0 getBitmap(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        uri.getClass();
        brazeViewBounds.getClass();
        Pair<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, brazeViewBounds);
        int intValue = ((Number) destinationHeightAndWidthPixels.first).intValue();
        int intValue2 = ((Number) destinationHeightAndWidthPixels.second).intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return new j0(getLocalBitmap(uri, intValue2, intValue), null);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(uri, 3), 12, (Object) null);
        return new j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmap$lambda$0(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Uri with unknown scheme received. Not getting image. Uri: ");
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        inputStream.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        context.getClass();
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final Pair<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        Pair<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int intValue = ((Number) displayHeightAndWidthPixels.first).intValue();
        int intValue2 = ((Number) displayHeightAndWidthPixels.second).intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(intValue2, intValue, 2), 12, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDestinationHeightAndWidthPixels$lambda$0(int i, int i2) {
        return Recorder$$ExternalSyntheticOutline2.m("Display width: ", i, i2, " and height ");
    }

    public static final Pair<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Pair<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        context.getClass();
        return ((Number) getDisplayHeightAndWidthPixels(context).second).intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap getLocalBitmap(Uri uri, int i, int i2) {
        Exception exc;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        Bitmap decodeFile;
        Bitmap bitmap;
        uri.getClass();
        int i3 = 27;
        int i4 = 2;
        FileInputStream fileInputStream3 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                File file = new File(path);
                if (!file.exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(uri, 4), 14, (Object) null);
                    return null;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String str = TAG;
                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda3(file, i4), 12, (Object) null);
                if (i > 0 && i2 > 0) {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(i, i2, 3), 14, (Object) null);
                        BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(fileInputStream2);
                        fileInputStream2.close();
                        FileInputStream fileInputStream4 = new FileInputStream(file);
                        try {
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream4;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream4;
                        }
                        try {
                            try {
                                if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(23), 14, (Object) null);
                                    brazeLogger = brazeLogger;
                                    str = str;
                                    decodeFile = decodeSampledBitmapFromStream(fileInputStream4, bitmapMetadataFromStream, i, i2);
                                    fileInputStream = fileInputStream4;
                                    bitmap = decodeFile;
                                    fileInputStream.close();
                                    return bitmap;
                                }
                                fileInputStream.close();
                                return bitmap;
                            } catch (IOException e2) {
                                BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                                return bitmap;
                            }
                            BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(14, uri, bitmapMetadataFromStream), 12, (Object) null);
                            decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                            bitmap = decodeFile;
                        } catch (Exception e3) {
                            e = e3;
                            exc = e;
                            try {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new g$$ExternalSyntheticLambda1(i4, exc), 8, (Object) null);
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e4) {
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                                    }
                                }
                                return null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileInputStream3 = fileInputStream;
                                th = th;
                                fileInputStream2 = fileInputStream3;
                                if (fileInputStream2 == null) {
                                    throw th;
                                }
                                try {
                                    fileInputStream2.close();
                                    throw th;
                                } catch (IOException e5) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream2 = fileInputStream;
                            th = th;
                            if (fileInputStream2 == null) {
                            }
                        }
                        fileInputStream = fileInputStream4;
                    } catch (Exception e6) {
                        exc = e6;
                        fileInputStream = fileInputStream2;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(24), 14, (Object) null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new UriAction$$ExternalSyntheticLambda4(uri, i4), 14, (Object) null);
            return null;
        } catch (Exception e7) {
            exc = e7;
            fileInputStream = null;
        } catch (Throwable th6) {
            th = th6;
            th = th;
            fileInputStream2 = fileInputStream3;
            if (fileInputStream2 == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$0(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Local bitmap path is null. URI: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$1(Uri uri) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(uri, "Local bitmap file does not exist. URI: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$2(File file) {
        return Recorder$$ExternalSyntheticOutline2.m("Retrieving image from local path: ", file.getAbsolutePath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$3() {
        return "Destination bounds unset. Loading entire bitmap into memory.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$4(int i, int i2) {
        return Recorder$$ExternalSyntheticOutline2.m(i, i2, "Sampling bitmap with destination image bounds: (width ", " height ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$5(Uri uri, BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        StringBuilder sb = new StringBuilder("The bitmap metadata with image uri ");
        sb.append(uri);
        sb.append(" had bounds: (height ");
        sb.append(i);
        sb.append(" width ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "). Returning a bitmap with no sampling.", sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$6() {
        return "Decoding sampled bitmap";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$7(Exception exc) {
        return Recorder$$ExternalSyntheticOutline2.m("Exception occurred when attempting to retrieve local bitmap. ", exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalBitmap$lambda$8() {
        return "IOException during closing of bitmap metadata image stream.";
    }

    public static final int getPixelsFromDensityAndDp(int i, int i2) {
        return Math.abs((i * i2) / EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final j0 getRemoteBitmap(Uri uri, int i, int i2) {
        Throwable th;
        InputStream inputStream;
        Exception exc;
        InputStream inputStream2;
        j0 j0Var;
        TrafficStats.setThreadStatsTag(1337);
        String uri2 = uri.toString();
        uri2.getClass();
        if (Braze.INSTANCE.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(uri2, 9), 12, (Object) null);
            return new j0();
        }
        int i3 = 25;
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(uri2);
            wg wgVar = wg.a;
            HttpURLConnection a = wgVar.a(url);
            try {
                int responseCode = a.getResponseCode();
                if (responseCode != 200) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda8(responseCode, url, 5), 12, (Object) null);
                    j0 j0Var2 = new j0();
                    a.disconnect();
                    return j0Var2;
                }
                InputStream inputStream3 = a.getInputStream();
                if (i == 0 || i2 == 0) {
                    j0Var = new j0(BitmapFactory.decodeStream(inputStream3), a.getHeaderFields());
                } else {
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String str = TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(i2, i, 1), 14, (Object) null);
                    inputStream3.getClass();
                    BitmapFactory.Options bitmapMetadataFromStream = getBitmapMetadataFromStream(inputStream3);
                    a.disconnect();
                    HttpURLConnection a2 = wgVar.a(url);
                    try {
                        inputStream3 = a2.getInputStream();
                        if (bitmapMetadataFromStream.outHeight != 0 && bitmapMetadataFromStream.outWidth != 0) {
                            j0Var = new j0(decodeSampledBitmapFromStream(inputStream3, bitmapMetadataFromStream, i, i2), a2.getHeaderFields());
                            a = a2;
                        }
                        BrazeLogger.brazelog$default(brazeLogger, str, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(15, url, bitmapMetadataFromStream), 12, (Object) null);
                        j0Var = new j0(BitmapFactory.decodeStream(inputStream3), a2.getHeaderFields());
                        a = a2;
                    } catch (Exception e) {
                        exc = e;
                        inputStream2 = inputStream3;
                        httpURLConnection = a2;
                        try {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new t7$$ExternalSyntheticLambda4(16, uri2, exc), 8, (Object) null);
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException e2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                                }
                            }
                            return new j0();
                        } catch (Throwable th2) {
                            InputStream inputStream4 = inputStream2;
                            th = th2;
                            inputStream = inputStream4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (inputStream != null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (IOException e3) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream3;
                        httpURLConnection = a2;
                        if (httpURLConnection != null) {
                        }
                        if (inputStream != null) {
                        }
                    }
                }
                a.disconnect();
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                        return j0Var;
                    } catch (IOException e4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(i3), 8, (Object) null);
                    }
                }
                return j0Var;
            } catch (Exception e5) {
                exc = e5;
                inputStream2 = null;
                httpURLConnection = a;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                httpURLConnection = a;
            }
        } catch (Exception e6) {
            exc = e6;
            inputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("SDK is in offline mode, not downloading remote bitmap with uri: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$1(int i, URL url) {
        return "HTTP response code was " + i + ". Bitmap with url " + url + " could not be downloaded.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$2(int i, int i2) {
        return Recorder$$ExternalSyntheticOutline2.m(i, i2, "Sampling bitmap with destination image bounds: (height ", " width ", ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$3(URL url, BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        StringBuilder sb = new StringBuilder("The bitmap metadata with image url ");
        sb.append(url);
        sb.append(" had bounds: (height ");
        sb.append(i);
        sb.append(" width ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "). Returning a bitmap with no sampling.", sb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$4(String str, Exception exc) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Exception in image bitmap download for Uri: ", str, " ", exc.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getRemoteBitmap$lambda$5() {
        return "IOException during closing of bitmap metadata download stream.";
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        imageView.getClass();
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(final ImageView imageView, Bitmap bitmap) {
        imageView.getClass();
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(22), 12, (Object) null);
            return;
        }
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            final int i = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String resizeToBitmapDimensions$lambda$2;
                    String resizeToBitmapDimensions$lambda$1;
                    int i2 = i;
                    ImageView imageView2 = imageView;
                    switch (i2) {
                        case 0:
                            resizeToBitmapDimensions$lambda$2 = BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView2);
                            return resizeToBitmapDimensions$lambda$2;
                        default:
                            resizeToBitmapDimensions$lambda$1 = BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView2);
                            return resizeToBitmapDimensions$lambda$1;
                    }
                }
            }, 12, (Object) null);
        } else {
            if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
                final int i2 = 0;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String resizeToBitmapDimensions$lambda$2;
                        String resizeToBitmapDimensions$lambda$1;
                        int i22 = i2;
                        ImageView imageView2 = imageView;
                        switch (i22) {
                            case 0:
                                resizeToBitmapDimensions$lambda$2 = BrazeImageUtils.resizeToBitmapDimensions$lambda$2(imageView2);
                                return resizeToBitmapDimensions$lambda$2;
                            default:
                                resizeToBitmapDimensions$lambda$1 = BrazeImageUtils.resizeToBitmapDimensions$lambda$1(imageView2);
                                return resizeToBitmapDimensions$lambda$1;
                        }
                    }
                }, 12, (Object) null);
                return;
            }
            float width = bitmap.getWidth() / bitmap.getHeight();
            imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new BrazeImageUtils$$ExternalSyntheticLambda1(width, imageView), 12, (Object) null);
            imageView.setLayoutParams(imageView.getLayoutParams());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$0() {
        return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$1(ImageView imageView) {
        return "Bitmap dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$2(ImageView imageView) {
        return "ImageView dimensions cannot be 0. Not resizing ImageView " + imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resizeToBitmapDimensions$lambda$3(float f, ImageView imageView) {
        int width = imageView.getWidth();
        int i = imageView.getLayoutParams().width;
        int i2 = imageView.getLayoutParams().height;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StringBuilder sb = new StringBuilder("Resizing ImageView to aspect ratio ");
        sb.append(f);
        sb.append(" based on width: ");
        sb.append(width);
        sb.append(" trueWidth: ");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, " height: ", " layoutParams: ", sb);
        sb.append(layoutParams);
        sb.append(" ");
        sb.append(imageView);
        return sb.toString();
    }
}
