package r2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c6.m;
import com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper;
import com.google.android.gms.internal.ads.C3698oP;
import com.google.android.gms.internal.ads.Nw;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import s3.InterfaceC4970a;
import t0.AbstractC5000P;
import t0.C4988D;
import t0.C5005a;
import y8.n;
import y8.s;
import y8.z;

/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4900e implements Nw, InterfaceC4970a, Q1.a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f40152n;

    public /* synthetic */ C4900e(Object obj) {
        this.f40152n = obj;
    }

    public void a(C5005a c5005a) {
        int i = c5005a.f40695a;
        RecyclerView recyclerView = (RecyclerView) this.f40152n;
        if (i == 1) {
            recyclerView.f5185E.W(c5005a.f40696b, c5005a.f40697c);
            return;
        }
        if (i == 2) {
            recyclerView.f5185E.Z(c5005a.f40696b, c5005a.f40697c);
        } else if (i == 4) {
            recyclerView.f5185E.a0(c5005a.f40696b, c5005a.f40697c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f5185E.Y(c5005a.f40696b, c5005a.f40697c);
        }
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void b(int i, long j6, String str) {
        ((RunnableC4901f) this.f40152n).f40154A.e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    public AbstractC5000P c(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f40152n;
        int n9 = recyclerView.f5236x.n();
        int i4 = 0;
        AbstractC5000P abstractC5000P = null;
        while (true) {
            if (i4 >= n9) {
                break;
            }
            AbstractC5000P I8 = RecyclerView.I(recyclerView.f5236x.m(i4));
            if (I8 != null && !I8.h() && I8.f40645c == i) {
                if (!((ArrayList) recyclerView.f5236x.f38918w).contains(I8.f40643a)) {
                    abstractC5000P = I8;
                    break;
                }
                abstractC5000P = I8;
            }
            i4++;
        }
        if (abstractC5000P == null || ((ArrayList) recyclerView.f5236x.f38918w).contains(abstractC5000P.f40643a)) {
            return null;
        }
        return abstractC5000P;
    }

    public void d(int i, int i4) {
        int i6;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.f40152n;
        int n9 = recyclerView.f5236x.n();
        int i10 = i4 + i;
        for (int i11 = 0; i11 < n9; i11++) {
            View m9 = recyclerView.f5236x.m(i11);
            AbstractC5000P I8 = RecyclerView.I(m9);
            if (I8 != null && !I8.o() && (i9 = I8.f40645c) >= i && i9 < i10) {
                I8.a(2);
                I8.a(1024);
                ((C4988D) m9.getLayoutParams()).f40606c = true;
            }
        }
        C3698oP c3698oP = recyclerView.f5230u;
        ArrayList arrayList = (ArrayList) c3698oP.f33688e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(size);
            if (abstractC5000P != null && (i6 = abstractC5000P.f40645c) >= i && i6 < i10) {
                abstractC5000P.a(2);
                c3698oP.e(size);
            }
        }
        recyclerView.f5192H0 = true;
    }

    @Override // Q1.a
    public Object e() {
        F.d dVar = (F.d) this.f40152n;
        return new w1.h((P1.h) dVar.f918c, (b3.e) dVar.f919d);
    }

    public void f(int i, int i4) {
        RecyclerView recyclerView = (RecyclerView) this.f40152n;
        int n9 = recyclerView.f5236x.n();
        for (int i6 = 0; i6 < n9; i6++) {
            AbstractC5000P I8 = RecyclerView.I(recyclerView.f5236x.m(i6));
            if (I8 != null && !I8.o() && I8.f40645c >= i) {
                I8.l(i4, false);
                recyclerView.f5184D0.f40627f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f5230u.f33688e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(i9);
            if (abstractC5000P != null && abstractC5000P.f40645c >= i) {
                abstractC5000P.l(i4, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5190G0 = true;
    }

    public void g(int i, int i4) {
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = (RecyclerView) this.f40152n;
        int n9 = recyclerView.f5236x.n();
        int i15 = -1;
        if (i < i4) {
            i9 = i;
            i6 = i4;
            i10 = -1;
        } else {
            i6 = i;
            i9 = i4;
            i10 = 1;
        }
        for (int i16 = 0; i16 < n9; i16++) {
            AbstractC5000P I8 = RecyclerView.I(recyclerView.f5236x.m(i16));
            if (I8 != null && (i14 = I8.f40645c) >= i9 && i14 <= i6) {
                if (i14 == i) {
                    I8.l(i4 - i, false);
                } else {
                    I8.l(i10, false);
                }
                recyclerView.f5184D0.f40627f = true;
            }
        }
        C3698oP c3698oP = recyclerView.f5230u;
        c3698oP.getClass();
        if (i < i4) {
            i12 = i;
            i11 = i4;
        } else {
            i11 = i;
            i12 = i4;
            i15 = 1;
        }
        ArrayList arrayList = (ArrayList) c3698oP.f33688e;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            AbstractC5000P abstractC5000P = (AbstractC5000P) arrayList.get(i17);
            if (abstractC5000P != null && (i13 = abstractC5000P.f40645c) >= i12 && i13 <= i11) {
                if (i13 == i) {
                    abstractC5000P.l(i4 - i, false);
                } else {
                    abstractC5000P.l(i15, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5190G0 = true;
    }

    public void h(FileOutputStream stream) {
        Q6.c cVar = (Q6.c) this.f40152n;
        int i = cVar.f2697c;
        c6.c cVar2 = c6.i.f5767g;
        Integer valueOf = Integer.valueOf(i);
        cVar2.getClass();
        kotlin.jvm.internal.h.e(stream, "stream");
        n nVar = new n(stream, new z());
        y8.e eVar = new y8.e();
        m writer = new m();
        cVar2.getClass();
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.h.e(writer, "writer");
        if (intValue >= 0) {
            int i4 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i4);
            int i6 = writer.f5792e - i4;
            writer.f5792e = i6;
            while ((intValue & (-128)) != 0) {
                writer.f5791d[i6] = (byte) ((intValue & com.anythink.expressad.video.module.a.a.f22515R) | 128);
                intValue >>>= 7;
                i6++;
            }
            writer.f5791d[i6] = (byte) intValue;
        } else {
            long j6 = intValue;
            int w3 = com.bumptech.glide.f.w(j6);
            writer.b(w3);
            int i9 = writer.f5792e - w3;
            writer.f5792e = i9;
            while (((-128) & j6) != 0) {
                writer.f5791d[i9] = (byte) ((127 & j6) | 128);
                j6 >>>= 7;
                i9++;
            }
            writer.f5791d[i9] = (byte) j6;
        }
        writer.a();
        y8.e eVar2 = writer.f5788a;
        while (eVar2.d(8192L, eVar) != -1) {
            long j9 = eVar.f41924u;
            if (j9 == 0) {
                j9 = 0;
            } else {
                s sVar = eVar.f41923n;
                kotlin.jvm.internal.h.b(sVar);
                s sVar2 = sVar.f41964g;
                kotlin.jvm.internal.h.b(sVar2);
                if (sVar2.f41960c < 8192 && sVar2.f41962e) {
                    j9 -= r9 - sVar2.f41959b;
                }
            }
            if (j9 > 0) {
                nVar.T(j9, eVar);
            }
        }
        long j10 = eVar.f41924u;
        if (j10 > 0) {
            nVar.T(j10, eVar);
        }
        cVar.b(stream);
    }

    @Override // com.google.android.gms.internal.ads.Nw
    public void i(int i, long j6) {
        ((RunnableC4901f) this.f40152n).f40154A.b(i, System.currentTimeMillis() - j6);
    }

    public C4900e(int i) {
        switch (i) {
            case 6:
                this.f40152n = new Q6.c();
                break;
            default:
                this.f40152n = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
        }
    }

    public C4900e(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, t2.e eVar) {
        this.f40152n = eVar;
    }

    public C4900e(RunnableC4901f runnableC4901f) {
        Objects.requireNonNull(runnableC4901f);
        this.f40152n = runnableC4901f;
    }
}
