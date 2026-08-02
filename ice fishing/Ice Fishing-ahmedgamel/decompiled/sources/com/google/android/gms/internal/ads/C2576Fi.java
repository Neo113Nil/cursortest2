package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import q0.C4862b;
import q0.C4863c;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2576Fi implements BD {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25609b = new C2576Fi(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25610c = new C2576Fi(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25611d = new C2576Fi(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25612e = new C2576Fi(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25613f = new C2576Fi(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25614g = new C2576Fi(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25615h = new C2576Fi(8);
    public static final /* synthetic */ C2576Fi i = new C2576Fi(9);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25616j = new C2576Fi(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25617k = new C2576Fi(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25618l = new C2576Fi(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25619m = new C2576Fi(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C2576Fi f25620n = new C2576Fi(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25621a;

    public /* synthetic */ C2576Fi(int i4) {
        this.f25621a = i4;
    }

    /* JADX WARN: Type inference failed for: r9v38, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        int i4 = 2;
        int i6 = -1;
        String str = "";
        int i9 = 0;
        String str2 = null;
        int i10 = 1;
        switch (this.f25621a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Pb)).booleanValue()) {
                    C4906k.f40186C.f40196h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    C4906k.f40186C.f40196h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                PB pb = RB.f27933u;
                return QC.c(new C4862b(C3523lC.f32525x));
            case 1:
                w2.z.l("Error during loading assets.", (Exception) obj);
                return ND.f27257u;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return QC.k(th2);
            case 3:
                return QC.k(new C3231fp(5));
            case 4:
                return QC.c(((C4308zp) obj).f36226a);
            case 5:
                return ND.f27257u;
            case 6:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return QC.k(th3);
            case 7:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AbstractC3436jg.f32055a.execute(new RunnableC3071cq(9, (InputStream) obj, createPipe[1]));
                return QC.c(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? QC.c(new Tr(Integer.toString(17), i10)) : QC.c(new Tr(str2, i10));
            case 9:
                return QC.c(new Tr((String) obj, i10));
            case 10:
                K2.b bVar = (K2.b) obj;
                return bVar == null ? QC.c(new C3288gs(str2, i6, i9)) : QC.c(new C3288gs(bVar.f1680a, bVar.f1681b, i9));
            case 11:
                C4862b c4862b = (C4862b) obj;
                if (c4862b == null) {
                    return QC.c(new C3288gs(str, i10, i10));
                }
                ZL A9 = C2943aM.A();
                for (C4863c c4863c : c4862b.f40020a) {
                    XL A10 = YL.A();
                    int i11 = c4863c.f40023c;
                    A10.h();
                    ((YL) A10.f28504u).B(i11);
                    A10.h();
                    ((YL) A10.f28504u).C(c4863c.f40022b);
                    A10.h();
                    ((YL) A10.f28504u).D(c4863c.f40021a);
                    YL yl = (YL) A10.j();
                    A9.h();
                    ((C2943aM) A9.f28504u).B(yl);
                }
                return QC.c(new C3288gs(Base64.encodeToString(((C2943aM) A9.j()).b(), 1), i10, i10));
            case 12:
                K2.b bVar2 = (K2.b) obj;
                return bVar2 == null ? QC.c(new C3288gs(str2, i6, i4)) : QC.c(new C3288gs(bVar2.f1680a, bVar2.f1681b, i4));
            case 13:
                return ND.f27257u;
            case 14:
                return QC.c("");
            default:
                Ly ly = (Ly) obj;
                return QC.u(ly.f(), new C2742Pe(8, ly), GD.f25742n);
        }
    }
}
