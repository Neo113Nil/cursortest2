package com.gamericefishpro.space.n9;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.gamericefishpro.space.f9.a implements j0 {
    @Override // com.gamericefishpro.space.n9.j0
    public final void t(List list) {
        Parcel parcelH = H();
        parcelH.writeTypedList(list);
        J(parcelH);
    }
}
