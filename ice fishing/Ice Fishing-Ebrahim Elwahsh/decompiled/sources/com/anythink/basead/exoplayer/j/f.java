package com.anythink.basead.exoplayer.j;

import android.net.Uri;
import android.util.Base64;
import com.anythink.basead.exoplayer.k.af;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8280a = "data";

    /* renamed from: b, reason: collision with root package name */
    private k f8281b;

    /* renamed from: c, reason: collision with root package name */
    private int f8282c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f8283d;

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        this.f8281b = kVar;
        Uri uri = kVar.f8294c;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new com.anythink.basead.exoplayer.t("Unsupported scheme: ".concat(String.valueOf(scheme)));
        }
        String[] a9 = af.a(uri.getSchemeSpecificPart(), ",");
        if (a9.length != 2) {
            throw new com.anythink.basead.exoplayer.t("Unexpected URI format: ".concat(String.valueOf(uri)));
        }
        String str = a9[1];
        if (a9[0].contains(";base64")) {
            try {
                this.f8283d = Base64.decode(str, 0);
            } catch (IllegalArgumentException e6) {
                throw new com.anythink.basead.exoplayer.t("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e6);
            }
        } else {
            this.f8283d = URLDecoder.decode(str, com.anythink.basead.exoplayer.b.i).getBytes();
        }
        return this.f8283d.length;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        this.f8281b = null;
        this.f8283d = null;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int length = this.f8283d.length - this.f8282c;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i4, length);
        System.arraycopy(this.f8283d, this.f8282c, bArr, i, min);
        this.f8282c += min;
        return min;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        k kVar = this.f8281b;
        if (kVar != null) {
            return kVar.f8294c;
        }
        return null;
    }
}
