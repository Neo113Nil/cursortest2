package wd;

import ac.m;
import ac.o;
import android.content.Context;
import android.os.Build;
import d.n;
import d8.t;
import e.k;
import fc.d;
import hc.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m0.d1;
import m0.l1;
import oc.e;
import p6.i;
import w0.q;
import x4.f;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends j implements e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m5.c f7726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ be.a f7727h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f7728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d1 f7729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f7730k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1 f7731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d1 f7732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f7733n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m5.c cVar, be.a aVar, Context context, d1 d1Var, d1 d1Var2, d1 d1Var3, d1 d1Var4, k kVar, d dVar) {
        super(2, dVar);
        this.f7726g = cVar;
        this.f7727h = aVar;
        this.f7728i = context;
        this.f7729j = d1Var;
        this.f7730k = d1Var2;
        this.f7731l = d1Var3;
        this.f7732m = d1Var4;
        this.f7733n = kVar;
    }

    @Override // hc.a
    public final d create(Object obj, d dVar) {
        return new a(this.f7726g, this.f7727h, this.f7728i, this.f7729j, this.f7730k, this.f7731l, this.f7732m, this.f7733n, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((y) obj, (d) obj2);
        o oVar = o.f277a;
        aVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        d1 d1Var = this.f7729j;
        boolean booleanValue = ((Boolean) d1Var.getValue()).booleanValue();
        o oVar = o.f277a;
        if (!booleanValue) {
            d1 d1Var2 = this.f7730k;
            xd.d dVar = (xd.d) d1Var2.getValue();
            if (!(dVar instanceof xd.c)) {
                if (dVar instanceof xd.a) {
                    d1Var.setValue(Boolean.TRUE);
                    t tVar = this.f7726g.f4881d;
                    q qVar = (q) tVar.f1816a;
                    qVar.clear();
                    qVar.add(td.c.f6550g);
                    ((l1) tVar.f1817b).setValue(l5.b.f4160h);
                    return oVar;
                }
                if (!(dVar instanceof xd.b)) {
                    throw new ac.d();
                }
                xd.d dVar2 = (xd.d) d1Var2.getValue();
                pc.j.c(dVar2, "null cannot be cast to non-null type org.fortheloss.st.feature.splash.data.SplashState.GoToWeb");
                String str = ((xd.b) dVar2).f8406a;
                d1 d1Var3 = this.f7731l;
                if (!((Boolean) d1Var3.getValue()).booleanValue()) {
                    this.f7732m.setValue(str);
                    String a6 = this.f7727h.f1170b.a();
                    if (a6 == null) {
                        d1Var3.setValue(Boolean.TRUE);
                        return oVar;
                    }
                    Context context = this.f7728i;
                    pc.j.e(context, "context");
                    ArrayList arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 33 && y2.a.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                        arrayList.add("android.permission.POST_NOTIFICATIONS");
                    }
                    String I = f.I(ce.a.f1400a, "wgz-HvD5YndcaBcB1GlVHaCpBzcHbFSAV3_MP1hudmgtjXzSQMiV3hM1oh5GrMKG8s3VGgXd75DjKVNYDr1Rlg==");
                    m mVar = h8.d.f2870a;
                    ((h8.a) mVar.getValue()).initWithContext(context, I);
                    ((h8.a) mVar.getValue()).login(a6);
                    if (arrayList.isEmpty()) {
                        d1Var3.setValue(Boolean.TRUE);
                        return oVar;
                    }
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    if (strArr.length == 0) {
                        d1Var3.setValue(Boolean.TRUE);
                        return oVar;
                    }
                    g.c cVar = this.f7733n.f1914d.f1895a;
                    if (cVar == null) {
                        throw new IllegalStateException("Launcher has not been initialized");
                    }
                    n nVar = cVar.f2404d;
                    LinkedHashMap linkedHashMap = nVar.f1503b;
                    ArrayList arrayList2 = nVar.f1505d;
                    String str2 = cVar.f2405e;
                    Object obj2 = linkedHashMap.get(str2);
                    i iVar = cVar.f2406f;
                    if (obj2 == null) {
                        throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + iVar + " and input " + strArr + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                    }
                    int intValue = ((Number) obj2).intValue();
                    arrayList2.add(str2);
                    try {
                        nVar.b(intValue, iVar, strArr);
                        return oVar;
                    } catch (Exception e10) {
                        arrayList2.remove(str2);
                        throw e10;
                    }
                }
            }
        }
        return oVar;
    }
}
