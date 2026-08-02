package com.squareup.cash.money.applets.sections;

import com.squareup.cash.money.applets.sections.AppletTileItem;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface CustomResult {

    public final class Failure implements CustomResult {
        public final Object error;

        public Failure(Unit unit) {
            this.error = unit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
        }

        public final int hashCode() {
            Object obj = this.error;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failure(error=", ")", this.error);
        }
    }

    public final class Success implements CustomResult {
        public final Object value;

        public Success(AppletTileItem.Section section) {
            this.value = section;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
        }

        public final int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(value=", ")", this.value);
        }
    }
}
