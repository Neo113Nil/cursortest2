package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.x;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class at extends x {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2Service;
    private static int getSDKInfo;
    private static final String getWarnings;
    private static int initialize;
    private final Context ThreeDS2ServiceInstance;
    private final setShadowLayer get;

    public interface ThreeDS2Service extends x.get {
        void ThreeDS2Service(String str);

        void ThreeDS2ServiceInstance(String str);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        getSDKInfo = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        b("\uda0aǽ淀䧓떽量﷏\ud920՟慌䴺ꥈ锂\uf0fe\udc97㣈撢䂜겊衜\uf451큇㰑᠏䐚", 56299 - TextUtils.getCapsMode("", 0, 0), objArr);
        getWarnings = ((String) objArr[0]).intern();
        initialize = (getSDKInfo + 7) % 128;
    }

    public at(Context context, Handler handler, setShadowLayer setshadowlayer, ThreeDS2Service threeDS2Service) {
        super(threeDS2Service, handler);
        this.ThreeDS2ServiceInstance = context;
        this.get = setshadowlayer;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        at atVar = (at) objArr[0];
        String str = (String) objArr[1];
        int i = initialize + 105;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        atVar.get().ThreeDS2ServiceInstance(str);
        if (i2 == 0) {
            throw null;
        }
        int i3 = getSDKInfo + 23;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r0[r4] = (char) r7[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        r0 = new java.lang.Object[]{r5, r5};
        r2 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r2.get(-1840119381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0157, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r23 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(76 - android.graphics.Color.alpha(0), (char) (62097 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 2102 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
        r4 = new java.lang.Object[1];
        c((byte) 0, (byte) 0, (byte) 0, r4);
        r3 = r3.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r2.put(-1840119381, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0023, code lost:
    
        r2 = r23.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0021, code lost:
    
        if (r23 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r2 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        char[] charArray;
        Throwable cause;
        byte b;
        int i2;
        int i3 = $11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        $10 = i3 % 128;
        byte b2 = 0;
        if (i3 % 2 != 0) {
            int i4 = 13 / 0;
        }
        char[] cArr = charArray;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= cArr.length) {
                break;
            }
            char c = cArr[i5];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[b2] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    b = b2;
                    i2 = 1;
                } else {
                    b = b2;
                    i2 = 1;
                    obj = ((Class) removeParam.initialize(66 - ExpandableListView.getPackedPositionGroup(0L), (char) ExpandableListView.getPackedPositionGroup(0L), 12511 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, obj);
                }
                jArr[i5] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (ThreeDS2Service ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[b] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(76 - KeyEvent.keyCodeFromString(""), (char) (62096 - TextUtils.lastIndexOf("", '0')), 2102 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                    Object[] objArr4 = new Object[i2];
                    byte b3 = b;
                    c(b3, b3, b3, objArr4);
                    obj2 = cls.getMethod((String) objArr4[b3], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                b2 = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i6 = addparam.ThreeDS2Service;
            if (i6 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i7 = $11 + 73;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                break;
            }
            cArr2[i6] = (char) jArr[i6];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(76 - TextUtils.getTrimmedLength(""), (char) (62097 - ExpandableListView.getPackedPositionType(0L)), 2102 - KeyEvent.keyCodeFromString(""));
                Object[] objArr6 = new Object[1];
                c((byte) 0, (byte) 0, (byte) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2 = b * 3;
        int i3 = 3 - (b3 * 3);
        int i4 = (b2 * 2) + 99;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2;
            i = i3;
            i3 += -i6;
            i5++;
            i++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i];
            i3 += -i6;
            i5++;
            i++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
            }
        } else {
            i3 = i4;
            i = i3;
            i5++;
            i++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
            }
        }
    }

    public static /* synthetic */ void get(at atVar, String str) {
        int i = initialize + 11;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        Object[] objArr = {atVar, str};
        int identityHashCode = System.identityHashCode(atVar);
        if (i2 == 0) {
            getWarnings(objArr, 130696223, -130696223, identityHashCode);
            throw null;
        }
        getWarnings(objArr, 130696223, -130696223, identityHashCode);
        int i3 = getSDKInfo + 75;
        initialize = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void getWarnings(at atVar, String str) {
        getSDKInfo = (initialize + 71) % 128;
        atVar.ThreeDS2ServiceInstance(str);
        int i = initialize + 17;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static void init$0() {
        $$a = new byte[]{98, 4, -35, -97};
        $$b = 65;
    }

    public static at initialize(Context context, setShadowLayer setshadowlayer, ThreeDS2Service threeDS2Service) {
        at atVar = new at(context, new Handler(Looper.getMainLooper()), setshadowlayer, threeDS2Service);
        int i = initialize + 107;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return atVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.x
    public void aB_(Uri uri) {
        getSDKInfo = (initialize + 43) % 128;
        String uri2 = uri.toString();
        Object[] objArr = new Object[1];
        b("\uda0aǽ淀䧓떽量﷏\ud920՟慌䴺ꥈ锂\uf0fe\udc97㣈撢䂜겊衜\uf451큇㰑᠏䐚", Color.green(0) + 56299, objArr);
        if (oj.getSDKVersion(uri2, ((String) objArr[0]).intern())) {
            String str = (String) oj.ThreeDS2ServiceInitializationCallback(uri.getQuery(), "");
            get(new av(this, str));
            this.get.getWarnings(this.ThreeDS2ServiceInstance, new as(this, str));
        }
        getSDKInfo = (initialize + 79) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.x, android.webkit.WebViewClient
    public /* bridge */ /* synthetic */ WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        getSDKInfo = (initialize + 59) % 128;
        WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
        int i = getSDKInfo + 29;
        initialize = i % 128;
        if (i % 2 == 0) {
            return shouldInterceptRequest;
        }
        throw null;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    private /* synthetic */ void initialize(String str) {
        get(new ay(this, str));
        int i = initialize + 95;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(String str) {
        int i = getSDKInfo + 19;
        initialize = i % 128;
        int i2 = i % 2;
        get().ThreeDS2Service(str);
        if (i2 != 0) {
            throw null;
        }
        int i3 = initialize + 115;
        getSDKInfo = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = 1670374364180961846L;
    }

    public static /* synthetic */ void ThreeDS2ServiceInstance(at atVar, String str) {
        int i = initialize + 57;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        atVar.initialize(str);
        if (i2 == 0) {
            int i3 = 39 / 0;
        }
        initialize = (getSDKInfo + 69) % 128;
    }

    private ThreeDS2Service get() {
        getSDKInfo = (initialize + 21) % 128;
        x.get initialize2 = initialize();
        if (initialize2 instanceof ThreeDS2Service) {
            initialize = (getSDKInfo + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return (ThreeDS2Service) initialize2;
        }
        throw setTextAlignment.AuthenticationRequestParameters.initialize(new Object[0]);
    }
}
