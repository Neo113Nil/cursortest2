package com.squareup.cash.invitations;

import androidx.emoji2.text.MetadataRepo;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$SmsInviteConsentPhoneNumbers;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.investing.components.RepeatClicksOnLongPress$attachTo$2$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2;
import com.squareup.cash.investing.presenters.PerformancePresenter$models$lambda$1$$inlined$map$1$2;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$locationDenials$$inlined$map$1$2;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.offers.presenters.OffersFilterGroupSheetPresenter$models$sheet$2$1$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Regions;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InviteContactsPresenter$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;
    public final /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ InviteContactsPresenter this$0;

        /* renamed from: com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, InviteContactsPresenter inviteContactsPresenter, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = inviteContactsPresenter;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0151  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            Object obj2;
            String str;
            Phonenumber$PhoneNumber phonenumber$PhoneNumber;
            String str2;
            Object obj3;
            Pair pair;
            String str3;
            InviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1 inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            InviteContactsPresenter inviteContactsPresenter = this.this$0;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            boolean z = true;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj4 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                List<Recipient> list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                for (Recipient recipient : list) {
                                    if (recipient.lookupKey == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Cannot invite a contact without a lookup key");
                                        break;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        boolean z2 = recipient.customerId != null ? z : false;
                                        boolean z3 = recipient.alreadyInvited;
                                        arrayList2.add(recipient);
                                        BlockersScreens.InviteContactsScreen inviteContactsScreen = inviteContactsPresenter.args;
                                        FeatureFlagManager featureFlagManager = inviteContactsPresenter.featureFlagManager;
                                        inviteContactsScreen.getClass();
                                        Iterator it = arrayList2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (((Recipient) obj2).sms != null) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        Recipient recipient2 = (Recipient) obj2;
                                        String str4 = "";
                                        if (recipient2 == null || (str = recipient2.sms) == null) {
                                            str = "";
                                        }
                                        String name = Regions.toCountry(inviteContactsScreen.blockersData.region).name();
                                        PhoneNumberUtil phoneNumberUtil = PhoneNumbers.f1416utils;
                                        name.getClass();
                                        try {
                                            phonenumber$PhoneNumber = phoneNumberUtil.parse(str, name);
                                        } catch (NumberParseException unused) {
                                            phonenumber$PhoneNumber = null;
                                        }
                                        if (phonenumber$PhoneNumber != null && PhoneNumbers.isValid(phonenumber$PhoneNumber)) {
                                            int i5 = phonenumber$PhoneNumber.countryCode_;
                                            int i6 = PhoneNumbers.NANP_COUNTRY_CODE;
                                            str = phoneNumberUtil.format(phonenumber$PhoneNumber, (i5 == i6 && phoneNumberUtil.getCountryCodeForRegion(name) == i6) ? 3 : 2);
                                        }
                                        if (phonenumber$PhoneNumber != null) {
                                            phoneNumberUtil.getClass();
                                            String nationalSignificantNumber = PhoneNumberUtil.getNationalSignificantNumber(phonenumber$PhoneNumber);
                                            int lengthOfNationalDestinationCode = phoneNumberUtil.getLengthOfNationalDestinationCode(phonenumber$PhoneNumber);
                                            if (lengthOfNationalDestinationCode > 0) {
                                                str2 = nationalSignificantNumber.substring(0, lengthOfNationalDestinationCode);
                                                if (!z2) {
                                                    pair = new Pair(InviteContactsViewModel.Contact.Status.CASH_CUSTOMER, "Uses Cash App");
                                                } else if (z3) {
                                                    pair = new Pair(InviteContactsViewModel.Contact.Status.INVITED, "Invited");
                                                } else {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj3 = it2.next();
                                                            if (((Recipient) obj3).email != null) {
                                                            }
                                                        } else {
                                                            obj3 = null;
                                                        }
                                                    }
                                                    Recipient recipient3 = (Recipient) obj3;
                                                    if (recipient3 != null && (str3 = recipient3.email) != null) {
                                                        str4 = str3;
                                                    }
                                                    InviteContactsViewModel.Contact.Status status = InviteContactsViewModel.Contact.Status.NOT_INVITED;
                                                    String str5 = StringsKt.isBlank(str) ? null : str;
                                                    if (str5 != null) {
                                                        str4 = str5;
                                                    }
                                                    pair = new Pair(status, str4);
                                                }
                                                InviteContactsViewModel.Contact.Status status2 = (InviteContactsViewModel.Contact.Status) pair.first;
                                                String str6 = (String) pair.second;
                                                AreaCodeStates areaCodeState = InviteErrorDialogKt.getAreaCodeState(str2, (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(JsonFeatureFlags$SmsInviteConsentPhoneNumbers.INSTANCE)).value);
                                                arrayList.add(new InviteContactsViewModel.Contact(Tags.toImmutableList(arrayList2), status2, str6, areaCodeState == null ? new InviteContactsViewEvent.ShowConsent(new RedactedString(str), areaCodeState, new RedactedParcelableList(arrayList2), new RedactedString("select_contact"), InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS) : new InviteContactsViewEvent.SendInvite(arrayList2, "select_contact", InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS)));
                                                z = true;
                                            }
                                        }
                                        str2 = null;
                                        if (!z2) {
                                        }
                                        InviteContactsViewModel.Contact.Status status22 = (InviteContactsViewModel.Contact.Status) pair.first;
                                        String str62 = (String) pair.second;
                                        AreaCodeStates areaCodeState2 = InviteErrorDialogKt.getAreaCodeState(str2, (JsonFeatureFlags$SmsInviteConsentPhoneNumbers.SmsInviteConsentPhoneNumbersOptions) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(JsonFeatureFlags$SmsInviteConsentPhoneNumbers.INSTANCE)).value);
                                        arrayList.add(new InviteContactsViewModel.Contact(Tags.toImmutableList(arrayList2), status22, str62, areaCodeState2 == null ? new InviteContactsViewEvent.ShowConsent(new RedactedString(str), areaCodeState2, new RedactedParcelableList(arrayList2), new RedactedString("select_contact"), InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS) : new InviteContactsViewEvent.SendInvite(arrayList2, "select_contact", InviteContactsViewEvent.SendInvite.ContactSection.ALL_CONTACTS)));
                                        z = true;
                                    }
                                }
                                List sortedWith = CollectionsKt.sortedWith(arrayList, new b.C0008b(20));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(sortedWith, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj42 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    break;
                default:
                    if (continuation instanceof InviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1) {
                        inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1 = (InviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1) continuation;
                        int i7 = inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.label;
                        if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                            inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                            Object obj5 = inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                String str7 = ((InviteContactsViewEvent.TextChanged) obj).newText;
                                Triple triple = new Triple(str7, PhoneNumbers.normalize(str7), PhoneNumbers.format(str7, Regions.toCountry(inviteContactsPresenter.args.blockersData.region).name(), null));
                                inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(triple, inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1 = new InviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1(this, continuation);
                    Object obj52 = inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = inviteContactsPresenter$includingPhoneNumber$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ InviteContactsPresenter$special$$inlined$map$1(Flow flow, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.this$0 = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 20;
        int i3 = 9;
        int i4 = 12;
        int i5 = 0;
        int i6 = 1;
        Object obj = this.this$0;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, (InviteContactsPresenter) obj, i5), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(18, flowCollector, (SelectCustomerPresenter) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) flow).collect(new RepeatClicksOnLongPress$attachTo$2$1(i2, flowCollector, (InvestingPortfolioPresenter) obj), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new PerformancePresenter$models$lambda$1$$inlined$map$1$2(flowCollector, (PoolsListPresenter) obj, 0), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flow.collect(new PerformancePresenter$models$lambda$1$$inlined$map$1$2(flowCollector, (PoolsListPresenter) obj, 1), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, (InvestingRecurringFrequencyPickerFullPresenter) obj, 0), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flow.collect(new InvestingRecurringFrequencyPickerFullPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, (InvestingRecurringFrequencyPickerFullPresenter) obj, 1), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = ((InviteContactsPresenter$filterContacts$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i6, flowCollector, (MetadataRepo) obj), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flow.collect(new InvestingPortfolioPresenter$models$lambda$6$$inlined$map$1$2(flowCollector, (MarkwonConfiguration) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flow.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(2, flowCollector, (RoundUpsElement) obj), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = flow.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(3, flowCollector, (InvestingSearchPresenter) obj), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, (InvestingSearchPresenter) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(5, flowCollector, (MoneybotHomePresenter) obj), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = ((FlowKt__MergeKt$flatMapConcat$$inlined$map$1) flow).collect(new AnonymousClass2(flowCollector, (InviteContactsPresenter) obj, i6), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = ((Camera$special$$inlined$map$1) flow).collect(new CashMapPresenter$locationDenials$$inlined$map$1$2(flowCollector, (CashMapPresenter) obj, 1), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = flow.collect(new CashMapPresenter$locationDenials$$inlined$map$1$2(flowCollector, (CashMapPresenter) obj, 0), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = flow.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(6, flowCollector, (MarketCapabilityName) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = ((RealContactRepository$contacts$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(8, flowCollector, (VerifyCheckDialogPresenter) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = ((RealContactRepository$contacts$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i3, flowCollector, (RealAppletTileServerRecommendationProvider) obj), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = flow.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(11, flowCollector, (SectionProvider) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = ((SafeFlow) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(14, flowCollector, (MoneybotChatPresenter) obj), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = ((BorrowDataReadUtilsKt$allEntryPoints$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(19, flowCollector, (RealAndroidNotificationSettingsChecker) obj), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(i2, flowCollector, (OfferSheetKey) obj), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, i3), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, (RealP2pSettingsManager) obj), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = flow.collect(new OffersFilterGroupSheetPresenter$models$sheet$2$1$1(26, flowCollector, (MainPaymentPresenter) obj), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = ((SafeFlow) flow).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, (CoreFlowRealSheetState) obj, 7), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((RealPrepurchaseCashCardRepository$prepurchaseAppletSyncData$$inlined$map$1) flow).collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, (LocalEditorialPresenter) obj, i4), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = ((SafeFlow) flow).collect(new WirelessProviderListPresenter$models$1$1$1(10, flowCollector, (ProfilePresenter) obj), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((StateFlow) flow).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, i4), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
