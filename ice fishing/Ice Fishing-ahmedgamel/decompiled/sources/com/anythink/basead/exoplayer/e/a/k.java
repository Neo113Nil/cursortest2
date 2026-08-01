package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.e.m;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    private static final String f7122f = "TrackEncryptionBox";

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7124b;

    /* renamed from: c, reason: collision with root package name */
    public final m.a f7125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7126d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7127e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.equals(com.anythink.basead.exoplayer.b.be) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(boolean z3, String str, int i, byte[] bArr, int i6, int i9, byte[] bArr2) {
        int i10 = 2;
        char c9 = 0;
        com.anythink.basead.exoplayer.k.a.a((i == 0) ^ (bArr2 == null));
        this.f7123a = z3;
        this.f7124b = str;
        this.f7126d = i;
        this.f7127e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3049879:
                    if (str.equals(com.anythink.basead.exoplayer.b.bd)) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3049895:
                    if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                case 1:
                    break;
                default:
                    Log.w(f7122f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                case 2:
                case 3:
                    i10 = 1;
                    break;
            }
            this.f7125c = new m.a(i10, bArr, i6, i9);
        }
        i10 = 1;
        this.f7125c = new m.a(i10, bArr, i6, i9);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c9 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.anythink.basead.exoplayer.b.be)) {
                    c9 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(com.anythink.basead.exoplayer.b.bg)) {
                    c9 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(com.anythink.basead.exoplayer.b.bd)) {
                    c9 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(com.anythink.basead.exoplayer.b.bf)) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f7122f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
