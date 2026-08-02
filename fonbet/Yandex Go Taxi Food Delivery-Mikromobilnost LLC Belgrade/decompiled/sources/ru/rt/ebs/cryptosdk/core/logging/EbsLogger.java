package ru.rt.ebs.cryptosdk.core.logging;

import defpackage.evu0;
import defpackage.tls;
import defpackage.ycc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0082\b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001bJ\u001f\u0010 \u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001bJ\u001d\u0010!\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b!\u0010$J!\u0010!\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b!\u0010%J)\u0010!\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b!\u0010&J\u0017\u0010'\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010$J\u001f\u0010'\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u000b0*j\b\u0012\u0004\u0012\u00020\u000b`+8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010\u0003R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00103\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u00108\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00104R\u0014\u0010:\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00104R\u0014\u0010<\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00104¨\u0006="}, d2 = {"Lru/rt/ebs/cryptosdk/core/logging/EbsLogger;", "Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "<init>", "()V", "Lru/rt/ebs/cryptosdk/core/logging/EventLoggerType;", "eventLoggerType", "", "hasEventLoggerType", "(Lru/rt/ebs/cryptosdk/core/logging/EventLoggerType;)Z", "eventType", "Lkotlin/Function1;", "Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;", "Lzy11;", "action", "log", "(Lru/rt/ebs/cryptosdk/core/logging/EventLoggerType;Ltls;)V", "", "loggerClient", "init", "([Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "release", "addClient", "(Lru/rt/ebs/cryptosdk/core/logging/IEbsLoggerClient;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "removeClient", "", "tag", "setTag", "(Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", Constants.KEY_MESSAGE, "info", "(Ljava/lang/String;Ljava/lang/String;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "text", Constants.KEY_DATA, "warning", "", "throwable", "(Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "(Ljava/lang/String;Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lru/rt/ebs/cryptosdk/core/logging/IEbsLogger;", "error", "DEFAULT_TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "LOGGER_CLIENTS", "Ljava/util/ArrayList;", "getLOGGER_CLIENTS$annotations", "", "loggerClients", "Ljava/util/List;", "currentTag", "isDebug", "()Z", "getHasInfo", "hasInfo", "getHasData", "hasData", "getHasWarning", "hasWarning", "getHasError", "hasError", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EbsLogger implements IEbsLogger {
    public static final EbsLogger INSTANCE = new EbsLogger();
    private static final ArrayList<IEbsLoggerClient> LOGGER_CLIENTS = new ArrayList<>();
    private static volatile List<? extends IEbsLoggerClient> loggerClients = EmptyList.a;
    private static final String DEFAULT_TAG = "EBS";
    private static String currentTag = DEFAULT_TAG;

    private EbsLogger() {
    }

    private static /* synthetic */ void getLOGGER_CLIENTS$annotations() {
    }

    private final boolean hasEventLoggerType(EventLoggerType eventLoggerType) {
        List<? extends IEbsLoggerClient> list = loggerClients;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((IEbsLoggerClient) it.next()).getEventLoggerTypes().contains(eventLoggerType)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isDebug() {
        return false;
    }

    private final void log(EventLoggerType eventType, tls action) {
        for (IEbsLoggerClient iEbsLoggerClient : loggerClients) {
            if (iEbsLoggerClient.getEventLoggerTypes().contains(eventType)) {
                action.invoke(iEbsLoggerClient);
            }
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger addClient(IEbsLoggerClient loggerClient) {
        ArrayList<IEbsLoggerClient> arrayList = LOGGER_CLIENTS;
        synchronized (arrayList) {
            try {
                if (!arrayList.contains(loggerClient)) {
                    arrayList.add(loggerClient);
                }
                loggerClients = a.J0(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger data(String tag, String text) {
        if (isDebug()) {
            EventLoggerType eventLoggerType = EventLoggerType.DATA;
            for (IEbsLoggerClient iEbsLoggerClient : loggerClients) {
                if (iEbsLoggerClient.getEventLoggerTypes().contains(eventLoggerType)) {
                    iEbsLoggerClient.data(tag, text);
                }
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger error(String tag, Throwable throwable) {
        EventLoggerType eventLoggerType = EventLoggerType.ERROR;
        for (IEbsLoggerClient iEbsLoggerClient : loggerClients) {
            if (iEbsLoggerClient.getEventLoggerTypes().contains(eventLoggerType)) {
                iEbsLoggerClient.error(tag, throwable);
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public boolean getHasData() {
        return hasEventLoggerType(EventLoggerType.DATA);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public boolean getHasError() {
        return hasEventLoggerType(EventLoggerType.ERROR);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public boolean getHasInfo() {
        return hasEventLoggerType(EventLoggerType.INFO);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public boolean getHasWarning() {
        return hasEventLoggerType(EventLoggerType.WARNING);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger info(String tag, String message) {
        if (isDebug()) {
            EventLoggerType eventLoggerType = EventLoggerType.INFO;
            for (IEbsLoggerClient iEbsLoggerClient : loggerClients) {
                if (iEbsLoggerClient.getEventLoggerTypes().contains(eventLoggerType)) {
                    iEbsLoggerClient.info(tag, message);
                }
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger init(IEbsLoggerClient... loggerClient) {
        ArrayList<IEbsLoggerClient> arrayList = LOGGER_CLIENTS;
        synchronized (arrayList) {
            ycc.t(arrayList, loggerClient);
            loggerClients = a.J0(arrayList);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public void release() {
        ArrayList<IEbsLoggerClient> arrayList = LOGGER_CLIENTS;
        synchronized (arrayList) {
            arrayList.clear();
            loggerClients = EmptyList.a;
        }
        currentTag = DEFAULT_TAG;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger removeClient(IEbsLoggerClient loggerClient) {
        ArrayList<IEbsLoggerClient> arrayList = LOGGER_CLIENTS;
        synchronized (arrayList) {
            arrayList.remove(loggerClient);
            loggerClients = a.J0(arrayList);
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger setTag(String tag) {
        if (evu0.J(tag)) {
            tag = DEFAULT_TAG;
        }
        currentTag = tag;
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger warning(String tag, String message, Throwable throwable) {
        EventLoggerType eventLoggerType = EventLoggerType.WARNING;
        for (IEbsLoggerClient iEbsLoggerClient : loggerClients) {
            if (iEbsLoggerClient.getEventLoggerTypes().contains(eventLoggerType)) {
                iEbsLoggerClient.warning(tag, message, throwable);
            }
        }
        return this;
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger error(Throwable throwable) {
        return error(currentTag, throwable);
    }

    public final IEbsLogger warning(String tag, String message) {
        return warning(tag, message, null);
    }

    public final IEbsLogger warning(Throwable throwable) {
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        return warning(message, throwable);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger warning(String message, Throwable throwable) {
        return warning(currentTag, message, throwable);
    }

    public final IEbsLogger warning(String message) {
        return warning(message, (Throwable) null);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger data(String text) {
        return data(currentTag, text);
    }

    @Override // ru.rt.ebs.cryptosdk.core.logging.IEbsLogger
    public IEbsLogger info(String message) {
        return info(currentTag, message);
    }
}
