package defpackage;

import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ovk implements p7q, smm, d5p, jgg, ymx {
    public static final void o(rxk rxkVar) {
        xdr xdrVar;
        emk emkVar;
        emk emkVar2;
        xdr xdrVar2 = cnn.y;
        do {
            xdrVar = cnn.y;
            emkVar = (emk) xdrVar.getValue();
            vlk vlkVar = emkVar.d;
            h8g h8gVar = (h8g) vlkVar.get(rxkVar);
            if (h8gVar == null) {
                emkVar2 = emkVar;
            } else {
                Object obj = h8gVar.a;
                Object obj2 = h8gVar.b;
                aat aatVar = vlkVar.d;
                aat v = aatVar.v(rxkVar != null ? rxkVar.hashCode() : 0, 0, rxkVar);
                if (aatVar != v) {
                    vlkVar = v == null ? vlk.f : new vlk(v, vlkVar.e - 1);
                }
                qee qeeVar = qee.f;
                if (obj != qeeVar) {
                    Object obj3 = vlkVar.get(obj);
                    obj3.getClass();
                    vlkVar = vlkVar.g(obj, new h8g(((h8g) obj3).a, obj2));
                }
                if (obj2 != qeeVar) {
                    Object obj4 = vlkVar.get(obj2);
                    obj4.getClass();
                    vlkVar = vlkVar.g(obj2, new h8g(obj, ((h8g) obj4).b));
                }
                Object obj5 = obj != qeeVar ? emkVar.b : obj2;
                if (obj2 != qeeVar) {
                    obj = emkVar.c;
                }
                emkVar2 = new emk(obj5, obj, vlkVar);
            }
            if (emkVar == emkVar2) {
                return;
            }
        } while (!xdrVar.k(emkVar, emkVar2));
    }

    public static yhv p(iiv iivVar, ejv ejvVar) {
        djv djvVar;
        djv djvVar2;
        long currentTimeMillis = System.currentTimeMillis();
        String str = iivVar.a;
        bjv bjvVar = iivVar.c;
        if (bjvVar instanceof xiv) {
            xiv xivVar = (xiv) bjvVar;
            String str2 = xivVar.b;
            if (StringsKt.toIntOrNull(str2) == null) {
                dfi.r("Unexpected feedbackId: " + str2 + " for Album " + xivVar.d + StringUtil.SPACE + xivVar.c, "Feedback");
            }
            djvVar2 = new djv(str2, "ALBUM");
        } else {
            if (bjvVar instanceof yiv) {
                djvVar = new djv(((yiv) bjvVar).b, "PROMO_LINK");
            } else if (bjvVar instanceof ajv) {
                djvVar = new djv(((ajv) bjvVar).b, "WAVE");
            } else {
                if (!(bjvVar instanceof ziv)) {
                    b6e.s();
                    return null;
                }
                djvVar = new djv(((ziv) bjvVar).b, "SETTING");
            }
            djvVar2 = djvVar;
        }
        return new yhv(str, djvVar2, iivVar.b, ejvVar, currentTimeMillis);
    }

    @Override // defpackage.d5p
    public pjc E(String str) {
        str.getClass();
        return new fs(15, Boolean.FALSE);
    }

    @Override // defpackage.d5p
    public void F(kjm kjmVar, int i) {
        kjmVar.getClass();
    }

    @Override // defpackage.jgg
    public void a() {
        synchronized (i4w.t) {
            Object obj = i4w.u;
            synchronized (obj) {
                if (i4w.v) {
                    return;
                }
                long n = i4w.n();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    i4w.w = n;
                    i4w.v = true;
                }
            }
        }
    }

    @Override // defpackage.ymx
    public jnx b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.ymx
    public boolean l(Class cls) {
        return false;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return Boolean.valueOf(szuVar.m.b.c);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.jgg
    public void f() {
    }

    @Override // defpackage.smm
    public void c(rmm rmmVar) {
    }
}
