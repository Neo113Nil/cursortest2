package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2901a3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29011b;

    /* renamed from: c, reason: collision with root package name */
    public final C3489l1 f29012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29013d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f29014e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals(com.anythink.basead.exoplayer.b.bd) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2901a3(boolean z3, String str, int i, byte[] bArr, int i6, int i9, byte[] bArr2) {
        char c9 = 0;
        int i10 = 1;
        AbstractC2772Sd.i((i == 0) ^ (bArr2 == null));
        this.f29010a = z3;
        this.f29011b = str;
        this.f29013d = i;
        this.f29014e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals(com.anythink.basead.exoplayer.b.be)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3046671:
                    if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            if (c9 != 0 && c9 != 1) {
                if (c9 == 2 || c9 == 3) {
                    i10 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    AbstractC2968bG.y("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f29012c = new C3489l1(i10, bArr, i6, i9);
    }
}
