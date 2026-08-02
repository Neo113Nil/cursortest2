package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3602mk implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33354d;

    public /* synthetic */ CallableC3602mk(Iu iu, C2759Qe c2759Qe, Iu iu2) {
        this.f33351a = 1;
        this.f33352b = iu;
        this.f33353c = c2759Qe;
        this.f33354d = iu2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Object obj = this.f33352b;
        Object obj2 = this.f33354d;
        Object obj3 = this.f33353c;
        switch (this.f33351a) {
            case 0:
                G3.j jVar = (G3.j) obj3;
                jVar.getClass();
                Bundle bundle2 = (Bundle) ((Iu) obj).f26368v.get();
                String str = (String) ((P3.a) ((InterfaceC3158eN) jVar.f1122g).f()).get();
                boolean z6 = false;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32928U7)).booleanValue() && ((C5140B) jVar.f1124j).t()) {
                    z6 = true;
                }
                boolean a9 = ((C3075cu) jVar.f1125k).a();
                return new C2759Qe(bundle2, (C5189a) jVar.f1117b, (ApplicationInfo) jVar.f1118c, (String) jVar.f1119d, (ArrayList) jVar.f1120e, (PackageInfo) jVar.f1121f, str, (String) jVar.f1123h, null, null, z6, a9, (Bundle) obj2);
            case 1:
                C2776Re c2776Re = (C2776Re) ((Iu) obj).f26368v.get();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && (bundle = ((C2759Qe) obj3).f27825F) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c2776Re.f27984j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", c2776Re.f27985k);
                }
                return new C2651Jp((JSONObject) ((Iu) obj2).f26368v.get(), c2776Re);
            case 2:
                C4149ws c4149ws = Ks.f26781j;
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    P3.a aVar = (P3.a) it.next();
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                String str2 = (String) obj;
                Bundle bundle3 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new C4149ws(jSONArray.toString(), bundle3, str2);
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32997c5)).booleanValue()) {
                    return new C4149ws(new JSONArray().toString(), bundle3, str2);
                }
                return null;
            default:
                ((C3145eA) obj3).f30684a.a((Ky) obj, null, (byte[]) obj2);
                return null;
        }
    }

    public /* synthetic */ CallableC3602mk(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f33351a = i;
        this.f33353c = obj;
        this.f33352b = obj2;
        this.f33354d = cloneable;
    }

    public /* synthetic */ CallableC3602mk(ArrayList arrayList, Bundle bundle, String str) {
        this.f33351a = 2;
        this.f33353c = arrayList;
        this.f33354d = bundle;
        this.f33352b = str;
    }
}
