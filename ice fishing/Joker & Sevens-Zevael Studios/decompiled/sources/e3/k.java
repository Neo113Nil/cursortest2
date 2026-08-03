package e3;

import android.net.Uri;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2094b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2095c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2096d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2098f;

    public k(Uri uri, int i10, int i11, boolean z10, int i12) {
        uri.getClass();
        this.f2093a = uri;
        this.f2094b = i10;
        this.f2095c = i11;
        this.f2096d = z10;
        this.f2097e = null;
        this.f2098f = i12;
    }

    public k(String str, String str2) {
        this.f2093a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f2094b = 0;
        this.f2095c = 400;
        this.f2096d = false;
        this.f2097e = str2;
        this.f2098f = 0;
    }
}
