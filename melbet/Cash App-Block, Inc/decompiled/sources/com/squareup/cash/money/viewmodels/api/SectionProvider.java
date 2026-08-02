package com.squareup.cash.money.viewmodels.api;

import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.money.core.ids.SectionProviderId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public interface SectionProvider extends MoleculePresenter {

    public final class Content {
        public final boolean loading;
        public final List sections;

        public Content(List list, boolean z) {
            list.getClass();
            this.sections = list;
            this.loading = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.sections, content.sections) && this.loading == content.loading;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.loading) + (this.sections.hashCode() * 31);
        }

        public final String toString() {
            return "Content(sections=" + this.sections + ", loading=" + this.loading + ")";
        }
    }

    StateFlow getAvailabilityState();

    SectionProviderId getId();
}
