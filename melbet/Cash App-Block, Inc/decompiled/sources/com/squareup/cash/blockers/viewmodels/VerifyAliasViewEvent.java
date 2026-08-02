package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.HelpItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class VerifyAliasViewEvent {

    public final class BlockerActionClick extends VerifyAliasViewEvent {
        public final BlockerAction action;

        public BlockerActionClick(BlockerAction blockerAction) {
            this.action = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockerActionClick) && this.action.equals(((BlockerActionClick) obj).action);
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("BlockerActionClick(action=", this.action, ")");
        }
    }

    public final class ConfirmError extends VerifyAliasViewEvent {
        public static final ConfirmError INSTANCE = new ConfirmError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmError);
        }

        public final int hashCode() {
            return -1714586180;
        }

        public final String toString() {
            return "ConfirmError";
        }
    }

    public final class ConfirmSkip extends VerifyAliasViewEvent {
        public static final ConfirmSkip INSTANCE = new ConfirmSkip();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmSkip);
        }

        public final int hashCode() {
            return 1330574155;
        }

        public final String toString() {
            return "ConfirmSkip";
        }
    }

    public final class Dismiss extends VerifyAliasViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1495131274;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class DismissError extends VerifyAliasViewEvent {
        public static final DismissError INSTANCE = new DismissError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissError);
        }

        public final int hashCode() {
            return 915701810;
        }

        public final String toString() {
            return "DismissError";
        }
    }

    public final class EditAlias extends VerifyAliasViewEvent {
        public static final EditAlias INSTANCE = new EditAlias();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditAlias);
        }

        public final int hashCode() {
            return -60535726;
        }

        public final String toString() {
            return "EditAlias";
        }
    }

    public final class GoBack extends VerifyAliasViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1981389699;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class Help extends VerifyAliasViewEvent {
        public static final Help INSTANCE = new Help();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Help);
        }

        public final int hashCode() {
            return -1982272043;
        }

        public final String toString() {
            return "Help";
        }
    }

    public final class HelpItemSelected extends VerifyAliasViewEvent {
        public final HelpItem helpItem;

        public HelpItemSelected(HelpItem helpItem) {
            helpItem.getClass();
            this.helpItem = helpItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpItemSelected) && Intrinsics.areEqual(this.helpItem, ((HelpItemSelected) obj).helpItem);
        }

        public final int hashCode() {
            return this.helpItem.hashCode();
        }

        public final String toString() {
            return "HelpItemSelected(helpItem=" + this.helpItem + ")";
        }
    }

    public final class MergeBlockerCancelled extends VerifyAliasViewEvent {
        public static final MergeBlockerCancelled INSTANCE = new MergeBlockerCancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MergeBlockerCancelled);
        }

        public final int hashCode() {
            return -2050370373;
        }

        public final String toString() {
            return "MergeBlockerCancelled";
        }
    }

    public final class MergeBlockerResult extends VerifyAliasViewEvent {
        public final IneligibleMergeResult result;

        public MergeBlockerResult(IneligibleMergeResult ineligibleMergeResult) {
            ineligibleMergeResult.getClass();
            this.result = ineligibleMergeResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MergeBlockerResult) && Intrinsics.areEqual(this.result, ((MergeBlockerResult) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "MergeBlockerResult(result=" + this.result + ")";
        }
    }

    public final class RequestCall extends VerifyAliasViewEvent {
        public static final RequestCall INSTANCE = new RequestCall();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequestCall);
        }

        public final int hashCode() {
            return 2135757945;
        }

        public final String toString() {
            return "RequestCall";
        }
    }

    public final class ResendCode extends VerifyAliasViewEvent {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Source {
            public static final /* synthetic */ Source[] $VALUES;
            public static final Source TOP_LEVEL;

            /* JADX INFO: Fake field, exist only in values array */
            Source EF0;

            static {
                Source source = new Source("OVERFLOW_MENU", 0);
                Source source2 = new Source("TOP_LEVEL", 1);
                TOP_LEVEL = source2;
                $VALUES = new Source[]{source, source2};
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResendCode)) {
                return false;
            }
            Source source = Source.TOP_LEVEL;
            return true;
        }

        public final int hashCode() {
            return Source.TOP_LEVEL.hashCode();
        }

        public final String toString() {
            return "ResendCode(source=" + Source.TOP_LEVEL + ")";
        }
    }

    public final class Skip extends VerifyAliasViewEvent {
        public static final Skip INSTANCE = new Skip();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Skip);
        }

        public final int hashCode() {
            return -1981938669;
        }

        public final String toString() {
            return "Skip";
        }
    }

    public final class SubmitCode extends VerifyAliasViewEvent {
        public final String verificationCode;

        public SubmitCode(String str) {
            str.getClass();
            this.verificationCode = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitCode) && Intrinsics.areEqual(this.verificationCode, ((SubmitCode) obj).verificationCode);
        }

        public final int hashCode() {
            return this.verificationCode.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitCode(verificationCode=", this.verificationCode, ")");
        }
    }
}
