package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.internal.WriteMode;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final class vru0 extends j7 implements vcx {
    public final eid a;
    public final sbx b;
    public final WriteMode c;
    public final vcx[] d;
    public final kf5 e;
    public final ccx f;
    public boolean g;
    public String h;
    public String i;

    public vru0(eid eidVar, sbx sbxVar, WriteMode writeMode, vcx[] vcxVarArr) {
        this.a = eidVar;
        this.b = sbxVar;
        this.c = writeMode;
        this.d = vcxVarArr;
        this.e = sbxVar.b;
        this.f = sbxVar.a;
        int ordinal = writeMode.ordinal();
        if (vcxVarArr != null) {
            vcx vcxVar = vcxVarArr[ordinal];
            if (vcxVar == null && vcxVar == this) {
                return;
            }
            vcxVarArr[ordinal] = this;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void B(char c) {
        t(String.valueOf(c));
    }

    @Override // defpackage.yjd
    public final boolean F() {
        return this.f.a;
    }

    @Override // defpackage.j7
    public final void G(SerialDescriptor serialDescriptor, int i) {
        int i2 = uru0.a[this.c.ordinal()];
        eid eidVar = this.a;
        boolean z = true;
        if (i2 == 1) {
            if (!eidVar.a) {
                eidVar.e(HexString.CHAR_COMMA);
            }
            eidVar.b();
            return;
        }
        if (i2 == 2) {
            if (eidVar.a) {
                this.g = true;
                eidVar.b();
                return;
            }
            if (i % 2 == 0) {
                eidVar.e(HexString.CHAR_COMMA);
                eidVar.b();
            } else {
                eidVar.e(':');
                eidVar.k();
                z = false;
            }
            this.g = z;
            return;
        }
        if (i2 != 3) {
            if (!eidVar.a) {
                eidVar.e(HexString.CHAR_COMMA);
            }
            eidVar.b();
            ddx.e(this.b, serialDescriptor);
            t(serialDescriptor.f(i));
            eidVar.e(':');
            eidVar.k();
            return;
        }
        if (i == 0) {
            this.g = true;
        }
        if (i == 1) {
            eidVar.e(HexString.CHAR_COMMA);
            eidVar.k();
            this.g = false;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final kf5 a() {
        return this.e;
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final yjd b(SerialDescriptor serialDescriptor) {
        vcx vcxVar;
        sbx sbxVar = this.b;
        WriteMode W = vez0.W(sbxVar, serialDescriptor);
        char c = W.begin;
        eid eidVar = this.a;
        if (c != 0) {
            eidVar.e(c);
            eidVar.a();
        }
        String str = this.h;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = serialDescriptor.h();
            }
            eidVar.b();
            t(str);
            eidVar.e(':');
            eidVar.k();
            t(str2);
            this.h = null;
            this.i = null;
        }
        if (this.c == W) {
            return this;
        }
        vcx[] vcxVarArr = this.d;
        return (vcxVarArr == null || (vcxVar = vcxVarArr[W.ordinal()]) == null) ? new vru0(eidVar, sbxVar, W, vcxVarArr) : vcxVar;
    }

    @Override // defpackage.j7, defpackage.yjd
    public final void c(SerialDescriptor serialDescriptor) {
        WriteMode writeMode = this.c;
        if (writeMode.end != 0) {
            eid eidVar = this.a;
            eidVar.l();
            eidVar.c();
            eidVar.e(writeMode.end);
        }
    }

    @Override // defpackage.vcx
    public final sbx d() {
        return this.b;
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void encodeByte(byte b) {
        if (this.g) {
            t(String.valueOf((int) b));
        } else {
            this.a.d(b);
        }
    }

    @Override // defpackage.j7, defpackage.yjd
    public final void g(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        if (obj != null || this.f.f) {
            super.g(serialDescriptor, i, kSerializer, obj);
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void h(SerialDescriptor serialDescriptor, int i) {
        t(serialDescriptor.f(i));
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final Encoder i(SerialDescriptor serialDescriptor) {
        boolean a = wru0.a(serialDescriptor);
        WriteMode writeMode = this.c;
        sbx sbxVar = this.b;
        eid eidVar = this.a;
        if (a) {
            if (!(eidVar instanceof iid)) {
                eidVar = new iid((xrw) eidVar.b, this.g);
            }
            return new vru0(eidVar, sbxVar, writeMode, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(qcx.a)) {
            if (!(eidVar instanceof hid)) {
                eidVar = new hid((xrw) eidVar.b, this.g);
            }
            return new vru0(eidVar, sbxVar, writeMode, null);
        }
        if (this.h != null) {
            this.i = serialDescriptor.h();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.ovu0.j) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L17;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, KSerializer kSerializer) {
        String f;
        KSerializer kSerializer2;
        sbx sbxVar = this.b;
        boolean z = kSerializer instanceof i9;
        ClassDiscriminatorMode classDiscriminatorMode = sbxVar.a.m;
        if (!z) {
            int i = t5e0.a[classDiscriminatorMode.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    w511.b();
                    return;
                } else {
                    jl40 kind = kSerializer.getDescriptor().getKind();
                    if (!jl40.l(kind, ovu0.g)) {
                    }
                    f = s8o.f(sbxVar, kSerializer.getDescriptor());
                }
            }
            f = null;
        }
        if (z) {
            i9 i9Var = (i9) kSerializer;
            if (obj == null) {
                yci0.x("Value for serializer ", i9Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            kSerializer2 = rzo.x(i9Var, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (f != null) {
            s8o.b(sbxVar, kSerializer, kSerializer2, f);
            s8o.e(kSerializer2.getDescriptor().getKind());
            String h = kSerializer2.getDescriptor().h();
            this.h = f;
            this.i = h;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void k(short s) {
        if (this.g) {
            t(String.valueOf((int) s));
        } else {
            this.a.i(s);
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void l(boolean z) {
        if (this.g) {
            t(String.valueOf(z));
        } else {
            ((xrw) this.a.b).l(String.valueOf(z));
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void m(float f) {
        if (this.g) {
            t(String.valueOf(f));
        } else {
            ((xrw) this.a.b).l(String.valueOf(f));
        }
        this.f.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new JsonEncodingException(qje.I(Float.valueOf(f), null), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
    }

    @Override // defpackage.vcx
    public final void p(b bVar) {
        if (this.h == null || (bVar instanceof c)) {
            j(bVar, rcx.a);
        } else {
            s8o.U(this.i, bVar);
            throw null;
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void q(int i) {
        if (this.g) {
            t(String.valueOf(i));
        } else {
            this.a.f(i);
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void t(String str) {
        this.a.j(str);
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void u(double d) {
        if (this.g) {
            t(String.valueOf(d));
        } else {
            ((xrw) this.a.b).l(String.valueOf(d));
        }
        this.f.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new JsonEncodingException(qje.I(Double.valueOf(d), null), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void w(long j) {
        if (this.g) {
            t(String.valueOf(j));
        } else {
            this.a.g(j);
        }
    }

    @Override // defpackage.j7, kotlinx.serialization.encoding.Encoder
    public final void y() {
        this.a.h("null");
    }
}
