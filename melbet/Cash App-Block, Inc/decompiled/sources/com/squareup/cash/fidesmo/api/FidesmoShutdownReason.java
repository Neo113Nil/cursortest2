package com.squareup.cash.fidesmo.api;

/* loaded from: classes6.dex */
public enum FidesmoShutdownReason {
    FLOW_CLOSED("flow_closed"),
    STREAM_DISPOSED("stream_disposed"),
    TERMINAL_ERROR_SCREEN_CLOSED("terminal_error_screen_closed"),
    SUCCESS_SCREEN_SHOWN(null),
    /* JADX INFO: Fake field, exist only in values array */
    EXITED_BEFORE_SUCCESS_SCREEN("flow_exited_before_success_screen");

    public final String fidesmoCancellationMessage;

    FidesmoShutdownReason(String str) {
        this.fidesmoCancellationMessage = str;
    }
}
