package androidx.compose.ui.platform;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_vision_face.zziz;
import com.google.android.gms.internal.mlkit_vision_face.zzjh;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModelKt$WhenMappings;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.PaychecksProtoParsingError;
import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.mapper.PaycheckAllocationDistributionMappersKt;
import com.squareup.cash.paychecks.backend.api.mapper.UiStateMappersKt$WhenMappings;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.LoanRepaymentSelectionData$Choice$Routing$ActionUrl;
import com.squareup.protos.lending.LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiAvatar;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Reflection;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.paychecks.BenefitsStatusSection$Button$Action_$ClientRoute;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;
import squareup.cash.paychecks.Deduction;
import squareup.cash.paychecks.Employer;
import squareup.cash.paychecks.Paycheck;
import squareup.cash.paychecks.RealizedAllocationAmount;
import squareup.cash.paychecks.TimeBoundedPaychecksAggregation;
import squareup.cash.paychecks.TreehouseAppletBrief;
import squareup.cash.paychecks.UiState;
import timber.log.Timber;

/* loaded from: classes3.dex */
public abstract class WindowInfoImpl implements WindowInfo {
    public static final ParcelableSnapshotMutableState GlobalKeyboardModifiers = Updater.mutableStateOf$default(new PointerKeyboardModifiers(0));

