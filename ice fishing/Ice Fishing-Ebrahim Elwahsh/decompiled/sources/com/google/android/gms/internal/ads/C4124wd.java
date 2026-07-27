package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import k2.C4630a;
import w2.InterfaceC5155c;

/* renamed from: com.google.android.gms.internal.ads.wd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4124wd implements InterfaceC5155c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35003n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3693od f35004u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC4178xd f35005v;

    public C4124wd(BinderC4178xd binderC4178xd, InterfaceC3693od interfaceC3693od, int i) {
        this.f35003n = i;
        switch (i) {
            case 1:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
            case 2:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
            case 3:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
            case 4:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
            case 5:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
            default:
                this.f35004u = interfaceC3693od;
                Objects.requireNonNull(binderC4178xd);
                this.f35005v = binderC4178xd;
                break;
        }
    }

    @Override // w2.InterfaceC5155c
    public final void f(C4630a c4630a) {
        switch (this.f35003n) {
            case 0:
                try {
                    String canonicalName = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i = c4630a.f38688a;
                    String str = c4630a.f38689b;
                    String str2 = c4630a.f38690c;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    u2.i.a(sb.toString());
                    InterfaceC3693od interfaceC3693od = this.f35004u;
                    interfaceC3693od.d3(c4630a.a());
                    interfaceC3693od.A3(i, str);
                    interfaceC3693od.l0(i);
                    break;
                } catch (RemoteException e6) {
                    u2.i.d("", e6);
                    return;
                }
            case 1:
                try {
                    String canonicalName2 = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i4 = c4630a.f38688a;
                    String str3 = c4630a.f38689b;
                    String str4 = c4630a.f38690c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 43 + String.valueOf(i4).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to loaded mediation ad: ErrorCode = ");
                    sb2.append(i4);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    u2.i.a(sb2.toString());
                    InterfaceC3693od interfaceC3693od2 = this.f35004u;
                    interfaceC3693od2.d3(c4630a.a());
                    interfaceC3693od2.A3(i4, str3);
                    interfaceC3693od2.l0(i4);
                    break;
                } catch (RemoteException e9) {
                    u2.i.d("", e9);
                    return;
                }
            case 2:
                try {
                    String canonicalName3 = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i9 = c4630a.f38688a;
                    String str5 = c4630a.f38689b;
                    String str6 = c4630a.f38690c;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(canonicalName3).length() + 41 + String.valueOf(i9).length() + 17 + String.valueOf(str5).length() + 16 + String.valueOf(str6).length());
                    sb3.append(canonicalName3);
                    sb3.append("failed to load mediation ad: ErrorCode = ");
                    sb3.append(i9);
                    sb3.append(". ErrorMessage = ");
                    sb3.append(str5);
                    sb3.append(". ErrorDomain = ");
                    sb3.append(str6);
                    u2.i.a(sb3.toString());
                    InterfaceC3693od interfaceC3693od3 = this.f35004u;
                    interfaceC3693od3.d3(c4630a.a());
                    interfaceC3693od3.A3(i9, str5);
                    interfaceC3693od3.l0(i9);
                    break;
                } catch (RemoteException e10) {
                    u2.i.d("", e10);
                    return;
                }
            case 3:
                try {
                    String canonicalName4 = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i10 = c4630a.f38688a;
                    String str7 = c4630a.f38689b;
                    String str8 = c4630a.f38690c;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(canonicalName4).length() + 41 + String.valueOf(i10).length() + 17 + String.valueOf(str7).length() + 16 + String.valueOf(str8).length());
                    sb4.append(canonicalName4);
                    sb4.append("failed to load mediation ad: ErrorCode = ");
                    sb4.append(i10);
                    sb4.append(". ErrorMessage = ");
                    sb4.append(str7);
                    sb4.append(". ErrorDomain = ");
                    sb4.append(str8);
                    u2.i.a(sb4.toString());
                    InterfaceC3693od interfaceC3693od4 = this.f35004u;
                    interfaceC3693od4.d3(c4630a.a());
                    interfaceC3693od4.A3(i10, str7);
                    interfaceC3693od4.l0(i10);
                    break;
                } catch (RemoteException e11) {
                    u2.i.d("", e11);
                    return;
                }
            case 4:
                try {
                    String canonicalName5 = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i11 = c4630a.f38688a;
                    String str9 = c4630a.f38689b;
                    String str10 = c4630a.f38690c;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(canonicalName5).length() + 41 + String.valueOf(i11).length() + 17 + String.valueOf(str9).length() + 16 + String.valueOf(str10).length());
                    sb5.append(canonicalName5);
                    sb5.append("failed to load mediation ad: ErrorCode = ");
                    sb5.append(i11);
                    sb5.append(". ErrorMessage = ");
                    sb5.append(str9);
                    sb5.append(". ErrorDomain = ");
                    sb5.append(str10);
                    u2.i.a(sb5.toString());
                    InterfaceC3693od interfaceC3693od5 = this.f35004u;
                    interfaceC3693od5.d3(c4630a.a());
                    interfaceC3693od5.A3(i11, str9);
                    interfaceC3693od5.l0(i11);
                    break;
                } catch (RemoteException e12) {
                    u2.i.d("", e12);
                    return;
                }
            default:
                try {
                    String canonicalName6 = this.f35005v.f35188n.getClass().getCanonicalName();
                    int i12 = c4630a.f38688a;
                    String str11 = c4630a.f38689b;
                    String str12 = c4630a.f38690c;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(canonicalName6).length() + 41 + String.valueOf(i12).length() + 17 + String.valueOf(str11).length() + 16 + String.valueOf(str12).length());
                    sb6.append(canonicalName6);
                    sb6.append("failed to load mediation ad: ErrorCode = ");
                    sb6.append(i12);
                    sb6.append(". ErrorMessage = ");
                    sb6.append(str11);
                    sb6.append(". ErrorDomain = ");
                    sb6.append(str12);
                    u2.i.a(sb6.toString());
                    InterfaceC3693od interfaceC3693od6 = this.f35004u;
                    interfaceC3693od6.d3(c4630a.a());
                    interfaceC3693od6.A3(i12, str11);
                    interfaceC3693od6.l0(i12);
                    break;
                } catch (RemoteException e13) {
                    u2.i.d("", e13);
                }
        }
    }
}
