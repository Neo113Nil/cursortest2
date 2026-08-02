package E2;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C4081ve;
import com.google.android.gms.internal.ads.C4260yv;
import com.google.android.gms.internal.ads.InterfaceC4189xe;
import com.google.android.gms.internal.ads.KD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: E2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306c implements KD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f783n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4189xe f784u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f785v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC0314k f786w;

    public C0306c(BinderC0314k binderC0314k, InterfaceC4189xe interfaceC4189xe, boolean z6, int i) {
        this.f783n = i;
        switch (i) {
            case 1:
                this.f784u = interfaceC4189xe;
                this.f785v = z6;
                Objects.requireNonNull(binderC0314k);
                this.f786w = binderC0314k;
                break;
            default:
                this.f784u = interfaceC4189xe;
                this.f785v = z6;
                Objects.requireNonNull(binderC0314k);
                this.f786w = binderC0314k;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public final void mo10n(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z6 = this.f785v;
        BinderC0314k binderC0314k = this.f786w;
        InterfaceC4189xe interfaceC4189xe = this.f784u;
        switch (this.f783n) {
            case 0:
                List<Uri> list = (List) obj;
                try {
                    binderC0314k.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = binderC0314k.f824R;
                        arrayList2 = binderC0314k.f823Q;
                        if (hasNext) {
                            if (BinderC0314k.Y3((Uri) it.next(), arrayList2, arrayList)) {
                                binderC0314k.f819M.getAndIncrement();
                            }
                        }
                    }
                    C4081ve c4081ve = (C4081ve) interfaceC4189xe;
                    Parcel F02 = c4081ve.F0();
                    F02.writeTypedList(list);
                    c4081ve.d1(F02, 1);
                    if (binderC0314k.f815H || z6) {
                        for (Uri uri : list) {
                            boolean Y32 = BinderC0314k.Y3(uri, arrayList2, arrayList);
                            C4260yv c4260yv = binderC0314k.f813F;
                            if (Y32) {
                                c4260yv.b(BinderC0314k.b4(uri, binderC0314k.f822P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33157t8)).booleanValue()) {
                                    c4260yv.b(uri.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("", e9);
                    return;
                }
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    C4081ve c4081ve2 = (C4081ve) interfaceC4189xe;
                    Parcel F03 = c4081ve2.F0();
                    F03.writeTypedList(arrayList3);
                    c4081ve2.d1(F03, 1);
                    if (binderC0314k.f814G || z6) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            boolean Y33 = BinderC0314k.Y3(uri2, binderC0314k.f825S, binderC0314k.f826T);
                            C4260yv c4260yv2 = binderC0314k.f813F;
                            if (Y33) {
                                c4260yv2.b(BinderC0314k.b4(uri2, binderC0314k.f822P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33157t8)).booleanValue()) {
                                    c4260yv2.b(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e10) {
                    int i4 = w2.z.f41712b;
                    x2.i.d("", e10);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public final void w(Throwable th) {
        InterfaceC4189xe interfaceC4189xe = this.f784u;
        switch (this.f783n) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String sb2 = sb.toString();
                    C4081ve c4081ve = (C4081ve) interfaceC4189xe;
                    Parcel F02 = c4081ve.F0();
                    F02.writeString(sb2);
                    c4081ve.d1(F02, 2);
                    break;
                } catch (RemoteException e9) {
                    int i = w2.z.f41712b;
                    x2.i.d("", e9);
                }
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb3.append("Internal error: ");
                    sb3.append(message2);
                    String sb4 = sb3.toString();
                    C4081ve c4081ve2 = (C4081ve) interfaceC4189xe;
                    Parcel F03 = c4081ve2.F0();
                    F03.writeString(sb4);
                    c4081ve2.d1(F03, 2);
                    break;
                } catch (RemoteException e10) {
                    int i4 = w2.z.f41712b;
                    x2.i.d("", e10);
                    return;
                }
        }
    }
}
