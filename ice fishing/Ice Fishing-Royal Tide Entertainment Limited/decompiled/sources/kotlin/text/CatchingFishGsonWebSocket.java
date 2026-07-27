package kotlin.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class CatchingFishGsonWebSocket {
    public Object CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGsonWebSocket(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new kotlin.text.CatchingFishKtor(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r1 = r0.CatchingFishParcelableFAB;
        r0 = r0.CatchingFishSnackbar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        return new kotlin.text.CatchingFishGsonWebSocket(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.CatchingFishParcelableFAB, r0.CatchingFishSnackbar);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        r1 = r0.CatchingFishParcelableFAB;
        r0 = r0.CatchingFishSnackbar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new kotlin.text.CatchingFishKtor(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new kotlin.text.CatchingFishKtor(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CatchingFishGsonWebSocket CatchingFishCoroutine(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        int i3;
        float f3;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList CatchingFishSnackbar = CatchingFishDaggerHandler.CatchingFishSnackbar(resources, xml, asAttributeSet, theme);
                return new CatchingFishGsonWebSocket((Shader) null, CatchingFishSnackbar, CatchingFishSnackbar.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray CatchingFish = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishToolbarKtor.CatchingFishDaggerWebsocket);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? CatchingFish.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? CatchingFish.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? CatchingFish.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? CatchingFish.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? CatchingFish.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? CatchingFish.getFloat(4, 0.0f) : 0.0f;
        int i4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? CatchingFish.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? CatchingFish.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? CatchingFish.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f4;
            i2 = CatchingFish.getColor(1, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f5;
            i3 = CatchingFish.getInt(6, 0);
        } else {
            f2 = f5;
            i3 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? CatchingFish.getFloat(5, 0.0f) : 0.0f;
        CatchingFish.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f12 = f6;
            if (next2 == 1) {
                f3 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray CatchingFish2 = CatchingFishViewMVIMVVM.CatchingFish(resources, theme, asAttributeSet, CatchingFishToolbarKtor.CatchingFishWorkManager);
                boolean hasValue = CatchingFish2.hasValue(0);
                boolean hasValue2 = CatchingFish2.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = CatchingFish2.getColor(0, 0);
                float f13 = CatchingFish2.getFloat(1, 0.0f);
                CatchingFish2.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f12;
            f7 = f3;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public static CatchingFishGsonWebSocket CatchingFishViewModelScope(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        CatchingFishServicePicasso catchingFishServicePicasso = CatchingFishServicePicasso.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                catchingFishServicePicasso = CatchingFishServicePicasso.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
            }
            return new CatchingFishGsonWebSocket(catchingFishServicePicasso, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public boolean CatchingFishDaggerWebsocket() {
        ColorStateList colorStateList;
        return ((Shader) this.CatchingFishCoroutine) == null && (colorStateList = (ColorStateList) this.CatchingFishReduxKtor) != null && colorStateList.isStateful();
    }

    public void CatchingFishParcelableFAB() {
        CatchingFishFABDaggerHilt catchingFishFABDaggerHilt;
        ImageView imageView = (ImageView) this.CatchingFishCoroutine;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            CatchingFishRealmPicasso.CatchingFishParcelableFAB(drawable);
        }
        if (drawable == null || (catchingFishFABDaggerHilt = (CatchingFishFABDaggerHilt) this.CatchingFishReduxKtor) == null) {
            return;
        }
        CatchingFishPicassoMVPJUnit.CatchingFishDaggerWebsocket(drawable, catchingFishFABDaggerHilt, imageView.getDrawableState());
    }

    public void CatchingFishReduxKtor(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        long[] jArr = (long[]) this.CatchingFishCoroutine;
        int i7 = this.CatchingFishSnackbar;
        int i8 = i7 + 3;
        this.CatchingFishSnackbar = i8;
        int length = jArr.length;
        if (length <= i8) {
            int max = Math.max(length * 2, i8);
            long[] copyOf = Arrays.copyOf(jArr, max);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            this.CatchingFishCoroutine = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.CatchingFishReduxKtor, max);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            this.CatchingFishReduxKtor = copyOf2;
        }
        long[] jArr2 = (long[]) this.CatchingFishCoroutine;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | (1 << 61) | (0 << 52) | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public CatchingFishExoPlayerMVVM CatchingFishSnackbar() {
        if ("".isEmpty()) {
            return new CatchingFishExoPlayerMVVM((String) this.CatchingFishCoroutine, ((Long) this.CatchingFishReduxKtor).longValue(), this.CatchingFishSnackbar);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public void CatchingFishViewModelFAB(int i, CatchingFishCameraXGlide catchingFishCameraXGlide) {
        int i2 = i & 67108863;
        long[] jArr = (long[]) this.CatchingFishCoroutine;
        int i3 = this.CatchingFishSnackbar;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                catchingFishCameraXGlide.CatchingFishCoroutine(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public void CatchingFishWorkManager(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.CatchingFishCoroutine;
        Context context = imageView.getContext();
        int[] iArr = CatchingFishWidgetGlide.CatchingFishWorkManager;
        CatchingFishAsyncTaskDagger CatchingFishRecyclerView = CatchingFishAsyncTaskDagger.CatchingFishRecyclerView(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket;
        CatchingFishFABCameraX.CatchingFishEspressoTesting(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) CatchingFishRecyclerView.CatchingFishDaggerWebsocket, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = CatchingFishLayoutRoomFAB.CatchingFishCustomView(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                CatchingFishRealmPicasso.CatchingFishParcelableFAB(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(CatchingFishRecyclerView.CatchingFishFragmentFactory(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(CatchingFishRealmPicasso.CatchingFishSnackbar(typedArray.getInt(3, -1), null));
            }
            CatchingFishRecyclerView.CatchingFishAnimation();
        } catch (Throwable th) {
            CatchingFishRecyclerView.CatchingFishAnimation();
            throw th;
        }
    }

    public String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = (String) this.CatchingFishReduxKtor;
                StringBuilder sb = new StringBuilder();
                sb.append(((CatchingFishServicePicasso) this.CatchingFishCoroutine) == CatchingFishServicePicasso.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.CatchingFishSnackbar);
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public CatchingFishGsonWebSocket(CatchingFishServicePicasso catchingFishServicePicasso, int i, String str) {
        this.CatchingFishParcelableFAB = 6;
        this.CatchingFishCoroutine = catchingFishServicePicasso;
        this.CatchingFishSnackbar = i;
        this.CatchingFishReduxKtor = str;
    }

    public CatchingFishGsonWebSocket(ImageView imageView) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishSnackbar = 0;
        this.CatchingFishCoroutine = imageView;
    }

    public CatchingFishGsonWebSocket(ArrayList arrayList, CatchingFishGlideFAB catchingFishGlideFAB) {
        MotionEvent motionEvent;
        this.CatchingFishParcelableFAB = 3;
        CatchingFishViewModelIntent catchingFishViewModelIntent = (CatchingFishViewModelIntent) catchingFishGlideFAB.CatchingFishCoroutine;
        this.CatchingFishCoroutine = arrayList;
        this.CatchingFishReduxKtor = catchingFishGlideFAB;
        if (Build.VERSION.SDK_INT >= 29 && (motionEvent = (MotionEvent) catchingFishViewModelIntent.CatchingFishWorkManager) != null) {
            motionEvent.getClassification();
        }
        MotionEvent motionEvent2 = (MotionEvent) catchingFishViewModelIntent.CatchingFishWorkManager;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = (MotionEvent) catchingFishViewModelIntent.CatchingFishWorkManager;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = (MotionEvent) catchingFishViewModelIntent.CatchingFishWorkManager;
        int i = 3;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                                break;
                            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                                break;
                            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                                break;
                            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    }
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                CatchingFishFABAdMob catchingFishFABAdMob = (CatchingFishFABAdMob) arrayList.get(i2);
                if (CatchingFishOkHttpFAB.CatchingFishViewModelScope(catchingFishFABAdMob)) {
                    i = 2;
                } else if (CatchingFishOkHttpFAB.CatchingFishWorkManager(catchingFishFABAdMob)) {
                    i = 1;
                }
            }
        }
        this.CatchingFishSnackbar = i;
    }

    public CatchingFishGsonWebSocket(Shader shader, ColorStateList colorStateList, int i) {
        this.CatchingFishParcelableFAB = 2;
        this.CatchingFishCoroutine = shader;
        this.CatchingFishReduxKtor = colorStateList;
        this.CatchingFishSnackbar = i;
    }
}
