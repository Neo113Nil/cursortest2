package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.core.impl.Config;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntriesList;
import kotlinx.coroutines.Deferred;

/* loaded from: classes3.dex */
public interface UseCaseCameraRequestControl {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type CAMERA2_CAMERA_CONTROL;
        public static final Type DEFAULT;
        public static final Type SESSION_CONFIG;

        static {
            Type type2 = new Type("SESSION_CONFIG", 0);
            SESSION_CONFIG = type2;
            Type type3 = new Type("DEFAULT", 1);
            DEFAULT = type3;
            Type type4 = new Type("CAMERA2_CAMERA_CONTROL", 2);
            CAMERA2_CAMERA_CONTROL = type4;
            Type[] typeArr = {type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static Deferred setParametersAsync$default(UseCaseCameraRequestControl useCaseCameraRequestControl, Map map) {
        Type type2 = Type.SESSION_CONFIG;
        return useCaseCameraRequestControl.setParametersAsync(map, UseCaseCameraKt.defaultOptionPriority);
    }

    Object awaitSurfaceSetup(SuspendLambda suspendLambda);

    Deferred cancelFocusAndMeteringAsync();

    void close();

    List issueSingleCaptureAsync(int i, int i2, int i3, ArrayList arrayList);

    Deferred removeParametersAsync(List list);

    Deferred setParametersAsync(Map map, Config.OptionPriority optionPriority);

    /* renamed from: setTorchOffAsync-MtizInI */
    Deferred mo33setTorchOffAsyncMtizInI(int i);

    Deferred setTorchOnAsync();

    /* renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    Deferred mo34startFocusAndMeteringAsyncNxRnBj4(List list, List list2, List list3, Lock3ABehavior lock3ABehavior, AeMode aeMode, long j);

    Deferred submitParameters(Map map, Type type2, Config.OptionPriority optionPriority);

    Deferred update3aRegions(List list, List list2, List list3);

    Deferred updateCamera2ConfigAsync(Camera2ImplConfig camera2ImplConfig, Map map);

    Deferred updateRepeatingRequestAsync(LinkedHashSet linkedHashSet, boolean z);
}
