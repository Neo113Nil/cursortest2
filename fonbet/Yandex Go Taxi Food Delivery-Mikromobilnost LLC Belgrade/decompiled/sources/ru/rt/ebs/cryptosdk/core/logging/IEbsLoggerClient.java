package ru.rt.ebs.cryptosdk.core.logging;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.EnumSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J+\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;", "", "", "tag", Constants.KEY_MESSAGE, "Lzy11;", "info", "(Ljava/lang/String;Ljava/lang/String;)V", "text", Constants.KEY_DATA, "", "throwable", "warning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/util/EnumSet;", "Lru/rt/ebs/cryptosdk/core/logging/EventLoggerType;", "getEventLoggerTypes", "()Ljava/util/EnumSet;", "eventLoggerTypes", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IEbsLoggerClient {
    void data(String tag, String text);

    void error(String tag, Throwable throwable);

    EnumSet<EventLoggerType> getEventLoggerTypes();

    void info(String tag, String message);

    void warning(String tag, String message, Throwable throwable);
}
