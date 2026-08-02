package androidx.datastore.preferences.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class MutablePreferences$toString$1 extends Lambda implements Function1 {
    public static final MutablePreferences$toString$1 INSTANCE = new MutablePreferences$toString$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Object value = entry.getValue();
        return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder("  "), ((Preferences.Key) entry.getKey()).name, " = ", value instanceof byte[] ? ArraysKt___ArraysKt.joinToString$default((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
