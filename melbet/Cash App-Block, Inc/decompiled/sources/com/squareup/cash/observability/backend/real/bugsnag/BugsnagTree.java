package com.squareup.cash.observability.backend.real.bugsnag;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class BugsnagTree extends Timber.Tree {
    public final ArrayDeque buffer = new ArrayDeque(101);

    @Override // timber.log.Timber.Tree
    public final void log(int i, String str, String str2) {
        str2.getClass();
        if (i == 2 || i == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder(str2.length() + 16);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ofEpochMilli.getClass();
        String format2 = dateTimeFormatter.format(ofEpochMilli);
        format2.getClass();
        sb.append(format2);
        sb.append(' ');
        sb.append(i != 4 ? i != 5 ? i != 6 ? String.valueOf(i) : "E" : "W" : "I");
        sb.append('\t');
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(str2);
        String sb2 = sb.toString();
        synchronized (this.buffer) {
            this.buffer.addLast(sb2);
            if (this.buffer.size() > 100) {
                this.buffer.removeFirst();
            }
        }
    }
}
