package com.squareup.cash.moneybot.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotDebugOverlayViewEvent {

    public final class CopySessionId implements MoneybotDebugOverlayViewEvent {
        public final String sessionId;

        public CopySessionId(String str) {
            str.getClass();
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopySessionId) && Intrinsics.areEqual(this.sessionId, ((CopySessionId) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CopySessionId(sessionId=", this.sessionId, ")");
        }
    }

    public final class Dismiss implements MoneybotDebugOverlayViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1020366339;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class OpenMoneybotPreambleEditor implements MoneybotDebugOverlayViewEvent {
        public static final OpenMoneybotPreambleEditor INSTANCE = new OpenMoneybotPreambleEditor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenMoneybotPreambleEditor);
        }

        public final int hashCode() {
            return 771090737;
        }

        public final String toString() {
            return "OpenMoneybotPreambleEditor";
        }
    }

    public final class OpenSessionById implements MoneybotDebugOverlayViewEvent {
        public final String sessionId;

        public OpenSessionById(String str) {
            str.getClass();
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSessionById) && Intrinsics.areEqual(this.sessionId, ((OpenSessionById) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenSessionById(sessionId=", this.sessionId, ")");
        }
    }

    public final class OpenTokenUsageOverlay implements MoneybotDebugOverlayViewEvent {
        public static final OpenTokenUsageOverlay INSTANCE = new OpenTokenUsageOverlay();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenTokenUsageOverlay);
        }

        public final int hashCode() {
            return -1901665641;
        }

        public final String toString() {
            return "OpenTokenUsageOverlay";
        }
    }

    public final class ShowOpenSessionByIdDialog implements MoneybotDebugOverlayViewEvent {
        public static final ShowOpenSessionByIdDialog INSTANCE = new ShowOpenSessionByIdDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowOpenSessionByIdDialog);
        }

        public final int hashCode() {
            return -96147966;
        }

        public final String toString() {
            return "ShowOpenSessionByIdDialog";
        }
    }

    public final class ShowRawMessages implements MoneybotDebugOverlayViewEvent {
        public final String sessionId;

        public ShowRawMessages(String str) {
            str.getClass();
            this.sessionId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRawMessages) && Intrinsics.areEqual(this.sessionId, ((ShowRawMessages) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShowRawMessages(sessionId=", this.sessionId, ")");
        }
    }

    public final class ToggleRawMarkdown implements MoneybotDebugOverlayViewEvent {
        public static final ToggleRawMarkdown INSTANCE = new ToggleRawMarkdown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleRawMarkdown);
        }

        public final int hashCode() {
            return 1417697660;
        }

        public final String toString() {
            return "ToggleRawMarkdown";
        }
    }
}
