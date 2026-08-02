package androidx.compose.foundation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cje;
import defpackage.edi;
import defpackage.k5r;
import defpackage.meo;
import defpackage.nn4;
import defpackage.uoi;
import defpackage.xci;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Ledi;", "Lnn4;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ClickableElement extends edi {
    public final uoi a;
    public final cje b;
    public final boolean c;
    public final String d;
    public final meo e;
    public final Function0 f;

    public ClickableElement(uoi uoiVar, cje cjeVar, boolean z, String str, meo meoVar, Function0 function0) {
        this.a = uoiVar;
        this.b = cjeVar;
        this.c = z;
        this.d = str;
        this.e = meoVar;
        this.f = function0;
    }

    @Override // defpackage.edi
    public final xci e() {
        return new nn4(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.d(this.a, clickableElement.a) && Intrinsics.d(this.b, clickableElement.b) && this.c == clickableElement.c && Intrinsics.d(this.d, clickableElement.d) && Intrinsics.d(this.e, clickableElement.e) && this.f == clickableElement.f;
    }

    public final int hashCode() {
        uoi uoiVar = this.a;
        int hashCode = (uoiVar != null ? uoiVar.hashCode() : 0) * 31;
        cje cjeVar = this.b;
        int e = k5r.e((hashCode + (cjeVar != null ? cjeVar.hashCode() : 0)) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        meo meoVar = this.e;
        return this.f.hashCode() + ((hashCode2 + (meoVar != null ? Integer.hashCode(meoVar.a) : 0)) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        ((nn4) xciVar).c1(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
