package com.bugsnag.android;

import com.bugsnag.android.internal.TaskType;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class LibraryLoader {
    public final AtomicBoolean attemptedLoad = new AtomicBoolean();
    public boolean loaded = false;

    public final boolean loadLibrary(final String str, final Client client, final OnErrorCallback onErrorCallback) {
        try {
            client.bgTaskService.submitTask(TaskType.IO, new Runnable() { // from class: com.bugsnag.android.LibraryLoader.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    LibraryLoader libraryLoader = LibraryLoader.this;
                    if (libraryLoader.attemptedLoad.getAndSet(true)) {
                        return;
                    }
                    try {
                        try {
                            System.loadLibrary(str2);
                            libraryLoader.loaded = true;
                        } catch (UnsatisfiedLinkError unused) {
                            System.loadLibrary(str2);
                            libraryLoader.loaded = true;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        client.notify(e, onErrorCallback);
                    }
                }
            }).get();
            return this.loaded;
        } catch (Throwable unused) {
            return false;
        }
    }
}
