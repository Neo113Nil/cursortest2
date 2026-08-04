package com.gamericefishpro.space.d9;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.gamericefishpro.space.f9.a {
    public final com.gamericefishpro.space.c9.a K(com.gamericefishpro.space.c9.b bVar, String str, int i, com.gamericefishpro.space.c9.b bVar2) {
        Parcel parcelH = H();
        com.gamericefishpro.space.h9.i.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.gamericefishpro.space.h9.i.b(parcelH, bVar2);
        Parcel parcelF = F(parcelH, 2);
        com.gamericefishpro.space.c9.a aVarF = com.gamericefishpro.space.c9.b.F(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarF;
    }

    public final com.gamericefishpro.space.c9.a L(com.gamericefishpro.space.c9.b bVar, String str, int i, com.gamericefishpro.space.c9.b bVar2) {
        Parcel parcelH = H();
        com.gamericefishpro.space.h9.i.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.gamericefishpro.space.h9.i.b(parcelH, bVar2);
        Parcel parcelF = F(parcelH, 3);
        com.gamericefishpro.space.c9.a aVarF = com.gamericefishpro.space.c9.b.F(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarF;
    }
}
