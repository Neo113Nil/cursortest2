package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.l;
import com.google.protobuf.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes11.dex */
public final class yxq {
    public static final yxq c = new yxq(0);
    public final bxs0 a = bxs0.f();
    public boolean b;

    public yxq(int i) {
        o();
        o();
    }

    public static int c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        int serializedSize;
        int g;
        switch (vxq.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = l.b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = l.b;
                return 4;
            case 3:
                return l.h(((Long) obj).longValue());
            case 4:
                return l.h(((Long) obj).longValue());
            case 5:
                return l.h(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = l.b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = l.b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = l.b;
                return 1;
            case 9:
                return ((wt10) obj).getSerializedSize();
            case 10:
                Logger logger6 = l.b;
                serializedSize = ((wt10) obj).getSerializedSize();
                g = l.g(serializedSize);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return l.e((String) obj);
                }
                Logger logger7 = l.b;
                serializedSize = ((ByteString) obj).size();
                g = l.g(serializedSize);
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    Logger logger8 = l.b;
                    serializedSize = ((byte[]) obj).length;
                    g = l.g(serializedSize);
                    break;
                } else {
                    Logger logger9 = l.b;
                    serializedSize = ((ByteString) obj).size();
                    g = l.g(serializedSize);
                    break;
                }
            case 13:
                return l.g(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = l.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = l.b;
                return 8;
            case 16:
                return l.c(((Integer) obj).intValue());
            case 17:
                return l.d(((Long) obj).longValue());
            case 18:
                return obj instanceof dqw ? l.h(((dqw) obj).getNumber()) : l.h(((Integer) obj).intValue());
            default:
                kbs.g("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return g + serializedSize;
    }

    public static int d(qxs qxsVar, Object obj) {
        WireFormat$FieldType wireFormat$FieldType = qxsVar.c;
        int i = qxsVar.b;
        if (!qxsVar.w) {
            int f = l.f(i);
            if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                f *= 2;
            }
            return c(wireFormat$FieldType, obj) + f;
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (qxsVar.x) {
            if (list.isEmpty()) {
                return 0;
            }
            int i3 = 0;
            while (i2 < size) {
                i3 += c(wireFormat$FieldType, list.get(i2));
                i2++;
            }
            return l.g(i3) + l.f(i) + i3;
        }
        int i4 = 0;
        while (i2 < size) {
            Object obj2 = list.get(i2);
            int f2 = l.f(i);
            if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
                f2 *= 2;
            }
            i4 += c(wireFormat$FieldType, obj2) + f2;
            i2++;
        }
        return i4;
    }

    public static yxq f() {
        return c;
    }

    public static int h(Map.Entry entry) {
        qxs qxsVar = (qxs) entry.getKey();
        Object value = entry.getValue();
        if (qxsVar.c.a() != WireFormat$JavaType.MESSAGE || qxsVar.w || qxsVar.x) {
            return d(qxsVar, value);
        }
        int i = ((qxs) entry.getKey()).b;
        int g = l.g(i) + l.f(2) + (l.f(1) * 2);
        int f = l.f(3);
        int serializedSize = ((wt10) value).getSerializedSize();
        return l.g(serializedSize) + serializedSize + f + g;
    }

