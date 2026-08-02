package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class bv implements remove {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ConfigParameters = 27152;
    private static char ThreeDS2ServiceInitializationCallback = 56153;
    private static int addParam = 1;
    private static char cleanup = 24125;
    private static char createTransaction = 32714;
    private static int onError;
    private final Context ThreeDS2ServiceInstance;
    private ScrollView getSDKInfo;
    private ViewGroup getSDKVersion;
    protected final no ThreeDS2Service = (no) nu.initialize(new Object[]{bv.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final List<writeReplace> initialize = new ArrayList();
    private final List<computeIfPresent> getWarnings = new ArrayList();
    private final dv get = new dv();

    public bv(Context context) {
        this.ThreeDS2ServiceInstance = context;
    }

    private void ThreeDS2ServiceInstance(View view, String str) {
        Resources resources;
        String intern;
        String packageName;
        int i = addParam + 67;
        onError = i % 128;
        int i2 = i % 2;
        Context context = this.ThreeDS2ServiceInstance;
        try {
            if (i2 != 0) {
                resources = context.getResources();
                Object[] objArr = new Object[1];
                a("\uddd9\uf813", 0 % ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                intern = ((String) objArr[0]).intern();
                packageName = this.ThreeDS2ServiceInstance.getPackageName();
            } else {
                resources = context.getResources();
                Object[] objArr2 = new Object[1];
                a("\uddd9\uf813", 1 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
                intern = ((String) objArr2[0]).intern();
                packageName = this.ThreeDS2ServiceInstance.getPackageName();
            }
            view.setId(resources.getIdentifier(str, intern, packageName));
            onError = (addParam + 81) % 128;
        } catch (Throwable th) {
            no noVar = this.ThreeDS2Service;
            Object[] objArr3 = new Object[1];
            a("죈\uf469\u20cf㱒訛\udd3a㽹쩴덎眂췃薛坼法사ﲂ\uf883湁㽹쩴덎眂垶䑀䌦셥\uddd9\uf813캾❰\uf1cc\udb84磋혋ゟꫴ\ud88c⍹眱諌⊠\u0df9", ExpandableListView.getPackedPositionChild(0L) + 42, objArr3);
            noVar.initialize(String.format(((String) objArr3[0]).intern(), str, th.getMessage()));
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        Object obj;
        char[] cArr2;
        Object obj2;
        Object obj3;
        int i2 = $10 + 77;
        int i3 = i2 % 128;
        $11 = i3;
        int i4 = 2;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i5 = i3 + 31;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr4 = new char[cArr3.length];
        int i6 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        char[] cArr5 = new char[2];
        while (true) {
            int i7 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i7 >= cArr3.length) {
                objArr[0] = new String(cArr4, 0, i);
                return;
            }
            $10 = ($11 + 87) % 128;
            cArr5[i6] = cArr3[i7];
            boolean z = true;
            cArr5[1] = cArr3[i7 + 1];
            int i8 = 58224;
            int i9 = i6;
            while (i9 < 16) {
                boolean z2 = z;
                $10 = ($11 + 17) % 128;
                char c = cArr5[z2 ? 1 : 0];
                char c2 = cArr5[i6];
                int i10 = i4;
                int i11 = (c2 + i8) ^ ((c2 << 4) + ((char) (createTransaction ^ (-1730380012335540218L))));
                int i12 = c2 >>> 5;
                int i13 = i6;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ConfigParameters);
                    objArr2[i10] = Integer.valueOf(i12);
                    objArr2[z2 ? 1 : 0] = Integer.valueOf(i11);
                    objArr2[i13] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj4 = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj4 != null) {
                        cArr2 = cArr3;
                        obj2 = obj4;
                    } else {
                        cArr2 = cArr3;
                        Method method = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 67, (char) (62396 - Color.argb(i13, i13, i13, i13)), 5351 - TextUtils.lastIndexOf("", '0'))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, method);
                        obj2 = method;
                    }
                    char charValue = ((Character) ((Method) obj2).invoke(null, objArr2)).charValue();
                    cArr5[z2 ? 1 : 0] = charValue;
                    char c3 = cArr5[0];
                    char[] cArr6 = cArr5;
                    int i14 = (charValue + i8) ^ ((charValue << 4) + ((char) (ThreeDS2ServiceInitializationCallback ^ (-1730380012335540218L))));
                    int i15 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(cleanup);
                    objArr3[i10] = Integer.valueOf(i15);
                    objArr3[z2 ? 1 : 0] = Integer.valueOf(i14);
                    objArr3[0] = Integer.valueOf(c3);
                    Object obj5 = map.get(936379577);
                    if (obj5 != null) {
                        obj3 = obj5;
                    } else {
                        Method method2 = ((Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 67, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 62396), 5352 - TextUtils.indexOf("", ""))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, method2);
                        obj3 = method2;
                    }
                    cArr6[0] = ((Character) ((Method) obj3).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    z = z2 ? 1 : 0;
                    i4 = i10;
                    cArr3 = cArr2;
                    cArr5 = cArr6;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr7 = cArr3;
            int i16 = i4;
            char[] cArr8 = cArr5;
            boolean z3 = z;
            int i17 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr4[i17] = cArr8[0];
            cArr4[i17 + 1] = cArr8[z3 ? 1 : 0];
            Object[] objArr4 = new Object[i16];
            objArr4[z3 ? 1 : 0] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj6 = map2.get(108358357);
            if (obj6 != null) {
                obj = obj6;
            } else {
                Method method3 = ((Class) removeParam.initialize(54 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39911), TextUtils.indexOf("", "", 0) + 7059)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, method3);
                obj = method3;
            }
            ((Method) obj).invoke(null, objArr4);
            $11 = ($10 + 41) % 128;
            i4 = i16;
            cArr3 = cArr7;
            cArr5 = cArr8;
            i6 = 0;
        }
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        bv bvVar = (bv) objArr[0];
        bvVar.getSDKInfo = new ScrollView(bvVar.ThreeDS2ServiceInstance);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        bvVar.getSDKInfo.setFillViewport(true);
        bvVar.getSDKInfo.setLayoutParams(layoutParams);
        ScrollView scrollView = bvVar.getSDKInfo;
        Object[] objArr2 = new Object[1];
        a("愲朶㐟耔訛\udd3a䙰牸쾪\uf7f9\uf675\ue53c娼髻⻟䄌\ue6a6͏ݍ撱", 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        bvVar.ThreeDS2ServiceInstance(scrollView, ((String) objArr2[0]).intern());
        ViewGroup bl_ = bvVar.bl_(bvVar.ThreeDS2ServiceInstance);
        bvVar.getSDKVersion = bl_;
        bvVar.getSDKInfo.addView(bl_);
        bvVar.getWarnings(bvVar.ThreeDS2ServiceInstance);
        int i = addParam + 79;
        onError = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public void ThreeDS2Service(compute computeVar, setScroller setscroller) {
        if (this.getSDKInfo == null) {
            int i = addParam + 3;
            onError = i % 128;
            if (i % 2 != 0) {
                ThreeDS2ServiceInstance(new Object[]{this}, -545977512, 545977512, System.identityHashCode(this));
                throw null;
            }
            ThreeDS2ServiceInstance(new Object[]{this}, -545977512, 545977512, System.identityHashCode(this));
            onError = (addParam + 11) % 128;
        }
        this.get.get(computeVar);
        Iterator<writeReplace> it = this.initialize.iterator();
        while (it.hasNext()) {
            it.next().ThreeDS2Service(setscroller);
        }
        addParam = (onError + 25) % 128;
    }

    public abstract ViewGroup bl_(Context context);

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public void get(eq eqVar) {
        int i = addParam + 121;
        onError = i % 128;
        int i2 = i % 2;
        List<writeReplace> list = this.initialize;
        if (i2 != 0) {
            list.iterator();
            throw null;
        }
        for (writeReplace writereplace : list) {
            if (writereplace instanceof containsValue) {
                addParam = (onError + 83) % 128;
                ((containsValue) writereplace).getWarnings(eqVar);
            }
            onError = (addParam + 121) % 128;
        }
        int i3 = addParam + 79;
        onError = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.computeIfPresent
    public replace getWarnings(replace replaceVar) {
        onError = (addParam + 83) % 128;
        Iterator<computeIfPresent> it = this.getWarnings.iterator();
        while (it.hasNext()) {
            replaceVar = it.next().getWarnings(replaceVar);
        }
        int i = onError + 85;
        addParam = i % 128;
        if (i % 2 != 0) {
            return replaceVar;
        }
        throw null;
    }

    public abstract void getWarnings(Context context);

    public final void getWarnings(writeReplace writereplace) {
        onError = (addParam + 49) % 128;
        this.getSDKVersion.addView(writereplace.ThreeDS2Service());
        this.initialize.add(writereplace);
        onError = (addParam + 67) % 128;
    }

    public final void getWarnings(computeIfPresent computeifpresent) {
        onError = (addParam + 55) % 128;
        this.getWarnings.add(computeifpresent);
        onError = (addParam + 19) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public void get(keys keysVar) {
        int i = addParam + 49;
        onError = i % 128;
        int i2 = i % 2;
        List<writeReplace> list = this.initialize;
        if (i2 != 0) {
            list.iterator();
            throw null;
        }
        for (writeReplace writereplace : list) {
            if (writereplace instanceof elements) {
                ((elements) writereplace).getWarnings(keysVar);
            }
            onError = (addParam + 79) % 128;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public void ThreeDS2Service() {
        int i = addParam + 111;
        onError = i % 128;
        int i2 = i % 2;
        List<writeReplace> list = this.initialize;
        if (i2 != 0) {
            list.iterator();
            throw null;
        }
        for (writeReplace writereplace : list) {
            if (writereplace instanceof elements) {
                int i3 = onError + 57;
                addParam = i3 % 128;
                if (i3 % 2 != 0) {
                    ((elements) writereplace).getWarnings();
                    addParam = (onError + 17) % 128;
                } else {
                    ((elements) writereplace).getWarnings();
                    throw null;
                }
            }
        }
    }

    public final void ThreeDS2Service(replace replaceVar) {
        int i = addParam + 43;
        onError = i % 128;
        int i2 = i % 2;
        dv dvVar = this.get;
        if (i2 != 0) {
            dvVar.ThreeDS2Service(replaceVar);
            int i3 = 63 / 0;
        } else {
            dvVar.ThreeDS2Service(replaceVar);
        }
        int i4 = addParam + 95;
        onError = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public void ThreeDS2ServiceInstance(er erVar) {
        onError = (addParam + 113) % 128;
        for (writeReplace writereplace : this.initialize) {
            if (writereplace instanceof containsValue) {
                onError = (addParam + 105) % 128;
                ((containsValue) writereplace).getWarnings(erVar);
            }
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.remove
    public final View ThreeDS2ServiceInstance() {
        if (this.getSDKInfo == null) {
            onError = (addParam + 17) % 128;
            ThreeDS2ServiceInstance(new Object[]{this}, -545977512, 545977512, System.identityHashCode(this));
        }
        ScrollView scrollView = this.getSDKInfo;
        onError = (addParam + 11) % 128;
        return scrollView;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }
}
