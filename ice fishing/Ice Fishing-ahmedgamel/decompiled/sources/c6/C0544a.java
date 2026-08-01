package c6;

import com.icefishing.icefishingbigwin.AbstractC4404f;
import g1.C4523c;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0544a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5566a;

    /* renamed from: c, reason: collision with root package name */
    public int f5568c;

    /* renamed from: d, reason: collision with root package name */
    public int f5569d;

    /* renamed from: h, reason: collision with root package name */
    public d f5573h;

    /* renamed from: j, reason: collision with root package name */
    public C4523c f5574j;

    /* renamed from: b, reason: collision with root package name */
    public int f5567b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5570e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f5571f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f5572g = -1;
    public final ArrayList i = new ArrayList();

    public C0544a(byte[] bArr, int i) {
        this.f5566a = bArr;
        this.f5568c = i;
    }

    public final void a(int i) {
        if (this.f5570e == i) {
            this.f5570e = 6;
            return;
        }
        int i6 = this.f5567b;
        int i9 = this.f5568c;
        if (i6 > i9) {
            throw new IOException("Expected to end at " + this.f5568c + " but was " + this.f5567b);
        }
        if (i6 != i9) {
            this.f5570e = 7;
            return;
        }
        this.f5568c = this.f5572g;
        this.f5572g = -1;
        this.f5570e = 6;
    }

    public final int b() {
        if (this.f5570e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f5570e);
        }
        int i = this.f5568c - this.f5567b;
        this.f5570e = 6;
        this.f5568c = this.f5572g;
        this.f5572g = -1;
        return i;
    }

    public final int c() {
        if (this.f5570e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.f5569d + 1;
        this.f5569d = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.i;
        if (i > arrayList.size()) {
            arrayList.add(new y8.e());
        }
        int i6 = this.f5572g;
        this.f5572g = -1;
        this.f5570e = 6;
        return i6;
    }

    public final y8.h d(int i) {
        if (this.f5570e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i6 = this.f5569d - 1;
        this.f5569d = i6;
        if (i6 < 0 || this.f5572g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f5567b == this.f5568c || i6 == 0) {
            this.f5568c = i;
            y8.e eVar = (y8.e) this.i.get(i6);
            long j6 = eVar.f41953u;
            return j6 > 0 ? eVar.B(j6) : y8.h.f41954w;
        }
        throw new IOException("Expected to end at " + this.f5568c + " but was " + this.f5567b);
    }

    public final int e() {
        int i;
        byte g4 = g();
        if (g4 >= 0) {
            return g4;
        }
        int i6 = g4 & Byte.MAX_VALUE;
        byte g9 = g();
        if (g9 >= 0) {
            i = g9 << 7;
        } else {
            i6 |= (g9 & Byte.MAX_VALUE) << 7;
            byte g10 = g();
            if (g10 >= 0) {
                i = g10 << 14;
            } else {
                i6 |= (g10 & Byte.MAX_VALUE) << 14;
                byte g11 = g();
                if (g11 < 0) {
                    int i9 = i6 | ((g11 & Byte.MAX_VALUE) << 21);
                    byte g12 = g();
                    int i10 = i9 | (g12 << 28);
                    if (g12 < 0) {
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (g() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i10;
                }
                i = g11 << 21;
            }
        }
        return i6 | i;
    }

    public final int f() {
        int i = this.f5570e;
        if (i == 7) {
            this.f5570e = 2;
            return this.f5571f;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f5567b < this.f5568c) {
            int e9 = e();
            if (e9 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i6 = e9 >> 3;
            this.f5571f = i6;
            int i9 = e9 & 7;
            if (i9 == 0) {
                this.f5573h = d.f5578u;
                this.f5570e = 0;
                return i6;
            }
            if (i9 == 1) {
                this.f5573h = d.f5579v;
                this.f5570e = 1;
                return i6;
            }
            if (i9 == 2) {
                this.f5573h = d.f5580w;
                this.f5570e = 2;
                int e10 = e();
                if (e10 < 0) {
                    throw new ProtocolException(AbstractC4404f.e(e10, "Negative length: "));
                }
                if (this.f5572g != -1) {
                    throw new IllegalStateException();
                }
                int i10 = this.f5568c;
                this.f5572g = i10;
                int i11 = this.f5567b + e10;
                this.f5568c = i11;
                if (i11 <= i10) {
                    return this.f5571f;
                }
                throw new EOFException();
            }
            if (i9 != 3) {
                if (i9 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i9 != 5) {
                    throw new ProtocolException(AbstractC4404f.e(i9, "Unexpected field encoding: "));
                }
                this.f5573h = d.f5581x;
                this.f5570e = 5;
                return i6;
            }
            o(i6);
        }
        return -1;
    }

    public final byte g() {
        int i = this.f5567b;
        if (i == this.f5568c) {
            throw new EOFException();
        }
        this.f5567b = i + 1;
        return this.f5566a[i];
    }

    public final int h() {
        int i = this.f5570e;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f5570e);
        }
        int i6 = this.f5567b;
        int i9 = i6 + 4;
        if (i9 > this.f5568c) {
            throw new EOFException();
        }
        int i10 = i6 + 1;
        this.f5567b = i10;
        byte[] bArr = this.f5566a;
        int i11 = bArr[i6] & 255;
        int i12 = i6 + 2;
        this.f5567b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i6 + 3;
        this.f5567b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f5567b = i9;
        int i16 = ((bArr[i14] & 255) << 24) | i15;
        a(5);
        return i16;
    }

    public final long i() {
        int i = this.f5570e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f5570e);
        }
        int i6 = this.f5567b;
        int i9 = i6 + 8;
        if (i9 > this.f5568c) {
            throw new EOFException();
        }
        this.f5567b = i6 + 1;
        byte[] bArr = this.f5566a;
        this.f5567b = i6 + 2;
        long j6 = (bArr[i6] & 255) | ((bArr[r3] & 255) << 8);
        this.f5567b = i6 + 3;
        long j9 = j6 | ((bArr[r9] & 255) << 16);
        this.f5567b = i6 + 4;
        long j10 = j9 | ((bArr[r3] & 255) << 24);
        this.f5567b = i6 + 5;
        long j11 = j10 | ((bArr[r9] & 255) << 32);
        this.f5567b = i6 + 6;
        this.f5567b = i6 + 7;
        this.f5567b = i9;
        long j12 = ((bArr[r0] & 255) << 56) | j11 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j12;
    }

    public final String j() {
        int b9 = b();
        int i = this.f5567b;
        int i6 = b9 + i;
        if (i6 > this.f5568c) {
            throw new EOFException();
        }
        byte[] bArr = this.f5566a;
        com.bumptech.glide.g.b(i, i6, bArr.length);
        String str = new String(bArr, i, i6 - i, Q7.a.f2664a);
        this.f5567b = i6;
        return str;
    }

    public final void k(int i) {
        d dVar = this.f5573h;
        kotlin.jvm.internal.h.b(dVar);
        Object b9 = dVar.a().b(this);
        F1.a aVar = new F1.a((y8.f) this.i.get(this.f5569d - 1));
        i a9 = dVar.a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a9.e(aVar, i, b9);
    }

    public final int l() {
        int i = this.f5570e;
        if (i == 0 || i == 2) {
            int e9 = e();
            a(0);
            return e9;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f5570e);
    }

    public final long m() {
        int i = this.f5570e;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f5570e);
        }
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            j6 |= (r4 & Byte.MAX_VALUE) << i6;
            if ((g() & com.anythink.core.common.s.a.c.f16316a) == 0) {
                a(0);
                return j6;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i = this.f5570e;
        if (i == 0) {
            m();
            return;
        }
        if (i == 1) {
            i();
            return;
        }
        if (i != 2) {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            h();
        } else {
            int b9 = this.f5567b + b();
            if (b9 > this.f5568c) {
                throw new EOFException();
            }
            this.f5567b = b9;
        }
    }

    public final void o(int i) {
        while (this.f5567b < this.f5568c) {
            int e9 = e();
            if (e9 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i6 = e9 >> 3;
            int i9 = e9 & 7;
            if (i9 == 0) {
                this.f5570e = 0;
                m();
            } else if (i9 == 1) {
                this.f5570e = 1;
                i();
            } else if (i9 == 2) {
                int e10 = this.f5567b + e();
                if (e10 > this.f5568c) {
                    throw new EOFException();
                }
                this.f5567b = e10;
            } else {
                if (i9 == 3) {
                    int i10 = this.f5569d + 1;
                    this.f5569d = i10;
                    if (i10 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i6);
                    } finally {
                    }
                    this.f5569d--;
                }
                if (i9 == 4) {
                    if (i6 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i9 != 5) {
                        throw new ProtocolException(AbstractC4404f.e(i9, "Unexpected field encoding: "));
                    }
                    this.f5570e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
