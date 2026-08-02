package com.squareup.cash.deposits.physical.viewmodels.onboarding;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositOnboardingEvent {

    public final class ButtonClick extends PaperMoneyDepositOnboardingEvent implements Paged {
        public final int page;

        public ButtonClick(int i) {
            this.page = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonClick) && this.page == ((ButtonClick) obj).page;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent.Paged
        public final int getPage() {
            return this.page;
        }

        public final int hashCode() {
            return Integer.hashCode(this.page);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.page, "ButtonClick(page=", ")");
        }
    }

    public final class Close extends PaperMoneyDepositOnboardingEvent implements Paged {
        public final int page;

        public Close(int i) {
            this.page = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && this.page == ((Close) obj).page;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent.Paged
        public final int getPage() {
            return this.page;
        }

        public final int hashCode() {
            return Integer.hashCode(this.page);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.page, "Close(page=", ")");
        }
    }

    public final class PageSwipeEvent extends PaperMoneyDepositOnboardingEvent implements Paged {
        public final int page;

        public PageSwipeEvent(int i) {
            this.page = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PageSwipeEvent) && this.page == ((PageSwipeEvent) obj).page;
        }

        @Override // com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingEvent.Paged
        public final int getPage() {
            return this.page;
        }

        public final int hashCode() {
            return Integer.hashCode(this.page);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.page, "PageSwipeEvent(page=", ")");
        }
    }

    public interface Paged {
        int getPage();
    }
}
