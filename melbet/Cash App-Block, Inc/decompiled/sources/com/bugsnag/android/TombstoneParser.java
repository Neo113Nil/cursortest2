package com.bugsnag.android;

import com.bugsnag.android.repackaged.server.os.TombstoneProtos$BacktraceFrame;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$FD;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$LogBuffer;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$LogMessage;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$Thread;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$Tombstone;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import okio.Utf8;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes.dex */
public final class TombstoneParser {
    public final boolean includeLogcat;
    public final boolean listOpenFds;
    public final Logger logger;

    public TombstoneParser(Logger logger, boolean z, boolean z2) {
        this.logger = logger;
        this.listOpenFds = z;
        this.includeLogcat = z2;
    }

    public final void parse(InputStream inputStream, TombstoneEventEnhancer$invoke$1 tombstoneEventEnhancer$invoke$1, TombstoneEventEnhancer$invoke$2 tombstoneEventEnhancer$invoke$2, TombstoneEventEnhancer$invoke$1 tombstoneEventEnhancer$invoke$12, TombstoneEventEnhancer$invoke$1 tombstoneEventEnhancer$invoke$13) {
        String str;
        try {
            TombstoneProtos$Tombstone parseFrom = TombstoneProtos$Tombstone.parseFrom(inputStream);
            inputStream.close();
            if (parseFrom == null) {
                return;
            }
            String abortMessage = parseFrom.getAbortMessage();
            if (abortMessage != null && abortMessage.length() != 0) {
                tombstoneEventEnhancer$invoke$13.invoke(parseFrom.getAbortMessage());
            }
            for (TombstoneProtos$Thread tombstoneProtos$Thread : parseFrom.getThreadsMap().values()) {
                List<TombstoneProtos$BacktraceFrame> currentBacktraceList = tombstoneProtos$Thread.getCurrentBacktraceList();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(currentBacktraceList, 10));
                for (TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame : currentBacktraceList) {
                    Stackframe stackframe = new Stackframe(tombstoneProtos$BacktraceFrame.getFunctionName(), tombstoneProtos$BacktraceFrame.getFileName(), Long.valueOf(tombstoneProtos$BacktraceFrame.getRelPc()), null, null);
                    stackframe.symbolAddress = Long.valueOf(tombstoneProtos$BacktraceFrame.getFunctionOffset());
                    stackframe.loadAddress = Long.valueOf(tombstoneProtos$BacktraceFrame.getFileMapOffset());
                    stackframe.codeIdentifier = tombstoneProtos$BacktraceFrame.getBuildId();
                    arrayList.add(stackframe);
                }
                Thread thread = new Thread(String.valueOf(tombstoneProtos$Thread.getId()), tombstoneProtos$Thread.getName(), ErrorType.C, 7, this.logger);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            thread.logger.e("Invalid null value supplied to thread.stacktrace, ignoring");
                            break;
                        }
                    } else {
                        thread.impl.stacktrace = arrayList;
                        break;
                    }
                }
                tombstoneEventEnhancer$invoke$1.invoke(thread);
            }
            if (this.listOpenFds) {
                for (TombstoneProtos$FD tombstoneProtos$FD : parseFrom.getOpenFdsList()) {
                    tombstoneEventEnhancer$invoke$2.invoke(Integer.valueOf(tombstoneProtos$FD.getFd()), tombstoneProtos$FD.getPath(), tombstoneProtos$FD.getOwner());
                }
            }
            if (this.includeLogcat) {
                List<TombstoneProtos$LogBuffer> logBuffersList = parseFrom.getLogBuffersList();
                StringBuilder sb = new StringBuilder();
                Iterator<T> it2 = logBuffersList.iterator();
                while (it2.hasNext()) {
                    for (TombstoneProtos$LogMessage tombstoneProtos$LogMessage : ((TombstoneProtos$LogBuffer) it2.next()).getLogsList()) {
                        sb.append(tombstoneProtos$LogMessage.getTimestamp());
                        sb.append(' ');
                        sb.append(tombstoneProtos$LogMessage.getTid());
                        sb.append(' ');
                        sb.append(tombstoneProtos$LogMessage.getTag());
                        sb.append(' ');
                        switch (tombstoneProtos$LogMessage.getPriority()) {
                            case 2:
                                str = GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY;
                                break;
                            case 3:
                                str = "D";
                                break;
                            case 4:
                                str = "I";
                                break;
                            case 5:
                                str = "W";
                                break;
                            case 6:
                                str = "E";
                                break;
                            case 7:
                                str = GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS;
                                break;
                            default:
                                str = String.valueOf(tombstoneProtos$LogMessage.getPriority());
                                break;
                        }
                        sb.append(str);
                        sb.append(' ');
                        sb.append(tombstoneProtos$LogMessage.getMessage());
                        sb.append('\n');
                    }
                }
                tombstoneEventEnhancer$invoke$12.invoke(sb.toString());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }
}
