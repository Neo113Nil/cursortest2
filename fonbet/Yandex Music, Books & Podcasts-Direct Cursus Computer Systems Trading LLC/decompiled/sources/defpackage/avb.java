package defpackage;

import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class avb extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb(ked kedVar, egd egdVar, vgd vgdVar, Continuation continuation) {
        super(2, continuation);
        this.r = kedVar;
        this.s = egdVar;
        this.t = vgdVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                avb avbVar = new avb((bvb) this.t, continuation);
                avbVar.s = obj;
                return avbVar;
            case 1:
                return new avb((ked) this.r, (egd) this.s, (vgd) this.t, continuation);
            default:
                return new avb((String) this.q, (kzi) this.r, (izi) this.t, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((avb) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v6, types: [oqi] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ou7 p;
        snq snqVar;
        mu7 mu7Var;
        snq snqVar2;
        int i;
        snq snqVar3;
        snq snqVar4;
        snq snqVar5;
        Object H;
        snq snqVar6;
        snq snqVar7;
        snq snqVar8;
        snq snqVar9;
        bjd bjdVar;
        qqi qqiVar;
        int i2;
        egd egdVar;
        vgd vgdVar;
        oqi oqiVar;
        Object a;
        kzi kziVar;
        izi iziVar;
        Object obj2;
        qdc qdcVar;
        int i3;
        String str;
        Throwable th;
        String str2;
        qdc qdcVar2;
        AtomicFile atomicFile;
        FileOutputStream startWrite;
        Exception exc;
        AtomicFile atomicFile2;
        FileOutputStream fileOutputStream;
        switch (this.j) {
            case 0:
                bvb bvbVar = (bvb) this.t;
                mm6 mm6Var = (mm6) this.s;
                nm6 nm6Var = nm6.a;
                int i4 = this.l;
                Continuation continuation = null;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ou7 p2 = x97.p(mm6Var, null, null, new zub(bvbVar, continuation, 1), 3);
                    p = x97.p(mm6Var, null, null, new zub(bvbVar, continuation, 2), 3);
                    ou7 p3 = x97.p(mm6Var, null, null, new zub(bvbVar, continuation, 0), 3);
                    snqVar = (snq) bvbVar.d.getValue();
                    snq snqVar10 = (snq) bvbVar.e.getValue();
                    this.s = null;
                    this.m = p;
                    this.n = p3;
                    this.o = snqVar;
                    this.p = snqVar10;
                    this.k = 0;
                    this.l = 1;
                    obj = p2.s(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    mu7Var = p3;
                    snqVar2 = snqVar10;
                    i = 0;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            snq snqVar11 = (snq) this.r;
                            snq snqVar12 = (snq) this.q;
                            snqVar7 = (snq) this.p;
                            snq snqVar13 = (snq) this.o;
                            qgg.h0(obj);
                            snqVar8 = snqVar12;
                            snqVar9 = snqVar13;
                            snqVar6 = snqVar11;
                            return new wub(snqVar9, snqVar7, snqVar8, snqVar6, (snq) obj);
                        }
                        i = this.k;
                        snqVar3 = (snq) this.q;
                        snqVar5 = (snq) this.p;
                        snqVar4 = (snq) this.o;
                        mu7Var = (mu7) this.n;
                        qgg.h0(obj);
                        snq snqVar14 = (snq) obj;
                        this.s = null;
                        this.m = null;
                        this.n = null;
                        this.o = snqVar4;
                        this.p = snqVar5;
                        this.q = snqVar3;
                        this.r = snqVar14;
                        this.k = i;
                        this.l = 3;
                        H = mu7Var.H(this);
                        if (H != nm6Var) {
                            return nm6Var;
                        }
                        snqVar6 = snqVar14;
                        obj = H;
                        snqVar7 = snqVar5;
                        snqVar8 = snqVar3;
                        snqVar9 = snqVar4;
                        return new wub(snqVar9, snqVar7, snqVar8, snqVar6, (snq) obj);
                    }
                    i = this.k;
                    snqVar2 = (snq) this.p;
                    snqVar = (snq) this.o;
                    mu7Var = (mu7) this.n;
                    p = (ou7) this.m;
                    qgg.h0(obj);
                }
                snq snqVar15 = (snq) obj;
                this.s = null;
                this.m = null;
                this.n = mu7Var;
                this.o = snqVar;
                this.p = snqVar2;
                this.q = snqVar15;
                this.k = i;
                this.l = 2;
                Object H2 = p.H(this);
                if (H2 == nm6Var) {
                    return nm6Var;
                }
                snq snqVar16 = snqVar2;
                snqVar3 = snqVar15;
                obj = H2;
                snqVar4 = snqVar;
                snqVar5 = snqVar16;
                snq snqVar142 = (snq) obj;
                this.s = null;
                this.m = null;
                this.n = null;
                this.o = snqVar4;
                this.p = snqVar5;
                this.q = snqVar3;
                this.r = snqVar142;
                this.k = i;
                this.l = 3;
                H = mu7Var.H(this);
                if (H != nm6Var) {
                }
            case 1:
                ked kedVar = (ked) this.r;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.l;
                if (i5 == 0) {
                    qgg.h0(obj);
                    bjdVar = (bjd) ((yjd) kedVar.c.getValue()).g.getValue();
                    if (!(bjdVar instanceof ajd)) {
                        if (bjdVar instanceof yid) {
                            return new ded(bjdVar);
                        }
                        if (bjdVar instanceof zid) {
                            return new ded(bjdVar);
                        }
                        b6e.s();
                        return null;
                    }
                    qqiVar = kedVar.d;
                    egd egdVar2 = (egd) this.s;
                    vgd vgdVar2 = (vgd) this.t;
                    this.m = (ajd) bjdVar;
                    this.n = qqiVar;
                    this.o = kedVar;
                    this.p = egdVar2;
                    this.q = vgdVar2;
                    i2 = 0;
                    this.k = 0;
                    this.l = 1;
                    if (qqiVar.a(this) == nm6Var2) {
                        return nm6Var2;
                    }
                    egdVar = egdVar2;
                    vgdVar = vgdVar2;
                    String str3 = ((ajd) bjdVar).a.a;
                    this.m = null;
                    this.n = qqiVar;
                    this.o = null;
                    this.p = null;
                    this.q = null;
                    this.k = i2;
                    this.l = 2;
                    a = ked.a(kedVar, str3, egdVar, vgdVar, this);
                    if (a != nm6Var2) {
                    }
                } else if (i5 == 1) {
                    int i6 = this.k;
                    vgdVar = (vgd) this.q;
                    egdVar = (egd) this.p;
                    ked kedVar2 = (ked) this.o;
                    ?? r7 = (oqi) this.n;
                    bjdVar = (ajd) this.m;
                    qgg.h0(obj);
                    qqiVar = r7;
                    i2 = i6;
                    kedVar = kedVar2;
                    try {
                        String str32 = ((ajd) bjdVar).a.a;
                        this.m = null;
                        this.n = qqiVar;
                        this.o = null;
                        this.p = null;
                        this.q = null;
                        this.k = i2;
                        this.l = 2;
                        a = ked.a(kedVar, str32, egdVar, vgdVar, this);
                        if (a != nm6Var2) {
                            return nm6Var2;
                        }
                        oqiVar = qqiVar;
                        obj = a;
                    } catch (Throwable th2) {
                        th = th2;
                        oqiVar = qqiVar;
                        Throwable th3 = th;
                        oqiVar.b(null);
                        throw th3;
                    }
                } else {
                    if (i5 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oqiVar = (oqi) this.n;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        Throwable th32 = th;
                        oqiVar.b(null);
                        throw th32;
                    }
                }
                hed hedVar = (hed) obj;
                oqiVar.b(null);
                return hedVar;
            default:
                String str4 = (String) this.q;
                nm6 nm6Var3 = nm6.a;
                int i7 = this.l;
                try {
                    try {
                        if (i7 == 0) {
                            qgg.h0(obj);
                            if (str4.length() > 255) {
                                ssg.a(7, "NetworkCacheStorage", hrg.q("key=", str4, " length more than maximum filename length = 255"), null);
                            }
                            kziVar = (kzi) this.r;
                            qdc qdcVar3 = kziVar.b;
                            iziVar = (izi) this.t;
                            this.m = qdcVar3;
                            this.n = str4;
                            this.s = kziVar;
                            this.o = str4;
                            this.p = iziVar;
                            this.k = 0;
                            this.l = 1;
                            Pair n = qdcVar3.n(str4, false);
                            wjn wjnVar = (wjn) n.a;
                            if (((Boolean) n.b).booleanValue()) {
                                obj2 = Unit.a;
                            } else {
                                obj2 = wjnVar.b(this);
                                if (obj2 != nm6Var3) {
                                    obj2 = Unit.a;
                                }
                            }
                            if (obj2 == nm6Var3) {
                                return nm6Var3;
                            }
                            qdcVar = qdcVar3;
                            i3 = 0;
                            str = str4;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                fileOutputStream = (FileOutputStream) this.o;
                                atomicFile2 = (AtomicFile) this.s;
                                str2 = (String) this.n;
                                qdcVar2 = (qdc) this.m;
                                try {
                                    try {
                                        qgg.h0(obj);
                                        fileOutputStream.flush();
                                        atomicFile2.finishWrite(fileOutputStream);
                                        qdcVar2.P(str2);
                                        return obj;
                                    } catch (Exception e) {
                                        exc = e;
                                        atomicFile2.failWrite(fileOutputStream);
                                        throw exc;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    qdcVar2.P(str2);
                                    throw th;
                                }
                            }
                            int i8 = this.k;
                            iziVar = (izi) this.p;
                            String str5 = (String) this.o;
                            kziVar = (kzi) this.s;
                            str = (String) this.n;
                            qdcVar = (qdc) this.m;
                            qgg.h0(obj);
                            i3 = i8;
                            str4 = str5;
                        }
                        startWrite.getClass();
                        this.m = qdcVar;
                        this.n = str;
                        this.s = atomicFile;
                        this.o = startWrite;
                        this.p = null;
                        this.k = i3;
                        this.l = 2;
                        obj = iziVar.invoke(startWrite, this);
                        if (obj == nm6Var3) {
                            return nm6Var3;
                        }
                        atomicFile2 = atomicFile;
                        fileOutputStream = startWrite;
                        str2 = str;
                        qdcVar2 = qdcVar;
                        fileOutputStream.flush();
                        atomicFile2.finishWrite(fileOutputStream);
                        qdcVar2.P(str2);
                        return obj;
                    } catch (Exception e2) {
                        exc = e2;
                        atomicFile2 = atomicFile;
                        fileOutputStream = startWrite;
                        str2 = str;
                        qdcVar2 = qdcVar;
                        atomicFile2.failWrite(fileOutputStream);
                        throw exc;
                    }
                    kziVar.getClass();
                    atomicFile = new AtomicFile(new File((File) kziVar.a.getValue(), str4));
                    startWrite = atomicFile.startWrite();
                } catch (Throwable th6) {
                    th = th6;
                    str2 = str;
                    qdcVar2 = qdcVar;
                    qdcVar2.P(str2);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb(bvb bvbVar, Continuation continuation) {
        super(2, continuation);
        this.t = bvbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avb(String str, kzi kziVar, izi iziVar, Continuation continuation) {
        super(2, continuation);
        this.q = str;
        this.r = kziVar;
        this.t = iziVar;
    }
}
