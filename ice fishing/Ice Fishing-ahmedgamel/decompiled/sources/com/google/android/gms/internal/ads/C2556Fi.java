package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import p2.C4835j;
import q0.C4862b;
import q0.C4863c;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2556Fi implements BD {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24820b = new C2556Fi(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24821c = new C2556Fi(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24822d = new C2556Fi(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24823e = new C2556Fi(4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24824f = new C2556Fi(5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24825g = new C2556Fi(6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24826h = new C2556Fi(8);
    public static final /* synthetic */ C2556Fi i = new C2556Fi(9);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24827j = new C2556Fi(10);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24828k = new C2556Fi(11);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24829l = new C2556Fi(12);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24830m = new C2556Fi(13);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C2556Fi f24831n = new C2556Fi(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24832a;

    public /* synthetic */ C2556Fi(int i6) {
        this.f24832a = i6;
    }

    /* JADX WARN: Type inference failed for: r9v38, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        int i6 = 2;
        int i9 = -1;
        String str = "";
        int i10 = 0;
        String str2 = null;
        int i11 = 1;
        switch (this.f24832a) {
            case 0:
                Throwable th = (Throwable) obj;
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Pb)).booleanValue()) {
                    C4835j.f39733C.f39743h.f("GetTopicsApiWithRecordObservationActionHandlerUnsampled", th);
                } else {
                    C4835j.f39733C.f39743h.e("GetTopicsApiWithRecordObservationActionHandler", th);
                }
                PB pb = RB.f27177u;
                return QC.c(new C4862b(C3500lC.f31745x));
            case 1:
                u2.z.l("Error during loading assets.", (Exception) obj);
                return ND.f26473u;
            case 2:
                Throwable th2 = (ExecutionException) obj;
                if (th2.getCause() != null) {
                    th2 = th2.getCause();
                }
                return QC.k(th2);
            case 3:
                return QC.k(new C3208fp(5));
            case 4:
                return QC.c(((C4285zp) obj).f35457a);
            case 5:
                return ND.f26473u;
            case 6:
                Throwable th3 = (ExecutionException) obj;
                if (th3.getCause() != null) {
                    th3 = th3.getCause();
                }
                return QC.k(th3);
            case 7:
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                AbstractC3413jg.f31268a.execute(new RunnableC3048cq(9, (InputStream) obj, createPipe[1]));
                return QC.c(parcelFileDescriptor);
            case 8:
                return ((Throwable) obj) instanceof TimeoutException ? QC.c(new Tr(Integer.toString(17), i11)) : QC.c(new Tr(str2, i11));
            case 9:
                return QC.c(new Tr((String) obj, i11));
            case 10:
                I2.b bVar = (I2.b) obj;
                return bVar == null ? QC.c(new C3265gs(str2, i9, i10)) : QC.c(new C3265gs(bVar.f1287a, bVar.f1288b, i10));
            case 11:
                C4862b c4862b = (C4862b) obj;
                if (c4862b == null) {
                    return QC.c(new C3265gs(str, i11, i11));
                }
                ZL A9 = C2920aM.A();
                for (C4863c c4863c : c4862b.f39973a) {
                    XL A10 = YL.A();
                    int i12 = c4863c.f39976c;
                    A10.h();
                    ((YL) A10.f27721u).B(i12);
                    A10.h();
                    ((YL) A10.f27721u).C(c4863c.f39975b);
                    A10.h();
                    ((YL) A10.f27721u).D(c4863c.f39974a);
                    YL yl = (YL) A10.j();
                    A9.h();
                    ((C2920aM) A9.f27721u).B(yl);
                }
                return QC.c(new C3265gs(Base64.encodeToString(((C2920aM) A9.j()).b(), 1), i11, i11));
            case 12:
                I2.b bVar2 = (I2.b) obj;
                return bVar2 == null ? QC.c(new C3265gs(str2, i9, i6)) : QC.c(new C3265gs(bVar2.f1287a, bVar2.f1288b, i6));
            case 13:
                return ND.f26473u;
            case 14:
                return QC.c("");
            default:
                Ly ly = (Ly) obj;
                return QC.u(ly.f(), new C2722Pe(8, ly), GD.f24952n);
        }
    }
}
