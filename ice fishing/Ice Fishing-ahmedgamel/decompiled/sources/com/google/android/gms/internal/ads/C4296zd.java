package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import m2.C4741a;
import z2.InterfaceC5226c;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4296zd implements InterfaceC5226c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36126n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3864rd f36127u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BinderC2486Ad f36128v;

    public C4296zd(BinderC2486Ad binderC2486Ad, InterfaceC3864rd interfaceC3864rd, int i) {
        this.f36126n = i;
        switch (i) {
            case 1:
                this.f36127u = interfaceC3864rd;
                Objects.requireNonNull(binderC2486Ad);
                this.f36128v = binderC2486Ad;
                break;
            default:
                this.f36127u = interfaceC3864rd;
                Objects.requireNonNull(binderC2486Ad);
                this.f36128v = binderC2486Ad;
                break;
        }
    }

    @Override // z2.InterfaceC5226c
    public final void h(C4741a c4741a) {
        switch (this.f36126n) {
            case 0:
                try {
                    String canonicalName = this.f36128v.f24464n.getClass().getCanonicalName();
                    int i = c4741a.f39357a;
                    String str = c4741a.f39358b;
                    String str2 = c4741a.f39359c;
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 43 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb.append(canonicalName);
                    sb.append("failed to loaded mediation ad: ErrorCode = ");
                    sb.append(i);
                    sb.append(". ErrorMessage = ");
                    sb.append(str);
                    sb.append(". ErrorDomain = ");
                    sb.append(str2);
                    x2.i.a(sb.toString());
                    InterfaceC3864rd interfaceC3864rd = this.f36127u;
                    interfaceC3864rd.r0(c4741a.a());
                    interfaceC3864rd.N3(i, str);
                    interfaceC3864rd.j0(i);
                    break;
                } catch (RemoteException e9) {
                    x2.i.d("", e9);
                    return;
                }
            default:
                try {
                    String canonicalName2 = this.f36128v.f24464n.getClass().getCanonicalName();
                    int i4 = c4741a.f39357a;
                    String str3 = c4741a.f39358b;
                    String str4 = c4741a.f39359c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41 + String.valueOf(i4).length() + 17 + String.valueOf(str3).length() + 16 + String.valueOf(str4).length());
                    sb2.append(canonicalName2);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i4);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str3);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str4);
                    x2.i.a(sb2.toString());
                    InterfaceC3864rd interfaceC3864rd2 = this.f36127u;
                    interfaceC3864rd2.r0(c4741a.a());
                    interfaceC3864rd2.N3(i4, str3);
                    interfaceC3864rd2.j0(i4);
                    break;
                } catch (RemoteException e10) {
                    x2.i.d("", e10);
                }
        }
    }
}
