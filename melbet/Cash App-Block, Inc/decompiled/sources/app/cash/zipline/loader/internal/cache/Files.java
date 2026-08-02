package app.cash.zipline.loader.internal.cache;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Files {
    public final FileState file_state;
    public final Long fresh_at_epoch_ms;
    public final long id;
    public final long last_used_at_epoch_ms;
    public final String manifest_for_application_name;
    public final String sha256_hex;
    public final long size_bytes;

    public Files(long j, String str, String str2, FileState fileState, long j2, long j3, Long l) {
        str.getClass();
        fileState.getClass();
        this.id = j;
        this.sha256_hex = str;
        this.manifest_for_application_name = str2;
        this.file_state = fileState;
        this.size_bytes = j2;
        this.last_used_at_epoch_ms = j3;
        this.fresh_at_epoch_ms = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Files)) {
            return false;
        }
        Files files = (Files) obj;
        return this.id == files.id && Intrinsics.areEqual(this.sha256_hex, files.sha256_hex) && Intrinsics.areEqual(this.manifest_for_application_name, files.manifest_for_application_name) && this.file_state == files.file_state && this.size_bytes == files.size_bytes && this.last_used_at_epoch_ms == files.last_used_at_epoch_ms && Intrinsics.areEqual(this.fresh_at_epoch_ms, files.fresh_at_epoch_ms);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.sha256_hex);
        String str = this.manifest_for_application_name;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.file_state.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.size_bytes), 31, this.last_used_at_epoch_ms);
        Long l = this.fresh_at_epoch_ms;
        return m2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Files(id=", this.id, ", sha256_hex=", this.sha256_hex);
        m.append(", manifest_for_application_name=");
        m.append(this.manifest_for_application_name);
        m.append(", file_state=");
        m.append(this.file_state);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.size_bytes, ", size_bytes=", ", last_used_at_epoch_ms=", m);
        m.append(this.last_used_at_epoch_ms);
        m.append(", fresh_at_epoch_ms=");
        m.append(this.fresh_at_epoch_ms);
        m.append(")");
        return m.toString();
    }
}
