package defpackage;

import android.view.MotionEvent;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.exception.network.c;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.preload_manager.DownloadResult;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public final class afg extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afg(rgi rgiVar, yoi yoiVar, ydp ydpVar) {
        super(1);
        this.r = 4;
        this.s = yoiVar;
        this.t = ydpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        if (((int) (r0.a() & 4294967295L)) == ((int) (r2.a() & 4294967295L))) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (((int) (r0.a() >> 32)) == ((int) (r2.a() >> 32))) goto L33;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ofg ofgVar;
        ofg ofgVar2;
        HashSet u0;
        Object value;
        int i = 3;
        int i2 = 2;
        boolean z = false;
        int i3 = 1;
        ofg ofgVar3 = null;
        switch (this.r) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                LoadError loadError = (LoadError) this.s;
                cVar.a = loadError.getExceptionCode();
                cVar.b = loadError.getUri();
                cVar.c = (String) this.t;
                cVar.e = loadError.getExceptionMessage();
                cVar.f = new Throwable(loadError.getExceptionCauseMessage());
                cVar.g = false;
                return Unit.a;
            case 1:
                n9i n9iVar = (n9i) obj;
                e1j e1jVar = (e1j) this.s;
                q0j method = e1jVar.method();
                String b = e1jVar.b();
                z9h d = e1jVar.d();
                z9h a = e1jVar.a();
                p9i p9iVar = (p9i) this.t;
                z9h c = e1jVar.c();
                c.j("X-Service-Token", p9iVar.b);
                String str = p9iVar.c;
                if (str != null) {
                    c.j("X-Device-Id", str);
                }
                if (n9iVar != null) {
                    c.j("Authorization", "OAuth " + n9iVar.a);
                    c.j("X-Uid", n9iVar.b);
                }
                return new uyo(method, b, d, a, c, e1jVar.encoding());
            case 2:
                zco zcoVar = (zco) obj;
                float e = ((t6k) ((zcq) this.s).b.l).e();
                float b2 = nmq.b(zcoVar.p);
                if (!Float.isNaN(e) && !Float.isNaN(b2) && b2 != 0.0f) {
                    float floatValue = ((Number) ((fk0) this.t).e()).floatValue();
                    zcoVar.k(sbi.d(zcoVar, floatValue));
                    zcoVar.n(sbi.e(zcoVar, floatValue));
                    zcoVar.v(v5g.g(0.5f, (e + b2) / b2));
                }
                return Unit.a;
            case 3:
                jfp jfpVar = (jfp) obj;
                mm6 mm6Var = (mm6) this.t;
                bci bciVar = (bci) this.s;
                ka0 ka0Var = bciVar.b;
                if (bciVar.e()) {
                    lbi lbiVar = new lbi(bciVar, mm6Var, i3);
                    s9f[] s9fVarArr = wfp.a;
                    jfpVar.o(hfp.u, new sa(null, lbiVar));
                    Object value2 = ka0Var.g.getValue();
                    cci cciVar = cci.c;
                    if (value2 == cciVar) {
                        jfpVar.o(hfp.s, new sa(null, new lbi(bciVar, mm6Var, i2)));
                    } else if (ka0Var.e().a.containsKey(cciVar)) {
                        jfpVar.o(hfp.t, new sa(null, new lbi(bciVar, mm6Var, i)));
                    }
                }
                return Unit.a;
            case 4:
                idp idpVar = (idp) obj;
                rgi.n((yoi) this.s, (ydp) this.t, idpVar, 0, idpVar.f.a.a.b.length());
                return Unit.a;
            case 5:
                int intValue = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue), ((List) this.t).get(intValue));
            case 6:
                mb5 mb5Var = (mb5) obj;
                if (mb5Var == null || (ofgVar = mb5Var.d) == null) {
                    ofgVar = ofg.d;
                }
                if (mb5Var == null || (ofgVar2 = mb5Var.e) == null) {
                    ofgVar2 = ofg.d;
                }
                pfg pfgVar = (pfg) this.s;
                ofgVar.getClass();
                int ordinal = pfgVar.ordinal();
                if (ordinal == 0) {
                    ofgVar3 = ofg.a(ofgVar, 6);
                } else if (ordinal == 1) {
                    ofgVar3 = ofg.a(ofgVar, 5);
                } else if (ordinal == 2) {
                    ofgVar3 = ofg.a(ofgVar, 3);
                } else {
                    b6e.s();
                }
                return t1f.n((t1f) this.t, mb5Var, ofgVar3, ofgVar2);
            case 7:
                e6j e6jVar = (e6j) obj;
                e6jVar.getClass();
                if (n7w.R(q6c.t)) {
                    String str2 = e6jVar.a;
                    String str3 = e6jVar.b;
                    xw3 xw3Var = (xw3) this.s;
                    xw3Var.post(new cy1(25, xw3Var, str2, str3));
                }
                g0c y = ((d3j) this.t).y();
                qne f0 = gut.f0();
                x60 x60Var = (x60) y;
                x60Var.getClass();
                x60Var.a(f0);
                return Unit.a;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue2), ((ArrayList) this.t).get(intValue2));
            case 9:
                return ((m2j) this.s).invoke(((List) this.t).get(((Number) obj).intValue()));
            case 10:
                int intValue3 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue3), ((ArrayList) this.t).get(intValue3));
            case 11:
                jgj jgjVar = (jgj) obj;
                jgjVar.getClass();
                xdh xdhVar = (xdh) this.s;
                ArrayList arrayList = jgjVar.a;
                int ordinal2 = ((kgj) this.t).ordinal();
                if (ordinal2 == 0) {
                    xdhVar.c = arrayList;
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    xdhVar.d = arrayList;
                }
                return arrayList;
            case 12:
                rnn rnnVar = (rnn) obj;
                rnnVar.getClass();
                rnnVar.a = (PreparingParams) this.s;
                rnnVar.b = ((avj) this.t).j();
                return Unit.a;
            case 13:
                fom fomVar = (fom) obj;
                fomVar.getClass();
                g8c g8cVar = (g8c) this.s;
                DrmParameters drmParameters = (DrmParameters) this.t;
                DrmProxy drmProxy = (DrmProxy) drmParameters.getDrmConfig();
                g8cVar.getClass();
                drmProxy.getClass();
                fomVar.a = new jxj((l48) g8cVar.a, drmProxy);
                fomVar.c = drmParameters.getDrmSecurityLevel();
                return Unit.a;
            case 14:
                jsk jskVar = (jsk) obj;
                vv vvVar = new vv((ArrayList) this.t, 27);
                jskVar.a = true;
                vvVar.invoke(jskVar);
                jskVar.a = false;
                ((aqi) this.s).getValue();
                return Unit.a;
            case 15:
                bg2 bg2Var = (bg2) obj;
                bg2Var.getClass();
                ts5 ts5Var = (ts5) this.s;
                List list = (List) this.t;
                int size = list.size();
                int size2 = list.size();
                int min = size >= 0 ? Math.min(size, size2) : size + size2;
                return ts5Var.b(1 < min ? CollectionsKt.y0(CollectionsKt.m0(list, yhn.m(1, min))) : new ArrayList(), bg2Var);
            case 16:
                mek mekVar = (mek) obj;
                mekVar.getClass();
                qdq.A(new t03(20, (mgk) this.s, mekVar, (ime) this.t));
                return Unit.a;
            case 17:
                int intValue4 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue4), ((ArrayList) this.t).get(intValue4));
            case 18:
                int intValue5 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue5), ((ArrayList) this.t).get(intValue5));
            case 19:
                int intValue6 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue6), ((List) this.t).get(intValue6));
            case 20:
                int intValue7 = ((Number) obj).intValue();
                return ((d6h) this.s).invoke(Integer.valueOf(intValue7), ((List) this.t).get(intValue7));
            case 21:
                MotionEvent motionEvent = (MotionEvent) obj;
                tfm tfmVar = (tfm) this.t;
                if (motionEvent.getActionMasked() == 0) {
                    sfm sfmVar = (sfm) this.s;
                    jj0 jj0Var = tfmVar.a;
                    if (jj0Var == null) {
                        Intrinsics.j("onTouchEvent");
                        throw null;
                    }
                    sfmVar.b = ((Boolean) jj0Var.invoke(motionEvent)).booleanValue() ? qfm.b : qfm.c;
                } else {
                    jj0 jj0Var2 = tfmVar.a;
                    if (jj0Var2 == null) {
                        Intrinsics.j("onTouchEvent");
                        throw null;
                    }
                    jj0Var2.invoke(motionEvent);
                }
                return Unit.a;
            case 22:
                xbu xbuVar = (xbu) obj;
                xbuVar.getClass();
                VideoData videoData = ((nnm) this.s).a;
                List list2 = (List) this.t;
                videoData.getClass();
                list2.getClass();
                imh imhVar = ((wbu) videoData).a;
                xbuVar.c.H("VideoPreloadManager", "onSuccess", "preload " + imhVar.d + " res=" + list2, new Object[0]);
                ecg ecgVar = xbuVar.i;
                if (ecgVar != null) {
                    DownloadResult downloadResult = (DownloadResult) CollectionsKt.firstOrNull(list2);
                    if (downloadResult != null) {
                        downloadResult.getBytesDownloaded();
                    }
                    imhVar.getClass();
                    yjj yjjVar = ecgVar.l;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        gag gagVar = (gag) it.next();
                        gagVar.getClass();
                        imhVar.getClass();
                        xdr xdrVar = gagVar.c;
                        LinkedHashMap q = uah.q(((eag) xdrVar.getValue()).d);
                        q.put(imhVar, PreloadState.SUCCESS);
                        do {
                            value = xdrVar.getValue();
                        } while (!xdrVar.k(value, eag.a((eag) value, null, null, null, q, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063)));
                        gagVar.b();
                    }
                }
                return Unit.a;
            case 23:
                Throwable th = (Throwable) obj;
                cnn cnnVar = (cnn) this.s;
                Object obj2 = cnnVar.c;
                Throwable th2 = (Throwable) this.t;
                synchronized (obj2) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                fob.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    cnnVar.e = th2;
                    xdr xdrVar2 = cnnVar.u;
                    zmn zmnVar = zmn.a;
                    xdrVar2.getClass();
                    xdrVar2.m(null, zmnVar);
                }
                return Unit.a;
            case 24:
                ((wr5) this.s).z(obj);
                upi upiVar = (upi) this.t;
                if (upiVar != null) {
                    upiVar.a(obj);
                }
                return Unit.a;
            case 25:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                ((x60) ((g0c) ((atn) this.s).c)).a(gut.S0().A(null));
                xqn xqnVar = (xqn) this.t;
                z9h z9hVar = wleVar.s;
                xqnVar.a = new u7o(z9hVar != null ? z9hVar.toString() : null);
                return Unit.a;
            case 26:
                zxn zxnVar = (zxn) obj;
                zxn zxnVar2 = (zxn) this.t;
                zxnVar.getClass();
                ayn aynVar = (ayn) this.s;
                if (aynVar.r.contains(zxnVar.a.l)) {
                    int ordinal3 = aynVar.g.ordinal();
                    if (ordinal3 == 0) {
                        int ordinal4 = aynVar.f().ordinal();
                        if (ordinal4 == 0) {
                            break;
                        } else {
                            if (ordinal4 != 1) {
                                b6e.s();
                                return null;
                            }
                            break;
                        }
                    } else if (ordinal3 != 1) {
                        b6e.s();
                        return null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                cro croVar = (cro) obj;
                croVar.getClass();
                hpo hpoVar = (hpo) ((x3n) this.s).d;
                j5n j5nVar = new j5n(4, (e47) this.t, croVar);
                if (hpoVar.a) {
                    j5nVar.invoke();
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((gqi) this.s).a.setValue(new lob((ufc) this.t, (opv) obj));
                return Unit.a;
            default:
                hyo hyoVar = (hyo) this.s;
                iyo iyoVar = (iyo) this.t;
                long j = ((wma) obj).a;
                hyoVar.a(1, iyoVar.d == bxj.b ? enj.a(0.0f, 0.0f, 1, j) : enj.a(0.0f, 0.0f, 2, j));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afg(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }
}
