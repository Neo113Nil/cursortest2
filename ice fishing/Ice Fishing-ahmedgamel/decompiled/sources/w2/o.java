package w2;

import com.google.android.gms.internal.ads.AbstractC3194f5;
import com.google.android.gms.internal.ads.C3087d5;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.SK;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import l.C4659e;

/* loaded from: classes.dex */
public final class o extends AbstractC3194f5 {

    /* renamed from: F, reason: collision with root package name */
    public final Object f41694F;

    /* renamed from: G, reason: collision with root package name */
    public final p f41695G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ byte[] f41696H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ HashMap f41697I;
    public final /* synthetic */ x2.f J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, int i, String str, p pVar, LP lp, byte[] bArr, HashMap hashMap, x2.f fVar) {
        super(i, str, lp);
        this.f41696H = bArr;
        this.f41697I = hashMap;
        this.J = fVar;
        Objects.requireNonNull(rVar);
        this.f41694F = new Object();
        this.f41695G = pVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final Map e() {
        HashMap hashMap = this.f41697I;
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final byte[] f() {
        byte[] bArr = this.f41696H;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final com.bumptech.glide.manager.n h(C3087d5 c3087d5) {
        String str;
        String str2;
        byte[] bArr = c3087d5.f30480b;
        try {
            Map map = c3087d5.f30481c;
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
        return new com.bumptech.glide.manager.n(str, SK.h(c3087d5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3194f5
    public final void i(Object obj) {
        p pVar;
        String str = (String) obj;
        x2.f fVar = this.J;
        if (x2.f.c() && str != null) {
            fVar.e("onNetworkResponseBody", new C4659e(10, str.getBytes()));
        }
        synchronized (this.f41694F) {
            pVar = this.f41695G;
        }
        pVar.b(str);
    }
}
