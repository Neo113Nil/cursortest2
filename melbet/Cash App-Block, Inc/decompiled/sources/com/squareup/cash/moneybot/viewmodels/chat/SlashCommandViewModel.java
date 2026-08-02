package com.squareup.cash.moneybot.viewmodels.chat;

import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SlashCommandViewModel {
    public final String command;
    public final String description;
    public final Icons icon;
    public final String name;

    public SlashCommandViewModel(Icons icons, String str, String str2, String str3) {
        this.command = str;
        this.name = str2;
        this.description = str3;
        this.icon = icons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashCommandViewModel)) {
            return false;
        }
        SlashCommandViewModel slashCommandViewModel = (SlashCommandViewModel) obj;
        return this.command.equals(slashCommandViewModel.command) && this.name.equals(slashCommandViewModel.name) && this.description.equals(slashCommandViewModel.description) && this.icon == slashCommandViewModel.icon;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.command.hashCode() * 31, 31, this.name), 31, this.description);
        Icons icons = this.icon;
        return m + (icons == null ? 0 : icons.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SlashCommandViewModel(command=", this.command, ", name=", this.name, ", description=");
        m.append(this.description);
        m.append(", icon=");
        m.append(this.icon);
        m.append(")");
        return m.toString();
    }
}
