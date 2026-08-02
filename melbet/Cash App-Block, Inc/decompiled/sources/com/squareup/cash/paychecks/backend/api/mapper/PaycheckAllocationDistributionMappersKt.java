package com.squareup.cash.paychecks.backend.api.mapper;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import androidx.compose.ui.draw.RotateKt;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public abstract class PaycheckAllocationDistributionMappersKt {
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

    public static final List sortAllocations(List list) {
        list.getClass();
        Comparator thenComparing = new b.C0008b(26).thenComparing(new VideoCapture$$ExternalSyntheticLambda6(new PaycheckCircles$$ExternalSyntheticLambda4(1), 9));
        thenComparing.getClass();
        return CollectionsKt.sortedWith(CollectionsKt.sortedWith(list, thenComparing), new b.C0008b(27));
    }

    public static final PaycheckAllocationDistribution toCondensedPaycheckAllocationDistribution(HasObservability hasObservability, AllocationDistribution allocationDistribution, PaychecksUiConfiguration paychecksUiConfiguration) {
        allocationDistribution.getClass();
        if (paychecksUiConfiguration == null) {
            return null;
        }
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(allocationDistribution, paychecksParsingErrorFactory, hasObservability);
            List<AllocationDistribution.DestinationAndShare> list = allocationDistribution.allocations;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toDestinationAndShare(protoValidationScope, (AllocationDistribution.DestinationAndShare) it.next()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(((PaycheckAllocationDistribution.DestinationAndShare) next).destination.getClass());
                Object obj = linkedHashMap.get(orCreateKotlinClass);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(orCreateKotlinClass, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                KClass kClass = (KClass) entry.getKey();
                List list2 = (List) entry.getValue();
                for (Object obj2 : paychecksUiConfiguration.destinationUiConfigs) {
                    if (Reflection.factory.getOrCreateKotlinClass(((PaychecksUiConfiguration.PaychecksDestinationUi) obj2).destination.getClass()).equals(kClass)) {
                        AllocationDestination allocationDestination = ((PaychecksUiConfiguration.PaychecksDestinationUi) obj2).destination;
                        Iterator it3 = list2.iterator();
                        long j = 0;
                        while (it3.hasNext()) {
                            j += ((PaycheckAllocationDistribution.DestinationAndShare) it3.next()).shareInBasisPoints;
                        }
                        AllocationDestination allocationDestination2 = AllocationDestination.BitcoinDestination.INSTANCE;
                        if (!allocationDestination.equals(allocationDestination2)) {
                            allocationDestination2 = AllocationDestination.CashBalanceDestination.INSTANCE;
                            if (!allocationDestination.equals(allocationDestination2)) {
                                if (allocationDestination instanceof AllocationDestination.InvestingDestination) {
                                    allocationDestination2 = new AllocationDestination.InvestingDestination(null, ((AllocationDestination.InvestingDestination) allocationDestination).uiSpecification);
                                } else {
                                    if (!(allocationDestination instanceof AllocationDestination.SavingsDestination)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    allocationDestination2 = new AllocationDestination.SavingsDestination(AllocationDestination.SavingsDestination.Identifier.None.INSTANCE, null);
                                }
                            }
                        }
                        arrayList2.add(new PaycheckAllocationDistribution.DestinationAndShare(allocationDestination2, j));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            return new PaycheckAllocationDistribution(sortAllocations(arrayList2));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.class), paychecksParsingErrorFactory, null);
        }
    }

    public static final PaycheckAllocationDistribution.DestinationAndShare toDestinationAndShare(ProtoValidationScope protoValidationScope, AllocationDistribution.DestinationAndShare destinationAndShare) {
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(destinationAndShare, paychecksParsingErrorFactory, protoValidationScope);
            squareup.cash.paychecks.AllocationDestination allocationDestination = destinationAndShare.allocation_destination;
            ProtoValidationScope.required(allocationDestination, "allocation_destination");
            AllocationDestination allocationDestination2 = CommonMappersKt.toAllocationDestination(protoValidationScope2, allocationDestination);
            Long l = destinationAndShare.share_in_basis_points;
            ProtoValidationScope.required(l, "share_in_basis_points");
            return new PaycheckAllocationDistribution.DestinationAndShare(allocationDestination2, l.longValue());
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, destinationAndShare != null ? Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.DestinationAndShare.class) : null, paychecksParsingErrorFactory, null);
        }
    }

    public static final PaycheckAllocationDistribution toPaycheckAllocationDistribution(ProtoValidationScope protoValidationScope, AllocationDistribution allocationDistribution) {
        allocationDistribution.getClass();
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(allocationDistribution, paychecksParsingErrorFactory, protoValidationScope);
            List<AllocationDistribution.DestinationAndShare> list = allocationDistribution.allocations;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toDestinationAndShare(protoValidationScope2, (AllocationDistribution.DestinationAndShare) it.next()));
            }
            return new PaycheckAllocationDistribution(arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(AllocationDistribution.class), paychecksParsingErrorFactory, null);
        }
    }
}
