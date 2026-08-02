package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public class findFragmentById {
    private static int ThreeDS2ServiceInstance = 0;
    private static int get = 1;
    private final Map<setTextAlignment, List<computeValue>> initialize = new HashMap();

    private findFragmentById() {
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        computeValue computevalue;
        List<computeValue> list;
        computeValue[] computevalueArr = (computeValue[]) objArr[0];
        findFragmentById findfragmentbyid = new findFragmentById();
        int length = computevalueArr.length;
        int i = get;
        int i2 = i & 37;
        int i3 = (i | 37) & (~i2);
        int i4 = i2 << 1;
        ThreeDS2ServiceInstance = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        int i5 = 0;
        while (i5 < length) {
            int i6 = get;
            int i7 = (i6 ^ 93) + ((i6 & 93) << 1);
            ThreeDS2ServiceInstance = i7 % 128;
            if (i7 % 2 != 0) {
                computevalue = computevalueArr[i5];
                list = findfragmentbyid.initialize.get(computevalue.ThreeDS2ServiceInstance());
                int i8 = 82 / 0;
                if (list != null) {
                    list.add(computevalue);
                    findfragmentbyid.initialize.put(computevalue.ThreeDS2ServiceInstance(), list);
                    int i9 = (i5 & 2) + (i5 | 2);
                    i5 = (i9 ^ (-1)) + (i9 << 1);
                    int i10 = get;
                    int i11 = i10 | 77;
                    int i12 = i11 << 1;
                    int i13 = -((~(i10 & 77)) & i11);
                    ThreeDS2ServiceInstance = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                }
                list = new ArrayList<>();
                int i14 = ThreeDS2ServiceInstance;
                get = ((((i14 ^ 83) | (i14 & 83)) << 1) - (((~i14) & 83) | (i14 & (-84)))) % 128;
                list.add(computevalue);
                findfragmentbyid.initialize.put(computevalue.ThreeDS2ServiceInstance(), list);
                int i92 = (i5 & 2) + (i5 | 2);
                i5 = (i92 ^ (-1)) + (i92 << 1);
                int i102 = get;
                int i112 = i102 | 77;
                int i122 = i112 << 1;
                int i132 = -((~(i102 & 77)) & i112);
                ThreeDS2ServiceInstance = (((i122 | i132) << 1) - (i132 ^ i122)) % 128;
            } else {
                computevalue = computevalueArr[i5];
                list = findfragmentbyid.initialize.get(computevalue.ThreeDS2ServiceInstance());
                if (list != null) {
                    list.add(computevalue);
                    findfragmentbyid.initialize.put(computevalue.ThreeDS2ServiceInstance(), list);
                    int i922 = (i5 & 2) + (i5 | 2);
                    i5 = (i922 ^ (-1)) + (i922 << 1);
                    int i1022 = get;
                    int i1122 = i1022 | 77;
                    int i1222 = i1122 << 1;
                    int i1322 = -((~(i1022 & 77)) & i1122);
                    ThreeDS2ServiceInstance = (((i1222 | i1322) << 1) - (i1322 ^ i1222)) % 128;
                }
                list = new ArrayList<>();
                int i142 = ThreeDS2ServiceInstance;
                get = ((((i142 ^ 83) | (i142 & 83)) << 1) - (((~i142) & 83) | (i142 & (-84)))) % 128;
                list.add(computevalue);
                findfragmentbyid.initialize.put(computevalue.ThreeDS2ServiceInstance(), list);
                int i9222 = (i5 & 2) + (i5 | 2);
                i5 = (i9222 ^ (-1)) + (i9222 << 1);
                int i10222 = get;
                int i11222 = i10222 | 77;
                int i12222 = i11222 << 1;
                int i13222 = -((~(i10222 & 77)) & i11222);
                ThreeDS2ServiceInstance = (((i12222 | i13222) << 1) - (i13222 ^ i12222)) % 128;
            }
        }
        int i15 = ThreeDS2ServiceInstance;
        get = Thread$State$EnumUnboxingLocalUtility.m(i15 ^ 6, (i15 & 6) << 1, 1, 128);
        return findfragmentbyid;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        ((Number) objArr[0]).longValue();
        ((Number) objArr[1]).longValue();
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 101;
        get = (i2 + ((i ^ 101) | i2)) % 128;
        try {
            Object[] objArr2 = {((Class) removeParam.initialize(78 - TextUtils.getOffsetBefore("", 0), (char) (10195 - KeyEvent.getDeadChar(0, 0)), 7936 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getField("getWarnings").get(null), Boolean.TRUE};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1643948346);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(77 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (59653 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 7711 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("get", (Class) removeParam.initialize(78 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((Process.myTid() >> 22) + 10195), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7934), Boolean.TYPE);
                map.put(-1643948346, obj);
            }
            ((Method) obj).invoke(null, objArr2);
            int i3 = get;
            int i4 = i3 & 35;
            int i5 = (((i3 | 35) & (~i4)) - (~(-(-(i4 << 1))))) - 1;
            ThreeDS2ServiceInstance = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 78 / 0;
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = (((~(i | i3)) | (~i2)) * 529) + (((~((~i3) | i)) | (~(i | i2))) * 529) + (i2 * 530) + (i * 530) + IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO;
        return i4 != 1 ? i4 != 2 ? ThreeDS2Service(objArr) : initialize(objArr) : ThreeDS2ServiceInstance(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        r6.addAll(r5);
        r9.initialize.put(r3, r6);
        r3 = com.netcetera.threeds.sdk.infrastructure.findFragmentById.get;
        com.netcetera.threeds.sdk.infrastructure.findFragmentById.ThreeDS2ServiceInstance = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r3 ^ 24, (r3 & 24) << 1, 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r6 = new java.util.ArrayList<>();
        r7 = com.netcetera.threeds.sdk.infrastructure.findFragmentById.ThreeDS2ServiceInstance + 98;
        com.netcetera.threeds.sdk.infrastructure.findFragmentById.get = ((r7 ^ (-1)) + (r7 << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public findFragmentById get(findFragmentById findfragmentbyid) {
        setTextAlignment next;
        List<computeValue> list;
        List<computeValue> list2;
        int i = ThreeDS2ServiceInstance;
        int i2 = (((i ^ 99) | (i & 99)) << 1) - (((~i) & 99) | (i & (-100)));
        get = i2 % 128;
        if (i2 % 2 == 0) {
            findfragmentbyid.ThreeDS2ServiceInstance().keySet().iterator();
            throw null;
        }
        Map<setTextAlignment, List<computeValue>> ThreeDS2ServiceInstance2 = findfragmentbyid.ThreeDS2ServiceInstance();
        Iterator<setTextAlignment> it = ThreeDS2ServiceInstance2.keySet().iterator();
        int i3 = get;
        int i4 = i3 & 13;
        ThreeDS2ServiceInstance = (((i3 | 13) & (~i4)) + (i4 << 1)) % 128;
        while (it.hasNext()) {
            int i5 = ThreeDS2ServiceInstance;
            int i6 = (i5 & 99) + (i5 | 99);
            get = i6 % 128;
            if (i6 % 2 == 0) {
                next = it.next();
                list = ThreeDS2ServiceInstance2.get(next);
                int i7 = 8 / 0;
                if (list == null) {
                    int i8 = get;
                    ThreeDS2ServiceInstance = ((i8 ^ 9) + ((i8 & 9) << 1)) % 128;
                }
                if (list.size() <= 0) {
                    int i9 = get;
                    int i10 = (-2) - ((((i9 | 86) << 1) - (i9 ^ 86)) ^ (-1));
                    ThreeDS2ServiceInstance = i10 % 128;
                    int i11 = i10 % 2;
                    Map<setTextAlignment, List<computeValue>> map = this.initialize;
                    if (i11 != 0) {
                        list2 = map.get(next);
                        int i12 = 13 / 0;
                    } else {
                        list2 = map.get(next);
                    }
                }
                int i82 = get;
                ThreeDS2ServiceInstance = ((i82 ^ 9) + ((i82 & 9) << 1)) % 128;
            } else {
                next = it.next();
                list = ThreeDS2ServiceInstance2.get(next);
                if (list == null) {
                    int i822 = get;
                    ThreeDS2ServiceInstance = ((i822 ^ 9) + ((i822 & 9) << 1)) % 128;
                }
                if (list.size() <= 0) {
                }
                int i8222 = get;
                ThreeDS2ServiceInstance = ((i8222 ^ 9) + ((i8222 & 9) << 1)) % 128;
            }
        }
        int i13 = ThreeDS2ServiceInstance;
        int i14 = (((i13 ^ 81) | (i13 & 81)) << 1) - (((~i13) & 81) | (i13 & (-82)));
        get = i14 % 128;
        if (i14 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        findFragmentById findfragmentbyid = new findFragmentById();
        int i = get;
        int i2 = i | 121;
        int i3 = (i2 << 1) - ((~(i & 121)) & i2);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return findfragmentbyid;
    }

    public static findFragmentById initialize() {
        return (findFragmentById) initialize(new Object[0], -2096046705, 2096046707, (int) System.currentTimeMillis());
    }

    public static void ThreeDS2Service(long j, long j2) {
        initialize(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, -1619776702, 1619776703, (int) System.currentTimeMillis());
    }

    public static findFragmentById ThreeDS2Service(computeValue... computevalueArr) {
        return (findFragmentById) initialize(new Object[]{computevalueArr}, 695740153, -695740153, (int) System.currentTimeMillis());
    }

    public Map<setTextAlignment, List<computeValue>> ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = ((-2) - (((i & 16) + (i | 16)) ^ (-1))) % 128;
        ThreeDS2ServiceInstance = i2;
        Map<setTextAlignment, List<computeValue>> map = this.initialize;
        int i3 = (i2 & (-44)) | ((~i2) & 43);
        int i4 = (i2 & 43) << 1;
        get = ((i3 & i4) + (i4 | i3)) % 128;
        return map;
    }

    public boolean get() {
        get = (ThreeDS2ServiceInstance + 93) % 128;
        boolean isEmpty = this.initialize.isEmpty();
        int i = get;
        int i2 = i & 125;
        ThreeDS2ServiceInstance = ((((i ^ 125) | i2) << 1) - ((i | 125) & (~i2))) % 128;
        return isEmpty;
    }
}
