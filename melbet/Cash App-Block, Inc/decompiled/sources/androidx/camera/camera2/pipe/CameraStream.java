package androidx.camera.camera2.pipe;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class CameraStream {
    public final int id;
    public final ArrayList outputs;

    public final class Config {
        public final List outputs;

        public Config(List list) {
            list.getClass();
            this.outputs = list;
            OutputStream$Config outputStream$Config = (OutputStream$Config) CollectionsKt.first(list);
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((OutputStream$Config) it.next()).f838format != outputStream$Config.f838format) {
                    a$$ExternalSyntheticBUOutline0.m$1("All outputs must have the same format!");
                    throw null;
                }
            }
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("CameraStream.Config(outputs="), this.outputs, ", imageSourceConfig=null)");
        }
    }

    public CameraStream(int i, ArrayList arrayList) {
        this.id = i;
        this.outputs = arrayList;
    }

    public final String toString() {
        return StreamId.m57toStringimpl(this.id);
    }
}
