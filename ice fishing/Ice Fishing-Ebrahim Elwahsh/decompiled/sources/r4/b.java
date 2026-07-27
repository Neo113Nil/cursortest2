package r4;

import java.util.List;

/* loaded from: classes2.dex */
public interface b {
    <T> List<T> getAllServices(Class<T> cls);

    <T> T getService(Class<T> cls);

    <T> T getServiceOrNull(Class<T> cls);

    <T> boolean hasService(Class<T> cls);
}
