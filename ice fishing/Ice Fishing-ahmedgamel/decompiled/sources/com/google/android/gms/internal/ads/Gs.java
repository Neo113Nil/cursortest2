package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Gs implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final C3404j1 f25916a;

    /* renamed from: b, reason: collision with root package name */
    public final C3404j1 f25917b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25918c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25919d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25920e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25921f;

    public Gs(C3404j1 c3404j1, C3404j1 c3404j12, boolean z6, boolean z9, boolean z10) {
        this.f25916a = c3404j1;
        this.f25917b = c3404j12;
        this.f25918c = z6;
        this.f25919d = z9;
        this.f25921f = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r7 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r1.putString("paidv1_id_android", r6);
        r1.putLong("paidv1_creation_time_android", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32933V3)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        r4 = r9.f25917b;
        r5 = (java.lang.String) r4.f31944v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        r6 = r4.f31943u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        r1.putString("paidv2_id_android", r5);
        r1.putLong("paidv2_creation_time_android", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        r1.putBoolean("paidv2_pub_option_android", r9.f25918c);
        r1.putBoolean("paidv2_user_option_android", r9.f25919d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32950X3)).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.W3)).booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f32924U3)).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        r5 = r9.f25916a;
        r6 = (java.lang.String) r5.f31944v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        r7 = r5.f31943u;
     */
    @Override // com.google.android.gms.internal.ads.Os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f25920e) {
            return;
        }
        Bundle b9 = MA.b("pii", bundle);
        boolean z6 = this.f25921f;
        if (!z6) {
        }
        if (z6) {
        }
        if (!z6) {
        }
        if (z6) {
        }
        if (b9.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", b9);
    }

    public Gs(boolean z6) {
        this.f25921f = z6;
    }
}
