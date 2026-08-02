package defpackage;

import android.text.Layout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.proto.message.CustomStatusMessage;
import com.yandex.messaging.core.net.entities.proto.message.LocalizationEntry;
import com.yandex.messaging.core.net.entities.proto.message.UserStatusMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final /* synthetic */ class sa6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ sa6(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.a = 4;
        this.b = j;
        this.c = fArr;
        this.w = ref$IntRef;
        this.x = ref$FloatRef;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int x;
        long j;
        int i;
        boolean z;
        float a;
        float a2;
        LinkedHashMap linkedHashMap;
        LocalizationEntry[] localizations;
        CustomStatusMessage customStatus;
        int i2 = this.a;
        int i3 = 3;
        long j2 = this.b;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                zii0 zii0Var = (zii0) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                long j3 = this.b;
                wec wecVar = (wec) obj2;
                c1y c1yVar = (c1y) obj;
                c1yVar.a();
                float f = zii0Var.a;
                float f2 = zii0Var.b;
                k28 k28Var = c1yVar.a;
                ((cot) k28Var.b.a).n(f, f2);
                try {
                    qam.S(c1yVar, (l8v) ref$ObjectRef.element, j3, 0L, 0L, 0.0f, wecVar, 0, 890);
                    return zy11Var;
                } finally {
                    ((cot) k28Var.b.a).n(-f, -f2);
                }
            case 1:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("UPDATE local_contacts SET locals_display_name=?, locals_phone=?, locals_last_time_contacted=?, locals_deleted=0, locals_dirty=1 WHERE locals_upload_id=?");
                try {
                    if (str == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str);
                    }
                    T0.g1(2, str2);
                    T0.b(3, j2);
                    T0.g1(4, str3);
                    T0.q();
                    x = jx81.x(oll0Var);
                    T0.close();
                    break;
                } catch (Throwable th) {
                    throw th;
                }
            case 2:
                wh10.e((wh10) obj4, j2, (String[]) obj3, (long[]) obj2);
                return zy11Var;
            case 3:
                SnapshotStateList<yyz0> snapshotStateList = (SnapshotStateList) obj3;
                l8v l8vVar = (l8v) obj2;
                qam qamVar = (qam) obj;
                long intBitsToFloat = (((int) Float.intBitsToFloat((int) (qamVar.c() >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                qam.S(qamVar, (l8v) obj4, 0L, 0L, intBitsToFloat, 0.0f, null, 0, 1006);
                i28 q = qamVar.N().q();
                q.s(wwg.b(0L, qamVar.c()), new eb2());
                for (yyz0 yyz0Var : snapshotStateList) {
                    float c = y6i0.c((System.currentTimeMillis() - yyz0Var.c) / j2, 0.0f, 1.0f);
                    float f3 = 1.0f - c;
                    if (f3 > 0.01f) {
                        float b = x4e.b(c, 0.2f, 1.0f, 150.0f);
                        qamVar.r(new l5i0(scc.g(new ldc(ldc.b(yyz0Var.b, f3, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.b(yyz0Var.b, f3 * 0.5f, 0.0f, 0.0f, 0.0f, 14)), new ldc(ldc.l)), null, yyz0Var.a, b, 0), yyz0Var.a, b);
                    }
                }
                qam.S(qamVar, l8vVar, 0L, 0L, intBitsToFloat, 0.0f, null, 0, 750);
                q.n();
                return zy11Var;
            case 4:
                float[] fArr = (float[]) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                cc90 cc90Var = (cc90) obj;
                int i4 = cc90Var.b;
                gb2 gb2Var = cc90Var.a;
                int i5 = cc90Var.c;
                int f4 = i4 > asy0.f(j2) ? cc90Var.b : asy0.f(j2);
                if (i5 >= asy0.e(j2)) {
                    i5 = asy0.e(j2);
                }
                long c2 = eja1.c(cc90Var.d(f4), cc90Var.d(i5));
                int i6 = ref$IntRef.element;
                zqy0 zqy0Var = gb2Var.d;
                int f5 = asy0.f(c2);
                int e = asy0.e(c2);
                Layout layout = zqy0Var.f;
                int length = layout.getText().length();
                if (f5 < 0) {
                    jxv.a("startOffset must be > 0");
                }
                if (f5 >= length) {
                    jxv.a("startOffset must be less than text length");
                }
                if (e <= f5) {
                    jxv.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    jxv.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i6 < (e - f5) * 4) {
                    jxv.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f5);
                int lineForOffset2 = layout.getLineForOffset(e - 1);
                xqu xquVar = new xqu(zqy0Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = c2;
                        int f6 = zqy0Var.f(lineForOffset);
                        int max = Math.max(f5, lineStart);
                        int min = Math.min(e, f6);
                        float g = zqy0Var.g(lineForOffset);
                        float e2 = zqy0Var.e(lineForOffset);
                        boolean z2 = true;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i7 = i6;
                        int i8 = max;
                        while (i8 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i8);
                            if (!z3 || isRtlCharAt) {
                                i = min;
                                if (z3 && isRtlCharAt) {
                                    float a3 = xquVar.a(i8, false, false, false);
                                    z = z3;
                                    a = xquVar.a(i8 + 1, z2, z2, false);
                                    a2 = a3;
                                } else {
                                    z = z3;
                                    if (z || !isRtlCharAt) {
                                        a = xquVar.a(i8, false, false, false);
                                        a2 = xquVar.a(i8 + 1, z2, z2, false);
                                    } else {
                                        a2 = xquVar.a(i8, false, false, z2);
                                        a = xquVar.a(i8 + 1, z2, z2, z2);
                                    }
                                }
                                fArr[i7] = a;
                                fArr[i7 + 1] = g;
                                fArr[i7 + 2] = a2;
                                fArr[i7 + 3] = e2;
                                i7 += 4;
                                i8++;
                                min = i;
                                z3 = z;
                                z2 = true;
                            } else {
                                i = min;
                                a = xquVar.a(i8, false, false, z2);
                                z = z3;
                                a2 = xquVar.a(i8 + 1, z2, z2, z2);
                            }
                            fArr[i7] = a;
                            fArr[i7 + 1] = g;
                            fArr[i7 + 2] = a2;
                            fArr[i7 + 3] = e2;
                            i7 += 4;
                            i8++;
                            min = i;
                            z3 = z;
                            z2 = true;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            c2 = j;
                            i6 = i7;
                        }
                    }
                } else {
                    j = c2;
                }
                int d = (asy0.d(j) * 4) + ref$IntRef.element;
                for (int i9 = ref$IntRef.element; i9 < d; i9 += 4) {
                    int i10 = i9 + 1;
                    float f7 = fArr[i10];
                    float f8 = ref$FloatRef.element;
                    fArr[i10] = f7 + f8;
                    int i11 = i9 + 3;
                    fArr[i11] = fArr[i11] + f8;
                }
                ref$IntRef.element = d;
                ref$FloatRef.element = gb2Var.b() + ref$FloatRef.element;
                return zy11Var;
            case 5:
                String str4 = (String) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0((String) obj4);
                try {
                    T0.b(1, j2);
                    T0.g1(2, str4);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        T0.g1(i3, (String) it.next());
                        i3++;
                    }
                    T0.q();
                    x = jx81.x(oll0Var2);
                    T0.close();
                    break;
                } finally {
                    T0.close();
                }
            case 6:
                kku0.m((kku0) obj4, (String) obj3, (ArrayList) obj2, j2);
                return zy11Var;
            default:
                yt21 yt21Var = (yt21) obj4;
                String str5 = (String) obj3;
                UserStatusMessage userStatusMessage = (UserStatusMessage) obj2;
                l020 l020Var = (l020) obj;
                ot21 ot21Var = yt21Var.h;
                xt21 xt21Var = yt21Var.e;
                ut21 ut21Var = yt21Var.b;
                st21 a4 = ot21Var.a(str5);
                long j4 = a4 != null ? a4.c : -1L;
                long j5 = this.b;
                if (j5 > j4) {
                    String iconName = (!((t9u0) yt21Var.g.get()).c || (customStatus = userStatusMessage.getCustomStatus()) == null) ? null : customStatus.getIconName();
                    int availability = userStatusMessage.getAvailability();
                    int notificationMode = userStatusMessage.getNotificationMode();
                    int duration = userStatusMessage.getDuration();
                    CustomStatusMessage customStatus2 = userStatusMessage.getCustomStatus();
                    String emoji = customStatus2 != null ? customStatus2.getEmoji() : null;
                    CustomStatusMessage customStatus3 = userStatusMessage.getCustomStatus();
                    String text = customStatus3 != null ? customStatus3.getText() : null;
                    CustomStatusMessage customStatus4 = userStatusMessage.getCustomStatus();
                    if (customStatus4 == null || (localizations = customStatus4.getLocalizations()) == null) {
                        linkedHashMap = null;
                    } else {
                        int d2 = gw00.d(localizations.length);
                        if (d2 < 16) {
                            d2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2);
                        for (LocalizationEntry localizationEntry : localizations) {
                            Pair pair = new Pair(localizationEntry.getLocale(), localizationEntry.getText());
                            linkedHashMap2.put(pair.c(), pair.f());
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    st21 st21Var = new st21(0L, str5, j5, availability, notificationMode, duration, text, emoji, iconName, linkedHashMap);
                    ghf0 ghf0Var = l020Var.E;
                    ot21 ot21Var2 = ghf0Var.m;
                    ((Number) a.b(ot21Var2.a, false, true, new dl01(28, ot21Var2, st21Var))).longValue();
                    ghf0Var.s.c.d(e9h0.payload_user_status_changed, str5);
                    yt21Var.j.l(null);
                    userStatusMessage.toString();
                    ut21Var.getClass();
                    xt21Var.a.reportEvent("status_updated", b.i(new Pair("availability", Integer.valueOf(availability)), new Pair(ClidProvider.TIMESTAMP, Long.valueOf(j5)), new Pair("duration", Integer.valueOf(duration))));
                } else {
                    z83.i();
                    if (a4 != null) {
                        xt21Var.a.reportEvent("status_update_ignored", b.i(new Pair("current_availability", Integer.valueOf(a4.d)), new Pair("received_availability", Integer.valueOf(userStatusMessage.getAvailability())), new Pair("current_timestamp", Long.valueOf(j4)), new Pair("received_timestamp", Long.valueOf(j5))));
                    }
                    Objects.toString(userStatusMessage);
                    ut21Var.getClass();
                }
                return zy11Var;
        }
        return Integer.valueOf(x);
    }

    public /* synthetic */ sa6(Object obj, long j, Serializable serializable, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.w = serializable;
        this.x = obj2;
    }

    public /* synthetic */ sa6(Object obj, Serializable serializable, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.w = serializable;
        this.b = j;
        this.x = obj2;
    }

    public /* synthetic */ sa6(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = j;
    }
}
