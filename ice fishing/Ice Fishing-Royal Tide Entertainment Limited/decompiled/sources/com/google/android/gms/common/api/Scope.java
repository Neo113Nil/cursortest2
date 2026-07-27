package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kotlin.text.CatchingFishRoomKtorToast;
import kotlin.text.CatchingFishToastHiltBundle;
import kotlin.text.CatchingFishViewMVIMVVM;
import kotlin.text.CatchingFishViewStateFlow;

/* loaded from: classes.dex */
public final class Scope extends CatchingFishViewStateFlow implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new CatchingFishRoomKtorToast(4);
    public final String CatchingFishDaggerWebsocket;
    public final int CatchingFishReduxKtor;

    public Scope(String str, int i) {
        CatchingFishToastHiltBundle.CatchingFishOkHttp(str, "scopeUri must not be null or empty");
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.CatchingFishDaggerWebsocket.equals(((Scope) obj).CatchingFishDaggerWebsocket);
    }

    public final int hashCode() {
        return this.CatchingFishDaggerWebsocket.hashCode();
    }

    public final String toString() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int CatchingFishJobScheduler = CatchingFishViewMVIMVVM.CatchingFishJobScheduler(parcel, 20293);
        CatchingFishViewMVIMVVM.CatchingFishMutableLiveData(parcel, 1, 4);
        parcel.writeInt(this.CatchingFishReduxKtor);
        CatchingFishViewMVIMVVM.CatchingFishPayPal(parcel, 2, this.CatchingFishDaggerWebsocket);
        CatchingFishViewMVIMVVM.CatchingFishPayPalService(parcel, CatchingFishJobScheduler);
    }
}
