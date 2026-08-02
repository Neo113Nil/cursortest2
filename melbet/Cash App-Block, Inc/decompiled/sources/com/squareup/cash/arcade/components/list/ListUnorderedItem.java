package com.squareup.cash.arcade.components.list;

import androidx.compose.ui.text.AnnotatedString;
import com.squareup.cash.arcade.Icons;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ListUnorderedItem {
    public final AnnotatedString body;
    public final Icons icon;
    public final AnnotatedString label;
    public final AnnotatedString value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListUnorderedItem(Icons icons, String str, String str2, String str3) {
        this(new AnnotatedString(str), icons, str2 != null ? new AnnotatedString(str2) : null, str3 != null ? new AnnotatedString(str3) : null);
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListUnorderedItem)) {
            return false;
        }
        ListUnorderedItem listUnorderedItem = (ListUnorderedItem) obj;
        return Intrinsics.areEqual(this.label, listUnorderedItem.label) && this.icon == listUnorderedItem.icon && Intrinsics.areEqual(this.value, listUnorderedItem.value) && Intrinsics.areEqual(this.body, listUnorderedItem.body);
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        Icons icons = this.icon;
        int hashCode2 = (hashCode + (icons == null ? 0 : icons.hashCode())) * 31;
        AnnotatedString annotatedString = this.value;
        int hashCode3 = (hashCode2 + (annotatedString == null ? 0 : annotatedString.hashCode())) * 31;
        AnnotatedString annotatedString2 = this.body;
        return hashCode3 + (annotatedString2 != null ? annotatedString2.hashCode() : 0);
    }

    public final String toString() {
        return "ListUnorderedItem(label=" + ((Object) this.label) + ", icon=" + this.icon + ", value=" + ((Object) this.value) + ", body=" + ((Object) this.body) + ")";
    }

    public /* synthetic */ ListUnorderedItem(String str, Icons icons, String str2, String str3, int i) {
        this((i & 2) != 0 ? null : icons, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public ListUnorderedItem(AnnotatedString annotatedString, Icons icons, AnnotatedString annotatedString2, AnnotatedString annotatedString3) {
        this.label = annotatedString;
        this.icon = icons;
        this.value = annotatedString2;
        this.body = annotatedString3;
    }
}
