package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes6.dex */
public final class cib implements xhj, czc, w2q, a1e, zxk, fii, hih, o1j, zpj, adu, lci, x7o {
    public final /* synthetic */ int a;
    public Object b;

    public cib(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new s2r();
                break;
            case 12:
                PublicKey publicKey = snd.a;
                publicKey.getClass();
                this.b = publicKey;
                break;
            case 19:
                this.b = new StringBuilder(100);
                break;
            default:
                this.b = new LinkedHashSet();
                break;
        }
    }

    public static final cib I(atn atnVar, wn wnVar) {
        u6b q = u6b.q(atnVar.Q(), y0c.a());
        if (q.o().size() == 0) {
            b6e.m("empty keyset");
            return null;
        }
        try {
            ncf t = ncf.t(wnVar.b(q.o().r(), new byte[0]), y0c.a());
            if (t.p() > 0) {
                return new cib(9, t);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (aye unused) {
            b6e.m("invalid keyset, corrupted key material");
            return null;
        }
    }

    public void A(int i, long j) {
        reh rehVar = (reh) this.b;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw r7k.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw r7k.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                rehVar.e(i);
                rehVar.x.e = (int) j;
                return;
            case 136:
                rehVar.e(i);
                rehVar.x.X = j == 1;
                return;
            case 155:
                rehVar.L = rehVar.m(j);
                return;
            case 159:
                rehVar.e(i);
                rehVar.x.Q = (int) j;
                return;
            case 176:
                rehVar.e(i);
                rehVar.x.n = (int) j;
                return;
            case 179:
                rehVar.c(i);
                rehVar.F.a(rehVar.m(j));
                return;
            case 186:
                rehVar.e(i);
                rehVar.x.o = (int) j;
                return;
            case 215:
                rehVar.e(i);
                rehVar.x.d = (int) j;
                return;
            case 231:
                rehVar.E = rehVar.m(j);
                return;
            case 238:
                rehVar.S = (int) j;
                return;
            case 241:
                if (rehVar.H) {
                    return;
                }
                rehVar.c(i);
                rehVar.G.a(j);
                rehVar.H = true;
                return;
            case 251:
                rehVar.T = true;
                return;
            case 16871:
                rehVar.e(i);
                rehVar.x.h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw r7k.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw r7k.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw r7k.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw r7k.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw r7k.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                rehVar.A = j + rehVar.s;
                return;
            case 21432:
                int i2 = (int) j;
                rehVar.e(i);
                if (i2 == 0) {
                    rehVar.x.y = 0;
                    return;
                }
                if (i2 == 1) {
                    rehVar.x.y = 2;
                    return;
                } else if (i2 == 3) {
                    rehVar.x.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    rehVar.x.y = 3;
                    return;
                }
            case 21680:
                rehVar.e(i);
                rehVar.x.q = (int) j;
                return;
            case 21682:
                rehVar.e(i);
                rehVar.x.s = (int) j;
                return;
            case 21690:
                rehVar.e(i);
                rehVar.x.r = (int) j;
                return;
            case 21930:
                rehVar.e(i);
                rehVar.x.W = j == 1;
                return;
            case 21938:
                rehVar.e(i);
                qeh qehVar = rehVar.x;
                qehVar.z = true;
                qehVar.p = (int) j;
                return;
            case 21998:
                rehVar.e(i);
                rehVar.x.g = (int) j;
                return;
            case 22186:
                rehVar.e(i);
                rehVar.x.T = j;
                return;
            case 22203:
                rehVar.e(i);
                rehVar.x.U = j;
                return;
            case 25188:
                rehVar.e(i);
                rehVar.x.R = (int) j;
                return;
            case 30114:
                rehVar.U = j;
                return;
            case 30321:
                rehVar.e(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    rehVar.x.t = 0;
                    return;
                }
                if (i3 == 1) {
                    rehVar.x.t = 1;
                    return;
                } else if (i3 == 2) {
                    rehVar.x.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    rehVar.x.t = 3;
                    return;
                }
            case 2352003:
                rehVar.e(i);
                rehVar.x.f = (int) j;
                return;
            case 2807729:
                rehVar.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        rehVar.e(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            rehVar.x.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            rehVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        rehVar.e(i);
                        int g = q85.g((int) j);
                        if (g != -1) {
                            rehVar.x.B = g;
                            return;
                        }
                        return;
                    case 21947:
                        rehVar.e(i);
                        rehVar.x.z = true;
                        int f = q85.f((int) j);
                        if (f != -1) {
                            rehVar.x.A = f;
                            return;
                        }
                        return;
                    case 21948:
                        rehVar.e(i);
                        rehVar.x.D = (int) j;
                        return;
                    case 21949:
                        rehVar.e(i);
                        rehVar.x.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void C(String str) {
        StringBuilder sb = (StringBuilder) this.b;
        sb.append(str);
        sb.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(opn opnVar, c9n c9nVar, c9n c9nVar2) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.b;
        opnVar.q(false);
        tn7 tn7Var = (tn7) recyclerView.v0;
        if (c9nVar != null) {
            tn7Var.getClass();
            int i = c9nVar.b;
            int i2 = c9nVar2.b;
            if (i != i2 || c9nVar.c != c9nVar2.c) {
                z = tn7Var.g(opnVar, i, c9nVar.c, i2, c9nVar2.c);
                if (z) {
                    return;
                }
                recyclerView.n0();
                return;
            }
        }
        tn7Var.l(opnVar);
        opnVar.a.setAlpha(0.0f);
        tn7Var.i.add(opnVar);
        z = true;
        if (z) {
        }
    }

    @Override // defpackage.o1j
    public n1j E(q1f q1fVar, int i) {
        q1fVar.getClass();
        y7o a0 = bkp.a0(q1fVar, k9i.x);
        if (a0.b()) {
            return null;
        }
        return new m9i((o9i) a0.a());
    }

    public void H(opn opnVar, c9n c9nVar, c9n c9nVar2) {
        boolean z;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.c.m(opnVar);
        recyclerView.r(opnVar);
        opnVar.q(false);
        tn7 tn7Var = (tn7) recyclerView.v0;
        tn7Var.getClass();
        int i = c9nVar.b;
        int i2 = c9nVar.c;
        View view = opnVar.a;
        int left = c9nVar2 == null ? view.getLeft() : c9nVar2.b;
        int top = c9nVar2 == null ? view.getTop() : c9nVar2.c;
        if (opnVar.k() || (i == left && i2 == top)) {
            tn7Var.l(opnVar);
            tn7Var.h.add(opnVar);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = tn7Var.g(opnVar, i, i2, left, top);
        }
        if (z) {
            recyclerView.n0();
        }
    }

    @Override // defpackage.fii
    public void a(rf3 rf3Var) {
        rf3Var.getClass();
        lg3.e0("TabReselected", Collections.singletonMap("tab", rf3Var.name().toLowerCase(Locale.US)));
        MainScreenActivity mainScreenActivity = (MainScreenActivity) this.b;
        lhs lhsVar = MainScreenActivity.Q0;
        dzf I = mainScreenActivity.I();
        q1s q1sVar = I instanceof q1s ? (q1s) I : null;
        if (q1sVar != null) {
            q1sVar.j();
        }
    }

    @Override // defpackage.hih
    public void b() {
        zrb zrbVar = ((qih) this.b).G;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return new qgd("FmRadioPlayable: not supported by Glagol cast");
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        ((zt3) this.b).h(null);
    }

    @Override // defpackage.xhj
    public Object e() {
        return (Executor) this.b;
    }

    @Override // defpackage.o1j
    public n1j f(n1j n1jVar) {
        return n1jVar instanceof m9i ? n1jVar : n1jVar.b(r1c.b);
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        Integer num = (Integer) this.b;
        faqVar.getClass();
        Continuation continuation = null;
        if (!(faqVar instanceof naq)) {
            if (faqVar instanceof daq) {
                return null;
            }
            if (faqVar instanceof saq) {
                return new qgd("SharedYnisonVideoClipPlayable is not supported by glagol cast");
            }
            if (faqVar instanceof qaq) {
                return new qgd("SharedYnisonUnknownPlayable is not supported by glagol cast");
            }
            b6e.s();
            return null;
        }
        naq naqVar = (naq) faqVar;
        mqs mqsVar = naqVar.e;
        izs I = q7g.I(naqVar.d);
        e6v e6vVar = I instanceof e6v ? (e6v) I : null;
        if (e6vVar == null) {
            return null;
        }
        int i = 1;
        if (e6vVar instanceof b6v) {
            return rre.S(((b6v) e6vVar).a.getId(), mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), true, 0.0d, null), naqVar.c().a);
        }
        if (e6vVar instanceof d6v) {
            return rre.T(((d6v) e6vVar).a.getId(), naqVar.c().a, mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), true, 0.0d, null));
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        Integer num = (Integer) this.b;
        jzsVar.getClass();
        izs izsVar = jzsVar.g;
        v80 v80Var = jzsVar.b;
        mqs mqsVar = jzsVar.a;
        Continuation continuation = null;
        e6v e6vVar = izsVar instanceof e6v ? (e6v) izsVar : null;
        if (e6vVar == null) {
            return null;
        }
        int i = 1;
        if (e6vVar instanceof b6v) {
            return rre.S(((b6v) e6vVar).a.getId(), mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), true, 0.0d, null), v80Var.a);
        }
        if (e6vVar instanceof d6v) {
            return rre.T(((d6v) e6vVar).a.getId(), v80Var.a, mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), true, 0.0d, null));
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (!(m1qVar instanceof c2q)) {
            if (m1qVar instanceof j1q) {
                return null;
            }
            if (m1qVar instanceof e2q) {
                return new qgd("SharedGlagolUnknownPlayable is not supported by glagol cast");
            }
            b6e.s();
            return null;
        }
        mqs mqsVar = ((c2q) m1qVar).d;
        Integer num = (Integer) this.b;
        String str = m1qVar.b.a;
        mqsVar.getClass();
        String str2 = mqsVar.a;
        str.getClass();
        return new ugd(new ov(new ygd(str2, mqsVar.e, num), str2, str, (Continuation) null));
    }

    @Override // defpackage.zxk
    /* renamed from: j, reason: collision with other method in class */
    public void mo7j(i5u i5uVar) {
        i5uVar.getClass();
        ((t3g) this.b).u(i5uVar.a);
    }

    @Override // defpackage.zxk
    /* renamed from: k, reason: collision with other method in class */
    public void mo8k(k4d k4dVar) {
        k4dVar.getClass();
        t3g t3gVar = (t3g) this.b;
        t3gVar.d(new c3g(b3g.d, false));
        f4d f4dVar = (f4d) t3gVar.f.getValue();
        e5d e5dVar = k4dVar.a;
        f4dVar.getClass();
        e5dVar.getClass();
        j1g j1gVar = j1g.a;
        f4dVar.b(e5dVar, j1gVar);
        f4dVar.c(e5dVar, j1gVar);
    }

    @Override // defpackage.fii
    public boolean l(rf3 rf3Var) {
        rf3Var.getClass();
        lg3.e0("TabSelected", Collections.singletonMap("tab", rf3Var.name().toLowerCase(Locale.US)));
        MainScreenActivity mainScreenActivity = (MainScreenActivity) this.b;
        lhs lhsVar = MainScreenActivity.Q0;
        return mainScreenActivity.K(rf3Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(int i, int i2, s2c s2cVar) {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        reh rehVar = (reh) this.b;
        byt bytVar = rehVar.b;
        SparseArray sparseArray = rehVar.c;
        d7k d7kVar = rehVar.k;
        d7k d7kVar2 = rehVar.i;
        int i10 = 1;
        int i11 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (rehVar.J != 2) {
                    return;
                }
                qeh qehVar = (qeh) sparseArray.get(rehVar.P);
                int i12 = rehVar.S;
                d7k d7kVar3 = rehVar.p;
                if (i12 != 4 || !"V_VP9".equals(qehVar.c)) {
                    s2cVar.y(i2);
                    return;
                } else {
                    d7kVar3.E(i2);
                    s2cVar.readFully(d7kVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                rehVar.e(i);
                qeh qehVar2 = rehVar.x;
                int i13 = qehVar2.h;
                if (i13 != 1685485123 && i13 != 1685480259) {
                    s2cVar.y(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                qehVar2.P = bArr;
                s2cVar.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                rehVar.e(i);
                byte[] bArr2 = new byte[i2];
                rehVar.x.j = bArr2;
                s2cVar.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                s2cVar.readFully(bArr3, 0, i2);
                rehVar.e(i);
                rehVar.x.k = new zys(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(d7kVar.a, (byte) 0);
                s2cVar.readFully(d7kVar.a, 4 - i2, i2);
                d7kVar.H(0);
                rehVar.z = (int) d7kVar.x();
                return;
            }
            if (i == 25506) {
                rehVar.e(i);
                byte[] bArr4 = new byte[i2];
                rehVar.x.l = bArr4;
                s2cVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw r7k.a(null, "Unexpected id: " + i);
            }
            rehVar.e(i);
            byte[] bArr5 = new byte[i2];
            rehVar.x.x = bArr5;
            s2cVar.readFully(bArr5, 0, i2);
            return;
        }
        if (rehVar.J == 0) {
            rehVar.P = (int) bytVar.b(s2cVar, false, true, 8);
            rehVar.Q = bytVar.b;
            rehVar.L = -9223372036854775807L;
            rehVar.J = 1;
            d7kVar2.E(0);
        }
        qeh qehVar3 = (qeh) sparseArray.get(rehVar.P);
        if (qehVar3 == null) {
            s2cVar.y(i2 - rehVar.Q);
            rehVar.J = 0;
            return;
        }
        qehVar3.Z.getClass();
        if (rehVar.J == 1) {
            rehVar.j(s2cVar, 3);
            int i14 = (d7kVar2.a[2] & 6) >> 1;
            int i15 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i14 == 0) {
                rehVar.N = 1;
                int[] iArr2 = rehVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                rehVar.O = iArr2;
                iArr2[0] = (i2 - rehVar.Q) - 3;
            } else {
                rehVar.j(s2cVar, 4);
                int i16 = (d7kVar2.a[3] & KotlinVersion.MAX_COMPONENT_VALUE) + 1;
                rehVar.N = i16;
                int[] iArr3 = rehVar.O;
                if (iArr3 == null) {
                    iArr3 = new int[i16];
                } else if (iArr3.length < i16) {
                    iArr3 = new int[Math.max(iArr3.length * 2, i16)];
                }
                rehVar.O = iArr3;
                if (i14 == 2) {
                    int i17 = (i2 - rehVar.Q) - 4;
                    int i18 = rehVar.N;
                    Arrays.fill(iArr3, 0, i18, i17 / i18);
                } else {
                    if (i14 != 1) {
                        if (i14 != 3) {
                            throw r7k.a(null, "Unexpected lacing value: " + i14);
                        }
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 4;
                        while (true) {
                            int i22 = rehVar.N - i10;
                            int[] iArr4 = rehVar.O;
                            if (i19 >= i22) {
                                i3 = i10;
                                i4 = i11;
                                iArr4[i22] = ((i2 - rehVar.Q) - i21) - i20;
                                break;
                            }
                            iArr4[i19] = i11;
                            int i23 = i21 + 1;
                            rehVar.j(s2cVar, i23);
                            if (d7kVar2.a[i21] == 0) {
                                throw r7k.a(null, "No valid varint length mask found");
                            }
                            int i24 = i10;
                            int i25 = i11;
                            while (true) {
                                if (i25 >= 8) {
                                    i5 = i11;
                                    j = 0;
                                    i6 = i23;
                                    break;
                                }
                                int i26 = i24 << (7 - i25);
                                i5 = i11;
                                if ((d7kVar2.a[i21] & i26) != 0) {
                                    i6 = i23 + i25;
                                    rehVar.j(s2cVar, i6);
                                    j = d7kVar2.a[i21] & i15 & (~i26);
                                    while (i23 < i6) {
                                        j = (j << 8) | (d7kVar2.a[i23] & i15);
                                        i23++;
                                        i15 = KotlinVersion.MAX_COMPONENT_VALUE;
                                    }
                                    if (i19 > 0) {
                                        j -= (1 << ((i25 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i25++;
                                    i11 = i5;
                                    i15 = KotlinVersion.MAX_COMPONENT_VALUE;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i27 = (int) j;
                            int[] iArr5 = rehVar.O;
                            if (i19 != 0) {
                                i27 += iArr5[i19 - 1];
                            }
                            iArr5[i19] = i27;
                            i20 += i27;
                            i19++;
                            i21 = i6;
                            i10 = i24;
                            i11 = i5;
                            i15 = KotlinVersion.MAX_COMPONENT_VALUE;
                        }
                        throw r7k.a(null, "EBML lacing sample size out of range.");
                    }
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 4;
                    while (true) {
                        i7 = rehVar.N - 1;
                        iArr = rehVar.O;
                        if (i28 >= i7) {
                            break;
                        }
                        iArr[i28] = 0;
                        while (true) {
                            i8 = i30 + 1;
                            rehVar.j(s2cVar, i8);
                            int i31 = d7kVar2.a[i30] & KotlinVersion.MAX_COMPONENT_VALUE;
                            int[] iArr6 = rehVar.O;
                            i9 = iArr6[i28] + i31;
                            iArr6[i28] = i9;
                            if (i31 != 255) {
                                break;
                            } else {
                                i30 = i8;
                            }
                        }
                        i29 += i9;
                        i28++;
                        i30 = i8;
                    }
                    iArr[i7] = ((i2 - rehVar.Q) - i30) - i29;
                }
            }
            i3 = 1;
            i4 = 0;
            byte[] bArr6 = d7kVar2.a;
            rehVar.K = rehVar.m((bArr6[i3] & 255) | (bArr6[i4] << 8)) + rehVar.E;
            rehVar.R = (qehVar3.e == 2 || (i == 163 && (d7kVar2.a[2] & 128) == 128)) ? i3 : i4;
            rehVar.J = 2;
            rehVar.M = i4;
        } else {
            i3 = 1;
        }
        if (i == 163) {
            while (true) {
                int i32 = rehVar.M;
                if (i32 >= rehVar.N) {
                    rehVar.J = 0;
                    return;
                } else {
                    rehVar.f(qehVar3, ((rehVar.M * qehVar3.f) / 1000) + rehVar.K, rehVar.R, rehVar.n(s2cVar, qehVar3, rehVar.O[i32], false), 0);
                    rehVar.M++;
                }
            }
        } else {
            while (true) {
                int i33 = rehVar.M;
                if (i33 >= rehVar.N) {
                    return;
                }
                int[] iArr7 = rehVar.O;
                boolean z = i3;
                iArr7[i33] = rehVar.n(s2cVar, qehVar3, iArr7[i33], z);
                rehVar.M += z ? 1 : 0;
            }
        }
    }

    public String n(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            r4f r4fVar = (r4f) this.b;
            q7f q7fVar = new q7f(stringWriter, r4fVar.a, r4fVar.b, r4fVar.c, r4fVar.d);
            q7fVar.h(obj);
            q7fVar.j();
            q7fVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        kpo kpoVar;
        mpo mpoVar = (mpo) obj;
        jqo jqoVar = (jqo) this.b;
        voi voiVar = jqoVar.o;
        g0c g0cVar = jqoVar.n;
        mpoVar.getClass();
        int i = mpoVar.b;
        lpo lpoVar = mpoVar.a;
        if (i == 0 && !lpoVar.a()) {
            qne X0 = gut.X0(jqoVar.L());
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(X0);
            voiVar.m(fqo.a);
            return;
        }
        qne a1 = gut.a1(jqoVar.L(), lpoVar.a());
        x60 x60Var2 = (x60) g0cVar;
        x60Var2.getClass();
        x60Var2.a(a1);
        jqoVar.r.m(lpoVar);
        if (lpoVar.a()) {
            voiVar.m(gqo.a);
        } else {
            Pair pair = (Pair) jqoVar.p.d();
            voiVar.m(qdq.B((pair == null || (kpoVar = (kpo) pair.b) == null) ? null : Boolean.valueOf(kpoVar.d())) ? cqo.d : cqo.c);
        }
    }

    @Override // defpackage.o1j
    public mif p(n1j n1jVar) {
        return n1jVar.b == q1c.d ? mif.b(((r28) this.b).s.a(), k9i.w, null, 5) : nif.d(p1j.b);
    }

    public Object q(Class cls) {
        Object obj;
        byte[] array;
        jsm jsmVar = (jsm) msn.e.get(cls);
        Object obj2 = null;
        Class b = jsmVar == null ? null : jsmVar.b();
        if (b == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        ncf ncfVar = (ncf) this.b;
        int i = zut.a;
        int r = ncfVar.r();
        Iterator it = ncfVar.q().iterator();
        byte b2 = 0;
        int i2 = 1;
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean hasNext = it.hasNext();
            fbf fbfVar = fbf.ENABLED;
            if (!hasNext) {
                if (i3 == 0) {
                    b6e.m("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    b6e.m("keyset doesn't contain a valid primary key");
                    return null;
                }
                sfm sfmVar = new sfm();
                sfmVar.a = new ConcurrentHashMap();
                sfmVar.c = b;
                Class cls2 = (Class) sfmVar.c;
                for (mcf mcfVar : ncfVar.q()) {
                    if (mcfVar.t() == fbfVar) {
                        Object d = msn.d(mcfVar.q().r(), mcfVar.q().s(), b);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) sfmVar.a;
                        if (mcfVar.t() != fbfVar) {
                            Object obj3 = obj2;
                            b6e.m("only ENABLED key is allowed");
                            return obj3;
                        }
                        obj = obj2;
                        int ordinal = mcfVar.s().ordinal();
                        if (ordinal != i2) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    array = c3x.f;
                                } else if (ordinal != 4) {
                                    b6e.m("unknown output prefix type");
                                    return obj;
                                }
                            }
                            array = ByteBuffer.allocate(5).put(b2).putInt(mcfVar.r()).array();
                        } else {
                            array = ByteBuffer.allocate(5).put((byte) 1).putInt(mcfVar.r()).array();
                        }
                        hsm hsmVar = new hsm(d, array, mcfVar.t(), mcfVar.s());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(hsmVar);
                        ism ismVar = new ism(hsmVar.a());
                        List list = (List) concurrentHashMap.put(ismVar, Collections.unmodifiableList(arrayList));
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(list);
                            arrayList2.add(hsmVar);
                            concurrentHashMap.put(ismVar, Collections.unmodifiableList(arrayList2));
                        }
                        if (mcfVar.r() != ncfVar.r()) {
                            continue;
                        } else {
                            if (hsmVar.c != fbfVar) {
                                xq0.x("the primary entry has to be ENABLED");
                                return obj;
                            }
                            if (sfmVar.v(hsmVar.a()).isEmpty()) {
                                xq0.x("the primary entry cannot be set to an entry which is not held by this primitive set");
                                return obj;
                            }
                            sfmVar.b = hsmVar;
                        }
                    } else {
                        obj = obj2;
                    }
                    obj2 = obj;
                    b2 = 0;
                    i2 = 1;
                }
                jsm jsmVar2 = (jsm) msn.e.get(cls);
                if (jsmVar2 == null) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                if (jsmVar2.b().equals(cls2)) {
                    return jsmVar2.a(sfmVar);
                }
                throw new GeneralSecurityException("Wrong input primitive class, expected " + jsmVar2.b() + ", got " + cls2);
            }
            mcf mcfVar2 = (mcf) it.next();
            if (mcfVar2.t() == fbfVar) {
                if (!mcfVar2.u()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(mcfVar2.r())));
                }
                if (mcfVar2.s() == oyj.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(mcfVar2.r())));
                }
                if (mcfVar2.t() == fbf.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(mcfVar2.r())));
                }
                if (mcfVar2.r() == r) {
                    if (z) {
                        b6e.m("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (mcfVar2.q().q() != naf.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i3++;
            }
        }
    }

    @Override // defpackage.czc
    public oyc r(String str, ArrayList arrayList) {
        return ((czc) this.b).r(str, arrayList);
    }

    @Override // defpackage.czc
    public oyc s(String str, ArrayList arrayList) {
        return ((czc) this.b).s(str, arrayList);
    }

    @Override // defpackage.hih
    public void t() {
        zrb zrbVar = ((qih) this.b).G;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    public String toString() {
        switch (this.a) {
            case 9:
                return zut.a((ncf) this.b).toString();
            default:
                return super.toString();
        }
    }

    public bwo u(w35 w35Var) {
        long g;
        w35Var.getClass();
        float f = w35Var.a;
        float f2 = w35Var.b;
        bvf bvfVar = (bvf) this.b;
        int ordinal = bvfVar.p.ordinal();
        if (ordinal == 0) {
            g = bvfVar.g() & 4294967295L;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            g = bvfVar.g() >> 32;
        }
        return new bwo(f, ((int) g) - f2);
    }

    public ArrayList v() {
        bvf bvfVar = (bvf) this.b;
        List list = bvfVar.k;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new zxn((cvf) it.next(), bvfVar.p));
        }
        return arrayList;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        ((jqo) this.b).o.m(new eqo());
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1((Resources) this.b, kkpVar.n(Uri.class, InputStream.class));
    }

    @Override // defpackage.o1j
    public n1j z(q1f q1fVar) {
        q1fVar.getClass();
        return null;
    }

    @Override // defpackage.zxk
    /* renamed from: c, reason: collision with other method in class */
    public void mo3c(foc focVar) {
        focVar.getClass();
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return new qgd("VideoClipPlayable: not supported by Glagol cast");
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return null;
    }

    public /* synthetic */ cib(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public cib(h1b h1bVar) {
        this.a = 1;
    }

    public cib(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.a = 21;
        this.b = linearLayout2;
    }

    public cib(Context context) {
        this.a = 7;
        this.b = new vg0(context, false);
    }

    @Override // defpackage.zxk
    /* renamed from: i, reason: collision with other method in class */
    public void mo6i(m1q m1qVar) {
        t3g t3gVar = (t3g) this.b;
        m1qVar.getClass();
        if (m1qVar instanceof j1q) {
            f4d f4dVar = (f4d) t3gVar.f.getValue();
            e5d e5dVar = ((j1q) m1qVar).d;
            f4dVar.getClass();
            e5dVar.getClass();
            j1g j1gVar = j1g.a;
            f4dVar.b(e5dVar, j1gVar);
            f4dVar.c(e5dVar, j1gVar);
            return;
        }
        if (m1qVar instanceof c2q) {
            t3gVar.t(((c2q) m1qVar).d);
        } else {
            if (m1qVar instanceof e2q) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.xhj
    public void K(Object obj) {
    }

    @Override // defpackage.zxk
    /* renamed from: h, reason: collision with other method in class */
    public void mo5h(jzs jzsVar) {
        jzsVar.getClass();
        ((t3g) this.b).t(jzsVar.a);
    }

    @Override // defpackage.zxk
    /* renamed from: g, reason: collision with other method in class */
    public void mo4g(faq faqVar) {
        t3g t3gVar = (t3g) this.b;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            t3gVar.t(((naq) faqVar).e);
            return;
        }
        if (faqVar instanceof saq) {
            t3gVar.u(((saq) faqVar).e);
            return;
        }
        if (faqVar instanceof daq) {
            f4d f4dVar = (f4d) t3gVar.f.getValue();
            e5d e5dVar = ((daq) faqVar).e;
            f4dVar.getClass();
            e5dVar.getClass();
            j1g j1gVar = j1g.a;
            f4dVar.b(e5dVar, j1gVar);
            f4dVar.c(e5dVar, j1gVar);
            return;
        }
        if (faqVar instanceof qaq) {
            return;
        }
        b6e.s();
    }
}
