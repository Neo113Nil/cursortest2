package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SlashCommand {
    public final String command;
    public final String description;
    public final String iconArcadeId;
    public final String id;
    public final String name;

    public SlashCommand(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.id = str;
        this.command = str2;
        this.name = str3;
        this.description = str4;
        this.iconArcadeId = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashCommand)) {
            return false;
        }
        SlashCommand slashCommand = (SlashCommand) obj;
        return Intrinsics.areEqual(this.id, slashCommand.id) && this.command.equals(slashCommand.command) && this.name.equals(slashCommand.name) && this.description.equals(slashCommand.description) && Intrinsics.areEqual(this.iconArcadeId, slashCommand.iconArcadeId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.command), 31, this.name), 31, this.description);
        String str = this.iconArcadeId;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SlashCommand(id=", this.id, ", command=", this.command, ", name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.name, ", description=", this.description, ", iconArcadeId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.iconArcadeId, ")");
    }
}
