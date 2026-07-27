package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC3579mk implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32574d;

    public /* synthetic */ CallableC3579mk(Iu iu, C2739Qe c2739Qe, Iu iu2) {
        this.f32571a = 1;
        this.f32572b = iu;
        this.f32573c = c2739Qe;
        this.f32574d = iu2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        Object obj = this.f32572b;
        Object obj2 = this.f32574d;
        Object obj3 = this.f32573c;
        switch (this.f32571a) {
            case 0:
                E3.j jVar = (E3.j) obj3;
                jVar.getClass();
                Bundle bundle2 = (Bundle) ((Iu) obj).f25615v.get();
                String str = (String) ((N3.a) ((InterfaceC3135eN) jVar.f780g).f()).get();
                boolean z3 = false;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32148U7)).booleanValue() && ((C5069B) jVar.f782j).t()) {
                    z3 = true;
                }
                boolean a9 = ((C3052cu) jVar.f783k).a();
                return new C2739Qe(bundle2, (C5110a) jVar.f775b, (ApplicationInfo) jVar.f776c, (String) jVar.f777d, (ArrayList) jVar.f778e, (PackageInfo) jVar.f779f, str, (String) jVar.f781h, null, null, z3, a9, (Bundle) obj2);
            case 1:
                C2756Re c2756Re = (C2756Re) ((Iu) obj).f25615v.get();
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue() && (bundle = ((C2739Qe) obj3).f27040F) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", c2756Re.f27300j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", c2756Re.f27301k);
                }
                return new C2631Jp((JSONObject) ((Iu) obj2).f25615v.get(), c2756Re);
            case 2:
                C4126ws c4126ws = Ks.f25981j;
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((ArrayList) obj3).iterator();
                while (it.hasNext()) {
                    N3.a aVar = (N3.a) it.next();
                    if (((JSONObject) aVar.get()) != null) {
                        jSONArray.put(aVar.get());
                    }
                }
                String str2 = (String) obj;
                Bundle bundle3 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new C4126ws(jSONArray.toString(), bundle3, str2);
                }
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32218c5)).booleanValue()) {
                    return new C4126ws(new JSONArray().toString(), bundle3, str2);
                }
                return null;
            default:
                ((C3122eA) obj3).f29892a.a((Ky) obj, null, (byte[]) obj2);
                return null;
        }
    }

    public /* synthetic */ CallableC3579mk(Object obj, Object obj2, Cloneable cloneable, int i) {
        this.f32571a = i;
        this.f32573c = obj;
        this.f32572b = obj2;
        this.f32574d = cloneable;
    }

    public /* synthetic */ CallableC3579mk(ArrayList arrayList, Bundle bundle, String str) {
        this.f32571a = 2;
        this.f32573c = arrayList;
        this.f32574d = bundle;
        this.f32572b = str;
    }
}
