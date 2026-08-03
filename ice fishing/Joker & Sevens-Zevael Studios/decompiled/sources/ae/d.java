package ae;

import ac.o;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import hc.j;
import m0.d1;
import p.g;
import rd.t;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344g = 0;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f347j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(d1 d1Var, g gVar, Context context, fc.d dVar) {
        super(2, dVar);
        this.f345h = d1Var;
        this.f346i = gVar;
        this.f347j = context;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f344g) {
            case 0:
                return new d((d1) this.f345h, (g) this.f346i, (Context) this.f347j, dVar);
            default:
                d dVar2 = new d((v.c) this.f346i, (v.c) this.f347j, dVar);
                dVar2.f345h = obj;
                return dVar2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f344g) {
            case 0:
                d dVar2 = (d) create(yVar, dVar);
                o oVar = o.f277a;
                dVar2.invokeSuspend(oVar);
                return oVar;
            default:
                d dVar3 = (d) create(yVar, dVar);
                o oVar2 = o.f277a;
                dVar3.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f344g) {
            case 0:
                v6.a.W(obj);
                Uri parse = Uri.parse((String) ((d1) this.f345h).getValue());
                pc.j.d(parse, "parse(...)");
                g gVar = (g) this.f346i;
                Intent intent = gVar.f5400a;
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                Context context = (Context) this.f347j;
                intent.setData(parse);
                context.startActivity(intent, gVar.f5401b);
                SharedPreferences sharedPreferences = context.getSharedPreferences("overthink", 0);
                pc.j.b(sharedPreferences);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("soundless", true);
                edit.apply();
                break;
            default:
                v6.a.W(obj);
                y yVar = (y) this.f345h;
                fc.d dVar = null;
                a0.q(yVar, null, new t((v.c) this.f346i, dVar, 3), 3);
                a0.q(yVar, null, new t((v.c) this.f347j, dVar, 4), 3);
                break;
        }
        return o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v.c cVar, v.c cVar2, fc.d dVar) {
        super(2, dVar);
        this.f346i = cVar;
        this.f347j = cVar2;
    }
}
