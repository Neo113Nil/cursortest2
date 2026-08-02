package com.yandex.passport.common.bitflag;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.n;
import defpackage.get;
import defpackage.het;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new com.yandex.passport.api.impl.a(4);
    public final a a;

    public b(Iterable iterable) {
        iterable.getClass();
        a aVar = new a(0);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            int i = ((n) ((Enum) it.next())).a;
            int i2 = aVar.a;
            get getVar = het.b;
            aVar.a = (1 << i) | i2;
        }
        this.a = aVar;
    }

    public final void a(Enum r3, boolean z) {
        r3.getClass();
        a aVar = this.a;
        if (z) {
            int i = ((n) r3).a;
            int i2 = aVar.a;
            get getVar = het.b;
            aVar.a = (1 << i) | i2;
            return;
        }
        int i3 = ((n) r3).a;
        int i4 = aVar.a;
        get getVar2 = het.b;
        aVar.a = (~(1 << i3)) & i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.d(((b) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }

    public b(a aVar) {
        aVar.getClass();
        this.a = aVar;
    }
}
