package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setTitle;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class setNavigationOnClickListener extends setSubtitleTextColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static long get;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        ThreeDS2Service = 1;
        get = -922252701599856764L;
    }

    private setNavigationOnClickListener(setSubtitle<setPopupTheme, nq> setsubtitle, jh jhVar, setCollapseIcon setcollapseicon, setTitleTextAppearance settitletextappearance) {
        super(setsubtitle, jhVar, setcollapseicon, settitletextappearance);
    }

    private static void d(String str, int i, Object[] objArr) {
        $11 = ($10 + 53) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(get ^ (-2776494906517314268L), charArray, i);
        oncompleted.initialize = 4;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize.length) {
                String str2 = new String(initialize, 4, initialize.length - 4);
                $10 = ($11 + 5) % 128;
                objArr[0] = str2;
                return;
            }
            $11 = ($10 + 27) % 128;
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i2] ^ initialize[i2 % 4]), Long.valueOf(i3), Long.valueOf(get)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (27780 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 2441 - Color.alpha(0));
                    Object[] objArr3 = new Object[1];
                    e(0, 0, (short) 0, objArr3);
                    String str3 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str3, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 65, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14235 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(int i, int i2, short s, Object[] objArr) {
        int i3;
        int i4 = (s * 2) + 112;
        byte[] bArr = $$a;
        int i5 = 1 - (i * 2);
        int i6 = 4 - (i2 * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i6++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i4 += -i7;
            i6++;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{58, -96, 36, -125};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public void initialize(nq nqVar, setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 47) % 128;
        setSubtitle<String, String> ThreeDS2Service2 = ThreeDS2Service();
        Object[] objArr = new Object[1];
        d("ᄗ\udab4䘀烅ᅶ硷̳靭鯃\uf7d9覌˷Ѳ浲ᰲ豀軤飼", KeyEvent.keyCodeFromString(""), objArr);
        threeDS2ServiceInstance.getWarnings(ThreeDS2Service2.ThreeDS2ServiceInstance(nqVar.initialize(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        d("䒷ヲ傜\uee05䓔鈺ᖽউ칛ᶷ鼲鰂凒蜓સኁ\udb7e犼됺椊", Process.myTid() >> 22, objArr2);
        threeDS2ServiceInstance.ThreeDS2Service(nqVar.initialize(((String) objArr2[0]).intern()));
        ThreeDS2Service = (ThreeDS2ServiceInstance + 109) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public put initialize() {
        int i = ThreeDS2ServiceInstance + 113;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return put.ThreeDS2Service;
        }
        int i2 = 40 / 0;
        return put.ThreeDS2Service;
    }

    public static setSubtitleTextColor initialize(jh jhVar) {
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(new setOnMenuItemClickListener(), jhVar, new setCollapseIcon(), new setTitleTextAppearance());
        int i = ThreeDS2ServiceInstance + 83;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 24 / 0;
        }
        return setnavigationonclicklistener;
    }
}
