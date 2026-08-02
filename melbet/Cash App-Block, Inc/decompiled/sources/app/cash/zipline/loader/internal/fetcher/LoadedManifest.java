package app.cash.zipline.loader.internal.fetcher;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.zipline.ZiplineManifest;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class LoadedManifest {
    public final long freshAtEpochMs;
    public final ZiplineManifest manifest;
    public final ByteString manifestBytes;

    public LoadedManifest(ByteString byteString, ZiplineManifest ziplineManifest, long j) {
        ziplineManifest.getClass();
        this.manifestBytes = byteString;
        this.manifest = ziplineManifest;
        this.freshAtEpochMs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadedManifest)) {
            return false;
        }
        LoadedManifest loadedManifest = (LoadedManifest) obj;
        return this.manifestBytes.equals(loadedManifest.manifestBytes) && Intrinsics.areEqual(this.manifest, loadedManifest.manifest) && this.freshAtEpochMs == loadedManifest.freshAtEpochMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.freshAtEpochMs) + ((this.manifest.hashCode() + (this.manifestBytes.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadedManifest(manifestBytes=");
        sb.append(this.manifestBytes);
        sb.append(", manifest=");
        sb.append(this.manifest);
        sb.append(", freshAtEpochMs=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.freshAtEpochMs, ")", sb);
    }
}