    public abstract class Companion {
        public static final PaychecksUiState.Applet buildApplet(HasObservability hasObservability, UiState uiState) {
            uiState.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(uiState, paychecksParsingErrorFactory, hasObservability);
                Long l = (Long) protoValidationScope.reportIfNullAndContinue("applet_text_rollover_date", (String) null, uiState.applet_text_rollover_date);
                String str = uiState.paychecks_applet_client_route;
                if (str == null) {
                    str = uiState.paychecks_on_money_tab_client_route;
                }
                String str2 = str;
                PaychecksUiState.PaychecksAppletState paychecksAppletState = toPaychecksAppletState(uiState.applet_state);
                PaychecksUiState.Applet.RolloverAwareContent buildText = buildText(protoValidationScope, l);
                String reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(uiState.pre_rollover_applet_text, "pre_rollover_applet_text", (String) null);
                String str3 = "";
                if (reportIfNullAndContinue == null) {
                    reportIfNullAndContinue = "";
                }
                String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(uiState.post_rollover_applet_text, "post_rollover_applet_text", (String) null);
                if (reportIfNullAndContinue2 != null) {
                    str3 = reportIfNullAndContinue2;
                }
                PaychecksUiState.Applet.RolloverAwareContent rolloverAwareContent = new PaychecksUiState.Applet.RolloverAwareContent(reportIfNullAndContinue, str3, l);
                LocalizedString localizedString = uiState.pre_rollover_applet_accessibility_value;
                String str4 = localizedString != null ? localizedString.translated_value : null;
                LocalizedString localizedString2 = uiState.post_rollover_applet_accessibility_value;
                PaychecksUiState.Applet.RolloverAwareContent rolloverAwareContent2 = new PaychecksUiState.Applet.RolloverAwareContent(str4, localizedString2 != null ? localizedString2.translated_value : null, l);
                TreehouseAppletBrief treehouseAppletBrief = uiState.applet_brief;
                ProtoValidationScope.required(treehouseAppletBrief, "applet_brief");
                Employer employer = treehouseAppletBrief.pre_rollover_employer;
                PaychecksUiState.Employer employer2 = employer != null ? toEmployer(protoValidationScope, employer) : null;
                Employer employer3 = treehouseAppletBrief.post_rollover_employer;
                PaychecksUiState.Applet.RolloverAwareContent rolloverAwareContent3 = new PaychecksUiState.Applet.RolloverAwareContent(employer2, employer3 != null ? toEmployer(protoValidationScope, employer3) : null, l);
                LocalizedString localizedString3 = uiState.applet_title_text;
                String str5 = localizedString3 != null ? localizedString3.translated_value : null;
                BenefitsStatusSection benefitsStatusSection = uiState.benefits_status_section;
                PaychecksUiState.PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = benefitsStatusSection != null ? toPaychecksBenefitsStatusSection(protoValidationScope, benefitsStatusSection) : null;
                LocalizedString localizedString4 = uiState.applet_banking_benefits_setup_cta_text;
                return new PaychecksUiState.Applet(str2, paychecksAppletState, rolloverAwareContent, buildText, rolloverAwareContent2, rolloverAwareContent3, str5, paychecksBenefitsStatusSection, localizedString4 != null ? localizedString4.translated_value : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UiState.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.Applet.RolloverAwareContent buildText(ProtoValidationScope protoValidationScope, Long l) {
            TreehouseAppletBrief treehouseAppletBrief = ((UiState) protoValidationScope.proto).applet_brief;
            ProtoValidationScope.required(treehouseAppletBrief, "applet_brief");
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(treehouseAppletBrief, paychecksParsingErrorFactory, protoValidationScope);
                String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(treehouseAppletBrief.pre_rollover_markdown_text, "pre_rollover_markdown_text", (String) null);
                String str = "";
                if (reportIfNullAndContinue == null) {
                    reportIfNullAndContinue = "";
                }
                String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(treehouseAppletBrief.post_rollover_markdown_text, "post_rollover_markdown_text", (String) null);
                if (reportIfNullAndContinue2 != null) {
                    str = reportIfNullAndContinue2;
                }
                return new PaychecksUiState.Applet.RolloverAwareContent(reportIfNullAndContinue, str, l);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(treehouseAppletBrief.getClass()), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.PaychecksBenefitsStatusSection.Button toButton(ProtoValidationScope protoValidationScope, BenefitsStatusSection.Button button) {
            try {
                LocalizedString localizedString = button.text;
                if (localizedString == null) {
                    throw new IllegalArgumentException("text");
                }
                String str = localizedString.translated_value;
                if (str == null) {
                    throw new IllegalArgumentException("text translated_value".toString());
                }
                BenefitsStatusSection$Button$Action_$ClientRoute benefitsStatusSection$Button$Action_$ClientRoute = button.Action;
                if (benefitsStatusSection$Button$Action_$ClientRoute == null) {
                    benefitsStatusSection$Button$Action_$ClientRoute = null;
                }
                String str2 = benefitsStatusSection$Button$Action_$ClientRoute != null ? benefitsStatusSection$Button$Action_$ClientRoute.value : null;
                if (str2 != null) {
                    return new PaychecksUiState.PaychecksBenefitsStatusSection.Button(str, str2);
                }
                throw new IllegalArgumentException("client_route");
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, button != null ? Reflection.factory.getOrCreateKotlinClass(BenefitsStatusSection.Button.class) : null, PaychecksParsingErrorFactory.INSTANCE, null);
            }
        }

        public static final PaychecksUiState.CalendarMonthPaychecksAggregation toCalendarMonthPaychecksAggregation(HasObservability hasObservability, CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation) {
            calendarMonthPaychecksAggregation.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(calendarMonthPaychecksAggregation, paychecksParsingErrorFactory, hasObservability);
                Long l = calendarMonthPaychecksAggregation.month_in_year;
                ProtoValidationScope.required(l, "month_in_year");
                long longValue = l.longValue();
                Long l2 = calendarMonthPaychecksAggregation.year;
                ProtoValidationScope.required(l2, "year");
                long longValue2 = l2.longValue();
                TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = calendarMonthPaychecksAggregation.aggregation;
                ProtoValidationScope.required(timeBoundedPaychecksAggregation, "aggregation");
                return new PaychecksUiState.CalendarMonthPaychecksAggregation(longValue, longValue2, toTimeBoundedPaychecksAggregation(protoValidationScope, timeBoundedPaychecksAggregation));
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CalendarMonthPaychecksAggregation.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.Deduction toDeduction(ProtoValidationScope protoValidationScope, Deduction deduction) {
            try {
                Money money = deduction.amount;
                ProtoValidationScope.required(money, "amount");
                String required = ProtoValidationScope.required(deduction.description, "description");
                LocalizedString localizedString = deduction.note;
                String str = localizedString != null ? localizedString.translated_value : null;
                Color color = deduction.tint_color;
                ProtoValidationScope.required(color, "tint_color");
                return new PaychecksUiState.Deduction(money, required, str, color);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, deduction != null ? Reflection.factory.getOrCreateKotlinClass(Deduction.class) : null, PaychecksParsingErrorFactory.INSTANCE, null);
            }
        }

        public static final PaychecksUiState.Employer toEmployer(ProtoValidationScope protoValidationScope, Employer employer) {
            PaychecksUiState.Employer.EmployerUiConfiguration employerUiConfiguration;
            employer.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                PayrollProviderUiSpecification payrollProviderUiSpecification = employer.ui_specification;
                if (payrollProviderUiSpecification != null) {
                    try {
                        String str = payrollProviderUiSpecification.title;
                        PayrollProviderUiAvatar payrollProviderUiAvatar = payrollProviderUiSpecification.avatar;
                        employerUiConfiguration = new PaychecksUiState.Employer.EmployerUiConfiguration(payrollProviderUiAvatar != null ? payrollProviderUiAvatar.avatar_accent_color : null, payrollProviderUiAvatar != null ? payrollProviderUiAvatar.avatar_url : null, str);
                    } catch (Exception e) {
                        throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(PayrollProviderUiSpecification.class), paychecksParsingErrorFactory, null);
                    }
                } else {
                    employerUiConfiguration = null;
                }
                return new PaychecksUiState.Employer(employerUiConfiguration);
            } catch (Exception e2) {
                throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(Employer.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.Paycheck toPaycheck(HasObservability hasObservability, Paycheck paycheck) {
            paycheck.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(paycheck, paychecksParsingErrorFactory, hasObservability);
                String str = paycheck.paycheck_token;
                ProtoValidationScope.required(str, "paycheck_token");
                Paycheck.SettlementDate settlementDate = paycheck.settlement_date;
                ProtoValidationScope.required(settlementDate, "settlement_date");
                PaychecksUiState.Paycheck.SettlementDate settlementDate2 = toSettlementDate(protoValidationScope, settlementDate);
                Employer employer = paycheck.employer;
                PaychecksUiState.Employer employer2 = employer != null ? toEmployer(protoValidationScope, employer) : null;
                AllocationDistribution allocationDistribution = paycheck.allocation_distribution;
                ProtoValidationScope.required(allocationDistribution, "allocation_distribution");
                PaycheckAllocationDistribution paycheckAllocationDistribution = PaycheckAllocationDistributionMappersKt.toPaycheckAllocationDistribution(protoValidationScope, allocationDistribution);
                List list = paycheck.deductions;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toDeduction(protoValidationScope, (Deduction) it.next()));
                }
                List list2 = paycheck.realized_allocation_amounts;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toRealizedAllocationAmount(protoValidationScope, (RealizedAllocationAmount) it2.next()));
                }
                return new PaychecksUiState.Paycheck(str, settlementDate2, employer2, paycheckAllocationDistribution, arrayList, arrayList2);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Paycheck.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.PaychecksAppletState toPaychecksAppletState(UiState.AppletState appletState) {
            int i = appletState == null ? -1 : UiStateMappersKt$WhenMappings.$EnumSwitchMapping$1[appletState.ordinal()];
            if (i == 1) {
                return PaychecksUiState.PaychecksAppletState.NULL_STATE;
            }
            if (i == 2) {
                return PaychecksUiState.PaychecksAppletState.ACTIVE_STATE;
            }
            if (i == 3) {
                return PaychecksUiState.PaychecksAppletState.HIDDEN;
            }
            PaychecksProtoParsingError paychecksProtoParsingError = new PaychecksProtoParsingError("AppletState", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, (String) null, 12);
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter != null) {
                errorReporter.report(paychecksProtoParsingError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return PaychecksUiState.PaychecksAppletState.HIDDEN;
            }
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
            return null;
        }

