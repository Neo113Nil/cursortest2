package flex.parser.transition;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sbx;
import defpackage.vwl;
import defpackage.w511;
import defpackage.wwl;
import defpackage.y8;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;
import flex.core.model.Document$TransitionSettings$Option$Transition;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class h extends y8 {
    public final KSerializer a;
    public final SerialDescriptor b;

    public h() {
        KSerializer serializer = a.Companion.serializer();
        this.a = serializer;
        this.b = serializer.getDescriptor();
    }

    public static vwl b(g gVar) {
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator;
        Document$TransitionSettings$Option$Transition document$TransitionSettings$Option$Transition;
        if (gVar.c() == null) {
            return null;
        }
        double a2 = gVar.a() * 1000.0d;
        TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator b = gVar.b();
        int i = b == null ? -1 : i.a[b.ordinal()];
        if (i == -1) {
            document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.Linear;
        } else if (i == 1) {
            document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.Linear;
        } else if (i == 2) {
            document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.EaseIn;
        } else if (i == 3) {
            document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.EaseOut;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            document$TransitionSettings$Option$Interpolator = Document$TransitionSettings$Option$Interpolator.EaseInOut;
        }
        int i2 = i.b[gVar.c().ordinal()];
        if (i2 == 1) {
            document$TransitionSettings$Option$Transition = Document$TransitionSettings$Option$Transition.CrossDissolve;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            document$TransitionSettings$Option$Transition = Document$TransitionSettings$Option$Transition.BottomSurfacing;
        }
        return new vwl(a2, document$TransitionSettings$Option$Interpolator, document$TransitionSettings$Option$Transition);
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, kotlinx.serialization.json.b bVar) {
        if (!(bVar instanceof kotlinx.serialization.json.c)) {
            ny61.g("Failed requirement.");
            return null;
        }
        sbxVar.getClass();
        a aVar = (a) sbxVar.a(a.Companion.serializer(), bVar);
        g gVar = aVar.a;
        vwl b = gVar != null ? b(gVar) : null;
        g gVar2 = aVar.b;
        return new wwl(b, gVar2 != null ? b(gVar2) : null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lflex/parser/transition/h$a;", "", "Companion", "flex/parser/transition/g", "flex/parser/transition/a", "flex/parser/transition/b", "flex-parser"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {
        public static final b Companion = new b();
        public final g a;
        public final g b;

        public /* synthetic */ a(int i, g gVar, g gVar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = gVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = gVar2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            g gVar = this.a;
            int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            g gVar2 = this.b;
            return hashCode + (gVar2 != null ? gVar2.hashCode() : 0);
        }

        public final String toString() {
            return "TransitionSettingsSurrogate(onShow=" + this.a + ", onHide=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this.a = null;
            this.b = null;
        }
    }
}
