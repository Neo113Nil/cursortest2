package com.squareup.cash.paychecks.backend.api.mapper;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.PaychecksProtoParsingError;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.protos.cash.localization.LocalizedString;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.BitcoinDestination;
import squareup.cash.paychecks.CashBalanceDestination;
import squareup.cash.paychecks.InvestingDestination;
import squareup.cash.paychecks.SavingsDestination;

/* loaded from: classes6.dex */
public abstract class CommonMappersKt {
    public static final AllocationDestination toAllocationDestination(ProtoValidationScope protoValidationScope, squareup.cash.paychecks.AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        AllocationDestination.Destination destination = allocationDestination.destination;
        if (destination instanceof AllocationDestination.Destination.CashBalance) {
            return AllocationDestination.CashBalanceDestination.INSTANCE;
        }
        boolean z = destination instanceof AllocationDestination.Destination.Savings;
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        AllocationDestination.InvestingDestination.UiSpecification uiSpecification = null;
        if (z) {
            SavingsDestination value = ((AllocationDestination.Destination.Savings) destination).getValue();
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(value, paychecksParsingErrorFactory, protoValidationScope);
                SavingsDestination.Identifier identifier = value.identifier;
                AllocationDestination.SavingsDestination.Identifier identifier2 = identifier != null ? toIdentifier(protoValidationScope2, identifier) : AllocationDestination.SavingsDestination.Identifier.None.INSTANCE;
                SavingsDestination.UiSpecification uiSpecification2 = value.ui_specification;
                return new AllocationDestination.SavingsDestination(identifier2, uiSpecification2 != null ? toSavingsUiSpecification(protoValidationScope2, uiSpecification2) : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, value != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.class) : null, paychecksParsingErrorFactory, null);
            }
        }
        if (destination instanceof AllocationDestination.Destination.Bitcoin) {
            return AllocationDestination.BitcoinDestination.INSTANCE;
        }
        if (!(destination instanceof AllocationDestination.Destination.Investing)) {
            throw new PaychecksProtoParsingError(String.valueOf(Reflection.factory.getOrCreateKotlinClass(squareup.cash.paychecks.AllocationDestination.class).getSimpleName()), ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, (String) null, 12);
        }
        InvestingDestination value2 = ((AllocationDestination.Destination.Investing) destination).getValue();
        String str = value2.investment_entity_token;
        InvestingDestination.UiSpecification uiSpecification3 = value2.ui_specification;
        if (uiSpecification3 != null) {
            try {
                uiSpecification = new AllocationDestination.InvestingDestination.UiSpecification(uiSpecification3.icon, uiSpecification3.display_name, uiSpecification3.symbol);
            } catch (Exception e2) {
                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(InvestingDestination.UiSpecification.class), paychecksParsingErrorFactory, null);
            }
        }
        return new AllocationDestination.InvestingDestination(str, uiSpecification);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, okio.ByteString] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final squareup.cash.paychecks.AllocationDestination toAllocationDestinationProto(com.squareup.cash.paychecks.backend.api.model.AllocationDestination allocationDestination) {
        SavingsDestination.Identifier identifier;
        allocationDestination.getClass();
        if (allocationDestination instanceof AllocationDestination.CashBalanceDestination) {
            return new squareup.cash.paychecks.AllocationDestination(new AllocationDestination.Destination.CashBalance(new CashBalanceDestination(ByteString.EMPTY)));
        }
        InvestingDestination.UiSpecification uiSpecification = 0;
        SavingsDestination.UiSpecification uiSpecification2 = null;
        if (!(allocationDestination instanceof AllocationDestination.SavingsDestination)) {
            if (allocationDestination instanceof AllocationDestination.BitcoinDestination) {
                return new squareup.cash.paychecks.AllocationDestination(new AllocationDestination.Destination.Bitcoin(new BitcoinDestination()));
            }
            if (!(allocationDestination instanceof AllocationDestination.InvestingDestination)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            AllocationDestination.InvestingDestination investingDestination = (AllocationDestination.InvestingDestination) allocationDestination;
            String str = investingDestination.entityToken;
            AllocationDestination.InvestingDestination.UiSpecification uiSpecification3 = investingDestination.uiSpecification;
            if (uiSpecification3 != null) {
                uiSpecification = new InvestingDestination.UiSpecification(uiSpecification3.displayName, uiSpecification3.symbol, uiSpecification3.icon, null, 8, null);
            }
            return new squareup.cash.paychecks.AllocationDestination(new AllocationDestination.Destination.Investing(new InvestingDestination(str, uiSpecification, ByteString.EMPTY)));
        }
        AllocationDestination.SavingsDestination savingsDestination = (AllocationDestination.SavingsDestination) allocationDestination;
        AllocationDestination.SavingsDestination.Identifier identifier2 = savingsDestination.identifier;
        if (identifier2 instanceof AllocationDestination.SavingsDestination.Identifier.None) {
            identifier = null;
        } else {
            int i = 2;
            if (identifier2 instanceof AllocationDestination.SavingsDestination.Identifier.GeneralFolder) {
                identifier = new SavingsDestination.Identifier(new SavingsDestination.Identifier.Type.GeneralFolder(new SavingsDestination.Identifier.GeneralFolder(uiSpecification, 1, uiSpecification)), uiSpecification, i, uiSpecification);
            } else {
                if (!(identifier2 instanceof AllocationDestination.SavingsDestination.Identifier.GoalFolder)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                identifier = new SavingsDestination.Identifier(new SavingsDestination.Identifier.Type.GoalFolder(new SavingsDestination.Identifier.GoalFolder(((AllocationDestination.SavingsDestination.Identifier.GoalFolder) identifier2).goalToken, uiSpecification, i, uiSpecification)), uiSpecification, i, uiSpecification);
            }
        }
        AllocationDestination.SavingsDestination.UiSpecification uiSpecification4 = savingsDestination.uiSpecification;
        if (uiSpecification4 != null) {
            uiSpecification2 = new SavingsDestination.UiSpecification(uiSpecification4.name, null, uiSpecification4.iconId, null, 10, null);
        }
        return new squareup.cash.paychecks.AllocationDestination(new AllocationDestination.Destination.Savings(new SavingsDestination(identifier, uiSpecification2, ByteString.EMPTY)));
    }

    public static final AllocationDestination.SavingsDestination.Identifier toIdentifier(ProtoValidationScope protoValidationScope, SavingsDestination.Identifier identifier) {
        try {
            SavingsDestination.Identifier.Type type2 = identifier.type;
            if (type2 instanceof SavingsDestination.Identifier.Type.GeneralFolder) {
                return AllocationDestination.SavingsDestination.Identifier.GeneralFolder.INSTANCE;
            }
            if (!(type2 instanceof SavingsDestination.Identifier.Type.GoalFolder)) {
                throw new PaychecksProtoParsingError(String.valueOf(Reflection.factory.getOrCreateKotlinClass(SavingsDestination.Identifier.class).getSimpleName()), ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, (String) null, 12);
            }
            String str = ((SavingsDestination.Identifier.Type.GoalFolder) type2).getValue().goal_folder_token;
            if (str != null) {
                return new AllocationDestination.SavingsDestination.Identifier.GoalFolder(str);
            }
            throw new IllegalArgumentException("goal_folder_token");
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, identifier != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.Identifier.class) : null, PaychecksParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final PaychecksAlertUi toPaychecksAlertUi(ProtoValidationScope protoValidationScope, AlertUi alertUi) {
        if (alertUi == null) {
            return new PaychecksAlertUi("Decrease other distributions to increase this one", "Your paycheck distributions must add up to 100%", "Got it");
        }
        LocalizedString localizedString = alertUi.title_text;
        return new PaychecksAlertUi(localizedString != null ? localizedString.translated_value : null, ProtoValidationScope.required(alertUi.detail_text, "detail_text"), ProtoValidationScope.required(alertUi.acknowledge_text, "acknowledge_text"));
    }

    public static final AllocationDestination.SavingsDestination.UiSpecification toSavingsUiSpecification(ProtoValidationScope protoValidationScope, SavingsDestination.UiSpecification uiSpecification) {
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            String str = uiSpecification.name;
            try {
                ProtoValidationScope.required(str, "name");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(uiSpecification.getClass()) : null, paychecksParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str2 = uiSpecification.icon_id;
            try {
                ProtoValidationScope.required(str2, "icon_id");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(uiSpecification.getClass()) : null, paychecksParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str2 = null;
            }
            return new AllocationDestination.SavingsDestination.UiSpecification(str, str2);
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, uiSpecification != null ? Reflection.factory.getOrCreateKotlinClass(SavingsDestination.UiSpecification.class) : null, paychecksParsingErrorFactory, null);
        }
    }
}
