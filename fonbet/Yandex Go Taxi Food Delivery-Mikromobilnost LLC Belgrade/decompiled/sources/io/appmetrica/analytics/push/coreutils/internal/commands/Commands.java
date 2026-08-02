package io.appmetrica.analytics.push.coreutils.internal.commands;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/Commands;", "", "", "EXTRA_COMMAND", "Ljava/lang/String;", "EXTRA_COMMAND_RECEIVED_TIME", "InitPushService", "ProcessPush", "SendPushToken", "UpdateSystemInfo", "core-utils_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class Commands {
    public static final String EXTRA_COMMAND = "io.appmetrica.analytics.push.extra.COMMAND";
    public static final String EXTRA_COMMAND_RECEIVED_TIME = "io.appmetrica.analytics.push.extra.EXTRA_COMMAND_RECEIVED_TIME";
    public static final Commands INSTANCE = new Commands();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/Commands$InitPushService;", "", "", "COMMAND_ACTION", "Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class InitPushService {
        public static final String COMMAND_ACTION = "io.appmetrica.analytics.push.command.INIT_PUSH_SERVICE";
        public static final InitPushService INSTANCE = new InitPushService();

        private InitPushService() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/Commands$ProcessPush;", "", "", "COMMAND_ACTION", "Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class ProcessPush {
        public static final String COMMAND_ACTION = "io.appmetrica.analytics.push.command.PROCESS_PUSH";
        public static final ProcessPush INSTANCE = new ProcessPush();

        private ProcessPush() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/Commands$SendPushToken;", "", "", "INIT_PUSH_TOKEN_COMMAND_ACTION", "Ljava/lang/String;", "UPDATE_PUSH_TOKEN_COMMAND_ACTION", "SEND_PUSH_TOKEN_ON_REFRESH_COMMAND_ACTION", "SEND_PUSH_TOKEN_MANUALLY_COMMAND_ACTION", "EXTRA_INFO", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class SendPushToken {
        public static final String EXTRA_INFO = "io.appmetrica.analytics.push.extra.EXTRA_INFO";
        public static final String INIT_PUSH_TOKEN_COMMAND_ACTION = "io.appmetrica.analytics.push.command.INIT_PUSH_TOKEN";
        public static final SendPushToken INSTANCE = new SendPushToken();
        public static final String SEND_PUSH_TOKEN_MANUALLY_COMMAND_ACTION = "io.appmetrica.analytics.push.command.SEND_PUSH_TOKEN_MANUALLY";
        public static final String SEND_PUSH_TOKEN_ON_REFRESH_COMMAND_ACTION = "io.appmetrica.analytics.push.command.SEND_PUSH_TOKEN_ON_REFRESH";
        public static final String UPDATE_PUSH_TOKEN_COMMAND_ACTION = "io.appmetrica.analytics.push.command.UPDATE_PUSH_TOKEN";

        private SendPushToken() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/appmetrica/analytics/push/coreutils/internal/commands/Commands$UpdateSystemInfo;", "", "", "COMMAND_ACTION", "Ljava/lang/String;", "EXTRA_INFO", "core-utils_release"}, k = 1, mv = {1, 6, 0})
    public static final class UpdateSystemInfo {
        public static final String COMMAND_ACTION = "io.appmetrica.analytics.push.command.UPDATE_SYSTEM_INFO";
        public static final String EXTRA_INFO = "io.appmetrica.analytics.push.extra.EXTRA_INFO";
        public static final UpdateSystemInfo INSTANCE = new UpdateSystemInfo();

        private UpdateSystemInfo() {
        }
    }

    private Commands() {
    }
}
