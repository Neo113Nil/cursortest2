package com.squareup.cash.family.familyhub.backend.real;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.lynx.api.v1_0.EnrichmentType;
import com.squareup.cash.lynx.api.v1_0.model.BankAccount;
import com.squareup.cash.lynx.api.v1_0.model.BankinfoDetails;
import com.squareup.cash.lynx.api.v1_0.model.Card;
import com.squareup.cash.lynx.api.v1_0.model.CardBankDetails;
import com.squareup.cash.lynx.api.v1_0.model.EnrichedInstrumentLink;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLink;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentLinkMetadata;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.lynx.api.v1_0.model.LinkStatusType;
import com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance;
import com.squareup.cash.lynx.api.v1_0.model.StoredValueBalanceDetails;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.lynx.LynxService;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import papa.SafeTrace;
import squareup.cash.lynx.api.app.v1_0.GetEnrichedInstrumentLinksAppRequest;
import squareup.cash.lynx.api.app.v1_0.GetEnrichedInstrumentLinksAppResponse;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealSponsorInstrumentManager$sponsorInstruments$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ Lazy this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentType.values().length];
            try {
                iArr[InstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstrumentType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InstrumentType.CREDIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InstrumentType.CASH_BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSponsorInstrumentManager$sponsorInstruments$1(Lazy lazy, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealSponsorInstrumentManager$sponsorInstruments$1 realSponsorInstrumentManager$sponsorInstruments$1 = new RealSponsorInstrumentManager$sponsorInstruments$1(this.this$0, continuation);
        realSponsorInstrumentManager$sponsorInstruments$1.L$0 = obj;
        return realSponsorInstrumentManager$sponsorInstruments$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealSponsorInstrumentManager$sponsorInstruments$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0237, code lost:
    
        if (r3.emit(r5, r33) == r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0255, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0253, code lost:
    
        if (r3.emit(r1, r33) == r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x006f, code lost:
    
        if (r1 == r4) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (r13.stored_value_balance_type == com.squareup.protos.banklin.data.StoredValueBalance.Type.CURRENCY) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        if (r13 != null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object enrichedInstrumentLinksApp;
        String str;
        int i;
        CashInstrumentType cashInstrumentType;
        int i2;
        String format2;
        InstrumentLinkMetadata instrumentLinkMetadata;
        String str2;
        String str3;
        CardBankDetails cardBankDetails;
        CardBankDetails cardBankDetails2;
        String str4;
        String str5;
        String str6;
        InstrumentLink.Instrument instrument;
        com.squareup.protos.common.instrument.InstrumentType instrumentType;
        Instrument instrument2;
        CardBankDetails cardBankDetails3;
        StoredValueBalance storedValueBalance;
        Lazy lazy = this.this$0;
        AndroidStringManager androidStringManager = (AndroidStringManager) lazy.value;
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        int i4 = 3;
        int i5 = 1;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(LinkStatusType.ACTIVE);
            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new InstrumentType[]{InstrumentType.DEBIT_CARD, InstrumentType.BANK_ACCOUNT, InstrumentType.CASH_BALANCE});
            List listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new EnrichmentType[]{EnrichmentType.BANKINFO_DETAILS, EnrichmentType.SVB_BALANCE_DETAILS, EnrichmentType.BINFO_DETAILS});
            Boolean bool = Boolean.FALSE;
            GetEnrichedInstrumentLinksAppRequest getEnrichedInstrumentLinksAppRequest = new GetEnrichedInstrumentLinksAppRequest(listOf, listOf2, listOf3, bool, null, null, EmptyList.INSTANCE, bool, ByteString.EMPTY);
            LynxService lynxService = (LynxService) lazy.initializer;
            this.L$0 = flowCollector;
            this.label = 1;
            enrichedInstrumentLinksApp = lynxService.getEnrichedInstrumentLinksApp(getEnrichedInstrumentLinksAppRequest, this);
        } else {
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            enrichedInstrumentLinksApp = obj;
        }
        ApiResult apiResult = (ApiResult) enrichedInstrumentLinksApp;
        if (apiResult instanceof ApiResult.Success) {
            List<EnrichedInstrumentLink> list = ((GetEnrichedInstrumentLinksAppResponse) ((ApiResult.Success) apiResult).response).enriched_instrument_links;
            ArrayList arrayList = new ArrayList();
            for (EnrichedInstrumentLink enrichedInstrumentLink : list) {
                InstrumentLink instrumentLink = enrichedInstrumentLink.instrument_link;
                BankinfoDetails bankinfoDetails = enrichedInstrumentLink.bankinfo_details;
                if (instrumentLink != null) {
                    if (instrumentLink.instrument_type == InstrumentType.CASH_BALANCE) {
                        InstrumentLink.Instrument instrument3 = instrumentLink.instrument;
                        if (instrument3 != null) {
                            InstrumentLink.Instrument.StoredValueBalance storedValueBalance2 = instrument3 instanceof InstrumentLink.Instrument.StoredValueBalance ? (InstrumentLink.Instrument.StoredValueBalance) instrument3 : null;
                            if (storedValueBalance2 != null) {
                                storedValueBalance = storedValueBalance2.getValue();
                                if ((storedValueBalance == null ? storedValueBalance.currency : null) == CurrencyCode.USD) {
                                }
                            }
                        }
                        storedValueBalance = null;
                        if ((storedValueBalance == null ? storedValueBalance.currency : null) == CurrencyCode.USD) {
                        }
                    }
                    InstrumentLink.Instrument instrument4 = instrumentLink.instrument;
                    if (instrument4 != null) {
                        InstrumentLink.Instrument.Card card = instrument4 instanceof InstrumentLink.Instrument.Card ? (InstrumentLink.Instrument.Card) instrument4 : null;
                        Card value = card != null ? card.getValue() : null;
                        if (value != null) {
                            str = value.suffix;
                        }
                    }
                    InstrumentLink.Instrument instrument5 = instrumentLink.instrument;
                    if (instrument5 != null) {
                        InstrumentLink.Instrument.BankAccount bankAccount = instrument5 instanceof InstrumentLink.Instrument.BankAccount ? (InstrumentLink.Instrument.BankAccount) instrument5 : null;
                        BankAccount value2 = bankAccount != null ? bankAccount.getValue() : null;
                        if (value2 != null) {
                            str = value2.suffix;
                            InstrumentType instrumentType2 = instrumentLink.instrument_type;
                            i = instrumentType2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentType2.ordinal()];
                            if (i != i5) {
                                cashInstrumentType = CashInstrumentType.DEBIT_CARD;
                            } else if (i == 2) {
                                cashInstrumentType = CashInstrumentType.BANK_ACCOUNT;
                            } else if (i == i4) {
                                cashInstrumentType = CashInstrumentType.CREDIT_CARD;
                            } else if (i == 4) {
                                cashInstrumentType = CashInstrumentType.CASH_BALANCE;
                            }
                            CashInstrumentType cashInstrumentType2 = cashInstrumentType;
                            InstrumentType instrumentType3 = instrumentLink.instrument_type;
                            i2 = instrumentType3 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[instrumentType3.ordinal()];
                            if (i2 != i5) {
                                if (i2 == 2) {
                                    if (bankinfoDetails == null || (format2 = bankinfoDetails.short_name) == null) {
                                        format2 = bankinfoDetails != null ? bankinfoDetails.name : null;
                                        if (format2 == null) {
                                            format2 = androidStringManager.get(R.string.sponsor_instrument_bank_fallback);
                                        }
                                    }
                                    if (str != null) {
                                        format2.getClass();
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        format2 = new MessageFormat(resources.getString(R.string.sponsor_instrument_bank_account)).format(new Object[]{format2, str});
                                        format2.getClass();
                                    }
                                } else if (i2 != i4) {
                                    if (i2 == 4) {
                                        format2 = androidStringManager.get(R.string.sponsor_instrument_cash_balance);
                                    }
                                }
                                String str7 = format2;
                                instrumentLinkMetadata = enrichedInstrumentLink.instrument_link_metadata;
                                if (instrumentLinkMetadata != null || (cardBankDetails3 = instrumentLinkMetadata.card_bank_details) == null || (str2 = cardBankDetails3.tab_selection_icon_url) == null) {
                                    str2 = (instrumentLinkMetadata != null || (cardBankDetails2 = instrumentLinkMetadata.card_bank_details) == null) ? null : cardBankDetails2.tab_card_icon_url;
                                    if (str2 == null) {
                                        if (instrumentLinkMetadata == null || (cardBankDetails = instrumentLinkMetadata.card_bank_details) == null) {
                                            str3 = null;
                                            str4 = instrumentLink.instrument_token;
                                            if (str4 != null) {
                                                if (bankinfoDetails == null || (str6 = bankinfoDetails.short_name) == null) {
                                                    if (bankinfoDetails != null) {
                                                        str6 = bankinfoDetails.name;
                                                    } else {
                                                        str5 = null;
                                                        instrument = instrumentLink.instrument;
                                                        if (instrument != null) {
                                                            InstrumentLink.Instrument.Card card2 = instrument instanceof InstrumentLink.Instrument.Card ? (InstrumentLink.Instrument.Card) instrument : null;
                                                            Card value3 = card2 != null ? card2.getValue() : null;
                                                            if (value3 != null) {
                                                                instrumentType = value3.card_brand;
                                                                Long l = instrumentLink.created_at_ms;
                                                                StoredValueBalanceDetails storedValueBalanceDetails = enrichedInstrumentLink.stored_value_balance_details;
                                                                instrument2 = new Instrument(str4, cashInstrumentType2, instrumentType, str, str5, str3, null, storedValueBalanceDetails != null ? storedValueBalanceDetails.balance : null, null, null, null, l, null, null, str7, Boolean.TRUE, null, 452951872);
                                                                if (instrument2 == null) {
                                                                    arrayList.add(instrument2);
                                                                }
                                                                i4 = 3;
                                                                i5 = 1;
                                                            }
                                                        }
                                                        instrumentType = null;
                                                        Long l2 = instrumentLink.created_at_ms;
                                                        StoredValueBalanceDetails storedValueBalanceDetails2 = enrichedInstrumentLink.stored_value_balance_details;
                                                        instrument2 = new Instrument(str4, cashInstrumentType2, instrumentType, str, str5, str3, null, storedValueBalanceDetails2 != null ? storedValueBalanceDetails2.balance : null, null, null, null, l2, null, null, str7, Boolean.TRUE, null, 452951872);
                                                        if (instrument2 == null) {
                                                        }
                                                        i4 = 3;
                                                        i5 = 1;
                                                    }
                                                }
                                                str5 = str6;
                                                instrument = instrumentLink.instrument;
                                                if (instrument != null) {
                                                }
                                                instrumentType = null;
                                                Long l22 = instrumentLink.created_at_ms;
                                                StoredValueBalanceDetails storedValueBalanceDetails22 = enrichedInstrumentLink.stored_value_balance_details;
                                                instrument2 = new Instrument(str4, cashInstrumentType2, instrumentType, str, str5, str3, null, storedValueBalanceDetails22 != null ? storedValueBalanceDetails22.balance : null, null, null, null, l22, null, null, str7, Boolean.TRUE, null, 452951872);
                                                if (instrument2 == null) {
                                                }
                                                i4 = 3;
                                                i5 = 1;
                                            }
                                        } else {
                                            str2 = cardBankDetails.tab_detail_icon_url;
                                        }
                                    }
                                }
                                str3 = str2;
                                str4 = instrumentLink.instrument_token;
                                if (str4 != null) {
                                }
                            }
                            String str8 = str != null ? "" : str;
                            Resources resources2 = androidStringManager.resources;
                            resources2.getClass();
                            format2 = new MessageFormat(resources2.getString(R.string.sponsor_instrument_debit_card)).format(new Object[]{str8});
                            format2.getClass();
                            String str72 = format2;
                            instrumentLinkMetadata = enrichedInstrumentLink.instrument_link_metadata;
                            if (instrumentLinkMetadata != null) {
                            }
                            if (instrumentLinkMetadata != null) {
                            }
                            if (str2 == null) {
                            }
                            str3 = str2;
                            str4 = instrumentLink.instrument_token;
                            if (str4 != null) {
                            }
                        }
                    }
                    str = null;
                    InstrumentType instrumentType22 = instrumentLink.instrument_type;
                    if (instrumentType22 != null) {
                    }
                    if (i != i5) {
                    }
                    CashInstrumentType cashInstrumentType22 = cashInstrumentType;
                    InstrumentType instrumentType32 = instrumentLink.instrument_type;
                    if (instrumentType32 != null) {
                    }
                    if (i2 != i5) {
                    }
                    if (str != null) {
                    }
                    Resources resources22 = androidStringManager.resources;
                    resources22.getClass();
                    format2 = new MessageFormat(resources22.getString(R.string.sponsor_instrument_debit_card)).format(new Object[]{str8});
                    format2.getClass();
                    String str722 = format2;
                    instrumentLinkMetadata = enrichedInstrumentLink.instrument_link_metadata;
                    if (instrumentLinkMetadata != null) {
                    }
                    if (instrumentLinkMetadata != null) {
                    }
                    if (str2 == null) {
                    }
                    str3 = str2;
                    str4 = instrumentLink.instrument_token;
                    if (str4 != null) {
                    }
                }
                instrument2 = null;
                if (instrument2 == null) {
                }
                i4 = 3;
                i5 = 1;
            }
            this.L$0 = null;
            this.label = 2;
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            Timber.Forest.w("Failed to fetch sponsor instruments", new Object[0]);
            EmptyList emptyList = EmptyList.INSTANCE;
            this.L$0 = null;
            this.label = 3;
        }
    }
}
