package n8;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface b {
    <T> List<T> getAllServices(Class<T> cls);

    <T> T getService(Class<T> cls);

    <T> T getServiceOrNull(Class<T> cls);

    <T> boolean hasService(Class<T> cls);
}
