package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f24203a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f24203a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.f24203a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e9) {
            throw new IOException(e9);
        }
    }
}
