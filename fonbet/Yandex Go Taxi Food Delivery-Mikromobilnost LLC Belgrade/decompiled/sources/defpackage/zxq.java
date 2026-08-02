package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zxq {
    public static final zxq c = new zxq(0);
    public final cxs0 a = cxs0.f();
    public boolean b;

    public zxq(int i) {
        d();
        d();
    }

    public static void e(i iVar, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iVar.y(i, 3);
            ((GeneratedMessageLite) ((xt10) obj)).n(iVar);
            iVar.y(i, 4);
        }
        iVar.y(i, wireFormat$FieldType.b());
        switch (wxq.b[wireFormat$FieldType.ordinal()]) {
            case 1:
                iVar.p(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                iVar.n(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                iVar.C(((Long) obj).longValue());
                break;
            case 4:
                iVar.C(((Long) obj).longValue());
                break;
            case 5:
                iVar.r(((Integer) obj).intValue());
                break;
            case 6:
                iVar.p(((Long) obj).longValue());
                break;
            case 7:
                iVar.n(((Integer) obj).intValue());
                break;
            case 8:
                iVar.h(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((GeneratedMessageLite) ((xt10) obj)).n(iVar);
                break;
            case 10:
                iVar.t((xt10) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    iVar.x((String) obj);
                    break;
                } else {
                    iVar.l((ByteString) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    iVar.j(bArr.length, bArr);
                    break;
                } else {
                    iVar.l((ByteString) obj);
                    break;
                }
            case 13:
                iVar.A(((Integer) obj).intValue());
                break;
            case 14:
                iVar.n(((Integer) obj).intValue());
                break;
            case 15:
                iVar.p(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                iVar.A((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                iVar.C((longValue >> 63) ^ (longValue << 1));
                break;
            case 18:
                iVar.r(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zxq clone() {
        zxq zxqVar = new zxq();
        cxs0 cxs0Var = this.a;
        if (cxs0Var.a.size() > 0) {
            Map.Entry c2 = cxs0Var.c(0);
            b64.D(c2.getKey());
            c2.getValue();
            throw null;
        }
        Iterator it = cxs0Var.d().iterator();
        if (!it.hasNext()) {
            return zxqVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        b64.D(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final void b() {
        cxs0 cxs0Var = this.a;
        if (cxs0Var.a.size() > 0) {
            b64.D(cxs0Var.c(0).getKey());
            throw null;
        }
        Iterator it = cxs0Var.d().iterator();
        if (it.hasNext()) {
            b64.D(((Map.Entry) it.next()).getKey());
            throw null;
        }
    }

    public final Iterator c() {
        cxs0 cxs0Var = this.a;
        return cxs0Var.isEmpty() ? Collections.emptyIterator() : ((nxs0) cxs0Var.entrySet()).iterator();
    }

    public final void d() {
        if (this.b) {
            return;
        }
        cxs0 cxs0Var = this.a;
        int size = cxs0Var.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry c2 = cxs0Var.c(i);
            if (c2.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) c2.getValue();
                generatedMessageLite.getClass();
                fvf0 fvf0Var = fvf0.c;
                fvf0Var.getClass();
                fvf0Var.a(generatedMessageLite.getClass()).c(generatedMessageLite);
                generatedMessageLite.k();
            }
        }
        if (!cxs0Var.c) {
            if (cxs0Var.a.size() > 0) {
                cxs0Var.c(0).getKey().getClass();
                ny61.u();
                return;
            } else {
                Iterator it = cxs0Var.d().iterator();
                if (it.hasNext()) {
                    throw g8e.j((Map.Entry) it.next());
                }
            }
        }
        if (!cxs0Var.c) {
            cxs0Var.b = cxs0Var.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cxs0Var.b);
            cxs0Var.x = cxs0Var.x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(cxs0Var.x);
            cxs0Var.c = true;
        }
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zxq) {
            return this.a.equals(((zxq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zxq() {
    }
}
