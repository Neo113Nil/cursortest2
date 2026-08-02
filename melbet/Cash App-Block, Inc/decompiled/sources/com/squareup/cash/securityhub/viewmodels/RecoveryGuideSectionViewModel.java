package com.squareup.cash.securityhub.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RecoveryGuideSectionViewModel {
    public final String body;
    public final Content content;
    public final RecoveryGuideSectionId id;
    public final String title;

    public interface Content {

        public final class Booklets implements Content {
            public final List booklets;

            public Booklets(List list) {
                list.getClass();
                this.booklets = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Booklets) && Intrinsics.areEqual(this.booklets, ((Booklets) obj).booklets);
            }

            public final int hashCode() {
                return this.booklets.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Booklets(booklets=", ")", this.booklets);
            }
        }

        public final class Rows implements Content {
            public final List rows;

            public Rows(List list) {
                list.getClass();
                this.rows = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Rows) && Intrinsics.areEqual(this.rows, ((Rows) obj).rows);
            }

            public final int hashCode() {
                return this.rows.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Rows(rows=", ")", this.rows);
            }
        }
    }

    public RecoveryGuideSectionViewModel(RecoveryGuideSectionId recoveryGuideSectionId, String str, String str2, Content content) {
        str.getClass();
        this.id = recoveryGuideSectionId;
        this.title = str;
        this.body = str2;
        this.content = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoveryGuideSectionViewModel)) {
            return false;
        }
        RecoveryGuideSectionViewModel recoveryGuideSectionViewModel = (RecoveryGuideSectionViewModel) obj;
        return this.id == recoveryGuideSectionViewModel.id && Intrinsics.areEqual(this.title, recoveryGuideSectionViewModel.title) && Intrinsics.areEqual(this.body, recoveryGuideSectionViewModel.body) && this.content.equals(recoveryGuideSectionViewModel.content);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title);
        String str = this.body;
        return this.content.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RecoveryGuideSectionViewModel(id=" + this.id + ", title=" + this.title + ", body=" + this.body + ", content=" + this.content + ")";
    }
}
