package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rdb;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR;
    public static final a b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final /* synthetic */ b[] h;
    public static final /* synthetic */ rdb i;
    public final int a;

    static {
        b bVar = new b("PRODUCTION", 0, 1);
        c = bVar;
        b bVar2 = new b("TEAM_PRODUCTION", 1, 2);
        d = bVar2;
        b bVar3 = new b("TESTING", 2, 3);
        e = bVar3;
        b bVar4 = new b("TEAM_TESTING", 3, 4);
        f = bVar4;
        b bVar5 = new b("RC", 4, 5);
        g = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        h = bVarArr;
        i = new rdb(bVarArr);
        b = new a(0);
        CREATOR = new com.yandex.passport.api.impl.a(5);
    }

    public b(String str, int i2, int i3) {
        this.a = i3;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