    public static boolean m(Map.Entry entry) {
        qxs qxsVar = (qxs) entry.getKey();
        if (qxsVar.c.a() != WireFormat$JavaType.MESSAGE) {
            return true;
        }
        if (!qxsVar.w) {
            Object value = entry.getValue();
            if (value instanceof zt10) {
                return ((zt10) value).isInitialized();
            }
            ny61.g("Wrong object type used with protocol message reflection.");
            return false;
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(obj instanceof zt10)) {
                ny61.g("Wrong object type used with protocol message reflection.");
                return false;
            }
            if (!((zt10) obj).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r4 instanceof defpackage.wt10) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if ((r4 instanceof defpackage.dqw) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(qxs qxsVar, Object obj) {
        WireFormat$FieldType wireFormat$FieldType = qxsVar.c;
        Charset charset = rqw.a;
        obj.getClass();
        boolean z = true;
        switch (vxq.a[wireFormat$FieldType.a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            return;
        }
        kbs.o("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(qxsVar.b), qxsVar.c.a(), obj.getClass().getName()});
    }

    public final void a(qxs qxsVar, Object obj) {
        List list;
        if (!qxsVar.w) {
            ny61.g("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        s(qxsVar, obj);
        bxs0 bxs0Var = this.a;
        Object obj2 = bxs0Var.get(qxsVar);
        if (obj2 == null) {
            list = new ArrayList();
            bxs0Var.put(qxsVar, list);
        } else {
            list = (List) obj2;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yxq clone() {
        yxq yxqVar = new yxq();
        bxs0 bxs0Var = this.a;
        int i = bxs0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            kxs0 c2 = bxs0Var.c(i2);
            yxqVar.r((qxs) c2.a, c2.b);
        }
        for (Map.Entry entry : bxs0Var.d()) {
            yxqVar.r((qxs) entry.getKey(), entry.getValue());
        }
        return yxqVar;
    }

    public final Iterator e() {
        bxs0 bxs0Var = this.a;
        return bxs0Var.isEmpty() ? Collections.emptyIterator() : new fxs0(bxs0Var).iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yxq) {
            return this.a.equals(((yxq) obj).a);
        }
        return false;
    }

    public final Object g(qxs qxsVar) {
        return this.a.get(qxsVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        bxs0 bxs0Var = this.a;
        int i = bxs0Var.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            kxs0 c2 = bxs0Var.c(i3);
            i2 += d((qxs) c2.a, c2.b);
        }
        for (Map.Entry entry : bxs0Var.d()) {
            i2 += d((qxs) entry.getKey(), entry.getValue());
        }
        return i2;
    }

    public final boolean j() {
        return this.a.isEmpty();
    }

    public final boolean k() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        bxs0 bxs0Var = this.a;
        int i = bxs0Var.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                Iterator it = bxs0Var.d().iterator();
                while (it.hasNext()) {
                    if (!m((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m(bxs0Var.c(i2))) {
                break;
            }
            i2++;
        }
    }

    public final Iterator n() {
        bxs0 bxs0Var = this.a;
        return bxs0Var.isEmpty() ? Collections.emptyIterator() : ((nxs0) bxs0Var.entrySet()).iterator();
    }

    public final void o() {
        if (this.b) {
            return;
        }
        bxs0 bxs0Var = this.a;
        int i = bxs0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = bxs0Var.c(i2).b;
            if (obj instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) obj).makeImmutable();
            }
        }
        Iterator it = bxs0Var.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) value).makeImmutable();
            }
        }
        if (!bxs0Var.w) {
            for (int i3 = 0; i3 < bxs0Var.b; i3++) {
                kxs0 c2 = bxs0Var.c(i3);
                if (((qxs) c2.a).w) {
                    c2.setValue(Collections.unmodifiableList((List) c2.b));
                }
            }
            for (Map.Entry entry : bxs0Var.d()) {
                if (((qxs) entry.getKey()).w) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!bxs0Var.w) {
            bxs0Var.c = bxs0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(bxs0Var.c);
            bxs0Var.y = bxs0Var.y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(bxs0Var.y);
            bxs0Var.w = true;
        }
        this.b = true;
    }

    public final void p(yxq yxqVar) {
        bxs0 bxs0Var = yxqVar.a;
        int i = bxs0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            q(bxs0Var.c(i2));
        }
        Iterator it = bxs0Var.d().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        qxs qxsVar = (qxs) entry.getKey();
        Object value = entry.getValue();
        boolean z = qxsVar.w;
        bxs0 bxs0Var = this.a;
        if (z) {
            Object obj = bxs0Var.get(qxsVar);
            List list = (List) value;
            int size = list.size();
            if (obj == null) {
                obj = new ArrayList(size);
            }
            List list2 = (List) obj;
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list2.add(obj2);
            }
            bxs0Var.put(qxsVar, obj);
            return;
        }
        if (qxsVar.c.a() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            bxs0Var.put(qxsVar, value);
            return;
        }
        Object obj3 = bxs0Var.get(qxsVar);
        if (obj3 == null) {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            bxs0Var.put(qxsVar, value);
            return;
        }
        if (!(obj3 instanceof wt10)) {
            ((n) obj3).mergeFrom((GeneratedMessageLite) value);
            return;
        }
        tt10 builder = ((wt10) obj3).toBuilder();
        ((n) builder).mergeFrom((GeneratedMessageLite) value);
        bxs0Var.put(qxsVar, builder.build());
    }

    public final void r(qxs qxsVar, Object obj) {
        if (!qxsVar.w) {
            s(qxsVar, obj);
        } else {
            if (!(obj instanceof List)) {
                ny61.g("Wrong object type used with protocol message reflection.");
                return;
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                s(qxsVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.a.put(qxsVar, obj);
    }

    public yxq() {
    }
}
