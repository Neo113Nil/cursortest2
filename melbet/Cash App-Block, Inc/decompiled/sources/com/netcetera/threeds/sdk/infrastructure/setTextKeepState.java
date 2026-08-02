package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setTextKeepState implements setFocusedSearchResultHighlightColor {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 0;
    private static int get = 1141902492;
    private static int getSDKInfo = 1;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setTextKeepState.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final setSpannableFactory getWarnings;
    private final setFindListener initialize;

    public setTextKeepState(setFindListener setfindlistener, setSpannableFactory setspannablefactory) {
        this.initialize = setfindlistener;
        this.getWarnings = setspannablefactory;
    }

    public static setFocusedSearchResultHighlightColor ThreeDS2Service(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled) {
        setTextKeepState settextkeepstate = new setTextKeepState(setwebcontentsdebuggingenabled.initialize(), new setSpannableFactory());
        int i = ThreeDS2Service + 53;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 96 / 0;
        }
        return settextkeepstate;
    }

    private byte[] ThreeDS2ServiceInstance(setVerticalScrollbarOverlay setverticalscrollbaroverlay, String str) {
        ThreeDS2Service = (getSDKInfo + 23) % 128;
        Object[] objArr = new Object[1];
        a(false, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, 45 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0015\u000f\uffddￃ\ufffe\uffc8\u0016\u0000\ufff1\u0018\u000f\u000fￃ\u0015\b\u0016\u0013\u0012\u0011\u0016\bￃ\u0005\u0012\u0007\u001cￃ\t\u0012\u0015ￃ\u0015\b\u0014\u0018\b\u0016\u0017ￃ\u001a\f\u0017\u000bￃ\u0018", 251 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        Objects.requireNonNull(setverticalscrollbaroverlay, String.format(((String) objArr[0]).intern(), str));
        byte[] ThreeDS2Service2 = setverticalscrollbaroverlay.ThreeDS2Service();
        int i = ThreeDS2Service + 59;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 0;
        }
        return ThreeDS2Service2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        if (str != null) {
            $10 = ($11 + 81) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr3 = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            char c = cArr2[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(get);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(Color.alpha(i6) + 67, (char) (Drawable.resolveOpacity(i6, i6) + 45769), 4879 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Class cls2 = Integer.TYPE;
                    obj = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, obj);
                }
                cArr3[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    int i8 = i5;
                    obj2 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", i8, i8) + 59, (char) (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i8) == 0L ? 0 : -1)) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = 0;
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
            char[] cArr4 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr4, 0, cArr3, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr4, i10, cArr3, 0, i2 - i10);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                $11 = ($10 + 105) % 128;
                cArr5[i11] = cArr3[(i2 - i11) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(58 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12373 - Color.argb(0, 0, 0, 0))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFocusedSearchResultHighlightColor
    public final Bitmap y_(String str, boolean z) {
        getSDKInfo = (ThreeDS2Service + 27) % 128;
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        try {
            Bitmap x_ = this.getWarnings.x_(ThreeDS2ServiceInstance(this.initialize.initialize(str, z).ThreeDS2ServiceInstance().get(), str));
            int i = ThreeDS2Service + 67;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                int i2 = 55 / 0;
            }
            return x_;
        } catch (setScrollCaptureCallback e) {
            no noVar = this.ThreeDS2ServiceInstance;
            Object[] objArr = new Object[1];
            a(false, TextUtils.lastIndexOf("", '0', 0) + 6, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, "\u000f\u0003\t\u0007\uffd0\uffe7\u0014\u0014\u0011\u0014ￂ\u000e\u0011\u0003\u0006\u000b\u0010\tￂ\u000b", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e);
            return null;
        } catch (Exception e2) {
            no noVar2 = this.ThreeDS2ServiceInstance;
            Object[] objArr2 = new Object[1];
            a(false, TextUtils.lastIndexOf("", '0', 0, 0) + 6, TextUtils.lastIndexOf("", '0', 0, 0) + 21, "\u000f\u0003\t\u0007\uffd0\uffe7\u0014\u0014\u0011\u0014ￂ\u000e\u0011\u0003\u0006\u000b\u0010\tￂ\u000b", KeyEvent.normalizeMetaState(0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, objArr2);
            noVar2.ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), setTextAlignment.doChallenge.initialize(str, e2));
            return null;
        }
    }
}
