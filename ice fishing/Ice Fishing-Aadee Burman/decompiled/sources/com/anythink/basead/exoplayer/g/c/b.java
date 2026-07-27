package com.anythink.basead.exoplayer.g.c;

import com.anythink.basead.exoplayer.g.a;

/* loaded from: classes.dex */
public abstract class b implements a.InterfaceC0025a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
