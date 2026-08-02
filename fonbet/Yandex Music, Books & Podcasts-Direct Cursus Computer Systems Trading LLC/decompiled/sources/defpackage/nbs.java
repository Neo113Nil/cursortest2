package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nbs extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ qbs l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbs(qbs qbsVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = qbsVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new nbs(this.l, continuation, 0);
            default:
                return new nbs(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((nbs) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object dp4Var;
        qbs qbsVar;
        mn0 mn0Var;
        CharSequence text;
        int i;
        int i2 = this.j;
        qbs qbsVar2 = this.l;
        byte b = 1;
        switch (i2) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    if (rds.b(qbsVar2.k().b)) {
                        break;
                    } else {
                        kp4 kp4Var = qbsVar2.h;
                        if (kp4Var != null) {
                            dp4 Z = zc4.Z(g0g.L(qbsVar2.k()));
                            this.k = 1;
                            if (((ce0) kp4Var).a(Z) == nm6Var) {
                                break;
                            }
                        }
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                mn0 N = g0g.N(qbsVar2.k(), qbsVar2.k().a.b.length());
                mn0 M = g0g.M(qbsVar2.k(), qbsVar2.k().a.b.length());
                kn0 kn0Var = new kn0(N);
                kn0Var.b(M);
                mn0 h = kn0Var.h();
                int e = rds.e(qbsVar2.k().b);
                qbsVar2.c.invoke(qbs.c(h, y5g.P(e, e)));
                qbsVar2.o(zrd.a);
                qbsVar2.a.e = true;
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    kp4 kp4Var2 = qbsVar2.h;
                    if (kp4Var2 != null) {
                        this.k = 1;
                        ClipData primaryClip = ((ce0) kp4Var2).a.a.getPrimaryClip();
                        dp4Var = primaryClip != null ? new dp4(primaryClip) : null;
                        if (dp4Var == nm6Var2) {
                            break;
                        }
                    }
                    break;
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    dp4Var = obj;
                }
                dp4 dp4Var2 = (dp4) dp4Var;
                if (dp4Var2 != null) {
                    int i5 = 0;
                    ClipData.Item itemAt = dp4Var2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        qbsVar = qbsVar2;
                        mn0Var = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        int D = xz0.D(annotationArr);
                        if (D >= 0) {
                            int i6 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i6];
                                if (Intrinsics.d(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    Parcel obtain = Parcel.obtain();
                                    byte[] decode = Base64.decode(value, i5);
                                    obtain.unmarshall(decode, i5, decode.length);
                                    obtain.setDataPosition(i5);
                                    long j = d85.n;
                                    long j2 = j;
                                    long j3 = kes.c;
                                    long j4 = j3;
                                    tqc tqcVar = null;
                                    oqc oqcVar = null;
                                    pqc pqcVar = null;
                                    String str = null;
                                    wu2 wu2Var = null;
                                    ccs ccsVar = null;
                                    aas aasVar = null;
                                    otp otpVar = null;
                                    while (obtain.dataAvail() > b) {
                                        byte readByte = obtain.readByte();
                                        if (readByte != b) {
                                            i = i5;
                                            qbsVar = qbsVar2;
                                            int i7 = 2;
                                            if (readByte == 2) {
                                                if (obtain.dataAvail() >= 5) {
                                                    byte readByte2 = obtain.readByte();
                                                    long j5 = readByte2 == b ? 4294967296L : readByte2 == 2 ? 8589934592L : 0L;
                                                    j3 = les.a(j5, 0L) ? kes.c : v7g.D(obtain.readFloat(), j5);
                                                    i5 = i;
                                                    qbsVar2 = qbsVar;
                                                    b = 1;
                                                } else {
                                                    arrayList.add(new ln0(new c4r(j, j3, tqcVar, oqcVar, pqcVar, (qpc) null, str, j4, wu2Var, ccsVar, (bqg) null, j2, aasVar, otpVar, 49152), spanStart, spanEnd));
                                                }
                                            } else if (readByte != 3) {
                                                if (readByte == 4) {
                                                    if (obtain.dataAvail() >= 1) {
                                                        byte readByte3 = obtain.readByte();
                                                        oqc oqcVar2 = new oqc((readByte3 != 0 && readByte3 == 1) ? 1 : i);
                                                        i5 = i;
                                                        oqcVar = oqcVar2;
                                                        b = 1;
                                                        qbsVar2 = qbsVar;
                                                    }
                                                } else if (readByte != 5) {
                                                    if (readByte == 6) {
                                                        str = obtain.readString();
                                                    } else if (readByte == 7) {
                                                        if (obtain.dataAvail() >= 5) {
                                                            byte readByte4 = obtain.readByte();
                                                            long j6 = readByte4 == 1 ? 4294967296L : readByte4 == 2 ? 8589934592L : 0L;
                                                            j4 = les.a(j6, 0L) ? kes.c : v7g.D(obtain.readFloat(), j6);
                                                        }
                                                    } else if (readByte == 8) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            i5 = i;
                                                            wu2Var = new wu2(obtain.readFloat());
                                                            qbsVar2 = qbsVar;
                                                            b = 1;
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            ccsVar = new ccs(obtain.readFloat(), obtain.readFloat());
                                                            qbsVar2 = qbsVar;
                                                            b = 1;
                                                            i5 = i;
                                                        }
                                                    } else if (readByte == 10) {
                                                        if (obtain.dataAvail() >= 8) {
                                                            j2 = obtain.readLong();
                                                            met metVar = net.b;
                                                            int i8 = d85.o;
                                                        }
                                                    } else if (readByte == 11) {
                                                        if (obtain.dataAvail() >= 4) {
                                                            int readInt = obtain.readInt();
                                                            int i9 = (readInt & 2) != 0 ? 1 : i;
                                                            int i10 = (readInt & 1) != 0 ? 1 : i;
                                                            aas aasVar2 = aas.d;
                                                            aas aasVar3 = aas.c;
                                                            if (i9 == 0 || i10 == 0) {
                                                                aasVar = i9 != 0 ? aasVar2 : i10 != 0 ? aasVar3 : aas.b;
                                                            } else {
                                                                List h2 = u75.h(aasVar2, aasVar3);
                                                                Integer valueOf = Integer.valueOf(i);
                                                                int size = h2.size();
                                                                for (int i11 = i; i11 < size; i11++) {
                                                                    valueOf = Integer.valueOf(valueOf.intValue() | ((aas) h2.get(i11)).a);
                                                                }
                                                                aasVar = new aas(valueOf.intValue());
                                                            }
                                                        }
                                                    } else if (readByte == 12) {
                                                        if (obtain.dataAvail() >= 20) {
                                                            long readLong = obtain.readLong();
                                                            met metVar2 = net.b;
                                                            int i12 = d85.o;
                                                            i5 = i;
                                                            qbsVar2 = qbsVar;
                                                            otpVar = new otp(readLong, (Float.floatToRawIntBits(obtain.readFloat()) << 32) | (Float.floatToRawIntBits(obtain.readFloat()) & 4294967295L), obtain.readFloat());
                                                            b = 1;
                                                        }
                                                    }
                                                    i5 = i;
                                                    qbsVar2 = qbsVar;
                                                    b = 1;
                                                } else if (obtain.dataAvail() >= 1) {
                                                    byte readByte5 = obtain.readByte();
                                                    if (readByte5 != 0) {
                                                        if (readByte5 == 1) {
                                                            i7 = 65535;
                                                        } else if (readByte5 != 3) {
                                                            if (readByte5 == 2) {
                                                                i7 = 1;
                                                            }
                                                        }
                                                        pqcVar = new pqc(i7);
                                                        qbsVar2 = qbsVar;
                                                        b = 1;
                                                        i5 = i;
                                                    }
                                                    i7 = i;
                                                    pqcVar = new pqc(i7);
                                                    qbsVar2 = qbsVar;
                                                    b = 1;
                                                    i5 = i;
                                                }
                                                arrayList.add(new ln0(new c4r(j, j3, tqcVar, oqcVar, pqcVar, (qpc) null, str, j4, wu2Var, ccsVar, (bqg) null, j2, aasVar, otpVar, 49152), spanStart, spanEnd));
                                            } else if (obtain.dataAvail() >= 4) {
                                                tqcVar = new tqc(obtain.readInt());
                                                qbsVar2 = qbsVar;
                                                b = 1;
                                                i5 = i;
                                            } else {
                                                arrayList.add(new ln0(new c4r(j, j3, tqcVar, oqcVar, pqcVar, (qpc) null, str, j4, wu2Var, ccsVar, (bqg) null, j2, aasVar, otpVar, 49152), spanStart, spanEnd));
                                            }
                                        } else if (obtain.dataAvail() >= 8) {
                                            j = obtain.readLong();
                                            met metVar3 = net.b;
                                            int i13 = d85.o;
                                        } else {
                                            i = i5;
                                            qbsVar = qbsVar2;
                                            arrayList.add(new ln0(new c4r(j, j3, tqcVar, oqcVar, pqcVar, (qpc) null, str, j4, wu2Var, ccsVar, (bqg) null, j2, aasVar, otpVar, 49152), spanStart, spanEnd));
                                        }
                                    }
                                    i = i5;
                                    qbsVar = qbsVar2;
                                    arrayList.add(new ln0(new c4r(j, j3, tqcVar, oqcVar, pqcVar, (qpc) null, str, j4, wu2Var, ccsVar, (bqg) null, j2, aasVar, otpVar, 49152), spanStart, spanEnd));
                                } else {
                                    i = i5;
                                    qbsVar = qbsVar2;
                                }
                                if (i6 != D) {
                                    i6++;
                                    i5 = i;
                                    qbsVar2 = qbsVar;
                                    b = 1;
                                }
                            }
                        } else {
                            qbsVar = qbsVar2;
                        }
                        mn0Var = new mn0(4, text.toString(), arrayList);
                    } else {
                        mn0Var = new mn0(text.toString());
                        qbsVar = qbsVar2;
                    }
                    if (mn0Var != null) {
                        kn0 kn0Var2 = new kn0(g0g.N(qbsVar.k(), qbsVar.k().a.b.length()));
                        kn0Var2.b(mn0Var);
                        mn0 h3 = kn0Var2.h();
                        mn0 M2 = g0g.M(qbsVar.k(), qbsVar.k().a.b.length());
                        kn0 kn0Var3 = new kn0(h3);
                        kn0Var3.b(M2);
                        mn0 h4 = kn0Var3.h();
                        int length = mn0Var.b.length() + rds.e(qbsVar.k().b);
                        ybs c = qbs.c(h4, y5g.P(length, length));
                        qbs qbsVar3 = qbsVar;
                        qbsVar3.c.invoke(c);
                        qbsVar3.o(zrd.a);
                        qbsVar3.a.e = true;
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
