package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes8.dex */
public final class smx extends j7 implements vcx {
    public final sbx a;
    public Object b;
    public final ArrayList c = new ArrayList();
    public boolean d;
    public String e;
    public String f;
    public String g;

    public smx(sbx sbxVar) {
        this.a = sbxVar;
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void B(char c) {
        if (this.d) {
            this.e = String.valueOf(c);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Character valueOf = Character.valueOf(c);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7
    public final void G(SerialDescriptor serialDescriptor, int i) {
        jl40 kind = serialDescriptor.getKind();
        if (jl40.l(kind, ovu0.g) || jl40.l(kind, ovu0.j)) {
            this.e = serialDescriptor.f(i);
        } else if (jl40.l(kind, ovu0.i) && i % 2 == 0) {
            this.d = true;
        }
    }

    public final void I() {
        ArrayList arrayList = new ArrayList();
        if (this.d) {
            yci0.m("List does not supported as map key");
            return;
        }
        Object obj = this.b;
        if (obj != null) {
            if (obj instanceof Map) {
                String str = this.e;
                this.e = null;
                if (str == null) {
                    yci0.m("Missing field name when encode map value");
                    return;
                }
                ym11.c(obj).put(str, arrayList);
            } else {
                ym11.b(obj).add(arrayList);
            }
        }
        this.b = arrayList;
        this.c.add(arrayList);
    }

    public final void J() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.d) {
            yci0.m("Map does not supported as map key");
            return;
        }
        Object obj = this.b;
        if (obj != null) {
            if (obj instanceof Map) {
                String str = this.e;
                this.e = null;
                if (str == null) {
                    yci0.m("Missing field name when encode map value");
                    return;
                }
                ym11.c(obj).put(str, linkedHashMap);
            } else {
                ym11.b(obj).add(linkedHashMap);
            }
        }
        String str2 = this.f;
        String str3 = this.g;
        if (str2 != null && str3 != null) {
            linkedHashMap.put(str2, str3);
            this.f = null;
            this.g = null;
        }
        this.b = linkedHashMap;
        this.c.add(linkedHashMap);
    }

    public final void K() {
        ArrayList arrayList = this.c;
        arrayList.remove(scc.f(arrayList));
        this.b = !arrayList.isEmpty() ? a.Z(arrayList) : this.b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final kf5 a() {
        return this.a.b;
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final yjd b(SerialDescriptor serialDescriptor) {
        jl40 kind = serialDescriptor.getKind();
        if (jl40.l(kind, ovu0.h)) {
            I();
            return this;
        }
        if (!jl40.l(kind, ovu0.i) && !jl40.l(kind, ovu0.g) && !jl40.l(kind, ovu0.j)) {
            return this;
        }
        J();
        return this;
    }

    @Override // defpackage.j7, defpackage.yjd
    public final void c(SerialDescriptor serialDescriptor) {
        jl40 kind = serialDescriptor.getKind();
        if (jl40.l(kind, ovu0.h) || jl40.l(kind, ovu0.i) || jl40.l(kind, ovu0.g) || jl40.l(kind, ovu0.j)) {
            K();
        }
    }

    @Override // defpackage.vcx
    public final sbx d() {
        return this.a;
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        if (this.d) {
            this.e = String.valueOf((int) b);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Byte valueOf = Byte.valueOf(b);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void h(SerialDescriptor serialDescriptor, int i) {
        String f = serialDescriptor.f(i);
        if (this.d) {
            this.e = f;
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(f);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, f);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void j(Object obj, KSerializer kSerializer) {
        if (!(kSerializer instanceof i9)) {
            kSerializer.serialize(this, obj);
            return;
        }
        i9 i9Var = (i9) kSerializer;
        if (obj == null) {
            y();
            return;
        }
        KSerializer x = rzo.x(i9Var, this, obj);
        String b = scb1.b(this.a, i9Var.getDescriptor());
        String h = x.getDescriptor().h();
        this.f = b;
        this.g = h;
        x.serialize(this, obj);
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void k(short s) {
        if (this.d) {
            this.e = String.valueOf((int) s);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Short valueOf = Short.valueOf(s);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void l(boolean z) {
        if (this.d) {
            this.e = String.valueOf(z);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void m(float f) {
        if (this.d) {
            this.e = String.valueOf(f);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Float valueOf = Float.valueOf(f);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vcx
    public final void p(b bVar) {
        if (bVar instanceof JsonNull) {
            y();
            return;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                t(dVar.a());
                return;
            }
            Boolean f = qcx.f(dVar);
            if (f != null) {
                l(f.booleanValue());
                return;
            }
            Long o = qcx.o(dVar);
            if (o == null) {
                u(qcx.h(dVar));
                return;
            }
            long longValue = o.longValue();
            if (-2147483648L > longValue || longValue > 2147483647L) {
                w(longValue);
                return;
            } else {
                q((int) longValue);
                return;
            }
        }
        if (!(bVar instanceof c)) {
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                w511.b();
                return;
            }
            I();
            Iterator it = ((Iterable) bVar).iterator();
            while (it.hasNext()) {
                p((b) it.next());
            }
            K();
            return;
        }
        J();
        for (Map.Entry entry : ((c) bVar).a.entrySet()) {
            String str = (String) entry.getKey();
            b bVar2 = (b) entry.getValue();
            this.e = str;
            p(bVar2);
        }
        K();
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void q(int i) {
        if (this.d) {
            this.e = String.valueOf(i);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void t(String str) {
        if (this.d) {
            this.e = str;
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(str);
            return;
        }
        String str2 = this.e;
        this.e = null;
        if (str2 != null) {
            ym11.c(obj).put(str2, str);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void u(double d) {
        if (this.d) {
            this.e = String.valueOf(d);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Double valueOf = Double.valueOf(d);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void w(long j) {
        if (this.d) {
            this.e = String.valueOf(j);
            this.d = false;
            return;
        }
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        Long valueOf = Long.valueOf(j);
        if (!(obj instanceof Map)) {
            ym11.b(obj).add(valueOf);
            return;
        }
        String str = this.e;
        this.e = null;
        if (str != null) {
            ym11.c(obj).put(str, valueOf);
        } else {
            yci0.m("Missing field name when encode map value");
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void y() {
        Object obj = this.b;
        if (obj instanceof List) {
            ym11.b(obj).add(null);
        }
    }
}
