package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.TextureView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.k0;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.coroutines.a;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class bjt implements uzt, upr, ib7 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public bjt(List list) {
        int i;
        this.a = new d7k();
        this.b = new d7k();
        ziu ziuVar = new ziu();
        this.c = ziuVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i2 = dvt.a;
        for (String str : trim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] split = str.substring(9).split(StringUtils.COMMA, -1);
                ziuVar.d = new int[split.length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int[] iArr = ziuVar.d;
                    try {
                        i = Integer.parseInt(split[i3].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i3] = i;
                }
            } else if (str.startsWith("size: ")) {
                String[] split2 = str.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        ziuVar.e = Integer.parseInt(split2[0]);
                        ziuVar.f = Integer.parseInt(split2[1]);
                        ziuVar.b = true;
                    } catch (RuntimeException e) {
                        vq1.o0("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public static ajt q(yit yitVar, rht rhtVar, String str, String str2, int i, String str3, Integer num) {
        String str4;
        pkb pkbVar;
        wjb wjbVar;
        boolean z = yitVar instanceof o20;
        if (z) {
            str4 = ((o20) yitVar).a.a;
        } else if (yitVar instanceof hm1) {
            str4 = ((hm1) yitVar).a.a;
        } else if (yitVar instanceof te4) {
            str4 = ((te4) yitVar).a.a;
        } else if (yitVar instanceof r1g) {
            str4 = ((r1g) yitVar).a.a;
        } else if (yitVar instanceof a2g) {
            str4 = ((a2g) yitVar).a.f;
        } else if (yitVar instanceof e6i) {
            str4 = ((e6i) yitVar).a;
        } else if (yitVar instanceof fej) {
            str4 = ((fej) yitVar).a.a;
        } else if (yitVar instanceof umk) {
            str4 = ((umk) yitVar).a.f;
        } else if (yitVar instanceof s3m) {
            str4 = ((s3m) yitVar).a.f;
        } else {
            if (!(yitVar instanceof llu)) {
                b6e.s();
                return null;
            }
            str4 = ((llu) yitVar).a.a;
        }
        String str5 = str4;
        if (z) {
            pkbVar = pkb.Album;
        } else if (yitVar instanceof hm1) {
            pkbVar = pkb.Artist;
        } else if (yitVar instanceof te4) {
            pkbVar = pkb.Album;
        } else if (yitVar instanceof r1g) {
            pkbVar = pkb.Album;
        } else if (yitVar instanceof a2g) {
            pkbVar = pkb.Playlist;
        } else if (yitVar instanceof e6i) {
            pkbVar = pkb.Shortcut;
        } else if (yitVar instanceof fej) {
            pkbVar = pkb.Album;
        } else if (yitVar instanceof umk) {
            pkbVar = pkb.Playlist;
        } else if (yitVar instanceof s3m) {
            pkbVar = pkb.Playlist;
        } else {
            if (!(yitVar instanceof llu)) {
                b6e.s();
                return null;
            }
            pkbVar = pkb.Wave;
        }
        pkb pkbVar2 = pkbVar;
        if (z) {
            wjbVar = wjb.AlbumScreen;
        } else if (yitVar instanceof hm1) {
            wjbVar = wjb.ArtistScreen;
        } else if (yitVar instanceof te4) {
            wjbVar = wjb.AlbumScreen;
        } else if (yitVar instanceof r1g) {
            wjbVar = wjb.AlbumScreen;
        } else if (yitVar instanceof a2g) {
            wjbVar = wjb.PlaylistScreen;
        } else if (yitVar instanceof e6i) {
            wjbVar = wjb.Link;
        } else if (yitVar instanceof fej) {
            wjbVar = wjb.AlbumScreen;
        } else if (yitVar instanceof umk) {
            wjbVar = wjb.PlaylistScreen;
        } else {
            if (!(yitVar instanceof s3m)) {
                if (yitVar instanceof llu) {
                    xq0.q("wave agent do not support navigation");
                    return null;
                }
                b6e.s();
                return null;
            }
            wjbVar = wjb.PlaylistScreen;
        }
        wjb wjbVar2 = wjbVar;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return new ajt(rhtVar, str5, str, c.r(upperCase, "-", "_", false), pkbVar2, i + 1, str3 == null ? "" : str3, wjbVar2, num.intValue());
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        if (((cn0) this.b) == null) {
            this.b = cn0Var.c();
        }
        cn0 cn0Var4 = (cn0) this.b;
        if (cn0Var4 == null) {
            Intrinsics.j("valueVector");
            throw null;
        }
        int b = cn0Var4.b();
        int i = 0;
        while (true) {
            cn0 cn0Var5 = (cn0) this.b;
            if (i >= b) {
                if (cn0Var5 != null) {
                    return cn0Var5;
                }
                Intrinsics.j("valueVector");
                throw null;
            }
            if (cn0Var5 == null) {
                Intrinsics.j("valueVector");
                throw null;
            }
            cn0Var5.e(i, ((dn0) this.a).get(i).c(j, cn0Var.a(i), cn0Var2.a(i), cn0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.ib7
    public va7 b(t6t t6tVar) {
        poj pojVar = new poj((OkHttpClient) this.b);
        pojVar.f = new cp3(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
        pojVar.e = t6tVar;
        hl5 hl5Var = new hl5(1, (z66) this.c, new hl5((Context) this.a, pojVar));
        ip3 ip3Var = new ip3();
        so3 so3Var = (so3) this.d;
        ip3Var.a = so3Var;
        ip3Var.f = hl5Var;
        ip3Var.b = new l9c();
        qxp qxpVar = new qxp();
        qxpVar.a = so3Var;
        ip3Var.c = qxpVar;
        ip3Var.e = false;
        ip3Var.i = 3;
        ip3Var.d = new tiu(7);
        return ip3Var;
    }

    public void c(List list) {
        list.getClass();
        HashMap hashMap = (HashMap) this.b;
        List list2 = list;
        List list3 = list2;
        HashMap I = gdg.I(list2.size());
        for (Object obj : list3) {
            mqs mqsVar = (mqs) obj;
            mqsVar.getClass();
            I.put(ngg.q(mqsVar), obj);
        }
        hashMap.putAll(I);
    }

    public void d(List list) {
        HashMap hashMap = (HashMap) this.c;
        List list2 = list;
        List list3 = list2;
        HashMap I = gdg.I(list2.size());
        for (Object obj : list3) {
            x1u x1uVar = (x1u) obj;
            x1uVar.getClass();
            I.put(new miw(x1uVar.a), obj);
        }
        hashMap.putAll(I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(cg6 cg6Var) {
        m7u m7uVar;
        Object obj;
        int i;
        cr crVar;
        if (cg6Var instanceof m7u) {
            m7uVar = (m7u) cg6Var;
            int i2 = m7uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m7uVar.m = i2 - Integer.MIN_VALUE;
                obj = m7uVar.k;
                Object obj2 = nm6.a;
                i = m7uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    crVar = (cr) this.d;
                    if (crVar == null) {
                        return null;
                    }
                    m7uVar.j = crVar;
                    m7uVar.m = 1;
                    obj = crVar.l0(m7uVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        this.d = null;
                        return obj;
                    }
                    crVar = m7uVar.j;
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.d = null;
                    return null;
                }
                m7uVar.j = null;
                m7uVar.m = 2;
                obj = l(crVar, m7uVar);
            }
        }
        m7uVar = new m7u(this, cg6Var);
        obj = m7uVar.k;
        Object obj22 = nm6.a;
        i = m7uVar.m;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(cg6 cg6Var) {
        n7u n7uVar;
        Object obj;
        int i;
        cr crVar;
        if (cg6Var instanceof n7u) {
            n7uVar = (n7u) cg6Var;
            int i2 = n7uVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n7uVar.m = i2 - Integer.MIN_VALUE;
                obj = n7uVar.k;
                Object obj2 = nm6.a;
                i = n7uVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    crVar = (cr) this.d;
                    if (crVar != null) {
                        n7uVar.j = crVar;
                        n7uVar.m = 1;
                        obj = crVar.l0(n7uVar);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    x7u x7uVar = (x7u) obj;
                    this.d = null;
                    return x7uVar;
                }
                crVar = n7uVar.j;
                qgg.h0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    this.d = null;
                    return null;
                }
                if (((ou7) crVar.i).X()) {
                    n7uVar.j = null;
                    n7uVar.m = 2;
                    obj = l(crVar, n7uVar);
                }
                return null;
            }
        }
        n7uVar = new n7u(this, cg6Var);
        obj = n7uVar.k;
        Object obj22 = nm6.a;
        i = n7uVar.m;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public Object g(String str, f7u f7uVar, cg6 cg6Var) {
        List list;
        e7u e7uVar = f7uVar.c;
        List list2 = f7uVar.a;
        List list3 = f7uVar.b;
        Integer num = new Integer(e7uVar.b);
        int intValue = num.intValue();
        Integer num2 = null;
        if (intValue < 0 || intValue >= list3.size()) {
            num = null;
        }
        Integer num3 = new Integer(list3.size());
        int intValue2 = num3.intValue();
        if (intValue2 > 0 && num != null && num.intValue() < intValue2) {
            num2 = num3;
        }
        if (num == null || num2 == null) {
            list = list2;
        } else {
            List list4 = list2;
            List subList = list3.subList(num.intValue(), num2.intValue());
            ArrayList arrayList = new ArrayList(v75.o(subList, 10));
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(((s7u) it.next()).b.a);
            }
            list = CollectionsKt.g0(list4, arrayList);
        }
        return ((vw5) this.a).c(str, list, cg6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(defpackage.q7g.G(r13.e()), defpackage.gut.F(r12)) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public faq h(wwk wwkVar, f fVar, e6v e6vVar, long j, gxc gxcVar) {
        Pair pair;
        Object obj;
        wfw wfwVar = (wfw) this.a;
        kiw kiwVar = wwkVar.a;
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.d;
        fVar.getClass();
        izs izsVar = e6vVar;
        if (e6vVar == null) {
            izsVar = hzs.a;
        }
        izs izsVar2 = izsVar;
        faq faqVar = (faq) hashMap2.get(wwkVar);
        Pair pair2 = null;
        if (faqVar != null) {
            if (q7g.I(faqVar.e()).equals(izsVar2)) {
                uow e = faqVar.e();
                e.getClass();
                row rowVar = e.g;
                pow powVar = rowVar instanceof pow ? (pow) rowVar : null;
                Integer valueOf = powVar != null ? Integer.valueOf(powVar.b) : null;
                k0 x = fVar.B() ? fVar.x() : null;
                if (Intrinsics.d(valueOf, x != null ? Integer.valueOf(x.j()) : null)) {
                }
            }
            faqVar = null;
            if (faqVar != null) {
                return faqVar;
            }
        }
        mqs mqsVar = (mqs) hashMap.get(kiwVar);
        if (mqsVar != null) {
            pair = new Pair(mqsVar, kiwVar);
        } else {
            Set entrySet = hashMap.entrySet();
            entrySet.getClass();
            if (kiwVar instanceof iiw) {
                Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.d(((iiw) ((Map.Entry) obj).getKey()).c, ((iiw) kiwVar).c)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    pair2 = new Pair(entry.getValue(), entry.getKey());
                }
            }
            pair = pair2;
        }
        if (pair != null) {
            faq o = ngg.o(fVar, wfwVar, (kiw) pair.b, izsVar2, pair.a, j, gxcVar);
            hashMap2.put(wwkVar, o);
            return o;
        }
        x1u x1uVar = (x1u) ((HashMap) this.c).get(kiwVar);
        if (x1uVar == null) {
            return ngg.n(fVar, wfwVar, kiwVar, izsVar2, j);
        }
        faq o2 = ngg.o(fVar, wfwVar, kiwVar, izsVar2, x1uVar, j, gxcVar);
        hashMap2.put(wwkVar, o2);
        return o2;
    }

    @Override // defpackage.upr
    public void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        qsn qsnVar;
        Rect rect;
        d7k d7kVar = (d7k) this.a;
        d7kVar.F(i + i2, bArr);
        d7kVar.H(i);
        d7k d7kVar2 = (d7k) this.b;
        ziu ziuVar = (ziu) this.c;
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        Inflater inflater = (Inflater) this.d;
        int i3 = dvt.a;
        if (d7kVar.a() > 0 && d7kVar.e() == 120 && dvt.S(d7kVar, d7kVar2, inflater)) {
            d7kVar.F(d7kVar2.c, d7kVar2.a);
        }
        ziuVar.c = false;
        rv6 rv6Var = null;
        ziuVar.g = null;
        ziuVar.h = -1;
        ziuVar.i = -1;
        int a = d7kVar.a();
        if (a >= 2 && d7kVar.B() == a) {
            int[] iArr = ziuVar.d;
            if (iArr != null && ziuVar.b) {
                d7kVar.I(d7kVar.B() - 2);
                int B = d7kVar.B();
                int[] iArr2 = ziuVar.a;
                while (d7kVar.b < B && d7kVar.a() > 0) {
                    switch (d7kVar.v()) {
                        case 3:
                            if (d7kVar.a() < 2) {
                                break;
                            } else {
                                int v = d7kVar.v();
                                int v2 = d7kVar.v();
                                iArr2[3] = ziu.a(iArr, v >> 4);
                                iArr2[2] = ziu.a(iArr, v & 15);
                                iArr2[1] = ziu.a(iArr, v2 >> 4);
                                iArr2[0] = ziu.a(iArr, v2 & 15);
                                ziuVar.c = true;
                            }
                        case 4:
                            if (d7kVar.a() >= 2 && ziuVar.c) {
                                int v3 = d7kVar.v();
                                int v4 = d7kVar.v();
                                iArr2[3] = ziu.c(iArr2[3], v3 >> 4);
                                iArr2[2] = ziu.c(iArr2[2], v3 & 15);
                                iArr2[1] = ziu.c(iArr2[1], v4 >> 4);
                                iArr2[0] = ziu.c(iArr2[0], v4 & 15);
                            }
                            break;
                        case 5:
                            if (d7kVar.a() < 6) {
                                break;
                            } else {
                                int v5 = d7kVar.v();
                                int v6 = d7kVar.v();
                                int i4 = (v5 << 4) | (v6 >> 4);
                                int v7 = ((v6 & 15) << 8) | d7kVar.v();
                                int v8 = d7kVar.v();
                                int v9 = d7kVar.v();
                                ziuVar.g = new Rect(i4, (v8 << 4) | (v9 >> 4), v7 + 1, (((v9 & 15) << 8) | d7kVar.v()) + 1);
                            }
                        case 6:
                            if (d7kVar.a() < 4) {
                                break;
                            } else {
                                ziuVar.h = d7kVar.B();
                                ziuVar.i = d7kVar.B();
                            }
                    }
                }
            }
            if (ziuVar.d != null && ziuVar.b && ziuVar.c && (rect = ziuVar.g) != null && ziuVar.h != -1 && ziuVar.i != -1 && rect.width() >= 2 && ziuVar.g.height() >= 2) {
                Rect rect2 = ziuVar.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                v94 v94Var = new v94();
                d7kVar.H(ziuVar.h);
                v94Var.p(d7kVar);
                ziuVar.b(v94Var, true, rect2, iArr3);
                d7kVar.H(ziuVar.i);
                v94Var.p(d7kVar);
                ziuVar.b(v94Var, false, rect2, iArr3);
                rv6Var = new rv6(null, null, null, Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / ziuVar.f, 0, 0, rect2.left / ziuVar.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / ziuVar.e, rect2.height() / ziuVar.f, false, -16777216, Integer.MIN_VALUE, 0.0f);
            }
        }
        if (rv6Var != null) {
            qsnVar = yde.y(rv6Var);
        } else {
            ude udeVar = yde.b;
            qsnVar = qsn.e;
        }
        ua6Var.accept(new uv6(-9223372036854775807L, 5000000L, qsnVar));
    }

    public bfu j(lm4 lm4Var, String str) {
        bfu bfuVar;
        bfu b;
        lm4Var.getClass();
        synchronized (((jzk) this.d)) {
            try {
                jfu jfuVar = (jfu) this.a;
                jfuVar.getClass();
                bfuVar = (bfu) jfuVar.a.get(str);
                if (lm4Var.i(bfuVar)) {
                    Object obj = (gfu) this.b;
                    if (obj instanceof ifu) {
                        bfuVar.getClass();
                        ((ifu) obj).d(bfuVar);
                    }
                    bfuVar.getClass();
                } else {
                    noi noiVar = new noi((is6) this.c);
                    noiVar.a.put(bnd.d, str);
                    gfu gfuVar = (gfu) this.b;
                    gfuVar.getClass();
                    try {
                        try {
                            b = gfuVar.a(lm4Var, noiVar);
                        } catch (AbstractMethodError unused) {
                            Class b2 = lm4Var.b();
                            b2.getClass();
                            b = gfuVar.b(b2);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class b3 = lm4Var.b();
                        b3.getClass();
                        b = gfuVar.c(b3, noiVar);
                    }
                    bfuVar = b;
                    jfu jfuVar2 = (jfu) this.a;
                    jfuVar2.getClass();
                    bfuVar.getClass();
                    bfu bfuVar2 = (bfu) jfuVar2.a.put(str, bfuVar);
                    if (bfuVar2 != null) {
                        bfuVar2.clear$lifecycle_viewmodel_release();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bfuVar;
    }

    public void k(HashSet hashSet) {
        Set keySet = ((HashMap) this.b).keySet();
        keySet.getClass();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            ((iiw) it.next()).getClass();
            if (!hashSet.contains(r1)) {
                it.remove();
            }
        }
        Set keySet2 = ((HashMap) this.c).keySet();
        keySet2.getClass();
        Iterator it2 = keySet2.iterator();
        while (it2.hasNext()) {
            ((miw) it2.next()).getClass();
            if (!hashSet.contains(r1)) {
                it2.remove();
            }
        }
        Set keySet3 = ((HashMap) this.d).keySet();
        keySet3.getClass();
        Iterator it3 = keySet3.iterator();
        while (it3.hasNext()) {
            ((wwk) it3.next()).getClass();
            if (!hashSet.contains(r1.a)) {
                it3.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(cr crVar, cg6 cg6Var) {
        o7u o7uVar;
        int i;
        try {
            if (cg6Var instanceof o7u) {
                o7uVar = (o7u) cg6Var;
                int i2 = o7uVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    o7uVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = o7uVar.j;
                    nm6 nm6Var = nm6.a;
                    i = o7uVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        o7uVar.l = 1;
                        obj = ((ou7) crVar.i).s(o7uVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return (x7u) obj;
                }
            }
            if (i != 0) {
            }
            return (x7u) obj;
        } catch (IOException e) {
            ssg.a(6, "VideoClipRadioProlongationOwnerImpl", "Prolongation operation completed with exception", e);
            return null;
        }
        o7uVar = new o7u(this, cg6Var);
        Object obj2 = o7uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = o7uVar.l;
    }

    @Override // defpackage.rzt
    public long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        int b = cn0Var.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((dn0) this.a).get(i).e(cn0Var.a(i), cn0Var2.a(i), cn0Var3.a(i)));
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(cg6 cg6Var) {
        p7u p7uVar;
        int i;
        boolean z;
        if (cg6Var instanceof p7u) {
            p7uVar = (p7u) cg6Var;
            int i2 = p7uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p7uVar.l = i2 - Integer.MIN_VALUE;
                Object obj = p7uVar.j;
                nm6 nm6Var = nm6.a;
                i = p7uVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cr crVar = (cr) this.d;
                    if (crVar == null) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    p7uVar.l = 1;
                    obj = crVar.k0(p7uVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z);
            }
        }
        p7uVar = new p7u(this, cg6Var);
        Object obj2 = p7uVar.j;
        nm6 nm6Var2 = nm6.a;
        i = p7uVar.l;
        if (i != 0) {
        }
        z = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z);
    }

    public void r() {
        int c;
        c5p c5pVar = (c5p) this.b;
        uiq uiqVar = (uiq) this.a;
        ViewPager2 viewPager2 = (ViewPager2) this.d;
        int i = R.id.accessibilityActionPageLeft;
        wdu.n(R.id.accessibilityActionPageLeft, viewPager2);
        wdu.k(0, viewPager2);
        wdu.n(R.id.accessibilityActionPageRight, viewPager2);
        wdu.k(0, viewPager2);
        wdu.n(R.id.accessibilityActionPageUp, viewPager2);
        wdu.k(0, viewPager2);
        wdu.n(R.id.accessibilityActionPageDown, viewPager2);
        wdu.k(0, viewPager2);
        if (viewPager2.getAdapter() == null || (c = viewPager2.getAdapter().c()) == 0 || !viewPager2.r) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.d < c - 1) {
                wdu.o(viewPager2, new qb(R.id.accessibilityActionPageDown, (String) null), null, uiqVar);
            }
            if (viewPager2.d > 0) {
                wdu.o(viewPager2, new qb(R.id.accessibilityActionPageUp, (String) null), null, c5pVar);
                return;
            }
            return;
        }
        boolean z = viewPager2.g.b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.d < c - 1) {
            wdu.o(viewPager2, new qb(i2, (String) null), null, uiqVar);
        }
        if (viewPager2.d > 0) {
            wdu.o(viewPager2, new qb(i, (String) null), null, c5pVar);
        }
    }

    @Override // defpackage.rzt
    public cn0 v(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        if (((cn0) this.d) == null) {
            this.d = cn0Var3.c();
        }
        cn0 cn0Var4 = (cn0) this.d;
        if (cn0Var4 == null) {
            Intrinsics.j("endVelocityVector");
            throw null;
        }
        int b = cn0Var4.b();
        int i = 0;
        while (true) {
            cn0 cn0Var5 = (cn0) this.d;
            if (i >= b) {
                if (cn0Var5 != null) {
                    return cn0Var5;
                }
                Intrinsics.j("endVelocityVector");
                throw null;
            }
            if (cn0Var5 == null) {
                Intrinsics.j("endVelocityVector");
                throw null;
            }
            cn0Var5.e(i, ((dn0) this.a).get(i).b(cn0Var.a(i), cn0Var2.a(i), cn0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        if (((cn0) this.c) == null) {
            this.c = cn0Var3.c();
        }
        cn0 cn0Var4 = (cn0) this.c;
        if (cn0Var4 == null) {
            Intrinsics.j("velocityVector");
            throw null;
        }
        int b = cn0Var4.b();
        int i = 0;
        while (true) {
            cn0 cn0Var5 = (cn0) this.c;
            if (i >= b) {
                if (cn0Var5 != null) {
                    return cn0Var5;
                }
                Intrinsics.j("velocityVector");
                throw null;
            }
            if (cn0Var5 == null) {
                Intrinsics.j("velocityVector");
                throw null;
            }
            cn0Var5.e(i, ((dn0) this.a).get(i).d(j, cn0Var.a(i), cn0Var2.a(i), cn0Var3.a(i)));
            i++;
        }
    }

    @Override // defpackage.upr
    public int y() {
        return 2;
    }

    public bjt(jfu jfuVar) {
        this.a = new ybf(ern.a(zqj.class), new r71(jfuVar, 10), new xpp(28, new wuu(23)));
        this.b = l18.b.b(hag.I(oq7.class), true);
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: m0v
            public final /* synthetic */ bjt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((zqj) ((ybf) this.b.a).getValue()).m;
                    default:
                        bjt bjtVar = this.b;
                        return zsd.M0(new mpq(28, ((oq7) ((jyr) bjtVar.b).getValue()).a.c, bjtVar), new tn2(3, 16, null));
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: m0v
            public final /* synthetic */ bjt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((zqj) ((ybf) this.b.a).getValue()).m;
                    default:
                        bjt bjtVar = this.b;
                        return zsd.M0(new mpq(28, ((oq7) ((jyr) bjtVar.b).getValue()).a.c, bjtVar), new tn2(3, 16, null));
                }
            }
        });
    }

    public bjt(av0 av0Var, cst cstVar, jyr jyrVar, jyr jyrVar2) {
        this.a = cstVar;
        this.b = jyrVar;
        this.c = jyrVar2;
        dq7 dq7Var = ca8.a;
        this.d = gld.e(j5h.a);
    }

    public bjt(fnb fnbVar, cvo cvoVar, gjt gjtVar) {
        fnbVar.getClass();
        gjtVar.getClass();
        this.a = fnbVar;
        this.b = cvoVar;
        this.c = gjtVar;
        this.d = qld.m();
    }

    public bjt(TextureView textureView, g40 g40Var, jd6 jd6Var) {
        g40Var.getClass();
        jd6Var.getClass();
        this.a = textureView;
        ssg.a(3, null, "VideoPlayerView init", null);
        this.c = new b7t(jd6Var, g40Var, textureView, textureView);
    }

    public bjt(jfu jfuVar, gfu gfuVar, is6 is6Var) {
        jfuVar.getClass();
        gfuVar.getClass();
        is6Var.getClass();
        this.a = jfuVar;
        this.b = gfuVar;
        this.c = is6Var;
        this.d = new jzk(5);
    }

    public bjt(Executor executor, bko bkoVar, ime imeVar, bko bkoVar2) {
        this.a = executor;
        this.b = bkoVar;
        this.c = imeVar;
        this.d = bkoVar2;
    }

    public bjt(Context context, m mVar, kxi kxiVar, dda ddaVar) {
        context.getClass();
        kxiVar.getClass();
        this.a = context;
        this.b = mVar;
        this.c = kxiVar;
        this.d = ddaVar;
    }

    public bjt(vw5 vw5Var, xdr xdrVar, a aVar) {
        aVar.getClass();
        this.a = vw5Var;
        this.b = xdrVar;
        this.c = aVar;
    }

    public bjt(Context context, OkHttpClient okHttpClient, z66 z66Var, so3 so3Var) {
        okHttpClient.getClass();
        so3Var.getClass();
        this.a = context;
        this.b = okHttpClient;
        this.c = z66Var;
        this.d = so3Var;
    }

    public bjt(wfw wfwVar) {
        this.a = wfwVar;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
    }

    public bjt(dn0 dn0Var) {
        this.a = dn0Var;
    }

    public bjt(qic qicVar) {
        this(new knn(15, qicVar));
    }

    public bjt(ViewPager2 viewPager2) {
        this.d = viewPager2;
        this.a = new uiq(9, this);
        this.b = new c5p(12, this);
    }
}
