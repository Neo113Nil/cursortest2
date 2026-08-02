package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class iy implements setCertificate {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInstance;
    private static int get;
    private static long getWarnings;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{iy.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final Object initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        get = 1;
        getWarnings = -4823035242644267751L;
    }

    private iy(Object obj) {
        this.initialize = obj;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = $11;
        $10 = (i3 + 25) % 128;
        if (str != null) {
            int i4 = i3 + 111;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(getWarnings ^ (-2776494906517314268L), cArr, i);
        int i5 = 4;
        oncompleted.initialize = 4;
        while (true) {
            int i6 = oncompleted.initialize;
            if (i6 >= initialize.length) {
                objArr[0] = new String(initialize, i5, initialize.length - 4);
                return;
            }
            $10 = ($11 + 29) % 128;
            int i7 = i6 - 4;
            oncompleted.ThreeDS2Service = i7;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i6] ^ initialize[i6 % 4]), Long.valueOf(i7), Long.valueOf(getWarnings)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i5;
                } else {
                    i2 = i5;
                    Class cls = (Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (27780 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.combineMeasuredStates(0, 0) + 2441);
                    Object[] objArr3 = new Object[1];
                    b((short) -1, (short) 0, 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i6] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 14235 - View.MeasureSpec.getMode(0))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                i5 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3 = 112 - (i * 4);
        int i4 = s2 * 4;
        byte[] bArr = $$a;
        int i5 = s + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            int i10 = i5 + i9;
            int i11 = i7;
            i3 = i10;
            i5 = i11;
            bArr = bArr3;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            int i12 = i5 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i3;
            i7 = i12;
            i5 = bArr[i12];
            i8 = i2 + 1;
            bArr3 = bArr;
            i9 = i13;
            int i102 = i5 + i9;
            int i112 = i7;
            i3 = i102;
            i5 = i112;
            bArr = bArr3;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            int i122 = i5 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i1222 = i5 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static setCertificate getWarnings() {
        iy iyVar = new iy(setThreeDSRequestorAppURL.initialize((Class) removeParam.initialize(58 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getOffsetBefore("", 0), 6413 - TextUtils.lastIndexOf("", '0'))));
        int i = get + 91;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 57 / 0;
        }
        return iyVar;
    }

    public static void init$0() {
        $$a = new byte[]{69, -33, 81, 44};
        $$b = EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCertificate
    public void ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance + 81;
        get = i % 128;
        try {
            if (i % 2 == 0) {
                TextUtils.lastIndexOf("", ',', 0, 0);
                Object obj = this.initialize;
                Map map = removeParam.visaSchemeConfiguration;
                Object obj2 = map.get(-582293455);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(57 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Process.myPid() >> 22), AndroidCharacter.getMirror('0') + 6366)).getMethod("ThreeDS2Service", null);
                    map.put(-582293455, obj2);
                }
                ((Method) obj2).invoke(obj, null);
                return;
            }
            TextUtils.lastIndexOf("", '0', 0, 0);
            Object obj3 = this.initialize;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj4 = map2.get(-582293455);
            if (obj4 == null) {
                obj4 = ((Class) removeParam.initialize(58 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 6414 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("ThreeDS2Service", null);
                map2.put(-582293455, obj4);
            }
            ((Method) obj4).invoke(obj3, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCertificate
    public void initialize(setScrollCaptureCallback setscrollcapturecallback) {
        Object obj;
        Object obj2;
        int i = ThreeDS2ServiceInstance + 7;
        get = i % 128;
        int i2 = i % 2;
        no noVar = this.ThreeDS2Service;
        try {
            if (i2 == 0) {
                Object[] objArr = new Object[1];
                a("↱⇴菉ச靺셱箒㾢섷\ue02f媇Ẵ\ue037Ϳ㦑ﶋ茊∇ᢜ\udc9bꈎ䕇\uffbf뮞䔚摓\ude84驄摻蒹뷇祧ܽꞚ鳙塪♢욂珧❈줋", 0 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
                String intern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                objArr2[1] = setscrollcapturecallback;
                noVar.ThreeDS2ServiceInstance(intern, objArr2);
                obj = this.initialize;
                Map map = removeParam.visaSchemeConfiguration;
                obj2 = map.get(-582293455);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(AndroidCharacter.getMirror('0') + '\n', (char) Gravity.getAbsoluteGravity(0, 0), 6414 - Color.argb(0, 0, 0, 0))).getMethod("ThreeDS2Service", null);
                    map.put(-582293455, obj2);
                }
            } else {
                Object[] objArr3 = new Object[1];
                a("↱⇴菉ச靺셱箒㾢섷\ue02f媇Ẵ\ue037Ϳ㦑ﶋ茊∇ᢜ\udc9bꈎ䕇\uffbf뮞䔚摓\ude84驄摻蒹뷇祧ܽꞚ鳙塪♢욂珧❈줋", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                noVar.ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), setscrollcapturecallback);
                obj = this.initialize;
                Map map2 = removeParam.visaSchemeConfiguration;
                obj2 = map2.get(-582293455);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(58 - ((Process.getThreadPriority(0) + 20) >> 6), (char) TextUtils.getCapsMode("", 0, 0), 6414 - Color.blue(0))).getMethod("ThreeDS2Service", null);
                    map2.put(-582293455, obj2);
                }
            }
            ((Method) obj2).invoke(obj, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
