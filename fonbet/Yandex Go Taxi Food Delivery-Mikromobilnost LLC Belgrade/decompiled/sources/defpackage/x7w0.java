package defpackage;

import com.yandex.go.mainscreen.superapp.api.presentation.AdditionalAction;
import com.yandex.go.search.router.FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x7w0 implements z7w0 {
    public final boolean a;
    public final FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection b;
    public final AdditionalAction c;
    public final String d;
    public final boolean e;
    public final String f;

    public x7w0(boolean z, FullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection, AdditionalAction additionalAction, String str, boolean z2, String str2) {
        this.a = z;
        this.b = fullscreenDestinationSuggestRouter$LaunchOptions$NavigationDirection;
        this.c = additionalAction;
        this.d = str;
        this.e = z2;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7w0)) {
            return false;
        }
        x7w0 x7w0Var = (x7w0) obj;
        return this.a == x7w0Var.a && this.b == x7w0Var.b && this.c == x7w0Var.c && jl40.l(this.d, x7w0Var.d) && this.e == x7w0Var.e && jl40.l(this.f, x7w0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31;
        String str = this.d;
        return this.f.hashCode() + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fullscreen(showSource=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", additionalAction=");
        sb.append(this.c);
        sb.append(", transitionName=");
        sb.append(this.d);
        sb.append(", shouldLogPerf=");
        return n.m(", tariffClass=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
