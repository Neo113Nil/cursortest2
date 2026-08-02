package com.netcetera.threeds.sdk.infrastructure;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.keys;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class by extends ms implements getOrDefault {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static char ThreeDS2ServiceInstance = 0;
    private static char cleanup = 0;
    private static char get = 0;
    private static int getSDKInfo = 1;
    private static char getWarnings;
    final cd initialize;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("立澸⢒\ued32꒳驄\uf356櫡깬䒓戶㽭\ue4c6净吁瀭", TextUtils.indexOf("", "", 0, 0) + 16, objArr);
        ThreeDS2Service = ((String) objArr[0]).intern();
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 51) % 128;
    }

    public by(cd cdVar) {
        this.initialize = cdVar;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = ($10 + 5) % 128;
        $11 = i3;
        int i4 = 2;
        if (str != null) {
            int i5 = i3 + 117;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr3 = new char[cArr2.length];
        int i6 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i7 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i7 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            cArr4[i6] = cArr2[i7];
            char c = 1;
            cArr4[1] = cArr2[i7 + 1];
            int i8 = 58224;
            int i9 = i6;
            while (i9 < 16) {
                char c2 = cArr4[c];
                char c3 = cArr4[i6];
                char c4 = c;
                int i10 = i4;
                ConfigurationBuilder configurationBuilder2 = configurationBuilder;
                int i11 = (c3 + i8) ^ ((c3 << 4) + ((char) (ThreeDS2ServiceInstance ^ (-1730380012335540218L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(cleanup);
                    objArr2[i10] = Integer.valueOf(i12);
                    objArr2[c4] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        i2 = i6;
                    } else {
                        i2 = i6;
                        obj = ((Class) removeParam.initialize((TypedValue.complexToFraction(i6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 67, (char) (62396 - Color.alpha(i6)), 5351 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[i2];
                    char[] cArr5 = cArr2;
                    int i13 = (charValue + i8) ^ ((charValue << 4) + ((char) (get ^ (-1730380012335540218L))));
                    int i14 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getWarnings);
                    objArr3[i10] = Integer.valueOf(i14);
                    objArr3[c4] = Integer.valueOf(i13);
                    objArr3[i2] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        int i15 = i2;
                        obj2 = ((Class) removeParam.initialize(Color.blue(i2) + 67, (char) (TextUtils.indexOf("", "", i15, i15) + 62396), 5352 - TextUtils.indexOf("", "", i15))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr4[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    c = c4;
                    i4 = i10;
                    configurationBuilder = configurationBuilder2;
                    cArr2 = cArr5;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr6 = cArr2;
            int i16 = i4;
            ConfigurationBuilder configurationBuilder3 = configurationBuilder;
            char c6 = c;
            int i17 = configurationBuilder3.ThreeDS2ServiceInstance;
            cArr3[i17] = cArr4[0];
            cArr3[i17 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[i16];
            objArr4[c6] = configurationBuilder3;
            objArr4[0] = configurationBuilder3;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 54, (char) (39910 - (ViewConfiguration.getTouchSlop() >> 8)), 7060 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i4 = i16;
            i6 = 0;
            configurationBuilder = configurationBuilder3;
            cArr2 = cArr6;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public void ThreeDS2Service(boolean z) {
        int i = ThreeDS2ServiceInitializationCallback + 41;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (!z) {
            this.initialize.getSDKInfo();
        }
        int i2 = ThreeDS2ServiceInitializationCallback + 29;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void ThreeDS2ServiceInstance(setScroller setscroller) {
        int i = ThreeDS2ServiceInitializationCallback + 43;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service().ThreeDS2Service();
            cd cdVar = this.initialize;
            bt.getWarnings(new Object[]{cdVar, setscroller}, 1112145242, -1112145242, System.identityHashCode(cdVar));
        } else {
            ThreeDS2Service().ThreeDS2Service();
            cd cdVar2 = this.initialize;
            bt.getWarnings(new Object[]{cdVar2, setscroller}, 1112145242, -1112145242, System.identityHashCode(cdVar2));
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public View bQ_(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, boolean z) {
        int i = (getSDKInfo + 67) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        if (!z) {
            return this.initialize.get(layoutInflater.getContext());
        }
        int i2 = i + 91;
        getSDKInfo = i2 % 128;
        return i2 % 2 == 0 ? super.bQ_(layoutInflater, viewGroup, bundle, false) : super.bQ_(layoutInflater, viewGroup, bundle, true);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public void bR_(Bundle bundle, boolean z) {
        ew ewVar;
        Object obj;
        if (bundle != null) {
            int i = getSDKInfo + 13;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (!(!z)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 33) {
                int i2 = ThreeDS2ServiceInitializationCallback + 79;
                getSDKInfo = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a("立澸⢒\ued32꒳驄\uf356櫡깬䒓戶㽭\ue4c6净吁瀭", (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)) + 32, objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a("立澸⢒\ued32꒳驄\uf356櫡깬䒓戶㽭\ue4c6净吁瀭", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr2);
                    obj = objArr2[0];
                }
                ewVar = (ew) bundle.getSerializable(((String) obj).intern());
            } else {
                Object[] objArr3 = new Object[1];
                a("立澸⢒\ued32꒳驄\uf356櫡깬䒓戶㽭\ue4c6净吁瀭", 16 - View.getDefaultSize(0, 0), objArr3);
                ewVar = (ew) bundle.getSerializable(((String) objArr3[0]).intern(), ew.class);
            }
            if (ewVar != null) {
                int i3 = ThreeDS2ServiceInitializationCallback + 37;
                getSDKInfo = i3 % 128;
                int i4 = i3 % 2;
                cd cdVar = this.initialize;
                if (i4 == 0) {
                    cdVar.ThreeDS2Service(ewVar);
                    throw null;
                }
                cdVar.ThreeDS2Service(ewVar);
                getSDKInfo = (ThreeDS2ServiceInitializationCallback + 93) % 128;
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public void bS_(Bundle bundle, boolean z) {
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 89) % 128;
        if (!z) {
            ew ewVar = new ew();
            this.initialize.getWarnings(ewVar);
            Object[] objArr = new Object[1];
            a("立澸⢒\ued32꒳驄\uf356櫡깬䒓戶㽭\ue4c6净吁瀭", 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            bundle.putSerializable(((String) objArr[0]).intern(), ewVar);
        }
        int i = getSDKInfo + 37;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 62 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public void get(boolean z) {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 91) % 128;
        cd cdVar = this.initialize;
        bs.initialize(new Object[]{cdVar}, 130025777, -130025777, System.identityHashCode(cdVar));
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 85) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ms, com.netcetera.threeds.sdk.infrastructure.mu
    public void getWarnings(boolean z) {
        int i = ThreeDS2ServiceInitializationCallback + 81;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (z) {
            return;
        }
        keys.getWarnings getwarnings = new keys.getWarnings();
        Intent bP_ = ThreeDS2Service().bP_();
        if (bP_ != null) {
            getwarnings.T_(bP_);
        }
        this.initialize.getWarnings(getwarnings.ThreeDS2ServiceInstance());
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 3) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void initialize() {
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 103) % 128;
        this.initialize.get();
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 87) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void get(compute computeVar) {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 105) % 128;
        this.initialize.ThreeDS2ServiceInstance(computeVar);
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 3) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void get() {
        int i = getSDKInfo + 47;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        cd cdVar = this.initialize;
        if (i2 == 0) {
            cdVar.getWarnings();
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 81) % 128;
        } else {
            cdVar.getWarnings();
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getOrDefault
    public void getWarnings() {
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 15) % 128;
        ThreeDS2Service().get();
        ThreeDS2ServiceInitializationCallback = (getSDKInfo + 39) % 128;
    }

    public static void ThreeDS2ServiceInstance() {
        get = (char) 18015;
        getWarnings = (char) 42042;
        ThreeDS2ServiceInstance = (char) 31312;
        cleanup = (char) 52971;
    }
}
