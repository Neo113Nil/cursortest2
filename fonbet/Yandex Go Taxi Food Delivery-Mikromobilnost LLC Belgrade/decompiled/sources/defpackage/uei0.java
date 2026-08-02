package defpackage;

import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class uei0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PopupPriorityLauncher$PopupType.values().length];
        try {
            iArr[PopupPriorityLauncher$PopupType.Onboarding.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.Card.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.Story.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.Fullscreen.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.Ticket.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.EULA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.GDPR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PopupPriorityLauncher$PopupType.LocationPermissionAgreement.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
