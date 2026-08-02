package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SetNameViewModel {
    public final String buttonText;
    public final boolean canExit;
    public final String footer;
    public final boolean helpItemsAvailable;
    public final String instructionLabel;
    public final zzagj lastEvent;
    public final NameInputProperties nameInputProperties;
    public final boolean showBusinessName;
    public final String title;

    /* loaded from: classes4.dex */
    public final class NameInputProperties {
        public final String hint;
        public final int maxLength;
        public final String prefill;

        public NameInputProperties(int i, String str, String str2) {
            this.maxLength = i;
            this.hint = str;
            this.prefill = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameInputProperties)) {
                return false;
            }
            NameInputProperties nameInputProperties = (NameInputProperties) obj;
            return this.maxLength == nameInputProperties.maxLength && Intrinsics.areEqual(this.hint, nameInputProperties.hint) && Intrinsics.areEqual(this.prefill, nameInputProperties.prefill);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.maxLength) * 31;
            String str = this.hint;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.prefill;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("NameInputProperties(maxLength=", this.maxLength, ", hint=", this.hint, ", prefill="), this.prefill, ")");
        }
    }

    public SetNameViewModel(zzagj zzagjVar, NameInputProperties nameInputProperties, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4) {
        zzagjVar.getClass();
        str.getClass();
        this.lastEvent = zzagjVar;
        this.nameInputProperties = nameInputProperties;
        this.helpItemsAvailable = z;
        this.title = str;
        this.footer = str2;
        this.instructionLabel = str3;
        this.showBusinessName = z2;
        this.canExit = z3;
        this.buttonText = str4;
    }

    public static SetNameViewModel copy$default(SetNameViewModel setNameViewModel, zzagj zzagjVar, NameInputProperties nameInputProperties, int i) {
        if ((i & 2) != 0) {
            nameInputProperties = setNameViewModel.nameInputProperties;
        }
        boolean z = setNameViewModel.helpItemsAvailable;
        String str = setNameViewModel.title;
        String str2 = setNameViewModel.footer;
        String str3 = setNameViewModel.instructionLabel;
        boolean z2 = setNameViewModel.showBusinessName;
        boolean z3 = setNameViewModel.canExit;
        String str4 = setNameViewModel.buttonText;
        setNameViewModel.getClass();
        str.getClass();
        return new SetNameViewModel(zzagjVar, nameInputProperties, z, str, str2, str3, z2, z3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetNameViewModel)) {
            return false;
        }
        SetNameViewModel setNameViewModel = (SetNameViewModel) obj;
        return Intrinsics.areEqual(this.lastEvent, setNameViewModel.lastEvent) && this.nameInputProperties.equals(setNameViewModel.nameInputProperties) && this.helpItemsAvailable == setNameViewModel.helpItemsAvailable && Intrinsics.areEqual(this.title, setNameViewModel.title) && Intrinsics.areEqual(this.footer, setNameViewModel.footer) && Intrinsics.areEqual(this.instructionLabel, setNameViewModel.instructionLabel) && this.showBusinessName == setNameViewModel.showBusinessName && this.canExit == setNameViewModel.canExit && Intrinsics.areEqual(this.buttonText, setNameViewModel.buttonText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.nameInputProperties.hashCode() + (this.lastEvent.hashCode() * 31)) * 31, 31, this.helpItemsAvailable), 31, this.title);
        String str = this.footer;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.instructionLabel;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showBusinessName), 31, this.canExit);
        String str3 = this.buttonText;
        return m2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetNameViewModel(lastEvent=");
        sb.append(this.lastEvent);
        sb.append(", nameInputProperties=");
        sb.append(this.nameInputProperties);
        sb.append(", helpItemsAvailable=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.helpItemsAvailable, ", title=", this.title, ", footer=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.footer, ", instructionLabel=", this.instructionLabel, ", showBusinessName=");
        re$$ExternalSyntheticOutline0.m(sb, this.showBusinessName, ", canExit=", this.canExit, ", buttonText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonText, ")");
    }
}
