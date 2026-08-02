package com.squareup.cash.passkeys.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PasskeyOperationSheetUiState {

    public final class Content implements PasskeyOperationSheetUiState {
        public final String body;
        public final List buttons;
        public final Function0 onDismissRequest;
        public final PasskeyManagementViewModel.PasskeyItemViewModel passkey;
        public final String title;

        public Content(Function0 function0, String str, String str2, PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel, List list) {
            function0.getClass();
            str.getClass();
            list.getClass();
            this.onDismissRequest = function0;
            this.title = str;
            this.body = str2;
            this.passkey = passkeyItemViewModel;
            this.buttons = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.onDismissRequest, content.onDismissRequest) && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.body, content.body) && Intrinsics.areEqual(this.passkey, content.passkey) && Intrinsics.areEqual(this.buttons, content.buttons);
        }

        @Override // com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState
        public final Function0 getOnDismissRequest() {
            return this.onDismissRequest;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.onDismissRequest.hashCode() * 31, 31, this.title);
            String str = this.body;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel = this.passkey;
            return this.buttons.hashCode() + ((hashCode + (passkeyItemViewModel != null ? passkeyItemViewModel.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(onDismissRequest=");
            sb.append(this.onDismissRequest);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", body=");
            sb.append(this.body);
            sb.append(", passkey=");
            sb.append(this.passkey);
            sb.append(", buttons=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.buttons, ")");
        }
    }

    public final class InProgress implements PasskeyOperationSheetUiState {
        public final Function0 onDismissRequest;

        public InProgress(Function0 function0) {
            function0.getClass();
            this.onDismissRequest = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InProgress) && Intrinsics.areEqual(this.onDismissRequest, ((InProgress) obj).onDismissRequest);
        }

        @Override // com.squareup.cash.passkeys.views.PasskeyOperationSheetUiState
        public final Function0 getOnDismissRequest() {
            return this.onDismissRequest;
        }

        public final int hashCode() {
            return this.onDismissRequest.hashCode();
        }

        public final String toString() {
            return "InProgress(onDismissRequest=" + this.onDismissRequest + ")";
        }
    }

    Function0 getOnDismissRequest();
}
