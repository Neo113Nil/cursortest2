package com.squareup.cash.earnings.backend.api.mapper;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.earnings.backend.api.EarningsParsingErrorFactory;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.earnings.backend.api.model.EarningsAllocationDistribution;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Reflection;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public abstract class EarningsAllocationDistributionMappersKt {
    public static final int defaultSortOrder(AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        if (allocationDestination instanceof AllocationDestination.SavingsDestination) {
            return 1;
        }
        if (allocationDestination instanceof AllocationDestination.BitcoinDestination) {
            return 2;
        }
        if (allocationDestination instanceof AllocationDestination.InvestingDestination) {
            return 3;
        }
        if (allocationDestination instanceof AllocationDestination.CashBalanceDestination) {
            return 4;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static final EarningsAllocationDistribution.DestinationAndShare toDestinationAndShare(ProtoValidationScope protoValidationScope, AllocationDistribution.DestinationAndShare destinationAndShare) {
        EarningsParsingErrorFactory earningsParsingErrorFactory = EarningsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(destinationAndShare, earningsParsingErrorFactory, protoValidationScope);
            squareup.cash.paychecks.AllocationDestination allocationDestination = destinationAndShare.allocation_destination;
            ProtoValidationScope.required(allocationDestination, "allocation_destination");
            AllocationDestination allocationDestination2 = AllocationDestinationMappersKt.toAllocationDestination(protoValidationScope2, allocationDestination);
            Long l = destinationAndShare.share_in_basis_points;
            ProtoValidationScope.required(l, "share_in_basis_points");
            return new EarningsAllocationDistribution.DestinationAndShare(allocationDestination2, l.longValue());
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, destinationAndShare != null ? Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.DestinationAndShare.class) : null, earningsParsingErrorFactory, null);
        }
    }
}
