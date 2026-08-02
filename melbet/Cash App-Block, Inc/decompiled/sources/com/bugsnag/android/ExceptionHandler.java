package com.bugsnag.android;

import android.os.StrictMode;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    public final Client client;
    public final Logger logger;
    public final StrictModeHandler strictModeHandler = new StrictModeHandler();
    public boolean enabled = true;
    public final Thread.UncaughtExceptionHandler originalHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    public ExceptionHandler(Client client, Logger logger) {
        this.client = client;
        this.logger = logger;
    }

    public final void forwardToOriginalHandler(java.lang.Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.originalHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            this.logger.w("Exception", th);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, Throwable th) {
        String str;
        String str2;
        StrictModeHandler strictModeHandler = this.strictModeHandler;
        Client client = this.client;
        try {
            if (this.enabled && !client.immutableConfig.shouldDiscardError(th)) {
                strictModeHandler.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Throwable th2 = th; th2 != null && linkedHashSet.add(th2); th2 = th2.getCause()) {
                }
                boolean startsWith = ((Throwable) CollectionsKt.toList(linkedHashSet).get(r0.size() - 1)).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
                Metadata metadata = new Metadata(0);
                if (startsWith) {
                    String message = th.getMessage();
                    if (TextUtils.isEmpty(message)) {
                        throw new IllegalArgumentException();
                    }
                    int lastIndexOf = message.lastIndexOf("violation=");
                    if (lastIndexOf != -1) {
                        String replace = message.substring(lastIndexOf).replace("violation=", "");
                        if (TextUtils.isDigitsOnly(replace)) {
                            str2 = (String) StrictModeHandler.POLICY_CODE_MAP.get(Integer.valueOf(replace));
                            Metadata metadata2 = new Metadata(0);
                            metadata2.addMetadata("StrictMode", "Violation", str2);
                            str = str2;
                            metadata = metadata2;
                        }
                    }
                    str2 = null;
                    Metadata metadata22 = new Metadata(0);
                    metadata22.addMetadata("StrictMode", "Violation", str2);
                    str = str2;
                    metadata = metadata22;
                } else {
                    str = null;
                }
                String str3 = startsWith ? "strictMode" : "unhandledException";
                if (startsWith) {
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                    client.notifyUnhandledException(th, metadata, str3, str);
                    StrictMode.setThreadPolicy(threadPolicy);
                } else {
                    client.notifyUnhandledException(th, metadata, str3, null);
                }
                forwardToOriginalHandler(thread, th);
                return;
            }
            forwardToOriginalHandler(thread, th);
        } catch (Throwable unused) {
            forwardToOriginalHandler(thread, th);
        }
    }
}
