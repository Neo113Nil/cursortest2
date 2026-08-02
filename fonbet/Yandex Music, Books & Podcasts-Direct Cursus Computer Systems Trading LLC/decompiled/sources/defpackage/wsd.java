package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.a;

/* loaded from: classes5.dex */
public final class wsd extends x5 {
    public final t9f b;
    public final t9f c;
    public final /* synthetic */ int d;
    public final vsd e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wsd(t9f t9fVar, t9f t9fVar2, int i) {
        this(t9fVar, t9fVar2, (byte) 0);
        this.d = i;
        t9fVar.getClass();
        t9fVar2.getClass();
        switch (i) {
            case 1:
                this(t9fVar, t9fVar2, (byte) 0);
                mhp descriptor = t9fVar.getDescriptor();
                mhp descriptor2 = t9fVar2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.e = new vsd("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                break;
            default:
                mhp descriptor3 = t9fVar.getDescriptor();
                mhp descriptor4 = t9fVar2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.e = new vsd("kotlin.collections.HashMap", descriptor3, descriptor4);
                break;
        }
    }

    @Override // defpackage.x5
    public final Object a() {
        switch (this.d) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.x5
    public final int b(Object obj) {
        int size;
        switch (this.d) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.x5
    public final void c(int i, Object obj) {
        switch (this.d) {
            case 0:
                ((HashMap) obj).getClass();
                break;
            default:
                ((LinkedHashMap) obj).getClass();
                break;
        }
    }

    @Override // defpackage.x5
    public final Iterator d(Object obj) {
        switch (this.d) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.x5
    public final int e(Object obj) {
        switch (this.d) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // defpackage.x5
    public final void h(tq5 tq5Var, Object obj, int i, int i2) {
        Map map = (Map) obj;
        map.getClass();
        if (i2 < 0) {
            xq0.x("Size must be known in advance when using READ_ALL");
            return;
        }
        a l = yhn.l(2, yhn.m(0, i2 * 2));
        int i3 = l.a;
        int i4 = l.b;
        int i5 = l.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            l(tq5Var, i + i3, map, false);
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    @Override // defpackage.x5
    public final /* bridge */ /* synthetic */ void i(tq5 tq5Var, int i, Object obj) {
        l(tq5Var, i, (Map) obj, true);
    }

    @Override // defpackage.x5
    public final Object j(Object obj) {
        switch (this.d) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.x5
    public final Object k(Object obj) {
        switch (this.d) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }

    public final void l(tq5 tq5Var, int i, Map map, boolean z) {
        int i2;
        map.getClass();
        Object z2 = tq5Var.z(getDescriptor(), i, this.b, null);
        if (z) {
            i2 = tq5Var.w(getDescriptor());
            if (i2 != i + 1) {
                xq0.o(f1d.e(i, i2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                return;
            }
        } else {
            i2 = i + 1;
        }
        boolean containsKey = map.containsKey(z2);
        t9f t9fVar = this.c;
        map.put(z2, (!containsKey || (t9fVar.getDescriptor().a() instanceof csm)) ? tq5Var.z(getDescriptor(), i2, t9fVar, null) : tq5Var.z(getDescriptor(), i2, t9fVar, uah.c(z2, map)));
    }

    @Override // defpackage.x5, defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        int e = e(obj);
        mhp descriptor = getDescriptor();
        wq5 t = l6bVar.t(descriptor, e);
        Iterator d = d(obj);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            t.k(getDescriptor(), i, this.b, key);
            i += 2;
            t.k(getDescriptor(), i2, this.c, value);
        }
        t.b(descriptor);
    }

    public wsd(t9f t9fVar, t9f t9fVar2, byte b) {
        super(0);
        this.b = t9fVar;
        this.c = t9fVar2;
    }
}
