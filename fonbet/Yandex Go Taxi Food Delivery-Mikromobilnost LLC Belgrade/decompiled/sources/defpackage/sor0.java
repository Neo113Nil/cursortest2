package defpackage;

import com.yandex.go.payments.shared.members.list.MemberListMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sor0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MemberListMode.values().length];
        try {
            iArr[MemberListMode.WIZARD_ADD_PARTICIPANTS_STEP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MemberListMode.WIZARD_EDIT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MemberListMode.DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MemberListMode.LIMITS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
