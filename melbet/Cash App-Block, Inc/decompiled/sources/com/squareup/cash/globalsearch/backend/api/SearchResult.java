package com.squareup.cash.globalsearch.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SearchResult {

    public final class Error implements SearchResult {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1051307326;
        }

        public final String toString() {
            return "Error";
        }
    }

    public interface HasSections extends SearchResult {
        List getSections();
    }

    public final class LocalFirst implements HasSections {
        public final ArrayList sections;

        public LocalFirst(ArrayList arrayList) {
            this.sections = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalFirst) && this.sections.equals(((LocalFirst) obj).sections);
        }

        @Override // com.squareup.cash.globalsearch.backend.api.SearchResult.HasSections
        public final List getSections() {
            return this.sections;
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("LocalFirst(sections=", ")", this.sections);
        }
    }

    public final class LocalOnly implements HasSections {
        public final ArrayList sections;

        public LocalOnly(ArrayList arrayList) {
            this.sections = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalOnly) && this.sections.equals(((LocalOnly) obj).sections);
        }

        @Override // com.squareup.cash.globalsearch.backend.api.SearchResult.HasSections
        public final List getSections() {
            return this.sections;
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("LocalOnly(sections=", ")", this.sections);
        }
    }

    public final class Success implements HasSections {
        public final List sections;

        public Success(List list) {
            list.getClass();
            this.sections = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.sections, ((Success) obj).sections);
        }

        @Override // com.squareup.cash.globalsearch.backend.api.SearchResult.HasSections
        public final List getSections() {
            return this.sections;
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Success(sections=", ")", this.sections);
        }
    }
}
