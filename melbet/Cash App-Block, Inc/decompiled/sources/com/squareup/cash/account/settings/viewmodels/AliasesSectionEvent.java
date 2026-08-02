package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AliasesSectionEvent {

    public abstract class NavigationAction extends AliasesSectionEvent {

        /* loaded from: classes7.dex */
        public final class AddEmail extends NavigationAction {
            public static final AddEmail INSTANCE = new AddEmail();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AddEmail);
            }

            public final int hashCode() {
                return -1296195235;
            }

            public final String toString() {
                return "AddEmail";
            }
        }

        /* loaded from: classes7.dex */
        public final class AddMobile extends NavigationAction {
            public static final AddMobile INSTANCE = new AddMobile();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AddMobile);
            }

            public final int hashCode() {
                return -1296436479;
            }

            public final String toString() {
                return "AddMobile";
            }
        }

        /* loaded from: classes7.dex */
        public final class RemoveAlias extends NavigationAction {
            public final ProfileAlias alias;

            public RemoveAlias(ProfileAlias profileAlias) {
                this.alias = profileAlias;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveAlias) && this.alias.equals(((RemoveAlias) obj).alias);
            }

            public final int hashCode() {
                return this.alias.hashCode();
            }

            public final String toString() {
                return "RemoveAlias(alias=" + this.alias + ")";
            }
        }

        public final class ShowMenu extends NavigationAction {
            public static final ShowMenu INSTANCE = new ShowMenu();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowMenu);
            }

            public final int hashCode() {
                return -375185442;
            }

            public final String toString() {
                return "ShowMenu";
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class UnregisterAlias extends AliasesSectionEvent {
        public final String text;

        /* renamed from: type, reason: collision with root package name */
        public final UiAlias.Type f1037type;
        public final boolean verified;

        public UnregisterAlias(UiAlias.Type type2, String str, boolean z) {
            type2.getClass();
            str.getClass();
            this.f1037type = type2;
            this.text = str;
            this.verified = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnregisterAlias)) {
                return false;
            }
            UnregisterAlias unregisterAlias = (UnregisterAlias) obj;
            return this.f1037type == unregisterAlias.f1037type && Intrinsics.areEqual(this.text, unregisterAlias.text) && this.verified == unregisterAlias.verified;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.verified) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1037type.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnregisterAlias(type=");
            sb.append(this.f1037type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", verified=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.verified, ")");
        }
    }
}
