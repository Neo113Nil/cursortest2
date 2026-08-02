package com.squareup.cash.blockers.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.common.zza;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.transfers.data.RecurringTransferData;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyOutcome;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneySignals;
import com.squareup.protos.cash.blockuserjourneys.api.v1.JourneyStart;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.OAuthConfig;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class BlockersData implements Parcelable {
    public static final BlockersData DUMMY;
    public final ColorModel accentColor;
    public final Redacted address;
    public final boolean addressTypeaheadEnabled;
    public final Money amount;
    public final AnalyticsData analyticsData;
    public final BankAccountOAuthConfigSource bankAccountOAuthConfigSource;
    public final OAuthConfig bankAccountOauthConfig;
    public final Redacted birthday;
    public final String blockerId;
    public final Long blockerStartTime;
    public final ClientScenario clientScenario;
    public final Screen currentScreenToReplace;
    public final String customerPasscodeInstrumentToken;
    public final Redacted displayName;
    public final Redacted emailAddress;
    public final Screen exitScreen;
    public final Screen exitScreenOnSuccess;
    public final Flow flow;
    public final List flowPath;
    public final Long flowStartTime;
    public final String flowToken;
    public final Flow$Type flowType;
    public final boolean forceManualAch;
    public final Color fullBleedBackgroundColor;
    public final String groupId;
    public final boolean hasLinkedCard;
    public final SignalsContext idvSignalsContext;
    public final InstrumentSelection instrumentSelection;
    public final JourneyContext journeyContext;
    public final Redacted legalName;
    public final LinkingFlowsData linkingFlowsData;
    public final boolean manualAchEnabled;
    public final MoneybotContext moneybotContext;
    public final RatePlan ratePlan;
    public final RecurringTransferData recurringTransferData;
    public final Region region;
    public final RequestContext requestContext;
    public final ScenarioPlan scenarioPlan;
    public final Redacted securityCode;
    public final boolean seenInviteFriends;
    public final Color serverAccentColor;
    public final boolean showAsHalfSheet;
    public final boolean skipBiometrics;
    public final Redacted smsNumber;
    public final Redacted ssn;
    public final StatusResult statusResult;
    public final Style style;
    public final TransferData transferData;
    public static final Parcelable.Creator<BlockersData> CREATOR = new zza(12);
    public static final ScenarioPlan EMPTY_SCENARIO_PLAN = new ScenarioPlan(510);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/squareup/cash/blockers/data/BlockersData$BankAccountOAuthConfigSource", "", "Lcom/squareup/cash/blockers/data/BlockersData$BankAccountOAuthConfigSource;", "APP_CONFIG", "CARD_BLOCKER_SUPPLEMENT", "data"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class BankAccountOAuthConfigSource {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BankAccountOAuthConfigSource[] $VALUES;
        public static final BankAccountOAuthConfigSource APP_CONFIG;
        public static final BankAccountOAuthConfigSource CARD_BLOCKER_SUPPLEMENT;

        static {
            BankAccountOAuthConfigSource bankAccountOAuthConfigSource = new BankAccountOAuthConfigSource("APP_CONFIG", 0);
            APP_CONFIG = bankAccountOAuthConfigSource;
            BankAccountOAuthConfigSource bankAccountOAuthConfigSource2 = new BankAccountOAuthConfigSource("CARD_BLOCKER_SUPPLEMENT", 1);
            CARD_BLOCKER_SUPPLEMENT = bankAccountOAuthConfigSource2;
            BankAccountOAuthConfigSource[] bankAccountOAuthConfigSourceArr = {bankAccountOAuthConfigSource, bankAccountOAuthConfigSource2};
            $VALUES = bankAccountOAuthConfigSourceArr;
            $ENTRIES = new EnumEntriesList(bankAccountOAuthConfigSourceArr);
        }

        public static BankAccountOAuthConfigSource valueOf(String str) {
            return (BankAccountOAuthConfigSource) Enum.valueOf(BankAccountOAuthConfigSource.class, str);
        }

        public static BankAccountOAuthConfigSource[] values() {
            return (BankAccountOAuthConfigSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/squareup/cash/blockers/data/BlockersData$Flow", "", "Lcom/squareup/cash/blockers/data/BlockersData$Flow;", "Companion", "ONBOARDING", "PAYMENT", "STATUS_RESULT", "CASHTAG", "TRANSFER", "PROFILE_BLOCKERS", "LINK_CARD", "SERVER_FLOW", "CLIENT_SCENARIO", "INSTRUMENT_SELECTION", "UNKNOWN", "data"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;
        public static final Flow CASHTAG;
        public static final Flow CLIENT_SCENARIO;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Flow INSTRUMENT_SELECTION;
        public static final Flow LINK_CARD;
        public static final Flow ONBOARDING;
        public static final Flow PAYMENT;
        public static final Flow PROFILE_BLOCKERS;
        public static final Flow SERVER_FLOW;
        public static final Flow STATUS_RESULT;
        public static final Flow TRANSFER;
        public static final Flow UNKNOWN;

        public final class Companion {
            public static String generateToken() {
                try {
                    byte[] bArr = new byte[18];
                    SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                    ByteString.Companion companion = ByteString.Companion;
                    byte[] copyOf = Arrays.copyOf(bArr, 18);
                    return new ByteString(Arrays.copyOf(copyOf, copyOf.length)).base64Url();
                } catch (NoSuchAlgorithmException unused) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return null;
                }
            }
        }

        static {
            Flow flow = new Flow("ONBOARDING", 0);
            ONBOARDING = flow;
            Flow flow2 = new Flow("PAYMENT", 1);
            PAYMENT = flow2;
            Flow flow3 = new Flow("STATUS_RESULT", 2);
            STATUS_RESULT = flow3;
            Flow flow4 = new Flow("CASHTAG", 3);
            CASHTAG = flow4;
            Flow flow5 = new Flow("TRANSFER", 4);
            TRANSFER = flow5;
            Flow flow6 = new Flow("PROFILE_BLOCKERS", 5);
            PROFILE_BLOCKERS = flow6;
            Flow flow7 = new Flow("LINK_CARD", 6);
            LINK_CARD = flow7;
            Flow flow8 = new Flow("SERVER_FLOW", 7);
            SERVER_FLOW = flow8;
            Flow flow9 = new Flow("CLIENT_SCENARIO", 8);
            CLIENT_SCENARIO = flow9;
            Flow flow10 = new Flow("INSTRUMENT_SELECTION", 9);
            INSTRUMENT_SELECTION = flow10;
            Flow flow11 = new Flow("UNKNOWN", 10);
            UNKNOWN = flow11;
            Flow[] flowArr = {flow, flow2, flow3, flow4, flow5, flow6, flow7, flow8, flow9, flow10, flow11};
            $VALUES = flowArr;
            $ENTRIES = new EnumEntriesList(flowArr);
            INSTANCE = new Companion();
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }
    }

    public final class JourneyContext implements Parcelable {
        public static final Parcelable.Creator<JourneyContext> CREATOR = new zza(13);
        public final List frictionSignals;
        public final List frustrationSignals;
        public final JourneyOutcome outcome;
        public final Map subJourneyOutcomes;
        public final List subJourneysStarted;

        public JourneyContext(List list, List list2, JourneyOutcome journeyOutcome, List list3, Map map) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            map.getClass();
            this.frustrationSignals = list;
            this.frictionSignals = list2;
            this.outcome = journeyOutcome;
            this.subJourneysStarted = list3;
            this.subJourneyOutcomes = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JourneyContext)) {
                return false;
            }
            JourneyContext journeyContext = (JourneyContext) obj;
            return Intrinsics.areEqual(this.frustrationSignals, journeyContext.frustrationSignals) && Intrinsics.areEqual(this.frictionSignals, journeyContext.frictionSignals) && this.outcome == journeyContext.outcome && Intrinsics.areEqual(this.subJourneysStarted, journeyContext.subJourneysStarted) && Intrinsics.areEqual(this.subJourneyOutcomes, journeyContext.subJourneyOutcomes);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.frustrationSignals.hashCode() * 31, 31, this.frictionSignals);
            JourneyOutcome journeyOutcome = this.outcome;
            return this.subJourneyOutcomes.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (journeyOutcome == null ? 0 : journeyOutcome.hashCode())) * 31, 31, this.subJourneysStarted);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("JourneyContext(frustrationSignals=", ", frictionSignals=", ", outcome=", this.frustrationSignals, this.frictionSignals);
            m.append(this.outcome);
            m.append(", subJourneysStarted=");
            m.append(this.subJourneysStarted);
            m.append(", subJourneyOutcomes=");
            return re$$ExternalSyntheticOutline0.m(")", m, this.subJourneyOutcomes);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeStringList(this.frustrationSignals);
            parcel.writeStringList(this.frictionSignals);
            JourneyOutcome journeyOutcome = this.outcome;
            if (journeyOutcome == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(journeyOutcome.name());
            }
            parcel.writeStringList(this.subJourneysStarted);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.subJourneyOutcomes, parcel);
            while (m.hasNext()) {
                Map.Entry entry = (Map.Entry) m.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString(((JourneyOutcome) entry.getValue()).name());
            }
        }
    }

    public final class MoneybotContext implements Parcelable {
        public static final Parcelable.Creator<MoneybotContext> CREATOR = new MoveBitcoinScreen.Creator(22);
        public final String sessionId;
        public final String toolRequestId;

        public MoneybotContext(String str, String str2) {
            str.getClass();
            this.sessionId = str;
            this.toolRequestId = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoneybotContext)) {
                return false;
            }
            MoneybotContext moneybotContext = (MoneybotContext) obj;
            return Intrinsics.areEqual(this.sessionId, moneybotContext.sessionId) && Intrinsics.areEqual(this.toolRequestId, moneybotContext.toolRequestId);
        }

        public final int hashCode() {
            int hashCode = this.sessionId.hashCode() * 31;
            String str = this.toolRequestId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("MoneybotContext(sessionId=", this.sessionId, ", toolRequestId=", this.toolRequestId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sessionId);
            parcel.writeString(this.toolRequestId);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/squareup/cash/blockers/data/BlockersData$Style", "", "Lcom/squareup/cash/blockers/data/BlockersData$Style;", "FULLSCREEN", "DIALOG", "data"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Style {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style DIALOG;
        public static final Style FULLSCREEN;

        static {
            Style style = new Style("FULLSCREEN", 0);
            FULLSCREEN = style;
            Style style2 = new Style("DIALOG", 1);
            DIALOG = style2;
            Style[] styleArr = {style, style2};
            $VALUES = styleArr;
            $ENTRIES = new EnumEntriesList(styleArr);
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.ACCEPT_CRYPTO_PAYMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.DECLINE_CRYPTO_PAYMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientScenario.ENABLE_CRYPTOCURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientScenario.ENABLE_CRYPTOCURRENCY_TRANSFER_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientScenario.ENABLE_CRYPTOCURRENCY_TRANSFER_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClientScenario.EXCHANGE_CURRENCY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClientScenario.INITIATE_BITCOIN_WITHDRAWAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ClientScenario.INITIATE_CRYPTO_PAYMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ClientScenario.INITIATE_CRYPTO_WITHDRAWAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ClientScenario.INITIATE_LIGHTNING_WITHDRAWAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ClientScenario.TRANSFER_CRYPTOCURRENCY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ClientScenario.INITIATE_TAX_UPGRADE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ClientScenario.SEND_TAX_FORM_EMAIL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Flow$Type.values().length];
            try {
                UiAlias.Type.Companion companion = Flow$Type.Companion;
                iArr2[76] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                UiAlias.Type.Companion companion2 = Flow$Type.Companion;
                iArr2[60] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Flow flow = Flow.UNKNOWN;
        Flow.INSTANCE.getClass();
        DUMMY = new BlockersData(flow, Flow.Companion.generateToken(), Back.INSTANCE, null, "", false, false, null, null, null, false, null, null, null, null, Region.USA, null, null, -36420, 65503);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlockersData(Flow flow, String str, Screen screen, Screen screen2, String str2, boolean z, boolean z2, LinkingFlowsData linkingFlowsData, OAuthConfig oAuthConfig, BankAccountOAuthConfigSource bankAccountOAuthConfigSource, boolean z3, ClientScenario clientScenario, Style style, ScenarioPlan scenarioPlan, AnalyticsData analyticsData, Region region, RequestContext requestContext, MoneybotContext moneybotContext, int i, int i2) {
        this(flow, str, null, null, null, null, screen, r11, null, str2, z, z2, r16, r17, r18, z3, r20, r21, r22, r0, r2, r4, r5, r6, r7, r8, r9, r10, r32, null, false, false, false, null, null, null, r40, region, null, null, null, null, r46, null, false, r49, r50, new JourneyContext(r46, r46, null, r46, r28));
        Screen screen3 = (i & 128) != 0 ? screen : screen2;
        LinkingFlowsData linkingFlowsData2 = (i & 4096) != 0 ? null : linkingFlowsData;
        OAuthConfig oAuthConfig2 = (i & PKIFailureInfo.certRevoked) != 0 ? null : oAuthConfig;
        BankAccountOAuthConfigSource bankAccountOAuthConfigSource2 = (i & 16384) != 0 ? null : bankAccountOAuthConfigSource;
        ClientScenario clientScenario2 = (65536 & i) != 0 ? null : clientScenario;
        Style style2 = (131072 & i) != 0 ? Style.FULLSCREEN : style;
        ScenarioPlan scenarioPlan2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? EMPTY_SCENARIO_PLAN : scenarioPlan;
        RedactedString redactedString = new RedactedString(null);
        RedactedString redactedString2 = new RedactedString(null);
        RedactedString redactedString3 = new RedactedString(null);
        RedactedString redactedString4 = new RedactedString(null);
        RedactedString redactedString5 = new RedactedString(null);
        RedactedString redactedString6 = new RedactedString(null);
        RedactedParcelable redactedParcelable = new RedactedParcelable(null);
        SignalsContext signalsContext = new SignalsContext((ArrayList) null, (Boolean) null, (Boolean) null, 15);
        RedactedString redactedString7 = new RedactedString(null);
        RatePlan ratePlan = RatePlan.UNDECIDED;
        AnalyticsData analyticsData2 = (i2 & 16) != 0 ? null : analyticsData;
        EmptyList emptyList = EmptyList.INSTANCE;
        RequestContext requestContext2 = (i2 & PKIFailureInfo.certRevoked) != 0 ? new RequestContext(null, null, null, null, null, null, null, null, 8191) : requestContext;
        MoneybotContext moneybotContext2 = (i2 & 16384) != 0 ? null : moneybotContext;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v24, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r4v27, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v29, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v30, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v33, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v34, types: [com.squareup.cash.screens.Redacted] */
    /* JADX WARN: Type inference failed for: r4v35, types: [com.squareup.cash.screens.Redacted] */
    public static BlockersData copy$default(BlockersData blockersData, Flow flow, String str, Long l, Flow$Type flow$Type, String str2, String str3, Screen screen, BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen, boolean z, boolean z2, LinkingFlowsData linkingFlowsData, OAuthConfig oAuthConfig, BankAccountOAuthConfigSource bankAccountOAuthConfigSource, boolean z3, ClientScenario clientScenario, Style style, ScenarioPlan scenarioPlan, RedactedString redactedString, RedactedString redactedString2, RedactedString redactedString3, RedactedString redactedString4, Redacted redacted, RedactedString redactedString5, RedactedParcelable redactedParcelable, SignalsContext signalsContext, RedactedString redactedString6, StatusResult statusResult, boolean z4, InstrumentSelection instrumentSelection, TransferData transferData, RecurringTransferData recurringTransferData, AnalyticsData analyticsData, Region region, Money money, ColorModel colorModel, Color color, Color color2, List list, Long l2, boolean z5, RequestContext requestContext, MoneybotContext moneybotContext, JourneyContext journeyContext, int i, int i2) {
        Flow flow2 = (i & 1) != 0 ? blockersData.flow : flow;
        String str4 = (i & 2) != 0 ? blockersData.flowToken : str;
        Long l3 = (i & 4) != 0 ? blockersData.flowStartTime : l;
        Flow$Type flow$Type2 = (i & 8) != 0 ? blockersData.flowType : flow$Type;
        String str5 = (i & 16) != 0 ? blockersData.blockerId : str2;
        String str6 = (i & 32) != 0 ? blockersData.groupId : str3;
        Screen screen2 = (i & 64) != 0 ? blockersData.exitScreen : screen;
        Screen screen3 = blockersData.exitScreenOnSuccess;
        BlockersScreens.TreehouseBlockerScreen treehouseBlockerScreen2 = (i & 256) != 0 ? blockersData.currentScreenToReplace : treehouseBlockerScreen;
        String str7 = blockersData.customerPasscodeInstrumentToken;
        boolean z6 = (i & 1024) != 0 ? blockersData.manualAchEnabled : z;
        boolean z7 = (i & 2048) != 0 ? blockersData.forceManualAch : z2;
        LinkingFlowsData linkingFlowsData2 = (i & 4096) != 0 ? blockersData.linkingFlowsData : linkingFlowsData;
        OAuthConfig oAuthConfig2 = (i & PKIFailureInfo.certRevoked) != 0 ? blockersData.bankAccountOauthConfig : oAuthConfig;
        BankAccountOAuthConfigSource bankAccountOAuthConfigSource2 = (i & 16384) != 0 ? blockersData.bankAccountOAuthConfigSource : bankAccountOAuthConfigSource;
        boolean z8 = (i & 32768) != 0 ? blockersData.addressTypeaheadEnabled : z3;
        ClientScenario clientScenario2 = (65536 & i) != 0 ? blockersData.clientScenario : clientScenario;
        Style style2 = (131072 & i) != 0 ? blockersData.style : style;
        ScenarioPlan scenarioPlan2 = (262144 & i) != 0 ? blockersData.scenarioPlan : scenarioPlan;
        RedactedString redactedString7 = (524288 & i) != 0 ? blockersData.smsNumber : redactedString;
        RedactedString redactedString8 = (1048576 & i) != 0 ? blockersData.emailAddress : redactedString2;
        RedactedString redactedString9 = (2097152 & i) != 0 ? blockersData.displayName : redactedString3;
        RedactedString redactedString10 = (4194304 & i) != 0 ? blockersData.legalName : redactedString4;
        Redacted redacted2 = (8388608 & i) != 0 ? blockersData.birthday : redacted;
        RedactedString redactedString11 = (16777216 & i) != 0 ? blockersData.ssn : redactedString5;
        RedactedParcelable redactedParcelable2 = (33554432 & i) != 0 ? blockersData.address : redactedParcelable;
        SignalsContext signalsContext2 = (67108864 & i) != 0 ? blockersData.idvSignalsContext : signalsContext;
        RedactedString redactedString12 = (134217728 & i) != 0 ? blockersData.securityCode : redactedString6;
        RatePlan ratePlan = blockersData.ratePlan;
        StatusResult statusResult2 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? blockersData.statusResult : statusResult;
        boolean z9 = (1073741824 & i) != 0 ? blockersData.seenInviteFriends : true;
        boolean z10 = (i & PKIFailureInfo.systemUnavail) != 0 ? blockersData.showAsHalfSheet : z4;
        boolean z11 = (i2 & 1) != 0 ? blockersData.hasLinkedCard : true;
        InstrumentSelection instrumentSelection2 = (i2 & 2) != 0 ? blockersData.instrumentSelection : instrumentSelection;
        TransferData transferData2 = (i2 & 4) != 0 ? blockersData.transferData : transferData;
        RecurringTransferData recurringTransferData2 = (i2 & 8) != 0 ? blockersData.recurringTransferData : recurringTransferData;
        AnalyticsData analyticsData2 = (i2 & 16) != 0 ? blockersData.analyticsData : analyticsData;
        Region region2 = (i2 & 32) != 0 ? blockersData.region : region;
        Money money2 = (i2 & 64) != 0 ? blockersData.amount : money;
        ColorModel colorModel2 = (i2 & 128) != 0 ? blockersData.accentColor : colorModel;
        Color color3 = (i2 & 256) != 0 ? blockersData.serverAccentColor : color;
        Color color4 = (i2 & 512) != 0 ? blockersData.fullBleedBackgroundColor : color2;
        List list2 = (i2 & 1024) != 0 ? blockersData.flowPath : list;
        Long l4 = (i2 & 2048) != 0 ? blockersData.blockerStartTime : l2;
        boolean z12 = (i2 & 4096) != 0 ? blockersData.skipBiometrics : z5;
        RequestContext requestContext2 = (i2 & PKIFailureInfo.certRevoked) != 0 ? blockersData.requestContext : requestContext;
        MoneybotContext moneybotContext2 = (i2 & 16384) != 0 ? blockersData.moneybotContext : moneybotContext;
        JourneyContext journeyContext2 = (i2 & 32768) != 0 ? blockersData.journeyContext : journeyContext;
        blockersData.getClass();
        flow2.getClass();
        str4.getClass();
        screen2.getClass();
        screen3.getClass();
        str7.getClass();
        style2.getClass();
        redactedString7.getClass();
        redactedString8.getClass();
        redactedString9.getClass();
        redactedString10.getClass();
        redacted2.getClass();
        redactedString11.getClass();
        redactedParcelable2.getClass();
        signalsContext2.getClass();
        redactedString12.getClass();
        ratePlan.getClass();
        region2.getClass();
        list2.getClass();
        requestContext2.getClass();
        journeyContext2.getClass();
        return new BlockersData(flow2, str4, l3, flow$Type2, str5, str6, screen2, screen3, treehouseBlockerScreen2, str7, z6, z7, linkingFlowsData2, oAuthConfig2, bankAccountOAuthConfigSource2, z8, clientScenario2, style2, scenarioPlan2, redactedString7, redactedString8, redactedString9, redactedString10, redacted2, redactedString11, redactedParcelable2, signalsContext2, redactedString12, ratePlan, statusResult2, z9, z10, z11, instrumentSelection2, transferData2, recurringTransferData2, analyticsData2, region2, money2, colorModel2, color3, color4, list2, l4, z12, requestContext2, moneybotContext2, journeyContext2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockersData)) {
            return false;
        }
        BlockersData blockersData = (BlockersData) obj;
        return this.flow == blockersData.flow && Intrinsics.areEqual(this.flowToken, blockersData.flowToken) && Intrinsics.areEqual(this.flowStartTime, blockersData.flowStartTime) && this.flowType == blockersData.flowType && Intrinsics.areEqual(this.blockerId, blockersData.blockerId) && Intrinsics.areEqual(this.groupId, blockersData.groupId) && Intrinsics.areEqual(this.exitScreen, blockersData.exitScreen) && Intrinsics.areEqual(this.exitScreenOnSuccess, blockersData.exitScreenOnSuccess) && Intrinsics.areEqual(this.currentScreenToReplace, blockersData.currentScreenToReplace) && Intrinsics.areEqual(this.customerPasscodeInstrumentToken, blockersData.customerPasscodeInstrumentToken) && this.manualAchEnabled == blockersData.manualAchEnabled && this.forceManualAch == blockersData.forceManualAch && Intrinsics.areEqual(this.linkingFlowsData, blockersData.linkingFlowsData) && Intrinsics.areEqual(this.bankAccountOauthConfig, blockersData.bankAccountOauthConfig) && this.bankAccountOAuthConfigSource == blockersData.bankAccountOAuthConfigSource && this.addressTypeaheadEnabled == blockersData.addressTypeaheadEnabled && this.clientScenario == blockersData.clientScenario && this.style == blockersData.style && Intrinsics.areEqual(this.scenarioPlan, blockersData.scenarioPlan) && Intrinsics.areEqual(this.smsNumber, blockersData.smsNumber) && Intrinsics.areEqual(this.emailAddress, blockersData.emailAddress) && Intrinsics.areEqual(this.displayName, blockersData.displayName) && Intrinsics.areEqual(this.legalName, blockersData.legalName) && Intrinsics.areEqual(this.birthday, blockersData.birthday) && Intrinsics.areEqual(this.ssn, blockersData.ssn) && Intrinsics.areEqual(this.address, blockersData.address) && Intrinsics.areEqual(this.idvSignalsContext, blockersData.idvSignalsContext) && Intrinsics.areEqual(this.securityCode, blockersData.securityCode) && this.ratePlan == blockersData.ratePlan && Intrinsics.areEqual(this.statusResult, blockersData.statusResult) && this.seenInviteFriends == blockersData.seenInviteFriends && this.showAsHalfSheet == blockersData.showAsHalfSheet && this.hasLinkedCard == blockersData.hasLinkedCard && Intrinsics.areEqual(this.instrumentSelection, blockersData.instrumentSelection) && Intrinsics.areEqual(this.transferData, blockersData.transferData) && Intrinsics.areEqual(this.recurringTransferData, blockersData.recurringTransferData) && Intrinsics.areEqual(this.analyticsData, blockersData.analyticsData) && this.region == blockersData.region && Intrinsics.areEqual(this.amount, blockersData.amount) && Intrinsics.areEqual(this.accentColor, blockersData.accentColor) && Intrinsics.areEqual(this.serverAccentColor, blockersData.serverAccentColor) && Intrinsics.areEqual(this.fullBleedBackgroundColor, blockersData.fullBleedBackgroundColor) && Intrinsics.areEqual(this.flowPath, blockersData.flowPath) && Intrinsics.areEqual(this.blockerStartTime, blockersData.blockerStartTime) && this.skipBiometrics == blockersData.skipBiometrics && Intrinsics.areEqual(this.requestContext, blockersData.requestContext) && Intrinsics.areEqual(this.moneybotContext, blockersData.moneybotContext) && Intrinsics.areEqual(this.journeyContext, blockersData.journeyContext);
    }

    public final ClientScenario getClientScenario() {
        return this.clientScenario;
    }

    public final String getNextBlockerId() {
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.firstOrNull(getNextBlockers());
        if (blockerDescriptor != null) {
            return blockerDescriptor.id;
        }
        return null;
    }

    public final String getNextBlockerType() {
        Blockers blockers;
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.firstOrNull(getNextBlockers());
        if (blockerDescriptor == null || (blockers = blockerDescriptor.blocker) == null) {
            return null;
        }
        return TransactorKt.blockerType(blockers);
    }

    public final List getNextBlockers() {
        return Trace.generateNextBlockers(this.scenarioPlan, this.requestContext);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flow.hashCode() * 31, 31, this.flowToken);
        Long l = this.flowStartTime;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        Flow$Type flow$Type = this.flowType;
        int hashCode2 = (hashCode + (flow$Type == null ? 0 : flow$Type.hashCode())) * 31;
        String str = this.blockerId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupId;
        int m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreenOnSuccess, BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Screen screen = this.currentScreenToReplace;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (screen == null ? 0 : screen.hashCode())) * 31, 31, this.customerPasscodeInstrumentToken), 31, this.manualAchEnabled), 31, this.forceManualAch);
        LinkingFlowsData linkingFlowsData = this.linkingFlowsData;
        int hashCode4 = (m3 + (linkingFlowsData == null ? 0 : linkingFlowsData.hashCode())) * 31;
        OAuthConfig oAuthConfig = this.bankAccountOauthConfig;
        int hashCode5 = (hashCode4 + (oAuthConfig == null ? 0 : oAuthConfig.hashCode())) * 31;
        BankAccountOAuthConfigSource bankAccountOAuthConfigSource = this.bankAccountOAuthConfigSource;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (bankAccountOAuthConfigSource == null ? 0 : bankAccountOAuthConfigSource.hashCode())) * 31, 31, this.addressTypeaheadEnabled);
        ClientScenario clientScenario = this.clientScenario;
        int hashCode6 = (this.style.hashCode() + ((m4 + (clientScenario == null ? 0 : clientScenario.hashCode())) * 31)) * 31;
        ScenarioPlan scenarioPlan = this.scenarioPlan;
        int hashCode7 = (this.ratePlan.hashCode() + re$$ExternalSyntheticOutline0.m(this.securityCode, (this.idvSignalsContext.hashCode() + re$$ExternalSyntheticOutline0.m(this.address, re$$ExternalSyntheticOutline0.m(this.ssn, re$$ExternalSyntheticOutline0.m(this.birthday, re$$ExternalSyntheticOutline0.m(this.legalName, re$$ExternalSyntheticOutline0.m(this.displayName, re$$ExternalSyntheticOutline0.m(this.emailAddress, re$$ExternalSyntheticOutline0.m(this.smsNumber, (hashCode6 + (scenarioPlan == null ? 0 : scenarioPlan.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31;
        StatusResult statusResult = this.statusResult;
        int m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (statusResult == null ? 0 : statusResult.hashCode())) * 31, 31, this.seenInviteFriends), 31, this.showAsHalfSheet), 31, this.hasLinkedCard);
        InstrumentSelection instrumentSelection = this.instrumentSelection;
        int hashCode8 = (m5 + (instrumentSelection == null ? 0 : instrumentSelection.hashCode())) * 31;
        TransferData transferData = this.transferData;
        int hashCode9 = (hashCode8 + (transferData == null ? 0 : transferData.hashCode())) * 31;
        RecurringTransferData recurringTransferData = this.recurringTransferData;
        int hashCode10 = (hashCode9 + (recurringTransferData == null ? 0 : recurringTransferData.hashCode())) * 31;
        AnalyticsData analyticsData = this.analyticsData;
        int hashCode11 = (this.region.hashCode() + ((hashCode10 + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31)) * 31;
        Money money = this.amount;
        int hashCode12 = (hashCode11 + (money == null ? 0 : money.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        int hashCode13 = (hashCode12 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        Color color = this.serverAccentColor;
        int hashCode14 = (hashCode13 + (color == null ? 0 : color.hashCode())) * 31;
        Color color2 = this.fullBleedBackgroundColor;
        int m6 = Recorder$$ExternalSyntheticOutline2.m((hashCode14 + (color2 == null ? 0 : color2.hashCode())) * 31, 31, this.flowPath);
        Long l2 = this.blockerStartTime;
        int hashCode15 = (this.requestContext.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m6 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.skipBiometrics)) * 31;
        MoneybotContext moneybotContext = this.moneybotContext;
        return this.journeyContext.hashCode() + ((hashCode15 + (moneybotContext != null ? moneybotContext.hashCode() : 0)) * 31);
    }

    public final boolean isTaxesFlow() {
        ClientScenario clientScenario = this.clientScenario;
        int i = clientScenario == null ? -1 : WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
        boolean z = i == 12 || i == 13;
        Flow$Type flow$Type = this.flowType;
        int i2 = flow$Type != null ? WhenMappings.$EnumSwitchMapping$1[flow$Type.ordinal()] : -1;
        return z || (i2 == 1 || i2 == 2);
    }

    public final BlockersData skipBlocker(Function1 function1) {
        RequestContext requestContext = this.requestContext;
        List<BlockerDescriptor> list = requestContext.skipped_blockers;
        ScenarioPlan scenarioPlan = this.scenarioPlan;
        scenarioPlan.getClass();
        Object obj = null;
        boolean z = false;
        for (Object obj2 : scenarioPlan.blocker_descriptors) {
            Blockers blockers = ((BlockerDescriptor) obj2).blocker;
            if (blockers != null ? ((Boolean) function1.invoke(blockers)).booleanValue() : false) {
                if (z) {
                    a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                    return null;
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            return copy$default(this, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(requestContext, null, null, null, null, null, CollectionsKt.plus((Collection) list, obj), null, null, null, null, null, null, 8159), null, null, -1, 57343).withIdSet();
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockersData(flow=");
        sb.append(this.flow);
        sb.append(", flowToken=");
        sb.append(this.flowToken);
        sb.append(", flowStartTime=");
        sb.append(this.flowStartTime);
        sb.append(", flowType=");
        sb.append(this.flowType);
        sb.append(", blockerId=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.blockerId, ", groupId=", this.groupId, ", exitScreen=");
        sb.append(this.exitScreen);
        sb.append(", exitScreenOnSuccess=");
        sb.append(this.exitScreenOnSuccess);
        sb.append(", currentScreenToReplace=");
        sb.append(this.currentScreenToReplace);
        sb.append(", customerPasscodeInstrumentToken=");
        sb.append(this.customerPasscodeInstrumentToken);
        sb.append(", manualAchEnabled=");
        re$$ExternalSyntheticOutline0.m(sb, this.manualAchEnabled, ", forceManualAch=", this.forceManualAch, ", linkingFlowsData=");
        sb.append(this.linkingFlowsData);
        sb.append(", bankAccountOauthConfig=");
        sb.append(this.bankAccountOauthConfig);
        sb.append(", bankAccountOAuthConfigSource=");
        sb.append(this.bankAccountOAuthConfigSource);
        sb.append(", addressTypeaheadEnabled=");
        sb.append(this.addressTypeaheadEnabled);
        sb.append(", clientScenario=");
        sb.append(this.clientScenario);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", scenarioPlan=");
        sb.append(this.scenarioPlan);
        sb.append(", smsNumber=");
        sb.append(this.smsNumber);
        sb.append(", emailAddress=");
        sb.append(this.emailAddress);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", legalName=");
        sb.append(this.legalName);
        sb.append(", birthday=");
        sb.append(this.birthday);
        sb.append(", ssn=");
        sb.append(this.ssn);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", idvSignalsContext=");
        sb.append(this.idvSignalsContext);
        sb.append(", securityCode=");
        sb.append(this.securityCode);
        sb.append(", ratePlan=");
        sb.append(this.ratePlan);
        sb.append(", statusResult=");
        sb.append(this.statusResult);
        sb.append(", seenInviteFriends=");
        re$$ExternalSyntheticOutline0.m(sb, this.seenInviteFriends, ", showAsHalfSheet=", this.showAsHalfSheet, ", hasLinkedCard=");
        sb.append(this.hasLinkedCard);
        sb.append(", instrumentSelection=");
        sb.append(this.instrumentSelection);
        sb.append(", transferData=");
        sb.append(this.transferData);
        sb.append(", recurringTransferData=");
        sb.append(this.recurringTransferData);
        sb.append(", analyticsData=");
        sb.append(this.analyticsData);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", accentColor=");
        sb.append(this.accentColor);
        sb.append(", serverAccentColor=");
        sb.append(this.serverAccentColor);
        sb.append(", fullBleedBackgroundColor=");
        sb.append(this.fullBleedBackgroundColor);
        sb.append(", flowPath=");
        sb.append(this.flowPath);
        sb.append(", blockerStartTime=");
        sb.append(this.blockerStartTime);
        sb.append(", skipBiometrics=");
        sb.append(this.skipBiometrics);
        sb.append(", requestContext=");
        sb.append(this.requestContext);
        sb.append(", moneybotContext=");
        sb.append(this.moneybotContext);
        sb.append(", journeyContext=");
        sb.append(this.journeyContext);
        sb.append(")");
        return sb.toString();
    }

    public final BlockersData updateFromResponseContext(ResponseContext responseContext, boolean z) {
        Style style;
        Region region;
        String str;
        TransferData transferData;
        Money money;
        Boolean bool;
        responseContext.getClass();
        ScenarioPlan scenarioPlan = responseContext.scenario_plan;
        Transfer transfer = responseContext.transfer;
        boolean booleanValue = (scenarioPlan == null || (bool = scenarioPlan.display_in_dialog) == null) ? false : bool.booleanValue();
        if (z) {
            style = booleanValue ? Style.DIALOG : Style.FULLSCREEN;
        } else {
            Style style2 = Style.DIALOG;
            Style style3 = this.style;
            style = (style3 != style2 || booleanValue) ? style3 : Style.FULLSCREEN;
        }
        Style style4 = style;
        ScenarioPlan scenarioPlan2 = responseContext.scenario_plan;
        StatusResult statusResult = responseContext.status_result;
        Country country = responseContext.country_code;
        if (country == null || (region = Countries.toRegion(country)) == null) {
            region = this.region;
        }
        Region region2 = region;
        List<String> tokens = Room.getTokens(responseContext.payments);
        boolean isEmpty = tokens.isEmpty();
        RequestContext requestContext = this.requestContext;
        if (isEmpty) {
            tokens = requestContext.payment_tokens;
        }
        List<String> list = tokens;
        if (transfer == null || (str = transfer.token) == null) {
            str = requestContext.transfer_token;
        }
        RequestContext copy$default = RequestContext.copy$default(this.requestContext, null, null, null, str, list, null, null, null, null, null, null, null, 8167);
        TransferData transferData2 = this.transferData;
        if (transferData2 != null) {
            if (transfer == null || (money = transfer.amount) == null) {
                money = transferData2.amount;
            }
            transferData = TransferData.copy$default(transferData2, money, null, null, null, null, null, null, null, TiffTagConstants.COMPRESSION_VALUE_NEXT);
        } else {
            transferData = null;
        }
        JourneySignals journeySignals = responseContext.journey_signals;
        List list2 = journeySignals != null ? journeySignals.frustrations : null;
        if (list2 == null) {
            list2 = EmptyList.INSTANCE;
        }
        List list3 = list2;
        List list4 = journeySignals != null ? journeySignals.frictions : null;
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        List list5 = list4;
        JourneyOutcome journeyOutcome = scenarioPlan != null ? scenarioPlan.journey_outcome : null;
        List<JourneyStart> list6 = scenarioPlan != null ? scenarioPlan.sub_journeys_started : null;
        if (list6 == null) {
            list6 = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list6.iterator();
        while (it.hasNext()) {
            String str2 = ((JourneyStart) it.next()).journey_name;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Map<String, JourneyOutcome> map = scenarioPlan != null ? scenarioPlan.sub_journey_outcomes : null;
        if (map == null) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        return copy$default(this, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, style4, scenarioPlan2, null, null, null, null, null, null, null, null, null, statusResult, false, null, transferData, null, null, region2, null, null, null, null, null, null, false, copy$default, null, new JourneyContext(list3, list5, journeyOutcome, arrayList, map), -537264129, 24539).withIdSet();
    }

    public final BlockersData withIdSet() {
        BlockerDescriptor blockerDescriptor = (BlockerDescriptor) CollectionsKt.firstOrNull(getNextBlockers());
        return copy$default(this, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(this.requestContext, null, null, null, null, null, null, blockerDescriptor != null ? blockerDescriptor.id : null, null, null, null, null, null, 8127), null, null, -1, 57343);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.flow.name());
        parcel.writeString(this.flowToken);
        Long l = this.flowStartTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l);
        }
        Flow$Type flow$Type = this.flowType;
        if (flow$Type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(flow$Type.name());
        }
        parcel.writeString(this.blockerId);
        parcel.writeString(this.groupId);
        parcel.writeParcelable(this.exitScreen, i);
        parcel.writeParcelable(this.exitScreenOnSuccess, i);
        parcel.writeParcelable(this.currentScreenToReplace, i);
        parcel.writeString(this.customerPasscodeInstrumentToken);
        parcel.writeInt(this.manualAchEnabled ? 1 : 0);
        parcel.writeInt(this.forceManualAch ? 1 : 0);
        LinkingFlowsData linkingFlowsData = this.linkingFlowsData;
        if (linkingFlowsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkingFlowsData.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.bankAccountOauthConfig, i);
        BankAccountOAuthConfigSource bankAccountOAuthConfigSource = this.bankAccountOAuthConfigSource;
        if (bankAccountOAuthConfigSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bankAccountOAuthConfigSource.name());
        }
        parcel.writeInt(this.addressTypeaheadEnabled ? 1 : 0);
        ClientScenario clientScenario = this.clientScenario;
        if (clientScenario == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(clientScenario.name());
        }
        parcel.writeString(this.style.name());
        parcel.writeParcelable(this.scenarioPlan, i);
        parcel.writeParcelable(this.smsNumber, i);
        parcel.writeParcelable(this.emailAddress, i);
        parcel.writeParcelable(this.displayName, i);
        parcel.writeParcelable(this.legalName, i);
        parcel.writeParcelable(this.birthday, i);
        parcel.writeParcelable(this.ssn, i);
        parcel.writeParcelable(this.address, i);
        parcel.writeParcelable(this.idvSignalsContext, i);
        parcel.writeParcelable(this.securityCode, i);
        parcel.writeString(this.ratePlan.name());
        parcel.writeParcelable(this.statusResult, i);
        parcel.writeInt(this.seenInviteFriends ? 1 : 0);
        parcel.writeInt(this.showAsHalfSheet ? 1 : 0);
        parcel.writeInt(this.hasLinkedCard ? 1 : 0);
        parcel.writeParcelable(this.instrumentSelection, i);
        parcel.writeParcelable(this.transferData, i);
        parcel.writeParcelable(this.recurringTransferData, i);
        AnalyticsData analyticsData = this.analyticsData;
        if (analyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.region.name());
        parcel.writeParcelable(this.amount, i);
        parcel.writeParcelable(this.accentColor, i);
        parcel.writeParcelable(this.serverAccentColor, i);
        parcel.writeParcelable(this.fullBleedBackgroundColor, i);
        parcel.writeStringList(this.flowPath);
        Long l2 = this.blockerStartTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            Request$Priority$EnumUnboxingLocalUtility.m(parcel, 1, l2);
        }
        parcel.writeInt(this.skipBiometrics ? 1 : 0);
        parcel.writeParcelable(this.requestContext, i);
        MoneybotContext moneybotContext = this.moneybotContext;
        if (moneybotContext == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneybotContext.writeToParcel(parcel, i);
        }
        this.journeyContext.writeToParcel(parcel, i);
    }

    public final class AnalyticsData implements Parcelable {
        public static final Parcelable.Creator<AnalyticsData> CREATOR = new MoveBitcoinScreen.Creator(21);
        public final String referrerFlowToken;
        public final BlockerFlowReferrerType referrerFlowType;
        public final Source source;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, d2 = {"com/squareup/cash/blockers/data/BlockersData$AnalyticsData$Source", "", "Lcom/squareup/cash/blockers/data/BlockersData$AnalyticsData$Source;", "", "analyticsName", "Ljava/lang/String;", "getAnalyticsName", "()Ljava/lang/String;", "Companion", "PROFILE", "DEEPLINK", "BALANCE_HOME", "DIRECT_DEPOSIT_SETUP", "HOME_TAB", "ADD_MONEY", "DEEP_LINK", "INSTANT_PAYCHECK", "APP_ONBOARDING", "PAID_IN_BITCOIN", "PLASMA_FLOW", "RECURRING_DEPOSITS", "PAYCHECKS", "BENEFITS_HUB", "SAVINGS_YIELD_UPSELL", "PAPER_MONEY_DEPOSIT", "ATM_WITHDRAWAL", "SHIPPING_AUTOFILL_SETTINGS", "CARD_TAB", "SHOPPING", "MONEY_TAB", "OVERDRAFT", "CARD_ONBOARDING", "BORROW", "THEME_SWITCHER", "EMAIL_CAMPAIGN", "PUSH_CAMPAIGN", "IN_APP_CAMPAIGN", "SMS_CAMPAIGN", "MARKETING_CAMPAIGN", "PAYCHECKS_BENEFITS_BOOKLET", "HISTORY_PAYMENT_ACTION", "SUPPORT_ARTICLE", "SUPPORT_CHAT", "SUPPORT_SEARCH", "SUPPORT_HOME", "SUPPORT_PHONE_STATUS", "SUPPORT_PHONE_VERIFICATION", "PUSH_NOTIFICATION", "P2P", "UNDETERMINED", "data"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public final class Source {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source ADD_MONEY;
            public static final Source APP_ONBOARDING;
            public static final Source ATM_WITHDRAWAL;
            public static final Source BALANCE_HOME;
            public static final Source BENEFITS_HUB;
            public static final Source BORROW;
            public static final Source CARD_ONBOARDING;
            public static final Source CARD_TAB;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Source DEEPLINK;
            public static final Source DEEP_LINK;
            public static final Source DIRECT_DEPOSIT_SETUP;
            public static final Source EMAIL_CAMPAIGN;
            public static final Source HISTORY_PAYMENT_ACTION;
            public static final Source HOME_TAB;
            public static final Source INSTANT_PAYCHECK;
            public static final Source IN_APP_CAMPAIGN;
            public static final Source MARKETING_CAMPAIGN;
            public static final Source MONEY_TAB;
            public static final Source OVERDRAFT;
            public static final Source P2P;
            public static final Source PAID_IN_BITCOIN;
            public static final Source PAPER_MONEY_DEPOSIT;
            public static final Source PAYCHECKS;
            public static final Source PAYCHECKS_BENEFITS_BOOKLET;
            public static final Source PLASMA_FLOW;
            public static final Source PROFILE;
            public static final Source PUSH_CAMPAIGN;
            public static final Source PUSH_NOTIFICATION;
            public static final Source RECURRING_DEPOSITS;
            public static final Source SAVINGS_YIELD_UPSELL;
            public static final Source SHIPPING_AUTOFILL_SETTINGS;
            public static final Source SHOPPING;
            public static final Source SMS_CAMPAIGN;
            public static final Source SUPPORT_ARTICLE;
            public static final Source SUPPORT_CHAT;
            public static final Source SUPPORT_HOME;
            public static final Source SUPPORT_PHONE_STATUS;
            public static final Source SUPPORT_PHONE_VERIFICATION;
            public static final Source SUPPORT_SEARCH;
            public static final Source THEME_SWITCHER;
            public static final Source UNDETERMINED;
            private final String analyticsName;

            public final class Companion {
                public static Source fromString(String str) {
                    if (str != null && !StringsKt.isBlank(str)) {
                        for (Source source : Source.getEntries()) {
                            if (Intrinsics.areEqual(source.getAnalyticsName(), str)) {
                                return source;
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$3("Failed to find Source for ".concat(str));
                    }
                    return null;
                }
            }

            static {
                Source source = new Source("PROFILE", 0, "Profile");
                PROFILE = source;
                Source source2 = new Source("DEEPLINK", 1, "External");
                DEEPLINK = source2;
                Source source3 = new Source("BALANCE_HOME", 2, "BALANCE_HOME");
                BALANCE_HOME = source3;
                Source source4 = new Source("DIRECT_DEPOSIT_SETUP", 3, "DIRECT_DEPOSIT_SETUP");
                DIRECT_DEPOSIT_SETUP = source4;
                Source source5 = new Source("HOME_TAB", 4, "HOME_TAB");
                HOME_TAB = source5;
                Source source6 = new Source("ADD_MONEY", 5, "ADD_MONEY");
                ADD_MONEY = source6;
                Source source7 = new Source("DEEP_LINK", 6, "DEEP_LINK");
                DEEP_LINK = source7;
                Source source8 = new Source("INSTANT_PAYCHECK", 7, "INSTANT_PAYCHECK");
                INSTANT_PAYCHECK = source8;
                Source source9 = new Source("APP_ONBOARDING", 8, "APP_ONBOARDING");
                APP_ONBOARDING = source9;
                Source source10 = new Source("PAID_IN_BITCOIN", 9, "PAID_IN_BITCOIN");
                PAID_IN_BITCOIN = source10;
                Source source11 = new Source("PLASMA_FLOW", 10, "PLASMA_FLOW");
                PLASMA_FLOW = source11;
                Source source12 = new Source("RECURRING_DEPOSITS", 11, "RECURRING_DEPOSITS");
                RECURRING_DEPOSITS = source12;
                Source source13 = new Source("PAYCHECKS", 12, "PAYCHECKS");
                PAYCHECKS = source13;
                Source source14 = new Source("BENEFITS_HUB", 13, "BENEFITS_HUB");
                BENEFITS_HUB = source14;
                Source source15 = new Source("SAVINGS_YIELD_UPSELL", 14, "SAVINGS_YIELD_UPSELL");
                SAVINGS_YIELD_UPSELL = source15;
                Source source16 = new Source("PAPER_MONEY_DEPOSIT", 15, "PAPER_MONEY_DEPOSIT");
                PAPER_MONEY_DEPOSIT = source16;
                Source source17 = new Source("ATM_WITHDRAWAL", 16, "ATM_WITHDRAWAL");
                ATM_WITHDRAWAL = source17;
                Source source18 = new Source("SHIPPING_AUTOFILL_SETTINGS", 17, "SHIPPING_AUTOFILL_SETTINGS");
                SHIPPING_AUTOFILL_SETTINGS = source18;
                Source source19 = new Source("CARD_TAB", 18, "CARD_TAB");
                CARD_TAB = source19;
                Source source20 = new Source("SHOPPING", 19, "SHOPPING");
                SHOPPING = source20;
                Source source21 = new Source("MONEY_TAB", 20, "MONEY_TAB");
                MONEY_TAB = source21;
                Source source22 = new Source("OVERDRAFT", 21, "OVERDRAFT");
                OVERDRAFT = source22;
                Source source23 = new Source("CARD_ONBOARDING", 22, "CARD_ONBOARDING");
                CARD_ONBOARDING = source23;
                Source source24 = new Source("BORROW", 23, "BORROW");
                BORROW = source24;
                Source source25 = new Source("THEME_SWITCHER", 24, "THEME_SWITCHER");
                THEME_SWITCHER = source25;
                Source source26 = new Source("EMAIL_CAMPAIGN", 25, "EMAIL_CAMPAIGN");
                EMAIL_CAMPAIGN = source26;
                Source source27 = new Source("PUSH_CAMPAIGN", 26, "PUSH_CAMPAIGN");
                PUSH_CAMPAIGN = source27;
                Source source28 = new Source("IN_APP_CAMPAIGN", 27, "IN_APP_CAMPAIGN");
                IN_APP_CAMPAIGN = source28;
                Source source29 = new Source("SMS_CAMPAIGN", 28, "SMS_CAMPAIGN");
                SMS_CAMPAIGN = source29;
                Source source30 = new Source("MARKETING_CAMPAIGN", 29, "MARKETING_CAMPAIGN");
                MARKETING_CAMPAIGN = source30;
                Source source31 = new Source("PAYCHECKS_BENEFITS_BOOKLET", 30, "PAYCHECKS_BENEFITS_BOOKLET");
                PAYCHECKS_BENEFITS_BOOKLET = source31;
                Source source32 = new Source("HISTORY_PAYMENT_ACTION", 31, "HISTORY_PAYMENT_ACTION");
                HISTORY_PAYMENT_ACTION = source32;
                Source source33 = new Source("SUPPORT_ARTICLE", 32, "SUPPORT_ARTICLE");
                SUPPORT_ARTICLE = source33;
                Source source34 = new Source("SUPPORT_CHAT", 33, "SUPPORT_CHAT");
                SUPPORT_CHAT = source34;
                Source source35 = new Source("SUPPORT_SEARCH", 34, "SUPPORT_SEARCH");
                SUPPORT_SEARCH = source35;
                Source source36 = new Source("SUPPORT_HOME", 35, "SUPPORT_HOME");
                SUPPORT_HOME = source36;
                Source source37 = new Source("SUPPORT_PHONE_STATUS", 36, "SUPPORT_PHONE_STATUS");
                SUPPORT_PHONE_STATUS = source37;
                Source source38 = new Source("SUPPORT_PHONE_VERIFICATION", 37, "SUPPORT_PHONE_VERIFICATION");
                SUPPORT_PHONE_VERIFICATION = source38;
                Source source39 = new Source("PUSH_NOTIFICATION", 38, "PUSH_NOTIFICATION");
                PUSH_NOTIFICATION = source39;
                Source source40 = new Source("P2P", 39, "P2P");
                P2P = source40;
                Source source41 = new Source("UNDETERMINED", 40, "UNDETERMINED");
                UNDETERMINED = source41;
                Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8, source9, source10, source11, source12, source13, source14, source15, source16, source17, source18, source19, source20, source21, source22, source23, source24, source25, source26, source27, source28, source29, source30, source31, source32, source33, source34, source35, source36, source37, source38, source39, source40, source41};
                $VALUES = sourceArr;
                $ENTRIES = new EnumEntriesList(sourceArr);
                INSTANCE = new Companion();
            }

            public Source(String str, int i, String str2) {
                this.analyticsName = str2;
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }

            public final String getAnalyticsName() {
                return this.analyticsName;
            }
        }

        public AnalyticsData(Source source, String str, BlockerFlowReferrerType blockerFlowReferrerType) {
            source.getClass();
            this.source = source;
            this.referrerFlowToken = str;
            this.referrerFlowType = blockerFlowReferrerType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnalyticsData)) {
                return false;
            }
            AnalyticsData analyticsData = (AnalyticsData) obj;
            return this.source == analyticsData.source && Intrinsics.areEqual(this.referrerFlowToken, analyticsData.referrerFlowToken) && this.referrerFlowType == analyticsData.referrerFlowType;
        }

        public final int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            String str = this.referrerFlowToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            BlockerFlowReferrerType blockerFlowReferrerType = this.referrerFlowType;
            return hashCode2 + (blockerFlowReferrerType != null ? blockerFlowReferrerType.hashCode() : 0);
        }

        public final String toString() {
            return "AnalyticsData(source=" + this.source + ", referrerFlowToken=" + this.referrerFlowToken + ", referrerFlowType=" + this.referrerFlowType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.source.name());
            parcel.writeString(this.referrerFlowToken);
            BlockerFlowReferrerType blockerFlowReferrerType = this.referrerFlowType;
            if (blockerFlowReferrerType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(blockerFlowReferrerType.name());
            }
        }

        public /* synthetic */ AnalyticsData(Source source, String str, int i) {
            this(source, (i & 2) != 0 ? null : str, (BlockerFlowReferrerType) null);
        }
    }

    public BlockersData(Flow flow, String str, Long l, Flow$Type flow$Type, String str2, String str3, Screen screen, Screen screen2, Screen screen3, String str4, boolean z, boolean z2, LinkingFlowsData linkingFlowsData, OAuthConfig oAuthConfig, BankAccountOAuthConfigSource bankAccountOAuthConfigSource, boolean z3, ClientScenario clientScenario, Style style, ScenarioPlan scenarioPlan, Redacted redacted, Redacted redacted2, Redacted redacted3, Redacted redacted4, Redacted redacted5, Redacted redacted6, Redacted redacted7, SignalsContext signalsContext, Redacted redacted8, RatePlan ratePlan, StatusResult statusResult, boolean z4, boolean z5, boolean z6, InstrumentSelection instrumentSelection, TransferData transferData, RecurringTransferData recurringTransferData, AnalyticsData analyticsData, Region region, Money money, ColorModel colorModel, Color color, Color color2, List list, Long l2, boolean z7, RequestContext requestContext, MoneybotContext moneybotContext, JourneyContext journeyContext) {
        flow.getClass();
        str.getClass();
        screen.getClass();
        screen2.getClass();
        str4.getClass();
        style.getClass();
        redacted.getClass();
        redacted2.getClass();
        redacted3.getClass();
        redacted4.getClass();
        redacted5.getClass();
        redacted6.getClass();
        redacted7.getClass();
        signalsContext.getClass();
        redacted8.getClass();
        ratePlan.getClass();
        region.getClass();
        list.getClass();
        requestContext.getClass();
        journeyContext.getClass();
        this.flow = flow;
        this.flowToken = str;
        this.flowStartTime = l;
        this.flowType = flow$Type;
        this.blockerId = str2;
        this.groupId = str3;
        this.exitScreen = screen;
        this.exitScreenOnSuccess = screen2;
        this.currentScreenToReplace = screen3;
        this.customerPasscodeInstrumentToken = str4;
        this.manualAchEnabled = z;
        this.forceManualAch = z2;
        this.linkingFlowsData = linkingFlowsData;
        this.bankAccountOauthConfig = oAuthConfig;
        this.bankAccountOAuthConfigSource = bankAccountOAuthConfigSource;
        this.addressTypeaheadEnabled = z3;
        this.clientScenario = clientScenario;
        this.style = style;
        this.scenarioPlan = scenarioPlan;
        this.smsNumber = redacted;
        this.emailAddress = redacted2;
        this.displayName = redacted3;
        this.legalName = redacted4;
        this.birthday = redacted5;
        this.ssn = redacted6;
        this.address = redacted7;
        this.idvSignalsContext = signalsContext;
        this.securityCode = redacted8;
        this.ratePlan = ratePlan;
        this.statusResult = statusResult;
        this.seenInviteFriends = z4;
        this.showAsHalfSheet = z5;
        this.hasLinkedCard = z6;
        this.instrumentSelection = instrumentSelection;
        this.transferData = transferData;
        this.recurringTransferData = recurringTransferData;
        this.analyticsData = analyticsData;
        this.region = region;
        this.amount = money;
        this.accentColor = colorModel;
        this.serverAccentColor = color;
        this.fullBleedBackgroundColor = color2;
        this.flowPath = list;
        this.blockerStartTime = l2;
        this.skipBiometrics = z7;
        this.requestContext = requestContext;
        this.moneybotContext = moneybotContext;
        this.journeyContext = journeyContext;
    }
}
