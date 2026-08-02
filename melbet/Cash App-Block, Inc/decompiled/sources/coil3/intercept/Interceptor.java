package coil3.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.oneformapp.ProfileStore_;

/* loaded from: classes.dex */
public interface Interceptor {
    Object intercept(ProfileStore_ profileStore_, ContinuationImpl continuationImpl);
}
