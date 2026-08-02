package com.squareup.cash.account.presenters.documents;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewModel;
import com.squareup.cash.crypto.db.CryptoStatementQueries$ForTokenQuery;
import com.squareup.cash.crypto.db.CryptoStatementQueries$forToken$2;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.documents.DocumentQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.db2.profile.documents.DocumentQueries$SelectForTokenQuery;
import com.squareup.cash.db2.profile.documents.DocumentQueries$selectForToken$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.profile.screens.DocumentsDownloadOptionsScreen;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes5.dex */
public final class AccountDocumentsDownloadOptionsPresenter implements MoleculePresenter {
    public static final Calendar cal;
    public final DocumentsDownloadOptionsScreen args;
    public final RealDocumentEntitiesMapper documentEntitiesMapper;
    public final IntentLauncher launcher;
    public final AndroidStringManager stringManager;

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.getClass();
        cal = calendar;
    }

    public AccountDocumentsDownloadOptionsPresenter(IntentLauncher intentLauncher, AndroidStringManager androidStringManager, RealDocumentEntitiesMapper realDocumentEntitiesMapper, DocumentsDownloadOptionsScreen documentsDownloadOptionsScreen) {
        documentsDownloadOptionsScreen.getClass();
        this.launcher = intentLauncher;
        this.stringManager = androidStringManager;
        this.documentEntitiesMapper = realDocumentEntitiesMapper;
        this.args = documentsDownloadOptionsScreen;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        AccountDocumentsDownloadOptionsPresenter accountDocumentsDownloadOptionsPresenter;
        MutableState mutableState;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(655289885);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            DocumentsDownloadOptionsScreen documentsDownloadOptionsScreen = this.args;
            String str = documentsDownloadOptionsScreen.key;
            StatementType statementType = documentsDownloadOptionsScreen.statementType;
            RealDocumentEntitiesMapper realDocumentEntitiesMapper = this.documentEntitiesMapper;
            CoroutineContext coroutineContext = realDocumentEntitiesMapper.ioDispatcher;
            str.getClass();
            statementType.getClass();
            int ordinal = statementType.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                InstrumentQueries instrumentQueries = realDocumentEntitiesMapper.documentQueries;
                instrumentQueries.getClass();
                DocumentQueries$selectForToken$2 documentQueries$selectForToken$2 = DocumentQueries$selectForToken$2.INSTANCE;
                rememberedValue = FlowKt.transformLatest(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new DocumentQueries$SelectForTokenQuery(instrumentQueries, str, new DocumentQueries$$ExternalSyntheticLambda5(instrumentQueries, 0), (byte) 0)), coroutineContext), new RealDocumentEntitiesMapper$documentForToken$$inlined$flatMapLatest$1(continuation, realDocumentEntitiesMapper, i2));
            } else {
                if (RealDocumentEntitiesMapper.WhenMappings.$EnumSwitchMapping$0[statementType.ordinal()] != 3) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$2("Unexpected statementType: ", statementType, " ");
                    return null;
                }
                SessionQueries sessionQueries = realDocumentEntitiesMapper.cryptoStatementQueries;
                sessionQueries.getClass();
                CryptoStatementQueries$forToken$2 cryptoStatementQueries$forToken$2 = CryptoStatementQueries$forToken$2.INSTANCE;
                rememberedValue = new RealTransferManager$addCash$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new CryptoStatementQueries$ForTokenQuery(sessionQueries, str, new FlowStarter$$ExternalSyntheticLambda0(17))), coroutineContext), realDocumentEntitiesMapper, 25);
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(new AccountDocumentsDownloadOptionsViewModel(null, null));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        ProfileDocumentModel profileDocumentModel = (ProfileDocumentModel) collectAsState.getValue();
        if (profileDocumentModel != null) {
            gapComposer.startReplaceGroup(-1106477359);
            accountDocumentsDownloadOptionsPresenter = this;
            mutableState = mutableState2;
            Updater.LaunchedEffect(gapComposer, profileDocumentModel, new zzmh(profileDocumentModel, continuation, accountDocumentsDownloadOptionsPresenter, mutableState2, 12));
            gapComposer.end(false);
        } else {
            accountDocumentsDownloadOptionsPresenter = this;
            mutableState = mutableState2;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new zzmo(flow, (Continuation) null, collectAsState, accountDocumentsDownloadOptionsPresenter, 22));
        AccountDocumentsDownloadOptionsViewModel accountDocumentsDownloadOptionsViewModel = (AccountDocumentsDownloadOptionsViewModel) mutableState.getValue();
        gapComposer.end(false);
        return accountDocumentsDownloadOptionsViewModel;
    }
}
