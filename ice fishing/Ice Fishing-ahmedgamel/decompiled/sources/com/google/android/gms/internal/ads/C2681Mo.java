package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2681Mo {

    /* renamed from: a, reason: collision with root package name */
    public final C2494Bo f26335a;

    /* renamed from: b, reason: collision with root package name */
    public final C2731Pn f26336b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26337c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26338d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f26339e;

    public C2681Mo(C2494Bo c2494Bo, C2731Pn c2731Pn) {
        this.f26335a = c2494Bo;
        this.f26336b = c2731Pn;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f26337c) {
            try {
                if (!this.f26339e) {
                    C2494Bo c2494Bo = this.f26335a;
                    if (!c2494Bo.f23954b) {
                        BinderC2647Ko binderC2647Ko = new BinderC2647Ko(this);
                        C2494Bo c2494Bo2 = this.f26335a;
                        c2494Bo2.getClass();
                        c2494Bo2.f23957e.f31479n.a(new RunnableC3973u0(28, c2494Bo2, binderC2647Ko), c2494Bo2.f23961j);
                        return jSONArray;
                    }
                    b(c2494Bo.b());
                }
                Iterator it = this.f26338d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2664Lo) it.next()).a());
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
        C2804Ud c2804Ud;
        C2714On b9;
        C2804Ud c2804Ud2;
        synchronized (this.f26337c) {
            try {
                if (this.f26339e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4272zc c4272zc = (C4272zc) it.next();
                    C3301ha c3301ha = AbstractC3569ma.Ga;
                    q2.r rVar = q2.r.f40207e;
                    if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                        C2714On b10 = this.f26336b.b(c4272zc.f35349n);
                        if (b10 != null && (c2804Ud2 = b10.f26658c) != null) {
                            str = c2804Ud2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z3 = ((Boolean) rVar.f40210c.a(AbstractC3569ma.Ha)).booleanValue() && (b9 = this.f26336b.b(c4272zc.f35349n)) != null && b9.f26659d;
                    ArrayList arrayList = this.f26338d;
                    String str4 = c4272zc.f35349n;
                    C2714On b11 = this.f26336b.b(str4);
                    if (b11 != null && (c2804Ud = b11.f26657b) != null) {
                        str2 = c2804Ud.toString();
                        arrayList.add(new C2664Lo(str4, str3, str2, c4272zc.f35350u ? 1 : 0, c4272zc.f35352w, c4272zc.f35351v, z3));
                    }
                    str2 = "";
                    arrayList.add(new C2664Lo(str4, str3, str2, c4272zc.f35350u ? 1 : 0, c4272zc.f35352w, c4272zc.f35351v, z3));
                }
                this.f26339e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
