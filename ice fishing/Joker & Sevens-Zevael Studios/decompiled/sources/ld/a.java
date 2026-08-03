package ld;

import ac.o;
import android.content.Context;
import androidx.lifecycle.m0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import hc.j;
import sd.k;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4255h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, fc.d dVar, int i10) {
        super(2, dVar);
        this.f4254g = i10;
        this.f4255h = obj;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f4254g) {
            case 0:
                return new a((b) this.f4255h, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new a((b) this.f4255h, dVar, 1);
            default:
                return new a((k) this.f4255h, dVar, 2);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f4254g) {
            case 0:
                return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((a) create(yVar, dVar)).invokeSuspend(o.f277a);
            default:
                a aVar = (a) create(yVar, dVar);
                o oVar = o.f277a;
                aVar.invokeSuspend(oVar);
                return oVar;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4254g) {
            case 0:
                v6.a.W(obj);
                try {
                    String str = (String) i6.a.a((Context) ((b) this.f4255h).f4257a).f999b;
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    return "";
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v6.a.W(obj);
                String a6 = ((md.a) ((b) this.f4255h).f4257a).a();
                if (a6 != null) {
                    return new e(a6, false);
                }
                Object obj2 = b.f4256b;
                b bVar = (b) this.f4255h;
                synchronized (obj2) {
                    String a8 = ((md.a) bVar.f4257a).a();
                    if (a8 != null) {
                        return new e(a8, false);
                    }
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    for (int i10 = 0; i10 < 6; i10++) {
                        int b2 = sc.e.f6476h.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) valueOf);
                        sb.append(b2);
                        valueOf = sb.toString();
                    }
                    ((md.a) bVar.f4257a).b(valueOf);
                    return new e(valueOf, true);
                }
            default:
                v6.a.W(obj);
                k kVar = (k) this.f4255h;
                a0.q(m0.h(kVar), null, new c(kVar, null, 3), 3);
                return o.f277a;
        }
    }
}
