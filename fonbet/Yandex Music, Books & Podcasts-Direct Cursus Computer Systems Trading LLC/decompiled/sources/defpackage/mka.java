package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.fragment.app.t;
import com.connectsdk.device.ConnectableDevice;
import com.google.android.material.textfield.TextInputLayout;
import com.google.crypto.tink.shaded.protobuf.a;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.pulse.metrics.MetricsState;
import com.yandex.pulse.metrics.k;
import com.yandex.pulse.metrics.l;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;
import ru.yandex.music.post.ui.grid.PostGridUniversalActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes4.dex */
public final class mka implements gvs, hg7, hbv, u97, t8s, nlk, cdv, rzb, adu, tft {
    public static x2i b;
    public final Object a;

    public mka(String str, String str2, String str3, dck dckVar, String str4, String str5, String str6, String str7, String str8) {
        dfi.s(str3, str7, str8);
        this.a = uah.e(new Pair(CommonUrlParts.APP_ID, str), new Pair("app_version", str2), new Pair("service", str3), new Pair("sdk_version", "110.0.0"), new Pair("subscription_state", dckVar.a), new Pair("testids", str4), new Pair("triggered_testids", str5), new Pair("puid", str6), new Pair("log_session_id", str7), new Pair("language", str8));
    }

    public static p5n D(i7q i7qVar) {
        int ordinal = i7qVar.ordinal();
        if (ordinal == 0) {
            return p5n.a;
        }
        if (ordinal == 1) {
            return p5n.b;
        }
        if (ordinal == 2) {
            return p5n.c;
        }
        if (ordinal == 3) {
            return p5n.d;
        }
        b6e.s();
        return null;
    }

    public static bqr r(mr1 mr1Var, rce rceVar, xwh xwhVar, ywh ywhVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(rceVar.a.getResources(), ywhVar.a);
        bb7 bb7Var = bb7.a;
        Map map = ywhVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = k.a;
        if (mr1Var != null && mr1Var.a) {
            z = true;
        }
        return new bqr(bitmapDrawable, rceVar, bb7Var, xwhVar, str, booleanValue, z);
    }

