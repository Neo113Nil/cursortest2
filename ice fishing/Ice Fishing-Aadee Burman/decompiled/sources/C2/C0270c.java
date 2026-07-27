package C2;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C4058ve;
import com.google.android.gms.internal.ads.C4237yv;
import com.google.android.gms.internal.ads.InterfaceC4166xe;
import com.google.android.gms.internal.ads.KD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: C2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c implements KD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f323n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4166xe f324u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f325v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BinderC0278k f326w;

    public C0270c(BinderC0278k binderC0278k, InterfaceC4166xe interfaceC4166xe, boolean z3, int i) {
        this.f323n = i;
        switch (i) {
            case 1:
                this.f324u = interfaceC4166xe;
                this.f325v = z3;
                Objects.requireNonNull(binderC0278k);
                this.f326w = binderC0278k;
                break;
            default:
                this.f324u = interfaceC4166xe;
                this.f325v = z3;
                Objects.requireNonNull(binderC0278k);
                this.f326w = binderC0278k;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: n */
    public final void mo11n(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z3 = this.f325v;
        BinderC0278k binderC0278k = this.f326w;
        InterfaceC4166xe interfaceC4166xe = this.f324u;
        switch (this.f323n) {
            case 0:
                List<Uri> list = (List) obj;
                try {
                    binderC0278k.getClass();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        arrayList = binderC0278k.f364R;
                        arrayList2 = binderC0278k.f363Q;
                        if (hasNext) {
                            if (BinderC0278k.Y3((Uri) it.next(), arrayList2, arrayList)) {
                                binderC0278k.f359M.getAndIncrement();
                            }
                        }
                    }
                    C4058ve c4058ve = (C4058ve) interfaceC4166xe;
                    Parcel H02 = c4058ve.H0();
                    H02.writeTypedList(list);
                    c4058ve.f1(H02, 1);
                    if (binderC0278k.f355H || z3) {
                        for (Uri uri : list) {
                            boolean Y32 = BinderC0278k.Y3(uri, arrayList2, arrayList);
                            C4237yv c4237yv = binderC0278k.f353F;
                            if (Y32) {
                                c4237yv.b(BinderC0278k.b4(uri, binderC0278k.f362P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32378t8)).booleanValue()) {
                                    c4237yv.b(uri.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e9) {
                    int i = u2.z.f41319b;
                    v2.i.d("", e9);
                    return;
                }
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                try {
                    C4058ve c4058ve2 = (C4058ve) interfaceC4166xe;
                    Parcel H03 = c4058ve2.H0();
                    H03.writeTypedList(arrayList3);
                    c4058ve2.f1(H03, 1);
                    if (binderC0278k.f354G || z3) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Uri uri2 = (Uri) it2.next();
                            boolean Y33 = BinderC0278k.Y3(uri2, binderC0278k.f365S, binderC0278k.f366T);
                            C4237yv c4237yv2 = binderC0278k.f353F;
                            if (Y33) {
                                c4237yv2.b(BinderC0278k.b4(uri2, binderC0278k.f362P, "1").toString(), null, null, null);
                            } else {
                                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32378t8)).booleanValue()) {
                                    c4237yv2.b(uri2.toString(), null, null, null);
                                }
                            }
                        }
                        break;
                    }
                } catch (RemoteException e10) {
                    int i6 = u2.z.f41319b;
                    v2.i.d("", e10);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.KD
    public final void w(Throwable th) {
        InterfaceC4166xe interfaceC4166xe = this.f324u;
        switch (this.f323n) {
            case 0:
                try {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                    sb.append("Internal error: ");
                    sb.append(message);
                    String sb2 = sb.toString();
                    C4058ve c4058ve = (C4058ve) interfaceC4166xe;
                    Parcel H02 = c4058ve.H0();
                    H02.writeString(sb2);
                    c4058ve.f1(H02, 2);
                    break;
                } catch (RemoteException e9) {
                    int i = u2.z.f41319b;
                    v2.i.d("", e9);
                }
            default:
                try {
                    String message2 = th.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 16);
                    sb3.append("Internal error: ");
                    sb3.append(message2);
                    String sb4 = sb3.toString();
                    C4058ve c4058ve2 = (C4058ve) interfaceC4166xe;
                    Parcel H03 = c4058ve2.H0();
                    H03.writeString(sb4);
                    c4058ve2.f1(H03, 2);
                    break;
                } catch (RemoteException e10) {
                    int i6 = u2.z.f41319b;
                    v2.i.d("", e10);
                    return;
                }
        }
    }
}
