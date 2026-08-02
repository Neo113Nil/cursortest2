package com.squareup.cash.pools.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public interface PoolInvitePeopleListViewModel {

    public final class Loaded implements PoolInvitePeopleListViewModel {
        public final String query;
        public final ImmutableList sections;
        public final boolean shouldShowShareSection;
        public final boolean showContactPermissionPrompt;
        public final InviteMemberSnackBarViewModel snackBarViewModel;

        public Loaded(AbstractPersistentList abstractPersistentList, String str, InviteMemberSnackBarViewModel inviteMemberSnackBarViewModel, boolean z, boolean z2) {
            abstractPersistentList.getClass();
            str.getClass();
            this.sections = abstractPersistentList;
            this.query = str;
            this.snackBarViewModel = inviteMemberSnackBarViewModel;
            this.shouldShowShareSection = z;
            this.showContactPermissionPrompt = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.sections, loaded.sections) && Intrinsics.areEqual(this.query, loaded.query) && Intrinsics.areEqual(this.snackBarViewModel, loaded.snackBarViewModel) && this.shouldShowShareSection == loaded.shouldShowShareSection && this.showContactPermissionPrompt == loaded.showContactPermissionPrompt;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sections.hashCode() * 31, 31, this.query);
            InviteMemberSnackBarViewModel inviteMemberSnackBarViewModel = this.snackBarViewModel;
            return Boolean.hashCode(this.showContactPermissionPrompt) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (inviteMemberSnackBarViewModel == null ? 0 : inviteMemberSnackBarViewModel.hashCode())) * 31, 31, this.shouldShowShareSection);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(sections=");
            sb.append(this.sections);
            sb.append(", query=");
            sb.append(this.query);
            sb.append(", snackBarViewModel=");
            sb.append(this.snackBarViewModel);
            sb.append(", shouldShowShareSection=");
            sb.append(this.shouldShowShareSection);
            sb.append(", showContactPermissionPrompt=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showContactPermissionPrompt, ")");
        }
    }

    public final class Loading implements PoolInvitePeopleListViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -124530806;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
