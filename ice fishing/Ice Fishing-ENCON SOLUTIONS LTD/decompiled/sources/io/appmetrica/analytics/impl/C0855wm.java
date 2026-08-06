package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;

/* renamed from: io.appmetrica.analytics.impl.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855wm extends MessageNano {

    /* renamed from: D, reason: collision with root package name */
    public static final int f7124D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f7125E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static final int f7126F = 1;
    public static volatile C0855wm[] G;

    /* renamed from: A, reason: collision with root package name */
    public C0803um f7127A;

    /* renamed from: B, reason: collision with root package name */
    public C0751sm[] f7128B;

    /* renamed from: C, reason: collision with root package name */
    public C0700qm f7129C;

    /* renamed from: a, reason: collision with root package name */
    public String f7130a;

    /* renamed from: b, reason: collision with root package name */
    public long f7131b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f7132c;

    /* renamed from: d, reason: collision with root package name */
    public String f7133d;

    /* renamed from: e, reason: collision with root package name */
    public String f7134e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f7135f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f7136g;

    /* renamed from: h, reason: collision with root package name */
    public C0674pm[] f7137h;

    /* renamed from: i, reason: collision with root package name */
    public C0725rm f7138i;

    /* renamed from: j, reason: collision with root package name */
    public String f7139j;

    /* renamed from: k, reason: collision with root package name */
    public String f7140k;

    /* renamed from: l, reason: collision with root package name */
    public String f7141l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7142m;

    /* renamed from: n, reason: collision with root package name */
    public String f7143n;

    /* renamed from: o, reason: collision with root package name */
    public String[] f7144o;

    /* renamed from: p, reason: collision with root package name */
    public C0829vm f7145p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7146q;

    /* renamed from: r, reason: collision with root package name */
    public String f7147r;

    /* renamed from: s, reason: collision with root package name */
    public long f7148s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7149u;

    /* renamed from: v, reason: collision with root package name */
    public C0777tm f7150v;

    /* renamed from: w, reason: collision with root package name */
    public int f7151w;

    /* renamed from: x, reason: collision with root package name */
    public int f7152x;

    /* renamed from: y, reason: collision with root package name */
    public C0648om f7153y;

    /* renamed from: z, reason: collision with root package name */
    public C0622nm f7154z;

    public C0855wm() {
        a();
    }

    public static C0855wm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (G == null) {
                        G = new C0855wm[0];
                    }
                } finally {
                }
            }
        }
        return G;
    }

    public final C0855wm a() {
        this.f7130a = "";
        this.f7131b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f7132c = strArr;
        this.f7133d = "";
        this.f7134e = "";
        this.f7135f = strArr;
        this.f7136g = strArr;
        this.f7137h = C0674pm.b();
        this.f7138i = null;
        this.f7139j = "";
        this.f7140k = "";
        this.f7141l = "";
        this.f7142m = false;
        this.f7143n = "";
        this.f7144o = strArr;
        this.f7145p = null;
        this.f7146q = false;
        this.f7147r = "";
        this.f7148s = 0L;
        this.t = 0L;
        this.f7149u = false;
        this.f7150v = null;
        this.f7151w = 600;
        this.f7152x = 1;
        this.f7153y = null;
        this.f7154z = null;
        this.f7127A = null;
        this.f7128B = C0751sm.b();
        this.f7129C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f7130a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7130a);
        }
        int computeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f7131b) + computeSerializedSize;
        String[] strArr = this.f7132c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f7132c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    i5++;
                    i4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i3++;
            }
            computeInt64Size = computeInt64Size + i4 + i5;
        }
        if (!this.f7133d.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7133d);
        }
        if (!this.f7134e.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f7134e);
        }
        String[] strArr3 = this.f7135f;
        if (strArr3 != null && strArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.f7135f;
                if (i6 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i6];
                if (str2 != null) {
                    i8++;
                    i7 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i6++;
            }
            computeInt64Size = computeInt64Size + i7 + i8;
        }
        String[] strArr5 = this.f7136g;
        if (strArr5 != null && strArr5.length > 0) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String[] strArr6 = this.f7136g;
                if (i9 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i9];
                if (str3 != null) {
                    i11++;
                    i10 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i9++;
            }
            computeInt64Size = computeInt64Size + i10 + i11;
        }
        C0674pm[] c0674pmArr = this.f7137h;
        if (c0674pmArr != null && c0674pmArr.length > 0) {
            int i12 = 0;
            while (true) {
                C0674pm[] c0674pmArr2 = this.f7137h;
                if (i12 >= c0674pmArr2.length) {
                    break;
                }
                C0674pm c0674pm = c0674pmArr2[i12];
                if (c0674pm != null) {
                    computeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c0674pm) + computeInt64Size;
                }
                i12++;
            }
        }
        C0725rm c0725rm = this.f7138i;
        if (c0725rm != null) {
            computeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c0725rm);
        }
        if (!this.f7139j.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f7139j);
        }
        if (!this.f7140k.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f7140k);
        }
        if (!this.f7141l.equals("")) {
            computeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f7141l);
        }
        int computeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f7142m) + computeInt64Size;
        if (!this.f7143n.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f7143n);
        }
        String[] strArr7 = this.f7144o;
        if (strArr7 != null && strArr7.length > 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.f7144o;
                if (i13 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i13];
                if (str4 != null) {
                    i15++;
                    i14 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i13++;
            }
            computeBoolSize = computeBoolSize + i14 + i15;
        }
        C0829vm c0829vm = this.f7145p;
        if (c0829vm != null) {
            computeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c0829vm);
        }
        boolean z2 = this.f7146q;
        if (z2) {
            computeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z2);
        }
        if (!this.f7147r.equals("")) {
            computeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f7147r);
        }
        int computeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f7148s) + computeBoolSize;
        boolean z3 = this.f7149u;
        if (z3) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z3);
        }
        C0777tm c0777tm = this.f7150v;
        if (c0777tm != null) {
            computeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c0777tm);
        }
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f7152x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f7151w) + computeInt64Size2;
        C0648om c0648om = this.f7153y;
        if (c0648om != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c0648om);
        }
        C0622nm c0622nm = this.f7154z;
        if (c0622nm != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c0622nm);
        }
        C0803um c0803um = this.f7127A;
        if (c0803um != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c0803um);
        }
        C0751sm[] c0751smArr = this.f7128B;
        if (c0751smArr != null && c0751smArr.length > 0) {
            while (true) {
                C0751sm[] c0751smArr2 = this.f7128B;
                if (i2 >= c0751smArr2.length) {
                    break;
                }
                C0751sm c0751sm = c0751smArr2[i2];
                if (c0751sm != null) {
                    computeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c0751sm) + computeInt32Size;
                }
                i2++;
            }
        }
        C0700qm c0700qm = this.f7129C;
        return c0700qm != null ? computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c0700qm) : computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7130a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7130a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f7131b);
        String[] strArr = this.f7132c;
        int i2 = 0;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f7132c;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i3];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i3++;
            }
        }
        if (!this.f7133d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7133d);
        }
        if (!this.f7134e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f7134e);
        }
        String[] strArr3 = this.f7135f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f7135f;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f7136g;
        if (strArr5 != null && strArr5.length > 0) {
            int i5 = 0;
            while (true) {
                String[] strArr6 = this.f7136g;
                if (i5 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i5];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i5++;
            }
        }
        C0674pm[] c0674pmArr = this.f7137h;
        if (c0674pmArr != null && c0674pmArr.length > 0) {
            int i6 = 0;
            while (true) {
                C0674pm[] c0674pmArr2 = this.f7137h;
                if (i6 >= c0674pmArr2.length) {
                    break;
                }
                C0674pm c0674pm = c0674pmArr2[i6];
                if (c0674pm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c0674pm);
                }
                i6++;
            }
        }
        C0725rm c0725rm = this.f7138i;
        if (c0725rm != null) {
            codedOutputByteBufferNano.writeMessage(9, c0725rm);
        }
        if (!this.f7139j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7139j);
        }
        if (!this.f7140k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f7140k);
        }
        if (!this.f7141l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f7141l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f7142m);
        if (!this.f7143n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f7143n);
        }
        String[] strArr7 = this.f7144o;
        if (strArr7 != null && strArr7.length > 0) {
            int i7 = 0;
            while (true) {
                String[] strArr8 = this.f7144o;
                if (i7 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i7];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i7++;
            }
        }
        C0829vm c0829vm = this.f7145p;
        if (c0829vm != null) {
            codedOutputByteBufferNano.writeMessage(16, c0829vm);
        }
        boolean z2 = this.f7146q;
        if (z2) {
            codedOutputByteBufferNano.writeBool(17, z2);
        }
        if (!this.f7147r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f7147r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f7148s);
        codedOutputByteBufferNano.writeInt64(22, this.t);
        boolean z3 = this.f7149u;
        if (z3) {
            codedOutputByteBufferNano.writeBool(23, z3);
        }
        C0777tm c0777tm = this.f7150v;
        if (c0777tm != null) {
            codedOutputByteBufferNano.writeMessage(24, c0777tm);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f7151w);
        codedOutputByteBufferNano.writeInt32(26, this.f7152x);
        C0648om c0648om = this.f7153y;
        if (c0648om != null) {
            codedOutputByteBufferNano.writeMessage(27, c0648om);
        }
        C0622nm c0622nm = this.f7154z;
        if (c0622nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c0622nm);
        }
        C0803um c0803um = this.f7127A;
        if (c0803um != null) {
            codedOutputByteBufferNano.writeMessage(30, c0803um);
        }
        C0751sm[] c0751smArr = this.f7128B;
        if (c0751smArr != null && c0751smArr.length > 0) {
            while (true) {
                C0751sm[] c0751smArr2 = this.f7128B;
                if (i2 >= c0751smArr2.length) {
                    break;
                }
                C0751sm c0751sm = c0751smArr2[i2];
                if (c0751sm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c0751sm);
                }
                i2++;
            }
        }
        C0700qm c0700qm = this.f7129C;
        if (c0700qm != null) {
            codedOutputByteBufferNano.writeMessage(32, c0700qm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0855wm b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0855wm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0855wm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    this.f7130a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f7131b = codedInputByteBufferNano.readInt64();
                    break;
                case C0376e9.G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f7132c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i2 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i2];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f7132c = strArr2;
                    break;
                case 34:
                    this.f7133d = codedInputByteBufferNano.readString();
                    break;
                case C0376e9.f5891M /* 42 */:
                    this.f7134e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f7135f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i3 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i3];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f7135f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f7136g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i4 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i4];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i4 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f7136g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C0674pm[] c0674pmArr = this.f7137h;
                    int length4 = c0674pmArr == null ? 0 : c0674pmArr.length;
                    int i5 = repeatedFieldArrayLength4 + length4;
                    C0674pm[] c0674pmArr2 = new C0674pm[i5];
                    if (length4 != 0) {
                        System.arraycopy(c0674pmArr, 0, c0674pmArr2, 0, length4);
                    }
                    while (length4 < i5 - 1) {
                        C0674pm c0674pm = new C0674pm();
                        c0674pmArr2[length4] = c0674pm;
                        codedInputByteBufferNano.readMessage(c0674pm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C0674pm c0674pm2 = new C0674pm();
                    c0674pmArr2[length4] = c0674pm2;
                    codedInputByteBufferNano.readMessage(c0674pm2);
                    this.f7137h = c0674pmArr2;
                    break;
                case 74:
                    if (this.f7138i == null) {
                        this.f7138i = new C0725rm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7138i);
                    break;
                case 82:
                    this.f7139j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f7140k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f7141l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f7142m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f7143n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f7144o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i6 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i6];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i6 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f7144o = strArr8;
                    break;
                case 130:
                    if (this.f7145p == null) {
                        this.f7145p = new C0829vm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7145p);
                    break;
                case 136:
                    this.f7146q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f7147r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f7148s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f7149u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f7150v == null) {
                        this.f7150v = new C0777tm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7150v);
                    break;
                case 200:
                    this.f7151w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f7152x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f7153y == null) {
                        this.f7153y = new C0648om();
                    }
                    codedInputByteBufferNano.readMessage(this.f7153y);
                    break;
                case 234:
                    if (this.f7154z == null) {
                        this.f7154z = new C0622nm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7154z);
                    break;
                case 242:
                    if (this.f7127A == null) {
                        this.f7127A = new C0803um();
                    }
                    codedInputByteBufferNano.readMessage(this.f7127A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C0751sm[] c0751smArr = this.f7128B;
                    int length6 = c0751smArr == null ? 0 : c0751smArr.length;
                    int i7 = repeatedFieldArrayLength6 + length6;
                    C0751sm[] c0751smArr2 = new C0751sm[i7];
                    if (length6 != 0) {
                        System.arraycopy(c0751smArr, 0, c0751smArr2, 0, length6);
                    }
                    while (length6 < i7 - 1) {
                        C0751sm c0751sm = new C0751sm();
                        c0751smArr2[length6] = c0751sm;
                        codedInputByteBufferNano.readMessage(c0751sm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C0751sm c0751sm2 = new C0751sm();
                    c0751smArr2[length6] = c0751sm2;
                    codedInputByteBufferNano.readMessage(c0751sm2);
                    this.f7128B = c0751smArr2;
                    break;
                case 258:
                    if (this.f7129C == null) {
                        this.f7129C = new C0700qm();
                    }
                    codedInputByteBufferNano.readMessage(this.f7129C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static C0855wm a(byte[] bArr) {
        return (C0855wm) MessageNano.mergeFrom(new C0855wm(), bArr);
    }
}
