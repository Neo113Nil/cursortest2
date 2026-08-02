package com.squareup.cash.globalsearch.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GlobalSearchResponseSectionModel {

    public final class Activities implements GlobalSearchResponseSectionModel {
        public final String id;
        public final List items;
        public final String paginationCursor;
        public final boolean showLoadMore;
        public final String title;
        public final GlobalSearchViewModel.Modal warning;

        public Activities(String str, String str2, List list, String str3, boolean z, GlobalSearchViewModel.Modal modal) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.title = str2;
            this.items = list;
            this.paginationCursor = str3;
            this.showLoadMore = z;
            this.warning = modal;
        }

        public static Activities copy$default(Activities activities, List list, int i) {
            String str = activities.id;
            String str2 = activities.title;
            String str3 = activities.paginationCursor;
            boolean z = (i & 16) != 0 ? activities.showLoadMore : true;
            GlobalSearchViewModel.Modal modal = activities.warning;
            activities.getClass();
            str.getClass();
            str2.getClass();
            list.getClass();
            return new Activities(str, str2, list, str3, z, modal);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activities)) {
                return false;
            }
            Activities activities = (Activities) obj;
            return Intrinsics.areEqual(this.id, activities.id) && Intrinsics.areEqual(this.title, activities.title) && this.items.equals(activities.items) && Intrinsics.areEqual(this.paginationCursor, activities.paginationCursor) && this.showLoadMore == activities.showLoadMore && Intrinsics.areEqual(this.warning, activities.warning);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getId() {
            return this.id;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final List getItems() {
            return this.items;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getPaginationCursor() {
            return this.paginationCursor;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.items);
            String str = this.paginationCursor;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.showLoadMore);
            GlobalSearchViewModel.Modal modal = this.warning;
            return m2 + (modal != null ? modal.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Activities(id=", this.id, ", title=", this.title, ", items=");
            Recorder$$ExternalSyntheticOutline2.m(", paginationCursor=", this.paginationCursor, ", showLoadMore=", m, this.items);
            m.append(this.showLoadMore);
            m.append(", warning=");
            m.append(this.warning);
            m.append(")");
            return m.toString();
        }
    }

    public final class Rows implements GlobalSearchResponseSectionModel {
        public final String id;
        public final List items;
        public final String paginationCursor;
        public final boolean showLoadMore;
        public final String title;
        public final GlobalSearchViewModel.Modal warning;

        public Rows(String str, String str2, List list, String str3, boolean z, GlobalSearchViewModel.Modal modal) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.title = str2;
            this.items = list;
            this.paginationCursor = str3;
            this.showLoadMore = z;
            this.warning = modal;
        }

        public static Rows copy$default(Rows rows, String str, List list, boolean z, int i) {
            String str2 = rows.id;
            if ((i & 2) != 0) {
                str = rows.title;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                list = rows.items;
            }
            List list2 = list;
            String str4 = rows.paginationCursor;
            if ((i & 16) != 0) {
                z = rows.showLoadMore;
            }
            GlobalSearchViewModel.Modal modal = rows.warning;
            rows.getClass();
            str2.getClass();
            str3.getClass();
            list2.getClass();
            return new Rows(str2, str3, list2, str4, z, modal);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rows)) {
                return false;
            }
            Rows rows = (Rows) obj;
            return Intrinsics.areEqual(this.id, rows.id) && Intrinsics.areEqual(this.title, rows.title) && this.items.equals(rows.items) && Intrinsics.areEqual(this.paginationCursor, rows.paginationCursor) && this.showLoadMore == rows.showLoadMore && Intrinsics.areEqual(this.warning, rows.warning);
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getId() {
            return this.id;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final List getItems() {
            return this.items;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getPaginationCursor() {
            return this.paginationCursor;
        }

        @Override // com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.title), 31, this.items);
            String str = this.paginationCursor;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.showLoadMore);
            GlobalSearchViewModel.Modal modal = this.warning;
            return m2 + (modal != null ? modal.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Rows(id=", this.id, ", title=", this.title, ", items=");
            Recorder$$ExternalSyntheticOutline2.m(", paginationCursor=", this.paginationCursor, ", showLoadMore=", m, this.items);
            m.append(this.showLoadMore);
            m.append(", warning=");
            m.append(this.warning);
            m.append(")");
            return m.toString();
        }
    }

    String getId();

    List getItems();

    String getPaginationCursor();

    String getTitle();
}