    public static c7f z(rsr rsrVar) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(ConnectableDevice.KEY_ID, new c2s(1, 1, ConnectableDevice.KEY_ID, "INTEGER", null, true));
        hashMap.put("time", new c2s(0, 1, "time", "TEXT", null, true));
        hashMap.put("name", new c2s(0, 1, "name", "TEXT", null, true));
        hashMap.put("data", new c2s(0, 1, "data", "TEXT", null, true));
        boolean z = false;
        f2s f2sVar = new f2s("LogSession", hashMap, new HashSet(0), new HashSet(0));
        rsrVar.getClass();
        f2s J = pcg.J(new qsr(rsrVar), "LogSession");
        if (!f2sVar.equals(J)) {
            return new c7f(z, v3w.d("LogSession(ru.yandex.video.sessionlogger.table.LogSessionDao.EntityLogSession).\n Expected:\n", f2sVar, "\n Found:\n", J), 2);
        }
        return new c7f(true, (String) null, 2);
    }

    public void A(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        ((Messenger) this.a).send(obtain);
    }

    @Override // defpackage.cdv
    public void C(bdv bdvVar) {
        ((j3j) this.a).m.l(bdvVar);
    }

    @Override // defpackage.gvs
    public void E(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        scv scvVar = (scv) this.a;
        byte[] bArr = new byte[4];
        scvVar.j = bArr;
        om3Var.getClass();
        om3Var.e(4, bArr);
        scvVar.b = 4;
        scvVar.h();
    }

    @Override // defpackage.nlk
    public void a(k[] kVarArr) {
        List X;
        MetricsState metricsState = (MetricsState) this.a;
        b5i b5iVar = metricsState.d;
        b5iVar.d();
        ((l) b5iVar.b).clearInitialLogQueue();
        if (kVarArr != null && (X = xz0.X(kVarArr)) != null) {
            b5iVar.d();
            ((l) b5iVar.b).addAllInitialLogQueue(X);
        }
        metricsState.a();
    }

    @Override // defpackage.hg7
    public int b() {
        return ((ig7) this.a).b;
    }

    @Override // defpackage.hg7
    public int c() {
        return ((ig7) this.a).a;
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        yxt yxtVar = ((rzb) this.a).d(map).a;
        yxt yxtVar2 = yxt.Boolean;
        if (yxtVar == yxtVar2) {
            return new vc3(!r3.c());
        }
        throw new mac(yxtVar, yxtVar2);
    }

    @Override // defpackage.nlk
    public k[] e() {
        MetricsState metricsState = (MetricsState) this.a;
        if (((l) metricsState.d.b).getInitialLogQueueCount() <= 0) {
            return null;
        }
        List unmodifiableList = Collections.unmodifiableList(((l) metricsState.d.b).getInitialLogQueueList());
        unmodifiableList.getClass();
        Object[] array = unmodifiableList.toArray(new k[0]);
        if (array != null) {
            return (k[]) array;
        }
        jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return null;
    }

    @Override // defpackage.hg7
    public int f() {
        return ((ig7) this.a).e;
    }

    @Override // defpackage.t8s
    public d7f get(String str) {
        return (d7f) ((xy0) this.a).get(str);
    }

    @Override // defpackage.hbv
    public void h(Bundle bundle, c3c c3cVar) {
        t l = ((b3c) this.a).l();
        if (l != null) {
            Intent intent = new Intent();
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtras(bundle);
            l.setResult(-1, intent);
            l.finish();
        }
    }

    @Override // defpackage.hg7
    public int i() {
        return ((ig7) this.a).g;
    }

    public boolean j(mqs mqsVar) {
        if (mqsVar != null) {
            return ((lja) ((e6q) ((uaa) this.a)).e.getValue()).a.contains(mqsVar.a);
        }
        su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a8, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r0 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
    
        if (r7 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012b, code lost:
    
        if (r1 <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0137, code lost:
    
        if (java.lang.Math.abs(r2 - r5) <= r9) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ywh k(rce rceVar, xwh xwhVar, lmq lmqVar, nso nsoVar) {
        ywh ywhVar;
        ?? r9;
        boolean equals;
        ywh ywhVar2;
        if (rceVar.q.a) {
            vkn f = ((skn) this.a).f();
            if (f != null) {
                ywhVar = f.a.n(xwhVar);
                if (ywhVar == null) {
                    j4x j4xVar = f.b;
                    synchronized (j4xVar) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) j4xVar.c).get(xwhVar);
                            ywhVar2 = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        break;
                                    }
                                    bln blnVar = (bln) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) blnVar.b.get();
                                    ywh ywhVar3 = bitmap != null ? new ywh(bitmap, blnVar.c) : null;
                                    if (ywhVar3 != null) {
                                        ywhVar2 = ywhVar3;
                                        break;
                                    }
                                    i++;
                                }
                                int i2 = j4xVar.b;
                                j4xVar.b = i2 + 1;
                                if (i2 >= 10) {
                                    j4xVar.c();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ywhVar = ywhVar2;
                }
            } else {
                ywhVar = null;
            }
            if (ywhVar != null) {
                Bitmap bitmap2 = ywhVar.a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (lum.T(rceVar, config)) {
                    Object obj = ywhVar.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!Intrinsics.d(lmqVar, lmq.c)) {
                        String str = (String) xwhVar.b.get("coil#transformation_size");
                        if (str != null) {
                            equals = str.equals(lmqVar.toString());
                            if (equals) {
                                return ywhVar;
                            }
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            x97 x97Var = lmqVar.a;
                            int i3 = x97Var instanceof q38 ? ((q38) x97Var).n : Integer.MAX_VALUE;
                            x97 x97Var2 = lmqVar.b;
                            int i4 = x97Var2 instanceof q38 ? ((q38) x97Var2).n : Integer.MAX_VALUE;
                            double s = vnj.s(width, height, i3, i4, nsoVar);
                            boolean a = i.a(rceVar);
                            if (a) {
                                double d = s > 1.0d ? 1.0d : s;
                                if (Math.abs(i3 - (d * width)) > 1.0d && Math.abs(i4 - (d * height)) > 1.0d) {
                                    r9 = 1;
                                }
                                r9 = 1;
                                equals = r9;
                                if (equals) {
                                }
                            } else {
                                if (i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE) {
                                    r9 = 1;
                                } else {
                                    int abs = Math.abs(i3 - width);
                                    r9 = 1;
                                    r9 = 1;
                                }
                                if (i4 != Integer.MIN_VALUE && i4 != Integer.MAX_VALUE) {
                                    r9 = r9;
                                }
                                equals = r9;
                                if (equals) {
                                }
                            }
                            if (s != 1.0d) {
                            }
                            if (s > 1.0d) {
                            }
                            equals = r9;
                            if (equals) {
                            }
                        }
                    }
                }
                equals = false;
                if (equals) {
                }
            }
        }
        return null;
    }

    public void l(Bundle bundle, String str) {
        HashSet hashSet = j3c.a;
        if (gtt.c()) {
            ((pt0) this.a).z(bundle, str);
        }
    }

    public xwh m(rce rceVar, Object obj, rwj rwjVar, hib hibVar) {
        String str;
        Map map;
        xwh xwhVar = rceVar.e;
        List list = rceVar.i;
        if (xwhVar != null) {
            return xwhVar;
        }
        List list2 = ((skn) this.a).i.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            Pair pair = (Pair) list2.get(i);
            zbf zbfVar = (zbf) pair.a;
            if (((Class) pair.b).isAssignableFrom(obj.getClass())) {
                zbfVar.getClass();
                str = zbfVar.a(obj, rwjVar);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map2 = rceVar.A.a;
        if (map2.isEmpty()) {
            map = e5b.a;
            map.getClass();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                ((l6k) ((Map.Entry) it.next()).getValue()).getClass();
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new xwh(str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMap2.put(k5r.i(i2, "coil#transformation_"), ((e7t) list.get(i2)).a());
            }
            linkedHashMap2.put("coil#transformation_size", rwjVar.d.toString());
        }
        return new xwh(str, linkedHashMap2);
    }

    @Override // defpackage.gvs
    public void n(zvs zvsVar, float f) {
        zvsVar.getClass();
        ((ejm) this.a).o(zvsVar, f / 100.0f);
    }

    @Override // defpackage.tft
    public Intent p(Context context, Intent intent, kqt kqtVar) {
        Object obj;
        Intent putExtra;
        kqtVar.getClass();
        Intent z = StubActivity.z(context, rpt.NOT_FOUND);
        z.getClass();
        if (kqtVar.c != 1 || (obj = kqtVar.b) == null) {
            Intent t = w1g.t(context, intent, kqtVar);
            if (t != null) {
                return t;
            }
        } else {
            qxm qxmVar = (qxm) obj;
            PlaybackScope playbackScope = (PlaybackScope) this.a;
            if ((qxmVar instanceof co1) || (qxmVar instanceof u4m) || (qxmVar instanceof f30)) {
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((gim) ((byb) qdcVar.C(I)).c(ern.a(gim.class))).h()) {
                    int i = PostGridUniversalActivity.Z;
                    putExtra = new Intent(context, (Class<?>) PostGridUniversalActivity.class).putExtra("extra.event.id", qxmVar.c).putExtra("extra.playbackScope", playbackScope);
                    putExtra.getClass();
                } else {
                    int i2 = PostGridItemsActivity.H0;
                    putExtra = new Intent(context, (Class<?>) PostGridItemsActivity.class).putExtra("extra.event.id", qxmVar.c).putExtra("extra.playbackScope", playbackScope);
                    putExtra.getClass();
                }
            } else {
                Assertions.fail("unsupported EventData " + qxmVar);
                putExtra = null;
            }
            if (putExtra != null) {
                return putExtra;
            }
        }
        return z;
    }

    public oaf q(mn3 mn3Var) {
        j5 j5Var = (j5) this.a;
        try {
            b1 p = j5Var.p();
            d8 g = p.g(mn3Var);
            p.h(g);
            d8 d8Var = (d8) p.b(g);
            maf t = oaf.t();
            String n = j5Var.n();
            t.d();
            oaf.m((oaf) t.b, n);
            try {
                int a = d8Var.a();
                byte[] bArr = new byte[a];
                a aVar = new a(bArr, a);
                d8Var.d(aVar);
                if (aVar.c - aVar.d != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                jn3 jn3Var = new jn3(bArr);
                t.d();
                oaf.n((oaf) t.b, jn3Var);
                naf q = j5Var.q();
                t.d();
                oaf.o((oaf) t.b, q);
                return (oaf) t.b();
            } catch (IOException e) {
                throw new RuntimeException(d8Var.b("ByteString"), e);
            }
        } catch (aye e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public void s(int i) {
        mka mkaVar = ((kvf) this.a).a;
        if (i > 0) {
            lvf.a((lvf) mkaVar.a);
        }
    }

    public void u(msh mshVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
        bundle2.putParcelable("data_media_session_token", uwf.j(mshVar, MediaSessionCompat$Token.CREATOR));
        bundle2.putBundle("data_root_hints", bundle);
        A(1, bundle2);
    }

    @Override // defpackage.gvs
    public void v(zvs zvsVar) {
        zvsVar.getClass();
    }

    public void x(int i) {
        mka mkaVar = ((kvf) this.a).a;
        if (i > 0) {
            lvf.a((lvf) mkaVar.a);
        }
    }

    public void y(int i) {
        mka mkaVar = ((kvf) this.a).a;
        if (i > 0) {
            lvf.a((lvf) mkaVar.a);
        }
    }

    public mka(int i) {
        switch (i) {
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jyr b2 = l18.b.b(hag.I(j7q.class), true);
                this.a = lg3.u0(new njf(((j7q) b2.getValue()).e, this, 29), gld.e(dm6.b()), D((i7q) ((j7q) b2.getValue()).e.getValue()));
                break;
            default:
                this.a = new xy0(0);
                break;
        }
    }

    public mka(ig7 ig7Var) {
        ig7Var.getClass();
        this.a = ig7Var;
    }

    public mka(ejm ejmVar) {
        ejmVar.getClass();
        this.a = ejmVar;
    }

    public mka(my6 my6Var, TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public mka(skn sknVar, lum lumVar) {
        this.a = sknVar;
    }

    public mka(j5 j5Var, Class cls) {
        if (!((Map) j5Var.b).keySet().contains(cls) && !Void.class.equals(cls)) {
            xq0.x(hrg.r("Given internalKeyMananger ", j5Var.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
        this.a = j5Var;
    }

    public mka(Context context) {
        this.a = new pt0(context, (String) null);
    }

    public /* synthetic */ mka(Object obj) {
        this.a = obj;
    }

    public mka(Context context, String str) {
        this.a = new pt0(context, str);
    }

    public mka(rzb rzbVar) {
        rzbVar.getClass();
        this.a = rzbVar;
    }

    public mka(InputStream inputStream) {
        inputStream.getClass();
        this.a = new le4(inputStream, Charsets.UTF_8);
    }
}