        public static final PaychecksUiState.PaychecksBenefitsStatusSection toPaychecksBenefitsStatusSection(ProtoValidationScope protoValidationScope, BenefitsStatusSection benefitsStatusSection) {
            PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState paychecksBenefitsState;
            benefitsStatusSection.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            String str = null;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(benefitsStatusSection, paychecksParsingErrorFactory, protoValidationScope);
                BenefitsStatusSection.ColoredText coloredText = benefitsStatusSection.title;
                ProtoValidationScope.required(coloredText, "title");
                PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText paychecksColoredText = toPaychecksColoredText(protoValidationScope2, coloredText);
                String required = ProtoValidationScope.required(benefitsStatusSection.subtitle, "subtitle");
                BenefitsStatusSection.State state = benefitsStatusSection.state;
                ProtoValidationScope.required(state, "state");
                int ordinal = state.ordinal();
                if (ordinal == 1) {
                    paychecksBenefitsState = PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.NULL_STATE;
                } else if (ordinal == 2) {
                    paychecksBenefitsState = PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.PENDING_STATE;
                } else if (ordinal == 3) {
                    paychecksBenefitsState = PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.ACTIVE_STATE;
                } else if (ordinal != 4) {
                    PaychecksProtoParsingError paychecksProtoParsingError = new PaychecksProtoParsingError("BenefitsStatusSection.State", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, str, 12);
                    ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                    ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter != null) {
                        errorReporter.report(paychecksProtoParsingError, defaultSamplingStrategy);
                        paychecksBenefitsState = PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.NULL_STATE;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                        paychecksBenefitsState = null;
                    }
                } else {
                    paychecksBenefitsState = PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.INACTIVE_STATE;
                }
                BenefitsStatusSection.Button button = benefitsStatusSection.view_benefits_button;
                return new PaychecksUiState.PaychecksBenefitsStatusSection(paychecksColoredText, required, paychecksBenefitsState, button != null ? toButton(protoValidationScope2, button) : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(BenefitsStatusSection.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText toPaychecksColoredText(ProtoValidationScope protoValidationScope, BenefitsStatusSection.ColoredText coloredText) {
            try {
                String required = ProtoValidationScope.required(coloredText.text, "text");
                String str = coloredText.placeholder_string;
                ProtoValidationScope.required(str, "placeholder_string");
                Color color = coloredText.tint_color;
                List list = coloredText.values;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ProtoValidationScope.required((LocalizedString) it.next(), "colored_text_value"));
                }
                return new PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText(required, str, color, arrayList);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, coloredText != null ? Reflection.factory.getOrCreateKotlinClass(BenefitsStatusSection.ColoredText.class) : null, PaychecksParsingErrorFactory.INSTANCE, null);
            }
        }

