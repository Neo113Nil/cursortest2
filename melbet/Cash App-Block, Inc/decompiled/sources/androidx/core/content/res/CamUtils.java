package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import androidx.camera.video.Recorder;
import androidx.core.R$styleable;
import androidx.core.graphics.ColorUtils;
import androidx.core.provider.FontRequest;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public abstract class CamUtils {
    public static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    public static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX WARN: Code restructure failed: missing block: B:101:0x018e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r29.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Shader createFromXmlInner(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        String name = xmlResourceParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray obtainAttributes = DimensionKt.obtainAttributes(resources, theme, attributeSet, R$styleable.GradientColor);
        float f5 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f6 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f7 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f8 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f9 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, RecyclerView.DECELERATION_RATE) : 0.0f;
        float f10 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, RecyclerView.DECELERATION_RATE) : 0.0f;
        int i3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f5;
            i = obtainAttributes.getColor(1, 0);
        } else {
            f = f5;
            i = 0;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f6;
            i2 = obtainAttributes.getInt(6, 0);
        } else {
            f2 = f6;
            i2 = 0;
        }
        float f11 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, RecyclerView.DECELERATION_RATE) : RecyclerView.DECELERATION_RATE;
        obtainAttributes.recycle();
        int depth = xmlResourceParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlResourceParser.next();
            f3 = f7;
            if (next == 1) {
                f4 = f8;
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            f4 = f8;
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray obtainAttributes2 = DimensionKt.obtainAttributes(resources, theme, attributeSet, R$styleable.GradientColorItem);
                boolean hasValue = obtainAttributes2.hasValue(0);
                boolean hasValue2 = obtainAttributes2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainAttributes2.getColor(0, 0);
                float f13 = obtainAttributes2.getFloat(1, RecyclerView.DECELERATION_RATE);
                obtainAttributes2.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f13));
            }
            f7 = f3;
            f8 = f4;
        }
        Recorder.AnonymousClass1 anonymousClass1 = arrayList2.size() > 0 ? new Recorder.AnonymousClass1(arrayList2, arrayList) : null;
        if (anonymousClass1 == null) {
            anonymousClass1 = z ? new Recorder.AnonymousClass1(color, color2, i) : new Recorder.AnonymousClass1(color, i);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return new LinearGradient(f, f2, f3, f4, (int[]) anonymousClass1.val$videoEncoderSession, (float[]) anonymousClass1.this$0, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            }
            return new SweepGradient(f9, f10, (int[]) anonymousClass1.val$videoEncoderSession, (float[]) anonymousClass1.this$0);
        }
        if (f12 > RecyclerView.DECELERATION_RATE) {
            return new RadialGradient(f9, f10, f12, (int[]) anonymousClass1.val$videoEncoderSession, (float[]) anonymousClass1.this$0, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static float getFloat(Resources resources, int i) {
        return resources.getFloat(i);
    }

    public static int intFromLStar(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float linearized(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.content.res.TypedArray] */
    public static FontResourcesParserCompat$FamilyResourceEntry parse(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        String str;
        ArrayList arrayList;
        int i3;
        List list;
        ?? r5;
        long j;
        Throwable th;
        TypedArray typedArray;
        boolean isTerminated;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            skip(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamily);
        int i4 = 0;
        String string2 = obtainAttributes.getString(0);
        String string3 = obtainAttributes.getString(5);
        String string4 = obtainAttributes.getString(6);
        String string5 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string6 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string2 == null || string3 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyFont);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string7 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            skip(xmlResourceParser);
                        }
                        arrayList2.add(new FontResourcesParserCompat$FontFileResourceEntry(i6, z, string7, i8, resourceId2));
                    } else {
                        skip(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new FontResourcesParserCompat$FontFamilyFilesResourceEntry((FontResourcesParserCompat$FontFileResourceEntry[]) arrayList2.toArray(new FontResourcesParserCompat$FontFileResourceEntry[0]));
        }
        List readCerts = readCerts(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyProviderFallback);
                    int i10 = integer;
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        try {
                            String string10 = obtainAttributes3.getString(i);
                            if (string8 == null) {
                                r5 = obtainAttributes3;
                                j = 1;
                                throw new XmlPullParserException("query attribute must be set in fallback element");
                            }
                            while (xmlResourceParser.next() != 3) {
                                try {
                                    skip(xmlResourceParser);
                                } catch (Throwable th2) {
                                    th = th2;
                                    typedArray = obtainAttributes3;
                                    j = 1;
                                }
                            }
                            str = string6;
                            list = readCerts;
                            r5 = obtainAttributes3;
                            arrayList = arrayList3;
                            i3 = i10;
                            i2 = integer2;
                            j = 1;
                            try {
                                FontRequest fontRequest = new FontRequest(string2, string3, string8, string9, string10, list);
                                if (r5 instanceof AutoCloseable) {
                                    ((AutoCloseable) r5).close();
                                } else if (r5 instanceof ExecutorService) {
                                    ExecutorService executorService = (ExecutorService) r5;
                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                                        executorService.shutdown();
                                        boolean z2 = false;
                                        while (!isTerminated) {
                                            try {
                                                isTerminated = executorService.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r5.recycle();
                                }
                                arrayList.add(fontRequest);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            th = th3;
                        } catch (Throwable th4) {
                            th = th4;
                            r5 = obtainAttributes3;
                            j = 1;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = obtainAttributes3;
                        j = 1;
                    }
                    th = th;
                    typedArray = r5;
                    if (typedArray == null) {
                        throw th;
                    }
                    try {
                        if (typedArray instanceof AutoCloseable) {
                            typedArray.close();
                            throw th;
                        }
                        if (!(typedArray instanceof ExecutorService)) {
                            typedArray.recycle();
                            throw th;
                        }
                        ExecutorService executorService2 = (ExecutorService) typedArray;
                        if (executorService2 == ForkJoinPool.commonPool()) {
                            throw th;
                        }
                        boolean isTerminated2 = executorService2.isTerminated();
                        if (isTerminated2) {
                            throw th;
                        }
                        executorService2.shutdown();
                        boolean z3 = false;
                        while (!isTerminated2) {
                            try {
                                isTerminated2 = executorService2.awaitTermination(j, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z3) {
                                    executorService2.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        throw th;
                    } catch (Throwable th6) {
                        th.addSuppressed(th6);
                        throw th;
                    }
                }
                i2 = integer2;
                str = string6;
                arrayList = arrayList3;
                i3 = integer;
                list = readCerts;
                skip(xmlResourceParser);
                arrayList3 = arrayList;
                readCerts = list;
                integer2 = i2;
                string6 = str;
                i = 2;
                i5 = 3;
                integer = i3;
                i4 = 0;
            }
        }
        int i11 = integer2;
        String str2 = string6;
        ArrayList arrayList4 = arrayList3;
        int i12 = integer;
        List list2 = readCerts;
        if (!arrayList4.isEmpty()) {
            return new FontResourcesParserCompat$ProviderResourceEntry(arrayList4, i12, i11, str2);
        }
        if (string4 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new FontRequest(string2, string3, string4, null, null, list2));
        if (string5 != null) {
            arrayList4.add(new FontRequest(string2, string3, string5, null, null, list2));
        }
        return new FontResourcesParserCompat$ProviderResourceEntry(arrayList4, i12, i11, str2);
    }

    public static List readCerts(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void rebase(Resources.Theme theme) {
        theme.rebase();
    }

    public static void skip(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static float yFromLStar() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }
}
