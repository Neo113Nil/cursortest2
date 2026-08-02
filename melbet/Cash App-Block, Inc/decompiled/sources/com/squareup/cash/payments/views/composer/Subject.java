package com.squareup.cash.payments.views.composer;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Subject {
    public final String accessibilityActionLabel;
    public final ComposableLambdaImpl avatar;
    public final String name;

    public Subject(String str, ComposableLambdaImpl composableLambdaImpl, String str2) {
        str.getClass();
        this.name = str;
        this.avatar = composableLambdaImpl;
        this.accessibilityActionLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subject) {
            Subject subject = (Subject) obj;
            if (Intrinsics.areEqual(this.name, subject.name) && this.avatar == subject.avatar && Intrinsics.areEqual(this.accessibilityActionLabel, subject.accessibilityActionLabel)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.avatar.hashCode() + (this.name.hashCode() * 31)) * 961;
        String str = this.accessibilityActionLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Subject(name=");
        sb.append(this.name);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", contentDescription=null, accessibilityActionLabel=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityActionLabel, ")");
    }
}
