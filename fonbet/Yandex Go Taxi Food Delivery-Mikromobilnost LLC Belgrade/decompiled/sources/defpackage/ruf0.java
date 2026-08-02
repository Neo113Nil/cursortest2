package defpackage;

import ru.yandex.alice.protos.api.alice_mode_info.platform.utils.TAlice2ModeInfo;
import ru.yandex.alice.protos.data.dialog_type.platform.utils.EDialogType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ruf0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EDialogType.values().length];
        try {
            iArr[EDialogType.EXTERNAL_SKILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EDialogType.DEDICATED_CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EDialogType.ENGLISH_TUTOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EDialogType.CHERRY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[TAlice2ModeInfo.EMode.values().length];
        try {
            iArr2[TAlice2ModeInfo.EMode.Base.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TAlice2ModeInfo.EMode.Pro.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
