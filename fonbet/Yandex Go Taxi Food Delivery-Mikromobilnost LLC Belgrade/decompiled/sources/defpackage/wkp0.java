package defpackage;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public interface wkp0 {
    boolean a();

    default boolean b() {
        return true;
    }

    float c(float f);

    Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation);

    default boolean e() {
        return true;
    }
}
