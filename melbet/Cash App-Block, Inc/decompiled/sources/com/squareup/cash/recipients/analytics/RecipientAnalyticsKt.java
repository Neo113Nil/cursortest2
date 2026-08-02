package com.squareup.cash.recipients.analytics;

import com.squareup.cash.cdf.ContactStatus;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.asset.AssetRequestAddRecipient;
import com.squareup.cash.cdf.asset.AssetRequestViewRecipient;
import com.squareup.cash.cdf.asset.AssetSendAddRecipient;
import com.squareup.cash.cdf.asset.AssetSendViewRecipient;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.recipient.RecipientSearchAddContact;
import com.squareup.cash.cdf.recipient.RecipientSearchViewContact;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.recipients.backend.api.Bucket;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.Section;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes6.dex */
public abstract class RecipientAnalyticsKt {
    public static final Map SEARCH_TYPES = MapsKt__MapsKt.mapOf(new Pair("sms", "SMS"), new Pair("cashtag", "CASH_TAG"), new Pair("email", "EMAIL"), new Pair("full text", "FULL_TEXT"));

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[Bucket.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Bucket bucket = Bucket.SUGGESTED;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Bucket bucket2 = Bucket.SUGGESTED;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GenerationStrategy.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                GenerationStrategy generationStrategy = GenerationStrategy.RECENT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                GenerationStrategy generationStrategy2 = GenerationStrategy.RECENT;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                GenerationStrategy generationStrategy3 = GenerationStrategy.RECENT;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                GenerationStrategy generationStrategy4 = GenerationStrategy.RECENT;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                GenerationStrategy generationStrategy5 = GenerationStrategy.RECENT;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                GenerationStrategy generationStrategy6 = GenerationStrategy.RECENT;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                GenerationStrategy generationStrategy7 = GenerationStrategy.RECENT;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentType.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                PaymentType paymentType = PaymentType.SEND;
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr4 = new int[RecipientType.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                RecipientType recipientType = RecipientType.CUSTOMER;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                RecipientType recipientType2 = RecipientType.CUSTOMER;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                RecipientType recipientType3 = RecipientType.CUSTOMER;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr5 = new int[Orientation.values().length];
            try {
                iArr5[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ExperienceType.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                ExperienceType experienceType = ExperienceType.LEGACY;
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr7 = new int[ContactsStatus.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                ContactsStatus contactsStatus = ContactsStatus.IN_CONTACTS;
                iArr7[2] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                ContactsStatus contactsStatus2 = ContactsStatus.IN_CONTACTS;
                iArr7[1] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr8 = new int[SuggestionStrategy.values().length];
            try {
                iArr8[0] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                SuggestionStrategy suggestionStrategy = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[2] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                SuggestionStrategy suggestionStrategy2 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[3] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                SuggestionStrategy suggestionStrategy3 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[5] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                SuggestionStrategy suggestionStrategy4 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[1] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                SuggestionStrategy suggestionStrategy5 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[4] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                SuggestionStrategy suggestionStrategy6 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[6] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                SuggestionStrategy suggestionStrategy7 = SuggestionStrategy.CONTACTS_ON_CASH;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[Section.Type.values().length];
            try {
                iArr9[0] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                Section.Type type2 = Section.Type.SUGGESTED;
                iArr9[1] = 2;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    public static final void logAssetViewRecipient(Analytics analytics, PaymentType paymentType, String str, ContactStatus contactStatus, Recipient.Analytics analytics2, ExperienceType experienceType, String str2) {
        Event assetSendViewRecipient;
        SuggestionStrategy suggestionStrategy;
        SuggestionStrategy suggestionStrategy2;
        str.getClass();
        int ordinal = paymentType.ordinal();
        if (ordinal == 0) {
            assetSendViewRecipient = new AssetSendViewRecipient(analytics2 != null ? analytics2.absoluteIndex : null, contactStatus, analytics2 != null ? analytics2.entityToken : null, str, Origin.AMOUNT_FIRST, analytics2 != null ? analytics2.remoteSuggestionType : null, analytics2 != null ? analytics2.section : null, analytics2 != null ? analytics2.sectionIndex : null, analytics2 != null ? analytics2.sectionTotal : null, (analytics2 == null || (suggestionStrategy = analytics2.suggestionStrategy) == null) ? null : toAssetSuggestionStrategy(suggestionStrategy), experienceType, str2, null, 25088);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Integer num = analytics2 != null ? analytics2.absoluteIndex : null;
            String str3 = analytics2 != null ? analytics2.entityToken : null;
            Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
            assetSendViewRecipient = new AssetRequestViewRecipient(num, contactStatus, str3, str, analytics2 != null ? analytics2.remoteSuggestionType : null, analytics2 != null ? analytics2.section : null, analytics2 != null ? analytics2.sectionIndex : null, analytics2 != null ? analytics2.sectionTotal : null, (analytics2 == null || (suggestionStrategy2 = analytics2.suggestionStrategy) == null) ? null : toAssetSuggestionStrategy(suggestionStrategy2), experienceType, str2);
        }
        analytics.track(assetSendViewRecipient, null);
    }

    public static final void logRecipientSearchViewContact(Analytics analytics, String str, String str2, ContactStatus contactStatus, Recipient.Analytics analytics2, com.squareup.cash.cdf.recipient.ExperienceType experienceType) {
        RecipientSearchViewContact.SearchType searchType;
        RecipientSearchViewContact.SuggestionStrategy suggestionStrategy;
        SuggestionStrategy suggestionStrategy2;
        String str3;
        Object failure;
        Enum r0;
        str.getClass();
        experienceType.getClass();
        Integer num = analytics2 != null ? analytics2.absoluteIndex : null;
        Integer num2 = analytics2 != null ? analytics2.matchedAliasLength : null;
        String str4 = analytics2 != null ? analytics2.matchedFields : null;
        String str5 = analytics2 != null ? analytics2.remoteSuggestionType : null;
        Integer num3 = analytics2 != null ? analytics2.searchTextLength : null;
        if (analytics2 == null || (str3 = analytics2.searchType) == null) {
            searchType = null;
        } else {
            String str6 = (String) SEARCH_TYPES.get(str3);
            if (str6 != null) {
                try {
                    Result.Companion companion = Result.Companion;
                    String upperCase = str6.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    failure = RecipientSearchViewContact.SearchType.valueOf(upperCase);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                r0 = (Enum) failure;
            } else {
                r0 = null;
            }
            searchType = (RecipientSearchViewContact.SearchType) r0;
        }
        String str7 = analytics2 != null ? analytics2.section : null;
        Integer num4 = analytics2 != null ? analytics2.sectionIndex : null;
        Integer num5 = analytics2 != null ? analytics2.sectionTotal : null;
        if (analytics2 == null || (suggestionStrategy2 = analytics2.suggestionStrategy) == null) {
            suggestionStrategy = null;
        } else {
            int ordinal = suggestionStrategy2.ordinal();
            suggestionStrategy = ordinal != 0 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? null : RecipientSearchViewContact.SuggestionStrategy.LINKED_ACCOUNT : RecipientSearchViewContact.SuggestionStrategy.FAVORITE : RecipientSearchViewContact.SuggestionStrategy.REMOTE : RecipientSearchViewContact.SuggestionStrategy.CONTACTS_OFF_CASH : RecipientSearchViewContact.SuggestionStrategy.CONTACTS_ON_CASH : RecipientSearchViewContact.SuggestionStrategy.RECENTS;
        }
        analytics.track(new RecipientSearchViewContact(num, str, num2, str4, str5, num3, searchType, str7, num4, num5, suggestionStrategy, analytics2 != null ? analytics2.entityToken : null, contactStatus, str2, analytics2 != null ? analytics2.queryToken : null, analytics2 != null ? analytics2.isC4bBusiness : null, analytics2 != null ? analytics2.isFirstLinkedAccount : null, analytics2 != null ? analytics2.isMultipleAccountHolder : null, analytics2 != null ? analytics2.accountHolderToken : null, analytics2 != null ? analytics2.isLinkedAccount : null, experienceType), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void logRecipientSelected(Analytics analytics, String str, String str2, Recipient.Analytics analytics2, PaymentType paymentType, ContactStatus contactStatus, ExperienceType experienceType, String str3) {
        com.squareup.cash.cdf.recipient.ExperienceType experienceType2;
        RecipientSearchAddContact.SearchType searchType;
        SuggestionStrategy suggestionStrategy;
        RecipientSearchAddContact.SuggestionStrategy suggestionStrategy2;
        Integer num;
        AssetSendAddRecipient.Bucket bucket;
        AssetSendAddRecipient.Bucket bucket2;
        GenerationStrategy generationStrategy;
        AssetSendAddRecipient.GenerationStrategy generationStrategy2;
        AssetSendAddRecipient.GenerationStrategy generationStrategy3;
        GenerationStrategy generationStrategy4;
        AssetRequestAddRecipient.Bucket bucket3;
        AssetRequestAddRecipient.Bucket bucket4;
        GenerationStrategy generationStrategy5;
        AssetRequestAddRecipient.GenerationStrategy generationStrategy6;
        AssetRequestAddRecipient.GenerationStrategy generationStrategy7;
        GenerationStrategy generationStrategy8;
        Integer num2;
        str.getClass();
        int i = 0;
        if (((analytics2 == null || (num2 = analytics2.searchTextLength) == null) ? 0 : num2.intValue()) == 0) {
            int ordinal = paymentType.ordinal();
            if (ordinal == 0) {
                String str4 = analytics2 != null ? analytics2.section : null;
                Integer num3 = analytics2 != null ? analytics2.absoluteIndex : null;
                Integer num4 = analytics2 != null ? analytics2.sectionIndex : null;
                Integer num5 = analytics2 != null ? analytics2.sectionTotal : null;
                Bucket bucket5 = analytics2 != null ? analytics2.bucket : null;
                int i2 = bucket5 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bucket5.ordinal()];
                if (i2 == 1) {
                    bucket = AssetSendAddRecipient.Bucket.SUGGESTED;
                } else if (i2 == 2) {
                    bucket = AssetSendAddRecipient.Bucket.CONTACTS;
                } else if (i2 != 3) {
                    bucket2 = null;
                    generationStrategy = analytics2 == null ? analytics2.generationStrategy : null;
                    switch (generationStrategy != null ? -1 : WhenMappings.$EnumSwitchMapping$1[generationStrategy.ordinal()]) {
                        case 1:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.RECENT;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 2:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.REMOTE_SUGGESTION;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 3:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.CONTACT;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 4:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.REMOTE_EXACT_MATCH;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 5:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.NEW_CUSTOMER;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 6:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.REMOTE_MATCHES;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 7:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.BITCOIN_WALLET_ADDRESS;
                            generationStrategy3 = generationStrategy2;
                            break;
                        case 8:
                            generationStrategy2 = AssetSendAddRecipient.GenerationStrategy.FAVORITE;
                            generationStrategy3 = generationStrategy2;
                            break;
                        default:
                            generationStrategy3 = null;
                            break;
                    }
                    analytics.track(new AssetSendAddRecipient(num3, bucket2, contactStatus, str, (analytics2 != null || (generationStrategy4 = analytics2.generationStrategy) == null) ? null : toAssetSuggestionStrategy(generationStrategy4, analytics2.entityToken), generationStrategy3, analytics2 == null ? analytics2.searchTextLength : null, str4, num4, num5, Origin.AMOUNT_FIRST, analytics2 == null ? analytics2.total : null, Boolean.FALSE, experienceType, str3, null, 1650696), null);
                } else {
                    bucket = AssetSendAddRecipient.Bucket.SEARCH;
                }
                bucket2 = bucket;
                if (analytics2 == null) {
                }
                switch (generationStrategy != null ? -1 : WhenMappings.$EnumSwitchMapping$1[generationStrategy.ordinal()]) {
                }
                if (analytics2 == null) {
                }
                if (analytics2 == null) {
                }
                analytics.track(new AssetSendAddRecipient(num3, bucket2, contactStatus, str, (analytics2 != null || (generationStrategy4 = analytics2.generationStrategy) == null) ? null : toAssetSuggestionStrategy(generationStrategy4, analytics2.entityToken), generationStrategy3, analytics2 == null ? analytics2.searchTextLength : null, str4, num4, num5, Origin.AMOUNT_FIRST, analytics2 == null ? analytics2.total : null, Boolean.FALSE, experienceType, str3, null, 1650696), null);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                String str5 = analytics2 != null ? analytics2.section : null;
                Integer num6 = analytics2 != null ? analytics2.absoluteIndex : null;
                Integer num7 = analytics2 != null ? analytics2.sectionIndex : null;
                Integer num8 = analytics2 != null ? analytics2.sectionTotal : null;
                Bucket bucket6 = analytics2 != null ? analytics2.bucket : null;
                int i3 = bucket6 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bucket6.ordinal()];
                if (i3 == 1) {
                    bucket3 = AssetRequestAddRecipient.Bucket.SUGGESTED;
                } else if (i3 == 2) {
                    bucket3 = AssetRequestAddRecipient.Bucket.CONTACTS;
                } else if (i3 != 3) {
                    bucket4 = null;
                    generationStrategy5 = analytics2 == null ? analytics2.generationStrategy : null;
                    switch (generationStrategy5 != null ? -1 : WhenMappings.$EnumSwitchMapping$1[generationStrategy5.ordinal()]) {
                        case 1:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.RECENT;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 2:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.REMOTE_SUGGESTION;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 3:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.CONTACT;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 4:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.REMOTE_EXACT_MATCH;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 5:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.NEW_CUSTOMER;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 6:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.REMOTE_MATCHES;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 7:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.BITCOIN_WALLET_ADDRESS;
                            generationStrategy7 = generationStrategy6;
                            break;
                        case 8:
                            generationStrategy6 = AssetRequestAddRecipient.GenerationStrategy.FAVORITE;
                            generationStrategy7 = generationStrategy6;
                            break;
                        default:
                            generationStrategy7 = null;
                            break;
                    }
                    Integer num9 = analytics2 == null ? analytics2.searchTextLength : null;
                    Integer num10 = analytics2 == null ? analytics2.total : null;
                    String str6 = analytics2 == null ? analytics2.entityToken : null;
                    Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
                    analytics.track(new AssetRequestAddRecipient(num6, bucket4, contactStatus, str6, str, (analytics2 != null || (generationStrategy8 = analytics2.generationStrategy) == null) ? null : toAssetSuggestionStrategy(generationStrategy8, analytics2.entityToken), generationStrategy7, num9, str5, num7, num8, num10, Boolean.FALSE, experienceType, str3), null);
                } else {
                    bucket3 = AssetRequestAddRecipient.Bucket.SEARCH;
                }
                bucket4 = bucket3;
                if (analytics2 == null) {
                }
                switch (generationStrategy5 != null ? -1 : WhenMappings.$EnumSwitchMapping$1[generationStrategy5.ordinal()]) {
                }
                if (analytics2 == null) {
                }
                if (analytics2 == null) {
                }
                if (analytics2 == null) {
                }
                Origin origin2 = Origin.CUSTOMER_PROFILE_FAVORITES;
                analytics.track(new AssetRequestAddRecipient(num6, bucket4, contactStatus, str6, str, (analytics2 != null || (generationStrategy8 = analytics2.generationStrategy) == null) ? null : toAssetSuggestionStrategy(generationStrategy8, analytics2.entityToken), generationStrategy7, num9, str5, num7, num8, num10, Boolean.FALSE, experienceType, str3), null);
            }
        }
        if (analytics2 != null && (num = analytics2.searchTextLength) != null) {
            i = num.intValue();
        }
        if (i <= 0 || analytics2 == null) {
            return;
        }
        int ordinal2 = experienceType.ordinal();
        if (ordinal2 == 0) {
            experienceType2 = com.squareup.cash.cdf.recipient.ExperienceType.LEGACY;
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            experienceType2 = com.squareup.cash.cdf.recipient.ExperienceType.BOTTOM_SHEET;
        }
        com.squareup.cash.cdf.recipient.ExperienceType experienceType3 = experienceType2;
        Integer num11 = analytics2.absoluteIndex;
        String str7 = analytics2.entityToken;
        String str8 = analytics2.queryToken;
        String str9 = analytics2.matchedFields;
        Integer num12 = analytics2.matchedAliasLength;
        String str10 = analytics2.remoteSuggestionType;
        Integer num13 = analytics2.searchTextLength;
        String str11 = analytics2.searchType;
        if (str11 != null) {
            int hashCode = str11.hashCode();
            if (hashCode != 114009) {
                if (hashCode != 96619420) {
                    if (hashCode == 554996615 && str11.equals("cashtag")) {
                        searchType = RecipientSearchAddContact.SearchType.CASH_TAG;
                    }
                } else if (str11.equals("email")) {
                    searchType = RecipientSearchAddContact.SearchType.EMAIL;
                }
            } else if (str11.equals("sms")) {
                searchType = RecipientSearchAddContact.SearchType.SMS;
            }
            RecipientSearchAddContact.SearchType searchType2 = searchType;
            String str12 = analytics2.section;
            Integer num14 = analytics2.sectionIndex;
            Integer num15 = analytics2.sectionTotal;
            suggestionStrategy = analytics2.suggestionStrategy;
            switch (suggestionStrategy != null ? WhenMappings.$EnumSwitchMapping$7[suggestionStrategy.ordinal()] : -1) {
                case -1:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.REMOTE;
                    break;
                case 0:
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                case 1:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.RECENTS;
                    break;
                case 2:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.CONTACTS_ON_CASH;
                    break;
                case 3:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.CONTACTS_OFF_CASH;
                    break;
                case 4:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.REMOTE;
                    break;
                case 5:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.REMOTE;
                    break;
                case 6:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.REMOTE;
                    break;
                case 7:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.FAVORITE;
                    break;
                case 8:
                    suggestionStrategy2 = RecipientSearchAddContact.SuggestionStrategy.LINKED_ACCOUNT;
                    break;
            }
            analytics.track(new RecipientSearchAddContact(num11, str, num12, str9, str10, num13, searchType2, str12, num14, num15, suggestionStrategy2, "AMOUNT_FIRST", str7, contactStatus, str2, str8, analytics2.isC4bBusiness, analytics2.isFirstLinkedAccount, analytics2.isMultipleAccountHolder, analytics2.accountHolderToken, analytics2.isLinkedAccount, experienceType3, 4210688), null);
        }
        searchType = RecipientSearchAddContact.SearchType.FULL_TEXT;
        RecipientSearchAddContact.SearchType searchType22 = searchType;
        String str122 = analytics2.section;
        Integer num142 = analytics2.sectionIndex;
        Integer num152 = analytics2.sectionTotal;
        suggestionStrategy = analytics2.suggestionStrategy;
        switch (suggestionStrategy != null ? WhenMappings.$EnumSwitchMapping$7[suggestionStrategy.ordinal()] : -1) {
        }
        analytics.track(new RecipientSearchAddContact(num11, str, num12, str9, str10, num13, searchType22, str122, num142, num152, suggestionStrategy2, "AMOUNT_FIRST", str7, contactStatus, str2, str8, analytics2.isC4bBusiness, analytics2.isFirstLinkedAccount, analytics2.isMultipleAccountHolder, analytics2.accountHolderToken, analytics2.isLinkedAccount, experienceType3, 4210688), null);
    }

    public static final ContactStatus toAnalyticsContactStatus(ContactsStatus contactsStatus) {
        contactsStatus.getClass();
        int ordinal = contactsStatus.ordinal();
        if (ordinal == 0) {
            return ContactStatus.IN_CONTACTS;
        }
        if (ordinal == 1) {
            return ContactStatus.NOT_IN_CONTACTS;
        }
        if (ordinal == 2) {
            return ContactStatus.CONTACTS_DISABLED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final com.squareup.cash.cdf.asset.SuggestionStrategy toAssetSuggestionStrategy(SuggestionStrategy suggestionStrategy) {
        suggestionStrategy.getClass();
        switch (suggestionStrategy.ordinal()) {
            case 0:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.RECENTS;
            case 1:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SUGGESTIONS;
            case 2:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_ON_CASH;
            case 3:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_OFF_CASH;
            case 4:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SEARCH;
            case 5:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE;
            case 6:
                return com.squareup.cash.cdf.asset.SuggestionStrategy.FAVORITE;
            default:
                return null;
        }
    }

    public static final com.squareup.cash.cdf.asset.SuggestionStrategy toAssetSuggestionStrategy(GenerationStrategy generationStrategy, String str) {
        int i = generationStrategy == null ? -1 : WhenMappings.$EnumSwitchMapping$1[generationStrategy.ordinal()];
        if (i == 1) {
            return com.squareup.cash.cdf.asset.SuggestionStrategy.RECENTS;
        }
        if (i == 2) {
            return com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SUGGESTIONS;
        }
        if (i == 3) {
            if (str != null) {
                return com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_ON_CASH;
            }
            return com.squareup.cash.cdf.asset.SuggestionStrategy.CONTACTS_OFF_CASH;
        }
        if (i == 4) {
            return com.squareup.cash.cdf.asset.SuggestionStrategy.REMOTE_SEARCH;
        }
        if (i != 8) {
            return null;
        }
        return com.squareup.cash.cdf.asset.SuggestionStrategy.FAVORITE;
    }
}
