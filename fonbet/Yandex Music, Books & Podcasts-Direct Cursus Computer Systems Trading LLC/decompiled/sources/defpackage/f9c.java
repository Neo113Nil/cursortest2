package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class f9c {
    public final uxq a = uxq.f();
    public boolean b;

    static {
        new f9c(0);
    }

    public f9c(int i) {
        b();
        b();
    }

    public static int a(prv prvVar, int i, Object obj) {
        int size;
        int f;
        int e = yr4.e(i);
        if (prvVar == prv.d) {
            e *= 2;
        }
        int i2 = 4;
        switch (prvVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = yr4.b;
                i2 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = yr4.b;
                break;
            case 2:
                i2 = yr4.g(((Long) obj).longValue());
                break;
            case 3:
                i2 = yr4.g(((Long) obj).longValue());
                break;
            case 4:
                i2 = yr4.g(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = yr4.b;
                i2 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = yr4.b;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = yr4.b;
                i2 = 1;
                break;
            case 8:
                if (!(obj instanceof nn3)) {
                    i2 = yr4.d((String) obj);
                    break;
                } else {
                    Logger logger6 = yr4.b;
                    size = ((nn3) obj).size();
                    f = yr4.f(size);
                    i2 = f + size;
                    break;
                }
            case 9:
                i2 = ((vzh) obj).getSerializedSize();
                break;
            case 10:
                Logger logger7 = yr4.b;
                size = ((vzh) obj).getSerializedSize();
                f = yr4.f(size);
                i2 = f + size;
                break;
            case 11:
                if (obj instanceof nn3) {
                    Logger logger8 = yr4.b;
                    size = ((nn3) obj).size();
                    f = yr4.f(size);
                } else {
                    Logger logger9 = yr4.b;
                    size = ((byte[]) obj).length;
                    f = yr4.f(size);
                }
                i2 = f + size;
                break;
            case 12:
                i2 = yr4.f(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof hse)) {
                    i2 = yr4.g(((Integer) obj).intValue());
                    break;
                } else {
                    i2 = yr4.g(((hse) obj).a());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = yr4.b;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = yr4.b;
                i2 = 8;
                break;
            case 16:
                i2 = yr4.b(((Integer) obj).intValue());
                break;
            case 17:
                i2 = yr4.c(((Long) obj).longValue());
                break;
            default:
                wvs.p("There is no way to get here, but the compiler thinks otherwise.");
                i2 = 0;
                break;
        }
        return i2 + e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if ((r4 instanceof defpackage.vzh) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ((r4 instanceof defpackage.hse) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(l3d l3dVar, Object obj) {
        prv prvVar = l3dVar.b;
        Charset charset = use.a;
        obj.getClass();
        boolean z = true;
        switch (prvVar.a) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof nn3)) {
                    break;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case MESSAGE:
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        b6e.p("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(l3dVar.a), l3dVar.b.a, obj.getClass().getName()});
    }

    public static void e(yr4 yr4Var, prv prvVar, int i, Object obj) {
        if (prvVar == prv.d) {
            yr4Var.y(i, 3);
            ((vzh) obj).writeTo(yr4Var);
            yr4Var.y(i, 4);
        }
        yr4Var.y(i, prvVar.b);
        switch (prvVar.ordinal()) {
            case 0:
                yr4Var.q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                yr4Var.o(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                yr4Var.C(((Long) obj).longValue());
                break;
            case 3:
                yr4Var.C(((Long) obj).longValue());
                break;
            case 4:
                yr4Var.t(((Integer) obj).intValue());
                break;
            case 5:
                yr4Var.q(((Long) obj).longValue());
                break;
            case 6:
                yr4Var.o(((Integer) obj).intValue());
                break;
            case 7:
                yr4Var.i(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof nn3)) {
                    yr4Var.x((String) obj);
                    break;
                } else {
                    yr4Var.m((nn3) obj);
                    break;
                }
            case 9:
                ((vzh) obj).writeTo(yr4Var);
                break;
            case 10:
                yr4Var.v((vzh) obj);
                break;
            case 11:
                if (!(obj instanceof nn3)) {
                    byte[] bArr = (byte[]) obj;
                    yr4Var.k(bArr.length, bArr);
                    break;
                } else {
                    yr4Var.m((nn3) obj);
                    break;
                }
            case 12:
                yr4Var.A(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof hse)) {
                    yr4Var.t(((Integer) obj).intValue());
                    break;
                } else {
                    yr4Var.t(((hse) obj).a());
                    break;
                }
            case 14:
                yr4Var.o(((Integer) obj).intValue());
                break;
            case 15:
                yr4Var.q(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                yr4Var.A((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                yr4Var.C((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        uxq uxqVar = this.a;
        int i = uxqVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = uxqVar.c(i2).b;
            if (obj instanceof o3d) {
                ((o3d) obj).makeImmutable();
            }
        }
        Iterator it = uxqVar.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof o3d) {
                ((o3d) value).makeImmutable();
            }
        }
        if (!uxqVar.d) {
            for (int i3 = 0; i3 < uxqVar.b; i3++) {
                vxq c = uxqVar.c(i3);
                if (((l3d) c.a).c) {
                    c.setValue(Collections.unmodifiableList((List) c.b));
                }
            }
            for (Map.Entry entry : uxqVar.d()) {
                if (((l3d) entry.getKey()).c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!uxqVar.d) {
            uxqVar.c = uxqVar.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(uxqVar.c);
            uxqVar.f = uxqVar.f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(uxqVar.f);
            uxqVar.d = true;
        }
        this.b = true;
    }

    public final void c(l3d l3dVar, Object obj) {
        if (!l3dVar.c) {
            d(l3dVar, obj);
        } else {
            if (!(obj instanceof List)) {
                xq0.x("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                d(l3dVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(l3dVar, obj);
    }

    public final Object clone() {
        f9c f9cVar = new f9c();
        uxq uxqVar = this.a;
        int i = uxqVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            vxq c = uxqVar.c(i2);
            f9cVar.c((l3d) c.a, c.b);
        }
        for (Map.Entry entry : uxqVar.d()) {
            f9cVar.c((l3d) entry.getKey(), entry.getValue());
        }
        return f9cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f9c) {
            return this.a.equals(((f9c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public f9c() {
    }
}
