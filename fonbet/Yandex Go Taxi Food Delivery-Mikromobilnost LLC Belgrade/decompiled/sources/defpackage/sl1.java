package defpackage;

import com.yandex.go.quark.ai_assistant.api.router.AiAssistantRouter$Payload$AnalyticsType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sl1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AiAssistantRouter$Payload$AnalyticsType.values().length];
        try {
            iArr[AiAssistantRouter$Payload$AnalyticsType.Empty.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AiAssistantRouter$Payload$AnalyticsType.Soul.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
