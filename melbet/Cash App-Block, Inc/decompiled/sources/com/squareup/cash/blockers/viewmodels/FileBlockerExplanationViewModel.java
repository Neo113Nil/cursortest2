package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class FileBlockerExplanationViewModel {
    public final String message;

    public FileBlockerExplanationViewModel(String str) {
        str.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileBlockerExplanationViewModel) && Intrinsics.areEqual(this.message, ((FileBlockerExplanationViewModel) obj).message);
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FileBlockerExplanationViewModel(message=", this.message, ")");
    }
}
