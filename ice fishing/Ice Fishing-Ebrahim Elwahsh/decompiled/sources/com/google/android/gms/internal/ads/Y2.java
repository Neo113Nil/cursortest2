package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28773b;

    /* renamed from: c, reason: collision with root package name */
    public final C3394j1 f28774c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28775d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28776e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r6.equals(com.anythink.basead.exoplayer.b.bd) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Y2(boolean z8, String str, int i, byte[] bArr, int i4, int i9, byte[] bArr2) {
        char c4 = 0;
        int i10 = 1;
        PA.n((i == 0) ^ (bArr2 == null));
        this.f28772a = z8;
        this.f28773b = str;
        this.f28775d = i;
        this.f28776e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals(com.anythink.basead.exoplayer.b.be)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3046671:
                    if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 != 0 && c4 != 1) {
                if (c4 == 2 || c4 == 3) {
                    i10 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    AbstractC3217fl.I("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f28774c = new C3394j1(i10, bArr, i4, i9);
    }
}
