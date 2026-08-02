package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class gc implements Function0 {
    public static final gc a = new gc();

    public static String a() {
        return Recorder$$ExternalSyntheticOutline2.m("Unsupported type for map deserialization: ", Reflection.factory.getOrCreateKotlinClass(Long.class).getSimpleName());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}
