package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import k2.C4631a;
import x2.InterfaceC5189c;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4273zd implements InterfaceC5189c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35353n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3841rd f35354u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC2466Ad f35355v;

    public C4273zd(BinderC2466Ad binderC2466Ad, InterfaceC3841rd interfaceC3841rd, int i) {
        this.f35353n = i;
        switch (i) {
            case 1:
                this.f35354u = interfaceC3841rd;
                Objects.requireNonNull(binderC2466Ad);
                this.f35355v = binderC2466Ad;
                break;
            default:
                this.f35354u = interfaceC3841rd;
                Objects.requireNonNull(binderC2466Ad);
                this.f35355v = binderC2466Ad;
                break;
        }
    }

    @Override // x2.InterfaceC5189c
    public final void x(C4631a c4631a) {
        switch (this.f35353n) {
            case 0:
                try {
                    String canonicalName = this.f35355v.f23682n.getClass().getCanonicalName();
                    int i = c4631a.f38568a;
                    String str = c4631a.f38569b;
                    String str2 = c4631a.f38570c;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    v2.i.a(sb.toString());
                    InterfaceC3841rd interfaceC3841rd = this.f35354u;
                    interfaceC3841rd.n3(c4631a.a());
                    interfaceC3841rd.O3(i, str);
                    interfaceC3841rd.j0(i);
                    break;
                } catch (RemoteException e9) {
                    v2.i.d("", e9);
                    return;
                }
            default:
                try {
                    String canonicalName2 = this.f35355v.f23682n.getClass().getCanonicalName();
                    int i6 = c4631a.f38568a;
                    String str3 = c4631a.f38569b;
                    String str4 = c4631a.f38570c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i6).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i6);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    v2.i.a(sb2.toString());
                    InterfaceC3841rd interfaceC3841rd2 = this.f35354u;
                    interfaceC3841rd2.n3(c4631a.a());
                    interfaceC3841rd2.O3(i6, str3);
                    interfaceC3841rd2.j0(i6);
                    break;
                } catch (RemoteException e10) {
                    v2.i.d("", e10);
                }
        }
    }
}
