package androidx.compose.material.pullrefresh;

import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$Atm;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$Borrow;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$Overdraft;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$PrioritySupport;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$Savings;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1$Benefit$Element$WeeklyOffers;

/* loaded from: classes3.dex */
public abstract class PullRefreshKt {
    public static final GreenBenefitsV1.Benefit.ATMBenefit access$getAtm(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$Atm greenBenefitsV1$Benefit$Element$Atm = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Atm ? (GreenBenefitsV1$Benefit$Element$Atm) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$Atm != null) {
            return greenBenefitsV1$Benefit$Element$Atm.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.BorrowBenefit access$getBorrow(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$Borrow greenBenefitsV1$Benefit$Element$Borrow = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Borrow ? (GreenBenefitsV1$Benefit$Element$Borrow) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$Borrow != null) {
            return greenBenefitsV1$Benefit$Element$Borrow.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.OverdraftBenefit access$getOverdraft(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$Overdraft greenBenefitsV1$Benefit$Element$Overdraft = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Overdraft ? (GreenBenefitsV1$Benefit$Element$Overdraft) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$Overdraft != null) {
            return greenBenefitsV1$Benefit$Element$Overdraft.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit access$getPaper_money_deposit(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit greenBenefitsV1$Benefit$Element$PaperMoneyDeposit = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit ? (GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$PaperMoneyDeposit != null) {
            return greenBenefitsV1$Benefit$Element$PaperMoneyDeposit.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.PrioritySupportBenefit access$getPriority_support(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$PrioritySupport greenBenefitsV1$Benefit$Element$PrioritySupport = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PrioritySupport ? (GreenBenefitsV1$Benefit$Element$PrioritySupport) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$PrioritySupport != null) {
            return greenBenefitsV1$Benefit$Element$PrioritySupport.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.SavingsBenefit access$getSavings(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$Savings greenBenefitsV1$Benefit$Element$Savings = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings ? (GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$Savings != null) {
            return greenBenefitsV1$Benefit$Element$Savings.value;
        }
        return null;
    }

    public static final GreenBenefitsV1.Benefit.WeeklyOffersBenefit access$getWeekly_offers(DisclosureSectionKt disclosureSectionKt) {
        GreenBenefitsV1$Benefit$Element$WeeklyOffers greenBenefitsV1$Benefit$Element$WeeklyOffers = disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers ? (GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt : null;
        if (greenBenefitsV1$Benefit$Element$WeeklyOffers != null) {
            return greenBenefitsV1$Benefit$Element$WeeklyOffers.value;
        }
        return null;
    }

    public static NearbyAdvertisement fromByteArray(byte[] bArr) {
        bArr.getClass();
        byte[] sliceArray = ArraysKt___ArraysKt.sliceArray(bArr, RangesKt___RangesKt.until(0, 4));
        sliceArray.getClass();
        byte[] bArr2 = new byte[4];
        ArraysKt___ArraysJvmKt.copyInto$default(sliceArray, bArr2, 0, 0, 0, 14);
        String str = new String(ArraysKt___ArraysKt.sliceArray(bArr2, RangesKt___RangesKt.until(0, 2)), Charsets.UTF_8);
        SliceStatus.Companion companion = NearbyContext.NearbyIntent.Companion;
        byte b = bArr2[2];
        companion.getClass();
        NearbyContext.NearbyIntent m3877fromValue = SliceStatus.Companion.m3877fromValue((int) b);
        if (m3877fromValue == null) {
            m3877fromValue = NearbyContext.NearbyIntent.NEARBY_INTENT_UNSPECIFIED;
        }
        return new NearbyAdvertisement(new NearbyIdentifier(str, m3877fromValue, bArr2[3]), ArraysKt___ArraysKt.sliceArray(bArr, RangesKt___RangesKt.until(4, 16)));
    }

    public static final Modifier pullRefresh(Modifier modifier, PullRefreshState pullRefreshState, boolean z) {
        return NestedScrollModifierKt.nestedScroll(modifier, new PullRefreshNestedScrollConnection(new GraphLoop$processingQueue$1(1, pullRefreshState, PullRefreshState.class, "onPull", "onPull$material(F)F", 0, 5), new HeroCardViewKt$Render$1$5$1.AnonymousClass2.C00682(2, pullRefreshState, PullRefreshState.class, "onRelease", "onRelease$material(F)F", 4, 3), z), null);
    }
}
