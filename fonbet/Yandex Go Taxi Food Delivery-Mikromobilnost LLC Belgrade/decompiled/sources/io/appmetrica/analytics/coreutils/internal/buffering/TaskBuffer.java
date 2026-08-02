package io.appmetrica.analytics.coreutils.internal.buffering;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/buffering/TaskBuffer;", "T", "", "task", "Lzy11;", "add", "(Ljava/lang/Object;)V", "", "getAndClear", "()Ljava/util/List;", "", "isEmpty", "()Z", "core-utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface TaskBuffer<T> {
    void add(T task);

    List<T> getAndClear();

    boolean isEmpty();
}
