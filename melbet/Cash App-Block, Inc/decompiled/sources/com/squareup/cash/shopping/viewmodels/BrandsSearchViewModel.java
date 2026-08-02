package com.squareup.cash.shopping.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class BrandsSearchViewModel {

    public final class Loaded extends BrandsSearchViewModel {
        public final Error error;
        public final List items;
        public final String searchText;

        public final class Error {
            public final String message;

            public Error(String str) {
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.message, ((Error) obj).message);
            }

            public final int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(message=", this.message, ")");
            }
        }

        public Loaded(String str, List list, Error error) {
            str.getClass();
            list.getClass();
            this.searchText = str;
            this.items = list;
            this.error = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.searchText, loaded.searchText) && Intrinsics.areEqual(this.items, loaded.items) && Intrinsics.areEqual(this.error, loaded.error);
        }

        @Override // com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel
        public final String getSearchText() {
            return this.searchText;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.searchText.hashCode() * 31, 31, this.items);
            Error error = this.error;
            return m + (error == null ? 0 : error.hashCode());
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Loaded(searchText=", this.searchText, ", items=", ", error=", this.items);
            m.append(this.error);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends BrandsSearchViewModel {
        public final String searchText;

        public Loading(String str) {
            str.getClass();
            this.searchText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.searchText, ((Loading) obj).searchText);
        }

        @Override // com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel
        public final String getSearchText() {
            return this.searchText;
        }

        public final int hashCode() {
            return this.searchText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(searchText=", this.searchText, ")");
        }
    }

    public abstract String getSearchText();
}
