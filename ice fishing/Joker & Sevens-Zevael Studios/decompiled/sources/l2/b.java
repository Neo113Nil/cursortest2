package l2;

import pc.j;
import v.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4114e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4116b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4117c;

    /* renamed from: d, reason: collision with root package name */
    public final n2.b f4118d;

    static {
        new b();
    }

    public b() {
        n2.b bVar = n2.b.f5041i;
        this.f4115a = true;
        this.f4116b = 1;
        this.f4117c = 1;
        this.f4118d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4115a == bVar.f4115a && this.f4116b == bVar.f4116b && this.f4117c == bVar.f4117c && j.a(this.f4118d, bVar.f4118d);
    }

    public final int hashCode() {
        return this.f4118d.f5042g.hashCode() + f.b(this.f4117c, f.b(this.f4116b, a4.d.d(f.b(0, Boolean.hashCode(false) * 31, 31), 31, this.f4115a), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb.append((Object) "None");
        sb.append(", autoCorrect=");
        sb.append(this.f4115a);
        sb.append(", keyboardType=");
        int i10 = this.f4116b;
        sb.append((Object) (i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? "Decimal" : "Invalid"));
        sb.append(", imeAction=");
        int i11 = this.f4117c;
        if (i11 == -1) {
            str = "Unspecified";
        } else if (i11 != 0) {
            str = i11 == 1 ? "Default" : i11 == 2 ? "Go" : i11 == 3 ? "Search" : i11 == 4 ? "Send" : i11 == 5 ? "Previous" : i11 == 6 ? "Next" : i11 == 7 ? "Done" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f4118d);
        sb.append(')');
        return sb.toString();
    }
}
