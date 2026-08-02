package ru.rt.ebs.cryptosdk.core.logging;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010&\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "", "", "Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;", "loggerClient", "init", "([Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "Lzy11;", "release", "()V", "addClient", "(Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "removeClient", "", "tag", "setTag", "(Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", Constants.KEY_MESSAGE, "info", "(Ljava/lang/String;Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "text", Constants.KEY_DATA, "", "throwable", "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "error", "(Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "", "getHasInfo", "()Z", "hasInfo", "getHasData", "hasData", "getHasWarning", "hasWarning", "getHasError", "hasError", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEbsLogger {
    IEbsLogger addClient(IEbsLoggerClient loggerClient);

    IEbsLogger data(String text);

    IEbsLogger data(String tag, String text);

    IEbsLogger error(String tag, Throwable throwable);

    IEbsLogger error(Throwable throwable);

    boolean getHasData();

    boolean getHasError();

    boolean getHasInfo();

    boolean getHasWarning();

    IEbsLogger info(String message);

    IEbsLogger info(String tag, String message);

    IEbsLogger init(IEbsLoggerClient... loggerClient);

    void release();

    IEbsLogger removeClient(IEbsLoggerClient loggerClient);

    IEbsLogger setTag(String tag);

    IEbsLogger warning(String tag, String message, Throwable throwable);

    IEbsLogger warning(String message, Throwable throwable);
}
