package app.cash.zipline.loader;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ZiplineFile {
    public final ByteString quickjsBytecode;
    public final int ziplineVersion;

    public abstract class Companion {
        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewFamilySafetyEducationHub.deepLinkSpecs;
        }

        public static ZiplineFile toZiplineFile(ByteString byteString) {
            byteString.getClass();
            Buffer buffer = new Buffer();
            buffer.m4333write(byteString);
            if (!Intrinsics.areEqual(buffer.readByteString(8L), ZiplineFileKt.MAGIC_PREFIX)) {
                a$$ExternalSyntheticBUOutline0.m$4("not a zipline file");
                return null;
            }
            int readInt = buffer.readInt();
            int i = ZiplineFileKt.CURRENT_ZIPLINE_VERSION;
            if (readInt != i) {
                a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(readInt, i, "unsupported version [version=", "][currentVersion=", "]"));
                return null;
            }
            ByteString byteString2 = null;
            while (!buffer.exhausted()) {
                int readInt2 = buffer.readInt();
                int readInt3 = buffer.readInt();
                if (readInt2 != ZiplineFileKt.SECTION_HEADER_QUICKJS_BYTECODE) {
                    buffer.skip(readInt3);
                } else {
                    if (byteString2 != null) {
                        a$$ExternalSyntheticBUOutline0.m$4("multiple QuickJS bytecode sections");
                        return null;
                    }
                    byteString2 = buffer.readByteString(readInt3);
                }
            }
            if (byteString2 != null) {
                return new ZiplineFile(readInt, byteString2);
            }
            a$$ExternalSyntheticBUOutline0.m$4("QuickJS bytecode section missing");
            return null;
        }
    }

    public ZiplineFile(int i, ByteString byteString) {
        this.ziplineVersion = i;
        this.quickjsBytecode = byteString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZiplineFile)) {
            return false;
        }
        ZiplineFile ziplineFile = (ZiplineFile) obj;
        return this.ziplineVersion == ziplineFile.ziplineVersion && this.quickjsBytecode.equals(ziplineFile.quickjsBytecode);
    }

    public final int hashCode() {
        return this.quickjsBytecode.hashCode() + (Integer.hashCode(this.ziplineVersion) * 31);
    }

    public final String toString() {
        return "ZiplineFile(ziplineVersion=" + this.ziplineVersion + ", quickjsBytecode=" + this.quickjsBytecode + ")";
    }
}
