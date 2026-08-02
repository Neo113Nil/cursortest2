package com.squareup.cash.data.profile.documents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class DocumentsManager$DocumentSection {
    public final List documents;
    public final String title;

    public DocumentsManager$DocumentSection(String str, List list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.documents = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentsManager$DocumentSection)) {
            return false;
        }
        DocumentsManager$DocumentSection documentsManager$DocumentSection = (DocumentsManager$DocumentSection) obj;
        return Intrinsics.areEqual(this.title, documentsManager$DocumentSection.title) && Intrinsics.areEqual(this.documents, documentsManager$DocumentSection.documents);
    }

    public final int hashCode() {
        return this.documents.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("DocumentSection(title=", this.title, ", documents=", ")", this.documents);
    }
}
