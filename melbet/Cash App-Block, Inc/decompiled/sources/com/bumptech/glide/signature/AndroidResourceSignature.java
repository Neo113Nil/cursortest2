package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class AndroidResourceSignature implements Key {
    public final Key applicationVersion;
    public final int nightMode;

    public AndroidResourceSignature(int i, Key key) {
        this.nightMode = i;
        this.applicationVersion = key;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidResourceSignature)) {
            return false;
        }
        AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
        return this.nightMode == androidResourceSignature.nightMode && this.applicationVersion.equals(androidResourceSignature.applicationVersion);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.hashCode(this.nightMode, this.applicationVersion);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.applicationVersion.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.nightMode).array());
    }
}
