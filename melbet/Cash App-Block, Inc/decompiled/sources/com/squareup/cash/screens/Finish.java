package com.squareup.cash.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import app.cash.broadway.screen.Screen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Finish implements Screen {
    public static final Parcelable.Creator<Finish> CREATOR = new FragmentState.AnonymousClass1(1);
    public final Object result;

    public Finish(Object obj) {
        this.result = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Finish) && Intrinsics.areEqual(this.result, ((Finish) obj).result);
    }

    public final int hashCode() {
        Object obj = this.result;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Finish(result=", ")", this.result);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable((Parcelable) this.result, 0);
    }
}
