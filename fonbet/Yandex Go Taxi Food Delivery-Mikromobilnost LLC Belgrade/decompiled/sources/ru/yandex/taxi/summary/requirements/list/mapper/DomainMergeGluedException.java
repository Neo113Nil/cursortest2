package ru.yandex.taxi.summary.requirements.list.mapper;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/mapper/DomainMergeGluedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DomainMergeGluedException extends RuntimeException {
    public DomainMergeGluedException(String str, List list) {
        super("Can't merge " + str + " requirement: " + list);
    }
}
