package ru.yandex.video.m3.preload_manager;

import java.util.Comparator;
import ru.yandex.video.m3.preload_manager.PreloadRequestsQueue;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int priorityComparator$lambda$0;
        priorityComparator$lambda$0 = PreloadRequestsQueue.priorityComparator$lambda$0((PreloadRequestsQueue.PriorityHolder) obj, (PreloadRequestsQueue.PriorityHolder) obj2);
        return priorityComparator$lambda$0;
    }
}
