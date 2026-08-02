package defpackage;

import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wjs {
    public final boolean a;
    public final FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection b;
    public final String c;
    public final boolean d;

    public wjs(boolean z, FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, String str, boolean z2) {
        this.a = z;
        this.b = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjs)) {
            return false;
        }
        wjs wjsVar = (wjs) obj;
        return this.a == wjsVar.a && this.b == wjsVar.b && jl40.l(this.c, wjsVar.c) && this.d == wjsVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + unr0.e(Boolean.hashCode(this.a) * 31, 31, false)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(shouldOpenSourceOnLaunch=");
        sb.append(this.a);
        sb.append(", withTopNavShortcuts=false, direction=");
        sb.append(this.b);
        sb.append(", transitionName=");
        return nnm.i(this.c, ", shouldLogPerf=", Extension.C_BRAKE, sb, this.d);
    }
}
