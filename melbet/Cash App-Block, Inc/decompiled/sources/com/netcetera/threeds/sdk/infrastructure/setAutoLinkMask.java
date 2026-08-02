package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setAutoLinkMask extends setHighlightColor {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2Service;
    private static int get;
    private static final String getWarnings;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        initialize = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        c("귣\ue132㑥䮜麅ⶥ慪둷쮌ố귮\ue128㑲䯌點ⷧ愶", ((Process.getThreadPriority(0) + 20) >> 6) + 19661, objArr);
        getWarnings = ((String) objArr[0]).intern();
        get = (initialize + 103) % 128;
    }

    public setAutoLinkMask(String str) {
        super(str);
    }

    private String ThreeDS2ServiceInstance(List<ResolveInfo> list, List<ResolveInfo> list2) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<ResolveInfo> it = list.iterator();
        get = (initialize + 105) % 128;
        while (it.hasNext()) {
            hashSet.add(it.next().activityInfo.packageName);
        }
        Iterator<ResolveInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i = get + 21;
            initialize = i % 128;
            if (i % 2 == 0) {
                hashSet2.add(it2.next().activityInfo.packageName);
                int i2 = 92 / 0;
            } else {
                hashSet2.add(it2.next().activityInfo.packageName);
            }
        }
        hashSet2.removeAll(hashSet);
        return !hashSet2.isEmpty() ? (String) hashSet2.iterator().next() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(String str, int i, Object[] objArr) {
        Throwable cause;
        short s;
        int i2;
        short s2;
        int i3 = 1;
        int i4 = $11 + 1;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        short s3 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= charArray.length) {
                break;
            }
            char c = charArray[i5];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[i3] = addparam;
                objArr2[s3] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    i2 = i3;
                    s2 = s3;
                    s = -1;
                } else {
                    s = -1;
                    i2 = i3;
                    s2 = s3;
                    Method method = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 65, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), 12511 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                    obj = method;
                }
                jArr[i5] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (ThreeDS2Service ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[s2] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    short s4 = s2;
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 76, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62096), 2102 - TextUtils.getOffsetBefore("", s4));
                    Object[] objArr4 = new Object[i2];
                    d(s4, s, s4, objArr4);
                    obj2 = cls.getMethod((String) objArr4[s4], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i3 = 1;
                s3 = 0;
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
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i6 = addparam.ThreeDS2Service;
            if (i6 >= charArray.length) {
                String str2 = new String(cArr);
                $11 = ($10 + 5) % 128;
                objArr[0] = str2;
                return;
            }
            cArr[i6] = (char) jArr[i6];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 76, (char) (62097 - ExpandableListView.getPackedPositionType(0L)), MotionEvent.axisFromString("") + 2103);
                Object[] objArr6 = new Object[1];
                d((short) 0, (short) -1, (short) 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$d;
        int i3 = s2 + 4;
        int i4 = 99 - (s * 2);
        int i5 = 1 - (s3 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 += i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{81, -51, 83, 43};
        $$e = 43;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setHighlightColor
    public void t_(Context context, Intent intent) {
        int i = initialize + 17;
        get = i % 128;
        if (i % 2 != 0) {
            intent.setPackage(u_(intent, context));
            throw null;
        }
        intent.setPackage(u_(intent, context));
        get = (initialize + 19) % 128;
    }

    public String u_(Intent intent, Context context) {
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr = new Object[1];
        c("귪ꀢ뙡蒬髸\ue901ｅ췔쏚혚\u2439㩣ࢱỤ浇捃熘䟈娜ꠡ빩賶苇鄣\ue766\uf5b3", 3527 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        c("귣\ue132㑥䮜麅ⶥ慪둷쮌ố귮\ue128㑲䯌點ⷧ愶", MotionEvent.axisFromString("") + 19662, objArr2);
        String ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(packageManager.queryIntentActivities(new Intent(intern, Uri.parse(((String) objArr2[0]).intern())), 65536), packageManager.queryIntentActivities(intent, 65536));
        initialize = (get + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return ThreeDS2ServiceInstance;
    }

    public static void ThreeDS2ServiceInstance() {
        ThreeDS2Service = -9191689642741223969L;
    }
}
