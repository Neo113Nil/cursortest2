package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2924a3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29781b;

    /* renamed from: c, reason: collision with root package name */
    public final C3512l1 f29782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29783d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f29784e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals(com.anythink.basead.exoplayer.b.bd) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2924a3(boolean z6, String str, int i, byte[] bArr, int i4, int i6, byte[] bArr2) {
        char c9 = 0;
        int i9 = 1;
        AbstractC2792Sd.i((i == 0) ^ (bArr2 == null));
        this.f29780a = z6;
        this.f29781b = str;
        this.f29783d = i;
        this.f29784e = bArr2;
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
                    i9 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    AbstractC2991bG.y("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f29782c = new C3512l1(i9, bArr, i4, i6);
    }
}
