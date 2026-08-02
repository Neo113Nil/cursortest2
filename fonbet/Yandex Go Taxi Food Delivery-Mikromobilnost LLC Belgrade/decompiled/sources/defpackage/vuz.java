package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.j;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import com.ybsdk.feature.qr.api.QrCameraType;
import com.ybsdk.feature.qr.api.QrScannerPreview;
import com.ybsdk.feature.qr.api.QrScannerPreviewDependencies;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.intersection.Participant;

/* loaded from: classes6.dex */
public final class vuz implements s8i0, iv60, gn80, m0b0, ifg0, wzm0, myt0, c4y0, b88, ml31 {
    public vuz() {
        scc.g(new s0b(), new zj21(), new x6r0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r5 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PushAckParam l(ong ongVar) {
        PushAckStatus pushAckStatus;
        Object obj;
        String a = ongVar.a("KEY_PUSH_ID");
        String a2 = ongVar.a("KEY_LAUNCH_ID");
        String a3 = ongVar.a("KEY_STATUS");
        if (a3 != null) {
            PushAckStatus.Companion.getClass();
            Iterator<E> it = PushAckStatus.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cvu0.t(((PushAckStatus) obj).getWireName(), a3, true)) {
                    break;
                }
            }
            pushAckStatus = (PushAckStatus) obj;
            if (pushAckStatus == null) {
                pushAckStatus = PushAckStatus.DELIVERED;
            }
        }
        pushAckStatus = PushAckStatus.DELIVERED;
        PushAckStatus pushAckStatus2 = pushAckStatus;
        String a4 = ongVar.a("KEY_DEVICEID");
        Object valueOf = Long.valueOf(new Date().getTime());
        Object obj2 = ongVar.a.get("KEY_DATETIME");
        if (obj2 instanceof Long) {
            valueOf = obj2;
        }
        long longValue = ((Number) valueOf).longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(longValue);
        if (a != null && !evu0.J(a) && a2 != null && !evu0.J(a2)) {
            return new PushAckParam(a2, a, pushAckStatus2, a4, calendar);
        }
        qv10.C(new Object[]{a, a2}, 2, "Push ack error, no pushId or launchId: %s, %s", jst.e);
        return null;
    }

    public static final sd2 m(int i, String str) {
        WeakHashMap weakHashMap = a.w;
        return new sd2(i, str);
    }

    public static final k131 n(int i, String str) {
        WeakHashMap weakHashMap = a.w;
        return new k131(new s2w(0, 0, 0, 0), str);
    }

    public static a o(fid fidVar) {
        bts btsVar = (bts) fidVar;
        View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
        a p = p(view);
        boolean e = btsVar.e(p) | btsVar.e(view);
        Object Q = btsVar.Q();
        if (e || Q == did.a) {
            Q = new e331(19, p, view);
            btsVar.o0(Q);
        }
        zpn.a(p, (tls) Q, btsVar);
        return p;
    }

    public static a p(View view) {
        a aVar;
        WeakHashMap weakHashMap = a.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new a(view);
                    weakHashMap.put(view, obj);
                }
                aVar = (a) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static ro00 t(Participant participant, f4c0 f4c0Var, XYPoint xYPoint, float f, String str, int i, int i2, int i3, int i4) {
        return new ro00(str, participant, f4c0Var != null ? ru.yandex.taxi.map.utils.a.l(f4c0Var, xYPoint, i, i2, i3, i4, f) : null);
    }

    public static /* synthetic */ ro00 u(Participant participant, f4c0 f4c0Var, XYPoint xYPoint, float f, String str, int i) {
        if ((i & 16) != 0) {
            str = participant.getDefaultId();
        }
        return t(participant, f4c0Var, xYPoint, f, str, 0, 0, 0, 0);
    }

