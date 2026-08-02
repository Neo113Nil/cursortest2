package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.getClass;
import com.netcetera.threeds.sdk.infrastructure.setTitle;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class jd implements jh, setSubtitle<setMarqueeRepeatLimit, nq> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char ThreeDS2Service = 13283;
    private static char ThreeDS2ServiceInitializationCallback = 32476;
    private static int cleanup = 0;
    private static char get = 14665;
    private static int getSDKVersion = 1;
    private static char initialize = 2631;
    private final jb ThreeDS2ServiceInstance;
    private setTitleMarginStart.get getWarnings = setTitleMarginStart.get.ThreeDS2Service;

    public jd(jb jbVar) {
        this.ThreeDS2ServiceInstance = jbVar;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 41) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr3 = new char[cArr2.length];
        int i2 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i3 = 2;
        char[] cArr4 = new char[2];
        while (true) {
            int i4 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i4 >= cArr2.length) {
                objArr[0] = new String(cArr3, 0, i);
                return;
            }
            cArr4[i2] = cArr2[i4];
            char c = 1;
            cArr4[1] = cArr2[i4 + 1];
            int i5 = 58224;
            int i6 = i2;
            while (i6 < 16) {
                $11 = ($10 + 75) % 128;
                char c2 = cArr4[c];
                char c3 = cArr4[i2];
                char c4 = c;
                int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (get ^ (-1730380012335540218L))));
                int i8 = c3 >>> 5;
                int i9 = i3;
                int i10 = i2;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ThreeDS2ServiceInitializationCallback);
                    objArr2[i9] = Integer.valueOf(i8);
                    objArr2[c4] = Integer.valueOf(i7);
                    objArr2[i10] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj == null) {
                        obj = ((Class) removeParam.initialize(68 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 62395), 5352 - (ExpandableListView.getPackedPositionForGroup(i10) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i10) == 0L ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[c4] = charValue;
                    char c5 = cArr4[i10];
                    char[] cArr5 = cArr2;
                    int i11 = (charValue + i5) ^ ((charValue << 4) + ((char) (ThreeDS2Service ^ (-1730380012335540218L))));
                    int i12 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(initialize);
                    objArr3[i9] = Integer.valueOf(i12);
                    objArr3[c4] = Integer.valueOf(i11);
                    objArr3[i10] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 67, (char) ((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62396), 5352 - Drawable.resolveOpacity(i10, i10))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr4[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    c = c4;
                    i3 = i9;
                    cArr2 = cArr5;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr6 = cArr2;
            int i13 = i3;
            char c6 = c;
            int i14 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr3[i14] = cArr4[0];
            cArr3[i14 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[i13];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(55 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 39910), 7059 - View.resolveSizeAndState(0, 0, 0))).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            $11 = ($10 + 93) % 128;
            i3 = i13;
            cArr2 = cArr6;
            i2 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
    
        if (r3.equals(r7) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setMarqueeRepeatLimit ThreeDS2Service(nq nqVar) {
        Object[] objArr = new Object[1];
        a("蘭隿য়⊮轆讇岤씵য়⊮髓虨Ṯ차轆讇蝆颳ꔂ삉", (ViewConfiguration.getTouchSlop() >> 8) + 20, objArr);
        Boolean sDKInfo = nqVar.getSDKInfo(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("刉茐聚\uf670", View.MeasureSpec.getSize(0) + 4, objArr2);
        String initialize2 = nqVar.initialize(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("眿䲅", 2 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        String initialize3 = nqVar.initialize(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        a("䯕ڇ杵蚺", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, objArr4);
        String initialize4 = nqVar.initialize(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a("餄쒅ꯖꍦꯖꍦ瘎⩇⊷\u1afa㨢\ueef6\uf5bb\u1a8f", 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr5);
        if (!((String) objArr5[0]).intern().equalsIgnoreCase(initialize3)) {
            return new setTitleMargin(sDKInfo, initialize2, initialize3, initialize4);
        }
        setTitleMarginStart settitlemarginstart = new setTitleMarginStart(sDKInfo, initialize2, initialize4);
        if (oj.initialize(initialize2)) {
            int i = getSDKVersion + 111;
            cleanup = i % 128;
            if (i % 2 != 0) {
                setTitleMarginStart.get.getWarnings(((nq) nq.ThreeDS2Service(new Object[]{initialize2}, -639806015, 639806015, (int) System.currentTimeMillis())).initialize(getClass.ThreeDS2ServiceInstance.createTransaction)).equals(setTitleMarginStart.get.ThreeDS2Service);
                throw null;
            }
            nq nqVar2 = (nq) nq.ThreeDS2Service(new Object[]{initialize2}, -639806015, 639806015, (int) System.currentTimeMillis());
            setTitleMarginStart.get warnings = setTitleMarginStart.get.getWarnings(nqVar2.initialize(getClass.ThreeDS2ServiceInstance.createTransaction));
            setTitleMarginStart.get getVar = setTitleMarginStart.get.ThreeDS2Service;
            if (!warnings.equals(getVar)) {
                int i2 = getSDKVersion + 25;
                cleanup = i2 % 128;
                int i3 = i2 % 2;
                setTitleMarginStart.get getVar2 = this.getWarnings;
                if (i3 != 0) {
                    warnings.equals(getVar2);
                    throw null;
                }
            }
            this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
            getSDKVersion = (cleanup + 75) % 128;
            if (!warnings.equals(getVar) && warnings.equals(this.getWarnings)) {
                Object[] objArr6 = new Object[1];
                a("ॗ谩岤씵㱗櫮\uee34\ue25d楟宄蝆颳蔕噓", 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr6);
                nq sDKVersion = nqVar2.getSDKVersion(((String) objArr6[0]).intern());
                setTitleMarginStart.getWarnings getwarnings = new setTitleMarginStart.getWarnings();
                Object[] objArr7 = new Object[1];
                a("⻑ቒ櫚유ᾞ繋\ud86d阀꒢硓藃Է", 11 - TextUtils.indexOf("", "", 0), objArr7);
                getwarnings.initialize(sDKVersion.initialize(((String) objArr7[0]).intern()));
                Object[] objArr8 = new Object[1];
                a("⻑ቒ櫚유ᾞ繋缇뱘츓ꆥ", 8 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr8);
                getwarnings.ThreeDS2ServiceInstance(sDKVersion.initialize(((String) objArr8[0]).intern()));
                Object[] objArr9 = new Object[1];
                a("ॗ谩岤씵㱗櫮\uee34\ue25d楟宄蝆颳册瑎㧼誱≣펟\ueec1\ue579ꗩṝ\uf590벱䫝뤓", 25 - (ViewConfiguration.getTouchSlop() >> 8), objArr9);
                getwarnings.ThreeDS2ServiceInstance((printStackTrace) sDKVersion.ThreeDS2Service(((String) objArr9[0]).intern(), printStackTrace.class));
                settitlemarginstart.ThreeDS2ServiceInstance(getwarnings);
                settitlemarginstart.initialize(warnings);
                return settitlemarginstart;
            }
        }
        return settitlemarginstart;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitle
    public /* synthetic */ setMarqueeRepeatLimit ThreeDS2ServiceInstance(nq nqVar) {
        getSDKVersion = (cleanup + 67) % 128;
        setMarqueeRepeatLimit ThreeDS2Service2 = ThreeDS2Service(nqVar);
        getSDKVersion = (cleanup + 91) % 128;
        return ThreeDS2Service2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0006 A[SYNTHETIC] */
    @Override // com.netcetera.threeds.sdk.infrastructure.jh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance, put putVar, List<setMarqueeRepeatLimit> list) {
        setMarqueeRepeatLimit next;
        if (list != null) {
            Iterator<setMarqueeRepeatLimit> it = list.iterator();
            while (it.hasNext()) {
                int i = getSDKVersion + 55;
                cleanup = i % 128;
                if (i % 2 != 0) {
                    next = it.next();
                    int i2 = 90 / 0;
                    if (!put.get.equals(putVar)) {
                        continue;
                    } else if (next instanceof setTitleMarginStart) {
                        continue;
                    } else {
                        cleanup = (getSDKVersion + 25) % 128;
                        setTitleMarginStart settitlemarginstart = (setTitleMarginStart) next;
                        if (settitlemarginstart.getSDKInfo() != null) {
                            getSDKVersion = (cleanup + 15) % 128;
                            if (!settitlemarginstart.getSDKInfo().equals(setTitleMarginStart.get.ThreeDS2Service) && settitlemarginstart.getSDKInfo().equals(this.getWarnings)) {
                                threeDS2ServiceInstance.createTransaction(settitlemarginstart.ThreeDS2Service().getWarnings());
                                threeDS2ServiceInstance.getSDKVersion(settitlemarginstart.ThreeDS2Service().ThreeDS2Service());
                                threeDS2ServiceInstance.getWarnings(settitlemarginstart.ThreeDS2Service().cleanup());
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                } else {
                    next = it.next();
                    if (!put.get.equals(putVar)) {
                        continue;
                    } else if (next instanceof setTitleMarginStart) {
                    }
                }
            }
        }
    }

    public void initialize(setTitleMarginStart.get getVar) {
        int i = (cleanup + 71) % 128;
        getSDKVersion = i;
        this.getWarnings = getVar;
        int i2 = i + 111;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jh
    public List<setMarqueeRepeatLimit> ThreeDS2Service(ns nsVar) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < nsVar.getWarnings()) {
            arrayList.add(ThreeDS2Service((nq) nq.ThreeDS2Service(new Object[]{nsVar.getWarnings(i)}, -639806015, 639806015, (int) System.currentTimeMillis())));
            i++;
            getSDKVersion = (cleanup + 37) % 128;
        }
        int i2 = cleanup + 59;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }
}
