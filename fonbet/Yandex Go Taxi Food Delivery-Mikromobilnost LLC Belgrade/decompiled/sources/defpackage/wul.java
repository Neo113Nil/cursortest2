package defpackage;

import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.feature.divkit.scaffold.ScaffoldAnimations;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class wul extends mjm0 {
    public static final vul Companion = new vul();
    public static final i3y[] j;
    public final DivkitSnippet a;
    public final DivKitScaffoldPadding b;
    public final DivkitSnippet c;
    public final DivKitScaffoldPadding d;
    public final DivkitSnippet e;
    public final ThemedColor f;
    public final ScaffoldAnimations g;
    public final DivkitSnippet h;
    public final hrx i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{a.b(lazyThreadSafetyMode, new xyi(24)), null, a.b(lazyThreadSafetyMode, new xyi(25)), null, a.b(lazyThreadSafetyMode, new xyi(26)), a.b(lazyThreadSafetyMode, new xyi(27)), null, a.b(lazyThreadSafetyMode, new xyi(28)), null};
    }

    public /* synthetic */ wul(int i, DivkitSnippet divkitSnippet, DivKitScaffoldPadding divKitScaffoldPadding, DivkitSnippet divkitSnippet2, DivKitScaffoldPadding divKitScaffoldPadding2, DivkitSnippet divkitSnippet3, ThemedColor themedColor, ScaffoldAnimations scaffoldAnimations, DivkitSnippet divkitSnippet4, hrx hrxVar) {
        if (10 != (i & 10)) {
            qje.Z(i, 10, uul.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = divkitSnippet;
        }
        this.b = divKitScaffoldPadding;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = divkitSnippet2;
        }
        this.d = divKitScaffoldPadding2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = divkitSnippet3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = themedColor;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = scaffoldAnimations;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = divkitSnippet4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = hrxVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wul.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        wul wulVar = (wul) obj;
        return jl40.l(this.a, wulVar.a) && jl40.l(this.b, wulVar.b) && jl40.l(this.c, wulVar.c) && jl40.l(this.d, wulVar.d) && jl40.l(this.e, wulVar.e) && jl40.l(this.f, wulVar.f) && jl40.l(this.g, wulVar.g) && jl40.l(this.h, wulVar.h) && jl40.l(this.i, wulVar.i);
    }

    public final int hashCode() {
        DivkitSnippet divkitSnippet = this.a;
        int hashCode = (divkitSnippet != null ? divkitSnippet.hashCode() : 0) * 31;
        DivKitScaffoldPadding divKitScaffoldPadding = this.b;
        int hashCode2 = (hashCode + (divKitScaffoldPadding != null ? divKitScaffoldPadding.hashCode() : 0)) * 31;
        DivkitSnippet divkitSnippet2 = this.c;
        int hashCode3 = (hashCode2 + (divkitSnippet2 != null ? divkitSnippet2.hashCode() : 0)) * 31;
        DivKitScaffoldPadding divKitScaffoldPadding2 = this.d;
        int hashCode4 = (hashCode3 + (divKitScaffoldPadding2 != null ? divKitScaffoldPadding2.hashCode() : 0)) * 31;
        DivkitSnippet divkitSnippet3 = this.e;
        int hashCode5 = (hashCode4 + (divkitSnippet3 != null ? divkitSnippet3.hashCode() : 0)) * 31;
        ThemedColor themedColor = this.f;
        int hashCode6 = (hashCode5 + (themedColor != null ? themedColor.hashCode() : 0)) * 31;
        ScaffoldAnimations scaffoldAnimations = this.g;
        int hashCode7 = (hashCode6 + (scaffoldAnimations != null ? scaffoldAnimations.hashCode() : 0)) * 31;
        DivkitSnippet divkitSnippet4 = this.h;
        int hashCode8 = (hashCode7 + (divkitSnippet4 != null ? divkitSnippet4.hashCode() : 0)) * 31;
        hrx hrxVar = this.i;
        return hashCode8 + (hrxVar != null ? hrxVar.hashCode() : 0);
    }

    public final String toString() {
        return "DivkitScaffold(topView=" + this.a + ", topPadding=" + this.b + ", bottomView=" + this.c + ", bottomPadding=" + this.d + ", overlayView=" + this.e + ", backgroundColor=" + this.f + ", animations=" + this.g + ", backgroundView=" + this.h + ", landscapeSettings=" + this.i + Extension.C_BRAKE;
    }
}
