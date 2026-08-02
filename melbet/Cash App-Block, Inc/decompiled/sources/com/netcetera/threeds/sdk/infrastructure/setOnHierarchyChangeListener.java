package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import com.netcetera.threeds.sdk.infrastructure.setLayerPaint;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setOnHierarchyChangeListener {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private Date ThreeDS2Service;
    private final completed getWarnings;
    private final Object initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setOnHierarchyChangeListener$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] getWarnings;
        private static int initialize;

        static {
            int[] iArr = new int[CertificateInfo.CertificateType.values().length];
            getWarnings = iArr;
            try {
                iArr[CertificateInfo.CertificateType.CERTIFICATE.ordinal()] = 1;
                int i = ThreeDS2Service;
                int i2 = i & 21;
                initialize = ((((i ^ 21) | i2) << 1) - ((i | 21) & (~i2))) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getWarnings[CertificateInfo.CertificateType.PUBLIC_KEY.ordinal()] = 2;
                System.currentTimeMillis();
                System.currentTimeMillis();
            } catch (NoSuchFieldError unused2) {
            }
            int i3 = ThreeDS2Service;
            int i4 = i3 & 77;
            initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i4, ~((i3 ^ 77) | i4), 1, 128);
        }
    }

    public setOnHierarchyChangeListener(completed completedVar, Object obj) {
        this.getWarnings = completedVar;
        this.initialize = obj;
    }

    public static setOnHierarchyChangeListener ThreeDS2ServiceInstance() {
        return (setOnHierarchyChangeListener) getWarnings(new Object[0], -854508501, 854508501, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        completed ThreeDS2ServiceInstance2 = setPointerIcon.ThreeDS2ServiceInstance();
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(970287529);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(65 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.alpha(0), 4696 - TextUtils.indexOf("", "", 0, 0))).getMethod("initialize", null);
                map.put(970287529, obj);
            }
            setOnHierarchyChangeListener setonhierarchychangelistener = new setOnHierarchyChangeListener(ThreeDS2ServiceInstance2, ((Method) obj).invoke(null, null));
            int i = get + 85;
            ThreeDS2ServiceInstance = i % 128;
            if (i % 2 == 0) {
                int i2 = 13 / 0;
            }
            return setonhierarchychangelistener;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void getWarnings(Date date) {
        this.ThreeDS2Service = new Date(date.getTime());
        int i = get;
        int i2 = ((i & 46) + (i | 46)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public com.netcetera.threeds.sdk.api.info.SDKInfo initialize(List<setLayerType> list) {
        CertificateInfo setalwaysdrawnwithcacheenabled;
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = get;
        int i4 = 1;
        int i5 = 128;
        ThreeDS2ServiceInstance = ((-2) - (((i3 ^ 116) + ((i3 & 116) << 1)) ^ (-1))) % 128;
        for (setLayerType setlayertype : list) {
            ArrayList arrayList2 = new ArrayList();
            int i6 = ThreeDS2ServiceInstance;
            get = ((((i6 | 110) << i4) - (i6 ^ 110)) - 1) % i5;
            for (String str : setlayertype.getSDKInfo().get()) {
                int i7 = ThreeDS2ServiceInstance;
                int i8 = ((i7 ^ 9) | (i7 & 9)) << i4;
                int i9 = -(((~i7) & 9) | (i7 & (-10)));
                get = (((i8 | i9) << i4) - (i9 ^ i8)) % i5;
                if (AnonymousClass5.getWarnings[this.getWarnings.get(str).ordinal()] != i4) {
                    arrayList2.add(new setAddStatesFromChildren(str));
                    ThreeDS2ServiceInstance = (get + 87) % i5;
                    i2 = i4;
                } else {
                    Object obj = this.initialize;
                    try {
                        Object[] objArr = {str};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj2 = map.get(881042655);
                        if (obj2 != null) {
                            i = i4;
                        } else {
                            i = i4;
                            Method method = ((Class) removeParam.initialize(66 - Gravity.getAbsoluteGravity(0, 0), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 4696 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("initialize", String.class);
                            map.put(881042655, method);
                            obj2 = method;
                        }
                        arrayList2.add(new setAlwaysDrawnWithCacheEnabled((X509Certificate) ((Method) obj2).invoke(obj, objArr)));
                        int i10 = get;
                        i2 = i;
                        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i10 ^ 53, ~(-(-((i10 & 53) << 1))), i2, 128);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i11 = ThreeDS2ServiceInstance;
                int i12 = (i11 & (-118)) | ((~i11) & 117);
                int i13 = (i11 & 117) << i2;
                get = ((i12 & i13) + (i13 | i12)) % 128;
                i5 = 128;
                i4 = 1;
            }
            setLayerPaint.ThreeDS2ServiceInstance warnings = setlayertype.getSDKVersion().getWarnings();
            String ThreeDS2Service = warnings.ThreeDS2Service();
            if (AnonymousClass5.getWarnings[this.getWarnings.get(ThreeDS2Service).ordinal()] != 1) {
                setalwaysdrawnwithcacheenabled = new setAddStatesFromChildren(ThreeDS2Service);
                int i14 = get;
                int i15 = i14 & 61;
                int i16 = ((i14 ^ 61) | i15) << 1;
                int i17 = -((i14 | 61) & (~i15));
                ThreeDS2ServiceInstance = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
            } else {
                Object obj3 = this.initialize;
                Object[] objArr2 = {ThreeDS2Service};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(881042655);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(Color.red(0) + 66, (char) (Process.getGidForName("") + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4696)).getMethod("initialize", String.class);
                    map2.put(881042655, obj4);
                }
                setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled((X509Certificate) ((Method) obj4).invoke(obj3, objArr2));
                int i18 = ThreeDS2ServiceInstance;
                int i19 = i18 & 93;
                int i20 = (i18 ^ 93) | i19;
                get = ((i19 & i20) + (i20 | i19)) % 128;
            }
            arrayList.add(new setPersistentDrawingCache(arrayList2, setalwaysdrawnwithcacheenabled, warnings.get(), setlayertype.initialize().get(), new ArrayList(setlayertype.ThreeDS2Service().getWarnings())));
            int i21 = ThreeDS2ServiceInstance;
            int i22 = i21 ^ 9;
            get = ((((i21 & 9) | i22) << 1) - i22) % 128;
            i5 = 128;
            i4 = 1;
        }
        setLayoutMode setlayoutmode = new setLayoutMode(arrayList, this.ThreeDS2Service);
        int i23 = ThreeDS2ServiceInstance;
        get = Thread$State$EnumUnboxingLocalUtility.m(i23 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (i23 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1, 1, 128);
        return setlayoutmode;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    public void initialize() {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i ^ 35) | (i & 35)) << 1;
        int i3 = -(((~i) & 35) | (i & (-36)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            this.ThreeDS2Service = null;
        } else {
            this.ThreeDS2Service = null;
            throw null;
        }
    }
}
