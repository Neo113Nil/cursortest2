package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ChatFooterViewModel {
    public final String cameraCapturePath;
    public final boolean enableSubmission;
    public final boolean hasPreambleOverride;
    public final List pendingAttachments;
    public final String persistentDisclosure;
    public final String restoreInputText;
    public final List slashCommandMatches;
    public final MoneybotChatViewModel.Content.ToastMessage toastMessage;
    public final boolean useComposer;

    public ChatFooterViewModel(boolean z, boolean z2, MoneybotChatViewModel.Content.ToastMessage toastMessage, String str, String str2, List list, String str3, boolean z3, List list2) {
        list.getClass();
        list2.getClass();
        this.enableSubmission = z;
        this.hasPreambleOverride = z2;
        this.toastMessage = toastMessage;
        this.persistentDisclosure = str;
        this.restoreInputText = str2;
        this.pendingAttachments = list;
        this.cameraCapturePath = str3;
        this.useComposer = z3;
        this.slashCommandMatches = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatFooterViewModel)) {
            return false;
        }
        ChatFooterViewModel chatFooterViewModel = (ChatFooterViewModel) obj;
        return this.enableSubmission == chatFooterViewModel.enableSubmission && this.hasPreambleOverride == chatFooterViewModel.hasPreambleOverride && this.toastMessage == chatFooterViewModel.toastMessage && Intrinsics.areEqual(this.persistentDisclosure, chatFooterViewModel.persistentDisclosure) && Intrinsics.areEqual(this.restoreInputText, chatFooterViewModel.restoreInputText) && Intrinsics.areEqual(this.pendingAttachments, chatFooterViewModel.pendingAttachments) && Intrinsics.areEqual(this.cameraCapturePath, chatFooterViewModel.cameraCapturePath) && this.useComposer == chatFooterViewModel.useComposer && Intrinsics.areEqual(this.slashCommandMatches, chatFooterViewModel.slashCommandMatches);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.enableSubmission) * 31, 31, this.hasPreambleOverride);
        MoneybotChatViewModel.Content.ToastMessage toastMessage = this.toastMessage;
        int hashCode = (m + (toastMessage == null ? 0 : toastMessage.hashCode())) * 31;
        String str = this.persistentDisclosure;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.restoreInputText;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.pendingAttachments);
        String str3 = this.cameraCapturePath;
        return this.slashCommandMatches.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.useComposer);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("ChatFooterViewModel(enableSubmission=", ", hasPreambleOverride=", ", toastMessage=", this.enableSubmission, this.hasPreambleOverride);
        m.append(this.toastMessage);
        m.append(", persistentDisclosure=");
        m.append(this.persistentDisclosure);
        m.append(", restoreInputText=");
        NavAction$$ExternalSyntheticOutline0.m(this.restoreInputText, ", pendingAttachments=", ", cameraCapturePath=", m, this.pendingAttachments);
        NavAction$$ExternalSyntheticOutline0.m(m, this.cameraCapturePath, ", useComposer=", this.useComposer, ", slashCommandMatches=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.slashCommandMatches, ")");
    }
}
