package defpackage;

import com.google.protobuf.n;
import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;

/* loaded from: classes8.dex */
public final class scy extends n implements ucy {
    public final void c(Iterable iterable) {
        copyOnWrite();
        ((tcy) this.instance).addAllHistogramEvent(iterable);
    }

    public final void d(LibraryProtos$LibraryProfileProto libraryProtos$LibraryProfileProto) {
        copyOnWrite();
        ((tcy) this.instance).setLibraryProfile(libraryProtos$LibraryProfileProto);
    }
}
