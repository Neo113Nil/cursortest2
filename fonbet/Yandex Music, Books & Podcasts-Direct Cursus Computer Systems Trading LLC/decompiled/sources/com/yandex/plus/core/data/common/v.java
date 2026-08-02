package com.yandex.plus.core.data.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.k;
import defpackage.j5m;
import defpackage.u7g;
import defpackage.vhp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class v<T extends k> implements Parcelable {
    public static final j5m c;
    public final k a;
    public final k b;

    @NotNull
    public static final u Companion = new u();

    @NotNull
    public static final Parcelable.Creator<v<?>> CREATOR = new com.yandex.plus.core.benchmark.g(8);

    static {
        j5m j5mVar = new j5m("com.yandex.plus.core.data.common.PlusThemedColor", null, 2);
        j5mVar.k("light", false);
        j5mVar.k("dark", false);
        c = j5mVar;
    }

    public /* synthetic */ v(int i, k kVar, k kVar2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, c);
            throw null;
        }
        this.a = kVar;
        this.b = kVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.a, vVar.a) && Intrinsics.d(this.b, vVar.b);
    }

    public final int hashCode() {
        k kVar = this.a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.b;
        return hashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    public final String toString() {
        return "PlusThemedColor(light=" + this.a + ", dark=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public v(k kVar, k kVar2) {
        this.a = kVar;
        this.b = kVar2;
    }
}
