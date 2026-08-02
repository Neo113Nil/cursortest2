package com.squareup.cash.genericelements.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.fileupload.api.UriString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class GenericTreeElementsScreen implements Screen {

    /* loaded from: classes6.dex */
    public final class GenericTreeElementsFullScreen extends GenericTreeElementsScreen {
        public static final Parcelable.Creator<GenericTreeElementsFullScreen> CREATOR = new UriString.Creator(9);
        public final String elementsContext;
        public final String entityToken;
        public final String referrerFlowToken;

        public GenericTreeElementsFullScreen(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.elementsContext = str;
            this.entityToken = str2;
            this.referrerFlowToken = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericTreeElementsFullScreen)) {
                return false;
            }
            GenericTreeElementsFullScreen genericTreeElementsFullScreen = (GenericTreeElementsFullScreen) obj;
            return Intrinsics.areEqual(this.elementsContext, genericTreeElementsFullScreen.elementsContext) && Intrinsics.areEqual(this.entityToken, genericTreeElementsFullScreen.entityToken) && Intrinsics.areEqual(this.referrerFlowToken, genericTreeElementsFullScreen.referrerFlowToken);
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getElementsContext() {
            return this.elementsContext;
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getEntityToken() {
            return this.entityToken;
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getReferrerFlowToken() {
            return this.referrerFlowToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elementsContext.hashCode() * 31, 31, this.entityToken);
            String str = this.referrerFlowToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericTreeElementsFullScreen(elementsContext=", this.elementsContext, ", entityToken=", this.entityToken, ", referrerFlowToken="), this.referrerFlowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.elementsContext);
            parcel.writeString(this.entityToken);
            parcel.writeString(this.referrerFlowToken);
        }
    }

    /* loaded from: classes6.dex */
    public final class GenericTreeElementsSheet extends GenericTreeElementsScreen implements BottomSheetScreen {
        public static final Parcelable.Creator<GenericTreeElementsSheet> CREATOR = new UriString.Creator(10);
        public final String elementsContext;
        public final String entityToken;
        public final String referrerFlowToken;

        public GenericTreeElementsSheet(String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            this.elementsContext = str;
            this.entityToken = str2;
            this.referrerFlowToken = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericTreeElementsSheet)) {
                return false;
            }
            GenericTreeElementsSheet genericTreeElementsSheet = (GenericTreeElementsSheet) obj;
            return Intrinsics.areEqual(this.elementsContext, genericTreeElementsSheet.elementsContext) && Intrinsics.areEqual(this.entityToken, genericTreeElementsSheet.entityToken) && Intrinsics.areEqual(this.referrerFlowToken, genericTreeElementsSheet.referrerFlowToken);
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getElementsContext() {
            return this.elementsContext;
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getEntityToken() {
            return this.entityToken;
        }

        @Override // com.squareup.cash.genericelements.screens.GenericTreeElementsScreen
        public final String getReferrerFlowToken() {
            return this.referrerFlowToken;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elementsContext.hashCode() * 31, 31, this.entityToken);
            String str = this.referrerFlowToken;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericTreeElementsSheet(elementsContext=", this.elementsContext, ", entityToken=", this.entityToken, ", referrerFlowToken="), this.referrerFlowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.elementsContext);
            parcel.writeString(this.entityToken);
            parcel.writeString(this.referrerFlowToken);
        }
    }

    public abstract String getElementsContext();

    public abstract String getEntityToken();

    public abstract String getReferrerFlowToken();
}
