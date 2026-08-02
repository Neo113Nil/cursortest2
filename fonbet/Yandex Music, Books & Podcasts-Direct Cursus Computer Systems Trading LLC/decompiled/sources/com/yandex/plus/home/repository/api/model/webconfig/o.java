package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import defpackage.btf;
import defpackage.dfi;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class o implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    @NotNull
    public static final n Companion = new n();

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(22);

    public /* synthetic */ o(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, m.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        final int i2 = 0;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
        final int i3 = 1;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
        final int i4 = 2;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.a, oVar.a) && Intrinsics.d(this.b, oVar.b) && Intrinsics.d(this.c, oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneClickLegalInfo(template=");
        sb.append(this.a);
        sb.append(", urlText=");
        sb.append(this.b);
        sb.append(", url=");
        return dfi.i(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public o(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        final int i = 3;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
        final int i2 = 4;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
        final int i3 = 5;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.l
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        o oVar = this.b;
                        boolean z = false;
                        if (StringsKt.M(oVar.a, "%%LINK%%", false) && !StringsKt.U(oVar.b) && Patterns.WEB_URL.matcher(oVar.c).matches()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    case 2:
                        String str4 = this.b.a;
                        return StringsKt.k0(str4, "%%LINK%%", str4);
                    case 3:
                        o oVar2 = this.b;
                        boolean z2 = false;
                        if (StringsKt.M(oVar2.a, "%%LINK%%", false) && !StringsKt.U(oVar2.b) && Patterns.WEB_URL.matcher(oVar2.c).matches()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    case 4:
                        return StringsKt.n0(this.b.a, "%%LINK%%");
                    default:
                        String str5 = this.b.a;
                        return StringsKt.k0(str5, "%%LINK%%", str5);
                }
            }
        });
    }
}