        public static final PaychecksUiState toPaychecksUiState(HasObservability hasObservability, UiState uiState) {
            uiState.getClass();
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(uiState, paychecksParsingErrorFactory, hasObservability);
                PaychecksUiState.Applet buildApplet = buildApplet(protoValidationScope, uiState);
                CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = uiState.displayed_monthly_aggregation;
                PaychecksUiState.CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation2 = calendarMonthPaychecksAggregation != null ? toCalendarMonthPaychecksAggregation(protoValidationScope, calendarMonthPaychecksAggregation) : null;
                Boolean bool = uiState.customer_dda_is_locked;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = uiState.customer_is_denylisted;
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                List list = uiState.upcoming_paychecks;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toPaycheck(protoValidationScope, (Paycheck) it.next()));
                }
                LocalizedString localizedString = uiState.activity_subtitle;
                String str = localizedString != null ? localizedString.translated_value : null;
                BenefitsStatusSection benefitsStatusSection = uiState.benefits_status_section;
                return new PaychecksUiState(buildApplet, calendarMonthPaychecksAggregation2, booleanValue, booleanValue2, arrayList, str, benefitsStatusSection != null ? toPaychecksBenefitsStatusSection(protoValidationScope, benefitsStatusSection) : null, uiState.shouldDisplayBenefitsBooklet);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UiState.class), paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.RealizedAllocationAmount toRealizedAllocationAmount(ProtoValidationScope protoValidationScope, RealizedAllocationAmount realizedAllocationAmount) {
            PaychecksUiState.RealizedAllocationAmount.State state;
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(realizedAllocationAmount, paychecksParsingErrorFactory, protoValidationScope);
                AllocationDestination allocationDestination = realizedAllocationAmount.destination;
                ProtoValidationScope.required(allocationDestination, "destination");
                com.squareup.cash.paychecks.backend.api.model.AllocationDestination allocationDestination2 = CommonMappersKt.toAllocationDestination(protoValidationScope2, allocationDestination);
                Money money = realizedAllocationAmount.realized_amount;
                ProtoValidationScope.required(money, "realized_amount");
                RealizedAllocationAmount.State state2 = realizedAllocationAmount.state;
                ProtoValidationScope.required(state2, "state");
                int ordinal = state2.ordinal();
                if (ordinal == 0) {
                    state = PaychecksUiState.RealizedAllocationAmount.State.PENDING;
                } else if (ordinal == 1) {
                    state = PaychecksUiState.RealizedAllocationAmount.State.COMPLETED;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    state = PaychecksUiState.RealizedAllocationAmount.State.ERRORED;
                }
                LocalizedString localizedString = realizedAllocationAmount.note;
                return new PaychecksUiState.RealizedAllocationAmount(allocationDestination2, money, state, localizedString != null ? localizedString.translated_value : null);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, realizedAllocationAmount != null ? Reflection.factory.getOrCreateKotlinClass(RealizedAllocationAmount.class) : null, paychecksParsingErrorFactory, null);
            }
        }

        public static final PaychecksUiState.Paycheck.SettlementDate toSettlementDate(ProtoValidationScope protoValidationScope, Paycheck.SettlementDate settlementDate) {
            PaychecksUiState.Paycheck.SettlementDate.Type type2;
            settlementDate.getClass();
            try {
                Paycheck.SettlementDate.Type type3 = settlementDate.f1639type;
                if (type3 == null) {
                    throw new IllegalArgumentException("type");
                }
                int ordinal = type3.ordinal();
                if (ordinal == 1) {
                    type2 = PaychecksUiState.Paycheck.SettlementDate.Type.PENDING;
                } else {
                    if (ordinal != 2) {
                        throw new PaychecksProtoParsingError(Paycheck.SettlementDate.Type.class.getSimpleName().toString(), ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, type3.toString(), 8);
                    }
                    type2 = PaychecksUiState.Paycheck.SettlementDate.Type.COMPLETED;
                }
                Long l = settlementDate.date;
                if (l != null) {
                    return new PaychecksUiState.Paycheck.SettlementDate(type2, l.longValue());
                }
                throw new IllegalArgumentException(InquiryField.DateField.TYPE);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Paycheck.SettlementDate.class), PaychecksParsingErrorFactory.INSTANCE, null);
            }
        }

        public static final BorrowHomeOverlayViewModel.LoanRepaymentSelection toSheet(LoanRepaymentSelectionData loanRepaymentSelectionData, TimeZone timeZone, DateTimeFormatter dateTimeFormatter, DateTimeFormatter dateTimeFormatter2) {
            TimeZone timeZone2;
            LocalDate localDate;
            BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon simple;
            SheetButtonAction repaymentSelection;
            String str;
            loanRepaymentSelectionData.getClass();
            dateTimeFormatter.getClass();
            dateTimeFormatter2.getClass();
            LocalizedString localizedString = loanRepaymentSelectionData.title;
            localizedString.getClass();
            String str2 = localizedString.translated_value;
            str2.getClass();
            List<LoanRepaymentSelectionData.Choice> list = loanRepaymentSelectionData.repayment_choices;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (LoanRepaymentSelectionData.Choice choice : list) {
                Long l = choice.timestamp;
                if (l != null) {
                    long longValue = l.longValue();
                    timeZone2 = timeZone;
                    localDate = DimensionKt.millisToLocalDate(longValue, timeZone2);
                } else {
                    timeZone2 = timeZone;
                    localDate = null;
                }
                LoanRepaymentSelectionData.Choice.Icon icon = choice.icon;
                icon.getClass();
                if (BorrowHomeOverlayViewModelKt$WhenMappings.$EnumSwitchMapping$0[icon.ordinal()] == 1) {
                    Timber.Forest.i("Formatting loan repayment date with timestamp: " + choice.timestamp + ", timeZone: " + timeZone2.getID() + ", timestampDate: " + localDate, new Object[0]);
                    localDate.getClass();
                    String format2 = dateTimeFormatter.format(localDate);
                    format2.getClass();
                    simple = new BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Text(format2);
                } else {
                    simple = new BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice.Icon.Simple(icon);
                }
                LocalizedString localizedString2 = choice.primary_text;
                localizedString2.getClass();
                String str3 = localizedString2.translated_value;
                str3.getClass();
                LocalizedString localizedString3 = choice.secondary_text;
                String format3 = (localizedString3 == null || (str = localizedString3.translated_value) == null) ? localDate != null ? dateTimeFormatter2.format(localDate) : null : str;
                LocalizedString localizedString4 = choice.accessory_text;
                String str4 = localizedString4 != null ? localizedString4.translated_value : null;
                zziz zzizVar = choice.routing;
                if (zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$ActionUrl) {
                    repaymentSelection = new SheetButtonAction.ActionUrl(((LoanRepaymentSelectionData$Choice$Routing$ActionUrl) zzizVar).value);
                } else {
                    if (!(zzizVar instanceof LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection)) {
                        if (zzizVar == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Missing routing option for repayment selection");
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    repaymentSelection = new SheetButtonAction.RepaymentSelection(((LoanRepaymentSelectionData$Choice$Routing$AdditionalSelection) zzizVar).value);
                }
                arrayList.add(new BorrowHomeOverlayViewModel.LoanRepaymentSelection.Choice(simple, str3, format3, str4, repaymentSelection));
            }
            return new BorrowHomeOverlayViewModel.LoanRepaymentSelection(str2, arrayList);
        }

        public static final PaychecksUiState.TimeBoundedPaychecksAggregation toTimeBoundedPaychecksAggregation(ProtoValidationScope protoValidationScope, TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation) {
            PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(timeBoundedPaychecksAggregation, paychecksParsingErrorFactory, protoValidationScope);
                String str = timeBoundedPaychecksAggregation.time_bounded_paychecks_aggregation_token;
                ProtoValidationScope.required(str, "time_bounded_paychecks_aggregation_token");
                Long l = timeBoundedPaychecksAggregation.start_date;
                ProtoValidationScope.required(l, "start_date");
                long longValue = l.longValue();
                Long l2 = timeBoundedPaychecksAggregation.end_date;
                ProtoValidationScope.required(l2, "end_date");
                long longValue2 = l2.longValue();
                List list = timeBoundedPaychecksAggregation.employers;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toEmployer(protoValidationScope2, (Employer) it.next()));
                }
                List list2 = timeBoundedPaychecksAggregation.deductions;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toDeduction(protoValidationScope2, (Deduction) it2.next()));
                }
                List list3 = timeBoundedPaychecksAggregation.realized_allocation_amounts;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(toRealizedAllocationAmount(protoValidationScope2, (RealizedAllocationAmount) it3.next()));
                }
                return new PaychecksUiState.TimeBoundedPaychecksAggregation(str, longValue, longValue2, arrayList, arrayList2, arrayList3);
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, timeBoundedPaychecksAggregation != null ? Reflection.factory.getOrCreateKotlinClass(TimeBoundedPaychecksAggregation.class) : null, paychecksParsingErrorFactory, null);
            }
        }

        public static final BorrowHomeOverlayViewModel.LoanDetails toSheet(BorrowAppletLoanHistoryTile.Data.Loan.Details details, String str) {
            SheetButtonAction repaymentSelection;
            details.getClass();
            LocalizedString localizedString = details.primary_text;
            localizedString.getClass();
            String str2 = localizedString.translated_value;
            str2.getClass();
            LocalizedString localizedString2 = details.secondary_text;
            localizedString2.getClass();
            String str3 = localizedString2.translated_value;
            str3.getClass();
            Color color = details.secondary_text_tint_color;
            List list = details.rows;
            Timeline timeline = details.timeline;
            timeline.getClass();
            LocalizedString localizedString3 = details.timeline_button_title;
            localizedString3.getClass();
            String str4 = localizedString3.translated_value;
            str4.getClass();
            LocalizedString localizedString4 = details.details_button_title;
            localizedString4.getClass();
            String str5 = localizedString4.translated_value;
            str5.getClass();
            BorrowAppletLoanHistoryTile.Data.Loan.Details.ButtonData buttonData = details.repayment_button_data;
            BorrowHomeOverlayViewModel.SheetButton sheetButton = null;
            if (buttonData != null) {
                zzjh zzjhVar = buttonData.routing;
                if (zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) {
                    repaymentSelection = new SheetButtonAction.ActionUrl(((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$Action) zzjhVar).value);
                } else {
                    if (!(zzjhVar instanceof BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection)) {
                        if (zzjhVar == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Missing routing option for repayment selection");
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    repaymentSelection = new SheetButtonAction.RepaymentSelection(((BorrowAppletLoanHistoryTile$Data$Loan$Details$ButtonData$Routing$RepaymentSelection) zzjhVar).value);
                }
                LocalizedString localizedString5 = buttonData.title;
                localizedString5.getClass();
                String str6 = localizedString5.translated_value;
                str6.getClass();
                sheetButton = new BorrowHomeOverlayViewModel.SheetButton(repaymentSelection, str6);
            }
            return new BorrowHomeOverlayViewModel.LoanDetails(str, str2, str3, color, list, timeline, str4, str5, sheetButton, details.cdf_variant);
        }
    }
}
