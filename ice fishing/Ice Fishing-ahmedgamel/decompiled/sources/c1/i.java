package c1;

import com.google.android.gms.internal.ads.InterfaceC3742pl;
import com.google.android.gms.internal.ads.InterfaceC4011ul;

/* loaded from: classes.dex */
public final class i implements InterfaceC3742pl {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5526n = 0;

    /* renamed from: u, reason: collision with root package name */
    public String f5527u;

    /* renamed from: v, reason: collision with root package name */
    public String f5528v;

    public /* synthetic */ i() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3742pl, com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        ((InterfaceC4011ul) obj).c(this.f5527u, this.f5528v);
    }

    public boolean equals(Object obj) {
        switch (this.f5526n) {
            case 0:
                if (!(obj instanceof N.b)) {
                    return false;
                }
                ((N.b) obj).getClass();
                return this.f5527u == null && this.f5528v == null;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f5526n) {
            case 0:
                String str = this.f5527u;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f5528v;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f5526n) {
            case 0:
                return "Pair{" + ((Object) this.f5527u) + " " + ((Object) this.f5528v) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ i(String str, String str2) {
        this.f5527u = str;
        this.f5528v = str2;
    }
}
