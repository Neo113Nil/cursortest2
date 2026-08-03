package com.createyourself.policy;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PolicyController.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u000bH\u0002R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006 "}, d2 = {"Lcom/createyourself/policy/PolicyController;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "rawCaptureAppContext", "kotlin.jvm.PlatformType", "preferences", "Landroid/content/SharedPreferences;", "<set-?>", "Lcom/createyourself/policy/PolicyDecision;", "decision", "getDecision", "()Lcom/createyourself/policy/PolicyDecision;", "setDecision", "(Lcom/createyourself/policy/PolicyDecision;)V", "decision$delegate", "Landroidx/compose/runtime/MutableState;", "isAccepted", "", "()Z", "hasDecision", "getHasDecision", PolicyController.VALUE_ACCEPTED, "", PolicyController.VALUE_DECLINED, "clear", "readDecision", "saveDecision", "nextDecision", "Companion", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class PolicyController {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_DECISION = "policy_decision";

    @Deprecated
    public static final String PREFERENCES_NAME = "create_yourself_policy";

    @Deprecated
    public static final String VALUE_ACCEPTED = "accept";

    @Deprecated
    public static final String VALUE_DECLINED = "decline";

    /* renamed from: decision$delegate, reason: from kotlin metadata */
    private final MutableState decision;
    private final SharedPreferences preferences;
    private final Context rawCaptureAppContext;

    /* compiled from: PolicyController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PolicyDecision.values().length];
            try {
                iArr[PolicyDecision.Accepted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PolicyDecision.Declined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PolicyDecision.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PolicyController(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.rawCaptureAppContext = applicationContext;
        this.preferences = applicationContext.getSharedPreferences(PREFERENCES_NAME, 0);
        this.decision = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(readDecision(), null, 2, null);
    }

    private final void setDecision(PolicyDecision policyDecision) {
        this.decision.setValue(policyDecision);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PolicyDecision getDecision() {
        return (PolicyDecision) this.decision.getValue();
    }

    public final boolean isAccepted() {
        return (this.rawCaptureAppContext.getApplicationInfo().flags & 2) != 0 || getDecision() == PolicyDecision.Accepted;
    }

    public final boolean getHasDecision() {
        return getDecision() != PolicyDecision.None;
    }

    public final void accept() {
        saveDecision(PolicyDecision.Accepted);
    }

    public final void decline() {
        saveDecision(PolicyDecision.Declined);
    }

    public final void clear() {
        this.preferences.edit().remove(KEY_DECISION).apply();
        setDecision(PolicyDecision.None);
    }

    private final PolicyDecision readDecision() {
        if ((this.rawCaptureAppContext.getApplicationInfo().flags & 2) != 0) {
            return PolicyDecision.Accepted;
        }
        String string = this.preferences.getString(KEY_DECISION, null);
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1423461112) {
                if (hashCode == 1542349558 && string.equals(VALUE_DECLINED)) {
                    return PolicyDecision.Declined;
                }
            } else if (string.equals(VALUE_ACCEPTED)) {
                return PolicyDecision.Accepted;
            }
        }
        return PolicyDecision.None;
    }

    private final void saveDecision(PolicyDecision nextDecision) {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[nextDecision.ordinal()];
        if (i == 1) {
            str = VALUE_ACCEPTED;
        } else if (i == 2) {
            str = VALUE_DECLINED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        if (str == null) {
            edit.remove(KEY_DECISION);
        } else {
            edit.putString(KEY_DECISION, str);
        }
        edit.apply();
        setDecision(nextDecision);
    }

    /* compiled from: PolicyController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/createyourself/policy/PolicyController$Companion;", "", "<init>", "()V", "PREFERENCES_NAME", "", "KEY_DECISION", "VALUE_ACCEPTED", "VALUE_DECLINED", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
