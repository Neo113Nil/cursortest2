package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.music.databases.main.MainDatabase;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e05 extends aur implements Function2 {
    public final /* synthetic */ int j = 3;
    public int k;
    public int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(wnh wnhVar, co6 co6Var, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.p = wnhVar;
        this.q = co6Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e05((e15) this.q, (Integer) this.o, continuation);
            case 1:
                return new e05((cvl) this.p, (klg) this.q, continuation);
            case 2:
                e05 e05Var = new e05((wnh) this.p, (co6) this.q, this.l, this.m, continuation);
                e05Var.o = obj;
                return e05Var;
            default:
                return new e05((cks) this.q, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((e05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((e05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((e05) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((e05) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(1:(1:(11:8|9|10|11|12|13|14|15|16|17|18)(2:52|53))(1:54))(4:98|(1:100)|76|77)|55|56|58|59|(5:64|66|67|68|(7:83|84|85|15|16|17|18)(4:70|71|72|(4:74|(8:78|12|13|14|15|16|17|18)|76|77)(2:79|80)))|25|17|18) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:3|4|(1:(1:(11:8|9|10|11|12|13|14|15|16|17|18)(2:52|53))(1:54))(4:98|(1:100)|76|77)|55|56|58|59|(5:64|66|67|68|(7:83|84|85|15|16|17|18)(4:70|71|72|(4:74|(8:78|12|13|14|15|16|17|18)|76|77)(2:79|80)))|25|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022c, code lost:
    
        if (((defpackage.oc4) r11).d.m(r2, r21) == r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d3, code lost:
    
        if (((defpackage.oc4) r11).d.m(r3, r21) == r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x020a, code lost:
    
        if (r0 == r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01a9, code lost:
    
        if (r4 == r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e4, code lost:
    
        if (r0 != r10) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0302, code lost:
    
        if (r2.c(r4, r21) == r10) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03d8, code lost:
    
        if (r2 == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012b, code lost:
    
        r18 = "TinyMlProgramStateStorage";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0126, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0127, code lost:
    
        r18 = "TinyMlProgramStateStorage";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0134, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0135, code lost:
    
        r3 = "TinyMlProgramStateStorage";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Integer num;
        int i;
        Boolean bool;
        int i2;
        Object a;
        Object h;
        cvl cvlVar;
        xlg xlgVar;
        int i3;
        Object V;
        Serializable k;
        xqn i4;
        Object a2;
        Object S;
        cks cksVar;
        oqi oqiVar;
        int i5;
        String str;
        final FileChannel channel;
        Throwable th;
        FileChannel fileChannel;
        oqi oqiVar2;
        FileChannel fileChannel2;
        int[] iArr;
        int i6;
        ByteBuffer byteBuffer;
        FileChannel fileChannel3;
        boolean z = true;
        ?? r6 = 1;
        int i7 = 0;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i8 = this.m;
                if (i8 == 0) {
                    qgg.h0(obj);
                    e15 e15Var = (e15) this.q;
                    Integer num2 = (Integer) this.o;
                    Boolean bool2 = Boolean.TRUE;
                    String str2 = ((frt) l18.b.c(hag.I(frt.class))).c().a;
                    str2.getClass();
                    i5h g = e15Var.g();
                    this.n = num2;
                    this.p = bool2;
                    this.k = 0;
                    this.l = 0;
                    this.m = 1;
                    b = g.b(str2, this);
                    if (b != nm6Var) {
                        num = num2;
                        i = 0;
                        bool = bool2;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                    List list = (List) a;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(tt0.M((zd1) it.next()));
                    }
                    return arrayList;
                }
                int i9 = this.l;
                int i10 = this.k;
                Boolean bool3 = (Boolean) this.p;
                Integer num3 = (Integer) this.n;
                qgg.h0(obj);
                num = num3;
                bool = bool3;
                i2 = i10;
                i = i9;
                b = obj;
                ce1 z2 = ((MainDatabase) b).z();
                ysr ysrVar = new ysr("artist_mview");
                um4 um4Var = new um4(pgp.a);
                um4Var.i("(available=1)", xz0.X(new Object[0]));
                if (bool != null) {
                    um4Var.c("liked", bool.booleanValue());
                }
                tt0.K(ysrVar, um4Var);
                ysrVar.f = "timestamp DESC";
                if (num != null) {
                    ysrVar.b(String.valueOf(num.intValue()));
                }
                atn a3 = ysrVar.a();
                this.n = null;
                this.p = null;
                this.k = i2;
                this.l = i;
                this.m = 2;
                a = z2.a(a3, this);
                break;
            case 1:
                klg klgVar = (klg) this.q;
                cvl cvlVar2 = (cvl) this.p;
                nm6 nm6Var2 = nm6.a;
                int i11 = this.m;
                if (i11 == 0) {
                    qgg.h0(obj);
                    jyr jyrVar = i2q.e;
                    if (lsq.v()) {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(frt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        ((frt) qdcVar.C(I)).c().a.getClass();
                        xlg a4 = klgVar.a();
                        t3g t3gVar = (t3g) klgVar.f.getValue();
                        this.n = cvlVar2;
                        this.o = a4;
                        this.k = 0;
                        this.l = 0;
                        this.m = 1;
                        h = t3gVar.h(cvlVar2, this);
                        if (h != nm6Var2) {
                            cvlVar = cvlVar2;
                            xlgVar = a4;
                            i3 = 0;
                            this.n = null;
                            this.o = null;
                            this.k = i7;
                            this.l = i3;
                            this.m = 2;
                            xlgVar.getClass();
                            V = x97.V(dm6.a, new cg1(cvlVar, xlgVar, ((Boolean) h).booleanValue(), (Continuation) null, 11), this);
                        }
                    } else {
                        if (Intrinsics.d(cvlVar2.l, xxr.b)) {
                            pi4 pi4Var = (pi4) klgVar.d.getValue();
                            this.m = 3;
                            break;
                        }
                        btl btlVar = klgVar.c;
                        this.m = 4;
                        k = btlVar.k(cvlVar2, this);
                        if (k != nm6Var2) {
                        }
                    }
                    return nm6Var2;
                }
                if (i11 == 1) {
                    int i12 = this.l;
                    int i13 = this.k;
                    xlg xlgVar2 = (xlg) this.o;
                    cvl cvlVar3 = (cvl) this.n;
                    qgg.h0(obj);
                    cvlVar = cvlVar3;
                    xlgVar = xlgVar2;
                    i3 = i12;
                    i7 = i13;
                    h = obj;
                    this.n = null;
                    this.o = null;
                    this.k = i7;
                    this.l = i3;
                    this.m = 2;
                    xlgVar.getClass();
                    V = x97.V(dm6.a, new cg1(cvlVar, xlgVar, ((Boolean) h).booleanValue(), (Continuation) null, 11), this);
                    break;
                } else {
                    if (i11 == 2) {
                        qgg.h0(obj);
                        V = obj;
                        return (cvl) V;
                    }
                    if (i11 != 3) {
                        if (i11 == 4) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    btl btlVar2 = klgVar.c;
                    this.m = 4;
                    k = btlVar2.k(cvlVar2, this);
                    if (k != nm6Var2) {
                        return k;
                    }
                    return nm6Var2;
                }
            case 2:
                int i14 = this.m;
                co6 co6Var = (co6) this.q;
                wnh wnhVar = (wnh) this.p;
                mm6 mm6Var = (ltm) this.o;
                nm6 nm6Var3 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    i4 = hrg.i(obj);
                    Context context = wnhVar.a;
                    cce cceVar = wnhVar.b;
                    pce d0 = n7w.d0(co6Var, context, this.l, i14, i14);
                    d0.d = new x0(i4, mm6Var, i14, 16);
                    d0.d();
                    rce a5 = d0.a();
                    this.o = mm6Var;
                    this.n = i4;
                    this.k = 1;
                    a2 = cceVar.a(a5, this);
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 == 3) {
                                xqn xqnVar = (xqn) this.n;
                                qgg.h0(obj);
                                i4 = xqnVar;
                                S = obj;
                                byte[] bArr = (byte[]) S;
                                r2f r2fVar = (r2f) i4.a;
                                if (r2fVar != null) {
                                    r2fVar.g(null);
                                }
                                snh snhVar = new snh(bArr);
                                this.o = null;
                                this.n = null;
                                this.k = 4;
                                break;
                            } else if (i15 != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    i4 = (xqn) this.n;
                    qgg.h0(obj);
                    a2 = obj;
                }
                sce sceVar = (sce) a2;
                if (sceVar instanceof pgb) {
                    Drawable drawable = ((pgb) sceVar).a;
                    r2f r2fVar2 = (r2f) i4.a;
                    if (r2fVar2 != null) {
                        r2fVar2.g(null);
                    }
                    tnh tnhVar = new tnh(drawable, i14);
                    this.o = null;
                    this.n = null;
                    this.k = 2;
                    break;
                } else {
                    if (!(sceVar instanceof bqr)) {
                        b6e.s();
                        return null;
                    }
                    Bitmap N = vq2.N(((bqr) sceVar).a, 0, 0, 7);
                    qo6 qo6Var = co6Var.b;
                    qo6Var.getClass();
                    switch (qo6Var.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            z = false;
                        case 8:
                        case 9:
                            this.o = mm6Var;
                            this.n = i4;
                            this.k = 3;
                            S = sk3.S(wnhVar.d, new axb(z, N, new nzb(2, (byte) 0)), this);
                            break;
                        default:
                            b6e.s();
                            return null;
                    }
                }
                return nm6Var3;
            default:
                nm6 nm6Var4 = nm6.a;
                int i16 = this.m;
                try {
                    if (i16 == 0) {
                        qgg.h0(obj);
                        cksVar = (cks) this.q;
                        qqi qqiVar = cksVar.c;
                        this.n = qqiVar;
                        this.o = cksVar;
                        this.k = 0;
                        this.m = 1;
                        if (qqiVar.a(this) != nm6Var4) {
                            oqiVar = qqiVar;
                            i5 = 0;
                        }
                        return nm6Var4;
                    }
                    if (i16 != 1) {
                        if (i16 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = this.l;
                        byteBuffer = (ByteBuffer) this.p;
                        ?? r3 = (Closeable) this.o;
                        oqiVar2 = (oqi) this.n;
                        try {
                            qgg.h0(obj);
                            str = "TinyMlProgramStateStorage";
                            fileChannel3 = r3;
                            try {
                                byteBuffer.flip();
                                iArr = new int[i6];
                                byteBuffer.asIntBuffer().get(iArr);
                                channel = fileChannel3;
                                oqiVar = oqiVar2;
                                try {
                                    yd5.q(channel, null);
                                } catch (IOException e) {
                                    e = e;
                                    String str3 = str;
                                    ssg.a(6, str3, "Failed to load data", e);
                                    iArr = null;
                                    oqiVar.b(null);
                                    return iArr;
                                } catch (SecurityException e2) {
                                    e = e2;
                                    ssg.a(6, str, "Failed to load data", e);
                                    iArr = null;
                                    oqiVar.b(null);
                                    return iArr;
                                }
                                oqiVar.b(null);
                                return iArr;
                            } catch (Throwable th2) {
                                th = th2;
                                fileChannel = fileChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    try {
                                        yd5.q(fileChannel, th);
                                        throw th3;
                                    } catch (IOException e3) {
                                        e = e3;
                                        oqiVar = oqiVar2;
                                        String str32 = str;
                                        ssg.a(6, str32, "Failed to load data", e);
                                        iArr = null;
                                        oqiVar.b(null);
                                        return iArr;
                                    } catch (SecurityException e4) {
                                        e = e4;
                                        oqiVar = oqiVar2;
                                        ssg.a(6, str, "Failed to load data", e);
                                        iArr = null;
                                        oqiVar.b(null);
                                        return iArr;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r6 = oqiVar2;
                                        r6.b(null);
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileChannel2 = r3;
                            str = "TinyMlProgramStateStorage";
                            fileChannel = fileChannel2;
                            throw th;
                        }
                    }
                    i5 = this.k;
                    cksVar = (cks) this.o;
                    oqiVar = (oqi) this.n;
                    qgg.h0(obj);
                    if (cksVar.a.exists() && cksVar.a.length() != 0) {
                        channel = cksVar.b.openRead().getChannel();
                        try {
                            final long size = channel.size();
                            if (size == 0) {
                                try {
                                    iArr = new int[0];
                                    str = "TinyMlProgramStateStorage";
                                    yd5.q(channel, null);
                                    oqiVar.b(null);
                                    return iArr;
                                } catch (Throwable th6) {
                                    th = th6;
                                    fileChannel2 = channel;
                                    oqiVar2 = oqiVar;
                                    str = "TinyMlProgramStateStorage";
                                    fileChannel = fileChannel2;
                                    throw th;
                                }
                            }
                            str = "TinyMlProgramStateStorage";
                            long j = 4;
                            try {
                                if (size % j != 0) {
                                    throw new IOException("File size (" + size + ") is not a multiple of Int size.");
                                }
                                i6 = (int) (size / j);
                                final ByteBuffer allocate = ByteBuffer.allocate((int) size);
                                allocate.order(ByteOrder.nativeOrder());
                                Function0 function0 = new Function0() { // from class: bks
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int read;
                                        long j2 = 0;
                                        while (true) {
                                            ByteBuffer byteBuffer2 = allocate;
                                            if (!byteBuffer2.hasRemaining() || (read = channel.read(byteBuffer2)) < 0) {
                                                break;
                                            }
                                            j2 += read;
                                        }
                                        long j3 = size;
                                        if (j2 == j3) {
                                            return Unit.a;
                                        }
                                        StringBuilder l = tlm.l(j2, "Unexpected EOF: read=", ", size=");
                                        l.append(j3);
                                        throw new IOException(l.toString());
                                    }
                                };
                                this.n = oqiVar;
                                this.o = channel;
                                this.p = allocate;
                                this.k = i5;
                                this.l = i6;
                                this.m = 2;
                                if (sk3.S(g.a, function0, this) != nm6Var4) {
                                    byteBuffer = allocate;
                                    fileChannel3 = channel;
                                    oqiVar2 = oqiVar;
                                    byteBuffer.flip();
                                    iArr = new int[i6];
                                    byteBuffer.asIntBuffer().get(iArr);
                                    channel = fileChannel3;
                                    oqiVar = oqiVar2;
                                    yd5.q(channel, null);
                                    oqiVar.b(null);
                                    return iArr;
                                }
                                return nm6Var4;
                            } catch (Throwable th7) {
                                th = th7;
                                th = th;
                                fileChannel = channel;
                                oqiVar2 = oqiVar;
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str = "TinyMlProgramStateStorage";
                        }
                    }
                    iArr = null;
                    oqiVar.b(null);
                    return iArr;
                } catch (Throwable th9) {
                    th = th9;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(e15 e15Var, Integer num, Continuation continuation) {
        super(2, continuation);
        this.q = e15Var;
        this.o = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(cvl cvlVar, klg klgVar, Continuation continuation) {
        super(2, continuation);
        this.p = cvlVar;
        this.q = klgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e05(cks cksVar, Continuation continuation) {
        super(2, continuation);
        this.q = cksVar;
    }
}
