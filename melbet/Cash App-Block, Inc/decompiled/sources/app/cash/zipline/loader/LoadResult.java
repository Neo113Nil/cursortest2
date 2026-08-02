package app.cash.zipline.loader;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineManifest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LoadResult {

    public final class Failure extends LoadResult {
        public final Exception exception;

        public Failure(Exception exc) {
            exc.getClass();
            this.exception = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Failure(exception=" + this.exception + ")";
        }
    }

    public final class Success extends LoadResult {
        public final long freshAtEpochMs;
        public final ZiplineManifest manifest;
        public final Zipline zipline;

        public Success(Zipline zipline, ZiplineManifest ziplineManifest, long j) {
            zipline.getClass();
            ziplineManifest.getClass();
            this.zipline = zipline;
            this.manifest = ziplineManifest;
            this.freshAtEpochMs = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.zipline, success.zipline) && Intrinsics.areEqual(this.manifest, success.manifest) && this.freshAtEpochMs == success.freshAtEpochMs;
        }

        public final int hashCode() {
            return Long.hashCode(this.freshAtEpochMs) + ((this.manifest.hashCode() + (this.zipline.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(zipline=");
            sb.append(this.zipline);
            sb.append(", manifest=");
            sb.append(this.manifest);
            sb.append(", freshAtEpochMs=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.freshAtEpochMs, ")", sb);
        }
    }
}
