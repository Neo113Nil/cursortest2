package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class Stacktrace implements JsonStream.Streamable {
    public final List trace;

    public Stacktrace(StackTraceElement[] stackTraceElementArr, Collection collection, Logger logger) {
        Boolean bool;
        int min = Math.min(200, stackTraceElementArr.length);
        this.trace = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            Stackframe stackframe = null;
            try {
                String className = stackTraceElement.getClassName();
                String methodName = className.length() > 0 ? className + '.' + stackTraceElement.getMethodName() : stackTraceElement.getMethodName();
                String fileName = stackTraceElement.getFileName();
                String str = fileName == null ? "Unknown" : fileName;
                Integer valueOf = Integer.valueOf(stackTraceElement.getLineNumber());
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (StringsKt__StringsJVMKt.startsWith(className, (String) it.next(), false)) {
                            bool = Boolean.TRUE;
                            break;
                        }
                    }
                }
                bool = null;
                stackframe = new Stackframe(methodName, str, valueOf, bool, null);
            } catch (Exception e) {
                logger.w("Failed to serialize stacktrace", e);
            }
            if (stackframe != null) {
                this.trace.add(stackframe);
            }
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginArray();
        Iterator it = this.trace.iterator();
        while (it.hasNext()) {
            jsonStream.value((Stackframe) it.next());
        }
        jsonStream.endArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public Stacktrace(ArrayList arrayList) {
        this.trace = arrayList.size() >= 200 ? arrayList.subList(0, 200) : arrayList;
    }
}
