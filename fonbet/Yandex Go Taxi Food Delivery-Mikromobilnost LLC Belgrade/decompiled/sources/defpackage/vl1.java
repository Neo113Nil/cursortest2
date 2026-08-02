package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewNavigationEntry$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vl1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatViewNavigationEntry$Type.values().length];
        try {
            iArr[ChatViewNavigationEntry$Type.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatViewNavigationEntry$Type.SKILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChatViewNavigationEntry$Type.CHAT_FOLDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChatViewNavigationEntry$Type.CHAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChatViewNavigationEntry$Type.CHAT_LIST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
