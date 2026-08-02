package com.fillr.featuretoggle.strategy;

/* loaded from: classes4.dex */
public final class DevKeyStrategy {
    public final /* synthetic */ int $r8$classId;

    public final String getName() {
        switch (this.$r8$classId) {
            case 0:
                return "devkey";
            case 1:
                return "blacklist";
            case 2:
                return "configForDevKeys";
            case 3:
                return "default";
            case 4:
                return "domainDevKey";
            case 5:
                return "gradualRolloutRandom";
            case 6:
                return "gradualRolloutSessionId";
            case 7:
                return "gradualRolloutUserId";
            case 8:
                return "remoteAddress";
            case 9:
                return "unknown";
            case 10:
                return "userWithId";
            default:
                return "whitelist";
        }
    }
}
