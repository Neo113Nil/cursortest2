package com.squareup.cash.clientsync.observability;

import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.franklin.api.Role;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class RealAccountMismatchReporter {
    public static final Regex SPECIAL_TOKEN_REGEX = new Regex("^C_[A-Z0-9_]*$");
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final SessionManager sessionManager;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Role.values().length];
            try {
                iArr[Role.SENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Role.RECIPIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealAccountMismatchReporter(ErrorReporter errorReporter, FeatureFlagManager featureFlagManager, SessionManager sessionManager) {
        this.errorReporter = errorReporter;
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
    }
}
