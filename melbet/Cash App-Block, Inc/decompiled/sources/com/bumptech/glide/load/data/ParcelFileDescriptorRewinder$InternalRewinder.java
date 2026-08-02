package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* loaded from: classes4.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor parcelFileDescriptor;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.parcelFileDescriptor = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.parcelFileDescriptor;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
