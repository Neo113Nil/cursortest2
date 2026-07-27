package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.xv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4183xv {

    /* renamed from: a, reason: collision with root package name */
    public final Xq f35071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35072b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35073c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35074d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f35075e;

    /* renamed from: f, reason: collision with root package name */
    public final Zt f35076f;

    /* renamed from: g, reason: collision with root package name */
    public final C2945au f35077g;

    /* renamed from: h, reason: collision with root package name */
    public final T2.a f35078h;
    public final C3441k7 i;

    public C4183xv(Xq xq, C5110a c5110a, String str, String str2, Context context, Zt zt, C2945au c2945au, T2.a aVar, C3441k7 c3441k7) {
        this.f35071a = xq;
        this.f35072b = c5110a.f41388n;
        this.f35073c = str;
        this.f35074d = str2;
        this.f35075e = context;
        this.f35076f = zt;
        this.f35077g = c2945au;
        this.f35078h = aVar;
        this.i = c3441k7;
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

    public final ArrayList b(Yt yt, St st, boolean z3, String str, String str2, List list, C3364ik c3364ik, X2.b bVar) {
        boolean z6;
        long j6;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c9 = c(c(c((String) it.next(), "@gw_adlocid@", ((C3052cu) yt.f28753a.f31863u).f29626g), "@gw_adnetrefresh@", true != z3 ? "0" : "1"), "@gw_sdkver@", this.f35072b);
            if (st != null) {
                String c10 = c(c(c(c9, "@gw_qdata@", st.f27652y), "@gw_adnetid@", st.f27650x), "@gw_allocid@", st.f27648w);
                HashMap hashMap = st.f27649w0;
                boolean z9 = st.f27603W;
                Context context = this.f35075e;
                c9 = AbstractC3043cl.g(c10, context, z9, hashMap);
                C3301ha c3301ha = AbstractC3569ma.ef;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && st.f27614e == 4) {
                    u2.D d2 = C4835j.f39730C.f39735c;
                    z6 = true;
                    c9 = c(c9, "@gw_aps@", true != u2.D.g(context) ? "0" : "1");
                } else {
                    z6 = true;
                }
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.pf)).booleanValue() && bVar != null) {
                    int i = bVar.f3771a;
                    String c11 = c(c9, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i6 = bVar.f3772b;
                    String c12 = c(c11, "@gw_fis@", i6 >= 0 ? Integer.toString(i6) : "");
                    int i9 = bVar.f3773c;
                    c9 = c(c12, "@gw_sfis@", i9 >= 0 ? Integer.toString(i9) : "");
                }
            } else {
                z6 = true;
            }
            Xq xq = this.f35071a;
            String c13 = c(c9, "@gw_adnetstatus@", xq.d());
            synchronized (xq) {
                j6 = xq.f28588h;
            }
            String c14 = c(c(c(c13, "@gw_ttr@", Long.toString(j6, 10)), "@gw_seqnum@", this.f35073c), "@gw_sessid@", this.f35074d);
            C3301ha c3301ha2 = AbstractC3569ma.nf;
            q2.r rVar2 = q2.r.f40204e;
            if (((Boolean) rVar2.f40207c.a(c3301ha2)).booleanValue()) {
                if (c3364ik != null) {
                    AtomicLong atomicLong = c3364ik.f31114a;
                    if (atomicLong.get() > 0) {
                        c14 = c(c14, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    }
                }
                c14 = c(c14, "@gw_placement_id@", "");
            }
            boolean z10 = false;
            if (((Boolean) rVar2.f40207c.a(AbstractC3569ma.f32365s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z10 = z6;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z11 = !isEmpty;
            if (!z10) {
                if (!isEmpty) {
                    z11 = z6;
                }
                arrayList.add(c14);
            }
            if (this.i.a(Uri.parse(c14))) {
                Uri.Builder buildUpon = Uri.parse(c14).buildUpon();
                if (z10) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z11) {
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
