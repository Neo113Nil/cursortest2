package androidx.camera.camera2.pipe;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.impl.TagBundle;
import java.util.HashMap;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public interface Metadata {

    public final class Key {
        public static final HashMap keys = new HashMap();
        public final String name;

        /* renamed from: type, reason: collision with root package name */
        public final KClass f837type;

        public Key(String str, KClass kClass) {
            this.name = str;
            this.f837type = kClass;
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Metadata.Key("), this.name, ')');
        }
    }

    Object get(Key key);

    Object getOrDefault(Key key, TagBundle tagBundle);
}
