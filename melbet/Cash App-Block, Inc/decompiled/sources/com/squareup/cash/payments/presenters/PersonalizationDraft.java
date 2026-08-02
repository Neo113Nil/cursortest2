package com.squareup.cash.payments.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalizationDraft {
    public final Color backgroundColor;
    public final List backgroundEffects;
    public final String backgroundId;
    public final Image backgroundImage;
    public final List elements;
    public final PersonalizationInput remotePersonalization;
    public final Color textColor;

    public PersonalizationDraft(PersonalizationInput personalizationInput, Image image, Color color, List list, String str, List list2, Color color2) {
        image.getClass();
        color.getClass();
        list.getClass();
        str.getClass();
        list2.getClass();
        this.remotePersonalization = personalizationInput;
        this.backgroundImage = image;
        this.backgroundColor = color;
        this.backgroundEffects = list;
        this.backgroundId = str;
        this.elements = list2;
        this.textColor = color2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizationDraft)) {
            return false;
        }
        PersonalizationDraft personalizationDraft = (PersonalizationDraft) obj;
        return this.remotePersonalization.equals(personalizationDraft.remotePersonalization) && Intrinsics.areEqual(this.backgroundImage, personalizationDraft.backgroundImage) && Intrinsics.areEqual(this.backgroundColor, personalizationDraft.backgroundColor) && Intrinsics.areEqual(this.backgroundEffects, personalizationDraft.backgroundEffects) && Intrinsics.areEqual(this.backgroundId, personalizationDraft.backgroundId) && Intrinsics.areEqual(this.elements, personalizationDraft.elements) && Intrinsics.areEqual(this.textColor, personalizationDraft.textColor);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.backgroundColor, (this.backgroundImage.hashCode() + (this.remotePersonalization.hashCode() * 31)) * 31, 31), 31, this.backgroundEffects), 31, this.backgroundId), 31, this.elements);
        Color color = this.textColor;
        return m + (color == null ? 0 : color.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersonalizationDraft(remotePersonalization=");
        sb.append(this.remotePersonalization);
        sb.append(", backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", backgroundEffects=");
        sb.append(this.backgroundEffects);
        sb.append(", backgroundId=");
        NavAction$$ExternalSyntheticOutline0.m(this.backgroundId, ", elements=", ", textColor=", sb, this.elements);
        sb.append(this.textColor);
        sb.append(")");
        return sb.toString();
    }
}
