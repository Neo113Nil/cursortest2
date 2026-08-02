package defpackage;

import android.view.View;
import com.connectsdk.device.ConnectableDevice;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ott.data.dto.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes.dex */
public final class zyt extends uif implements Function1 {
    public static final zyt A;
    public static final zyt B;
    public static final zyt C;
    public static final zyt D;
    public static final zyt E;
    public static final zyt F;
    public static final zyt G;
    public static final zyt H;
    public static final zyt I;
    public static final zyt J;
    public static final zyt K;
    public static final zyt L;
    public static final zyt X;
    public static final zyt Y;
    public static final zyt Z;
    public static final zyt s;
    public static final zyt t;
    public static final zyt u;
    public static final zyt v;
    public static final zyt v0;
    public static final zyt w;
    public static final zyt w0;
    public static final zyt x;
    public static final zyt x0;
    public static final zyt y;
    public static final zyt y0;
    public static final zyt z;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new zyt(i, 0);
        t = new zyt(i, 1);
        u = new zyt(i, 2);
        v = new zyt(i, 3);
        w = new zyt(i, 4);
        x = new zyt(i, 5);
        y = new zyt(i, 6);
        z = new zyt(i, 7);
        A = new zyt(i, 8);
        B = new zyt(i, 9);
        C = new zyt(i, 10);
        D = new zyt(i, 11);
        E = new zyt(i, 12);
        F = new zyt(i, 13);
        G = new zyt(i, 14);
        H = new zyt(i, 15);
        I = new zyt(i, 16);
        J = new zyt(i, 17);
        K = new zyt(i, 18);
        L = new zyt(i, 19);
        X = new zyt(i, 20);
        Y = new zyt(i, 21);
        Z = new zyt(i, 22);
        v0 = new zyt(i, 23);
        w0 = new zyt(i, 24);
        x0 = new zyt(i, 25);
        y0 = new zyt(i, 26);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyt(xdh xdhVar) {
        super(1);
        this.r = 27;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrmRequestParams drmRequestParams;
        switch (this.r) {
            case 0:
                zm0 zm0Var = (zm0) obj;
                return new ema((Float.floatToRawIntBits(zm0Var.a) << 32) | (Float.floatToRawIntBits(zm0Var.b) & 4294967295L));
            case 1:
                return new ym0(((cma) obj).a);
            case 2:
                return new cma(((ym0) obj).a);
            case 3:
                return new ym0(((Number) obj).floatValue());
            case 4:
                return Float.valueOf(((ym0) obj).a);
            case 5:
                long j = ((wpe) obj).a;
                return new zm0((int) (j >> 32), (int) (j & 4294967295L));
            case 6:
                zm0 zm0Var2 = (zm0) obj;
                return new wpe((Math.round(zm0Var2.a) << 32) | (Math.round(zm0Var2.b) & 4294967295L));
            case 7:
                long j2 = ((hqe) obj).a;
                return new zm0((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 8:
                zm0 zm0Var3 = (zm0) obj;
                int round = Math.round(zm0Var3.a);
                if (round < 0) {
                    round = 0;
                }
                return new hqe(((Math.round(zm0Var3.b) >= 0 ? r10 : 0) & 4294967295L) | (round << 32));
            case 9:
                return new ym0(((Number) obj).intValue());
            case 10:
                return Integer.valueOf((int) ((ym0) obj).a);
            case 11:
                long j3 = ((enj) obj).a;
                return new zm0(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
            case 12:
                zm0 zm0Var4 = (zm0) obj;
                return new enj((Float.floatToRawIntBits(zm0Var4.a) << 32) | (Float.floatToRawIntBits(zm0Var4.b) & 4294967295L));
            case 13:
                ynn ynnVar = (ynn) obj;
                return new bn0(ynnVar.a, ynnVar.b, ynnVar.c, ynnVar.d);
            case 14:
                bn0 bn0Var = (bn0) obj;
                return new ynn(bn0Var.a, bn0Var.b, bn0Var.c, bn0Var.d);
            case 15:
                long j4 = ((nmq) obj).a;
                return new zm0(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
            case 16:
                zm0 zm0Var5 = (zm0) obj;
                return new nmq((Float.floatToRawIntBits(zm0Var5.a) << 32) | (Float.floatToRawIntBits(zm0Var5.b) & 4294967295L));
            case 17:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                return new l0u(q1fVar.b().o("purchase_token"));
            case 18:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                z9h b = q1fVar2.b();
                String o = b.o("status");
                int n = b.n("attempts_left");
                String o2 = b.o("currency");
                b.g("format");
                String o3 = b.o(ConnectableDevice.KEY_ID);
                b.g("amount");
                b.g("status_code");
                return new o0u(n, o, o2, o3, b.g("deny_resend_until"));
            case 19:
                c cVar = (c) obj;
                cVar.getClass();
                DrmProxy drmProxy = cVar.d;
                DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams = null;
                DrmProxyWithFreeRequestParams drmProxyWithFreeRequestParams2 = drmProxy instanceof DrmProxyWithFreeRequestParams ? (DrmProxyWithFreeRequestParams) drmProxy : null;
                if (drmProxyWithFreeRequestParams2 != null) {
                    String proxyUrl = drmProxyWithFreeRequestParams2.getProxyUrl();
                    String provisioningUrl = drmProxyWithFreeRequestParams2.getProvisioningUrl();
                    Map<String, String> freeRequestParams = drmProxyWithFreeRequestParams2.getFreeRequestParams();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : freeRequestParams.entrySet()) {
                        if (!Intrinsics.d(entry.getKey(), "sessionId")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    proxyUrl.getClass();
                    DrmRequestParams.Companion.getClass();
                    drmRequestParams = DrmRequestParams.DUMMY;
                    drmProxyWithFreeRequestParams = new DrmProxyWithFreeRequestParams(proxyUrl, provisioningUrl, drmRequestParams, linkedHashMap, null);
                }
                cVar.d = drmProxyWithFreeRequestParams;
                return Unit.a;
            case 20:
                c cVar2 = (c) obj;
                cVar2.getClass();
                DrmProxy drmProxy2 = cVar2.d;
                cVar2.d = drmProxy2 != null ? drmProxy2.copy(new k1u(drmProxy2, 1)) : null;
                return Unit.a;
            case 21:
                ((c) obj).getClass();
                return Unit.a;
            case 22:
                ((eau) obj).getClass();
                return Unit.a;
            case 23:
                View view = (View) obj;
                view.getClass();
                return Boolean.valueOf(view.getId() == -1);
            case 24:
                ((View) obj).getClass();
                return Unit.a;
            case 25:
                p6c p6cVar = (p6c) obj;
                p6cVar.getClass();
                return ouj.o(p6cVar.a, " - ", p6cVar.b);
            case 26:
                ufb ufbVar = (ufb) obj;
                ufbVar.getClass();
                return ufbVar.getClass().getName();
            case 27:
                qi4 qi4Var = (qi4) obj;
                qi4Var.getClass();
                return xdh.d(qi4Var);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new dqa((eqa) obj);
            default:
                return new hqe((0 << 32) | (4294967295L & ((int) (((hqe) obj).a & 4294967295L))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyt(int i, int i2) {
        super(i);
        this.r = i2;
    }
}
