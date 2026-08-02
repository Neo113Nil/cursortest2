package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Screen;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MessageToken;
import app.cash.paraphrase.FormattedResource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchContinuation;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.data.LinkingFlowsData;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.spendinginsights.screens.RecurringPaymentInfoScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.family.safetyhub.screens.SafetyHubScreens;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatHistoryScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.screens.MoneybotPreambleEditorScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.transfers.data.RecurringTransferData;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.ArrayDeque;

/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zza(int i) {
        this.$r8$classId = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Class cls;
        Screen screen;
        Screen screen2;
        boolean z;
        boolean z2;
        BlockersData.Style style;
        Redacted redacted;
        Redacted redacted2;
        Redacted redacted3;
        RatePlan ratePlan;
        boolean z3;
        boolean z4;
        RecurringTransferData recurringTransferData;
        BlockersData.AnalyticsData createFromParcel;
        RequestContext requestContext;
        BlockersData.MoneybotContext createFromParcel2;
        Class cls2;
        boolean z5;
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                int validateObjectHeader = ComposeUtilsKt.validateObjectHeader(parcel);
                int i2 = 0;
                int i3 = 0;
                PendingIntent pendingIntent = null;
                String str = null;
                Integer num = null;
                while (parcel.dataPosition() < validateObjectHeader) {
                    int readHeader = ComposeUtilsKt.readHeader(parcel);
                    int fieldId = ComposeUtilsKt.getFieldId(readHeader);
                    if (fieldId == 1) {
                        i2 = ComposeUtilsKt.readInt(parcel, readHeader);
                    } else if (fieldId == 2) {
                        i3 = ComposeUtilsKt.readInt(parcel, readHeader);
                    } else if (fieldId == 3) {
                        pendingIntent = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readHeader, PendingIntent.CREATOR);
                    } else if (fieldId == 4) {
                        str = ComposeUtilsKt.createString(parcel, readHeader);
                    } else if (fieldId != 5) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader);
                    } else {
                        num = ComposeUtilsKt.readIntegerObject(parcel, readHeader);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader);
                return new ConnectionResult(i2, i3, pendingIntent, str, num);
            case 1:
                parcel.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (i != readInt) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(SavedState.class.getClassLoader()));
                    i++;
                }
                return new SavedState(linkedHashMap);
            case 2:
                parcel.getClass();
                return new MarketingMessageData(MessageToken.CREATOR.createFromParcel(parcel).m1275unboximpl(), parcel.readString(), (LocalImage) parcel.readParcelable(MarketingMessageData.class.getClassLoader()), parcel.readString(), (Instant) parcel.readSerializable(), (LocalColor) parcel.readParcelable(MarketingMessageData.class.getClassLoader()), (LocalColor) parcel.readParcelable(MarketingMessageData.class.getClassLoader()), BrandSpot.CREATOR.createFromParcel(parcel), (LocalImage) parcel.readParcelable(MarketingMessageData.class.getClassLoader()), parcel.readInt() == 0 ? null : MarketingMessageOfferDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketingMessageData.Badge.CREATOR.createFromParcel(parcel));
            case 3:
                parcel.getClass();
                return new FormattedResource(parcel.readInt(), parcel.readValue(FormattedResource.class.getClassLoader()));
            case 4:
                int validateObjectHeader2 = ComposeUtilsKt.validateObjectHeader(parcel);
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult = null;
                String str2 = null;
                while (parcel.dataPosition() < validateObjectHeader2) {
                    int readHeader2 = ComposeUtilsKt.readHeader(parcel);
                    int fieldId2 = ComposeUtilsKt.getFieldId(readHeader2);
                    if (fieldId2 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readHeader2);
                    } else if (fieldId2 == 2) {
                        str2 = ComposeUtilsKt.createString(parcel, readHeader2);
                    } else if (fieldId2 == 3) {
                        pendingIntent2 = (PendingIntent) ComposeUtilsKt.createParcelable(parcel, readHeader2, PendingIntent.CREATOR);
                    } else if (fieldId2 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader2);
                    } else {
                        connectionResult = (ConnectionResult) ComposeUtilsKt.createParcelable(parcel, readHeader2, ConnectionResult.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader2);
                return new Status(i, str2, pendingIntent2, connectionResult);
            case 5:
                int validateObjectHeader3 = ComposeUtilsKt.validateObjectHeader(parcel);
                ArrayList arrayList = null;
                while (parcel.dataPosition() < validateObjectHeader3) {
                    int readHeader3 = ComposeUtilsKt.readHeader(parcel);
                    int fieldId3 = ComposeUtilsKt.getFieldId(readHeader3);
                    if (fieldId3 == 1) {
                        i = ComposeUtilsKt.readInt(parcel, readHeader3);
                    } else if (fieldId3 != 2) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader3);
                    } else {
                        arrayList = ComposeUtilsKt.createTypedList(parcel, readHeader3, MethodInvocation.CREATOR);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader3);
                return new TelemetryData(i, arrayList);
            case 6:
                int validateObjectHeader4 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j = 0;
                long j2 = 0;
                int i4 = -1;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < validateObjectHeader4) {
                    int readHeader4 = ComposeUtilsKt.readHeader(parcel);
                    switch (ComposeUtilsKt.getFieldId(readHeader4)) {
                        case 1:
                            i5 = ComposeUtilsKt.readInt(parcel, readHeader4);
                            break;
                        case 2:
                            i6 = ComposeUtilsKt.readInt(parcel, readHeader4);
                            break;
                        case 3:
                            i7 = ComposeUtilsKt.readInt(parcel, readHeader4);
                            break;
                        case 4:
                            j = ComposeUtilsKt.readLong(parcel, readHeader4);
                            break;
                        case 5:
                            j2 = ComposeUtilsKt.readLong(parcel, readHeader4);
                            break;
                        case 6:
                            str3 = ComposeUtilsKt.createString(parcel, readHeader4);
                            break;
                        case 7:
                            str4 = ComposeUtilsKt.createString(parcel, readHeader4);
                            break;
                        case 8:
                            i8 = ComposeUtilsKt.readInt(parcel, readHeader4);
                            break;
                        case 9:
                            i4 = ComposeUtilsKt.readInt(parcel, readHeader4);
                            break;
                        default:
                            ComposeUtilsKt.skipUnknownField(parcel, readHeader4);
                            break;
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader4);
                return new MethodInvocation(i5, i6, i7, j, j2, str3, str4, i8, i4);
            case 7:
                int validateObjectHeader5 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j3 = -1;
                boolean z6 = false;
                String str5 = null;
                while (parcel.dataPosition() < validateObjectHeader5) {
                    int readHeader5 = ComposeUtilsKt.readHeader(parcel);
                    int fieldId4 = ComposeUtilsKt.getFieldId(readHeader5);
                    if (fieldId4 == 1) {
                        str5 = ComposeUtilsKt.createString(parcel, readHeader5);
                    } else if (fieldId4 == 2) {
                        i = ComposeUtilsKt.readInt(parcel, readHeader5);
                    } else if (fieldId4 == 3) {
                        j3 = ComposeUtilsKt.readLong(parcel, readHeader5);
                    } else if (fieldId4 != 4) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader5);
                    } else {
                        z6 = ComposeUtilsKt.readBoolean(parcel, readHeader5);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader5);
                return new Feature(str5, i, j3, z6);
            case 8:
                int validateObjectHeader6 = ComposeUtilsKt.validateObjectHeader(parcel);
                long j4 = 0;
                long j5 = 0;
                boolean z7 = false;
                Bundle bundle = null;
                String str6 = null;
                while (parcel.dataPosition() < validateObjectHeader6) {
                    int readHeader6 = ComposeUtilsKt.readHeader(parcel);
                    int fieldId5 = ComposeUtilsKt.getFieldId(readHeader6);
                    if (fieldId5 == 1) {
                        j4 = ComposeUtilsKt.readLong(parcel, readHeader6);
                    } else if (fieldId5 == 2) {
                        j5 = ComposeUtilsKt.readLong(parcel, readHeader6);
                    } else if (fieldId5 == 3) {
                        z7 = ComposeUtilsKt.readBoolean(parcel, readHeader6);
                    } else if (fieldId5 == 7) {
                        bundle = ComposeUtilsKt.createBundle(parcel, readHeader6);
                    } else if (fieldId5 != 8) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader6);
                    } else {
                        str6 = ComposeUtilsKt.createString(parcel, readHeader6);
                    }
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader6);
                return new zzdb(j4, j5, z7, bundle, str6);
            case 9:
                int i9 = 1;
                int validateObjectHeader7 = ComposeUtilsKt.validateObjectHeader(parcel);
                Intent intent = null;
                String str7 = null;
                while (parcel.dataPosition() < validateObjectHeader7) {
                    int readHeader7 = ComposeUtilsKt.readHeader(parcel);
                    int fieldId6 = ComposeUtilsKt.getFieldId(readHeader7);
                    if (fieldId6 == i9) {
                        i = ComposeUtilsKt.readInt(parcel, readHeader7);
                    } else if (fieldId6 == 2) {
                        str7 = ComposeUtilsKt.createString(parcel, readHeader7);
                    } else if (fieldId6 != 3) {
                        ComposeUtilsKt.skipUnknownField(parcel, readHeader7);
                    } else {
                        intent = (Intent) ComposeUtilsKt.createParcelable(parcel, readHeader7, Intent.CREATOR);
                    }
                    i9 = 1;
                }
                ComposeUtilsKt.ensureAtEnd(parcel, validateObjectHeader7);
                return new zzdd(i, str7, intent);
            case 10:
                parcel.getClass();
                return new AccountSwitchScreenStateRelay(parcel.readInt() == 0 ? null : AccountSwitcher$AccountSwitchContinuation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountSwitcher$AccountSwitchingMetadata.CREATOR.createFromParcel(parcel), parcel.readString());
            case 11:
                parcel.getClass();
                RealBackStack realBackStack = new RealBackStack();
                int readInt2 = parcel.readInt();
                while (i < readInt2) {
                    ArrayDeque arrayDeque = realBackStack.entries;
                    Parcelable readParcelable = parcel.readParcelable(RealBackStack.class.getClassLoader());
                    readParcelable.getClass();
                    arrayDeque.addLast(readParcelable);
                    i++;
                }
                return realBackStack;
            case 12:
                parcel.getClass();
                BlockersData.Flow valueOf = BlockersData.Flow.valueOf(parcel.readString());
                String readString = parcel.readString();
                Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Flow$Type valueOf3 = parcel.readInt() == 0 ? null : Flow$Type.valueOf(parcel.readString());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                Screen screen3 = (Screen) parcel.readParcelable(BlockersData.class.getClassLoader());
                Screen screen4 = (Screen) parcel.readParcelable(BlockersData.class.getClassLoader());
                Screen screen5 = (Screen) parcel.readParcelable(BlockersData.class.getClassLoader());
                String readString4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    cls = BlockersData.class;
                    screen = screen3;
                    screen2 = screen4;
                    z = true;
                } else {
                    cls = BlockersData.class;
                    screen = screen3;
                    screen2 = screen4;
                    z = false;
                }
                boolean z8 = parcel.readInt() != 0;
                LinkingFlowsData createFromParcel3 = parcel.readInt() == 0 ? null : LinkingFlowsData.CREATOR.createFromParcel(parcel);
                OAuthConfig oAuthConfig = (OAuthConfig) parcel.readParcelable(cls.getClassLoader());
                BlockersData.BankAccountOAuthConfigSource valueOf4 = parcel.readInt() == 0 ? null : BlockersData.BankAccountOAuthConfigSource.valueOf(parcel.readString());
                boolean z9 = parcel.readInt() != 0;
                ClientScenario valueOf5 = parcel.readInt() == 0 ? null : ClientScenario.valueOf(parcel.readString());
                BlockersData.Style valueOf6 = BlockersData.Style.valueOf(parcel.readString());
                ScenarioPlan scenarioPlan = (ScenarioPlan) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted4 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted5 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted6 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted7 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted8 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted9 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted10 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                SignalsContext signalsContext = (SignalsContext) parcel.readParcelable(cls.getClassLoader());
                Redacted redacted11 = (Redacted) parcel.readParcelable(cls.getClassLoader());
                RatePlan valueOf7 = RatePlan.valueOf(parcel.readString());
                StatusResult statusResult = (StatusResult) parcel.readParcelable(cls.getClassLoader());
                if (parcel.readInt() != 0) {
                    z2 = true;
                    style = valueOf6;
                    redacted = redacted4;
                    redacted2 = redacted7;
                    redacted3 = redacted10;
                    ratePlan = valueOf7;
                    z3 = true;
                } else {
                    z2 = true;
                    style = valueOf6;
                    redacted = redacted4;
                    redacted2 = redacted7;
                    redacted3 = redacted10;
                    ratePlan = valueOf7;
                    z3 = false;
                }
                BlockersData.BankAccountOAuthConfigSource bankAccountOAuthConfigSource = valueOf4;
                ClientScenario clientScenario = valueOf5;
                boolean z10 = parcel.readInt() != 0 ? z2 : false;
                if (parcel.readInt() != 0) {
                    z4 = z2;
                } else {
                    z4 = z2;
                    z2 = false;
                }
                InstrumentSelection instrumentSelection = (InstrumentSelection) parcel.readParcelable(cls.getClassLoader());
                TransferData transferData = (TransferData) parcel.readParcelable(cls.getClassLoader());
                RecurringTransferData recurringTransferData2 = (RecurringTransferData) parcel.readParcelable(cls.getClassLoader());
                if (parcel.readInt() == 0) {
                    recurringTransferData = recurringTransferData2;
                    createFromParcel = null;
                } else {
                    recurringTransferData = recurringTransferData2;
                    createFromParcel = BlockersData.AnalyticsData.CREATOR.createFromParcel(parcel);
                }
                BlockersData.AnalyticsData analyticsData = createFromParcel;
                Region valueOf8 = Region.valueOf(parcel.readString());
                Money money = (Money) parcel.readParcelable(cls.getClassLoader());
                ColorModel colorModel = (ColorModel) parcel.readParcelable(cls.getClassLoader());
                Color color = (Color) parcel.readParcelable(cls.getClassLoader());
                Color color2 = (Color) parcel.readParcelable(cls.getClassLoader());
                boolean z11 = z4;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                Long valueOf9 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                RequestContext requestContext2 = (RequestContext) parcel.readParcelable(cls.getClassLoader());
                if (parcel.readInt() == 0) {
                    requestContext = requestContext2;
                    createFromParcel2 = null;
                } else {
                    requestContext = requestContext2;
                    createFromParcel2 = BlockersData.MoneybotContext.CREATOR.createFromParcel(parcel);
                }
                return new BlockersData(valueOf, readString, valueOf2, valueOf3, readString2, readString3, screen, screen2, screen5, readString4, z, z8, createFromParcel3, oAuthConfig, bankAccountOAuthConfigSource, z9, clientScenario, style, scenarioPlan, redacted, redacted5, redacted6, redacted2, redacted8, redacted9, redacted3, signalsContext, redacted11, ratePlan, statusResult, z3, z10, z2, instrumentSelection, transferData, recurringTransferData, analyticsData, valueOf8, money, colorModel, color, color2, createStringArrayList, valueOf9, z11, requestContext, createFromParcel2, BlockersData.JourneyContext.CREATOR.createFromParcel(parcel));
            case 13:
                parcel.getClass();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                JourneyOutcome valueOf10 = parcel.readInt() != 0 ? JourneyOutcome.valueOf(parcel.readString()) : null;
                ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                for (int i10 = 0; i10 != readInt3; i10++) {
                    linkedHashMap2.put(parcel.readString(), JourneyOutcome.valueOf(parcel.readString()));
                }
                return new BlockersData.JourneyContext(createStringArrayList2, createStringArrayList3, valueOf10, createStringArrayList4, linkedHashMap2);
            case 14:
                parcel.getClass();
                return ScenarioPlans.valueOf(parcel.readString());
            case 15:
                parcel.getClass();
                BlockersData blockersData = (BlockersData) parcel.readParcelable(BlockersScreens.RegisterAliasScreen.class.getClassLoader());
                BlockersScreens.RegisterAliasScreen.Mode valueOf11 = BlockersScreens.RegisterAliasScreen.Mode.valueOf(parcel.readString());
                Redacted redacted12 = (Redacted) parcel.readParcelable(BlockersScreens.RegisterAliasScreen.class.getClassLoader());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() != 0) {
                    cls2 = BlockersScreens.RegisterAliasScreen.class;
                    z5 = true;
                } else {
                    cls2 = BlockersScreens.RegisterAliasScreen.class;
                    z5 = false;
                }
                return new BlockersScreens.RegisterAliasScreen(blockersData, valueOf11, redacted12, readString5, readString6, readString7, readString8, readString9, z5, parcel.readInt() != 0, (BlockersScreens.RegisterAliasScreen.RegisterAliasType) parcel.readParcelable(cls2.getClassLoader()));
            case 16:
                parcel.getClass();
                parcel.readInt();
                return BlockersScreens.RegisterAliasScreen.RegisterAliasType.RegisterAliasOnly.INSTANCE;
            case 17:
                parcel.getClass();
                parcel.readInt();
                return RecurringPaymentInfoScreen.INSTANCE;
            case 18:
                parcel.getClass();
                parcel.readInt();
                return SafetyHubScreens.SafetyHubScreen.INSTANCE;
            case 19:
                parcel.getClass();
                return new InitialScreenPlaceholder((InitialScreenPlaceholder.TriggeredBy) parcel.readParcelable(InitialScreenPlaceholder.class.getClassLoader()));
            case 20:
                parcel.getClass();
                return new InitialScreenPlaceholder.TriggeredBy.ActivityLaunch((Intent) parcel.readParcelable(InitialScreenPlaceholder.TriggeredBy.ActivityLaunch.class.getClassLoader()));
            case 21:
                parcel.getClass();
                parcel.readInt();
                return InitialScreenPlaceholder.TriggeredBy.SignOut.INSTANCE;
            case 22:
                parcel.getClass();
                parcel.readInt();
                return MoneybotAutomationsScreen.INSTANCE;
            case 23:
                parcel.getClass();
                parcel.readInt();
                return MoneybotChatHistoryScreen.INSTANCE;
            case 24:
                parcel.getClass();
                parcel.readInt();
                return MoneybotHomeScreen.INSTANCE;
            case 25:
                parcel.getClass();
                parcel.readInt();
                return MoneybotPreambleEditorScreen.INSTANCE;
            case 26:
                parcel.getClass();
                parcel.readInt();
                return PaymentScreens$HomeScreens$Home.INSTANCE;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return PaymentScreens$HomeScreens$PaymentPad.INSTANCE;
            case 28:
                parcel.getClass();
                parcel.readInt();
                return Back.INSTANCE;
            default:
                parcel.getClass();
                return new RedactedParcelable(parcel.readParcelable(RedactedParcelable.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$r8$classId) {
            case 0:
                return new ConnectionResult[i];
            case 1:
                return new SavedState[i];
            case 2:
                return new MarketingMessageData[i];
            case 3:
                return new FormattedResource[i];
            case 4:
                return new Status[i];
            case 5:
                return new TelemetryData[i];
            case 6:
                return new MethodInvocation[i];
            case 7:
                return new Feature[i];
            case 8:
                return new zzdb[i];
            case 9:
                return new zzdd[i];
            case 10:
                return new AccountSwitchScreenStateRelay[i];
            case 11:
                return new RealBackStack[i];
            case 12:
                return new BlockersData[i];
            case 13:
                return new BlockersData.JourneyContext[i];
            case 14:
                return new ScenarioPlans[i];
            case 15:
                return new BlockersScreens.RegisterAliasScreen[i];
            case 16:
                return new BlockersScreens.RegisterAliasScreen.RegisterAliasType.RegisterAliasOnly[i];
            case 17:
                return new RecurringPaymentInfoScreen[i];
            case 18:
                return new SafetyHubScreens.SafetyHubScreen[i];
            case 19:
                return new InitialScreenPlaceholder[i];
            case 20:
                return new InitialScreenPlaceholder.TriggeredBy.ActivityLaunch[i];
            case 21:
                return new InitialScreenPlaceholder.TriggeredBy.SignOut[i];
            case 22:
                return new MoneybotAutomationsScreen[i];
            case 23:
                return new MoneybotChatHistoryScreen[i];
            case 24:
                return new MoneybotHomeScreen[i];
            case 25:
                return new MoneybotPreambleEditorScreen[i];
            case 26:
                return new PaymentScreens$HomeScreens$Home[i];
            case 27:
                return new PaymentScreens$HomeScreens$PaymentPad[i];
            case 28:
                return new Back[i];
            default:
                return new RedactedParcelable[i];
        }
    }
}
