package com.squareup.cash.earnings.backend.api.mapper;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.earnings.backend.api.EarningsParsingErrorFactory;
import com.squareup.cash.earnings.backend.api.EarningsProtoParsingError;
import com.squareup.cash.earnings.backend.api.model.AllocationDestination;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.InvestingDestination;
import squareup.cash.paychecks.SavingsDestination;

/* loaded from: classes6.dex */
public abstract class AllocationDestinationMappersKt {
    public static final AllocationDestination toAllocationDestination(ProtoValidationScope protoValidationScope, squareup.cash.paychecks.AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        AllocationDestination.Destination destination = allocationDestination.destination;
        if (destination instanceof AllocationDestination.Destination.CashBalance) {
            return AllocationDestination.CashBalanceDestination.INSTANCE;
        }
        boolean z = destination instanceof AllocationDestination.Destination.Savings;
        EarningsParsingErrorFactory earningsParsingErrorFactory = EarningsParsingErrorFactory.INSTANCE;
        AllocationDestination.InvestingDestination.UiSpecification uiSpecification = null;
        if (z) {
            SavingsDestination value = ((AllocationDestination.Destination.Savings) destination).getValue();
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(value, earningsParsingErrorFactory, protoValidationScope);
                SavingsDestination.Identifier identifier = value.identifier;
                AllocationDestination.SavingsDestination.Identifier identifier2 = identifier != null ? toIdentifier(protoValidationScope2, identifier) : AllocationDestination.SavingsDestination.Identifier.None.INSTANCE;
                SavingsDestination.UiSpecification uiSpecification2 = value.ui_specification;
                return new AllocationDestination.SavingsDestination(identifier2, uiSpecification2 != null ? toSavingsUiSpecification(protoValidationScope2, uiSpecification2) : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, value != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.class) : null, earningsParsingErrorFactory, null);
            }
        }
        if (destination instanceof AllocationDestination.Destination.Bitcoin) {
            return AllocationDestination.BitcoinDestination.INSTANCE;
        }
        if (!(destination instanceof AllocationDestination.Destination.Investing)) {
            if (destination == null) {
                throw new EarningsProtoParsingError(String.valueOf(Reflection.factory.getOrCreateKotlinClass(squareup.cash.paychecks.AllocationDestination.class).getSimpleName()), ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, null, null);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        InvestingDestination value2 = ((AllocationDestination.Destination.Investing) destination).getValue();
        String str = value2.investment_entity_token;
        InvestingDestination.UiSpecification uiSpecification3 = value2.ui_specification;
        if (uiSpecification3 != null) {
            try {
                uiSpecification = new AllocationDestination.InvestingDestination.UiSpecification(uiSpecification3.icon, uiSpecification3.display_name, uiSpecification3.symbol);
            } catch (Exception e2) {
                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(InvestingDestination.UiSpecification.class), earningsParsingErrorFactory, null);
            }
        }
        return new AllocationDestination.InvestingDestination(str, uiSpecification);
    }

    public static final AllocationDestination.SavingsDestination.Identifier toIdentifier(ProtoValidationScope protoValidationScope, SavingsDestination.Identifier identifier) {
        try {
            SavingsDestination.Identifier.Type type2 = identifier.type;
            if (type2 instanceof SavingsDestination.Identifier.Type.GeneralFolder) {
                return new AllocationDestination.SavingsDestination.Identifier.WholeSavings("general_folder");
            }
            if (!(type2 instanceof SavingsDestination.Identifier.Type.GoalFolder)) {
                if (type2 == null) {
                    throw new EarningsProtoParsingError(String.valueOf(Reflection.factory.getOrCreateKotlinClass(SavingsDestination.Identifier.class).getSimpleName()), ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, null, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            String str = ((SavingsDestination.Identifier.Type.GoalFolder) type2).getValue().goal_folder_token;
            if (str != null) {
                return new AllocationDestination.SavingsDestination.Identifier.GoalToken(str);
            }
            throw new IllegalArgumentException("goal_folder_token");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, identifier != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.Identifier.class) : null, EarningsParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final AllocationDestination.SavingsDestination.UiSpecification toSavingsUiSpecification(ProtoValidationScope protoValidationScope, SavingsDestination.UiSpecification uiSpecification) {
        EarningsParsingErrorFactory earningsParsingErrorFactory = EarningsParsingErrorFactory.INSTANCE;
        try {
            String str = uiSpecification.name;
            try {
                ProtoValidationScope.required(str, "name");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(uiSpecification.getClass()) : null, earningsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str2 = uiSpecification.icon_id;
            try {
                ProtoValidationScope.required(str2, "icon_id");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(uiSpecification.getClass()) : null, earningsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str2 = null;
            }
            return new AllocationDestination.SavingsDestination.UiSpecification(str, str2);
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.UiSpecification.class) : null, earningsParsingErrorFactory, null);
        }
    }
}