    public static ro00 v(Participant participant, View view, XYPoint xYPoint, float f, int i, int i2, int i3, int i4) {
        sfr sfrVar;
        ro00 ro00Var = ro00.d;
        String defaultId = participant.getDefaultId();
        int i5 = (i4 & 32) != 0 ? 0 : i;
        int i6 = (i4 & 64) != 0 ? 0 : i2;
        int i7 = (i4 & 128) != 0 ? 0 : i3;
        if (view != null) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            sfrVar = ru.yandex.taxi.map.utils.a.g(xYPoint, new PointF(0.5f, 0.5f), view.getHeight(), view.getWidth(), f, i5, i6, i7, 0);
        } else {
            sfrVar = null;
        }
        return new ro00(defaultId, participant, sfrVar);
    }

    public static ddf w(ar7 ar7Var, pbj pbjVar) {
        fmp f;
        zgf zgfVar = new zgf(18, ar7Var);
        List list = (List) pbjVar.z;
        ar7Var.d();
        sgb1.g(3, "ResolvedFeatureGroup");
        Set set = (Set) pbjVar.y;
        if (set.isEmpty() && list.isEmpty()) {
            return null;
        }
        List list2 = (List) pbjVar.A;
        if (set.isEmpty() && list.isEmpty()) {
            ny61.g("Must have at least one required or preferred feature");
            return null;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                j jVar = (j) it.next();
                UseCaseType.Companion.getClass();
                if (dj21.a(jVar) == UseCaseType.UNDEFINED) {
                    f = new dmp(jVar);
                    break;
                }
            } else {
                Iterator it2 = set.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        emp g = zgf.g((b3u) it2.next(), list2);
                        if (g != null) {
                            f = g;
                            break;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            emp g2 = zgf.g((b3u) obj, list2);
                            if (g2 != null) {
                                g2.toString();
                                sgb1.g(3, "DefaultFeatureGroupResolver");
                            } else {
                                g2 = null;
                            }
                            if (g2 == null) {
                                arrayList.add(obj);
                            }
                        }
                        arrayList.toString();
                        sgb1.g(3, "DefaultFeatureGroupResolver");
                        f = zgfVar.f(pbjVar, arrayList, 0, EmptyList.a);
                    }
                }
            }
        }
        if (f instanceof bmp) {
            ddf ddfVar = ((bmp) f).a;
            Objects.toString(ddfVar);
            sgb1.g(3, "ResolvedFeatureGroup");
            return ddfVar;
        }
        if (f instanceof cmp) {
            ny61.g("Feature group is not supported");
            return null;
        }
        if (f instanceof dmp) {
            throw new IllegalArgumentException(((dmp) f).a + " is not supported");
        }
        if (!(f instanceof emp)) {
            w511.b();
            return null;
        }
        emp empVar = (emp) f;
        kbs.e(empVar.a, " must be added for ", empVar.b);
        return null;
    }

    @Override // defpackage.c4y0
    public void a() {
    }

    @Override // defpackage.wzm0
    public void attach(View view) {
    }

    @Override // defpackage.ifg0
    public QrScannerPreview b(final Context context, QrScannerPreviewDependencies qrScannerPreviewDependencies) {
        return new QrScannerPreview(context) { // from class: com.ybsdk.di.modules.features.QrFeatureModule$qrScannerPreviewFactory$1$create$1
            @Override // com.ybsdk.feature.qr.api.QrScannerPreview
            public QrCameraType cameraType() {
                return QrCameraType.NOT_IMPLEMENTED;
            }
        };
    }

    @Override // defpackage.s8i0
    public void c(String str, boolean z) {
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        qq31Var.invoke(new Default3DSWebView(context));
    }

    @Override // defpackage.wzm0
    public void detach(View view) {
    }

    @Override // defpackage.c4y0
    public void e() {
    }

    @Override // defpackage.m0b0
    public void f() {
    }

    @Override // defpackage.ml31
    public void g(MediaExtractor mediaExtractor, Object obj) {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.myt0
    public long h(long j) {
        return -1L;
    }

    @Override // defpackage.m0b0
    public void i() {
    }

    @Override // defpackage.iv60
    public int j(int i) {
        return i;
    }

    @Override // defpackage.ml31
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.gn80
    public void q(boolean z) {
    }

    @Override // defpackage.iv60
    public int r(int i) {
        return i;
    }

    @Override // defpackage.gn80
    public void s(boolean z) {
    }

    public vuz(String str) {
    }

    public /* synthetic */ vuz(boolean z) {
    }
}
