package c6;

import com.google.android.gms.internal.ads.Wv;
import i1.C4586c;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0555a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5742a;

    /* renamed from: c, reason: collision with root package name */
    public int f5744c;

    /* renamed from: d, reason: collision with root package name */
    public int f5745d;

    /* renamed from: h, reason: collision with root package name */
    public d f5749h;

    /* renamed from: j, reason: collision with root package name */
    public C4586c f5750j;

    /* renamed from: b, reason: collision with root package name */
    public int f5743b = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f5746e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f5747f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f5748g = -1;
    public final ArrayList i = new ArrayList();

    public C0555a(byte[] bArr, int i) {
        this.f5742a = bArr;
        this.f5744c = i;
    }

    public final void a(int i) {
        if (this.f5746e == i) {
            this.f5746e = 6;
            return;
        }
        int i4 = this.f5743b;
        int i6 = this.f5744c;
        if (i4 > i6) {
            throw new IOException("Expected to end at " + this.f5744c + " but was " + this.f5743b);
        }
        if (i4 != i6) {
            this.f5746e = 7;
            return;
        }
        this.f5744c = this.f5748g;
        this.f5748g = -1;
        this.f5746e = 6;
    }

    public final int b() {
        if (this.f5746e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f5746e);
        }
        int i = this.f5744c - this.f5743b;
        this.f5746e = 6;
        this.f5744c = this.f5748g;
        this.f5748g = -1;
        return i;
    }

    public final int c() {
        if (this.f5746e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.f5745d + 1;
        this.f5745d = i;
        if (i > 100) {
            throw new IOException("Wire recursion limit exceeded");
        }
        ArrayList arrayList = this.i;
        if (i > arrayList.size()) {
            arrayList.add(new y8.e());
        }
        int i4 = this.f5748g;
        this.f5748g = -1;
        this.f5746e = 6;
        return i4;
    }

    public final y8.h d(int i) {
        if (this.f5746e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i4 = this.f5745d - 1;
        this.f5745d = i4;
        if (i4 < 0 || this.f5748g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f5743b == this.f5744c || i4 == 0) {
            this.f5744c = i;
            y8.e eVar = (y8.e) this.i.get(i4);
            long j6 = eVar.f41924u;
            return j6 > 0 ? eVar.B(j6) : y8.h.f41925w;
        }
        throw new IOException("Expected to end at " + this.f5744c + " but was " + this.f5743b);
    }

    public final int e() {
        int i;
        byte g9 = g();
        if (g9 >= 0) {
            return g9;
        }
        int i4 = g9 & Byte.MAX_VALUE;
        byte g10 = g();
        if (g10 >= 0) {
            i = g10 << 7;
        } else {
            i4 |= (g10 & Byte.MAX_VALUE) << 7;
            byte g11 = g();
            if (g11 >= 0) {
                i = g11 << 14;
            } else {
                i4 |= (g11 & Byte.MAX_VALUE) << 14;
                byte g12 = g();
                if (g12 < 0) {
                    int i6 = i4 | ((g12 & Byte.MAX_VALUE) << 21);
                    byte g13 = g();
                    int i9 = i6 | (g13 << 28);
                    if (g13 < 0) {
                        for (int i10 = 0; i10 < 5; i10++) {
                            if (g() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i9;
                }
                i = g12 << 21;
            }
        }
        return i4 | i;
    }

    public final int f() {
        int i = this.f5746e;
        if (i == 7) {
            this.f5746e = 2;
            return this.f5747f;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f5743b < this.f5744c) {
            int e9 = e();
            if (e9 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = e9 >> 3;
            this.f5747f = i4;
            int i6 = e9 & 7;
            if (i6 == 0) {
                this.f5749h = d.f5754u;
                this.f5746e = 0;
                return i4;
            }
            if (i6 == 1) {
                this.f5749h = d.f5755v;
                this.f5746e = 1;
                return i4;
            }
            if (i6 == 2) {
                this.f5749h = d.f5756w;
                this.f5746e = 2;
                int e10 = e();
                if (e10 < 0) {
                    throw new ProtocolException(Wv.f(e10, "Negative length: "));
                }
                if (this.f5748g != -1) {
                    throw new IllegalStateException();
                }
                int i9 = this.f5744c;
                this.f5748g = i9;
                int i10 = this.f5743b + e10;
                this.f5744c = i10;
                if (i10 <= i9) {
                    return this.f5747f;
                }
                throw new EOFException();
            }
            if (i6 != 3) {
                if (i6 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i6 != 5) {
                    throw new ProtocolException(Wv.f(i6, "Unexpected field encoding: "));
                }
                this.f5749h = d.f5757x;
                this.f5746e = 5;
                return i4;
            }
            o(i4);
        }
        return -1;
    }

    public final byte g() {
        int i = this.f5743b;
        if (i == this.f5744c) {
            throw new EOFException();
        }
        this.f5743b = i + 1;
        return this.f5742a[i];
    }

    public final int h() {
        int i = this.f5746e;
        if (i != 5 && i != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f5746e);
        }
        int i4 = this.f5743b;
        int i6 = i4 + 4;
        if (i6 > this.f5744c) {
            throw new EOFException();
        }
        int i9 = i4 + 1;
        this.f5743b = i9;
        byte[] bArr = this.f5742a;
        int i10 = bArr[i4] & 255;
        int i11 = i4 + 2;
        this.f5743b = i11;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        int i13 = i4 + 3;
        this.f5743b = i13;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.f5743b = i6;
        int i15 = ((bArr[i13] & 255) << 24) | i14;
        a(5);
        return i15;
    }

    public final long i() {
        int i = this.f5746e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f5746e);
        }
        int i4 = this.f5743b;
        int i6 = i4 + 8;
        if (i6 > this.f5744c) {
            throw new EOFException();
        }
        this.f5743b = i4 + 1;
        byte[] bArr = this.f5742a;
        this.f5743b = i4 + 2;
        long j6 = (bArr[i4] & 255) | ((bArr[r3] & 255) << 8);
        this.f5743b = i4 + 3;
        long j9 = j6 | ((bArr[r9] & 255) << 16);
        this.f5743b = i4 + 4;
        long j10 = j9 | ((bArr[r3] & 255) << 24);
        this.f5743b = i4 + 5;
        long j11 = j10 | ((bArr[r9] & 255) << 32);
        this.f5743b = i4 + 6;
        this.f5743b = i4 + 7;
        this.f5743b = i6;
        long j12 = ((bArr[r0] & 255) << 56) | j11 | ((bArr[r3] & 255) << 40) | ((bArr[r9] & 255) << 48);
        a(1);
        return j12;
    }

    public final String j() {
        int b9 = b();
        int i = this.f5743b;
        int i4 = b9 + i;
        if (i4 > this.f5744c) {
            throw new EOFException();
        }
        byte[] bArr = this.f5742a;
        S0.f.b(i, i4, bArr.length);
        String str = new String(bArr, i, i4 - i, Q7.a.f2701a);
        this.f5743b = i4;
        return str;
    }

    public final void k(int i) {
        d dVar = this.f5749h;
        kotlin.jvm.internal.h.b(dVar);
        Object b9 = dVar.a().b(this);
        n4.c cVar = new n4.c((y8.f) this.i.get(this.f5745d - 1));
        i a9 = dVar.a();
        kotlin.jvm.internal.h.c(a9, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        a9.e(cVar, i, b9);
    }

    public final int l() {
        int i = this.f5746e;
        if (i == 0 || i == 2) {
            int e9 = e();
            a(0);
            return e9;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f5746e);
    }

    public final long m() {
        int i = this.f5746e;
        if (i != 0 && i != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f5746e);
        }
        long j6 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j6 |= (r4 & Byte.MAX_VALUE) << i4;
            if ((g() & com.anythink.core.common.s.a.c.f17103a) == 0) {
                a(0);
                return j6;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n() {
        int i = this.f5746e;
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
            int b9 = this.f5743b + b();
            if (b9 > this.f5744c) {
                throw new EOFException();
            }
            this.f5743b = b9;
        }
    }

    public final void o(int i) {
        while (this.f5743b < this.f5744c) {
            int e9 = e();
            if (e9 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i4 = e9 >> 3;
            int i6 = e9 & 7;
            if (i6 == 0) {
                this.f5746e = 0;
                m();
            } else if (i6 == 1) {
                this.f5746e = 1;
                i();
            } else if (i6 == 2) {
                int e10 = this.f5743b + e();
                if (e10 > this.f5744c) {
                    throw new EOFException();
                }
                this.f5743b = e10;
            } else {
                if (i6 == 3) {
                    int i9 = this.f5745d + 1;
                    this.f5745d = i9;
                    if (i9 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        o(i4);
                    } finally {
                    }
                    this.f5745d--;
                }
                if (i6 == 4) {
                    if (i4 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                } else {
                    if (i6 != 5) {
                        throw new ProtocolException(Wv.f(i6, "Unexpected field encoding: "));
                    }
                    this.f5746e = 5;
                    h();
                }
            }
        }
        throw new EOFException();
    }
}
