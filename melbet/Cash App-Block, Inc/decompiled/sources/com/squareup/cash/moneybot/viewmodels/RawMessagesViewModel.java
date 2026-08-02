package com.squareup.cash.moneybot.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface RawMessagesViewModel {

    public final class Error implements RawMessagesViewModel {
        public final String title;

        public Error(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.title, ((Error) obj).title);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ")");
        }
    }

    public final class Loaded implements RawMessagesViewModel {
        public final List messages;
        public final String title;

        public Loaded(String str, List list) {
            str.getClass();
            list.getClass();
            this.title = str;
            this.messages = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.messages, loaded.messages);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.messages.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(title=", this.title, ", messages=", ")", this.messages);
        }
    }

    /* loaded from: classes7.dex */
    public final class Loading implements RawMessagesViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        @Override // com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    String getTitle();
}
