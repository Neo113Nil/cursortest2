package u2;

import com.google.android.gms.internal.ads.AbstractC3171f5;
import com.google.android.gms.internal.ads.C3064d5;
import com.google.android.gms.internal.ads.SK;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import t0.C4986A;

/* loaded from: classes.dex */
public final class o extends AbstractC3171f5 {

    /* renamed from: F, reason: collision with root package name */
    public final Object f41304F;

    /* renamed from: G, reason: collision with root package name */
    public final p f41305G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ byte[] f41306H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ HashMap f41307I;
    public final /* synthetic */ v2.f J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, int i, String str, p pVar, m1.e eVar, byte[] bArr, HashMap hashMap, v2.f fVar) {
        super(i, str, eVar);
        this.f41306H = bArr;
        this.f41307I = hashMap;
        this.J = fVar;
        Objects.requireNonNull(rVar);
        this.f41304F = new Object();
        this.f41305G = pVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final Map e() {
        HashMap hashMap = this.f41307I;
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final byte[] f() {
        byte[] bArr = this.f41306H;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final com.bumptech.glide.manager.o h(C3064d5 c3064d5) {
        String str;
        String str2;
        byte[] bArr = c3064d5.f29708b;
        try {
            Map map = c3064d5.f29709c;
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
        return new com.bumptech.glide.manager.o(str, SK.h(c3064d5));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3171f5
    public final void i(Object obj) {
        p pVar;
        String str = (String) obj;
        v2.f fVar = this.J;
        if (v2.f.c() && str != null) {
            fVar.e("onNetworkResponseBody", new C4986A(str.getBytes()));
        }
        synchronized (this.f41304F) {
            pVar = this.f41305G;
        }
        pVar.b(str);
    }
}
