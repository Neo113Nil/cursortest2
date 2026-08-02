package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2718No {

    /* renamed from: a, reason: collision with root package name */
    public final C2531Co f27317a;

    /* renamed from: b, reason: collision with root package name */
    public final C2768Qn f27318b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27319c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27320d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f27321e;

    public C2718No(C2531Co c2531Co, C2768Qn c2768Qn) {
        this.f27317a = c2531Co;
        this.f27318b = c2768Qn;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f27319c) {
            try {
                if (!this.f27321e) {
                    C2531Co c2531Co = this.f27317a;
                    if (!c2531Co.f24967b) {
                        BinderC2684Lo binderC2684Lo = new BinderC2684Lo(this);
                        C2531Co c2531Co2 = this.f27317a;
                        c2531Co2.getClass();
                        c2531Co2.f24970e.f32256n.a(new RunnableC3996u0(28, c2531Co2, binderC2684Lo), c2531Co2.f24974j);
                        return jSONArray;
                    }
                    b(c2531Co.b());
                }
                Iterator it = this.f27320d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2701Mo) it.next()).a());
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
        C2826Ud c2826Ud;
        C2751Pn b9;
        C2826Ud c2826Ud2;
        synchronized (this.f27319c) {
            try {
                if (this.f27321e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C4295zc c4295zc = (C4295zc) it.next();
                    C3324ha c3324ha = AbstractC3592ma.Ga;
                    s2.r rVar = s2.r.f40506e;
                    if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                        C2751Pn b10 = this.f27318b.b(c4295zc.f36122n);
                        if (b10 != null && (c2826Ud2 = b10.f27650c) != null) {
                            str = c2826Ud2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z6 = ((Boolean) rVar.f40509c.a(AbstractC3592ma.Ha)).booleanValue() && (b9 = this.f27318b.b(c4295zc.f36122n)) != null && b9.f27651d;
                    ArrayList arrayList = this.f27320d;
                    String str4 = c4295zc.f36122n;
                    C2751Pn b11 = this.f27318b.b(str4);
                    if (b11 != null && (c2826Ud = b11.f27649b) != null) {
                        str2 = c2826Ud.toString();
                        arrayList.add(new C2701Mo(str4, str3, str2, c4295zc.f36123u ? 1 : 0, c4295zc.f36125w, c4295zc.f36124v, z6));
                    }
                    str2 = "";
                    arrayList.add(new C2701Mo(str4, str3, str2, c4295zc.f36123u ? 1 : 0, c4295zc.f36125w, c4295zc.f36124v, z6));
                }
                this.f27321e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
