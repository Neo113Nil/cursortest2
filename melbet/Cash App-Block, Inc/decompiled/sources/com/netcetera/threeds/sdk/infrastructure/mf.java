package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class mf implements mj<Activity> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int getSDKVersion;
    private final mj<AppCompatActivity> get;
    private final mj<Activity> getWarnings;
    private final no initialize = (no) nu.initialize(new Object[]{mj.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        getSDKVersion = 1;
        ThreeDS2Service = -713360917957827335L;
    }

    public mf(mj<Activity> mjVar, mj<AppCompatActivity> mjVar2) {
        this.getWarnings = mjVar;
        this.get = mjVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        Object method;
        Throwable cause;
        int i2;
        Object method2;
        char c = 2;
        if (str != null) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= cArr2.length) {
                break;
            }
            char c2 = cArr2[i4];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c] = addparam;
                objArr2[1] = addparam;
                objArr2[0] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    i2 = 1;
                    method2 = obj;
                } else {
                    i2 = 1;
                    method2 = ((Class) removeParam.initialize(66 - Drawable.resolveOpacity(0, 0), (char) (MotionEvent.axisFromString("") + 1), TextUtils.getOffsetAfter("", 0) + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method2);
                }
                jArr[i4] = ((Long) ((Method) method2).invoke(null, objArr2)).longValue() ^ (ThreeDS2Service ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i2] = addparam;
                objArr3[0] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(Color.red(0) + 76, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 62097), Color.alpha(0) + 2102);
                    Object[] objArr4 = new Object[i2];
                    b((byte) 0, (byte) -1, 0, objArr4);
                    obj2 = cls.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                c = 2;
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
        char[] cArr3 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i6 = $11 + 53;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr3[i5] = (char) jArr[i5];
                Object[] objArr5 = {addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-1840119381);
                if (obj3 == null) {
                    Class cls2 = (Class) removeParam.initialize(76 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 62097), 2103 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    Object[] objArr6 = new Object[1];
                    b((byte) 0, (byte) -1, 0, objArr6);
                    obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                    map2.put(-1840119381, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                int i7 = 31 / 0;
            } else {
                cArr3[i5] = (char) jArr[i5];
                Object[] objArr7 = {addparam, addparam};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj4 = map3.get(-1840119381);
                if (obj4 != null) {
                    method = obj4;
                } else {
                    Class cls3 = (Class) removeParam.initialize(76 - (Process.myPid() >> 22), (char) (62096 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2102 - (ViewConfiguration.getTapTimeout() >> 16));
                    Object[] objArr8 = new Object[1];
                    b((byte) 0, (byte) -1, 0, objArr8);
                    method = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                    map3.put(-1840119381, method);
                }
                ((Method) method).invoke(null, objArr7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, int i, Object[] objArr) {
        int i2;
        int i3 = b2 + 4;
        int i4 = (b * 2) + 1;
        byte[] bArr = $$a;
        int i5 = 99 - (i * 3);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i5;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{67, -6, 94, 34};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r6 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (r6 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.mf.getSDKVersion = (r2 + 79) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean initialize(Activity activity) {
        getSDKVersion = (ThreeDS2ServiceInstance + 39) % 128;
        Object[] objArr = new Object[1];
        a("Ⓦ蘆慃첐꿖झ\uf457垶㊫鰡罯\udaaa藲惃숆굖࢜\uebcc啙こ鎹维\ud86d뭟暥쇠곬ฅ\ue94c和㟚鄂籌\udfab뫳搫읯ꊽ෧\ue8d7", Color.red(0) + 41669, objArr);
        if (((Boolean) mx.ThreeDS2Service(new Object[]{((String) objArr[0]).intern()}, -327252871, 327252871, (int) System.currentTimeMillis())).booleanValue()) {
            int i = getSDKVersion + 31;
            int i2 = i % 128;
            ThreeDS2ServiceInstance = i2;
            boolean z = activity instanceof AppCompatActivity;
            if (i % 2 != 0) {
                int i3 = 38 / 0;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (initialize(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (initialize(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        r0 = r5.initialize;
        r3 = new java.lang.Object[1];
        a("⓹䒠\ue402֢ꕉ씦暜蘘⟬䝄\ue73a\u009eꀱ쇭慈脲⊔䉮\ue3deΦꌰ쳄汪跍ⷵ䴞\uee80\u0e7e꾁쾳漝袶⡹䧑\ue9b7इꪹ쩕樽讪⬗哯\uf456ᐾ떉핂盪陖㘭垛\uf778ჟ끙퀥熗鄰㋔加\uf23fᏄ덀\udccc粫鰵㶂嵥ﻗả븍\udfd5罐飚㢬堖臨᥎뤨\udae0穋鯳㭎嬱쒙摵薩╈䔦\ue699ٴꟓ읖杪肀\u2072䇟\ue1a4Ģꊁ쉣掌莸⌄䳣\uec20\u0de4궣촋滳蹇⿅便\uef1f", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0) + 24678, r3);
        r0.initialize(((java.lang.String) r3[0]).intern());
        r5.getWarnings.ThreeDS2ServiceInstance(r6, r7);
        com.netcetera.threeds.sdk.infrastructure.mf.ThreeDS2ServiceInstance = (com.netcetera.threeds.sdk.infrastructure.mf.getSDKVersion + 25) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.view.ViewConfiguration.getMinimumFlingVelocity();
        r5.get.ThreeDS2ServiceInstance((androidx.appcompat.app.AppCompatActivity) r6, r7);
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2ServiceInstance(Activity activity, mu muVar) {
        int i = getSDKVersion + 59;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
        ThreeDS2ServiceInstance = (getSDKVersion + 23) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.mj
    public boolean getWarnings(Activity activity) {
        ThreeDS2ServiceInstance = (getSDKVersion + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        if (initialize(activity)) {
            ThreeDS2ServiceInstance = (getSDKVersion + 1) % 128;
            AudioTrack.getMinVolume();
            return this.get.getWarnings((AppCompatActivity) activity);
        }
        no noVar = this.initialize;
        Object[] objArr = new Object[1];
        a("⓹䒠\ue402֢ꕉ씦暜蘘⟬䝄\ue73a\u009eꀱ쇭慈脲⊔䉮\ue3deΦꌰ쳄汪跍ⷵ䴞\uee80\u0e7e꾁쾳漝袶⡹䧑\ue9b7इꪹ쩕樽讪⬗哯\uf456ᐾ떉핂盪陖㘭垛\uf778ჟ끙퀥熗鄰㋔加\uf23fᏄ덀\udccc粫鰵㶂嵥ﻗả븍\udfd5罐飚㢬堖臨᥎뤨\udae0穋鯳㭎嬱쒙摵薩╈䔦\ue699ٴꟓ읖杪肀\u2072䇟\ue1a4Ģꊁ쉣掌莸⌄䳣\uec20\u0de4궣촋滳蹇⿅便\uef1f", TextUtils.getTrimmedLength("") + 24677, objArr);
        noVar.initialize(((String) objArr[0]).intern());
        return this.getWarnings.getWarnings(activity);
    }

    public static mj<Activity> initialize() {
        mf mfVar = new mf(new mi(), new mh());
        ThreeDS2ServiceInstance = (getSDKVersion + 53) % 128;
        return mfVar;
    }
}
