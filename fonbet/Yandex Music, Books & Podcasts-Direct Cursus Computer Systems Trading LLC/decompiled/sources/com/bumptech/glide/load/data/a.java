package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.oa7;

/* loaded from: classes.dex */
public final class a implements oa7 {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.oa7
    public final Object a() {
        return this.a.rewind();
    }

    @Override // defpackage.oa7
    public final void b() {
    }

    public final ParcelFileDescriptor c() {
        return this.a.rewind();
    }
}
