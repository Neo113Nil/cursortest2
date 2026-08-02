package com.squareup.cash.onboarding.accountpicker.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.ui.Avatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ValidatedAccount {
    public final String accountId;
    public final List aliases;
    public final Avatar avatar;
    public final ClientScenario clientScenario;
    public final boolean isBusiness;
    public final boolean isPasskeyRegistered;
    public final UiAlias preferredAlias;
    public final AccountListConfig.Account proto;
    public final String subtitle;
    public final String title;

    public ValidatedAccount(String str, String str2, String str3, Avatar avatar, List list, UiAlias uiAlias, boolean z, boolean z2, ClientScenario clientScenario, AccountListConfig.Account account) {
        list.getClass();
        this.accountId = str;
        this.title = str2;
        this.subtitle = str3;
        this.avatar = avatar;
        this.aliases = list;
        this.preferredAlias = uiAlias;
        this.isPasskeyRegistered = z;
        this.isBusiness = z2;
        this.clientScenario = clientScenario;
        this.proto = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidatedAccount)) {
            return false;
        }
        ValidatedAccount validatedAccount = (ValidatedAccount) obj;
        return this.accountId.equals(validatedAccount.accountId) && this.title.equals(validatedAccount.title) && this.subtitle.equals(validatedAccount.subtitle) && this.avatar.equals(validatedAccount.avatar) && Intrinsics.areEqual(this.aliases, validatedAccount.aliases) && Intrinsics.areEqual(this.preferredAlias, validatedAccount.preferredAlias) && this.isPasskeyRegistered == validatedAccount.isPasskeyRegistered && this.isBusiness == validatedAccount.isBusiness && this.clientScenario == validatedAccount.clientScenario && this.proto.equals(validatedAccount.proto);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.accountId.hashCode() * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.aliases);
        UiAlias uiAlias = this.preferredAlias;
        return this.proto.hashCode() + ((this.clientScenario.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (uiAlias == null ? 0 : uiAlias.hashCode())) * 31, 31, this.isPasskeyRegistered), 31, this.isBusiness)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ValidatedAccount(accountId=", this.accountId, ", title=", this.title, ", subtitle=");
        m.append(this.subtitle);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(", aliases=");
        m.append(this.aliases);
        m.append(", preferredAlias=");
        m.append(this.preferredAlias);
        m.append(", isPasskeyRegistered=");
        re$$ExternalSyntheticOutline0.m(m, this.isPasskeyRegistered, ", isBusiness=", this.isBusiness, ", clientScenario=");
        m.append(this.clientScenario);
        m.append(", proto=");
        m.append(this.proto);
        m.append(")");
        return m.toString();
    }
}
