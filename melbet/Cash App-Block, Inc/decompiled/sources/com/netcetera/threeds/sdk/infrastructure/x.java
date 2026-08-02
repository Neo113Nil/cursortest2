package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class x extends WebViewClient {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 0;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    private static final String getWarnings;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{ar.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final get get;
    private final Handler initialize;

    public interface get {
        void getWarnings(String str);
    }

    static {
        getWarnings();
        Object[] objArr = new Object[1];
        a(false, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 24, "\u0006\u000e\u0017ￔ\u0005\u0014\uffd0\u0004\t\u0002\r\r\u0006\u000f\b\u0006\t\u0015\u0015\u0011\u0014ￛ\uffd0\uffd0", 263 - TextUtils.lastIndexOf("", '0', 0, 0), objArr);
        getWarnings = ((String) objArr[0]).intern();
        int i = getSDKInfo + 3;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public x(get getVar, Handler handler) {
        this.get = getVar;
        this.initialize = handler;
    }

    public static /* synthetic */ void ThreeDS2Service(x xVar, String str) {
        int i = getSDKInfo + 115;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        xVar.getWarnings(str);
        if (i2 == 0) {
            throw null;
        }
        getSDKInfo = (getSDKVersion + 59) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        Throwable cause;
        $11 = ($10 + 11) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i4 = getsdkinfo.getWarnings;
            if (i4 >= i2) {
                break;
            }
            $11 = ($10 + 41) % 128;
            char c = charArray[i4];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i4] = c2;
            try {
                Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf(ThreeDS2Service)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize(67 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (TextUtils.getOffsetAfter("", 0) + 45769), Gravity.getAbsoluteGravity(0, 0) + 4879);
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
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
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i5 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i5, i5);
            int i6 = getsdkinfo.get;
            System.arraycopy(cArr2, i6, cArr, 0, i2 - i6);
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = 0;
            while (true) {
                int i7 = getsdkinfo.getWarnings;
                if (i7 >= i2) {
                    break;
                }
                $10 = ($11 + 113) % 128;
                cArr3[i7] = cArr[(i2 - i7) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((-16777157) - Color.rgb(0, 0, 0), (char) View.resolveSizeAndState(0, 0, 0), 12373 - Color.argb(0, 0, 0, 0))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private WebResourceResponse aj_() {
        Object[] objArr = new Object[1];
        a(true, 14 - Color.blue(0), (ViewConfiguration.getEdgeSlop() >> 16) + 14, "\b\t\u0010\u0004ￋ\u0010\u0014\u0001\u0010ￖ�\u0010�\u0000", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, 2 - Color.argb(0, 0, 0, 0), 5 - Color.argb(0, 0, 0, 0), "\u0010\u0011\ufff4￩\u0002", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, objArr2);
        WebResourceResponse webResourceResponse = new WebResourceResponse(intern, ((String) objArr2[0]).intern(), new ByteArrayInputStream(new byte[0]));
        getSDKVersion = (getSDKInfo + 85) % 128;
        return webResourceResponse;
    }

    private /* synthetic */ void getWarnings(String str) {
        getSDKVersion = (getSDKInfo + 107) % 128;
        this.get.getWarnings(str);
        getSDKVersion = (getSDKInfo + 103) % 128;
    }

    public abstract void aB_(Uri uri);

    public void get(Runnable runnable) {
        int i = getSDKInfo + 73;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        Handler handler = this.initialize;
        if (i2 == 0) {
            handler.post(runnable);
            int i3 = 5 / 0;
        } else {
            handler.post(runnable);
        }
        getSDKInfo = (getSDKVersion + 21) % 128;
    }

    public get initialize() {
        int i = getSDKInfo;
        get getVar = this.get;
        getSDKVersion = (i + 33) % 128;
        return getVar;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        Process.myPid();
        TypedValue.complexToFloat(0);
        Gravity.getAbsoluteGravity(0, 0);
        String uri = url.toString();
        Object[] objArr = new Object[1];
        a(true, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\b\t\u0010\u0004ￋ\u0010\u0014\u0001\u0010ￖ�\u0010�\u0000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + EnumC0170g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, objArr);
        if (uri.startsWith(((String) objArr[0]).intern())) {
            getSDKVersion = (getSDKInfo + 55) % 128;
            return null;
        }
        String uri2 = url.toString();
        Object[] objArr2 = new Object[1];
        a(false, 16 - TextUtils.indexOf("", ""), ImageFormat.getBitsPerPixel(0) + 25, "\u0006\u000e\u0017ￔ\u0005\u0014\uffd0\u0004\t\u0002\r\r\u0006\u000f\b\u0006\t\u0015\u0015\u0011\u0014ￛ\uffd0\uffd0", Color.green(0) + EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, objArr2);
        if (oj.getSDKVersion(uri2, ((String) objArr2[0]).intern())) {
            get(new ad(this, (String) oj.ThreeDS2ServiceInitializationCallback(url.getQuery(), "")));
        }
        aB_(url);
        WebResourceResponse aj_ = aj_();
        getSDKVersion = (getSDKInfo + 21) % 128;
        return aj_;
    }

    public static void getWarnings() {
        ThreeDS2Service = 1141902507;
    }
}
