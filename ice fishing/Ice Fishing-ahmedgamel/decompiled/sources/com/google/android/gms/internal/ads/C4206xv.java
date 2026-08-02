package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.xv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4206xv {

    /* renamed from: a, reason: collision with root package name */
    public final Xq f35857a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35858b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35859c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35860d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f35861e;

    /* renamed from: f, reason: collision with root package name */
    public final Zt f35862f;

    /* renamed from: g, reason: collision with root package name */
    public final C2968au f35863g;

    /* renamed from: h, reason: collision with root package name */
    public final V2.a f35864h;
    public final C3464k7 i;

    public C4206xv(Xq xq, C5189a c5189a, String str, String str2, Context context, Zt zt, C2968au c2968au, V2.a aVar, C3464k7 c3464k7) {
        this.f35857a = xq;
        this.f35858b = c5189a.f41845n;
        this.f35859c = str;
        this.f35860d = str2;
        this.f35861e = context;
        this.f35862f = zt;
        this.f35863g = c2968au;
        this.f35864h = aVar;
        this.i = c3464k7;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(Yt yt, St st, List list) {
        return b(yt, st, false, "", "", list, null, null);
    }

    public final ArrayList b(Yt yt, St st, boolean z6, String str, String str2, List list, C3387ik c3387ik, A3.r rVar) {
        boolean z9;
        long j6;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c9 = c(c(c((String) it.next(), "@gw_adlocid@", ((C3075cu) yt.f29532a.f32643u).f30396g), "@gw_adnetrefresh@", true != z6 ? "0" : "1"), "@gw_sdkver@", this.f35858b);
            if (st != null) {
                String c10 = c(c(c(c9, "@gw_qdata@", st.f28435y), "@gw_adnetid@", st.f28433x), "@gw_allocid@", st.f28431w);
                HashMap hashMap = st.f28432w0;
                boolean z10 = st.f28386W;
                Context context = this.f35861e;
                c9 = AbstractC3066cl.g(c10, context, z10, hashMap);
                C3324ha c3324ha = AbstractC3592ma.ef;
                s2.r rVar2 = s2.r.f40506e;
                if (((Boolean) rVar2.f40509c.a(c3324ha)).booleanValue() && st.f28397e == 4) {
                    w2.D d9 = C4906k.f40186C.f40191c;
                    z9 = true;
                    c9 = c(c9, "@gw_aps@", true != w2.D.g(context) ? "0" : "1");
                } else {
                    z9 = true;
                }
                if (((Boolean) rVar2.f40509c.a(AbstractC3592ma.pf)).booleanValue() && rVar != null) {
                    int i = rVar.f184a;
                    String c11 = c(c9, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i4 = rVar.f185b;
                    String c12 = c(c11, "@gw_fis@", i4 >= 0 ? Integer.toString(i4) : "");
                    int i6 = rVar.f186c;
                    c9 = c(c12, "@gw_sfis@", i6 >= 0 ? Integer.toString(i6) : "");
                }
            } else {
                z9 = true;
            }
            Xq xq = this.f35857a;
            String c13 = c(c9, "@gw_adnetstatus@", xq.d());
            synchronized (xq) {
                j6 = xq.f29369h;
            }
            String c14 = c(c(c(c13, "@gw_ttr@", Long.toString(j6, 10)), "@gw_seqnum@", this.f35859c), "@gw_sessid@", this.f35860d);
            C3324ha c3324ha2 = AbstractC3592ma.nf;
            s2.r rVar3 = s2.r.f40506e;
            if (((Boolean) rVar3.f40509c.a(c3324ha2)).booleanValue()) {
                if (c3387ik != null) {
                    AtomicLong atomicLong = c3387ik.f31884a;
                    if (atomicLong.get() > 0) {
                        c14 = c(c14, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    }
                }
                c14 = c(c14, "@gw_placement_id@", "");
            }
            boolean z11 = false;
            if (((Boolean) rVar3.f40509c.a(AbstractC3592ma.f33144s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = z9;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z12 = !isEmpty;
            if (!z11) {
                if (!isEmpty) {
                    z12 = z9;
                }
                arrayList.add(c14);
            }
            if (this.i.a(Uri.parse(c14))) {
                Uri.Builder buildUpon = Uri.parse(c14).buildUpon();
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c14 = buildUpon.build().toString();
                arrayList.add(c14);
            }
            arrayList.add(c14);
        }
        return arrayList;
    }
}
