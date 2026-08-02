package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.btf;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class a0 implements Parcelable {
    public final String a;
    public final String b;
    public final z c;
    public final p d;
    public final f e;
    public final jyr f;

    @NotNull
    public static final c Companion = new c();

    @NotNull
    public static final Parcelable.Creator<a0> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(18);

    public /* synthetic */ a0(int i, String str, String str2, z zVar, p pVar, f fVar) {
        if (31 != (i & 31)) {
            u7g.V(i, 31, b.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = zVar;
        this.d = pVar;
        this.e = fVar;
        final int i2 = 0;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.a
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
            
                if (((java.lang.Boolean) r0.d.getValue()).booleanValue() == true) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
            
                if (((java.lang.Boolean) r0.d.getValue()).booleanValue() == true) goto L12;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean z;
                boolean z2;
                switch (i2) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.c.b && (r0 = a0Var.d.b) != null) {
                            z = true;
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        a0 a0Var2 = this.b;
                        if (a0Var2.c.b && (r0 = a0Var2.d.b) != null) {
                            z2 = true;
                            break;
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
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
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.a, a0Var.a) && Intrinsics.d(this.b, a0Var.b) && Intrinsics.d(this.c, a0Var.c) && Intrinsics.d(this.d, a0Var.d) && Intrinsics.d(this.e, a0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "SubscriptionConfiguration(name=" + this.a + ", id=" + this.b + ", subscription=" + this.c + ", payInfo=" + this.d + ", payButton=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
    }

    public a0(String str, String str2, z zVar, p pVar, f fVar) {
        str.getClass();
        str2.getClass();
        zVar.getClass();
        pVar.getClass();
        fVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = zVar;
        this.d = pVar;
        this.e = fVar;
        final int i = 1;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.home.repository.api.model.webconfig.a
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
            
                if (((java.lang.Boolean) r0.d.getValue()).booleanValue() == true) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
            
                if (((java.lang.Boolean) r0.d.getValue()).booleanValue() == true) goto L12;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                boolean z;
                boolean z2;
                switch (i) {
                    case 0:
                        a0 a0Var = this.b;
                        if (a0Var.c.b && (r0 = a0Var.d.b) != null) {
                            z = true;
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    default:
                        a0 a0Var2 = this.b;
                        if (a0Var2.c.b && (r0 = a0Var2.d.b) != null) {
                            z2 = true;
                            break;
                        }
                        z2 = false;
                        return Boolean.valueOf(z2);
                }
            }
        });
    }
}
