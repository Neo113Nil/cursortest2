package t2;

import com.google.android.gms.internal.ads.AbstractC3074d5;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.C2965b5;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends AbstractC3074d5 {

    /* renamed from: F, reason: collision with root package name */
    public final Object f40927F;

    /* renamed from: G, reason: collision with root package name */
    public final q f40928G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ byte[] f40929H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ HashMap f40930I;
    public final /* synthetic */ u2.f J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, int i, String str, q qVar, S0.l lVar, byte[] bArr, HashMap hashMap, u2.f fVar) {
        super(i, str, lVar);
        this.f40929H = bArr;
        this.f40930I = hashMap;
        this.J = fVar;
        Objects.requireNonNull(sVar);
        this.f40927F = new Object();
        this.f40928G = qVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final Map e() {
        HashMap hashMap = this.f40930I;
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final byte[] f() {
        byte[] bArr = this.f40929H;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final com.bumptech.glide.manager.n h(C2965b5 c2965b5) {
        String str;
        String str2;
        byte[] bArr = c2965b5.f29402b;
        try {
            Map map = c2965b5.f29403c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new com.bumptech.glide.manager.n(str, AbstractC3217fl.g(c2965b5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3074d5
    public final void i(Object obj) {
        q qVar;
        String str = (String) obj;
        u2.f fVar = this.J;
        if (u2.f.c() && str != null) {
            fVar.e("onNetworkResponseBody", new h8.d(10, str.getBytes()));
        }
        synchronized (this.f40927F) {
            qVar = this.f40928G;
        }
        qVar.a(str);
    }
}
