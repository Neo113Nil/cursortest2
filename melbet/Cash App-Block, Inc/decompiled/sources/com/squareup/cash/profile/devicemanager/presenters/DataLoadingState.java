package com.squareup.cash.profile.devicemanager.presenters;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class DataLoadingState {

    /* loaded from: classes6.dex */
    public final class DataLoaded extends DataLoadingState {
        public final Object data;

        public DataLoaded(Object obj) {
            this.data = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataLoaded) && Intrinsics.areEqual(this.data, ((DataLoaded) obj).data);
        }

        public final int hashCode() {
            Object obj = this.data;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DataLoaded(data=", ")", this.data);
        }
    }

    /* loaded from: classes6.dex */
    public final class DataLoading extends DataLoadingState {
        public static final DataLoading INSTANCE = new DataLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DataLoading);
        }

        public final int hashCode() {
            return -1382015368;
        }

        public final String toString() {
            return "DataLoading";
        }
    }
}
