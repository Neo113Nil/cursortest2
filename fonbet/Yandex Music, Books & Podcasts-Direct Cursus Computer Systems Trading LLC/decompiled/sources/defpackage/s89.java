package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s89 extends aur implements Function2 {
    public final /* synthetic */ u89 j;
    public final /* synthetic */ gc8 k;
    public final /* synthetic */ dp8 l;
    public final /* synthetic */ pyg m;
    public final /* synthetic */ nzg n;
    public final /* synthetic */ JSONObject o;
    public final /* synthetic */ xzb p;
    public final /* synthetic */ w1g q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s89(u89 u89Var, gc8 gc8Var, dp8 dp8Var, pyg pygVar, nzg nzgVar, JSONObject jSONObject, xzb xzbVar, w1g w1gVar, Continuation continuation) {
        super(2, continuation);
        this.j = u89Var;
        this.k = gc8Var;
        this.l = dp8Var;
        this.m = pygVar;
        this.n = nzgVar;
        this.o = jSONObject;
        this.p = xzbVar;
        this.q = w1gVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new s89(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s89) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        JSONObject jSONObject;
        String str;
        u89 u89Var;
        j6l j6lVar;
        czg czgVar;
        xzb xzbVar;
        j6l j6lVar2;
        u89 u89Var2;
        int i;
        Unit unit;
        czg czgVar2;
        JSONObject jSONObject2;
        ns9 ns9Var = bcx.h;
        kzj kzjVar = kzj.F;
        pyg pygVar = this.m;
        ckj ckjVar = pygVar.l;
        czg czgVar3 = pygVar.b;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        qc9 qc9Var = u89.f;
        String str2 = "tag: " + this.k.getDataTag() + " div: " + this.l;
        u89 u89Var3 = this.j;
        LinkedHashMap linkedHashMap = u89Var3.d;
        Object obj2 = linkedHashMap.get(str2);
        if (obj2 == null) {
            obj2 = new j6l();
            linkedHashMap.put(str2, obj2);
        }
        j6l j6lVar3 = (j6l) obj2;
        ckjVar.a(j6lVar3.b);
        qc9 qc9Var2 = u89.f;
        ayg aygVar = this.n.a;
        bs4 bs4Var = u89Var3.b;
        if (aygVar == null) {
            bs4Var.getClass();
        } else {
            bs4Var.getClass();
            bgg bggVar = pygVar.a;
            czgVar3.setCallback(bggVar);
            bggVar.setExternalImage(czgVar3);
            bggVar.setImageTransformer(new awc(czgVar3));
            pygVar.c = aygVar;
            pygVar.f = true;
            boolean r = czgVar3.r(aygVar);
            pygVar.f = false;
            pygVar.a();
            if (bggVar.getDrawable() != czgVar3 || r) {
                if (!r) {
                    boolean k = czgVar3.k();
                    bggVar.setImageDrawable(null);
                    bggVar.setImageDrawable(czgVar3);
                    bggVar.n();
                    if (k) {
                        czgVar3.q();
                    }
                }
                bggVar.getVisibility();
                pygVar.b();
                bggVar.requestLayout();
            }
            JSONObject jSONObject3 = this.o;
            JSONArray optJSONArray = jSONObject3.optJSONArray("repeats");
            String str3 = "repeat_count";
            xzb xzbVar2 = this.p;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                int i2 = 0;
                while (i2 < length) {
                    qc9 qc9Var3 = qc9Var2;
                    Object obj3 = optJSONArray.get(i2);
                    int i3 = i2;
                    JSONObject jSONObject4 = obj3 instanceof JSONObject ? (JSONObject) obj3 : null;
                    if (jSONObject4 != null) {
                        arrayList2.add(jSONObject4);
                    }
                    i2 = i3 + 1;
                    qc9Var2 = qc9Var3;
                }
                qc9 qc9Var4 = qc9Var2;
                ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                czg czgVar4 = czgVar3;
                while (it.hasNext()) {
                    JSONObject jSONObject5 = (JSONObject) it.next();
                    qc9 qc9Var5 = u89.f;
                    ox8 ox8Var = vct.b;
                    szb d = e5f.d(qc9Var5, jSONObject5, str3, ox8Var, kzjVar);
                    int R = d != null ? u2x.R(d, xzbVar2) : 1;
                    String str4 = str3;
                    int F = u2x.F(jSONObject5, xzbVar2);
                    JSONObject jSONObject6 = jSONObject3;
                    int i4 = R;
                    qc9 qc9Var6 = qc9Var4;
                    j6l j6lVar4 = j6lVar3;
                    czg czgVar5 = czgVar4;
                    u89 u89Var4 = u89Var3;
                    Iterator it2 = it;
                    szb e = e5f.e(qc9Var6, jSONObject5, "min_frame", ox8Var, kzjVar, ns9Var, null);
                    int R2 = e != null ? u2x.R(e, xzbVar2) : (int) aygVar.l;
                    szb e2 = e5f.e(qc9Var6, jSONObject5, "max_frame", ox8Var, kzjVar, ns9Var, null);
                    arrayList3.add(new mzg(i4, F, R2, e2 != null ? u2x.R(e2, xzbVar2) : (int) aygVar.m));
                    j6lVar3 = j6lVar4;
                    it = it2;
                    czgVar4 = czgVar5;
                    str3 = str4;
                    u89Var3 = u89Var4;
                    jSONObject3 = jSONObject6;
                    qc9Var4 = qc9Var6;
                }
                qc9Var2 = qc9Var4;
                arrayList = arrayList3;
                jSONObject = jSONObject3;
                str = str3;
                u89Var = u89Var3;
                czgVar = czgVar4;
                j6lVar = j6lVar3;
            } else {
                arrayList = null;
                jSONObject = jSONObject3;
                str = "repeat_count";
                u89Var = u89Var3;
                j6lVar = j6lVar3;
                czgVar = czgVar3;
            }
            if (arrayList != null) {
                vqn vqnVar = new vqn();
                xqn xqnVar = new xqn();
                Object S = CollectionsKt.S(arrayList, vqnVar.a);
                xqnVar.a = S;
                r89 r89Var = new r89(pygVar);
                mzg mzgVar = (mzg) S;
                if (mzgVar != null) {
                    r89Var.invoke(mzgVar);
                }
                xzbVar = xzbVar2;
                j6lVar2 = j6lVar;
                u89Var2 = u89Var;
                i = 1;
                ckjVar.a(new vh0(vqnVar, xqnVar, arrayList, r89Var, pygVar, 4));
                unit = Unit.a;
            } else {
                xzbVar = xzbVar2;
                j6lVar2 = j6lVar;
                u89Var2 = u89Var;
                i = 1;
                unit = null;
            }
            if (unit == null) {
                jSONObject2 = jSONObject;
                szb d2 = e5f.d(u89.f, jSONObject2, str, vct.b, kzjVar);
                int R3 = d2 != null ? u2x.R(d2, xzbVar) : i;
                czgVar2 = czgVar;
                czgVar2.b.setRepeatCount(R3);
                czgVar2.b.setRepeatMode(u2x.F(jSONObject2, xzbVar));
            } else {
                czgVar2 = czgVar;
                jSONObject2 = jSONObject;
            }
            if (czgVar2.b.getRepeatCount() != -1 && j6lVar2.a) {
                float f = czgVar2.b.getRepeatMode() == 2 ? 0.0f : 1.0f;
                czgVar2.m();
                czgVar2.B(f);
                pygVar.a();
            } else {
                pygVar.d();
            }
            szb e3 = e5f.e(qc9Var2, jSONObject2, "is_playing", vct.a, kzj.B, ns9Var, null);
            if (e3 != null) {
                u89Var2.i(e3.c(xzbVar, new r89(u89Var2, pygVar)));
            }
        }
        return Unit.a;
    }
}
