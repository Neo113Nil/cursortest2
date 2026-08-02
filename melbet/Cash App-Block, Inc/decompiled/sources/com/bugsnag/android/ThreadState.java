package com.bugsnag.android;

import android.os.Build;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ThreadState implements JsonStream.Streamable {
    public final ArrayList threads;

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public ThreadState(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public static final Thread captureThreadTrace$toBugsnagThread(ThreadState threadState, java.lang.Thread thread, Throwable th, boolean z, Collection collection, Logger logger, java.lang.Thread thread2) {
        int i = 1;
        boolean z2 = getThreadId(thread2) == getThreadId(thread);
        Stacktrace stacktrace = new Stacktrace(z2 ? (th == null || !z) ? thread.getStackTrace() : th.getStackTrace() : thread2.getStackTrace(), collection, logger);
        String valueOf = String.valueOf(getThreadId(thread2));
        String name = thread2.getName();
        ErrorType errorType = ErrorType.ANDROID;
        switch (Thread.AnonymousClass1.$SwitchMap$java$lang$Thread$State[thread2.getState().ordinal()]) {
            case 1:
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 7;
                break;
        }
        return new Thread(valueOf, name, errorType, z2, i, stacktrace, logger);
    }

    public static long getThreadId(java.lang.Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginArray();
        Iterator it = this.threads.iterator();
        while (it.hasNext()) {
            jsonStream.value((Thread) it.next());
        }
        jsonStream.endArray();
    }
}
