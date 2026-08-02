package com.squareup.address.typeahead.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AddressSearcher$SearchResult {

    /* loaded from: classes9.dex */
    public final class Failure extends AddressSearcher$SearchResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 953814334;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Success extends AddressSearcher$SearchResult {
        public final List searchResults;

        public Success(List list) {
            list.getClass();
            this.searchResults = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.searchResults, ((Success) obj).searchResults);
        }

        public final int hashCode() {
            return this.searchResults.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(searchResults=", ")", this.searchResults);
        }
    }

    static {
        new Success(EmptyList.INSTANCE);
    }
}
