package U5;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class c {
    public static final String IDENTITY_NAME_SPACE = "identity";

    public static final boolean hasOneSignalId(b bVar) {
        h.e(bVar, "<this>");
        return ((a) bVar.getModel()).hasProperty("onesignal_id");
    }
}
