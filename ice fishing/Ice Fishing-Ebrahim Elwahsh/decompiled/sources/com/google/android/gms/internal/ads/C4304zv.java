package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4304zv {

    /* renamed from: a, reason: collision with root package name */
    public final C2950ar f35633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f35634b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35635c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35636d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f35637e;

    /* renamed from: f, reason: collision with root package name */
    public final C3008bu f35638f;

    /* renamed from: g, reason: collision with root package name */
    public final C3116du f35639g;

    /* renamed from: h, reason: collision with root package name */
    public final S2.a f35640h;
    public final C3348i7 i;

    public C4304zv(C2950ar c2950ar, C5107a c5107a, String str, String str2, Context context, C3008bu c3008bu, C3116du c3116du, S2.a aVar, C3348i7 c3348i7) {
        this.f35633a = c2950ar;
        this.f35634b = c5107a.f41217n;
        this.f35635c = str;
        this.f35636d = str2;
        this.f35637e = context;
        this.f35638f = c3008bu;
        this.f35639g = c3116du;
        this.f35640h = aVar;
        this.i = c3348i7;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(C2953au c2953au, Ut ut, List list) {
        return b(c2953au, ut, false, "", "", list, null, null);
    }

    public final ArrayList b(C2953au c2953au, Ut ut, boolean z8, String str, String str2, List list, C3270gk c3270gk, W2.b bVar) {
        boolean z9;
        long j9;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c4 = c(c(c((String) it.next(), "@gw_adlocid@", ((C3226fu) c2953au.f29348a.f26393u).f30904g), "@gw_adnetrefresh@", true != z8 ? "0" : "1"), "@gw_sdkver@", this.f35634b);
            if (ut != null) {
                String c9 = c(c(c(c4, "@gw_qdata@", ut.f28185y), "@gw_adnetid@", ut.f28183x), "@gw_allocid@", ut.f28181w);
                HashMap hashMap = ut.f28182w0;
                boolean z10 = ut.f28136W;
                Context context = this.f35637e;
                c4 = AbstractC3035cL.g(c9, context, z10, hashMap);
                C3151ea c3151ea = AbstractC3368ia.Ye;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && ut.f28147e == 4) {
                    t2.G g9 = p2.j.f39798C.f39803c;
                    z9 = true;
                    c4 = c(c4, "@gw_aps@", true != t2.G.g(context) ? "0" : "1");
                } else {
                    z9 = true;
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.jf)).booleanValue() && bVar != null) {
                    int i = bVar.f3423a;
                    String c10 = c(c4, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i4 = bVar.f3424b;
                    String c11 = c(c10, "@gw_fis@", i4 >= 0 ? Integer.toString(i4) : "");
                    int i9 = bVar.f3425c;
                    c4 = c(c11, "@gw_sfis@", i9 >= 0 ? Integer.toString(i9) : "");
                }
            } else {
                z9 = true;
            }
            C2950ar c2950ar = this.f35633a;
            String c12 = c(c4, "@gw_adnetstatus@", c2950ar.d());
            synchronized (c2950ar) {
                j9 = c2950ar.f29344h;
            }
            String c13 = c(c(c(c12, "@gw_ttr@", Long.toString(j9, 10)), "@gw_seqnum@", this.f35635c), "@gw_sessid@", this.f35636d);
            C3151ea c3151ea2 = AbstractC3368ia.hf;
            q2.r rVar2 = q2.r.f40116e;
            if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                if (c3270gk != null) {
                    AtomicLong atomicLong = c3270gk.f31098a;
                    if (atomicLong.get() > 0) {
                        c13 = c(c13, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    }
                }
                c13 = c(c13, "@gw_placement_id@", "");
            }
            boolean z11 = false;
            if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31783s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = z9;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z12 = !isEmpty;
            if (!z11) {
                if (!isEmpty) {
                    z12 = z9;
                }
                arrayList.add(c13);
            }
            if (this.i.a(Uri.parse(c13))) {
                Uri.Builder buildUpon = Uri.parse(c13).buildUpon();
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c13 = buildUpon.build().toString();
                arrayList.add(c13);
            }
            arrayList.add(c13);
        }
        return arrayList;
    }
}
