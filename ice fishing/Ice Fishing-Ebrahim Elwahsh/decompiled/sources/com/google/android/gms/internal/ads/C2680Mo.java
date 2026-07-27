package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2680Mo {

    /* renamed from: a, reason: collision with root package name */
    public final C2527Do f26375a;

    /* renamed from: b, reason: collision with root package name */
    public final C2764Rn f26376b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26377c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26378d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f26379e;

    public C2680Mo(C2527Do c2527Do, C2764Rn c2764Rn) {
        this.f26375a = c2527Do;
        this.f26376b = c2764Rn;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f26377c) {
            try {
                if (!this.f26379e) {
                    C2527Do c2527Do = this.f26375a;
                    if (!c2527Do.f24556b) {
                        BinderC2646Ko binderC2646Ko = new BinderC2646Ko(this);
                        C2527Do c2527Do2 = this.f26375a;
                        c2527Do2.getClass();
                        c2527Do2.f24559e.f31242n.c(new MD(29, c2527Do2, binderC2646Ko), c2527Do2.f24563j);
                        return jSONArray;
                    }
                    b(c2527Do.b());
                }
                Iterator it = this.f26378d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2663Lo) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        String str;
        String str2;
        C2754Rd c2754Rd;
        C2747Qn b9;
        C2754Rd c2754Rd2;
        synchronized (this.f26377c) {
            try {
                if (this.f26379e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4015uc c4015uc = (C4015uc) it.next();
                    C3151ea c3151ea = AbstractC3368ia.Ga;
                    q2.r rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                        C2747Qn b10 = this.f26376b.b(c4015uc.f34620n);
                        if (b10 != null && (c2754Rd2 = b10.f27215c) != null) {
                            str = c2754Rd2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z8 = ((Boolean) rVar.f40119c.a(AbstractC3368ia.Ha)).booleanValue() && (b9 = this.f26376b.b(c4015uc.f34620n)) != null && b9.f27216d;
                    ArrayList arrayList = this.f26378d;
                    String str4 = c4015uc.f34620n;
                    C2747Qn b11 = this.f26376b.b(str4);
                    if (b11 != null && (c2754Rd = b11.f27214b) != null) {
                        str2 = c2754Rd.toString();
                        arrayList.add(new C2663Lo(str4, str3, str2, c4015uc.f34621u ? 1 : 0, c4015uc.f34623w, c4015uc.f34622v, z8));
                    }
                    str2 = "";
                    arrayList.add(new C2663Lo(str4, str3, str2, c4015uc.f34621u ? 1 : 0, c4015uc.f34623w, c4015uc.f34622v, z8));
                }
                this.f26379e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
