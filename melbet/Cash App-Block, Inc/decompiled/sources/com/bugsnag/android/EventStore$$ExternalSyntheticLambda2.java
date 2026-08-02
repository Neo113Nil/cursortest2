package com.bugsnag.android;

import curtains.WindowsKt$onNextDraw$1;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes.dex */
public final /* synthetic */ class EventStore$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EventStore f$0;

    public /* synthetic */ EventStore$$ExternalSyntheticLambda2(EventStore eventStore, int i) {
        this.$r8$classId = i;
        this.f$0 = eventStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        int i = this.$r8$classId;
        EventStore eventStore = this.f$0;
        switch (i) {
            case 0:
                Logger logger = eventStore.logger;
                ArrayList findStoredFiles = eventStore.findStoredFiles();
                FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(findStoredFiles, 1), new WindowsKt$onNextDraw$1(eventStore, 15)));
                if (filteringSequence$iterator$1.hasNext()) {
                    next = filteringSequence$iterator$1.next();
                    while (filteringSequence$iterator$1.hasNext()) {
                        Object next2 = filteringSequence$iterator$1.next();
                        File file = (File) next;
                        File file2 = (File) next2;
                        if (((file == null && file2 == null) ? 0 : file == null ? 1 : file2 == null ? -1 : file.compareTo(file2)) < 0) {
                            next = next2;
                        }
                    }
                } else {
                    next = null;
                }
                File file3 = (File) next;
                if (file3 != null) {
                    findStoredFiles.remove(file3);
                }
                eventStore.cancelQueuedFiles(findStoredFiles);
                if (file3 != null) {
                    logger.i("Attempting to send the most recent launch crash report");
                    eventStore.flushReports(CollectionsKt__CollectionsJVMKt.listOf(file3));
                    logger.i("Continuing with Bugsnag initialisation");
                } else {
                    logger.d("No startupcrash events to flush to Bugsnag.");
                }
                eventStore.notifyEventQueueEmpty();
                break;
            default:
                ArrayList findStoredFiles2 = eventStore.findStoredFiles();
                if (findStoredFiles2.isEmpty()) {
                    eventStore.logger.d("No regular events to flush to Bugsnag.");
                }
                eventStore.flushReports(findStoredFiles2);
                eventStore.notifyEventQueueEmpty();
                break;
        }
    }
}
