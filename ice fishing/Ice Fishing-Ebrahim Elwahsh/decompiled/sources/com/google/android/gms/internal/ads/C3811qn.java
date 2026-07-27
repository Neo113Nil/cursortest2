package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3811qn implements LD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33875n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f33876u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2990bc f33877v;

    public C3811qn(C4026un c4026un, String str, InterfaceC2990bc interfaceC2990bc, int i) {
        this.f33875n = i;
        switch (i) {
            case 1:
                this.f33876u = str;
                this.f33877v = interfaceC2990bc;
                Objects.requireNonNull(c4026un);
                break;
            default:
                this.f33876u = str;
                this.f33877v = interfaceC2990bc;
                Objects.requireNonNull(c4026un);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo7l(Object obj) {
        switch (this.f33875n) {
            case 0:
                ((InterfaceC3858rh) obj).N0(this.f33876u, this.f33877v);
                break;
            default:
                ((InterfaceC3858rh) obj).E0(this.f33876u, this.f33877v);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public final void q(Throwable th) {
        int i = this.f33875n;
    }

    private final void a(Throwable th) {
    }

    private final void b(Throwable th) {
    }
}
