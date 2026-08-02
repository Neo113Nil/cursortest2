package com.squareup.cash.profile.viewmodels;

import androidx.constraintlayout.motion.widget.Debug;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericProfileElementsViewModel$Success extends Debug {
    public final boolean blocked;
    public final List elements;
    public final boolean favorited;

    public GenericProfileElementsViewModel$Success(List list, boolean z, boolean z2) {
        list.getClass();
        this.elements = list;
        this.favorited = z;
        this.blocked = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericProfileElementsViewModel$Success)) {
            return false;
        }
        GenericProfileElementsViewModel$Success genericProfileElementsViewModel$Success = (GenericProfileElementsViewModel$Success) obj;
        return Intrinsics.areEqual(this.elements, genericProfileElementsViewModel$Success.elements) && this.favorited == genericProfileElementsViewModel$Success.favorited && this.blocked == genericProfileElementsViewModel$Success.blocked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.blocked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elements.hashCode() * 31, 31, this.favorited);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(elements=");
        sb.append(this.elements);
        sb.append(", favorited=");
        sb.append(this.favorited);
        sb.append(", blocked=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.blocked, ")");
    }
}
