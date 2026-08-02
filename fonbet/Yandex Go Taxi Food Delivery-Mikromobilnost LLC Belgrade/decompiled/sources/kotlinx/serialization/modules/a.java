package kotlinx.serialization.modules;

import defpackage.htq0;
import defpackage.iw00;
import defpackage.kf5;
import defpackage.kke;
import defpackage.lfx;
import defpackage.lke;
import defpackage.mke;
import defpackage.tls;
import defpackage.w511;
import defpackage.y5e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class a implements htq0 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public boolean y;

    public final kf5 a() {
        return new kf5(this.a, this.b, this.c, this.w, this.x, this.y);
    }

    @Override // defpackage.htq0
    public final void b(lfx lfxVar, tls tlsVar) {
        d(lfxVar, tlsVar, false);
    }

    @Override // defpackage.htq0
    public final void c(lfx lfxVar, tls tlsVar) {
        h(lfxVar, tlsVar, false);
    }

    public final void d(lfx lfxVar, tls tlsVar, boolean z) {
        HashMap hashMap = this.x;
        tls tlsVar2 = (tls) hashMap.get(lfxVar);
        if (tlsVar2 == null || tlsVar2.equals(tlsVar) || z) {
            hashMap.put(lfxVar, tlsVar);
        } else {
            w511.l("Default deserializers provider for ", lfxVar, " is already registered: ", tlsVar2);
        }
    }

    @Override // defpackage.htq0
    public final void e(lfx lfxVar, lfx lfxVar2, KSerializer kSerializer) {
        i(lfxVar, lfxVar2, kSerializer, false);
    }

    @Override // defpackage.htq0
    public final void f(lfx lfxVar, tls tlsVar) {
        j(lfxVar, new lke(tlsVar), false);
    }

    @Override // defpackage.htq0
    public final void g(lfx lfxVar, KSerializer kSerializer) {
        j(lfxVar, new kke(kSerializer), false);
    }

    public final void h(lfx lfxVar, tls tlsVar, boolean z) {
        HashMap hashMap = this.c;
        tls tlsVar2 = (tls) hashMap.get(lfxVar);
        if (tlsVar2 == null || tlsVar2.equals(tlsVar) || z) {
            hashMap.put(lfxVar, tlsVar);
        } else {
            w511.l("Default serializers provider for ", lfxVar, " is already registered: ", tlsVar2);
        }
    }

    public final void i(lfx lfxVar, lfx lfxVar2, KSerializer kSerializer, boolean z) {
        Object obj;
        lfx lfxVar3;
        String h = kSerializer.getDescriptor().h();
        HashMap hashMap = this.b;
        Object obj2 = hashMap.get(lfxVar);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(lfxVar, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = this.w;
        Object obj3 = hashMap2.get(lfxVar);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(lfxVar, obj3);
        }
        Map map2 = (Map) obj3;
        KSerializer kSerializer2 = (KSerializer) map.get(lfxVar2);
        if (kSerializer2 != null && !kSerializer2.equals(kSerializer)) {
            if (!z) {
                throw new SerializerAlreadyRegisteredException(lfxVar, lfxVar2);
            }
        }
        KSerializer kSerializer3 = (KSerializer) map2.get(h);
        if (kSerializer3 != null && !kSerializer3.equals(kSerializer)) {
            Iterator it = ((Iterable) iw00.w(map).b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == kSerializer3) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (lfxVar3 = (lfx) entry.getKey()) == null) {
                w511.j("Name ", h, " is registered in the module but no Kotlin class is associated with it.");
                return;
            }
            if (!z) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + lfxVar + "' have the same serial name '" + h + "': " + kSerializer + " for '" + lfxVar2 + "' and " + kSerializer3 + " for '" + lfxVar3 + '\'');
            }
        }
        map.put(lfxVar2, kSerializer);
        map2.put(h, kSerializer);
    }

    public final void j(lfx lfxVar, mke mkeVar, boolean z) {
        mke mkeVar2;
        HashMap hashMap = this.a;
        if (!z && (mkeVar2 = (mke) hashMap.get(lfxVar)) != null && !mkeVar2.equals(mkeVar)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + lfxVar + " already registered in this module");
        }
        hashMap.put(lfxVar, mkeVar);
        if (y5e.w(lfxVar)) {
            this.y = true;
        }
    }
}
