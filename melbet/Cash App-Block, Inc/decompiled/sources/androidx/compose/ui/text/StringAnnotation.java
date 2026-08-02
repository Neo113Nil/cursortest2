package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    public final String value;

    public /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m976boximpl(String str) {
        return new StringAnnotation(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StringAnnotation) {
            return Intrinsics.areEqual(this.value, ((StringAnnotation) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "StringAnnotation(value=", this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m977unboximpl() {
        return this.value;
    }
}
