package androidx.lifecycle.viewmodel.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzh;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ViewModelImpl {
    public volatile boolean isCleared;
    public final zzh lock = new zzh(6);
    public final LinkedHashMap keyToCloseables = new LinkedHashMap();
    public final LinkedHashSet closeables = new LinkedHashSet();

    public static void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m(autoCloseable);
            } catch (Exception e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            }
        }
    }
}
