package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class au {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1;
    private static int getWarnings = 0;
    private static int initialize = 1141902460;

    /* JADX WARN: Removed duplicated region for block: B:24:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        int i4;
        Throwable cause;
        int i5;
        if (str != null) {
            $10 = ($11 + 79) % 128;
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
            $10 = ($11 + 51) % 128;
            char c = cArr2[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr3[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(initialize);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(Color.red(i6) + 67, (char) (45769 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 4879 - (ViewConfiguration.getFadingEdgeLength() >> 16));
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
                    obj2 = ((Class) removeParam.initialize(59 - View.MeasureSpec.getSize(i5), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 12373)).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = i5;
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
        int i8 = i6;
        if (i > 0) {
            $10 = ($11 + 119) % 128;
            getsdkinfo.get = i;
            char[] cArr4 = new char[i2];
            i4 = i8;
            System.arraycopy(cArr3, i4, cArr4, i4, i2);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr4, i4, cArr3, i2 - i9, i9);
            int i10 = getsdkinfo.get;
            System.arraycopy(cArr4, i10, cArr3, i4, i2 - i10);
        } else {
            i4 = i8;
        }
        if (z) {
            char[] cArr5 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i11 = getsdkinfo.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                int i12 = $11 + 27;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    cArr5[i11] = cArr3[(i2 % i11) >> 1];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 60, (char) Color.blue(0), (Process.myTid() >> 22) + 12373)).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                } else {
                    cArr5[i11] = cArr3[(i2 - i11) - 1];
                    Object[] objArr5 = {getsdkinfo, getsdkinfo};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(1981656970);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 59, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12372)).getMethod("r", Object.class, Object.class);
                        map3.put(1981656970, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr5);
                }
            }
            cArr3 = cArr5;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.getWarnings((java.lang.CharSequence) r13) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.oj.getWarnings((java.lang.CharSequence) r13) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r8 = new java.lang.Object[1];
        a(true, 4 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 14, "\u0007\ufff4>\n\ufff3\t\ufff8\ufff8\n\ufff5\ufff9\ufff8\ufff8￬", 179 - android.view.View.combineMeasuredStates(0, 0), r8);
        r12 = r13.replaceAll(((java.lang.String) r8[0]).intern(), "");
        r8 = new java.lang.Object[1];
        a(false, 32 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 75 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "￤7￣￢ￛ￥+*./ￛ￥￢￤7￣+*./￤￤￣ￛ￥\u0016\u0019\ufff9\u0018￥\ufff9￤￣\ufffa$￤￣\ufff7!*-(ￛ￦\u0016\u0019\ufff9\u0018￥ￛ￥( /#*\u001fￛ￥\ufff8ￛ￥￤￣￣\uffddￛ￥+*./ￛ￥\uffdd", 194 - android.graphics.ImageFormat.getBitsPerPixel(0), r8);
        r13 = ((java.lang.String) r8[0]).intern();
        r9 = new java.lang.Object[1];
        a(true, android.graphics.ImageFormat.getBitsPerPixel(0) + 5, 10 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), "\u0014\uffef\ufffe\ufff1\u0003\ufff1\uffef!\u0012", 177 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), r9);
        r12 = r12.replaceAll(r13, ((java.lang.String) r9[0]).intern());
        r8 = new java.lang.Object[1];
        a(true, 63 - android.graphics.Color.blue(0), android.widget.ExpandableListView.getPackedPositionGroup(0) + 125, "\u001e '\u001e%%\u001a!\u001c￨\u0015\f�￬\u000f\u0006\ufffe￨\u0015￨\u0015\ufff3\f\t\r\r\u0001￣\uffd9ￛ￣\uffd9\ufff6￣\uffd9-\u001e +\u001a-￣\uffd9￡￡￢￣\u0016\ufff7\u0017\u0014￤\uffd9&+(\u001f\ufff5￡￢\"\ufff8￡￢\ufff7￣\u0016\ufff7\u0017\u0014￣\uffd9￡￢￢ￛ￣\uffd9\u001e '\u001e%%\u001a!\u001c￨\u0015\f�￬\u000f\u0006\ufffe￨\u0015￨\u0015\ufff3\f\t\r\r\u0001￣\uffd9ￛ￣\uffd9\ufff6￣\uffd9-\u001e +\u001a-￡5￢ￛ￣\uffd9", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.plaid.internal.EnumC0170g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, r8);
        r13 = ((java.lang.String) r8[0]).intern();
        r8 = new java.lang.Object[1];
        a(true, 'W' - android.text.AndroidCharacter.getMirror('0'), android.view.View.MeasureSpec.getSize(0) + 39, "￥ￔ\uffd0ￒ\u0015\u0017\u001e\u0015\u001c\u001c\u0011\u0018\u0013\uffdf\u0003\ufff4￣\u0006�\ufff5\uffdf\uffdf￪# $$\u0018ￒ￭\u001e\u001f\u0019$\u0013\u0011\uffd0￡ￔ", 207 - (android.media.AudioTrack.getMaxVolume() > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.media.AudioTrack.getMaxVolume() == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1)), r8);
        r12 = r12.replaceAll(r13, ((java.lang.String) r8[0]).intern());
        r13 = com.netcetera.threeds.sdk.infrastructure.au.getWarnings + 31;
        com.netcetera.threeds.sdk.infrastructure.au.ThreeDS2Service = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00f2, code lost:
    
        if ((r13 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00f4, code lost:
    
        r13 = 13 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f7, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String get(String str) {
        int i = ThreeDS2Service + 31;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }
}
