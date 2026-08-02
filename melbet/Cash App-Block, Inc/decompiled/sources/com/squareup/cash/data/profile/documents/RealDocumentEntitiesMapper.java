package com.squareup.cash.data.profile.documents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.crypto.db.CryptoStatementQueries$ForTokenQuery;
import com.squareup.cash.crypto.db.CryptoStatementQueries$forCategory$2;
import com.squareup.cash.crypto.db.Crypto_statement;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.db2.profile.documents.DocumentQueries$SelectForTokenQuery;
import com.squareup.cash.db2.profile.documents.DocumentQueries$selectForCategoryId$2;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper {
    public final SessionQueries cryptoStatementQueries;
    public final RealCustomerStore customerStore;
    public final InstrumentQueries documentQueries;
    public final CoroutineContext ioDispatcher;
    public final RealProfileAliasRepository profileAliasRepository;
    public final RealProfileManager profileManager;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatementType.values().length];
            try {
                LinkResult.Companion companion = StatementType.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkResult.Companion companion2 = StatementType.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkResult.Companion companion3 = StatementType.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealDocumentEntitiesMapper(CashAccountDatabaseImpl cashAccountDatabaseImpl, RealProfileAliasRepository realProfileAliasRepository, RealCustomerStore realCustomerStore, RealProfileManager realProfileManager, CoroutineContext coroutineContext) {
        this.profileAliasRepository = realProfileAliasRepository;
        this.customerStore = realCustomerStore;
        this.profileManager = realProfileManager;
        this.ioDispatcher = coroutineContext;
        this.cryptoStatementQueries = cashAccountDatabaseImpl.cryptoStatementQueries;
        this.documentQueries = cashAccountDatabaseImpl.documentQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toProfileDocumentModel(RealDocumentEntitiesMapper realDocumentEntitiesMapper, Document document, Recipient recipient, ContinuationImpl continuationImpl) {
        RealDocumentEntitiesMapper$toProfileDocumentModel$1 realDocumentEntitiesMapper$toProfileDocumentModel$1;
        Object obj;
        int i;
        int i2;
        Recipient recipient2;
        FillrWidgetFactory fillrWidgetFactory;
        Object hasActiveEmail;
        String str;
        FillrWidgetFactory fillrWidgetFactory2;
        String str2;
        int i3;
        String str3;
        long j;
        StatementType statementType;
        Document document2 = document;
        realDocumentEntitiesMapper.getClass();
        if (continuationImpl instanceof RealDocumentEntitiesMapper$toProfileDocumentModel$1) {
            realDocumentEntitiesMapper$toProfileDocumentModel$1 = (RealDocumentEntitiesMapper$toProfileDocumentModel$1) continuationImpl;
            int i4 = realDocumentEntitiesMapper$toProfileDocumentModel$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realDocumentEntitiesMapper$toProfileDocumentModel$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj2 = realDocumentEntitiesMapper$toProfileDocumentModel$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDocumentEntitiesMapper$toProfileDocumentModel$1.label;
                int i5 = 0;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    int i6 = toStatementType(document2.category) == StatementType.STOCK_TAX_FORM ? 1 : 0;
                    RealProfileManager realProfileManager = realDocumentEntitiesMapper.profileManager;
                    realDocumentEntitiesMapper$toProfileDocumentModel$1.L$0 = document2;
                    realDocumentEntitiesMapper$toProfileDocumentModel$1.L$1 = recipient;
                    realDocumentEntitiesMapper$toProfileDocumentModel$1.I$0 = i6;
                    realDocumentEntitiesMapper$toProfileDocumentModel$1.label = 1;
                    Object withContext = JobKt.withContext(realProfileManager.ioDispatcher, new RealProfileManager$profileOrNull$2(realProfileManager, continuation, i5), realDocumentEntitiesMapper$toProfileDocumentModel$1);
                    if (withContext != obj) {
                        i2 = i6;
                        obj2 = withContext;
                        recipient2 = recipient;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j2 = realDocumentEntitiesMapper$toProfileDocumentModel$1.J$0;
                    i3 = realDocumentEntitiesMapper$toProfileDocumentModel$1.I$0;
                    String str4 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$7;
                    StatementType statementType2 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$6;
                    String str5 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$5;
                    String str6 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$4;
                    FillrWidgetFactory fillrWidgetFactory3 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$3;
                    SafeTrace.throwOnFailure(obj2);
                    j = j2;
                    fillrWidgetFactory2 = fillrWidgetFactory3;
                    str = str4;
                    statementType = statementType2;
                    str3 = str5;
                    str2 = str6;
                    return new ProfileDocumentModel(str2, str3, j, statementType, str, (((Boolean) obj2).booleanValue() || i3 == 0) ? false : true, fillrWidgetFactory2);
                }
                int i7 = realDocumentEntitiesMapper$toProfileDocumentModel$1.I$0;
                recipient2 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$1;
                Document document3 = realDocumentEntitiesMapper$toProfileDocumentModel$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                i2 = i7;
                document2 = document3;
                Profile profile = (Profile) obj2;
                String str7 = profile == null ? profile.profile_id : null;
                boolean z = str7 == null && !str7.equals(document2.owner_token);
                if ((recipient2 == null ? recipient2.displayName : null) == null && z) {
                    String str8 = recipient2.displayName;
                    str8.getClass();
                    fillrWidgetFactory = new ProfileDocumentModel$TitleNamingConvention$AppendName(str8);
                } else {
                    fillrWidgetFactory = ProfileDocumentModel$TitleNamingConvention$Default.INSTANCE;
                }
                String str9 = document2.token;
                String str10 = document2.title;
                Long l = document2.display_date;
                l.getClass();
                long longValue = l.longValue();
                StatementType statementType3 = toStatementType(document2.category);
                String str11 = document2.url;
                str11.getClass();
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$0 = null;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$1 = null;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$3 = fillrWidgetFactory;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$4 = str9;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$5 = str10;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$6 = statementType3;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.L$7 = str11;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.I$0 = i2;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.J$0 = longValue;
                realDocumentEntitiesMapper$toProfileDocumentModel$1.label = 2;
                hasActiveEmail = realDocumentEntitiesMapper.hasActiveEmail(realDocumentEntitiesMapper$toProfileDocumentModel$1);
                if (hasActiveEmail != obj) {
                    str = str11;
                    fillrWidgetFactory2 = fillrWidgetFactory;
                    str2 = str9;
                    i3 = i2;
                    str3 = str10;
                    j = longValue;
                    statementType = statementType3;
                    obj2 = hasActiveEmail;
                    return new ProfileDocumentModel(str2, str3, j, statementType, str, (((Boolean) obj2).booleanValue() || i3 == 0) ? false : true, fillrWidgetFactory2);
                }
                return obj;
            }
        }
        realDocumentEntitiesMapper$toProfileDocumentModel$1 = new RealDocumentEntitiesMapper$toProfileDocumentModel$1(realDocumentEntitiesMapper, continuationImpl);
        Object obj22 = realDocumentEntitiesMapper$toProfileDocumentModel$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDocumentEntitiesMapper$toProfileDocumentModel$1.label;
        int i52 = 0;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Profile profile2 = (Profile) obj22;
        if (profile2 == null) {
        }
        if (str7 == null) {
        }
        if ((recipient2 == null ? recipient2.displayName : null) == null) {
        }
        fillrWidgetFactory = ProfileDocumentModel$TitleNamingConvention$Default.INSTANCE;
        String str92 = document2.token;
        String str102 = document2.title;
        Long l2 = document2.display_date;
        l2.getClass();
        long longValue2 = l2.longValue();
        StatementType statementType32 = toStatementType(document2.category);
        String str112 = document2.url;
        str112.getClass();
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$0 = null;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$1 = null;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$3 = fillrWidgetFactory;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$4 = str92;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$5 = str102;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$6 = statementType32;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.L$7 = str112;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.I$0 = i2;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.J$0 = longValue2;
        realDocumentEntitiesMapper$toProfileDocumentModel$1.label = 2;
        hasActiveEmail = realDocumentEntitiesMapper.hasActiveEmail(realDocumentEntitiesMapper$toProfileDocumentModel$1);
        if (hasActiveEmail != obj) {
        }
        return obj;
    }

    public static StatementType toStatementType(String str) {
        try {
            return StatementType.valueOf(str);
        } catch (IllegalArgumentException unused) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Not supported statement type: ", str));
            return null;
        }
    }

    public final Flow documentsForCategory(StatementType statementType) {
        int ordinal = statementType.ordinal();
        Continuation continuation = null;
        CoroutineContext coroutineContext = this.ioDispatcher;
        int i = 1;
        if (ordinal == 1 || ordinal == 2) {
            String obj = statementType.toString();
            InstrumentQueries instrumentQueries = this.documentQueries;
            instrumentQueries.getClass();
            obj.getClass();
            DocumentQueries$selectForCategoryId$2 documentQueries$selectForCategoryId$2 = DocumentQueries$selectForCategoryId$2.INSTANCE;
            return FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries, obj, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries, i))), coroutineContext), new RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1(continuation, this, i));
        }
        if (WhenMappings.$EnumSwitchMapping$0[statementType.ordinal()] != 3) {
            OptionalProvider$$ExternalSyntheticLambda0.m$2("Unexpected category: ", statementType, " ");
            return null;
        }
        String obj2 = statementType.toString();
        SessionQueries sessionQueries = this.cryptoStatementQueries;
        sessionQueries.getClass();
        obj2.getClass();
        CryptoStatementQueries$forCategory$2 cryptoStatementQueries$forCategory$2 = CryptoStatementQueries$forCategory$2.INSTANCE;
        return new RealTransferManager$addCash$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new CryptoStatementQueries$ForTokenQuery(sessionQueries, obj2, new FlowStarter$$ExternalSyntheticLambda0(15), (byte) 0)), coroutineContext), this, 26);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasActiveEmail(ContinuationImpl continuationImpl) {
        RealDocumentEntitiesMapper$hasActiveEmail$1 realDocumentEntitiesMapper$hasActiveEmail$1;
        int i;
        if (continuationImpl instanceof RealDocumentEntitiesMapper$hasActiveEmail$1) {
            realDocumentEntitiesMapper$hasActiveEmail$1 = (RealDocumentEntitiesMapper$hasActiveEmail$1) continuationImpl;
            int i2 = realDocumentEntitiesMapper$hasActiveEmail$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDocumentEntitiesMapper$hasActiveEmail$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDocumentEntitiesMapper$hasActiveEmail$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDocumentEntitiesMapper$hasActiveEmail$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                    realDocumentEntitiesMapper$hasActiveEmail$1.label = 1;
                    RealProfileAliasRepository realProfileAliasRepository = this.profileAliasRepository;
                    obj = JobKt.withContext(realProfileAliasRepository.ioContext, new GooglePayPresenter$models$1$1(realProfileAliasRepository, null), realDocumentEntitiesMapper$hasActiveEmail$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        realDocumentEntitiesMapper$hasActiveEmail$1 = new RealDocumentEntitiesMapper$hasActiveEmail$1(this, continuationImpl);
        Object obj2 = realDocumentEntitiesMapper$hasActiveEmail$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDocumentEntitiesMapper$hasActiveEmail$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj2).isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toProfileDocumentModel(RealDocumentEntitiesMapper realDocumentEntitiesMapper, Crypto_statement crypto_statement, ContinuationImpl continuationImpl) {
        RealDocumentEntitiesMapper$toProfileDocumentModel$2 realDocumentEntitiesMapper$toProfileDocumentModel$2;
        int i;
        String str;
        String str2;
        String str3;
        long j;
        StatementType statementType;
        realDocumentEntitiesMapper.getClass();
        if (continuationImpl instanceof RealDocumentEntitiesMapper$toProfileDocumentModel$2) {
            realDocumentEntitiesMapper$toProfileDocumentModel$2 = (RealDocumentEntitiesMapper$toProfileDocumentModel$2) continuationImpl;
            int i2 = realDocumentEntitiesMapper$toProfileDocumentModel$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDocumentEntitiesMapper$toProfileDocumentModel$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDocumentEntitiesMapper$toProfileDocumentModel$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDocumentEntitiesMapper$toProfileDocumentModel$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str4 = crypto_statement.token;
                    String str5 = crypto_statement.title;
                    long j2 = crypto_statement.document_date;
                    StatementType statementType2 = toStatementType(crypto_statement.category);
                    String str6 = crypto_statement.url;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.L$1 = str4;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.L$2 = str5;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.L$3 = statementType2;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.L$4 = str6;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.J$0 = j2;
                    realDocumentEntitiesMapper$toProfileDocumentModel$2.label = 1;
                    Object hasActiveEmail = realDocumentEntitiesMapper.hasActiveEmail(realDocumentEntitiesMapper$toProfileDocumentModel$2);
                    if (hasActiveEmail == obj2) {
                        return obj2;
                    }
                    str = str6;
                    str2 = str4;
                    str3 = str5;
                    j = j2;
                    statementType = statementType2;
                    obj = hasActiveEmail;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = realDocumentEntitiesMapper$toProfileDocumentModel$2.J$0;
                    String str7 = realDocumentEntitiesMapper$toProfileDocumentModel$2.L$4;
                    StatementType statementType3 = realDocumentEntitiesMapper$toProfileDocumentModel$2.L$3;
                    String str8 = realDocumentEntitiesMapper$toProfileDocumentModel$2.L$2;
                    String str9 = realDocumentEntitiesMapper$toProfileDocumentModel$2.L$1;
                    SafeTrace.throwOnFailure(obj);
                    j = j3;
                    str2 = str9;
                    str = str7;
                    statementType = statementType3;
                    str3 = str8;
                }
                return new ProfileDocumentModel(str2, str3, j, statementType, str, ((Boolean) obj).booleanValue(), ProfileDocumentModel$TitleNamingConvention$Default.INSTANCE);
            }
        }
        realDocumentEntitiesMapper$toProfileDocumentModel$2 = new RealDocumentEntitiesMapper$toProfileDocumentModel$2(realDocumentEntitiesMapper, continuationImpl);
        Object obj3 = realDocumentEntitiesMapper$toProfileDocumentModel$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDocumentEntitiesMapper$toProfileDocumentModel$2.label;
        if (i != 0) {
        }
        return new ProfileDocumentModel(str2, str3, j, statementType, str, ((Boolean) obj3).booleanValue(), ProfileDocumentModel$TitleNamingConvention$Default.INSTANCE);
    }
}
