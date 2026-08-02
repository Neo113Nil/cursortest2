package com.bumptech.glide.signature;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class ObjectKey implements Key {
    public final Object object;

    public ObjectKey(Object obj) {
        Util.checkNotNull(obj, "Argument must not be null");
        this.object = obj;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.object.equals(((ObjectKey) obj).object);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.object.hashCode();
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m(new StringBuilder("ObjectKey{object="), this.object, '}');
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(Key.CHARSET));
    }
}
