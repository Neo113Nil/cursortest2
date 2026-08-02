package com.squareup.cash.payments.presenters;

import com.squareup.cash.cdf.recipient.RecipientSearchSelectBlockerOption;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogResult;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewEvent;
import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes6.dex */
public enum ConfirmRecipientDialogPresenter$ConfirmRecipientOptions {
    /* JADX INFO: Fake field, exist only in values array */
    CONFIRM(ConfirmRecipientDialogViewEvent.Confirm.INSTANCE, ConfirmRecipientDialogResult.CONFIRM, RecipientSearchSelectBlockerOption.BlockerOption.CONFIRM),
    /* JADX INFO: Fake field, exist only in values array */
    CANCEL(ConfirmRecipientDialogViewEvent.Cancel.INSTANCE, ConfirmRecipientDialogResult.CANCEL, RecipientSearchSelectBlockerOption.BlockerOption.CANCEL),
    /* JADX INFO: Fake field, exist only in values array */
    VIEW_PROFILE(ConfirmRecipientDialogViewEvent.ViewProfile.INSTANCE, ConfirmRecipientDialogResult.VIEW_PROFILE, RecipientSearchSelectBlockerOption.BlockerOption.VIEW_PROFILE);

    public static final Companion Companion = new Companion();
    public static final LinkedHashMap map;
    public final RecipientSearchSelectBlockerOption.BlockerOption blockerOption;
    public final ConfirmRecipientDialogViewEvent event;
    public final ConfirmRecipientDialogResult result;

    public final class Companion {
    }

    static {
        ConfirmRecipientDialogPresenter$ConfirmRecipientOptions[] values = values();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (ConfirmRecipientDialogPresenter$ConfirmRecipientOptions confirmRecipientDialogPresenter$ConfirmRecipientOptions : values) {
            linkedHashMap.put(confirmRecipientDialogPresenter$ConfirmRecipientOptions.event, confirmRecipientDialogPresenter$ConfirmRecipientOptions);
        }
        map = linkedHashMap;
    }

    ConfirmRecipientDialogPresenter$ConfirmRecipientOptions(ConfirmRecipientDialogViewEvent confirmRecipientDialogViewEvent, ConfirmRecipientDialogResult confirmRecipientDialogResult, RecipientSearchSelectBlockerOption.BlockerOption blockerOption) {
        this.event = confirmRecipientDialogViewEvent;
        this.result = confirmRecipientDialogResult;
        this.blockerOption = blockerOption;
    }
}
