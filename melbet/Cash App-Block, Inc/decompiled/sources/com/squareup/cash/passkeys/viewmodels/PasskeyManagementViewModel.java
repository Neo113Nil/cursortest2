package com.squareup.cash.passkeys.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PasskeyManagementViewModel {

    public final class Empty extends PasskeyManagementViewModel {
        public final OperationState operationState;

        public Empty(OperationState operationState) {
            this.operationState = operationState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Empty) && Intrinsics.areEqual(this.operationState, ((Empty) obj).operationState);
        }

        @Override // com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel
        public final OperationState getOperationState() {
            return this.operationState;
        }

        public final int hashCode() {
            OperationState operationState = this.operationState;
            if (operationState == null) {
                return 0;
            }
            return operationState.hashCode();
        }

        public final String toString() {
            return "Empty(operationState=" + this.operationState + ")";
        }
    }

    public final class Error extends PasskeyManagementViewModel {
        public final String body;
        public final boolean isRetrying;
        public final OperationState operationState;
        public final String title;

        public Error(String str, String str2, boolean z, OperationState operationState) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.body = str2;
            this.isRetrying = z;
            this.operationState = operationState;
        }

        public static Error copy$default(Error error, OperationState operationState, int i) {
            String str = error.title;
            String str2 = error.body;
            boolean z = (i & 4) != 0 ? error.isRetrying : true;
            str.getClass();
            str2.getClass();
            return new Error(str, str2, z, operationState);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.body, error.body) && this.isRetrying == error.isRetrying && Intrinsics.areEqual(this.operationState, error.operationState);
        }

        @Override // com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel
        public final OperationState getOperationState() {
            return this.operationState;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.isRetrying);
            OperationState operationState = this.operationState;
            return m + (operationState == null ? 0 : operationState.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", body=", this.body, ", isRetrying=");
            m.append(this.isRetrying);
            m.append(", operationState=");
            m.append(this.operationState);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loaded extends PasskeyManagementViewModel {
        public final OperationState operationState;
        public final List passkeys;

        public Loaded(List list, OperationState operationState) {
            this.passkeys = list;
            this.operationState = operationState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.passkeys.equals(loaded.passkeys) && Intrinsics.areEqual(this.operationState, loaded.operationState);
        }

        @Override // com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel
        public final OperationState getOperationState() {
            return this.operationState;
        }

        public final int hashCode() {
            int hashCode = this.passkeys.hashCode() * 31;
            OperationState operationState = this.operationState;
            return hashCode + (operationState == null ? 0 : operationState.hashCode());
        }

        public final String toString() {
            return "Loaded(passkeys=" + this.passkeys + ", operationState=" + this.operationState + ")";
        }
    }

    public final class Loading extends PasskeyManagementViewModel {
        public final OperationState operationState;

        public Loading(OperationState operationState) {
            this.operationState = operationState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.operationState, ((Loading) obj).operationState);
        }

        @Override // com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel
        public final OperationState getOperationState() {
            return this.operationState;
        }

        public final int hashCode() {
            OperationState operationState = this.operationState;
            if (operationState == null) {
                return 0;
            }
            return operationState.hashCode();
        }

        public final String toString() {
            return "Loading(operationState=" + this.operationState + ")";
        }
    }

    public interface OperationState {

        public interface Create extends OperationState {

            public final class Error implements Create {
                public final String body;
                public final boolean isRetryable;
                public final String title;
                public final boolean useDoneButton;

                public Error(String str, String str2, boolean z, boolean z2) {
                    str.getClass();
                    str2.getClass();
                    this.title = str;
                    this.body = str2;
                    this.isRetryable = z;
                    this.useDoneButton = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return false;
                    }
                    Error error = (Error) obj;
                    return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.body, error.body) && this.isRetryable == error.isRetryable && this.useDoneButton == error.useDoneButton;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.useDoneButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.isRetryable);
                }

                public final String toString() {
                    return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", body=", this.body, ", isRetryable="), this.isRetryable, ", useDoneButton=", this.useDoneButton, ")");
                }
            }

            public final class InProgress implements Create {
                public static final InProgress INSTANCE = new InProgress();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof InProgress);
                }

                public final int hashCode() {
                    return -1077386125;
                }

                public final String toString() {
                    return "InProgress";
                }
            }

            public final class Success implements Create {
                public final PasskeyItemViewModel passkey;

                public Success(PasskeyItemViewModel passkeyItemViewModel) {
                    this.passkey = passkeyItemViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && Intrinsics.areEqual(this.passkey, ((Success) obj).passkey);
                }

                public final int hashCode() {
                    PasskeyItemViewModel passkeyItemViewModel = this.passkey;
                    if (passkeyItemViewModel == null) {
                        return 0;
                    }
                    return passkeyItemViewModel.hashCode();
                }

                public final String toString() {
                    return "Success(passkey=" + this.passkey + ")";
                }
            }
        }

        public interface Remove extends OperationState {

            public final class AwaitingConfirmation implements Remove {
                public final PasskeyItemViewModel passkey;

                public AwaitingConfirmation(PasskeyItemViewModel passkeyItemViewModel) {
                    this.passkey = passkeyItemViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof AwaitingConfirmation) && this.passkey.equals(((AwaitingConfirmation) obj).passkey);
                }

                public final int hashCode() {
                    return this.passkey.hashCode();
                }

                public final String toString() {
                    return "AwaitingConfirmation(passkey=" + this.passkey + ")";
                }
            }

            public final class Error implements Remove {
                public final PasskeyItemViewModel passkey;

                public Error(PasskeyItemViewModel passkeyItemViewModel) {
                    passkeyItemViewModel.getClass();
                    this.passkey = passkeyItemViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Error) && Intrinsics.areEqual(this.passkey, ((Error) obj).passkey);
                }

                public final int hashCode() {
                    return this.passkey.hashCode();
                }

                public final String toString() {
                    return "Error(passkey=" + this.passkey + ")";
                }
            }

            public final class InProgress implements Remove {
                public final PasskeyItemViewModel passkey;

                public InProgress(PasskeyItemViewModel passkeyItemViewModel) {
                    passkeyItemViewModel.getClass();
                    this.passkey = passkeyItemViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof InProgress) && Intrinsics.areEqual(this.passkey, ((InProgress) obj).passkey);
                }

                public final int hashCode() {
                    return this.passkey.hashCode();
                }

                public final String toString() {
                    return "InProgress(passkey=" + this.passkey + ")";
                }
            }

            public final class Success implements Remove {
                public final PasskeyItemViewModel passkey;

                public Success(PasskeyItemViewModel passkeyItemViewModel) {
                    passkeyItemViewModel.getClass();
                    this.passkey = passkeyItemViewModel;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Success) && Intrinsics.areEqual(this.passkey, ((Success) obj).passkey);
                }

                public final int hashCode() {
                    return this.passkey.hashCode();
                }

                public final String toString() {
                    return "Success(passkey=" + this.passkey + ")";
                }
            }
        }
    }

    public final class PasskeyItemViewModel {
        public final String description;
        public final String id;
        public final String title;

        public PasskeyItemViewModel(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.title = str2;
            this.description = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyItemViewModel)) {
                return false;
            }
            PasskeyItemViewModel passkeyItemViewModel = (PasskeyItemViewModel) obj;
            return Intrinsics.areEqual(this.id, passkeyItemViewModel.id) && Intrinsics.areEqual(this.title, passkeyItemViewModel.title) && this.description.equals(passkeyItemViewModel.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PasskeyItemViewModel(id=", this.id, ", title=", this.title, ", description="), this.description, ")");
        }
    }

    public abstract OperationState getOperationState();
}
