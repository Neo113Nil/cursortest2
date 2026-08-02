package defpackage;

import com.yandex.quark.webchat.navigation.NavigationEntry$Type;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vig0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigationEntry$Type.values().length];
        try {
            iArr[NavigationEntry$Type.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigationEntry$Type.CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NavigationEntry$Type.CHAT_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NavigationEntry$Type.SKILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NavigationEntry$Type.CHAT_FOLDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
