package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;
import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class wig0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ChatViewController$Mode.values().length];
        try {
            iArr[ChatViewController$Mode.Go.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatViewController$Mode.Eats.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChatViewController$Mode.Grocery.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChatViewController$Mode.Market.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChatViewController$Mode.Delivery.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[QuarkDynamicFeatureRouter$Payload$DisplayMode.values().length];
        try {
            iArr2[QuarkDynamicFeatureRouter$Payload$DisplayMode.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[QuarkDynamicFeatureRouter$Payload$DisplayMode.Headerless.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
